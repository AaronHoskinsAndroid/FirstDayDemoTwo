package examples.aaronhoskins.com.firstdaydemo;


public class Animal {
    //Member Variables
    private int mHeartBeatRate;
    private String mSpeicesName;
    private boolean mIsAlive;
    private int age;
    //Encapsulation
        //Narrow down access as much as possible
        //Possible Access Modifiers
        //Private - Only accessible within the class or object declared in
        //Public - Globally accessible throughout project
        //Protected - Accessible only with the package declared in
        //Default

    public Animal() {

    }

    public Animal(int mHeartBeatRate, String mSpeicesName, boolean mIsAlive) {
        this.mHeartBeatRate = mHeartBeatRate;
        this.mSpeicesName = mSpeicesName;
        this.mIsAlive = mIsAlive;
    }

    public int getmHeartBeatRate() {
        return mHeartBeatRate;
    }

    public void setmHeartBeatRate(int mHeartBeatRate) {
        this.mHeartBeatRate = mHeartBeatRate;
    }

    public String getmSpeicesName() {
        return mSpeicesName;
    }

    public void setmSpeicesName(String mSpeicesName) {
        this.mSpeicesName = mSpeicesName;
    }

    public boolean ismIsAlive() {
        return mIsAlive;
    }

    public void setmIsAlive(boolean mIsAlive) {
        this.mIsAlive = mIsAlive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
