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
		View view=View.inflate(this, R.layout.startapp, null);
		setContentView(view);
		try {
			Thread.sleep(1000);
			long sde=5000;
			AlphaActivtity.alphaDraw(0.0f, 1.0f, sde,view, interfacls);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}

	
	InterfaceCls interfacls=new InterfaceCls() {
		
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
	
	public void skipPage()
	{
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
