/**
 * Autogenerated by renren-api2-generator 2013-07-05 11:01:58
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.renren.api.service;
import java.util.*;
/**
 *
 * 图标
 */
public class Icon {
	
	/**
	 * 图片的大小。
	 */
	private IconSize size;
	/**
	 * 图片的URL
	 */
	private String url;
	public void setSize(IconSize size) {
		this.size = size;
	}
	public IconSize getSize() {
		return this.size;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return this.url;
	}
}