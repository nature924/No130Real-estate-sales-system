package com.dao;

import com.entity.FangzihuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangzihuxingVO;
import com.entity.view.FangzihuxingView;


/**
 * 房子户型
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface FangzihuxingDao extends BaseMapper<FangzihuxingEntity> {
	
	List<FangzihuxingVO> selectListVO(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
	
	FangzihuxingVO selectVO(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
	
	List<FangzihuxingView> selectListView(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);

	List<FangzihuxingView> selectListView(Pagination page,@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
	
	FangzihuxingView selectView(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
	
}
