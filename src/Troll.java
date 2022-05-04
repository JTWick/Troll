public class Troll {
    String name;
    int userLevel;
    int trollLevel;
    boolean dangerous;
    typeOfAttack type;

    enum typeOfAttack {
        CHARGE,
        POISON,
        STAB
    }

    public Troll(String name, int userLevel, int trollLevel, typeOfAttack type) {
        this.name = name;
        this.userLevel = userLevel;
        this.trollLevel = trollLevel;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public int getTrollLevel() {
        return trollLevel;
    }

    public void setTrollLevel(int trollLevel) {
        this.trollLevel = trollLevel;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public typeOfAttack getType() {
        return type;
    }

    public void setType(typeOfAttack type) {
        this.type = type;
    }

    public boolean dangerous () {
        return trollLevel > userLevel;
    }

}
