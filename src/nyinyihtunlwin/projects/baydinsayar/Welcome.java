package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends ActionBarActivity {
	private TextView welcomeTv;
	private String AnsName, Qno, BtnNo;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome);
		welcomeTv = (TextView) findViewById(R.id.welcomeTv);

		Typeface tf = Typeface.createFromAsset(getAssets(), "zawgyione.ttf");
		welcomeTv.setTypeface(tf);
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				} finally {
					Intent i = new Intent(Welcome.this, Main.class);
					startActivity(i);
				}
			}
		});
		t.start();
	}

	public void showToast(String message) {
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)
				.show();
	}
}
