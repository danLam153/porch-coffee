public class NoteQuestion extends Question {
    public NoteQuestion(BassNote bn){
        super(bn.getOpenString() + " string " + bn.getFret() + " fret", bn.getNote());
    }

    @Override
    public String prompt(){
        return getQ();
    }

    @Override
    public boolean respond(String r){
        super.respond(r);
        int idx = getA().indexOf("/");
        String opt1 = "";
        String opt2 = "";
        if(idx != -1){
            opt1 = getA().substring(0, idx);
            opt2 = getA().substring(idx+1);
        }  
        return r.equals(getA()) || r.equals(opt1) || r.equals(opt2);
    }

    
}
