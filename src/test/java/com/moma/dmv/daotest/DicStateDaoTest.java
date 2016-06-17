package com.moma.dmv.daotest;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moma.dmv.dao.DicStateDao;
import com.moma.dmv.entity.DicState;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class DicStateDaoTest {

	@Resource
	private DicStateDao dicStateDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testQueryById() throws Exception {
		List<DicState> tests = dicStateDao.queryAll();

		logger.info(Arrays.toString(tests.toArray()));
		logger.info(tests.size() + "");

	}

}
