package com.pododoc.refactor.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO{

    @Autowired
    SqlSession session;
    String namespace = "com.pododoc.refactor.mapper.UsersMapper";

    @Override
    public List<HashMap<String, Object>> list() {
        return session.selectList(namespace+".list");
    }

}
