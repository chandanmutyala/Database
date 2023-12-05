public class Connection {
    public static void main(String[] args){
        Database sql =new MySql();
        Database oracle=new Oracle();
        sql.getConnection();
        oracle.getConnection();
    }
}
