package nyinyihtunlwin.projects.baydinsayar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class AssetDatabaseOpenHelper {

	private static final String DB_NAME = "BayDin_DB.db";
	private static final String TABLE_NAME = "BayDin_Data";

	private Context context;

	public AssetDatabaseOpenHelper(Context context) {
		this.context = context;
	}

	public SQLiteDatabase openDatabase() {
		File dbFile = context.getDatabasePath(DB_NAME);
		if (!dbFile.exists()) {
			try {
				SQLiteDatabase checkDB = context.openOrCreateDatabase(DB_NAME,
						context.MODE_PRIVATE, null);
				if (checkDB != null) {
					checkDB.close();
				}
				copyDatabase(dbFile);
			} catch (IOException e) {
				throw new RuntimeException("Error creating source database", e);
			}
		}

		return SQLiteDatabase.openDatabase(dbFile.getPath(), null,
				SQLiteDatabase.OPEN_READONLY);
	}

	public String dataQuery(SQLiteDatabase db, String qName, String btnName) {
		Cursor c = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE qName="
				+ qName + " AND btnName=" + btnName + ";", null);
		Log.d("MyApp", "cnt: " + c.getCount());
		String b = null;
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			int answerIndex = c.getColumnIndex("Name");
			b = c.getString(answerIndex);
		}
		return b;
	}

	private void copyDatabase(File dbFile) throws IOException {
		InputStream is = context.getAssets().open(DB_NAME);
		OutputStream os = new FileOutputStream(dbFile);

		byte[] buffer = new byte[1024];
		while (is.read(buffer) > 0) {
			os.write(buffer);
		}

		os.flush();
		os.close();
		is.close();
	}
}