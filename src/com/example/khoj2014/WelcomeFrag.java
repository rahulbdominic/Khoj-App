package com.example.khoj2014;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class WelcomeFrag extends Fragment{

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			  Bundle savedInstanceState) {
		
		final View rootView = inflater.inflate(R.layout.welxome_frag, container, false);
		
		android.app.ActionBar action = getActivity().getActionBar();
		
		action.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF9900")));
		
		Button btn = (Button)rootView.findViewById(R.id.button1);
		Typeface typeface = Typeface.createFromAsset(rootView.getContext().getAssets(), "fontawesome-webfont.ttf");
		btn.setTypeface(typeface);
				 
		btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				changeFrag(0, rootView);
			}
			
		});
		
		return rootView;
	}	
	
	private void changeFrag(int arg2, View rootView) {
		// TODO Auto-generated method stub
		Fragment frag = new EventsFragment();
		
		switch(arg2) {
			case 0:
				frag = new EventsFragment();
				break;
			case 1:
				//frag = new Homework_Fragment();
				break;
			case 2:
				//frag = new Assignment_Fragment();
				break;
			case 3:
				//frag = new Tests_Fragment();
				break;
			case 4:
				//frag = new TimeTableFragment();
				break;
			case 5:
				//frag = new Notification_Fragment();
				break;
			case 7:
				frag = new WelcomeFrag();
				break;
			default:
				frag = null;
				break;
		}
		
		android.app.ActionBar action = getActivity().getActionBar();
		action.setBackgroundDrawable(rootView.getResources().getDrawable(R.drawable.action_back));
		
		android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
		
	    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
	    fragmentTransaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out);
	    fragmentTransaction.replace(R.id.container, frag).commit();
	    
	}
}
