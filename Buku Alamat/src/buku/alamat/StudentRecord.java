package buku.alamat;
public class StudentRecord
{
private final String[] name=new String [100];
private final String[] alamate=new String [100];
private final String[] telpone=new String [100];
private final String[] emaile=new String [100];
private static int studentCount;
private static int indek;
public StudentRecord(){
studentCount=0;
}
public String getName(int indek){
return name[indek];
}

public String getAlamat(int indek){
return alamate[indek];
}
public String getTelpon(int indek){
return telpone[indek];
}
public String getEmail(int indek){
return emaile[indek];
}
public void setName( String nama, int indek,String alamat,String telpon,String email){
name[indek] = nama;
alamate[indek] = alamat;
telpone[indek] = telpon;
emaile[indek] = email;
studentCount++;
}
public static int getStudentCount(){
return studentCount;
}
}
