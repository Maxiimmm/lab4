public class Animal extends Creature{
    private String longname="";
    public Animal(String name) {
        super(name);
    }

    public Animal(String name, Place place) {
        super(name, place);
    }

    public Animal(String name, Adjective ... adjectives){
        super(name);
        longname=getName();
        for(int i=0;i<adjectives.length;i++){
            longname=' '+adjectives[i].toString();
        }
    }

    public String getLongname() {
        return longname;
    }
}
