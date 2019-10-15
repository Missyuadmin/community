package com.spring.boot.Mapper;

import com.spring.boot.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into USER(ACCOUNT_ID,name, token, gmt_create, gmt_modified,avatar_url) values (#{accountId} ,#{name} ,#{token},#{gmtCreate} ,#{gmtModified},#{avatarUrl} )")
    void insert(User user);

    @Select("select * from USER where TOKEN=#{token} ")
    User findByToken(@Param("token") String token);

    @Select("select * from USER where ID=#{id} ")
    User findById(@Param("id") Integer id);
}
