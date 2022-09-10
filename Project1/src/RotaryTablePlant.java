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
  private int S4254 = 1;
  private int S4244 = 1;
  private int S2287 = 1;
  private int S1898 = 1;
  private int S1994 = 1;
  private int S1903 = 1;
  private int S1908 = 1;
  private int S1993 = 1;
  private int S1926 = 1;
  private int S1931 = 1;
  private int S1992 = 1;
  private int S1949 = 1;
  private int S1954 = 1;
  private int S1973 = 1;
  private int S1978 = 1;
  private int S4252 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread4284(int [] tdone, int [] ends){
        switch(S4252){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 51, column: 23
          rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 51, column: 43
          currsigs.addElement(rotaryTableTriggerE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread4282(int [] tdone, int [] ends){
        switch(S1978){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 42, column: 8
        currsigs.addElement(tableAlignedWithSensor);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread4281(int [] tdone, int [] ends){
        switch(S1973){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        RTPutBottleAt5.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 40, column: 8
        currsigs.addElement(RTPutBottleAt5);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread4279(int [] tdone, int [] ends){
        switch(S1954){
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

  public void thread4278(int [] tdone, int [] ends){
        switch(S1949){
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

  public void thread4276(int [] tdone, int [] ends){
        switch(S1931){
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

  public void thread4275(int [] tdone, int [] ends){
        switch(S1926){
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

  public void thread4273(int [] tdone, int [] ends){
        switch(S1908){
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

  public void thread4272(int [] tdone, int [] ends){
        switch(S1903){
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

  public void thread4270(int [] tdone, int [] ends){
        S1978=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 42, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread4269(int [] tdone, int [] ends){
        S1973=1;
    RTPutBottleAt5.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 40, column: 8
    currsigs.addElement(RTPutBottleAt5);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread4267(int [] tdone, int [] ends){
        S1954=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 34, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread4266(int [] tdone, int [] ends){
        S1949=1;
    RTPutBottleAt4.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 32, column: 8
    currsigs.addElement(RTPutBottleAt4);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread4264(int [] tdone, int [] ends){
        S1931=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 27, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread4263(int [] tdone, int [] ends){
        S1926=1;
    RTPutBottleAt3.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 25, column: 8
    currsigs.addElement(RTPutBottleAt3);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread4261(int [] tdone, int [] ends){
        S1908=1;
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 20, column: 8
    currsigs.addElement(tableAlignedWithSensor);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread4260(int [] tdone, int [] ends){
        S1903=1;
    RTPutBottleAt2.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 18, column: 8
    currsigs.addElement(RTPutBottleAt2);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4259(int [] tdone, int [] ends){
        switch(S4244){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2287){
          case 0 : 
            switch(S1898){
              case 0 : 
                if(!rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 13, column: 12
                  bottlePosition_thread_2 = bottlePosition_thread_2 + 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 14, column: 5
                  S1898=1;
                  if(bottlePosition_thread_2 == 2){//sysj\RotaryTable\RotaryTablePlant.sysj line: 15, column: 8
                    S1994=0;
                    System.out.println("RT2");//sysj\RotaryTable\RotaryTablePlant.sysj line: 16, column: 6
                    thread4260(tdone,ends);
                    thread4261(tdone,ends);
                    int biggest4262 = 0;
                    if(ends[3]>=biggest4262){
                      biggest4262=ends[3];
                    }
                    if(ends[4]>=biggest4262){
                      biggest4262=ends[4];
                    }
                    if(biggest4262 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S1994=1;
                    if(bottlePosition_thread_2 == 3){//sysj\RotaryTable\RotaryTablePlant.sysj line: 22, column: 14
                      S1993=0;
                      System.out.println("RT3");//sysj\RotaryTable\RotaryTablePlant.sysj line: 23, column: 6
                      thread4263(tdone,ends);
                      thread4264(tdone,ends);
                      int biggest4265 = 0;
                      if(ends[5]>=biggest4265){
                        biggest4265=ends[5];
                      }
                      if(ends[6]>=biggest4265){
                        biggest4265=ends[6];
                      }
                      if(biggest4265 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S1993=1;
                      if(bottlePosition_thread_2 == 4){//sysj\RotaryTable\RotaryTablePlant.sysj line: 29, column: 14
                        S1992=0;
                        System.out.println("RT4");//sysj\RotaryTable\RotaryTablePlant.sysj line: 30, column: 6
                        thread4266(tdone,ends);
                        thread4267(tdone,ends);
                        int biggest4268 = 0;
                        if(ends[7]>=biggest4268){
                          biggest4268=ends[7];
                        }
                        if(ends[8]>=biggest4268){
                          biggest4268=ends[8];
                        }
                        if(biggest4268 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S1992=1;
                        if(bottlePosition_thread_2 == 5){//sysj\RotaryTable\RotaryTablePlant.sysj line: 36, column: 14
                          System.out.println("RT5");//sysj\RotaryTable\RotaryTablePlant.sysj line: 37, column: 6
                          bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 38, column: 6
                          thread4269(tdone,ends);
                          thread4270(tdone,ends);
                          int biggest4271 = 0;
                          if(ends[9]>=biggest4271){
                            biggest4271=ends[9];
                          }
                          if(ends[10]>=biggest4271){
                            biggest4271=ends[10];
                          }
                          if(biggest4271 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          S2287=1;
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
                switch(S1994){
                  case 0 : 
                    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 17, column: 12
                      S2287=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      thread4272(tdone,ends);
                      thread4273(tdone,ends);
                      int biggest4274 = 0;
                      if(ends[3]>=biggest4274){
                        biggest4274=ends[3];
                      }
                      if(ends[4]>=biggest4274){
                        biggest4274=ends[4];
                      }
                      if(biggest4274 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest4274 == 0){
                        S2287=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                  case 1 : 
                    switch(S1993){
                      case 0 : 
                        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 24, column: 12
                          S2287=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          thread4275(tdone,ends);
                          thread4276(tdone,ends);
                          int biggest4277 = 0;
                          if(ends[5]>=biggest4277){
                            biggest4277=ends[5];
                          }
                          if(ends[6]>=biggest4277){
                            biggest4277=ends[6];
                          }
                          if(biggest4277 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          //FINXME code
                          if(biggest4277 == 0){
                            S2287=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        break;
                      
                      case 1 : 
                        switch(S1992){
                          case 0 : 
                            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 31, column: 12
                              S2287=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              thread4278(tdone,ends);
                              thread4279(tdone,ends);
                              int biggest4280 = 0;
                              if(ends[7]>=biggest4280){
                                biggest4280=ends[7];
                              }
                              if(ends[8]>=biggest4280){
                                biggest4280=ends[8];
                              }
                              if(biggest4280 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              //FINXME code
                              if(biggest4280 == 0){
                                S2287=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            break;
                          
                          case 1 : 
                            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 39, column: 12
                              S2287=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              thread4281(tdone,ends);
                              thread4282(tdone,ends);
                              int biggest4283 = 0;
                              if(ends[9]>=biggest4283){
                                biggest4283=ends[9];
                              }
                              if(ends[10]>=biggest4283){
                                biggest4283=ends[10];
                              }
                              if(biggest4283 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              //FINXME code
                              if(biggest4283 == 0){
                                S2287=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
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
            S2287=1;
            tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
            currsigs.addElement(tableAlignedWithSensor);
            S2287=0;
            if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
              S1898=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2287=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread4257(int [] tdone, int [] ends){
        S4252=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 51, column: 23
      rotaryTableTriggerE.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 51, column: 43
      currsigs.addElement(rotaryTableTriggerE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread4256(int [] tdone, int [] ends){
        S4244=1;
    bottlePosition_thread_2 = 1;//sysj\RotaryTable\RotaryTablePlant.sysj line: 9, column: 3
    tableAlignedWithSensor.setPresent();//sysj\RotaryTable\RotaryTablePlant.sysj line: 11, column: 4
    currsigs.addElement(tableAlignedWithSensor);
    S2287=0;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTablePlant.sysj line: 12, column: 12
      S1898=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2287=1;
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
      switch(S4254){
        case 0 : 
          S4254=0;
          break RUN;
        
        case 1 : 
          S4254=2;
          S4254=2;
          thread4256(tdone,ends);
          thread4257(tdone,ends);
          int biggest4258 = 0;
          if(ends[2]>=biggest4258){
            biggest4258=ends[2];
          }
          if(ends[11]>=biggest4258){
            biggest4258=ends[11];
          }
          if(biggest4258 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread4259(tdone,ends);
          thread4284(tdone,ends);
          int biggest4285 = 0;
          if(ends[2]>=biggest4285){
            biggest4285=ends[2];
          }
          if(ends[11]>=biggest4285){
            biggest4285=ends[11];
          }
          if(biggest4285 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest4285 == 0){
            S4254=0;
            active[1]=0;
            ends[1]=0;
            S4254=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
