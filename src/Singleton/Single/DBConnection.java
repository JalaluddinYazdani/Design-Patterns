package Singleton.Single;

public class DBConnection {
    private static DBConnection instance =  null;
    private DBConnection(){

    }
    private static DBConnection getInstance(){
        if(instance==null){
            instance= new DBConnection();
        }
        return instance;
    }
}
