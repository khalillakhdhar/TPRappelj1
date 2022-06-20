package users;

public class User {
private String nom,prenom;
private int age;
private String adresse,telephone;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public User(String nom, String prenom, int age, String adresse, String telephone) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.adresse = adresse;
	this.telephone = telephone;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", telephone="
			+ telephone + "]";
}




}
