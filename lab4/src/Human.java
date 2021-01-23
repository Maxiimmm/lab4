public class Human extends Creature{
    private Head head;
    public Human(String name) {
        super(name);
    }
    public Human(String name, Head head) {
        super(name);
        this.head = head;
    }
    public Head getHead() {
        return head;
    }


    public void noticed(Adverb adverb) {
        System.out.println(adverb.toString() + ' ' + getName() + " noticed, that ");
    }
    public void worry(Adjective adjective){
        System.out.println(getName()+" came to "+adjective.toString()+" worry");
    }
    public void forgotFear(Human human){
        System.out.println(getName()+" forgot fear up to "+human.getName());
    }
    public void huddleAt(Place place){
        System.out.println(getName()+" huddled at the "+place.toString());
    }
}
