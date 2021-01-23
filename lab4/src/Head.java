public class Head {
    private String name;
    boolean highOriented=false;
    public Head(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHighOriented(boolean highOriented) {
        this.highOriented = highOriented;
    }

    public void raise(){
        if (highOriented){
        System.out.println("with head held high");
        }
        else{
            System.out.println("head down ");
        }
    }
}
