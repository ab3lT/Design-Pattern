
//Originator

public class Employee {
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name : "+ name + ", Phone: " + phone + ", Address : " + address;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name, phone, address);
    }
    public void revert(EmployeeMemento emp){
        this.name = emp.getName();
        this.phone = emp.getPhone();
        this.address = emp.getAddress();
    }
}
