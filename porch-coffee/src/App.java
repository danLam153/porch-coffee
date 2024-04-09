import java.util.Scanner;

public class App {
    public static void bassNoteTest(){
        BassNote[] tests = new BassNote[4];
        String tuning = "EADG";
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < tuning.length(); i++){
                tests[i] = new BassNote(tuning.substring(i, i+1), (int)(Math.random()*12));
                System.out.println(tests[i]);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        //bassNoteTest();
        Scanner scan = new Scanner(System.in);
        BassNote note = new BassNote();
        NoteQuestion q = new NoteQuestion(note);
        System.out.println(q.prompt());
        if(q.respond(scan.nextLine())){
            System.out.println("correct!");
        } else{
            System.out.println("wrong! " + q.getA());
        }

    }
}
