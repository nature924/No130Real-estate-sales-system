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


import com.dao.JiaoyidingdanDao;
import com.entity.JiaoyidingdanEntity;
import com.service.JiaoyidingdanService;
import com.entity.vo.JiaoyidingdanVO;
import com.entity.view.JiaoyidingdanView;

@Service("jiaoyidingdanService")
public class JiaoyidingdanServiceImpl extends ServiceImpl<JiaoyidingdanDao, JiaoyidingdanEntity> implements JiaoyidingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyidingdanEntity> page = this.selectPage(
                new Query<JiaoyidingdanEntity>(params).getPage(),
                new EntityWrapper<JiaoyidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyidingdanEntity> wrapper) {
		  Page<JiaoyidingdanView> page =new Query<JiaoyidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyidingdanVO> selectListVO(Wrapper<JiaoyidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyidingdanVO selectVO(Wrapper<JiaoyidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyidingdanView> selectListView(Wrapper<JiaoyidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyidingdanView selectView(Wrapper<JiaoyidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
