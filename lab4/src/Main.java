
public class Main {
    public static void main(String[] args) {
        Item cheese = new Item("cheese");
        Emma.get().lookTo(cheese);
        Emma.get().take(cheese);

        View.setOwner(Emma.get());
        View.wander(Place.TABLE);
        View.focuse(new Item("pancake"));


        class He extends  Human{
            private final Paw paw=new Paw("paw");

            public He(String name) {
                super(name);
            }

            public Paw getPaw() {
                return paw;
            }

            class Paw{
                private final Animal fish = new Animal("fish");
                private String name;

                public Paw(String name){
                    this.name=name;
                }

                public Animal getFish() {
                    return fish;
                }
            }
        }
        He he = new He("his");
        Emma.get().snatchedFrom(he, he.getPaw().getFish());

        Emma.get().getHead().setHighOriented(true);
        Emma.get().getHead().raise();
        Emma.get().changePlace(Place.CORNER);
        Emma.get().shuffled(Adverb.OWN);


        Emma.get().thundered(Adverb.ALONG_WHILE);
        Emma.get().toSweep(Adverb.FINALLY,Adverb.DILIGENTLY);


        Smell smell = new Smell() {
            @Override
            public void filledIn(Place place, Adverb adverb,Adjective adjective) {
                Item rowan = new Item("rowan",Adjective.BLOOMING);
                System.out.print(adverb + " "+ adjective + " smell of ");
                System.out.println(rowan.getLongname()+" filled in the "+place.toString());
            }
        };
        smell.filledIn(Place.HALL, Adverb.IN_THE_EVENING,Adjective.SHARP);


        for (int i = 0; i < (int)(Math.random() * 3+3); i++) {
            Bird bird = new Bird("bird");
            Animal spider = new Animal("spider");
            bird.fly();
            bird.huntSpider(spider);
        }


        Mumla mu = new Mumla("baby mumla",new Head("head"));
        Animal ant = new Animal("Ant",Adjective.SCARY,Adjective.BIG);
        mu.meet(Place.HALL,ant);


        mu.noticed(Adverb.ONLY_NOW);
        Emma.get().noticed(Adverb.ONLY_NOW);
        Theater theater = new Theater("theater");

        theater.changePlace(Place.FOREST);
        try {
            theater.floated(Adverb.ALREADY);
        } catch (PlaceException e){
            e.printStackTrace();
        }

        mu.worry(Adjective.POWERFUL);
        Emma.get().worry(Adjective.POWERFUL);

        mu.forgotFear(Emma.get());
        he.forgotFear(Emma.get());
        mu.huddleAt(Place.WATERS_EDGE);
        he.huddleAt(Place.WATERS_EDGE);
    }


    static class View{
        private static Human owner;

        public static void setOwner(Human owner) throws HeadException {
            if(owner.getHead()==null){
                throw new HeadException();
            }
            View.owner = owner;
        }

        public static Creature getOwner() {
            return owner;
        }

        public static void wander(Place place){
            System.out.println(getOwner().getName()+"'s view wandered over the "+place.toString());
        }

        public static void focuse(Item item) {
            System.out.println(getOwner().getName()+" view focused on "+item.getName());
        }
    }
}
