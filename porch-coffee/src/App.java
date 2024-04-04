public class App {
    public static void main(String[] args) throws Exception {
        BassNote[] tests = new BassNote[4];
        String tuning = "EADG";
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < tuning.length(); i++){
                tests[i] = new BassNote(tuning.substring(i, i+1), (int)(Math.random()*12));
                System.out.println(tests[i]);
            }
        }
    }
}
