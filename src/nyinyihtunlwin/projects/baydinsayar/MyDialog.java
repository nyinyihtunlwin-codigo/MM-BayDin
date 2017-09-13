package nyinyihtunlwin.projects.baydinsayar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyDialog extends DialogFragment {
	View v;
	private Button btnOk;
	private TextView tvMessage;
	private String message;

	public MyDialog(String message) {
		this.message = message;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.custom_dialog, null);
		getDialog().setTitle("အေျဖ .... ");
		btnOk = (Button) v.findViewById(R.id.btnOk);
		tvMessage = (TextView) v.findViewById(R.id.tvMessage);
		tvMessage.setText(message);
		return v;
	}

	public void onActivityCreated(Bundle arg0) {
		super.onActivityCreated(arg0);
		btnOk.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i=new Intent(getActivity(),Hand_BD.class);
				startActivity(i);
			}
		});
	}
}
