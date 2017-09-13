package nyinyihtunlwin.projects.baydinsayar;

import java.util.GregorianCalendar;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;

public class MHBKS_One extends FragmentActivity implements OnDateSetListener {
	private Button btnBack, btnSelect, btnCalculate;
	private TextView beforeTv, dayName, showtvOne, showtvTwo,mmtkr_ks;
	int minusOne, year, dName,mmY;
	private ScrollView sV;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mhbks_one);
		btnBack = (Button) findViewById(R.id.btnBackOne);
		btnSelect = (Button) findViewById(R.id.btnSelectOne);
		beforeTv = (TextView) findViewById(R.id.beforetvOne);
		dayName = (TextView) findViewById(R.id.dayNameOne);
		btnCalculate = (Button) findViewById(R.id.btnCalculateKS);
		showtvOne = (TextView) findViewById(R.id.showTvOneKS);
		showtvTwo = (TextView) findViewById(R.id.showTvTwoKS);
		mmtkr_ks=(TextView)findViewById(R.id.mmtkr_ks);
		sV = (ScrollView) findViewById(R.id.scrollIdKS);

		showtvOne.setVisibility(View.INVISIBLE);
		showtvTwo.setVisibility(View.INVISIBLE);
		btnCalculate.setVisibility(View.INVISIBLE);
		sV.setVisibility(View.INVISIBLE);

		btnCalculate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				funCalculate(minusOne);
				showtvOne.setVisibility(View.VISIBLE);
				showtvTwo.setVisibility(View.VISIBLE);
				sV.setVisibility(View.VISIBLE);
			}
		});
		btnSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DialogFragment picker = new DatePickerFragmentOne();
				picker.show(getSupportFragmentManager(), "datePicker");
			}
		});
		btnBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent inte = new Intent(MHBKS_One.this, Main.class);
				inte.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(inte);
			}
		});
	}

	private void funCalculate(int minusOne) {
		int y = year;
		y = y - minusOne;
		mmY=y;
		mmtkr_ks.setText("ျမန္မာသကၠရာဇ္ "+mmY+" ခုႏွစ္");
		y = (y - 1) % 12;
		String mm;
		switch (y) {
		case 0:
			mm = "၀";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.zero_state));
			break;
		case 1:
			mm = "၁";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.one_state));
			break;
		case 2:
			mm = "၂";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.two_state));
			break;
		case 3:
			mm = "၃";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.three_state));
			break;
		case 4:
			mm = "၄";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.four_state));
			break;
		case 5:
			mm = "၅";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.five_state));
			break;
		case 6:
			mm = "၆";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.six_state));
			break;
		case 7:
			mm = "၇";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.seven_state));
			break;
		case 8:
			mm = "၈";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.eight_state));
			break;
		case 9:
			mm = "၉";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.nine_state));
			break;
		case 10:
			mm = "၁၀";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.ten_state));
			break;
		case 11:
			mm = "၁၁";
			showtvOne.setText("အျကြင္း " + mm);
			showtvTwo.setText(getResources().getString(R.string.eleven_state));
			break;
		}
		y = year;
	}

	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		btnCalculate.setVisibility(View.VISIBLE);
		GregorianCalendar grego = new GregorianCalendar(year, monthOfYear,
				dayOfMonth);
		int dayOfWeek = grego.get(grego.DAY_OF_WEEK);

		// ///////////// copy
		this.year = year;
		this.dName = dayOfWeek;

		String message = String.format("%d ရက္၊ %d လ၊ %d ခုႏွစ္", dayOfMonth,
				monthOfYear + 1, year);
		String msg = null;
		switch (dayOfWeek) {
		case 1:
			msg = " တနဂၤေႏြ ";
			break;
		case 2:
			msg = " တနလၤာ ";
			break;
		case 3:
			msg = " အဂၤါ ";
			break;
		case 4:
			msg = " ဗုဒၶဟူး ";
			break;
		case 5:
			msg = " ျကာသပေတး ";
			break;
		case 6:
			msg = " ေသာျကာ ";
			break;
		case 7:
			msg = " စေန ";
			break;
		}
		dayName.setText(msg);
		if (monthOfYear + 1 >= 1 && monthOfYear <= 4) {
			if (monthOfYear == 4 && dayOfMonth <= 16) {
				beforeTv.setText("ျမန္မာႏွစ္သစ္ကူးမတိုင္မီ ေမြးဖြားသည္။");
				minusOne = 639;
			} else if (monthOfYear != 4 && dayOfMonth > 16) {
				beforeTv.setText("ျမန္မာႏွစ္သစ္ကူးျပီးမွ ေမြးဖြားသည္။");
				minusOne = 638;
			} else {
				beforeTv.setText("ျမန္မာႏွစ္သစ္ကူးမတိုင္မီ ေမြးဖြားသည္။");
				minusOne = 639;
			}
		} else {
			beforeTv.setText("ျမန္မာႏွစ္သစ္ကူးျပီးမွ ေမြးဖြားသည္။");
			minusOne = 638;
		}
		btnSelect.setText(message);
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
