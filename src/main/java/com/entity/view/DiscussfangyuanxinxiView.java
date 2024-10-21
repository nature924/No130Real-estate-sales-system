package com.entity.view;

import com.entity.DiscussfangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房源信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
@TableName("discussfangyuanxinxi")
public class DiscussfangyuanxinxiView  extends DiscussfangyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfangyuanxinxiView(){
	}
 
 	public DiscussfangyuanxinxiView(DiscussfangyuanxinxiEntity discussfangyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfangyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
