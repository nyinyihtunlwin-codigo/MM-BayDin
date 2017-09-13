package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Exit_Dialog extends DialogFragment {
	View v;
	private Button btnOk, btnCancel;

	public Exit_Dialog() {

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		setCancelable(false);
		v = inflater.inflate(R.layout.exit_dialog, null);
		getDialog().setTitle("         ပိတ္ေတာ့မွာလား?");
		btnOk = (Button) v.findViewById(R.id.btnExit);
		btnCancel = (Button) v.findViewById(R.id.btnStay);
		return v;
	}

	public void onActivityCreated(Bundle arg0) {
		super.onActivityCreated(arg0);
		btnOk.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
				android.os.Process.killProcess(android.os.Process.myPid());
				System.exit(0);
			}
		});
		btnCancel.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				dismiss();
			}
		});
	}
}
