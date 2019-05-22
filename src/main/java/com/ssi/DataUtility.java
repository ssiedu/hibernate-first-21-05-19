package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataUtility {
	public static SessionFactory getSF(){
		Configuration config=new Configuration().configure("myconfig.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}
}
