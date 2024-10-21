package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyidingdanView;


/**
 * 交易订单
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface JiaoyidingdanService extends IService<JiaoyidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyidingdanVO> selectListVO(Wrapper<JiaoyidingdanEntity> wrapper);
   	
   	JiaoyidingdanVO selectVO(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
   	
   	List<JiaoyidingdanView> selectListView(Wrapper<JiaoyidingdanEntity> wrapper);
   	
   	JiaoyidingdanView selectView(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyidingdanEntity> wrapper);
   	
}

