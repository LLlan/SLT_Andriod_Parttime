package com.niit.parttime.config;

/**
 * 服务器端Servlet处理的网址
 * @author Admin
 *
 */
public class URLs {
	//10.0.2.2代表本地网络，而不是127.0.0.1
	/*public static final String BASIC_URL = "http://10.10.2.32:8080/paopao";
	
	public static final String LOGIN = BASIC_URL + "/user/user?action=validate";
	
	public static final String REGISTER = BASIC_URL + "/user/user?action=add";
	
	public static final String RESTPWD = BASIC_URL + "/user/user?action=forgot";
	
	public static final String JOBLIST = BASIC_URL + "/JobList/JobList?action=list";
	
	public static final String JOBVIEW = BASIC_URL + "/JobList/JobList?action=view&jobID=%s";//%s字符串占位符
	
	public static final String GRZL = BASIC_URL + "/GeRenZiLiaoServlet?action=grzllist";*/
	
	
	
	public static final String BASIC_URL = "http://10.10.2.32:8080/paopao";
	public static final String LOGIN = BASIC_URL
			+ "/UserServlet?action=validate";
	
	public static final String REGISTER = BASIC_URL 
			+ "/UserServlet?action=add";
	

	public static final String USER_RESETPWD = BASIC_URL
			+ "/UserServlet?action=forgotpwd";
	
	public static final String JOB_LIST = BASIC_URL
			+ "/JobListServlet?action=list";
	
	public static final String JOB_VIEW = BASIC_URL
			+ "/JobListServlet?action=view&jobID=%s";
}
