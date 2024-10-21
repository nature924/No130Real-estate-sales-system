package com.dao;

import com.entity.XiaoshoujingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoujingliVO;
import com.entity.view.XiaoshoujingliView;


/**
 * 销售经理
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface XiaoshoujingliDao extends BaseMapper<XiaoshoujingliEntity> {
	
	List<XiaoshoujingliVO> selectListVO(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
	
	XiaoshoujingliVO selectVO(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
	
	List<XiaoshoujingliView> selectListView(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);

	List<XiaoshoujingliView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
	
	XiaoshoujingliView selectView(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
	
}
