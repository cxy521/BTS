package com.hkay.weifei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hkay.weifei.Dao.InvitemDao;
import com.hkay.weifei.pojo.Tb_zhaoshangxiangmu;
import com.hkay.weifei.service.InvitemService;

@Service("InvitemService")
public class InvitemServiceImpl implements InvitemService{
	@Resource
	private InvitemDao invitemdao;
	
	@Override
	public int insertinvitem(Tb_zhaoshangxiangmu tb_zhaoshangxiangmu) {
		// TODO Auto-generated method stub
		return this.invitemdao.insertinvitem(tb_zhaoshangxiangmu);
	}

	@Override
	public List<Tb_zhaoshangxiangmu> queryinvinfo(Tb_zhaoshangxiangmu tb_zhaoshangxiangmu) {
		// TODO Auto-generated method stub
		return this.invitemdao.queryinvinfo(tb_zhaoshangxiangmu);
	}

	@Override
	public int queryinvinfocnt(Tb_zhaoshangxiangmu tb_zhaoshangxiangmu) {
		// TODO Auto-generated method stub
		return this.invitemdao.queryinvinfocnt(tb_zhaoshangxiangmu);
	}

	@Override
	public List<Tb_zhaoshangxiangmu> queryinvitemdetail(Tb_zhaoshangxiangmu invitem) {
		// TODO Auto-generated method stub
		return this.invitemdao.queryinvitemdetail(invitem);
	}

	@Override
	public int updateinv(Tb_zhaoshangxiangmu tb_zhaoshangxiangmu) {
		// TODO Auto-generated method stub
		return this.invitemdao.updateinv(tb_zhaoshangxiangmu);
	}

}
