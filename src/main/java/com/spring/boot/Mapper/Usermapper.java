package com.spring.boot.Mapper;

import com.spring.boot.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Usermapper {
    @Insert("insert into USER(ACCOUNT_ID,name, token, gmt_create, gmt_modified) values (#{accountId} ,#{name} ,#{token},#{gmtCreate} ,#{gmtModified})")
    void insert(User user);
}
