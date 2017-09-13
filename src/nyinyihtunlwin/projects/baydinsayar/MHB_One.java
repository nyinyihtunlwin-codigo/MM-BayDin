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

public class MHB_One extends FragmentActivity implements OnDateSetListener {
	private Button btnBack, btnSelect, btnCalculate;
	private TextView beforeTv, dayName, showtvOne, showtvTwo,mmtkr;
	private int year, minusOne, dName,mmY;
	private ScrollView sV;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mhb_one);
		btnBack = (Button) findViewById(R.id.btnBack);
		btnSelect = (Button) findViewById(R.id.btnSelect);
		beforeTv = (TextView) findViewById(R.id.beforetv);
		dayName = (TextView) findViewById(R.id.dayName);
		btnCalculate = (Button) findViewById(R.id.btnCalculateMHB);
		showtvOne = (TextView) findViewById(R.id.showTvMHBOne);
		showtvTwo = (TextView) findViewById(R.id.showTvMHBTwo);
		mmtkr=(TextView)findViewById(R.id.mmtkr);
		sV = (ScrollView) findViewById(R.id.scrollIdMHB);

		showtvOne.setVisibility(View.INVISIBLE);
		showtvTwo.setVisibility(View.INVISIBLE);
		btnCalculate.setVisibility(View.INVISIBLE);
		sV.setVisibility(View.INVISIBLE);

		btnCalculate.setEnabled(false);
		btnCalculate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showtvOne.setVisibility(View.VISIBLE);
				showtvTwo.setVisibility(View.VISIBLE);
				sV.setVisibility(View.VISIBLE);
				funCalculate(minusOne);
			}

			private void funCalculate(int minusOne) {
				int y = year;
				y = y - minusOne;
				mmY=y;
				mmtkr.setText("ျမန္မာသကၠရာဇ္ "+mmY+" ခုႏွစ္");
				if (y < 1300) {
					y = y - 1200;
					y = (y + 3) % 7;
					String mm;
					switch (y) {
					case 0:
						mm = "၀";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						}
						break;
					case 1:
						mm = "၁";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						}
						break;
					case 2:
						mm = "၂";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						}
						break;
					case 3:
						mm = "၃";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						}
						break;
					case 4:
						mm = "၄";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						}
						break;
					case 5:
						mm = "၅";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						}
						break;
					case 6:
						mm = "၆";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						}
						break;
					}
				} else {
					y = y - 1300;
					y = (y + 5) % 7;
					String mm;
					switch (y) {
					case 0:
						mm = "၀";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						}
						break;
					case 1:
						mm = "၁";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						}
						break;
					case 2:
						mm = "၂";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						}
						break;
					case 3:
						mm = "၃";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						}
						break;
					case 4:
						mm = "၄";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 7:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						}
						break;
					case 5:
						mm = "၅";
						switch (dName) {
						case 1:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 2:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 3:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 4:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 5:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 6:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						}
						break;
					case 6:
						mm = "၆";
						switch (dName) {
						case 1:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.tite_p));
							showtvTwo.setText(getResources().getString(
									R.string.tite_text));
							break;
						case 2:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.mrn_p));
							showtvTwo.setText(getResources().getString(
									R.string.mrn_text));
							break;
						case 3:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.adpt_p));
							showtvTwo.setText(getResources().getString(
									R.string.adpt_text));
							break;
						case 4:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.yz_p));
							showtvTwo.setText(getResources().getString(
									R.string.yz_text));
							break;
						case 5:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.atun_p));
							showtvTwo.setText(getResources().getString(
									R.string.atun_text));
							break;
						case 6:
							showtvOne.setText("အျကြင္း " + mm + " "
									+ getResources().getString(R.string.bg_p));
							showtvTwo.setText(getResources().getString(
									R.string.bg_text));
							break;
						case 7:
							showtvOne
									.setText("အျကြင္း "
											+ mm
											+ " "
											+ getResources().getString(
													R.string.puti_p));
							showtvTwo.setText(getResources().getString(
									R.string.puti_text));
							break;
						}
						break;
					}
				}
				y = year;

			}
		});
		btnSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DialogFragment picker = new DatePickerFragment();
				picker.show(getSupportFragmentManager(), "datePicker");
				btnCalculate.setEnabled(true);
			}
		});
		btnBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent inte = new Intent(MHB_One.this, Main.class);
				inte.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(inte);
			}
		});
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
