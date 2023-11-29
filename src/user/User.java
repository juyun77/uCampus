package user;

public class User {

   private String userID;
   private String userPassword;
   private String UserName;
   private String userdeName;
   private String userGender;
   private String userEmail;
   private String userPhone;
   private int userIf;
   
   private String deName;
   private String sec1;
   private String sec2;
   private String sec3;
   private String sec4;
   private String recv_id;
   private String send_id;
   private String title;
   private String value;

   

public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserdeName() {
	return userdeName;
}
public void setUserdeName(String userdeName) {
	this.userdeName = userdeName;
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getUserGender() {
	return userGender;
}
public void setUserGender(String userGender) {
	this.userGender = userGender;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

public int getUserIf() {
	return userIf;
}
public void setUserIf(int userIf) {
	this.userIf = userIf;
}
public String getSec1() {
	return sec1;
}
public void setSec1(String sec1) {
	this.sec1 = sec1;
}
public String getSec2() {
	return sec2;
}
public void setSec2(String sec2) {
	this.sec2 = sec2;
}
public String getSec3() {
	return sec3;
}
public void setSec3(String sec3) {
	this.sec3 = sec3;
}
public String getSec4() {
	return sec4;
}
public void setSec4(String sec4) {
	this.sec4 = sec4;
}
public String getDeName() {
	return deName;
}
public void setDeName(String deName) {
	this.deName = deName;
}

public String getrecv_Id()
{
  return recv_id;
}

public String getsend_Id()
{
	return send_id;	
}

public String gettitle()
{
	return title;
}

public String getvalue()
{
	return value;
}

public void setrecv_Id(String recv_id)
{
  this.recv_id=recv_id;
}

public void setsend_Id(String send_id )
{
	this.send_id=send_id;	
}

public void settitle(String title)
{
	this.title=title;
}

public void setvalue(String value)
{
	this.value=value;

}

public String getUserPhone() {
	
	return userPhone;
}

public void setUserPhone(String phone) {
	this.userPhone = phone;
}



}