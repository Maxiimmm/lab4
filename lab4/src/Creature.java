import java.util.Objects;

public abstract class Creature implements TakingPlace {
    private String name;
    private Place place;

    public Creature(String name) {
        if(name.length()==0) {
            System.out.println("name is void");
        }
        else {
            this.name = name;
        }
    }
    public Creature(String name,Place place){
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changePlace(Place place) {
        this.place = place;

    }

    @Override
    public Place getPlace() {
        return place;
    }

    public int hashCode() {
        return Objects.hash(name, place);
    }

    public String toString() {
        return "Creature{" +
                "name=" + name +
                ",place='" + place +'}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature that = (Creature) o;
        return name == that.getName();
    }

}

