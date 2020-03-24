package com.anurag.dao;



import com.anurag.entity.WalletUser;
import com.anurag.entity.WalletAccount;
import com.anurag.entity.WalletTransactions;

public interface DaoInterface {

	public WalletUser addaccount(WalletUser wallet) throws Exception;

	WalletAccount addamount(String username1, String password1, Double balance ) throws Exception;

	Double displayBalance(String username2, String password2) throws Exception;

	WalletTransactions transferamount(String username3, String password3, Integer uid, Double tramount) throws Exception;

	public boolean checkcredentials(String username3, String password3) throws Exception;

}
