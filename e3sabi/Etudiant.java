import java.io.Serializable;
public class Etudiant implements Serializable{
	private long id;
	private String fristName;
	private String lastName;
	private String department;
	private String encadrant;
	private String naturedestage;
	private String validation;
	private String mail;
	private String passwrd;
	public Etudiant(long id, String fristName, String lastName,
			String department, String encadrant, String naturedestage,
			String validation, String mail, String passwrd) {
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.department = department;
		this.encadrant = encadrant;
		this.naturedestage = naturedestage;
		this.validation = validation;
		this.mail = mail;
		this.passwrd = passwrd;
	}
	public Etudiant(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEncadrant() {
		return encadrant;
	}
	public void setEncadrant(String encadrant) {
		this.encadrant = encadrant;
	}
	public String getNaturedestage() {
		return naturedestage;
	}
	public void setNaturedestage(String naturedestage) {
		this.naturedestage = naturedestage;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	@Override
	public String toString() {
		return "etudiant [department=" + department + ", encadrant="
				+ encadrant + ", fristName=" + fristName + ", id=" + id
				+ ", lastName=" + lastName + ", mail=" + mail
				+ ", naturedestage=" + naturedestage + ", passwrd=" + passwrd
				+ ", validation=" + validation + "]";
	}
	
}
