public class DbSingleton {

    //private static DbSingleton instance = new DbSingleton();


    // lazy loading
    private static DbSingleton instance = null;

    private DbSingleton(){

    }
    public static DbSingleton getInstance(){
        //lazy  loaded
        if(instance == null){
            instance =  new DbSingleton();
        }
        return instance;
    }
}
