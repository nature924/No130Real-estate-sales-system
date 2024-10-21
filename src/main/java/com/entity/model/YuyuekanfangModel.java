package com.entity.model;

import com.entity.YuyuekanfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 预约看房
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public class YuyuekanfangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 房源名称
	 */
	
	private String fangyuanmingcheng;
		
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
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
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
	 * 预约备注
	 */
	
	private String yuyuebeizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：房源名称
	 */
	 
	public void setFangyuanmingcheng(String fangyuanmingcheng) {
		this.fangyuanmingcheng = fangyuanmingcheng;
	}
	
	/**
	 * 获取：房源名称
	 */
	public String getFangyuanmingcheng() {
		return fangyuanmingcheng;
	}
				
	
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
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
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
	 * 设置：预约备注
	 */
	 
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
