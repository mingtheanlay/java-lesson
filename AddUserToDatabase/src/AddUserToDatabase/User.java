package AddUserToDatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thean
 */
class User {
    private int sno;
    private String name, address, gender, knowledge, subject;

    public User(int sno, String name, String address, String gender, String knowledge, String subject) {
        this.sno = sno;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
        this.subject = subject;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public String getSubject() {
        return subject;
    }
    
    
}
