package nyinyihtunlwin.projects.baydinsayar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private Context context;
	private String ary[];
	private String num[];

	public MyAdapter(Context context, String ary[],String num[]) {
		this.context = context;
		this.ary = ary;
		this.num=num;
	}

	public int getCount() {
		return ary.length;
	}

	public Object getItem(int position) {
		return ary[position];
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.custom_list_item, null);
		}
		TextView tv = (TextView) convertView.findViewById(R.id.tvlistName);
		TextView tvnum=(TextView)convertView.findViewById(R.id.tvlistNum);
		tvnum.setText(num[position]);
		tv.setText(ary[position]);
		return convertView;
	}
}
