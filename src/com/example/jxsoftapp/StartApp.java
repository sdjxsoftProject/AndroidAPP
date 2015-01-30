/**
 * 
 */
package com.example.jxsoftapp;

import com.sdjxsoft.Utils.AlphaActivtity;
import com.sdjxsoft.Utils.InterfaceCls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author hyper
 *
 */
public class StartApp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		View view=findViewById(R.layout.startapp);
		setContentView(view);
		InterfaceCls interfaceCls=new InterfaceCls() {
			
			@Override
			public void execStartAlphaAnimation() {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void execRepeatAlphaAnimation() {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void execEndAlphaAnimation() {
				// TODO 自动生成的方法存根
				skipPage();
			}
		};
		skipPage();
		//AlphaActivtity.alphaDraw(1.0f, 0.3f, 5000, view, interfaceCls);
		
	}
	
	public void skipPage()
	{
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
