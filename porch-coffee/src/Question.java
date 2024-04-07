import java.util.ArrayList;

public abstract class Question {
    private String q;
    private String a;
    private ArrayList<String> responses;

    public Question(String q, String a){
        this.q = q;
        this.a = a;
        responses = new ArrayList<>();
    }

    public abstract String prompt();

    public String getQ(){
        return q;
    }

    public String getA(){
        return a;
    }

    public boolean respond(String r){
        responses.add(r);
        return r.equals(a);
    }
    
}
