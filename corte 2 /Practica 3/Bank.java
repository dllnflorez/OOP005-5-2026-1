package checkingaccount;

public class Bank {
private CheckingAccount accountOne;
private CheckingAccount accountTwo;
        public Bank(){
            accountOne = new CheckingAccount("Juan",100,"1");
            accountTwo = new CheckingAccount("Felipe",200,"2");
        }
   
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("saldo:"+b.accountOne.getBalance());
        System.out.println("nombre:"+b.accountOne.getName());
        System.out.println("id:"+b.accountOne.getId());
          
        b.accountOne.setBalance(5000);
        System.out.println(b.accountOne.getBalance());
        b.accountOne.setName("Mauricio");
        System.out.println("nombre:"+b.accountOne.getName());
        b.accountOne.setId("15");
        System.out.println("id:"+b.accountTwo.getId());
        
        System.out.println("saldo:"+b.accountTwo.getBalance());
        System.out.println("nombre:"+b.accountTwo.getName());
        System.out.println("id:"+b.accountTwo.getId());
        
        b.accountOne.setBalance(67);
        System.out.println("saldo:"+b.accountOne.getBalance());
        b.accountOne.setName("Nicolas");
        System.out.println("nombre:"+b.accountOne.getName());
        b.accountOne.setId("15");
        System.out.println("id:"+b.accountTwo.getId());
    }
    
}
