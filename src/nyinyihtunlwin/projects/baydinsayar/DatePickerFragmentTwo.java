package nyinyihtunlwin.projects.baydinsayar;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class DatePickerFragmentTwo extends DialogFragment {
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		ThatYauk_BD context = (ThatYauk_BD) getActivity();
		return new DatePickerDialog(context, context, year, month, day);
	}
}
