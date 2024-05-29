package day2.Excercises.EX3;

public class TestAccount {
    public static void main(String[] args) {
        var a1 = new Account("joud",500);
        var aw = new Account("Shouq",1000);


        System.out.println("acount owner: "+a1.name);

        System.out.println("current acount balance: "+a1.getBalance());


        System.out.println("after depost: ");
        a1.depost(20);
        System.out.println(a1.getBalance()+"\n----------------");

        System.out.println("month rate: "+ a1.getMonthRate()+" \n----------------");
        System.out.println("month Int: "+a1.getMonthInt()+"\n----------------");


        System.out.println("after withdraw: ");
        a1.withdraw(100);
        System.out.println(a1.getBalance()+"\n----------------");



    }
}
