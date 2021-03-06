package com.anurag.entity;


public class WalletUser{
private Integer UserId;
private String UserName;
private String Password;
private String PhoneNumber;
private String LoginName;
public Integer getUserId() {
	return UserId;
}
public void setUserId(Integer userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getLoginName() {
	return LoginName;
}
public void setLoginName(String loginName) {
	LoginName = loginName;
}


public WalletUser(Integer userId, String userName, String password, String phoneNumber, String loginName) {
	super();
	UserId = userId;
	UserName = userName;
	Password = password;
	PhoneNumber = phoneNumber;
	LoginName = loginName;
	}

@Override
public String toString() {
	return "WalletUser [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + ", PhoneNumber="
			+ PhoneNumber + ", LoginName=" + LoginName + "]";
}
}
