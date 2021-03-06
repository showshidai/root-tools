package com.zoe.calendar.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rarnu.devlib.base.adapter.BaseAdapter;
import com.zoe.calendar.R;
import com.zoe.calendar.classes.ShareItem;

public class ShareAdapter extends BaseAdapter<ShareItem> {

	public ShareAdapter(Context context, List<ShareItem> list) {
		super(context, list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			v = inflater.inflate(R.layout.item_share, parent, false);
		}
		ShareHolder holder = (ShareHolder) v.getTag();
		if (holder == null) {
			holder = new ShareHolder();
			holder.ivShareIcon = (ImageView) v.findViewById(R.id.ivShareIcon);
			holder.tvShareTitle = (TextView) v.findViewById(R.id.tvShareTitle);
			v.setTag(holder);
		}
		ShareItem item = list.get(position);
		if (item != null) {
			holder.ivShareIcon.setImageResource(item.icon);
			holder.tvShareTitle.setText(item.title);
		}
		return v;
	}

	@Override
	public String getValueText(ShareItem item) {
		return "";
	}

}
