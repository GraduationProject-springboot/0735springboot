package com.entity.vo;

import com.entity.BaojianpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 保健品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public class BaojianpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 保健品分类
	 */
	
	private String baojianpinfenlei;
		
	/**
	 * 适用人群
	 */
	
	private String shiyongrenqun;
		
	/**
	 * 保健功能
	 */
	
	private String baojiangongneng;
		
	/**
	 * 主要原料
	 */
	
	private String zhuyaoyuanliao;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：保健品分类
	 */
	 
	public void setBaojianpinfenlei(String baojianpinfenlei) {
		this.baojianpinfenlei = baojianpinfenlei;
	}
	
	/**
	 * 获取：保健品分类
	 */
	public String getBaojianpinfenlei() {
		return baojianpinfenlei;
	}
				
	
	/**
	 * 设置：适用人群
	 */
	 
	public void setShiyongrenqun(String shiyongrenqun) {
		this.shiyongrenqun = shiyongrenqun;
	}
	
	/**
	 * 获取：适用人群
	 */
	public String getShiyongrenqun() {
		return shiyongrenqun;
	}
				
	
	/**
	 * 设置：保健功能
	 */
	 
	public void setBaojiangongneng(String baojiangongneng) {
		this.baojiangongneng = baojiangongneng;
	}
	
	/**
	 * 获取：保健功能
	 */
	public String getBaojiangongneng() {
		return baojiangongneng;
	}
				
	
	/**
	 * 设置：主要原料
	 */
	 
	public void setZhuyaoyuanliao(String zhuyaoyuanliao) {
		this.zhuyaoyuanliao = zhuyaoyuanliao;
	}
	
	/**
	 * 获取：主要原料
	 */
	public String getZhuyaoyuanliao() {
		return zhuyaoyuanliao;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
