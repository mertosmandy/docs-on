

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mert.donmezyurek-ug
 */
public class Account {
    protected int id;
    protected String name, surname, address, phoneNum, birthDate;
    
    public Account(){
        id = 0;
        name = "";
        surname = "";
        address = "";
        phoneNum = "";
    }
    
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNum(){
        return phoneNum;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }  
}


