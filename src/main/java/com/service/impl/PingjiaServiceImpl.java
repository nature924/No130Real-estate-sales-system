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


import com.dao.PingjiaDao;
import com.entity.PingjiaEntity;
import com.service.PingjiaService;
import com.entity.vo.PingjiaVO;
import com.entity.view.PingjiaView;

@Service("pingjiaService")
public class PingjiaServiceImpl extends ServiceImpl<PingjiaDao, PingjiaEntity> implements PingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiaEntity> page = this.selectPage(
                new Query<PingjiaEntity>(params).getPage(),
                new EntityWrapper<PingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiaEntity> wrapper) {
		  Page<PingjiaView> page =new Query<PingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiaVO> selectListVO(Wrapper<PingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiaVO selectVO(Wrapper<PingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiaView> selectListView(Wrapper<PingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiaView selectView(Wrapper<PingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
