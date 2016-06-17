package com.moma.dmv.dao;

import java.util.List;

import com.moma.dmv.entity.DicState;

public interface DicStateDao {

	/**
	 * 查询所有数据
	 * 
	 * @Title: queryAll
	 * @Description:
	 * @author zyf
	 * @date Jun 17, 2016
	 * @return
	 * @return List<DicState>
	 */
	List<DicState> queryAll();
}
