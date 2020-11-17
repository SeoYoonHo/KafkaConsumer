package com.msa.service3.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Service1Dao {
	protected static final String NAMESPACE = "Service1Mapper.";

	@Autowired
	private SqlSession sqlSession;

	public String test() {
		return sqlSession.selectOne(NAMESPACE + "test");
	}

}
