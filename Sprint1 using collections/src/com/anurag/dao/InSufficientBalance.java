package com.anurag.dao;

@SuppressWarnings("serial")
public class InSufficientBalance extends Exception {
	public InSufficientBalance (final String msg){
        super(msg);
}
}
