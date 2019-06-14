package com.example.task.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.entity.User;
import com.example.task.mapper.MessageDao;
import com.example.task.service.IMessageService;
@Service
public class MessageImpl implements IMessageService{
	@Autowired
	MessageDao messageDao;

	@Override
	public User find(Integer id) {
		return get(id);
	}
	private User get(Integer id) {
		User rows = messageDao.message(id);
		return rows;
		
	}
	

	

}
