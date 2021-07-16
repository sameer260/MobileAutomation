package org.Stepdefinition;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static  void generatejvmreport(String json) {
		File f = new File("src\\test\\resources\\Reports\\jvm");
		Configuration con = new Configuration(f,"GudSho");
		con.addClassifications("Platform","Android");
		con.addClassifications("PlatformVersion","11");
		con.addClassifications("sprint", "1");
		
		List<String> jvm =new ArrayList<String>();	
				jvm.add(json);
				
	ReportBuilder rep=new ReportBuilder(jvm, con);
				rep.generateReports();
}
}

