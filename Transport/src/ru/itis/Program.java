package ru.itis;


public class Program {
    public static void main(String[] args){
        Auto auto = new Auto(4,95);
        SportAuto sportAuto = new SportAuto(4,95);
        Bike bike = new Bike(2);
        int maxIndex=1;

        Transport transports[]={auto, sportAuto,bike};
        Transport wheelsCount []= {};
        for (int i=0;i<transports.length;i++){
            //восходящее приведение UpCasting
            Transport currentTransport = transports[i];
            currentTransport.go();

          for (int j=0;j<wheelsCount.length;j++)
          {
            // if (wheelsCount[maxIndex] < wheelsCount[j])
                  maxIndex = j;
              System.out.println(wheelsCount);
          }
    }




}}
