public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        level = lv;
		if(level < 16) id = 1;
		else if(level < 32) id = 2;
		else id = 3;
    }

    // getLevel method
    public int getLevel() {
        return level;
    }

    // getName method
    public String getName() {
        if(id == 2) return "Ivysaur";
		if(id == 3) return "Venusaur";
		return "Bulbasaur";
    }

    // getID method
    public int getID() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        return "Level: " + id + ", ID: " + level;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Bulbasaur)) return false;
        Bulbasaur other = (Bulbasaur)obj;
        return id == other.id && level == other.level;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur copy = new Bulbasaur();
		copy.id = id;
		copy.level = level;
		return copy;
    }
}