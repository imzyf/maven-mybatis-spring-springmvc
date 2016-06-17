package com.moma.dmv.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moma.dmv.dao.InfoDao;
import com.moma.dmv.entity.Info;
import com.moma.dmv.service.InfoService;

//@Dao 
//@Controller
@Service
public class InfoServiceImpl implements InfoService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private InfoDao infoDao;

	@Override
	public Info queryById(long id) {
		// TODO Auto-generated method stub
		return infoDao.queryById(id);
	}

}
