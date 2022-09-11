import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\TopLevel\TopLevel.sysj line: 1, column: 1

public class TopLevel extends ClockDomain{
  public TopLevel(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleCount = new Signal("bottleCount", Signal.INPUT);
  public Signal fillAmount1E = new Signal("fillAmount1E", Signal.INPUT);
  public Signal fillAmount2E = new Signal("fillAmount2E", Signal.INPUT);
  public Signal fillAmount3E = new Signal("fillAmount3E", Signal.INPUT);
  public Signal fillAmount4E = new Signal("fillAmount4E", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal start = new Signal("start", Signal.INPUT);
  public Signal fillAmount1 = new Signal("fillAmount1", Signal.OUTPUT);
  public Signal fillAmount2 = new Signal("fillAmount2", Signal.OUTPUT);
  public Signal fillAmount3 = new Signal("fillAmount3", Signal.OUTPUT);
  public Signal fillAmount4 = new Signal("fillAmount4", Signal.OUTPUT);
  public Signal bottleAtPos0 = new Signal("bottleAtPos0", Signal.OUTPUT);
  private int currentCount_thread_2;//sysj\TopLevel\TopLevel.sysj line: 12, column: 9
  private int S203 = 1;
  private int S169 = 1;
  private int S28 = 1;
  private int S5 = 1;
  private int S177 = 1;
  private int S185 = 1;
  private int S193 = 1;
  private int S201 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread215(int [] tdone, int [] ends){
        switch(S201){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(fillAmount4E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 33, column: 26
          fillAmount4.setPresent();//sysj\TopLevel\TopLevel.sysj line: 33, column: 40
          currsigs.addElement(fillAmount4);
          fillAmount4.setValue((Integer)(fillAmount4E.getpreval() == null ? 0 : ((Integer)fillAmount4E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 33, column: 40
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

  public void thread214(int [] tdone, int [] ends){
        switch(S193){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fillAmount3E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 31, column: 26
          fillAmount3.setPresent();//sysj\TopLevel\TopLevel.sysj line: 31, column: 40
          currsigs.addElement(fillAmount3);
          fillAmount3.setValue((Integer)(fillAmount3E.getpreval() == null ? 0 : ((Integer)fillAmount3E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 31, column: 40
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

  public void thread213(int [] tdone, int [] ends){
        switch(S185){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fillAmount2E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 29, column: 26
          fillAmount2.setPresent();//sysj\TopLevel\TopLevel.sysj line: 29, column: 40
          currsigs.addElement(fillAmount2);
          fillAmount2.setValue((Integer)(fillAmount2E.getpreval() == null ? 0 : ((Integer)fillAmount2E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 29, column: 40
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

  public void thread212(int [] tdone, int [] ends){
        switch(S177){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(fillAmount1E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 27, column: 26
          fillAmount1.setPresent();//sysj\TopLevel\TopLevel.sysj line: 27, column: 40
          currsigs.addElement(fillAmount1);
          fillAmount1.setValue((Integer)(fillAmount1E.getpreval() == null ? 0 : ((Integer)fillAmount1E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 27, column: 40
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

  public void thread211(int [] tdone, int [] ends){
        switch(S169){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S28){
          case 0 : 
            if(start.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 14, column: 19
              S28=1;
              S5=0;
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
          
          case 1 : 
            switch(S5){
              case 0 : 
                if(bottleLeftPos5.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 17, column: 27
                  S5=1;
                  if(currentCount_thread_2 > (Integer)(bottleCount.getpreval() == null ? 0 : ((Integer)bottleCount.getpreval()).intValue())){//sysj\TopLevel\TopLevel.sysj line: 18, column: 24
                    ends[2]=2;
                    ;//sysj\TopLevel\TopLevel.sysj line: 15, column: 13
                    S28=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    bottleAtPos0.setPresent();//sysj\TopLevel\TopLevel.sysj line: 19, column: 21
                    currsigs.addElement(bottleAtPos0);
                    currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\TopLevel\TopLevel.sysj line: 20, column: 21
                    S5=2;
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
                S5=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 2 : 
                S5=2;
                S5=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209(int [] tdone, int [] ends){
        S201=1;
    if(fillAmount4E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 33, column: 26
      fillAmount4.setPresent();//sysj\TopLevel\TopLevel.sysj line: 33, column: 40
      currsigs.addElement(fillAmount4);
      fillAmount4.setValue((Integer)(fillAmount4E.getpreval() == null ? 0 : ((Integer)fillAmount4E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 33, column: 40
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

  public void thread208(int [] tdone, int [] ends){
        S193=1;
    if(fillAmount3E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 31, column: 26
      fillAmount3.setPresent();//sysj\TopLevel\TopLevel.sysj line: 31, column: 40
      currsigs.addElement(fillAmount3);
      fillAmount3.setValue((Integer)(fillAmount3E.getpreval() == null ? 0 : ((Integer)fillAmount3E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 31, column: 40
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

  public void thread207(int [] tdone, int [] ends){
        S185=1;
    if(fillAmount2E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 29, column: 26
      fillAmount2.setPresent();//sysj\TopLevel\TopLevel.sysj line: 29, column: 40
      currsigs.addElement(fillAmount2);
      fillAmount2.setValue((Integer)(fillAmount2E.getpreval() == null ? 0 : ((Integer)fillAmount2E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 29, column: 40
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

  public void thread206(int [] tdone, int [] ends){
        S177=1;
    if(fillAmount1E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 27, column: 26
      fillAmount1.setPresent();//sysj\TopLevel\TopLevel.sysj line: 27, column: 40
      currsigs.addElement(fillAmount1);
      fillAmount1.setValue((Integer)(fillAmount1E.getpreval() == null ? 0 : ((Integer)fillAmount1E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 27, column: 40
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

  public void thread205(int [] tdone, int [] ends){
        S169=1;
    new Thread(new GUI()).start();//sysj\TopLevel\TopLevel.sysj line: 10, column: 9
    currentCount_thread_2 = 0;//sysj\TopLevel\TopLevel.sysj line: 12, column: 9
    S28=0;
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
      switch(S203){
        case 0 : 
          S203=0;
          break RUN;
        
        case 1 : 
          S203=2;
          S203=2;
          thread205(tdone,ends);
          thread206(tdone,ends);
          thread207(tdone,ends);
          thread208(tdone,ends);
          thread209(tdone,ends);
          int biggest210 = 0;
          if(ends[2]>=biggest210){
            biggest210=ends[2];
          }
          if(ends[3]>=biggest210){
            biggest210=ends[3];
          }
          if(ends[4]>=biggest210){
            biggest210=ends[4];
          }
          if(ends[5]>=biggest210){
            biggest210=ends[5];
          }
          if(ends[6]>=biggest210){
            biggest210=ends[6];
          }
          if(biggest210 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread211(tdone,ends);
          thread212(tdone,ends);
          thread213(tdone,ends);
          thread214(tdone,ends);
          thread215(tdone,ends);
          int biggest216 = 0;
          if(ends[2]>=biggest216){
            biggest216=ends[2];
          }
          if(ends[3]>=biggest216){
            biggest216=ends[3];
          }
          if(ends[4]>=biggest216){
            biggest216=ends[4];
          }
          if(ends[5]>=biggest216){
            biggest216=ends[5];
          }
          if(ends[6]>=biggest216){
            biggest216=ends[6];
          }
          if(biggest216 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest216 == 0){
            S203=0;
            active[1]=0;
            ends[1]=0;
            S203=0;
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
          bottleCount.gethook();
          fillAmount1E.gethook();
          fillAmount2E.gethook();
          fillAmount3E.gethook();
          fillAmount4E.gethook();
          bottleLeftPos5.gethook();
          start.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleCount.setpreclear();
      fillAmount1E.setpreclear();
      fillAmount2E.setpreclear();
      fillAmount3E.setpreclear();
      fillAmount4E.setpreclear();
      bottleLeftPos5.setpreclear();
      start.setpreclear();
      fillAmount1.setpreclear();
      fillAmount2.setpreclear();
      fillAmount3.setpreclear();
      fillAmount4.setpreclear();
      bottleAtPos0.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleCount.getStatus() ? bottleCount.setprepresent() : bottleCount.setpreclear();
      bottleCount.setpreval(bottleCount.getValue());
      bottleCount.setClear();
      dummyint = fillAmount1E.getStatus() ? fillAmount1E.setprepresent() : fillAmount1E.setpreclear();
      fillAmount1E.setpreval(fillAmount1E.getValue());
      fillAmount1E.setClear();
      dummyint = fillAmount2E.getStatus() ? fillAmount2E.setprepresent() : fillAmount2E.setpreclear();
      fillAmount2E.setpreval(fillAmount2E.getValue());
      fillAmount2E.setClear();
      dummyint = fillAmount3E.getStatus() ? fillAmount3E.setprepresent() : fillAmount3E.setpreclear();
      fillAmount3E.setpreval(fillAmount3E.getValue());
      fillAmount3E.setClear();
      dummyint = fillAmount4E.getStatus() ? fillAmount4E.setprepresent() : fillAmount4E.setpreclear();
      fillAmount4E.setpreval(fillAmount4E.getValue());
      fillAmount4E.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = start.getStatus() ? start.setprepresent() : start.setpreclear();
      start.setpreval(start.getValue());
      start.setClear();
      fillAmount1.sethook();
      fillAmount1.setClear();
      fillAmount2.sethook();
      fillAmount2.setClear();
      fillAmount3.sethook();
      fillAmount3.setClear();
      fillAmount4.sethook();
      fillAmount4.setClear();
      bottleAtPos0.sethook();
      bottleAtPos0.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleCount.gethook();
        fillAmount1E.gethook();
        fillAmount2E.gethook();
        fillAmount3E.gethook();
        fillAmount4E.gethook();
        bottleLeftPos5.gethook();
        start.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
