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


import com.dao.XiaoshoujingliDao;
import com.entity.XiaoshoujingliEntity;
import com.service.XiaoshoujingliService;
import com.entity.vo.XiaoshoujingliVO;
import com.entity.view.XiaoshoujingliView;

@Service("xiaoshoujingliService")
public class XiaoshoujingliServiceImpl extends ServiceImpl<XiaoshoujingliDao, XiaoshoujingliEntity> implements XiaoshoujingliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoujingliEntity> page = this.selectPage(
                new Query<XiaoshoujingliEntity>(params).getPage(),
                new EntityWrapper<XiaoshoujingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoujingliEntity> wrapper) {
		  Page<XiaoshoujingliView> page =new Query<XiaoshoujingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoujingliVO> selectListVO(Wrapper<XiaoshoujingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoujingliVO selectVO(Wrapper<XiaoshoujingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoujingliView> selectListView(Wrapper<XiaoshoujingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoujingliView selectView(Wrapper<XiaoshoujingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
