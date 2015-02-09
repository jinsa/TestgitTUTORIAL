package org.example.andtodoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashactivity extends ActionBarActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		
	ImageView img=(ImageView)findViewById(R.id.iv_image_gruop_image);
	
	Animation fade1=AnimationUtils.loadAnimation(this, R.anim.fade_in);
	img.startAnimation(fade1);
	
	fade1.setAnimationListener(new AnimationListener() {
		@Override
		public void onAnimationEnd(Animation animation) {
		startActivity(new Intent(splashactivity.this,MainActivity.class));
		splashactivity.this.finish();
		}

		@Override
		public void onAnimationStart(Animation animation) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onAnimationRepeat(Animation animation) {
			// TODO Auto-generated method stub
			
		}

		
		});
	}
}
