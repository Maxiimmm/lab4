public class Bird extends Creature implements Flying {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String getFly() {
        return "flitter";
    }

    public void fly()
    {
        changePlace(Place.UNDER_THE_VERY_CEILING);
        System.out.println(getName() + ' ' + getFly() + ' ' + getPlace());
    }
    public void huntSpider(Animal animal){
        System.out.println(getName()+" hunting for "+animal.getName());
    }

}



