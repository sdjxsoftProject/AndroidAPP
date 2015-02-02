/**
 * 
 */
package com.sdjxsoft.Utils;

import java.lang.reflect.Method;

import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/**
 * @author hyper
 *
 */
public class AlphaActivtity {
	public static String startName;
	public static String repeatName;
	public static String endName;
	
	public static final void alphaDraw(float x,float y,long speed,View views,final String startClassAndFunName,final String repeatClassAndFunName,final String endClassAndFunName)
	{
		startName=startClassAndFunName;
		repeatName=repeatClassAndFunName;
		endName=endClassAndFunName;
			AlphaAnimation alpa=new AlphaAnimation(x,y);
			alpa.setDuration(speed);
			views.startAnimation(alpa);
			alpa.setAnimationListener(new AnimationListener() {
				@Override
				public void onAnimationStart(Animation animation) {
					// TODO 自动生成的方法存根
				}
				
				@Override
				public void onAnimationRepeat(Animation animation) {
					// TODO 自动生成的方法存根
				}
				
				@Override
				public void onAnimationEnd(Animation animation) {
					Class<?> endClass=null;
					Method methodend=null;
					String straaa=endClassAndFunName;
					String a1=endClassAndFunName.split("\\|")[0];
					String a2=endClassAndFunName.split("\\|")[1];
					Log.i(a1, "1");
					Log.i(endClassAndFunName, "a1");
					Log.i(endName, "ddd");
					try {
						endClass=Class.forName(a1);
						methodend=endClass.getMethod(a2);
						methodend.invoke(endClass.newInstance());
					   } 
					catch (Exception e) {
						// TODO 自动生成的 catch 块
						((Throwable) e).printStackTrace();
					}
				}
			});
			
	}
	
	
	public static final void alphaDraw(float x,float y,long speed,View views,final InterfaceCls incls)
	{
			AlphaAnimation alpa=new AlphaAnimation(x,y);
			alpa.setDuration(speed);
			views.startAnimation(alpa);
			alpa.setAnimationListener(new AnimationListener() {
				@Override
				public void onAnimationStart(Animation animation) {
					// TODO 自动生成的方法存根
					incls.execStartAlphaAnimation();
				}
				
				@Override
				public void onAnimationRepeat(Animation animation) {
					// TODO 自动生成的方法存根
					incls.execRepeatAlphaAnimation();
				}
				
				@Override
				public void onAnimationEnd(Animation animation) {
					incls.execEndAlphaAnimation();
				}
			});
			
	}
	
}
