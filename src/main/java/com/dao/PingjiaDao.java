package com.dao;

import com.entity.PingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiaVO;
import com.entity.view.PingjiaView;


/**
 * 评价
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface PingjiaDao extends BaseMapper<PingjiaEntity> {
	
	List<PingjiaVO> selectListVO(@Param("ew") Wrapper<PingjiaEntity> wrapper);
	
	PingjiaVO selectVO(@Param("ew") Wrapper<PingjiaEntity> wrapper);
	
	List<PingjiaView> selectListView(@Param("ew") Wrapper<PingjiaEntity> wrapper);

	List<PingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiaEntity> wrapper);
	
	PingjiaView selectView(@Param("ew") Wrapper<PingjiaEntity> wrapper);
	
}
