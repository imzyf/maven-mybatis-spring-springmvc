package com.moma.dmv.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.moma.dmv.entity.Test;

public interface TestDao {

	List<Test> queryByStateAndType(@Param("stateId") long stateId, @Param("testType") String testType);

}
