package model;

public class Mail {
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        for (int i = 0; i < mail.length(); i++){
            if (mail.charAt(i) == '@') return mail.substring(i+1);
        }
        return null;
    }
}
