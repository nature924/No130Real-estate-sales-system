package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussfangyuanxinxiDao;
import com.entity.DiscussfangyuanxinxiEntity;
import com.service.DiscussfangyuanxinxiService;
import com.entity.vo.DiscussfangyuanxinxiVO;
import com.entity.view.DiscussfangyuanxinxiView;

@Service("discussfangyuanxinxiService")
public class DiscussfangyuanxinxiServiceImpl extends ServiceImpl<DiscussfangyuanxinxiDao, DiscussfangyuanxinxiEntity> implements DiscussfangyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangyuanxinxiEntity> page = this.selectPage(
                new Query<DiscussfangyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussfangyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangyuanxinxiEntity> wrapper) {
		  Page<DiscussfangyuanxinxiView> page =new Query<DiscussfangyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangyuanxinxiVO> selectListVO(Wrapper<DiscussfangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangyuanxinxiVO selectVO(Wrapper<DiscussfangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangyuanxinxiView> selectListView(Wrapper<DiscussfangyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangyuanxinxiView selectView(Wrapper<DiscussfangyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
