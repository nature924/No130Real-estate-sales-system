package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingjiaView;


/**
 * 评价
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface PingjiaService extends IService<PingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiaVO> selectListVO(Wrapper<PingjiaEntity> wrapper);
   	
   	PingjiaVO selectVO(@Param("ew") Wrapper<PingjiaEntity> wrapper);
   	
   	List<PingjiaView> selectListView(Wrapper<PingjiaEntity> wrapper);
   	
   	PingjiaView selectView(@Param("ew") Wrapper<PingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiaEntity> wrapper);
   	
}

