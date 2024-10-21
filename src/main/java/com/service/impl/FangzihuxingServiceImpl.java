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


import com.dao.FangzihuxingDao;
import com.entity.FangzihuxingEntity;
import com.service.FangzihuxingService;
import com.entity.vo.FangzihuxingVO;
import com.entity.view.FangzihuxingView;

@Service("fangzihuxingService")
public class FangzihuxingServiceImpl extends ServiceImpl<FangzihuxingDao, FangzihuxingEntity> implements FangzihuxingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangzihuxingEntity> page = this.selectPage(
                new Query<FangzihuxingEntity>(params).getPage(),
                new EntityWrapper<FangzihuxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangzihuxingEntity> wrapper) {
		  Page<FangzihuxingView> page =new Query<FangzihuxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangzihuxingVO> selectListVO(Wrapper<FangzihuxingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangzihuxingVO selectVO(Wrapper<FangzihuxingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangzihuxingView> selectListView(Wrapper<FangzihuxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangzihuxingView selectView(Wrapper<FangzihuxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
