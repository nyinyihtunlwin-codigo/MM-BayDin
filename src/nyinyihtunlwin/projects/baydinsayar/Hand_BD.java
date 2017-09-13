package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Hand_BD extends ActionBarActivity {
	private ListView lv;
	private String ary[];
	private String num[];
	private MyAdapter adapter;
	private Button btnBack;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.hand_bd_main);
		lv = (ListView) findViewById(R.id.lvId);
		ary = getResources().getStringArray(R.array.questions);
		num = getResources().getStringArray(R.array.numbers);
		adapter = new MyAdapter(getApplicationContext(), ary, num);
		lv.setAdapter(adapter);

		btnBack = (Button) findViewById(R.id.btnBackFour);
		btnBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent in = new Intent(Hand_BD.this, Main.class);
				startActivity(in);
			}
		});
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent zero = new Intent(Hand_BD.this, Lucky_Board.class);
				zero.putExtra("a", num[position]);
				zero.putExtra("btno", String.valueOf(position + 1));
				startActivity(zero);
			}
		});
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent in = new Intent(this, Main.class);
			in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(in);
			return true;
		}
		return false;
	}
}
