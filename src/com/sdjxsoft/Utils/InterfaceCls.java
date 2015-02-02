/**
 * 
 */
package com.sdjxsoft.Utils;

/**
 * @author hyper
 *
 */
public interface InterfaceCls {

	 /***
	  * 渐变开始执行的操作
	  * */
	 public void execStartAlphaAnimation();
	 
	 /***
	  * 渐变过程中执行的操作
	  * */
	 public void execRepeatAlphaAnimation();
	 
	 /***
	  * 渐变完成后执行的操作
	  * */
	 public void execEndAlphaAnimation();
}
