package ru.itis;


abstract class Transport {
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {

        return wheelsCount ;
    }

    private int wheelsCount;

    public  Transport (int wheelsCount){
        this.wheelsCount = wheelsCount;
    }
    public  abstract void go();

    public String toString() {
        return "Transport wheelsCount" + wheelsCount ;
    }
}
