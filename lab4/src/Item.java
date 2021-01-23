public class Item {
    private final String name;
    private String longname="";

    public Item(String name,Adjective ... adjectives){
        this.name = name;
        longname="";
        for (Adjective adjective : adjectives) {
            longname = longname+adjective.toString()+' ';
        }
        longname+=getName();
    }

    public String getName() {
        return name;
    }

    public String getLongname() {
        return longname;
    }
}
