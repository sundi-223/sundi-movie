package com.sundi.movie.domain;

public class MovieVo extends Movie{

	private String  up1;//开始时间
	private String  up2;//结束时间
	private Double   p1;//开始价格
	private Double   p2;//结束价格
	private Integer l1;//开始时长
	private Integer l2;//结束时长
	
	private String orderColumn;//排序的字段
	private String orderMethod;//排序的方法
	
	public String getUp1() {
		return up1;
	}
	public void setUp1(String up1) {
		this.up1 = up1;
	}
	public String getUp2() {
		return up2;
	}
	public void setUp2(String up2) {
		this.up2 = up2;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public Integer getL1() {
		return l1;
	}
	public void setL1(Integer l1) {
		this.l1 = l1;
	}
	public Integer getL2() {
		return l2;
	}
	public void setL2(Integer l2) {
		this.l2 = l2;
	}
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	
	
}
