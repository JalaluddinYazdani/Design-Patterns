package Singleton.Eager;

public class DBConnection {
        private static DBConnection instance =
                new DBConnection();

        private DBConnection(){

        }
        private static DBConnection getInstance(){
                return instance;
        }
}
