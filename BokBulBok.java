public class BokBulBok {
    private char[] items;

    public int nextIndex=0;

    public void ready(){

        items = new char[10];
        int index = (int)(Math.random() * items.length);
        for(int i=0;i<items.length;i++){
            if(i==index){
                items[i]='X';
            }else{
                items[i]='O';
            }//end if
        }//end for

    }
    public char selectOne(){
        return items[nextIndex++];
    }

    public void printItems(){
        for(int i=0;i<items.length;i++){
            System.out.println((i+1)+" : "+ items[i]);
        }
    }
}