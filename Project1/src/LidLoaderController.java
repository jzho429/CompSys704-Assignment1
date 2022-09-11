import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class LidLoaderController extends ClockDomain{
  public LidLoaderController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal doneAtPos3 = new Signal("doneAtPos3", Signal.OUTPUT);
  private int S154 = 1;
  private int S2 = 1;
  private int S25 = 1;
  private int S34 = 1;
  private int S27 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread160(int [] tdone, int [] ends){
        switch(S34){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S27){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 26, column: 12
              System.out.println("LidLoaderController: WPgripped");//sysj\LidLoader\LidLoaderController.sysj line: 27, column: 5
              S27=1;
              armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 28, column: 5
              currsigs.addElement(armDest);
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
          
          case 1 : 
            armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 28, column: 5
            currsigs.addElement(armDest);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread159(int [] tdone, int [] ends){
        switch(S25){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 24, column: 5
        currsigs.addElement(vacOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread157(int [] tdone, int [] ends){
        S34=1;
    S27=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread156(int [] tdone, int [] ends){
        S25=1;
    vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 24, column: 5
    currsigs.addElement(vacOn);
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
      switch(S154){
        case 0 : 
          S154=0;
          break RUN;
        
        case 1 : 
          S154=2;
          S154=2;
          System.out.println("LidLoaderController: Waiting for bottleAtPos3");//sysj\LidLoader\LidLoaderController.sysj line: 10, column: 3
          S2=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S2){
            case 0 : 
              if(bottleAtPos3.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 11, column: 9
                System.out.println("LidLoaderController: bottleAtPos3");//sysj\LidLoader\LidLoaderController.sysj line: 12, column: 3
                S2=1;
                pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 14, column: 4
                currsigs.addElement(pusherExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(pusherExtended.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 13, column: 9
                S2=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 14, column: 4
                currsigs.addElement(pusherExtend);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              S2=2;
              S2=3;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
            case 3 : 
              if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 17, column: 9
                S2=4;
                armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 4
                currsigs.addElement(armSource);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 4 : 
              if(armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 18, column: 9
                System.out.println("LidLoaderController: armAtSource");//sysj\LidLoader\LidLoaderController.sysj line: 21, column: 3
                S2=5;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 4
                currsigs.addElement(armSource);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              S2=5;
              S2=6;
              thread156(tdone,ends);
              thread157(tdone,ends);
              int biggest158 = 0;
              if(ends[2]>=biggest158){
                biggest158=ends[2];
              }
              if(ends[3]>=biggest158){
                biggest158=ends[3];
              }
              if(biggest158 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 6 : 
              if(armAtDest.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 23, column: 9
                System.out.println("LidLoaderController: armAtDest");//sysj\LidLoader\LidLoaderController.sysj line: 30, column: 3
                System.out.println("LidLoaderController: Done");//sysj\LidLoader\LidLoaderController.sysj line: 31, column: 3
                doneAtPos3.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 32, column: 3
                currsigs.addElement(doneAtPos3);
                S2=7;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                thread159(tdone,ends);
                thread160(tdone,ends);
                int biggest161 = 0;
                if(ends[2]>=biggest161){
                  biggest161=ends[2];
                }
                if(ends[3]>=biggest161){
                  biggest161=ends[3];
                }
                if(biggest161 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                //FINXME code
                if(biggest161 == 0){
                  System.out.println("LidLoaderController: armAtDest");//sysj\LidLoader\LidLoaderController.sysj line: 30, column: 3
                  System.out.println("LidLoaderController: Done");//sysj\LidLoader\LidLoaderController.sysj line: 31, column: 3
                  doneAtPos3.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 32, column: 3
                  currsigs.addElement(doneAtPos3);
                  S2=7;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 7 : 
              S2=7;
              System.out.println("LidLoaderController: Waiting for bottleAtPos3");//sysj\LidLoader\LidLoaderController.sysj line: 10, column: 3
              S2=0;
              active[1]=1;
              ends[1]=1;
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          bottleAtPos3.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      bottleAtPos3.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      doneAtPos3.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      doneAtPos3.sethook();
      doneAtPos3.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        bottleAtPos3.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
