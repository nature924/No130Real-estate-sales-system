package com.entity.model;

import com.entity.FangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房源信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public class FangyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源类型
	 */
	
	private String fangyuanleixing;
		
	/**
	 * 房源户型
	 */
	
	private String fangyuanhuxing;
		
	/**
	 * 房源图片
	 */
	
	private String fangyuantupian;
		
	/**
	 * 所在区域
	 */
	
	private String suozaiquyu;
		
	/**
	 * 房源位置
	 */
	
	private String fangyuanweizhi;
		
	/**
	 * 房源面积
	 */
	
	private Float fangyuanmianji;
		
	/**
	 * 每米价格
	 */
	
	private Float meimijiage;
		
	/**
	 * 总计
	 */
	
	private Float zongji;
		
	/**
	 * 房源介绍
	 */
	
	private String fangyuanjieshao;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 销售账号
	 */
	
	private String xiaoshouzhanghao;
		
	/**
	 * 销售姓名
	 */
	
	private String xiaoshouxingming;
		
	/**
	 * 销售手机
	 */
	
	private String xiaoshoushouji;
		
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
	 * 设置：房源类型
	 */
	 
	public void setFangyuanleixing(String fangyuanleixing) {
		this.fangyuanleixing = fangyuanleixing;
	}
	
	/**
	 * 获取：房源类型
	 */
	public String getFangyuanleixing() {
		return fangyuanleixing;
	}
				
	
	/**
	 * 设置：房源户型
	 */
	 
	public void setFangyuanhuxing(String fangyuanhuxing) {
		this.fangyuanhuxing = fangyuanhuxing;
	}
	
	/**
	 * 获取：房源户型
	 */
	public String getFangyuanhuxing() {
		return fangyuanhuxing;
	}
				
	
	/**
	 * 设置：房源图片
	 */
	 
	public void setFangyuantupian(String fangyuantupian) {
		this.fangyuantupian = fangyuantupian;
	}
	
	/**
	 * 获取：房源图片
	 */
	public String getFangyuantupian() {
		return fangyuantupian;
	}
				
	
	/**
	 * 设置：所在区域
	 */
	 
	public void setSuozaiquyu(String suozaiquyu) {
		this.suozaiquyu = suozaiquyu;
	}
	
	/**
	 * 获取：所在区域
	 */
	public String getSuozaiquyu() {
		return suozaiquyu;
	}
				
	
	/**
	 * 设置：房源位置
	 */
	 
	public void setFangyuanweizhi(String fangyuanweizhi) {
		this.fangyuanweizhi = fangyuanweizhi;
	}
	
	/**
	 * 获取：房源位置
	 */
	public String getFangyuanweizhi() {
		return fangyuanweizhi;
	}
				
	
	/**
	 * 设置：房源面积
	 */
	 
	public void setFangyuanmianji(Float fangyuanmianji) {
		this.fangyuanmianji = fangyuanmianji;
	}
	
	/**
	 * 获取：房源面积
	 */
	public Float getFangyuanmianji() {
		return fangyuanmianji;
	}
				
	
	/**
	 * 设置：每米价格
	 */
	 
	public void setMeimijiage(Float meimijiage) {
		this.meimijiage = meimijiage;
	}
	
	/**
	 * 获取：每米价格
	 */
	public Float getMeimijiage() {
		return meimijiage;
	}
				
	
	/**
	 * 设置：总计
	 */
	 
	public void setZongji(Float zongji) {
		this.zongji = zongji;
	}
	
	/**
	 * 获取：总计
	 */
	public Float getZongji() {
		return zongji;
	}
				
	
	/**
	 * 设置：房源介绍
	 */
	 
	public void setFangyuanjieshao(String fangyuanjieshao) {
		this.fangyuanjieshao = fangyuanjieshao;
	}
	
	/**
	 * 获取：房源介绍
	 */
	public String getFangyuanjieshao() {
		return fangyuanjieshao;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：销售账号
	 */
	 
	public void setXiaoshouzhanghao(String xiaoshouzhanghao) {
		this.xiaoshouzhanghao = xiaoshouzhanghao;
	}
	
	/**
	 * 获取：销售账号
	 */
	public String getXiaoshouzhanghao() {
		return xiaoshouzhanghao;
	}
				
	
	/**
	 * 设置：销售姓名
	 */
	 
	public void setXiaoshouxingming(String xiaoshouxingming) {
		this.xiaoshouxingming = xiaoshouxingming;
	}
	
	/**
	 * 获取：销售姓名
	 */
	public String getXiaoshouxingming() {
		return xiaoshouxingming;
	}
				
	
	/**
	 * 设置：销售手机
	 */
	 
	public void setXiaoshoushouji(String xiaoshoushouji) {
		this.xiaoshoushouji = xiaoshoushouji;
	}
	
	/**
	 * 获取：销售手机
	 */
	public String getXiaoshoushouji() {
		return xiaoshoushouji;
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
			
}
