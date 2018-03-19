package com.fb.data;

import org.hibernate.Session;
import com.fb.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fb.business.DoLogin;

public class HibCon extends DoLogin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SessionFactory sessionFactory;
	Session session;
	protected String DbUser;
	protected String DbPass;
	public static String DbFname;
	public static String DbLname;
	public static String DbState;
	FbModel  fbModelReaded;

	public void createConnection() {
		Configuration con = new Configuration().configure();
		sessionFactory = con.buildSessionFactory();
		System.out.println("connection created successfully using hibernate orm");// checking
	}

	public void close() {
		sessionFactory.close();
		session.close();
	}

	public void create() {
		session = sessionFactory.openSession();
		FbModel fbMod = new FbModel();
		fbMod.setfName(com.fb.business.DoRegister.fName);
		fbMod.setlName(com.fb.business.DoRegister.lName);
		fbMod.setuName(com.fb.business.DoRegister.uName);
		fbMod.setpWord(com.fb.business.DoRegister.pWord);
		session.beginTransaction();
		session.save(fbMod);
		session.getTransaction().commit();
		System.out.println("Data readed from form and written to data base and the values are " + fbMod.getfName() + ","
				+ fbMod.getlName() + "," + fbMod.getuName() + "," + fbMod.getpWord());

	}

	public FbModel read(FbModel fbModel) {
		String uName = fbModel.getuName();
		System.out.println(uName);
		session = sessionFactory.openSession();
		 fbModelReaded = session.get(FbModel.class, uName);
		if (fbModelReaded != null) {
			DbUser = fbModelReaded.getuName();
			DbPass = fbModelReaded.getpWord();
			DbFname = fbModelReaded.getfName();
			DbLname = fbModelReaded.getlName();
			DbState = fbModelReaded.getState();
			System.out
					.println("username and password readed from database and the values are " + DbUser + "," + DbPass+DbFname+DbLname+DbState);// checking
		}
		return fbModelReaded;
	}

}
