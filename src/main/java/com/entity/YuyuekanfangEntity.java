package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约看房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
@TableName("yuyuekanfang")
public class YuyuekanfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyuekanfangEntity() {
		
	}
	
	public YuyuekanfangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
