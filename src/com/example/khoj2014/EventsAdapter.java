package com.example.khoj2014;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventsAdapter extends BaseAdapter{

	public ArrayList<EventsItem> arr;
	public Context ctx;
	
	public EventsAdapter(Context context, ArrayList<EventsItem> ls) {
		// TODO Auto-generated constructor stub
		arr = ls;
		ctx = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arr.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arr.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = convertView;
		LayoutInflater vi;
	    vi = LayoutInflater.from(ctx);
	    v = vi.inflate(R.layout.events_item, null);

	    ImageView img = (ImageView)v.findViewById(R.id.imageView1);
	    TextView tv = (TextView)v.findViewById(R.id.text1);
	    LinearLayout overlay = (LinearLayout)v.findViewById(R.id.overlay);
	    
	    img.setImageDrawable(arr.get(position).getUrl());
	    tv.setText(arr.get(position).getBottomLine());
	    
	    if(arr.get(position).getTopLine() == "1") {
	    	overlay.setBackgroundColor(v.getContext().getResources().getColor(R.color.oblue));
	    } else if(arr.get(position).getTopLine() == "2") {
	    	overlay.setBackgroundColor(v.getContext().getResources().getColor(R.color.ogreen));
	    } else if (arr.get(position).getTopLine() == "3") {
	    	overlay.setBackgroundColor(v.getContext().getResources().getColor(R.color.ored));
	    }
	    
		return v;
	}

}
