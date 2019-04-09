public class PigSaveTest{
    public static void main(String[] args){
        PigSave[] save;
        save = new PigSave[3];
        for (int i=0;i<3;i++){
            save[i] = new PigSave();
            save[i].chooseMenu();
            save[i].showName();
            save[i].showTotal();
        }
    }
}