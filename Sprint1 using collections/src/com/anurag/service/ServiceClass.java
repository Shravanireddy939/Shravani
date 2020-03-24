package com.anurag.service;


import java.sql.SQLException;

import com.anurag.dao.DaoClass;
import com.anurag.dao.DaoInterface;
import com.anurag.entity.WalletUser;
import com.anurag.entity.WalletAccount;
import com.anurag.entity.WalletTransactions;

public class ServiceClass implements ServiceInterface{
	DaoInterface dao = new DaoClass();
	@Override
	public WalletUser addaccount(WalletUser wallet) throws Exception {
		// TODO Auto-generated method stub
		return dao.addaccount(wallet);
	}

	@Override
	public WalletAccount addamount(String username1, String password1, Double balance) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return dao.addamount(username1,password1,balance);
	}

	@Override
	public Double displayBalance(String username2, String password2) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return dao.displayBalance(username2,password2);
	}

	@Override
	public WalletTransactions transferamount(String username3, String password3, Integer uid, Double tramount) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return dao.transferamount(username3,password3, uid,tramount);
	}

	@Override
	public boolean checkcredentials(String username3, String password3) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return dao.checkcredentials(username3,password3);
	}


}



