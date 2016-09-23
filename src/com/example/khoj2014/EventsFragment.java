package com.example.khoj2014;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

@SuppressLint("NewApi") 
public class EventsFragment extends Fragment {
	
	public GridView lv;
	public TextView title;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			  Bundle savedInstanceState) {
				final View rootView = inflater.inflate(R.layout.events_fragment, container, false);
			    
				 lv = (GridView)rootView.findViewById(R.id.event_lv);
				 title = (TextView)rootView.findViewById(R.id.title_text);
				 
				 Typeface typeface = Typeface.createFromAsset(rootView.getContext().getAssets(), "fontawesome-webfont.ttf");
				 title.setTypeface(typeface);
				 
				 ArrayList<EventsItem> ls = new ArrayList<EventsItem>();
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "1", "{Chemstry}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "2", "{Biology}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "3", "{Computer Sc}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "1", "{Chemstry}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "2", "{Biology}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "1", "{Chemstry}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "3", "{Computer Sc}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "1", "{Chemstry}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "2", "{Biology}"));
			  	 ls.add(new EventsItem(rootView.getResources().getDrawable(R.drawable.io), "3", "{Computer Sc}"));
			  	 
			  	 EventsAdapter adapt = new EventsAdapter(rootView.getContext(), ls);
			  	 lv.setAdapter(adapt);
				 lv.setOverScrollMode(View.OVER_SCROLL_NEVER);
//				 
//				 ActionBar bar = getSherlockActivity().getActionBar();
//				 bar.setBackgroundDrawable(new ColorDrawable("COLOR"));
				 
				 return rootView;
	}	
}
