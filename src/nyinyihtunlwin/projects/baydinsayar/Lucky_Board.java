package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Lucky_Board extends ActionBarActivity implements OnClickListener {
	private Button btnBack;
	private ImageButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
			btnSeven, btnEight, btnNine, btnTen, btnEleven, btnTwelve,
			btnThirteen, btnFourteen, btnFifteen, btnSixteen;
	private TextView tvQNo;
	private String n;
	private String btnCount = null;
	private AssetDatabaseOpenHelper adapter;
	private SQLiteDatabase db;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lucky_board);
		btnBack = (Button) findViewById(R.id.btnBacklucky);
		tvQNo = (TextView) findViewById(R.id.tvQuestNo);

		adapter = new AssetDatabaseOpenHelper(this);

		btnOne = (ImageButton) findViewById(R.id.btnOne);
		btnTwo = (ImageButton) findViewById(R.id.btnTwo);
		btnThree = (ImageButton) findViewById(R.id.btnThree);
		btnFour = (ImageButton) findViewById(R.id.btnFour);
		btnFive = (ImageButton) findViewById(R.id.btnFive);
		btnSix = (ImageButton) findViewById(R.id.btnSix);
		btnSeven = (ImageButton) findViewById(R.id.btnSeven);
		btnEight = (ImageButton) findViewById(R.id.btnEight);
		btnNine = (ImageButton) findViewById(R.id.btnNine);
		btnTen = (ImageButton) findViewById(R.id.btnTen);
		btnEleven = (ImageButton) findViewById(R.id.btnEleven);
		btnTwelve = (ImageButton) findViewById(R.id.btnTwelve);
		btnThirteen = (ImageButton) findViewById(R.id.btnThirteen);
		btnFourteen = (ImageButton) findViewById(R.id.btnFourteen);
		btnFifteen = (ImageButton) findViewById(R.id.btnFifteen);
		btnSixteen = (ImageButton) findViewById(R.id.btnSixteen);

		btnBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Lucky_Board.this, Hand_BD.class);
				startActivity(i);
			}
		});
		String k = getIntent().getStringExtra("a");
		tvQNo.setText(k);
		n = getIntent().getStringExtra("btno");

		btnOne.setOnClickListener(this);
		btnTwo.setOnClickListener(this);
		btnThree.setOnClickListener(this);
		btnFour.setOnClickListener(this);
		btnFive.setOnClickListener(this);
		btnSix.setOnClickListener(this);
		btnSeven.setOnClickListener(this);
		btnEight.setOnClickListener(this);
		btnNine.setOnClickListener(this);
		btnTen.setOnClickListener(this);
		btnEleven.setOnClickListener(this);
		btnTwelve.setOnClickListener(this);
		btnThirteen.setOnClickListener(this);
		btnFourteen.setOnClickListener(this);
		btnFifteen.setOnClickListener(this);
		btnSixteen.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnOne:
			btnCount = "1";
			showResult(n, btnCount);
			break;
		case R.id.btnTwo:
			btnCount = "2";
			showResult(n, btnCount);
			break;
		case R.id.btnThree:
			btnCount = "3";
			showResult(n, btnCount);
			break;
		case R.id.btnFour:
			btnCount = "4";
			showResult(n, btnCount);
			break;
		case R.id.btnFive:
			btnCount = "5";
			showResult(n, btnCount);
			break;
		case R.id.btnSix:
			btnCount = "6";
			showResult(n, btnCount);
			break;
		case R.id.btnSeven:
			btnCount = "7";
			showResult(n, btnCount);
			break;
		case R.id.btnEight:
			btnCount = "8";
			showResult(n, btnCount);
			break;
		case R.id.btnNine:
			btnCount = "9";
			showResult(n, btnCount);
			break;
		case R.id.btnTen:
			btnCount = "10";
			showResult(n, btnCount);
			break;
		case R.id.btnEleven:
			btnCount = "11";
			showResult(n, btnCount);
			break;
		case R.id.btnTwelve:
			btnCount = "12";
			showResult(n, btnCount);
			break;
		case R.id.btnThirteen:
			btnCount = "13";
			showResult(n, btnCount);
			break;
		case R.id.btnFourteen:
			btnCount = "14";
			showResult(n, btnCount);
			break;
		case R.id.btnFifteen:
			btnCount = "15";
			showResult(n, btnCount);
			break;
		case R.id.btnSixteen:
			btnCount = "16";
			showResult(n, btnCount);
			break;
		}
	}

	private void showResult(String qno, String btnNo) {
		db = adapter.openDatabase();
		String result = adapter.dataQuery(db, qno, btnNo);
		db.close();
		FragmentManager fmg = getSupportFragmentManager();
		MyDialog md = new MyDialog(result);
		md.show(fmg, "Hello");
	}
}
