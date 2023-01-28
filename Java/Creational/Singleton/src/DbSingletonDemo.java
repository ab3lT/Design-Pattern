public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);


        // Checking for singleton
        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);

    }


}
