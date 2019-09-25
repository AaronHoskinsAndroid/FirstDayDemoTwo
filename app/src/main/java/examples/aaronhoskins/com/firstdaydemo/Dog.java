package examples.aaronhoskins.com.firstdaydemo;

//extend to inherit JAVA AND KOTLIN ONLY
//ALLOW SINGLE INHERITANCE
public class Dog extends Animal {
    private String colorOfFur;
    private String size;
    private String breed;
    private IDogCallback callback;

    public Dog(int mHeartBeatRate, String mSpeicesName, boolean mIsAlive, String colorOfFur, String size, String breed, IDogCallback callback) {
        super(mHeartBeatRate, mSpeicesName, mIsAlive);
        this.colorOfFur = colorOfFur;
        this.size = size;
        this.breed = breed;
        this.callback = callback;
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public void setColorOfFur(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //polymorphism
    @Override
    public int getAge() {
        return super.getAge() * 7;
    }

    public void generateDogInfo() {
        callback.getDogInfo(this);
    }
}
