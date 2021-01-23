public class Emma extends Human {
    private static Emma emma;
    private Emma() {
        super("Emma", new Head("head"));
    }
    public static Emma get() {
        if (emma == null) {
            emma = new Emma();
        }
        return emma;
    }

    public void snatchedFrom(Creature creature, Animal animal) {
        System.out.println(getName()+" snatched "+animal.getName()+" from "+creature.getName()+" paw");
    }

    public void shuffled(Adverb adverb){
        changePlace(Place.CORNER);
        System.out.println("shuffled " + adverb + ' ' + getPlace() );
    }

    public void thundered(Adverb adverb){
        super.setName("She");
        changePlace(Place.THERE);
        System.out.println( getName()+ ' ' + adverb + " thundered " + getPlace());
    }

    public void toSweep(Adverb adverb,Adverb adverb1){
        Item broom = new Item("broom",Adjective.BIG);
        System.out.println("and " + adverb + " began to sweep " + adverb1 + " with a " + broom.getLongname());
    }

    public void lookTo(Item item){
        System.out.println(getName()+" looking to "+item.getName());
    }

    public void take(Item item){
        System.out.println(getName()+" took "+item.getName()+" and put in the pocket");
    }




}
