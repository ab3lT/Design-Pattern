public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("Abel");
        emp.setAddress("Ethiopia");
        emp.setPhone("888-555-1212");
        System.out.println("Employe before save:                " + emp );

        caretaker.save(emp);
        emp.setPhone("444-555-6666");
        caretaker.save(emp);
        System.out.println("Employe after changed phone number save:      " + emp );

        emp.setPhone("333-999-6666");  // <--- i will not call save this time


        caretaker.revert(emp);

        System.out.println("Reverts to last save point               " + emp);

        caretaker.revert(emp);
        System.out.println("Revereted to original:                  "   +emp);
    }
}
