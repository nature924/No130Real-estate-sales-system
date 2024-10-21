package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangzihuxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangzihuxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangzihuxingView;


/**
 * 房子户型
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface FangzihuxingService extends IService<FangzihuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangzihuxingVO> selectListVO(Wrapper<FangzihuxingEntity> wrapper);
   	
   	FangzihuxingVO selectVO(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
   	
   	List<FangzihuxingView> selectListView(Wrapper<FangzihuxingEntity> wrapper);
   	
   	FangzihuxingView selectView(@Param("ew") Wrapper<FangzihuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangzihuxingEntity> wrapper);
   	
}

