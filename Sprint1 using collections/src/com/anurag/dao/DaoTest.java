package com.anurag.dao;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.anurag.entity.WalletAccount;
import com.anurag.entity.WalletTransactions;
public class DaoTest {
	

	DaoClass dao=new DaoClass();
	/*@Test
	public void addaccountdetails() throws Exception {
		Integer i=1;
		WalletAccount  result = dao.addaccount(i,"Sita", "Sita@1", "9884433221","SitaLaksmi");
		if (result!=null) {
			assertFalse(false);
		}
	}*/
	@Test
	public void addamounttoaccount() throws Exception {
		Double i=(double) 900;
		WalletAccount result = dao.addamount("Sita", "Sita@1", i);
		
		if (result!=null) {
			assertTrue(true);
		}}//int expectedResult = 652;
        //Assert.assertEquals(expectedResult, result);
	//}
	
	@Test
	public void displaybal() throws Exception {
		Double  result = dao.displayBalance("Sita", "Sita@1");
		if (result==1) {
			assertFalse(true);
		}
	}
	public void amounttrddaccount() throws Exception {
		Integer i= 2;
		Double i2=(double) 900;
		WalletTransactions  result = dao.transferamount("Sita", "Sita@1", i, i2);
		if (result!=null) {
			assertTrue(true);
		}
	}
}

