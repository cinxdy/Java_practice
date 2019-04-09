import java.util.Scanner;

public class PigSave{
    private int total;
    private String name;
    
    public int getTotal(){
        return total;
    }

    public void setName(){
        System.out.println("이름을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
    }

    public void deposit(){
        System.out.println("입금하실 금액을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(amount+"원 입금하였습니다.");
        total+=amount;
        showTotal();
    }

    public void withDraw(){
        System.out.println("출금하실 금액을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(amount+"원 출금하였습니다.");
        total-=amount;
        showTotal();
    }

    public void withDrawAll(){
        System.out.println("전액 출금하였습니다.");
        total=0;
        showTotal();
    }

    public void showTotal(){
        System.out.println("잔액은 "+total+"원 입니다.");
    }
    public void showName(){
        System.out.println("이름은 "+name+"입니다.");
    }

    public void chooseMenu(){
        setName();
        while(true){
            System.out.println("업무를 선택하세요");
            System.out.println("1) 입금 2) 출금 3) 잔액 확인 4) 끝내기");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if(num==1) deposit();
            else if (num==2) withDraw();
            else if(num==3) showTotal();
            else if(num==4) break;
            else System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
        }
    }

}

