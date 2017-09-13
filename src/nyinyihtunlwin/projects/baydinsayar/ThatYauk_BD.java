package nyinyihtunlwin.projects.baydinsayar;

import java.util.GregorianCalendar;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;

public class ThatYauk_BD extends ActionBarActivity implements OnDateSetListener {
	private Button btnBack, btnSelect, btnCalculate;
	private TextView beforeTv, dayName, showtvOne, showtvTwo, mmtk_ty;
	int minusOne, year, month, day, dName, yearC, monthC, dayC, age, mmY;
	private ScrollView sV;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.that_yauk__bd);

		btnBack = (Button) findViewById(R.id.btnBackTY);
		btnSelect = (Button) findViewById(R.id.btnSelectTY);
		beforeTv = (TextView) findViewById(R.id.beforetvTY);
		dayName = (TextView) findViewById(R.id.dayNameTY);
		btnCalculate = (Button) findViewById(R.id.btnCalculateTY);
		showtvOne = (TextView) findViewById(R.id.showTvOneTY);
		showtvTwo = (TextView) findViewById(R.id.showTvTwoTY);
		mmtk_ty = (TextView) findViewById(R.id.mmtkr_ty);
		sV = (ScrollView) findViewById(R.id.scrollIdTY);

		showtvOne.setVisibility(View.INVISIBLE);
		showtvTwo.setVisibility(View.INVISIBLE);
		btnCalculate.setVisibility(View.INVISIBLE);
		sV.setVisibility(View.INVISIBLE);

		btnCalculate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showtvOne.setVisibility(View.VISIBLE);
				showtvTwo.setVisibility(View.VISIBLE);
				sV.setVisibility(View.VISIBLE);
				funCalculate();
			}
		});

		btnSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DialogFragment picker = new DatePickerFragmentTwo();
				picker.show(getSupportFragmentManager(), "datePicker");
			}
		});
		btnBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent inte = new Intent(ThatYauk_BD.this, Main.class);
				inte.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(inte);
			}
		});
	}

	private void funCalculate() {
		int count = 0;
		String mm;
		count = age % 8;
		switch (count) {
		case 0:
			mm = "ရာဟု";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_zero));
			break;
		case 1:
			mm = "တနဂၤေႏြ";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_one));
			break;
		case 2:
			mm = "တနလၤာ";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_two));
			break;
		case 3:
			mm = "အဂၤါ";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_three));
			break;
		case 4:
			mm = "ဗုဒၶဟူး";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_four));
			break;
		case 5:
			mm = "ျကာသပေတး";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_five));
			break;
		case 6:
			mm = "ေသာျကာ";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_six));
			break;
		case 7:
			mm = "စေန";
			showtvOne.setText("သက္ေရာက္ျဂိဳဟ္ : " + mm + "ျဂိဳဟ္");
			showtvTwo.setText(getResources().getString(R.string.ty_seven));
			break;
		}
	}

	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		btnCalculate.setVisibility(View.VISIBLE);
		GregorianCalendar grego = new GregorianCalendar(year, monthOfYear,
				dayOfMonth);
		int dayOfWeek = grego.get(grego.DAY_OF_WEEK);

		// ///////////// copy
		this.year = year;
		this.month = monthOfYear;
		this.day = dayOfMonth;
		this.dName = dayOfWeek;
		// //////////////////////
		// current date and time
		GregorianCalendar greCurr = new GregorianCalendar();
		yearC = greCurr.get(greCurr.YEAR);
		monthC = greCurr.get(greCurr.MONTH);
		dayC = greCurr.get(greCurr.DAY_OF_MONTH);
		mmtk_ty.setText("ယခု " + yearC + " ခုႏွစ္အတြက္ ေဟာကိန္း");

		String message = String.format("%d ရက္၊ %d လ၊ %d ခုႏွစ္", dayOfMonth,
				monthOfYear + 1, year);
		if (yearC >= year) {
			age = yearC - year;
			if (monthC == month) {
				if (dayC >= day) {
					dayName.setText(age + " ႏွစ္");
				} else {
					age--;
					dayName.setText(age + " ႏွစ္");
				}
			} else if (monthC > month) {
				dayName.setText(age + " ႏွစ္");
			} else {
				age--;
				dayName.setText(age + " ႏွစ္");
			}
		} else {
			dayName.setText("သင္မေမြးေသးပါ");
		}
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
