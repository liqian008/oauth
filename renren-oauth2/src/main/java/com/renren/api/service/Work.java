/**
 * Autogenerated by renren-api2-generator 2013-07-05 11:01:59
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.renren.api.service;
import java.util.*;
/**
 *
 * 工作
 */
public class Work {
	
	/**
	 * 公司名称
	 */
	private String name;
	/**
	 * 入职日期
	 */
	private String time;
	/**
	 * 行业
	 */
	private Industry industry;
	/**
	 * 职位
	 */
	private Job job;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return this.time;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	public Industry getIndustry() {
		return this.industry;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Job getJob() {
		return this.job;
	}
}