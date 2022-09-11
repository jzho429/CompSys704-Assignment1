import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public Signal doneAtPos4 = new Signal("doneAtPos4", Signal.OUTPUT);
  private int S706 = 1;
  private int S2 = 1;
  private int S10 = 1;
  private int S18 = 1;
  private int S44 = 1;
  private int S52 = 1;
  private int S60 = 1;
  private int S68 = 1;
  private int S143 = 1;
  private int S151 = 1;
  private int S159 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread739(int [] tdone, int [] ends){
        switch(S159){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        gripperTurnRetract.setPresent();//sysj\Capper\CapperController.sysj line: 40, column: 13
        currsigs.addElement(gripperTurnRetract);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread738(int [] tdone, int [] ends){
        switch(S151){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 37, column: 13
        currsigs.addElement(cylPos5ZaxisExtend);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread737(int [] tdone, int [] ends){
        switch(S143){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 34, column: 13
        currsigs.addElement(cylClampBottleExtend);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread735(int [] tdone, int [] ends){
        S159=1;
    System.out.println("untwistgrip");//sysj\Capper\CapperController.sysj line: 39, column: 5
    gripperTurnRetract.setPresent();//sysj\Capper\CapperController.sysj line: 40, column: 13
    currsigs.addElement(gripperTurnRetract);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread734(int [] tdone, int [] ends){
        S151=1;
    System.out.println("low grip 3");//sysj\Capper\CapperController.sysj line: 36, column: 5
    cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 37, column: 13
    currsigs.addElement(cylPos5ZaxisExtend);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread733(int [] tdone, int [] ends){
        S143=1;
    System.out.println("clamp3");//sysj\Capper\CapperController.sysj line: 33, column: 5
    cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 34, column: 13
    currsigs.addElement(cylClampBottleExtend);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread731(int [] tdone, int [] ends){
        switch(S68){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\Capper\CapperController.sysj line: 30, column: 13
        currsigs.addElement(gripperTurnExtend);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread730(int [] tdone, int [] ends){
        switch(S60){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\Capper\CapperController.sysj line: 27, column: 13
        currsigs.addElement(capGripperPos5Extend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread729(int [] tdone, int [] ends){
        switch(S52){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 24, column: 17
        currsigs.addElement(cylPos5ZaxisExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread728(int [] tdone, int [] ends){
        switch(S44){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 21, column: 17
        currsigs.addElement(cylClampBottleExtend);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread726(int [] tdone, int [] ends){
        S159=1;
    System.out.println("untwistgrip");//sysj\Capper\CapperController.sysj line: 39, column: 5
    gripperTurnRetract.setPresent();//sysj\Capper\CapperController.sysj line: 40, column: 13
    currsigs.addElement(gripperTurnRetract);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread725(int [] tdone, int [] ends){
        S151=1;
    System.out.println("low grip 3");//sysj\Capper\CapperController.sysj line: 36, column: 5
    cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 37, column: 13
    currsigs.addElement(cylPos5ZaxisExtend);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread724(int [] tdone, int [] ends){
        S143=1;
    System.out.println("clamp3");//sysj\Capper\CapperController.sysj line: 33, column: 5
    cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 34, column: 13
    currsigs.addElement(cylClampBottleExtend);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread722(int [] tdone, int [] ends){
        S68=1;
    System.out.println("twist");//sysj\Capper\CapperController.sysj line: 29, column: 5
    gripperTurnExtend.setPresent();//sysj\Capper\CapperController.sysj line: 30, column: 13
    currsigs.addElement(gripperTurnExtend);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread721(int [] tdone, int [] ends){
        S60=1;
    System.out.println("grip cap");//sysj\Capper\CapperController.sysj line: 26, column: 5
    capGripperPos5Extend.setPresent();//sysj\Capper\CapperController.sysj line: 27, column: 13
    currsigs.addElement(capGripperPos5Extend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread720(int [] tdone, int [] ends){
        S52=1;
    System.out.println("low grip2");//sysj\Capper\CapperController.sysj line: 23, column: 5
    cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 24, column: 17
    currsigs.addElement(cylPos5ZaxisExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread719(int [] tdone, int [] ends){
        S44=1;
    System.out.println("clamp2");//sysj\Capper\CapperController.sysj line: 20, column: 5
    cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 21, column: 17
    currsigs.addElement(cylClampBottleExtend);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread717(int [] tdone, int [] ends){
        switch(S18){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 16, column: 13
        currsigs.addElement(cylPos5ZaxisExtend);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread716(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 12, column: 17
        currsigs.addElement(cylClampBottleExtend);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread714(int [] tdone, int [] ends){
        S68=1;
    System.out.println("twist");//sysj\Capper\CapperController.sysj line: 29, column: 5
    gripperTurnExtend.setPresent();//sysj\Capper\CapperController.sysj line: 30, column: 13
    currsigs.addElement(gripperTurnExtend);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread713(int [] tdone, int [] ends){
        S60=1;
    System.out.println("grip cap");//sysj\Capper\CapperController.sysj line: 26, column: 5
    capGripperPos5Extend.setPresent();//sysj\Capper\CapperController.sysj line: 27, column: 13
    currsigs.addElement(capGripperPos5Extend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread712(int [] tdone, int [] ends){
        S52=1;
    System.out.println("low grip2");//sysj\Capper\CapperController.sysj line: 23, column: 5
    cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 24, column: 17
    currsigs.addElement(cylPos5ZaxisExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread711(int [] tdone, int [] ends){
        S44=1;
    System.out.println("clamp2");//sysj\Capper\CapperController.sysj line: 20, column: 5
    cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 21, column: 17
    currsigs.addElement(cylClampBottleExtend);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread709(int [] tdone, int [] ends){
        S18=1;
    System.out.println("Low grip");//sysj\Capper\CapperController.sysj line: 15, column: 4
    cylPos5ZaxisExtend.setPresent();//sysj\Capper\CapperController.sysj line: 16, column: 13
    currsigs.addElement(cylPos5ZaxisExtend);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread708(int [] tdone, int [] ends){
        S10=1;
    System.out.println("Clamp");//sysj\Capper\CapperController.sysj line: 11, column: 5
    cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 12, column: 17
    currsigs.addElement(cylClampBottleExtend);
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
      switch(S706){
        case 0 : 
          S706=0;
          break RUN;
        
        case 1 : 
          S706=2;
          S706=2;
          S2=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2){
            case 0 : 
              S2=0;
              S2=1;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
            case 1 : 
              if(bottleAtPos4.getprestatus()){//sysj\Capper\CapperController.sysj line: 9, column: 9
                S2=2;
                thread708(tdone,ends);
                thread709(tdone,ends);
                int biggest710 = 0;
                if(ends[2]>=biggest710){
                  biggest710=ends[2];
                }
                if(ends[3]>=biggest710){
                  biggest710=ends[3];
                }
                if(biggest710 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(gripperZAxisLowered.getprestatus()){//sysj\Capper\CapperController.sysj line: 10, column: 9
                S2=3;
                thread711(tdone,ends);
                thread712(tdone,ends);
                thread713(tdone,ends);
                thread714(tdone,ends);
                int biggest715 = 0;
                if(ends[4]>=biggest715){
                  biggest715=ends[4];
                }
                if(ends[5]>=biggest715){
                  biggest715=ends[5];
                }
                if(ends[6]>=biggest715){
                  biggest715=ends[6];
                }
                if(ends[7]>=biggest715){
                  biggest715=ends[7];
                }
                if(biggest715 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread716(tdone,ends);
                thread717(tdone,ends);
                int biggest718 = 0;
                if(ends[2]>=biggest718){
                  biggest718=ends[2];
                }
                if(ends[3]>=biggest718){
                  biggest718=ends[3];
                }
                if(biggest718 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest718 == 0){
                  S2=3;
                  thread719(tdone,ends);
                  thread720(tdone,ends);
                  thread721(tdone,ends);
                  thread722(tdone,ends);
                  int biggest723 = 0;
                  if(ends[4]>=biggest723){
                    biggest723=ends[4];
                  }
                  if(ends[5]>=biggest723){
                    biggest723=ends[5];
                  }
                  if(ends[6]>=biggest723){
                    biggest723=ends[6];
                  }
                  if(ends[7]>=biggest723){
                    biggest723=ends[7];
                  }
                  if(biggest723 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 3 : 
              if(gripperTurnFinalPos.getprestatus()){//sysj\Capper\CapperController.sysj line: 19, column: 9
                S2=4;
                thread724(tdone,ends);
                thread725(tdone,ends);
                thread726(tdone,ends);
                int biggest727 = 0;
                if(ends[8]>=biggest727){
                  biggest727=ends[8];
                }
                if(ends[9]>=biggest727){
                  biggest727=ends[9];
                }
                if(ends[10]>=biggest727){
                  biggest727=ends[10];
                }
                if(biggest727 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                thread728(tdone,ends);
                thread729(tdone,ends);
                thread730(tdone,ends);
                thread731(tdone,ends);
                int biggest732 = 0;
                if(ends[4]>=biggest732){
                  biggest732=ends[4];
                }
                if(ends[5]>=biggest732){
                  biggest732=ends[5];
                }
                if(ends[6]>=biggest732){
                  biggest732=ends[6];
                }
                if(ends[7]>=biggest732){
                  biggest732=ends[7];
                }
                if(biggest732 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest732 == 0){
                  S2=4;
                  thread733(tdone,ends);
                  thread734(tdone,ends);
                  thread735(tdone,ends);
                  int biggest736 = 0;
                  if(ends[8]>=biggest736){
                    biggest736=ends[8];
                  }
                  if(ends[9]>=biggest736){
                    biggest736=ends[9];
                  }
                  if(ends[10]>=biggest736){
                    biggest736=ends[10];
                  }
                  if(biggest736 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 4 : 
              if(gripperTurnHomePos.getprestatus()){//sysj\Capper\CapperController.sysj line: 32, column: 9
                S2=5;
                System.out.println("still clampin");//sysj\Capper\CapperController.sysj line: 43, column: 13
                cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 44, column: 4
                currsigs.addElement(cylClampBottleExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread737(tdone,ends);
                thread738(tdone,ends);
                thread739(tdone,ends);
                int biggest740 = 0;
                if(ends[8]>=biggest740){
                  biggest740=ends[8];
                }
                if(ends[9]>=biggest740){
                  biggest740=ends[9];
                }
                if(ends[10]>=biggest740){
                  biggest740=ends[10];
                }
                if(biggest740 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest740 == 0){
                  S2=5;
                  System.out.println("still clampin");//sysj\Capper\CapperController.sysj line: 43, column: 13
                  cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 44, column: 4
                  currsigs.addElement(cylClampBottleExtend);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 5 : 
              if(gripperZAxisLifted.getprestatus()){//sysj\Capper\CapperController.sysj line: 42, column: 9
                System.out.println("CapperController: doneAtPos4");//sysj\Capper\CapperController.sysj line: 46, column: 9
                doneAtPos4.setPresent();//sysj\Capper\CapperController.sysj line: 47, column: 9
                currsigs.addElement(doneAtPos4);
                S2=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                cylClampBottleExtend.setPresent();//sysj\Capper\CapperController.sysj line: 44, column: 4
                currsigs.addElement(cylClampBottleExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      doneAtPos4.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      doneAtPos4.sethook();
      doneAtPos4.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
