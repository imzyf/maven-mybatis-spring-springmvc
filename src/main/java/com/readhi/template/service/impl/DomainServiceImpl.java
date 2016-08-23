package com.readhi.template.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readhi.template.dao.DomainDao;
import com.readhi.template.entity.Domain;
import com.readhi.template.service.DomainService;

@Service
public class DomainServiceImpl implements DomainService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DomainDao domainDao;

	@Override
	public Domain getDomain(Domain domain) {
		Long nid = domain.getDomainNid();
		if (nid != null) {
			domain = domainDao.queryByNid(nid);
		}
		logger.info(domain.toString());
		return domain;
	}

}
