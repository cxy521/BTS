package com.hkay.weifei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hkay.weifei.Dao.ConditionDao;
import com.hkay.weifei.pojo.Condition;
import com.hkay.weifei.service.ConditionService;

@Service("ConditionService")
public class ConditionServiceImpl implements ConditionService{

	@Resource
	private ConditionDao conditiondao;
	@Override
	public List<Condition> queryProvince() {
		// TODO Auto-generated method stub
		return this.conditiondao.queryProvince();
	}
	@Override
	public List<Condition> queryCity(Condition condition) {
		// TODO Auto-generated method stub
		return this.conditiondao.queryCity(condition);
	}
	@Override
	public List<Condition> queryTown(Condition condition) {
		// TODO Auto-generated method stub
		return this.conditiondao.queryTown(condition);
	}
	@Override
	public List<Condition> queryClimate() {
		// TODO Auto-generated method stub
		return this.conditiondao.queryClimate();
	}
	@Override
	public List<Condition> queryTerrain() {
		// TODO Auto-generated method stub
		return this.conditiondao.queryTerrain();
	}
	@Override
	public List<Condition> queryAdvIndustry() {
		// TODO Auto-generated method stub
		return this.conditiondao.queryAdvIndustry();
	}
	@Override
	public List<Condition> queryDirIndustry() {
		// TODO Auto-generated method stub
		return this.conditiondao.queryDirIndustry();
	}
	
}
