package com.faheemali.SpringDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Movies implements DisposableBean, InitializingBean {
	
	private String movie_name;
	
	Movies()
	{
		System.out.println("From Constructor");
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	@Override
	public void destroy(){
		System.out.println("In Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In Init");
	}
}
