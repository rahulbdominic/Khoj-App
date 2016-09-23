package com.example.khoj2014;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class MapFragment extends Fragment {
	
	public GridView lv;
	public TextView title;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			  Bundle savedInstanceState) {
		final View rootView = inflater.inflate(R.layout.map_fragment, container, false);
		
		title = (TextView)rootView.findViewById(R.id.title_text);
		Typeface typeface = Typeface.createFromAsset(rootView.getContext().getAssets(), "fontawesome-webfont.ttf");
		title.setTypeface(typeface);
		
		return rootView;
	}	
}
