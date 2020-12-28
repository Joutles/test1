package cn.edu.gznc.sp01.service;

import cn.edu.gznc.sp01.entity.User;

public interface UserService {

	User getUser(Integer id);

	void addScore(Integer id, Integer score); // 增加积分

}
