package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class Main extends ActionBarActivity implements OnClickListener {
	private Button btnOne, btnTwo, btnThree, btnFour;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		btnOne = (Button) findViewById(R.id.btnOne);
		btnTwo = (Button) findViewById(R.id.btnTwo);
		btnThree = (Button) findViewById(R.id.btnThree);
		btnFour = (Button) findViewById(R.id.btnFour);

		btnOne.setOnClickListener(this);
		btnTwo.setOnClickListener(this);
		btnThree.setOnClickListener(this);
		btnFour.setOnClickListener(this);
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		FragmentManager fmg = getSupportFragmentManager();
		Exit_Dialog ed;
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			ed = new Exit_Dialog();
			ed.show(fmg, "hi");
			return true;
		}
		return false;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnOne:
			Intent ione = new Intent(Main.this, MHB_One.class);
			startActivity(ione);
			break;
		case R.id.btnTwo:
			Intent itwo = new Intent(Main.this, MHBKS_One.class);
			startActivity(itwo);
			break;
		case R.id.btnThree:
			Intent ithree = new Intent(Main.this, ThatYauk_BD.class);
			startActivity(ithree);
			break;
		case R.id.btnFour:
			Intent ifour = new Intent(Main.this, Hand_BD.class);
			startActivity(ifour);
			break;
		}
	}
}
