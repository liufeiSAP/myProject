package com.deppon.test04.service.impl;

import com.deppon.test04.dao.IPersonDao;
import com.deppon.test04.service.IPersonService;

public class PersonService implements IPersonService {
	private IPersonDao personDao;

	public IPersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	public void processSave() {	
		System.out.println("-from PersonService.processSave()");
		personDao.save();
	}
}
