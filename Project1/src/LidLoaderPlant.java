import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LidLoaderPlant extends ClockDomain{
  public LidLoaderPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int S369 = 1;
  private int S204 = 1;
  private int S168 = 1;
  private int S245 = 1;
  private int S209 = 1;
  private int S265 = 1;
  private int S251 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread377(int [] tdone, int [] ends){
        switch(S265){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S251){
          case 0 : 
            if(!vacOn.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 41, column: 11
              S251=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 42, column: 6
              currsigs.addElement(WPgripped);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S251=1;
            S251=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 40, column: 12
              WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 42, column: 6
              currsigs.addElement(WPgripped);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S251=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread376(int [] tdone, int [] ends){
        switch(S245){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S209){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 27, column: 10
              S209=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 28, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S209=1;
            S209=2;
            pusherExtended.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 32, column: 5
            currsigs.addElement(pusherExtended);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
          case 2 : 
            if(!pusherExtend.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 31, column: 10
              S209=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 32, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            S209=3;
            S209=0;
            pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 28, column: 5
            currsigs.addElement(pusherRetracted);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread375(int [] tdone, int [] ends){
        switch(S204){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S168){
          case 0 : 
            if(armSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 14, column: 10
              S168=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 15, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S168=1;
            S168=2;
            armAtSource.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 19, column: 5
            currsigs.addElement(armAtSource);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 2 : 
            if(armDest.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 18, column: 10
              S168=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S168=3;
            S168=0;
            armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 15, column: 5
            currsigs.addElement(armAtDest);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread373(int [] tdone, int [] ends){
        S265=1;
    S251=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 40, column: 12
      WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 42, column: 6
      currsigs.addElement(WPgripped);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S251=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread372(int [] tdone, int [] ends){
        S245=1;
    S209=0;
    pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 28, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread371(int [] tdone, int [] ends){
        S204=1;
    S168=0;
    armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 15, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S369){
        case 0 : 
          S369=0;
          break RUN;
        
        case 1 : 
          S369=2;
          S369=2;
          capDec_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 9, column: 2
          capPos_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 10, column: 2
          capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 11, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\LidLoader\LidLoaderPlant.sysj line: 11, column: 2
          thread371(tdone,ends);
          thread372(tdone,ends);
          thread373(tdone,ends);
          int biggest374 = 0;
          if(ends[2]>=biggest374){
            biggest374=ends[2];
          }
          if(ends[3]>=biggest374){
            biggest374=ends[3];
          }
          if(ends[4]>=biggest374){
            biggest374=ends[4];
          }
          if(biggest374 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 9, column: 2
          capPos_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 10, column: 2
          thread375(tdone,ends);
          thread376(tdone,ends);
          thread377(tdone,ends);
          int biggest378 = 0;
          if(ends[2]>=biggest378){
            biggest378=ends[2];
          }
          if(ends[3]>=biggest378){
            biggest378=ends[3];
          }
          if(ends[4]>=biggest378){
            biggest378=ends[4];
          }
          if(biggest378 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest378 == 0){
            S369=0;
            active[1]=0;
            ends[1]=0;
            S369=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
