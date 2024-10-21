package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoujingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoujingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoujingliView;


/**
 * 销售经理
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface XiaoshoujingliService extends IService<XiaoshoujingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoujingliVO> selectListVO(Wrapper<XiaoshoujingliEntity> wrapper);
   	
   	XiaoshoujingliVO selectVO(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
   	
   	List<XiaoshoujingliView> selectListView(Wrapper<XiaoshoujingliEntity> wrapper);
   	
   	XiaoshoujingliView selectView(@Param("ew") Wrapper<XiaoshoujingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoujingliEntity> wrapper);
   	
}

