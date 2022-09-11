import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryTableController extends ClockDomain{
  public RotaryTableController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos1RT = new Signal("bottleAtPos1RT", Signal.INPUT);
  public Signal bottleAtPos2RT = new Signal("bottleAtPos2RT", Signal.INPUT);
  public Signal bottleAtPos3RT = new Signal("bottleAtPos3RT", Signal.INPUT);
  public Signal bottleAtPos4RT = new Signal("bottleAtPos4RT", Signal.INPUT);
  public Signal bottleAtPos5RT = new Signal("bottleAtPos5RT", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal doneAtPos2 = new Signal("doneAtPos2", Signal.INPUT);
  public Signal doneAtPos3 = new Signal("doneAtPos3", Signal.INPUT);
  public Signal doneAtPos4 = new Signal("doneAtPos4", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal rotaryTableTriggerCV = new Signal("rotaryTableTriggerCV", Signal.OUTPUT);
  private long __start_thread_4;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
  private long __start_thread_6;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
  private long __start_thread_8;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
  private long __start_thread_10;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
  private int S614 = 1;
  private int S604 = 1;
  private int S47 = 1;
  private int S5 = 1;
  private int S21 = 1;
  private int S7 = 1;
  private int S57 = 1;
  private int S73 = 1;
  private int S108 = 1;
  private int S124 = 1;
  private int S159 = 1;
  private int S175 = 1;
  private int S612 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread644(int [] tdone, int [] ends){
        switch(S612){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 39, column: 24
          rotaryTableTriggerCV.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 39, column: 44
          currsigs.addElement(rotaryTableTriggerCV);
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

  public void thread642(int [] tdone, int [] ends){
        switch(S175){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
          ends[10]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
          ends[10]=2;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread641(int [] tdone, int [] ends){
        switch(S159){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread639(int [] tdone, int [] ends){
        S175=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread638(int [] tdone, int [] ends){
        S159=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread636(int [] tdone, int [] ends){
        switch(S124){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
          ends[8]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
          ends[8]=2;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread635(int [] tdone, int [] ends){
        switch(S108){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread633(int [] tdone, int [] ends){
        S124=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread632(int [] tdone, int [] ends){
        S108=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread630(int [] tdone, int [] ends){
        switch(S73){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
          ends[6]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
          ends[6]=2;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread629(int [] tdone, int [] ends){
        switch(S57){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread627(int [] tdone, int [] ends){
        S73=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=2;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread626(int [] tdone, int [] ends){
        S57=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread624(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7){
          case 0 : 
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=3;
              ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S7=1;
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=3;
              ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread623(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread621(int [] tdone, int [] ends){
        S21=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
    S7=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
      ends[4]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S7=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread620(int [] tdone, int [] ends){
        S5=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread619(int [] tdone, int [] ends){
        switch(S604){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S47){
          case 0 : 
            if(bottleAtPos1RT.getprestatus() && !capOnBottleAtPos1.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 9, column: 10
              S47=1;
              thread620(tdone,ends);
              thread621(tdone,ends);
              int biggest622 = 0;
              if(ends[3]>=biggest622){
                biggest622=ends[3];
              }
              if(ends[4]>=biggest622){
                biggest622=ends[4];
              }
              if(biggest622 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest622 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 11, column: 5
                S47=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(bottleAtPos2RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 10, column: 10
              S47=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread623(tdone,ends);
              thread624(tdone,ends);
              int biggest625 = 0;
              if(ends[3]>=biggest625){
                biggest625=ends[3];
              }
              if(ends[4]>=biggest625){
                biggest625=ends[4];
              }
              if(biggest625 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest625 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 11, column: 5
                S47=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest625 == 0){
                S47=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 2 : 
            if(doneAtPos2.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 15, column: 10
              S47=3;
              thread626(tdone,ends);
              thread627(tdone,ends);
              int biggest628 = 0;
              if(ends[5]>=biggest628){
                biggest628=ends[5];
              }
              if(ends[6]>=biggest628){
                biggest628=ends[6];
              }
              if(biggest628 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest628 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                S47=4;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(bottleAtPos3RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 16, column: 10
              S47=4;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread629(tdone,ends);
              thread630(tdone,ends);
              int biggest631 = 0;
              if(ends[5]>=biggest631){
                biggest631=ends[5];
              }
              if(ends[6]>=biggest631){
                biggest631=ends[6];
              }
              if(biggest631 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest631 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                S47=4;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest631 == 0){
                S47=4;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 4 : 
            if(doneAtPos3.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 21, column: 10
              S47=5;
              thread632(tdone,ends);
              thread633(tdone,ends);
              int biggest634 = 0;
              if(ends[7]>=biggest634){
                biggest634=ends[7];
              }
              if(ends[8]>=biggest634){
                biggest634=ends[8];
              }
              if(biggest634 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest634 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                S47=6;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(bottleAtPos4RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 22, column: 10
              S47=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread635(tdone,ends);
              thread636(tdone,ends);
              int biggest637 = 0;
              if(ends[7]>=biggest637){
                biggest637=ends[7];
              }
              if(ends[8]>=biggest637){
                biggest637=ends[8];
              }
              if(biggest637 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest637 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                S47=6;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest637 == 0){
                S47=6;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 6 : 
            if(doneAtPos4.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 27, column: 10
              S47=7;
              thread638(tdone,ends);
              thread639(tdone,ends);
              int biggest640 = 0;
              if(ends[9]>=biggest640){
                biggest640=ends[9];
              }
              if(ends[10]>=biggest640){
                biggest640=ends[10];
              }
              if(biggest640 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest640 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                S47=8;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(bottleAtPos5RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 28, column: 10
              S47=8;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread641(tdone,ends);
              thread642(tdone,ends);
              int biggest643 = 0;
              if(ends[9]>=biggest643){
                biggest643=ends[9];
              }
              if(ends[10]>=biggest643){
                biggest643=ends[10];
              }
              if(biggest643 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest643 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                S47=8;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest643 == 0){
                S47=8;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 8 : 
            S47=8;
            S47=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread617(int [] tdone, int [] ends){
        S612=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 39, column: 24
      rotaryTableTriggerCV.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 39, column: 44
      currsigs.addElement(rotaryTableTriggerCV);
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

  public void thread616(int [] tdone, int [] ends){
        S604=1;
    S47=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S614){
        case 0 : 
          S614=0;
          break RUN;
        
        case 1 : 
          S614=2;
          S614=2;
          thread616(tdone,ends);
          thread617(tdone,ends);
          int biggest618 = 0;
          if(ends[2]>=biggest618){
            biggest618=ends[2];
          }
          if(ends[11]>=biggest618){
            biggest618=ends[11];
          }
          if(biggest618 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread619(tdone,ends);
          thread644(tdone,ends);
          int biggest645 = 0;
          if(ends[2]>=biggest645){
            biggest645=ends[2];
          }
          if(ends[11]>=biggest645){
            biggest645=ends[11];
          }
          if(biggest645 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest645 == 0){
            S614=0;
            active[1]=0;
            ends[1]=0;
            S614=0;
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
          tableAlignedWithSensor.gethook();
          bottleAtPos1RT.gethook();
          bottleAtPos2RT.gethook();
          bottleAtPos3RT.gethook();
          bottleAtPos4RT.gethook();
          bottleAtPos5RT.gethook();
          capOnBottleAtPos1.gethook();
          doneAtPos2.gethook();
          doneAtPos3.gethook();
          doneAtPos4.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1RT.setpreclear();
      bottleAtPos2RT.setpreclear();
      bottleAtPos3RT.setpreclear();
      bottleAtPos4RT.setpreclear();
      bottleAtPos5RT.setpreclear();
      capOnBottleAtPos1.setpreclear();
      doneAtPos2.setpreclear();
      doneAtPos3.setpreclear();
      doneAtPos4.setpreclear();
      rotaryTableTrigger.setpreclear();
      rotaryTableTriggerCV.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos1RT.getStatus() ? bottleAtPos1RT.setprepresent() : bottleAtPos1RT.setpreclear();
      bottleAtPos1RT.setpreval(bottleAtPos1RT.getValue());
      bottleAtPos1RT.setClear();
      dummyint = bottleAtPos2RT.getStatus() ? bottleAtPos2RT.setprepresent() : bottleAtPos2RT.setpreclear();
      bottleAtPos2RT.setpreval(bottleAtPos2RT.getValue());
      bottleAtPos2RT.setClear();
      dummyint = bottleAtPos3RT.getStatus() ? bottleAtPos3RT.setprepresent() : bottleAtPos3RT.setpreclear();
      bottleAtPos3RT.setpreval(bottleAtPos3RT.getValue());
      bottleAtPos3RT.setClear();
      dummyint = bottleAtPos4RT.getStatus() ? bottleAtPos4RT.setprepresent() : bottleAtPos4RT.setpreclear();
      bottleAtPos4RT.setpreval(bottleAtPos4RT.getValue());
      bottleAtPos4RT.setClear();
      dummyint = bottleAtPos5RT.getStatus() ? bottleAtPos5RT.setprepresent() : bottleAtPos5RT.setpreclear();
      bottleAtPos5RT.setpreval(bottleAtPos5RT.getValue());
      bottleAtPos5RT.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = doneAtPos2.getStatus() ? doneAtPos2.setprepresent() : doneAtPos2.setpreclear();
      doneAtPos2.setpreval(doneAtPos2.getValue());
      doneAtPos2.setClear();
      dummyint = doneAtPos3.getStatus() ? doneAtPos3.setprepresent() : doneAtPos3.setpreclear();
      doneAtPos3.setpreval(doneAtPos3.getValue());
      doneAtPos3.setClear();
      dummyint = doneAtPos4.getStatus() ? doneAtPos4.setprepresent() : doneAtPos4.setpreclear();
      doneAtPos4.setpreval(doneAtPos4.getValue());
      doneAtPos4.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      rotaryTableTriggerCV.sethook();
      rotaryTableTriggerCV.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos1RT.gethook();
        bottleAtPos2RT.gethook();
        bottleAtPos3RT.gethook();
        bottleAtPos4RT.gethook();
        bottleAtPos5RT.gethook();
        capOnBottleAtPos1.gethook();
        doneAtPos2.gethook();
        doneAtPos3.gethook();
        doneAtPos4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
