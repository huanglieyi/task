package com.example.task.mapper;

import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import com.example.task.entity.User;

public interface MessageDao {
	 @SelectProvider(type = cls.class,method = "methods")
		User message(Integer userid);
	 
	 public  class cls{
		 public String methods(Integer userid) {
			 SQL sql = new SQL();
			 sql.SELECT("userid,username,age,birth");
			 sql.FROM("test");
			 sql.WHERE("userid="+userid);
			 return sql.toString();
		 }
		 
	 }
}
