package com.moma.dmv.dao;

import java.util.List;

import com.moma.dmv.entity.Info;

public interface InfoDao {

	Info queryById(long id);

	List<Info> queryAll(long offset, long limit);

}
