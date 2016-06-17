package com.moma.dmv.daotest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moma.dmv.dao.InfoDao;
import com.moma.dmv.entity.Info;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class InfoDaoTest {

	@Resource
	private InfoDao infoDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testQueryById() throws Exception {
		long id = 1;
		Info info = infoDao.queryById(id);
		logger.info(info.toString());

	}

}
