package group2.hremployee;

import java.util.ArrayList;

public class InfoList {
    	public ArrayList<Info> eminfo = new ArrayList<>();
	
	public void listInfo() {
		Info drea = new Info();
                drea.email = "drea@employee.hr";
                drea.pass = "dreaemp";
		drea.name = "";
		drea.age = 0 ;
		drea.maile = "";
		drea.contact = "" ;
		drea.jobdet = "";
		eminfo.add(drea);
		
		
		Info kyla = new Info();
                kyla.email = "kyla@employee.hr";
                kyla.pass = "kylaemp";
		kyla.name = "Kyla Aquino";
		kyla.age = 19 ;
		kyla.maile = "kyla@employee.hr";
		kyla.contact = "02929292929" ;
		kyla.jobdet = "";
		eminfo.add(kyla);
		
		Info drich = new Info();
                drich.email = "drich@employee.hr";
                drich.pass = "drichemp";
		drich.name = "";
		drich.age = 0 ;
		drich.maile = "";
		drich.contact = "" ;
		drich.jobdet = "";
		eminfo.add(drich);
		
		Info duke = new Info();
                duke.email = "duke@employee.hr";
                duke.pass = "dukeemp";
		duke.name = "";
		duke.age = 0 ;
		duke.maile = "";
		duke.contact = "" ;
		duke.jobdet = "";
		eminfo.add(duke);
		
		Info jaby = new Info();
                jaby.email = "jaby@manager.hr";
                jaby.pass = "jabyemp";
		jaby.name = "";
		jaby.age = 0 ;
		jaby.maile = "";
		jaby.contact = "" ;
		jaby.jobdet = "";
		eminfo.add(jaby);
	}
}
