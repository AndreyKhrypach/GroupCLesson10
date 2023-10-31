public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    //check if name in method are not same as field name
    public void setAccount(String password) {

        class Account {

            String password;

            Account(){
                password = password;
            }
            void display() {
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}
