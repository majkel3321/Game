

public class Properties {

    private String name;
    private int value;
    private int rent;
    private int hotel;
    private int level = 0;



    public Properties(String name, int value, int rent, int hotel){
        this.name = name;
        this.value = value;
        this.rent = rent;
        this.hotel = hotel;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public int getLevel(){ return level; }

    public int getRent() {
        return rent;
    }

    public int getHotel() {
        return hotel;
    }

    public void addLevel(){
        level++;
        rent *= 2;
    }




    public String toString(){
        return name;
    }
}
