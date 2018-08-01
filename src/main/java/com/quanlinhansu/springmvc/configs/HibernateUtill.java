package com.quanlinhansu.springmvc.configs;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtill {
	private static final SessionFactory Fact;

	static {
		try {
		        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("com/quanlinhansu/springmvc/configs/hibernate.cfg.xml").build();
		        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		        Fact = metaData.getSessionFactoryBuilder().build();
		} catch (Throwable th) {
			System.err.println("Enitial SessionFactory creation failed" + th);
			throw new ExceptionInInitializerError(th);
		}
	}
	public static SessionFactory getFact() {
		return Fact;
	}
}
