package sk.kosickaakademia.company.entity.log;

public class Log {
    public void error(String msg){
        System.out.println("[ERROR]:" +msg);
    }
    public void print(String msg){
        System.out.println("[OK]: " +msg);
    }
}
