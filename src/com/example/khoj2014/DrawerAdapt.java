package com.example.khoj2014;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DrawerAdapt extends BaseAdapter{
	
	ArrayList<DrawerClass> arr;
	Context context;

	public DrawerAdapt(Context context2, ArrayList<DrawerClass> arr2) {
		// TODO Auto-generated constructor stub
		context = context2;
		arr = arr2;
	}

	public void DrawerAdapter(Context context2, ArrayList<DrawerClass> arr2) {
		// TODO Auto-generated constructor stub
		context = context2;
		arr = arr2;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arr.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arr.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View row, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = row;
		LayoutInflater vi;
	    vi = LayoutInflater.from(context);
	    v = vi.inflate(R.layout.drawer_list_item, null);

	    TextView fontawesome = (TextView) v.findViewById(R.id.font_awesome);
	    TextView title = (TextView) v.findViewById(R.id.text1);

	    fontawesome.setText(arr.get(pos).getFontAwesome());
	    title.setText(arr.get(pos).getTitle());
    	
	    Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
    	fontawesome.setTypeface(typeface);
    	
	    return v;
	}

}
