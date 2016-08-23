package com.readhi.template.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.readhi.template.dao.DomainDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class DaoTest {

	@Resource
	private DomainDao domainDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testQueryById() throws Exception {

		logger.info(domainDao.queryByNid(1L).toString());

	}

}
