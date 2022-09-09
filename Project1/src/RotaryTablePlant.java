import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryTablePlant extends ClockDomain{
  public RotaryTablePlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal RTPutBottleAt2 = new Signal("RTPutBottleAt2", Signal.OUTPUT);
  public Signal RTPutBottleAt3 = new Signal("RTPutBottleAt3", Signal.OUTPUT);
  public Signal RTPutBottleAt4 = new Signal("RTPutBottleAt4", Signal.OUTPUT);
  public Signal RTPutBottleAt5 = new Signal("RTPutBottleAt5", Signal.OUTPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.OUTPUT);
  public Signal rotaryTableTriggerE = new Signal("rotaryTableTriggerE", Signal.OUTPUT);
  private int bottlePosition_thread_2;//sysj\RotaryTable\RotaryTablePlant.sysj line: 9, column: 3
  private int S2430 = 1;
  private int S2420 = 1;
  private int S1983 = 1;
  private int S1898 = 1;
  private int S2428 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread2436(int [] tdone, int [] ends){
        switch(S2428){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 23
          rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 43
          currsigs.addElement(rotaryTableTriggerE);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread2435(int [] tdone, int [] ends){
        switch(S2420){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1983){
          case 0 : 
            switch(S1898){
              case 0 : 
                if(!rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 13, column: 12
                  bottlePosition_thread_2 = bottlePosition_thread_2 + 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 14, column: 5
                  if(bottlePosition_thread_2 == 2){//sysj\RotaryTable\RotaryTablePlant.sysj line: 15, column: 8
                    System.out.println("RT2");//sysj\RotaryTable\RotaryTablePlant.sysj line: 16, column: 6
                    RTPutBottleAt2.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 17, column: 6
                    currsigs.addElement(RTPutBottleAt2);
                    S1898=1;
                    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                    currsigs.addElement(tableAlignedWithSensor);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(bottlePosition_thread_2 == 3){//sysj\RotaryTable\RotaryTablePlant.sysj line: 18, column: 14
                      System.out.println("RT3");//sysj\RotaryTable\RotaryTablePlant.sysj line: 19, column: 6
                      RTPutBottleAt3.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 20, column: 6
                      currsigs.addElement(RTPutBottleAt3);
                      S1898=1;
                      tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                      currsigs.addElement(tableAlignedWithSensor);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(bottlePosition_thread_2 == 4){//sysj\RotaryTable\RotaryTablePlant.sysj line: 21, column: 14
                        System.out.println("RT4");//sysj\RotaryTable\RotaryTablePlant.sysj line: 22, column: 6
                        RTPutBottleAt4.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 23, column: 6
                        currsigs.addElement(RTPutBottleAt4);
                        S1898=1;
                        tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                        currsigs.addElement(tableAlignedWithSensor);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(bottlePosition_thread_2 == 5){//sysj\RotaryTable\RotaryTablePlant.sysj line: 24, column: 14
                          System.out.println("RT5");//sysj\RotaryTable\RotaryTablePlant.sysj line: 25, column: 6
                          bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 26, column: 6
                          RTPutBottleAt5.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 27, column: 6
                          currsigs.addElement(RTPutBottleAt5);
                          S1898=1;
                          tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S1898=1;
                          tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                          currsigs.addElement(tableAlignedWithSensor);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 29, column: 11
                  S1983=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                  currsigs.addElement(tableAlignedWithSensor);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1983=1;
            tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
            currsigs.addElement(tableAlignedWithSensor);
            S1983=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
              S1898=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1983=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2433(int [] tdone, int [] ends){
        S2428=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 23
      rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 43
      currsigs.addElement(rotaryTableTriggerE);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2432(int [] tdone, int [] ends){
        S2420=1;
    bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 9, column: 3
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
    currsigs.addElement(tableAlignedWithSensor);
    S1983=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
      S1898=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S1983=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2430){
        case 0 : 
          S2430=0;
          break RUN;
        
        case 1 : 
          S2430=2;
          S2430=2;
          thread2432(tdone,ends);
          thread2433(tdone,ends);
          int biggest2434 = 0;
          if(ends[2]>=biggest2434){
            biggest2434=ends[2];
          }
          if(ends[3]>=biggest2434){
            biggest2434=ends[3];
          }
          if(biggest2434 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2435(tdone,ends);
          thread2436(tdone,ends);
          int biggest2437 = 0;
          if(ends[2]>=biggest2437){
            biggest2437=ends[2];
          }
          if(ends[3]>=biggest2437){
            biggest2437=ends[3];
          }
          if(biggest2437 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2437 == 0){
            S2430=0;
            active[1]=0;
            ends[1]=0;
            S2430=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          rotaryTableTrigger.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      tableAlignedWithSensor.setpreclear();
      RTPutBottleAt2.setpreclear();
      RTPutBottleAt3.setpreclear();
      RTPutBottleAt4.setpreclear();
      RTPutBottleAt5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTriggerE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      RTPutBottleAt2.sethook();
      RTPutBottleAt2.setClear();
      RTPutBottleAt3.sethook();
      RTPutBottleAt3.setClear();
      RTPutBottleAt4.sethook();
      RTPutBottleAt4.setClear();
      RTPutBottleAt5.sethook();
      RTPutBottleAt5.setClear();
      capOnBottleAtPos1.sethook();
      capOnBottleAtPos1.setClear();
      rotaryTableTriggerE.sethook();
      rotaryTableTriggerE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
