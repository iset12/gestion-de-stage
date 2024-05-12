package stage;

public class inscription {
	private String username;
	private String email;
	private String psw;
	private String cpsw;
	
	public inscription(String user,String email,String psw,String cpsw){
		this.username=user;
		this.email=email;
		this.psw=psw;
		this.cpsw=cpsw;
	}
	public String getusername(){
		return username;
	}
	public String getemail(){
		return email;
	}
	public String getpsw(){
		return psw;
	}
	public String getcpsw(){
		return cpsw;
	}
	public void setusernme(String username){
		this.username=username;
	}
	public void setemail(String email){
		this.email=email;
	}
	
	public void setpsw(String psw){
		this.psw=psw;
	}
	public void setcpsw(String cpsw){
		this.cpsw=cpsw;
	}
}
