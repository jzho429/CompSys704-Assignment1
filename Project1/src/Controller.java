import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
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
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private Signal selectM_1;
  private Signal selectA_1;
  private int S814 = 1;
  private int S275 = 1;
  private int S69 = 1;
  private int S10 = 1;
  private int S4 = 1;
  private int S18 = 1;
  private int S26 = 1;
  private int S34 = 1;
  private int S797 = 1;
  private int S379 = 1;
  private int S286 = 1;
  private int S301 = 1;
  private int S310 = 1;
  private int S309 = 1;
  private int S812 = 1;
  private int S811 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread838(int [] tdone, int [] ends){
        switch(S812){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S811){
          case 0 : 
            if(mode.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 51, column: 9
              S811=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\LidLoader\LidLoaderController.sysj line: 53, column: 7
                selectM_1.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 54, column: 5
                currsigs.addElement(selectM_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                selectA_1.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 57, column: 5
                currsigs.addElement(selectA_1);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\LidLoader\LidLoaderController.sysj line: 53, column: 7
              selectM_1.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 54, column: 5
              currsigs.addElement(selectM_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              selectA_1.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 57, column: 5
              currsigs.addElement(selectA_1);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread836(int [] tdone, int [] ends){
        switch(S310){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S309){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 43, column: 14
              S309=1;
              armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 44, column: 6
              currsigs.addElement(armDest);
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
          
          case 1 : 
            armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 44, column: 6
            currsigs.addElement(armDest);
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread835(int [] tdone, int [] ends){
        switch(S301){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 41, column: 7
        currsigs.addElement(vacOn);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread833(int [] tdone, int [] ends){
        S310=1;
    S309=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread832(int [] tdone, int [] ends){
        S301=1;
    vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 41, column: 7
    currsigs.addElement(vacOn);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread831(int [] tdone, int [] ends){
        switch(S797){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S379){
          case 0 : 
            if(selectA_1.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 28, column: 10
              S379=1;
              S286=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(selectM_1.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 29, column: 10
              S379=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S286){
                case 0 : 
                  if(request.getprestatus() && !empty.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 30, column: 11
                    S286=1;
                    pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 32, column: 6
                    currsigs.addElement(pusherExtend);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 31, column: 11
                    S286=2;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 32, column: 6
                    currsigs.addElement(pusherExtend);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 2 : 
                  S286=2;
                  S286=3;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                  break;
                
                case 3 : 
                  if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 35, column: 11
                    S286=4;
                    armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 37, column: 6
                    currsigs.addElement(armSource);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 4 : 
                  if(armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 36, column: 11
                    S286=5;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 37, column: 6
                    currsigs.addElement(armSource);
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 5 : 
                  S286=5;
                  S286=6;
                  thread832(tdone,ends);
                  thread833(tdone,ends);
                  int biggest834 = 0;
                  if(ends[8]>=biggest834){
                    biggest834=ends[8];
                  }
                  if(ends[9]>=biggest834){
                    biggest834=ends[9];
                  }
                  if(biggest834 == 1){
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 6 : 
                  if(armAtDest.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 40, column: 11
                    S379=0;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    thread835(tdone,ends);
                    thread836(tdone,ends);
                    int biggest837 = 0;
                    if(ends[8]>=biggest837){
                      biggest837=ends[8];
                    }
                    if(ends[9]>=biggest837){
                      biggest837=ends[9];
                    }
                    if(biggest837 == 1){
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    //FINXME code
                    if(biggest837 == 0){
                      S379=0;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread829(int [] tdone, int [] ends){
        switch(S34){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 21, column: 26
          armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 21, column: 36
          currsigs.addElement(armDest);
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

  public void thread828(int [] tdone, int [] ends){
        switch(S26){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 26
          armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 38
          currsigs.addElement(armSource);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread827(int [] tdone, int [] ends){
        switch(S18){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 17, column: 26
          vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 17, column: 34
          currsigs.addElement(vacOn);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread826(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S4){
          case 0 : 
            S4=0;
            if(pusherExtendM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 26
              pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 41
              currsigs.addElement(pusherExtend);
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S4=1;
            S4=0;
            if(pusherExtendM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 26
              pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 41
              currsigs.addElement(pusherExtend);
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S4=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread824(int [] tdone, int [] ends){
        S34=1;
    if(armDestM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 21, column: 26
      armDest.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 21, column: 36
      currsigs.addElement(armDest);
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

  public void thread823(int [] tdone, int [] ends){
        S26=1;
    if(armSourceM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 26
      armSource.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 19, column: 38
      currsigs.addElement(armSource);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread822(int [] tdone, int [] ends){
        S18=1;
    if(vacOnM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 17, column: 26
      vacOn.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 17, column: 34
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread821(int [] tdone, int [] ends){
        S10=1;
    S4=0;
    if(pusherExtendM.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 26
      pusherExtend.setPresent();//sysj\LidLoader\LidLoaderController.sysj line: 15, column: 41
      currsigs.addElement(pusherExtend);
      S4=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S4=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread820(int [] tdone, int [] ends){
        switch(S275){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S69){
          case 0 : 
            if(selectM_1.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 13, column: 10
              S69=1;
              thread821(tdone,ends);
              thread822(tdone,ends);
              thread823(tdone,ends);
              thread824(tdone,ends);
              int biggest825 = 0;
              if(ends[3]>=biggest825){
                biggest825=ends[3];
              }
              if(ends[4]>=biggest825){
                biggest825=ends[4];
              }
              if(ends[5]>=biggest825){
                biggest825=ends[5];
              }
              if(ends[6]>=biggest825){
                biggest825=ends[6];
              }
              if(biggest825 == 1){
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
            if(selectA_1.getprestatus()){//sysj\LidLoader\LidLoaderController.sysj line: 14, column: 10
              S69=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread826(tdone,ends);
              thread827(tdone,ends);
              thread828(tdone,ends);
              thread829(tdone,ends);
              int biggest830 = 0;
              if(ends[3]>=biggest830){
                biggest830=ends[3];
              }
              if(ends[4]>=biggest830){
                biggest830=ends[4];
              }
              if(ends[5]>=biggest830){
                biggest830=ends[5];
              }
              if(ends[6]>=biggest830){
                biggest830=ends[6];
              }
              if(biggest830 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest830 == 0){
                S69=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread818(int [] tdone, int [] ends){
        S812=1;
    S811=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread817(int [] tdone, int [] ends){
        S797=1;
    S379=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread816(int [] tdone, int [] ends){
        S275=1;
    S69=0;
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
      switch(S814){
        case 0 : 
          S814=0;
          break RUN;
        
        case 1 : 
          S814=2;
          S814=2;
          selectM_1.setClear();//sysj\LidLoader\LidLoaderController.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\LidLoader\LidLoaderController.sysj line: 9, column: 2
          thread816(tdone,ends);
          thread817(tdone,ends);
          thread818(tdone,ends);
          int biggest819 = 0;
          if(ends[2]>=biggest819){
            biggest819=ends[2];
          }
          if(ends[7]>=biggest819){
            biggest819=ends[7];
          }
          if(ends[10]>=biggest819){
            biggest819=ends[10];
          }
          if(biggest819 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          selectM_1.setClear();//sysj\LidLoader\LidLoaderController.sysj line: 9, column: 2
          selectA_1.setClear();//sysj\LidLoader\LidLoaderController.sysj line: 9, column: 2
          thread820(tdone,ends);
          thread831(tdone,ends);
          thread838(tdone,ends);
          int biggest839 = 0;
          if(ends[2]>=biggest839){
            biggest839=ends[2];
          }
          if(ends[7]>=biggest839){
            biggest839=ends[7];
          }
          if(ends[10]>=biggest839){
            biggest839=ends[10];
          }
          if(biggest839 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest839 == 0){
            S814=0;
            active[1]=0;
            ends[1]=0;
            S814=0;
            break RUN;
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
    selectM_1 = new Signal();
    selectA_1 = new Signal();
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
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      selectM_1.setpreclear();
      selectA_1.setpreclear();
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
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      selectM_1.setClear();
      selectA_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
