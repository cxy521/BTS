package com.hkay.weifei.Dao;

import java.util.List;

import com.hkay.weifei.pojo.Condition;

public interface ConditionDao {

	List<Condition> queryProvince();

	List<Condition> queryCity(Condition condition);

	List<Condition> queryTown(Condition condition);

	List<Condition> queryClimate();

	List<Condition> queryTerrain();

	List<Condition> queryAdvIndustry();

	List<Condition> queryDirIndustry();

}
