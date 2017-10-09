package com.liu.po;

import java.util.Arrays;
import java.util.List;

public class UserInfo {
	private int userId;
	private String userName; 
	private String userSex;
	private List<String> userXq;//数组也可以
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public List<String> getUserXq() {
		return userXq;
	}
	public void setUserXq(List<String> userXq) {
		this.userXq = userXq;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + ", userXq=" + userXq
				+ "]";
	}
}
