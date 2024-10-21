package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangyuanxinxiView;


/**
 * 房源信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:37:12
 */
public interface DiscussfangyuanxinxiService extends IService<DiscussfangyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangyuanxinxiVO> selectListVO(Wrapper<DiscussfangyuanxinxiEntity> wrapper);
   	
   	DiscussfangyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussfangyuanxinxiEntity> wrapper);
   	
   	List<DiscussfangyuanxinxiView> selectListView(Wrapper<DiscussfangyuanxinxiEntity> wrapper);
   	
   	DiscussfangyuanxinxiView selectView(@Param("ew") Wrapper<DiscussfangyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangyuanxinxiEntity> wrapper);
   	
}

