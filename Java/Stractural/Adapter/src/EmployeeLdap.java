public class EmployeeLdap {
    private String cm;
    private String surename;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cm, String surename, String givenName, String mail) {
        this.cm = cm;
        this.surename = surename;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCm() {
        return cm;
    }

    public String getSurename() {
        return surename;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
