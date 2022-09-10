import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperPlant extends ClockDomain{
  public CapperPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  private int S987 = 1;
  private int S772 = 1;
  private int S750 = 1;
  private int S804 = 1;
  private int S782 = 1;
  private int S923 = 1;
  private int S843 = 1;
  private int S985 = 1;
  private int S943 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread997(int [] tdone, int [] ends){
        switch(S985){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S943){
          case 0 : 
            if(gripperTurnExtend.getprestatus() && !gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 53, column: 27
              S943=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\Capper\CapperPlant.sysj line: 55, column: 21
              currsigs.addElement(gripperTurnHomePos);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S943=1;
            S943=0;
            if(!gripperTurnExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 49, column: 21
              if(gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 51, column: 25
                System.out.println("Untwist: grip turn retract");//sysj\Capper\CapperPlant.sysj line: 52, column: 21
                System.out.println("gripperTurnHomePos");//sysj\Capper\CapperPlant.sysj line: 54, column: 21
                gripperTurnHomePos.setPresent();//sysj\Capper\CapperPlant.sysj line: 55, column: 21
                currsigs.addElement(gripperTurnHomePos);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S943=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              S943=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread996(int [] tdone, int [] ends){
        switch(S923){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S843){
          case 0 : 
            if(!gripperTurnExtend.getprestatus() && gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 36, column: 27
              S843=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\Capper\CapperPlant.sysj line: 38, column: 25
              currsigs.addElement(gripperTurnFinalPos);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S843=1;
            S843=0;
            if(gripperTurnExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 32, column: 21
              System.out.println("Twist: grip turn extend");//sysj\Capper\CapperPlant.sysj line: 33, column: 17
              if(!gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 34, column: 25
                System.out.println("Twist: not grip turn retract");//sysj\Capper\CapperPlant.sysj line: 35, column: 21
                System.out.println("gripperTurnFinalPos");//sysj\Capper\CapperPlant.sysj line: 37, column: 25
                gripperTurnFinalPos.setPresent();//sysj\Capper\CapperPlant.sysj line: 38, column: 25
                currsigs.addElement(gripperTurnFinalPos);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S843=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S843=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread995(int [] tdone, int [] ends){
        switch(S804){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S782){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 21, column: 23
              S782=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\Capper\CapperPlant.sysj line: 23, column: 21
              currsigs.addElement(gripperZAxisLifted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S782=1;
            S782=0;
            if(!cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 20, column: 21
              System.out.println("gripperZAxisLifted");//sysj\Capper\CapperPlant.sysj line: 22, column: 21
              gripperZAxisLifted.setPresent();//sysj\Capper\CapperPlant.sysj line: 23, column: 21
              currsigs.addElement(gripperZAxisLifted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S782=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread994(int [] tdone, int [] ends){
        switch(S772){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S750){
          case 0 : 
            if(!cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 9, column: 23
              S750=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\Capper\CapperPlant.sysj line: 11, column: 21
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S750=1;
            S750=0;
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 8, column: 21
              System.out.println("gripperZAxisLowered");//sysj\Capper\CapperPlant.sysj line: 10, column: 21
              gripperZAxisLowered.setPresent();//sysj\Capper\CapperPlant.sysj line: 11, column: 21
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S750=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread992(int [] tdone, int [] ends){
        S985=1;
    S943=0;
    if(!gripperTurnExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 49, column: 21
      if(gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 51, column: 25
        System.out.println("Untwist: grip turn retract");//sysj\Capper\CapperPlant.sysj line: 52, column: 21
        System.out.println("gripperTurnHomePos");//sysj\Capper\CapperPlant.sysj line: 54, column: 21
        gripperTurnHomePos.setPresent();//sysj\Capper\CapperPlant.sysj line: 55, column: 21
        currsigs.addElement(gripperTurnHomePos);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S943=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
    else {
      S943=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread991(int [] tdone, int [] ends){
        S923=1;
    S843=0;
    if(gripperTurnExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 32, column: 21
      System.out.println("Twist: grip turn extend");//sysj\Capper\CapperPlant.sysj line: 33, column: 17
      if(!gripperTurnRetract.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 34, column: 25
        System.out.println("Twist: not grip turn retract");//sysj\Capper\CapperPlant.sysj line: 35, column: 21
        System.out.println("gripperTurnFinalPos");//sysj\Capper\CapperPlant.sysj line: 37, column: 25
        gripperTurnFinalPos.setPresent();//sysj\Capper\CapperPlant.sysj line: 38, column: 25
        currsigs.addElement(gripperTurnFinalPos);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S843=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S843=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread990(int [] tdone, int [] ends){
        S804=1;
    S782=0;
    if(!cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 20, column: 21
      System.out.println("gripperZAxisLifted");//sysj\Capper\CapperPlant.sysj line: 22, column: 21
      gripperZAxisLifted.setPresent();//sysj\Capper\CapperPlant.sysj line: 23, column: 21
      currsigs.addElement(gripperZAxisLifted);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S782=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread989(int [] tdone, int [] ends){
        S772=1;
    S750=0;
    if(cylPos5ZaxisExtend.getprestatus()){//sysj\Capper\CapperPlant.sysj line: 8, column: 21
      System.out.println("gripperZAxisLowered");//sysj\Capper\CapperPlant.sysj line: 10, column: 21
      gripperZAxisLowered.setPresent();//sysj\Capper\CapperPlant.sysj line: 11, column: 21
      currsigs.addElement(gripperZAxisLowered);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S750=1;
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
      switch(S987){
        case 0 : 
          S987=0;
          break RUN;
        
        case 1 : 
          S987=2;
          S987=2;
          thread989(tdone,ends);
          thread990(tdone,ends);
          thread991(tdone,ends);
          thread992(tdone,ends);
          int biggest993 = 0;
          if(ends[2]>=biggest993){
            biggest993=ends[2];
          }
          if(ends[3]>=biggest993){
            biggest993=ends[3];
          }
          if(ends[4]>=biggest993){
            biggest993=ends[4];
          }
          if(ends[5]>=biggest993){
            biggest993=ends[5];
          }
          if(biggest993 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread994(tdone,ends);
          thread995(tdone,ends);
          thread996(tdone,ends);
          thread997(tdone,ends);
          int biggest998 = 0;
          if(ends[2]>=biggest998){
            biggest998=ends[2];
          }
          if(ends[3]>=biggest998){
            biggest998=ends[3];
          }
          if(ends[4]>=biggest998){
            biggest998=ends[4];
          }
          if(ends[5]>=biggest998){
            biggest998=ends[5];
          }
          if(biggest998 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest998 == 0){
            S987=0;
            active[1]=0;
            ends[1]=0;
            S987=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
