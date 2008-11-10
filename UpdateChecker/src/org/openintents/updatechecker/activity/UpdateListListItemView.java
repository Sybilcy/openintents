package org.openintents.updatechecker.activity;

import org.openintents.updatechecker.R;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UpdateListListItemView extends LinearLayout {

	Context mContext;
	
	private TextView mName;
	private TextView mInfo;
	private ImageView mImage;
	private ImageView mIgnore;
	
	public UpdateListListItemView(Context context) {
		super(context);
		mContext = context;

		// inflate rating
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		inflater.inflate(
				R.layout.app_list_item, this, true);
		
		mName = (TextView) findViewById(R.id.name);
		mInfo = (TextView) findViewById(R.id.info);
		mImage = (ImageView) findViewById(R.id.icon);
		mIgnore = (ImageView) findViewById(R.id.ignore);
	}

	/**
	 * Convenience method to set the title of a NewsView
	 */
	public void setName(String name) {
		mName.setText(name);
	}
	
	public void setInfo(String info) {
		mInfo.setText(info);
	}
	
	public void setImage(Drawable image) {
		mImage.setImageDrawable(image);
	}
	
	public void setNoNotifications(int no_notifications) {
		if (no_notifications == 1) {
			mIgnore.setVisibility(View.VISIBLE);
		} else {
			mIgnore.setVisibility(View.GONE);
		}
	}
}
