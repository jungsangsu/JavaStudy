package com.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample03.SungJukDTO;
import sample03.SungJukImpl;
import sample05.SungJukDTO2;

@Configuration
public class Instance {
	
	@Bean(name="sungJukImpl")
	public SungJukImpl getSungJukImpl(){
		return new SungJukImpl();
	}
	
	@Bean(name="sungJukDTO")
	public SungJukDTO getSungJukDTO(){
		return new SungJukDTO();
	}
	
	@Bean(name="list")
	public ArrayList<SungJukDTO2> getSungJukDTO2List(){
		return new ArrayList<SungJukDTO2>();
	}
	
	@Bean(name="dto2")
	public SungJukDTO2 getSungJukDTO2() {
		return new SungJukDTO2();
	}
}









