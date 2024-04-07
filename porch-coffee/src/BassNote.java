public class BassNote {
    private String openString;
    private int fret;
    private String note;
    
    public BassNote(String op, int fr){
        openString = op;
        fret = fr;
        note = calcNote();
    }

    private String calcNote(){
        String[] notes = {"A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab"};
        int idx = 0;
        for(;idx < notes.length; idx++){
            if(openString.equals(notes[idx])) break;
        }
        return notes[(idx + fret) % notes.length];
    }

    @Override
    public String toString(){
        return fret + " fret " + openString + " string: " + note;
    }

    public String getOpenString(){
        return openString;
    }

    public int getFret(){
        return fret;
    }

    public String getNote(){
        return note;
    }
}
