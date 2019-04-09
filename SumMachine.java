public class SumMachine {
    public void makeSum(int start,int end){
        int sum =0;
        if (end<start) {
            System.out.println("Error! Start value is bigger than End value!");
        }
        else{
            for(int i=start;i<=end;i++){
                sum+=i;
            }
            System.out.println("Start: "+start+", End: "+end+", Sum: "+sum);
        }
    }
    public static void main(String[] args) {
        SumMachine m = new SumMachine();
        m.makeSum(1,100);
    }
}