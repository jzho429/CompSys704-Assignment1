import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  private Signal motorOn_1;
  private Signal bottlePos_1;
  private int S315 = 1;
  private int S120 = 1;
  private int S64 = 1;
  private int S122 = 1;
  private int S175 = 1;
  private int S139 = 1;
  private int S130 = 1;
  private int S124 = 1;
  private int S138 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread331(int [] tdone, int [] ends){
        S138=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 25
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 41
      currsigs.addElement(bottleLeftPos5E);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread330(int [] tdone, int [] ends){
        S130=1;
    S124=0;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 25
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 39
      currsigs.addElement(bottleAtPos1E);
      S124=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread328(int [] tdone, int [] ends){
        switch(S138){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 25
          bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 41
          currsigs.addElement(bottleLeftPos5E);
          active[6]=1;
          ends[6]=1;
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

  public void thread327(int [] tdone, int [] ends){
        switch(S130){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S124){
          case 0 : 
            S124=0;
            if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 25
              bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 39
              currsigs.addElement(bottleAtPos1E);
              S124=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S124=1;
            S124=0;
            if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 25
              bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 39
              currsigs.addElement(bottleAtPos1E);
              S124=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S124=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread326(int [] tdone, int [] ends){
        switch(S175){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S139){
          case 0 : 
            thread327(tdone,ends);
            thread328(tdone,ends);
            int biggest329 = 0;
            if(ends[5]>=biggest329){
              biggest329=ends[5];
            }
            if(ends[6]>=biggest329){
              biggest329=ends[6];
            }
            if(biggest329 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest329 == 0){
              S139=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S139=1;
            S139=0;
            thread330(tdone,ends);
            thread331(tdone,ends);
            int biggest332 = 0;
            if(ends[5]>=biggest332){
              biggest332=ends[5];
            }
            if(ends[6]>=biggest332){
              biggest332=ends[6];
            }
            if(biggest332 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread325(int [] tdone, int [] ends){
        switch(S122){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread324(int [] tdone, int [] ends){
        switch(S120){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S64){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 20
              S64=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 20
                S64=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 22, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 5
                currsigs.addElement(motorOn_1);
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
            if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 20
              S64=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S64=2;
            S64=0;
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 20
              S64=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 20
                S64=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 22, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 5
                currsigs.addElement(motorOn_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 18, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread321(int [] tdone, int [] ends){
        S138=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 25
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 40, column: 41
      currsigs.addElement(bottleLeftPos5E);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread320(int [] tdone, int [] ends){
        S130=1;
    S124=0;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 25
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 38, column: 39
      currsigs.addElement(bottleAtPos1E);
      S124=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S124=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread319(int [] tdone, int [] ends){
        S175=1;
    S139=0;
    thread320(tdone,ends);
    thread321(tdone,ends);
    int biggest322 = 0;
    if(ends[5]>=biggest322){
      biggest322=ends[5];
    }
    if(ends[6]>=biggest322){
      biggest322=ends[6];
    }
    if(biggest322 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread318(int [] tdone, int [] ends){
        S122=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread317(int [] tdone, int [] ends){
        S120=1;
    S64=0;
    if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 20
      S64=1;
      if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 20
        S64=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 22, column: 5
        motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 5
        currsigs.addElement(motorOn_1);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 18, column: 5
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
      switch(S315){
        case 0 : 
          S315=0;
          break RUN;
        
        case 1 : 
          S315=2;
          S315=2;
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 12, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 13, column: 2
          bottlePos_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 14, column: 2
          currsigs.addElement(bottlePos_1);
          bottlePos_1.setValue(0);//sysj\Conveyor\ConveyorPlant.sysj line: 14, column: 2
          thread317(tdone,ends);
          thread318(tdone,ends);
          thread319(tdone,ends);
          int biggest323 = 0;
          if(ends[2]>=biggest323){
            biggest323=ends[2];
          }
          if(ends[3]>=biggest323){
            biggest323=ends[3];
          }
          if(ends[4]>=biggest323){
            biggest323=ends[4];
          }
          if(biggest323 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 12, column: 2
          bottlePos_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 13, column: 2
          thread324(tdone,ends);
          thread325(tdone,ends);
          thread326(tdone,ends);
          int biggest333 = 0;
          if(ends[2]>=biggest333){
            biggest333=ends[2];
          }
          if(ends[3]>=biggest333){
            biggest333=ends[3];
          }
          if(ends[4]>=biggest333){
            biggest333=ends[4];
          }
          if(biggest333 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest333 == 0){
            S315=0;
            active[1]=0;
            ends[1]=0;
            S315=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    motorOn_1 = new Signal();
    bottlePos_1 = new Signal();
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
          motConveyorOnOff.gethook();
          bottleAtPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      bottleAtPos5.setpreclear();
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleLeftPos5E.setpreclear();
      motorOn_1.setpreclear();
      bottlePos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      motorOn_1.setClear();
      bottlePos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        bottleAtPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
