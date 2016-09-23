package com.example.khoj2014;

import java.util.ArrayList;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class TrailerFragment extends Fragment {
	
	public GridView lv;
	public TextView title;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			  Bundle savedInstanceState) {
		final View rootView = inflater.inflate(R.layout.trailers_fragment, container, false);
			    
		lv = (GridView)rootView.findViewById(R.id.event_lv);
		title = (TextView)rootView.findViewById(R.id.title_text);
				 
		Typeface typeface = Typeface.createFromAsset(rootView.getContext().getAssets(), "fontawesome-webfont.ttf");
		title.setTypeface(typeface);
				 
		ArrayList<EventsItem> ls = new ArrayList<EventsItem>();
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "1", "{Chemstry}"));
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "2", "{Biology}"));
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "3", "{Computer Sc}"));
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "1", "{Chemstry}"));
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "2", "{Biology}"));
		ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io2), "1", "{Chemstry}"));
		
		EventsAdapter adapt = new EventsAdapter(rootView.getContext(), ls);
		lv.setAdapter(adapt);
		lv.setOverScrollMode(View.OVER_SCROLL_NEVER);
				 
		return rootView;
	}	
}
