package Order;

public class Order {
       private int id_prod;
       private String name_prod;

       public Order(){

       }
       public Order(int id , String name){
               setId_prod(id);
               setName_prod(name);
       }

        public int getId_prod() {
                return id_prod;
        }

        public void setId_prod(int id_prod) {
                this.id_prod = id_prod;
        }

        public void setName_prod(String name_prod) {
                this.name_prod = name_prod;
        }

        public String getName_prod() {
                return name_prod;
        }
}
