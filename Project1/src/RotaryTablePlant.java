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
  private int S2523 = 1;
  private int S2513 = 1;
  private int S956 = 1;
  private int S647 = 1;
  private int S723 = 1;
  private int S652 = 1;
  private int S657 = 1;
  private int S722 = 1;
  private int S675 = 1;
  private int S680 = 1;
  private int S721 = 1;
  private int S698 = 1;
  private int S703 = 1;
  private int S2521 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread2547(int [] tdone, int [] ends){
        switch(S2521){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 54, column: 23
          rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 54, column: 43
          currsigs.addElement(rotaryTableTriggerE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread2545(int [] tdone, int [] ends){
        switch(S703){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 34, column: 8
        currsigs.addElement(tableAlignedWithSensor);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread2544(int [] tdone, int [] ends){
        switch(S698){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        RTPutBottleAt4.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 32, column: 8
        currsigs.addElement(RTPutBottleAt4);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread2542(int [] tdone, int [] ends){
        switch(S680){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 27, column: 8
        currsigs.addElement(tableAlignedWithSensor);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread2541(int [] tdone, int [] ends){
        switch(S675){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        RTPutBottleAt3.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 25, column: 8
        currsigs.addElement(RTPutBottleAt3);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread2539(int [] tdone, int [] ends){
        switch(S657){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 20, column: 8
        currsigs.addElement(tableAlignedWithSensor);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread2538(int [] tdone, int [] ends){
        switch(S652){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        RTPutBottleAt2.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 18, column: 8
        currsigs.addElement(RTPutBottleAt2);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread2536(int [] tdone, int [] ends){
        S703=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 34, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread2535(int [] tdone, int [] ends){
        S698=1;
    RTPutBottleAt4.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 32, column: 8
    currsigs.addElement(RTPutBottleAt4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2533(int [] tdone, int [] ends){
        S680=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 27, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2532(int [] tdone, int [] ends){
        S675=1;
    RTPutBottleAt3.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 25, column: 8
    currsigs.addElement(RTPutBottleAt3);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2530(int [] tdone, int [] ends){
        S657=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 20, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2529(int [] tdone, int [] ends){
        S652=1;
    RTPutBottleAt2.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 18, column: 8
    currsigs.addElement(RTPutBottleAt2);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2528(int [] tdone, int [] ends){
        switch(S2513){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S956){
          case 0 : 
            switch(S647){
              case 0 : 
                if(!rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 13, column: 12
                  bottlePosition_thread_2 = bottlePosition_thread_2 + 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 14, column: 5
                  S647=1;
                  if(bottlePosition_thread_2 == 2){//sysj\RotaryTable\RotaryTablePlant.sysj line: 15, column: 8
                    S723=0;
                    System.out.println("RT2");//sysj\RotaryTable\RotaryTablePlant.sysj line: 16, column: 6
                    thread2529(tdone,ends);
                    thread2530(tdone,ends);
                    int biggest2531 = 0;
                    if(ends[3]>=biggest2531){
                      biggest2531=ends[3];
                    }
                    if(ends[4]>=biggest2531){
                      biggest2531=ends[4];
                    }
                    if(biggest2531 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S723=1;
                    if(bottlePosition_thread_2 == 3){//sysj\RotaryTable\RotaryTablePlant.sysj line: 22, column: 14
                      S722=0;
                      System.out.println("RT3");//sysj\RotaryTable\RotaryTablePlant.sysj line: 23, column: 6
                      thread2532(tdone,ends);
                      thread2533(tdone,ends);
                      int biggest2534 = 0;
                      if(ends[5]>=biggest2534){
                        biggest2534=ends[5];
                      }
                      if(ends[6]>=biggest2534){
                        biggest2534=ends[6];
                      }
                      if(biggest2534 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S722=1;
                      if(bottlePosition_thread_2 == 4){//sysj\RotaryTable\RotaryTablePlant.sysj line: 29, column: 14
                        S721=0;
                        System.out.println("RT4");//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                        thread2535(tdone,ends);
                        thread2536(tdone,ends);
                        int biggest2537 = 0;
                        if(ends[7]>=biggest2537){
                          biggest2537=ends[7];
                        }
                        if(ends[8]>=biggest2537){
                          biggest2537=ends[8];
                        }
                        if(biggest2537 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S721=1;
                        if(bottlePosition_thread_2 == 5){//sysj\RotaryTable\RotaryTablePlant.sysj line: 36, column: 14
                          System.out.println("RT5");//sysj\RotaryTable\RotaryTablePlant.sysj line: 37, column: 6
                          bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 6
                          RTPutBottleAt5.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 39, column: 6
                          currsigs.addElement(RTPutBottleAt5);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S956=1;
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
                switch(S723){
                  case 0 : 
                    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 17, column: 12
                      S956=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      thread2538(tdone,ends);
                      thread2539(tdone,ends);
                      int biggest2540 = 0;
                      if(ends[3]>=biggest2540){
                        biggest2540=ends[3];
                      }
                      if(ends[4]>=biggest2540){
                        biggest2540=ends[4];
                      }
                      if(biggest2540 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest2540 == 0){
                        S956=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                  case 1 : 
                    switch(S722){
                      case 0 : 
                        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 24, column: 12
                          S956=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          thread2541(tdone,ends);
                          thread2542(tdone,ends);
                          int biggest2543 = 0;
                          if(ends[5]>=biggest2543){
                            biggest2543=ends[5];
                          }
                          if(ends[6]>=biggest2543){
                            biggest2543=ends[6];
                          }
                          if(biggest2543 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          //FINXME code
                          if(biggest2543 == 0){
                            S956=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        break;
                      
                      case 1 : 
                        switch(S721){
                          case 0 : 
                            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 31, column: 12
                              S956=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              thread2544(tdone,ends);
                              thread2545(tdone,ends);
                              int biggest2546 = 0;
                              if(ends[7]>=biggest2546){
                                biggest2546=ends[7];
                              }
                              if(ends[8]>=biggest2546){
                                biggest2546=ends[8];
                              }
                              if(biggest2546 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              //FINXME code
                              if(biggest2546 == 0){
                                S956=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            break;
                          
                          case 1 : 
                            if(!rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 40, column: 12
                              System.out.println("RT5 left");//sysj\RotaryTable\RotaryTablePlant.sysj line: 46, column: 6
                              S956=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            break;
                          
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S956=1;
            tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
            currsigs.addElement(tableAlignedWithSensor);
            S956=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
              S647=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S956=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2526(int [] tdone, int [] ends){
        S2521=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 54, column: 23
      rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 54, column: 43
      currsigs.addElement(rotaryTableTriggerE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2525(int [] tdone, int [] ends){
        S2513=1;
    bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 9, column: 3
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
    currsigs.addElement(tableAlignedWithSensor);
    S956=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
      S647=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S956=1;
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
      switch(S2523){
        case 0 : 
          S2523=0;
          break RUN;
        
        case 1 : 
          S2523=2;
          S2523=2;
          thread2525(tdone,ends);
          thread2526(tdone,ends);
          int biggest2527 = 0;
          if(ends[2]>=biggest2527){
            biggest2527=ends[2];
          }
          if(ends[9]>=biggest2527){
            biggest2527=ends[9];
          }
          if(biggest2527 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2528(tdone,ends);
          thread2547(tdone,ends);
          int biggest2548 = 0;
          if(ends[2]>=biggest2548){
            biggest2548=ends[2];
          }
          if(ends[9]>=biggest2548){
            biggest2548=ends[9];
          }
          if(biggest2548 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2548 == 0){
            S2523=0;
            active[1]=0;
            ends[1]=0;
            S2523=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
