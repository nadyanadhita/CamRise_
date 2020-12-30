public class Database {

    private String[][] data = {
        {"101","Farhan","19","L","Banda Aceh","Ada"}, 
        {"102","Karomi","20","L","Banda Aceh","Tidak Ada"}, 
        {"103","Nadya","20","P","Banda Aceh","Tidak Ada"},
        {"104","Nadhita","20","P","Banda Aceh","Tidak Ada"},
        {"105","Udin","20","L","Banda Aceh","Ada"},
    };

    private static Database instance;
    private Database(){}

    public static Database getInstance()
    {
    if(instance == null)
      instance = new Database();
		
    return instance;
  }

  public String[][] getData(){
      return this.data;
  }

}