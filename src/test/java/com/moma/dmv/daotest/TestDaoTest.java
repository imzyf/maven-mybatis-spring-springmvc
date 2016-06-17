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

import com.moma.dmv.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestDaoTest {

	@Resource
	private TestDao testDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testQueryById() throws Exception {
		List<com.moma.dmv.entity.Test> tests = testDao.queryByStateAndType(4, "Car");

		logger.info(Arrays.toString(tests.toArray()));
		logger.info(tests.size() + "");

	}

}
