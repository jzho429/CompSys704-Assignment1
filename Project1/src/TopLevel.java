import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\TopLevel\TopLevel.sysj line: 1, column: 1
import run.POS;//sysj\TopLevel\TopLevel.sysj line: 2, column: 1

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
  private int currentCount_thread_2;//sysj\TopLevel\TopLevel.sysj line: 14, column: 9
  private int S383 = 1;
  private int S349 = 1;
  private int S58 = 1;
  private int S4 = 1;
  private int S357 = 1;
  private int S365 = 1;
  private int S373 = 1;
  private int S381 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread395(int [] tdone, int [] ends){
        switch(S381){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(fillAmount4E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 43, column: 26
          fillAmount4.setPresent();//sysj\TopLevel\TopLevel.sysj line: 43, column: 40
          currsigs.addElement(fillAmount4);
          fillAmount4.setValue((Integer)(fillAmount4E.getpreval() == null ? 0 : ((Integer)fillAmount4E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 43, column: 40
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

  public void thread394(int [] tdone, int [] ends){
        switch(S373){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fillAmount3E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 41, column: 26
          fillAmount3.setPresent();//sysj\TopLevel\TopLevel.sysj line: 41, column: 40
          currsigs.addElement(fillAmount3);
          fillAmount3.setValue((Integer)(fillAmount3E.getpreval() == null ? 0 : ((Integer)fillAmount3E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 41, column: 40
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

  public void thread393(int [] tdone, int [] ends){
        switch(S365){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fillAmount2E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 39, column: 26
          fillAmount2.setPresent();//sysj\TopLevel\TopLevel.sysj line: 39, column: 40
          currsigs.addElement(fillAmount2);
          fillAmount2.setValue((Integer)(fillAmount2E.getpreval() == null ? 0 : ((Integer)fillAmount2E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 39, column: 40
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

  public void thread392(int [] tdone, int [] ends){
        switch(S357){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(fillAmount1E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 37, column: 26
          fillAmount1.setPresent();//sysj\TopLevel\TopLevel.sysj line: 37, column: 40
          currsigs.addElement(fillAmount1);
          fillAmount1.setValue((Integer)(fillAmount1E.getpreval() == null ? 0 : ((Integer)fillAmount1E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 37, column: 40
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

  public void thread391(int [] tdone, int [] ends){
        switch(S349){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S58){
          case 0 : 
            if(start.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 16, column: 19
              S58=1;
              S4=0;
              if(currentCount_thread_2 > 0){//sysj\TopLevel\TopLevel.sysj line: 19, column: 24
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("Bottle Count: " + currentCount_thread_2);//sysj\TopLevel\TopLevel.sysj line: 22, column: 21
                if(currentCount_thread_2 > 5){//sysj\TopLevel\TopLevel.sysj line: 24, column: 24
                  System.out.println("Stopped");//sysj\TopLevel\TopLevel.sysj line: 25, column: 25
                  ends[2]=2;
                  ;//sysj\TopLevel\TopLevel.sysj line: 17, column: 13
                  S58=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  bottleAtPos0.setPresent();//sysj\TopLevel\TopLevel.sysj line: 28, column: 21
                  currsigs.addElement(bottleAtPos0);
                  currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\TopLevel\TopLevel.sysj line: 29, column: 21
                  S4=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
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
            switch(S4){
              case 0 : 
                if(bottleLeftPos5.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 20, column: 31
                  System.out.println("Bottle Count: " + currentCount_thread_2);//sysj\TopLevel\TopLevel.sysj line: 22, column: 21
                  if(currentCount_thread_2 > 5){//sysj\TopLevel\TopLevel.sysj line: 24, column: 24
                    System.out.println("Stopped");//sysj\TopLevel\TopLevel.sysj line: 25, column: 25
                    ends[2]=2;
                    ;//sysj\TopLevel\TopLevel.sysj line: 17, column: 13
                    S58=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    bottleAtPos0.setPresent();//sysj\TopLevel\TopLevel.sysj line: 28, column: 21
                    currsigs.addElement(bottleAtPos0);
                    currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\TopLevel\TopLevel.sysj line: 29, column: 21
                    S4=1;
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
                S4=1;
                S4=0;
                if(currentCount_thread_2 > 0){//sysj\TopLevel\TopLevel.sysj line: 19, column: 24
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  System.out.println("Bottle Count: " + currentCount_thread_2);//sysj\TopLevel\TopLevel.sysj line: 22, column: 21
                  if(currentCount_thread_2 > 5){//sysj\TopLevel\TopLevel.sysj line: 24, column: 24
                    System.out.println("Stopped");//sysj\TopLevel\TopLevel.sysj line: 25, column: 25
                    ends[2]=2;
                    ;//sysj\TopLevel\TopLevel.sysj line: 17, column: 13
                    S58=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    bottleAtPos0.setPresent();//sysj\TopLevel\TopLevel.sysj line: 28, column: 21
                    currsigs.addElement(bottleAtPos0);
                    currentCount_thread_2 = currentCount_thread_2 + 1;//sysj\TopLevel\TopLevel.sysj line: 29, column: 21
                    S4=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            S58=2;
            S58=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread389(int [] tdone, int [] ends){
        S381=1;
    if(fillAmount4E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 43, column: 26
      fillAmount4.setPresent();//sysj\TopLevel\TopLevel.sysj line: 43, column: 40
      currsigs.addElement(fillAmount4);
      fillAmount4.setValue((Integer)(fillAmount4E.getpreval() == null ? 0 : ((Integer)fillAmount4E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 43, column: 40
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

  public void thread388(int [] tdone, int [] ends){
        S373=1;
    if(fillAmount3E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 41, column: 26
      fillAmount3.setPresent();//sysj\TopLevel\TopLevel.sysj line: 41, column: 40
      currsigs.addElement(fillAmount3);
      fillAmount3.setValue((Integer)(fillAmount3E.getpreval() == null ? 0 : ((Integer)fillAmount3E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 41, column: 40
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

  public void thread387(int [] tdone, int [] ends){
        S365=1;
    if(fillAmount2E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 39, column: 26
      fillAmount2.setPresent();//sysj\TopLevel\TopLevel.sysj line: 39, column: 40
      currsigs.addElement(fillAmount2);
      fillAmount2.setValue((Integer)(fillAmount2E.getpreval() == null ? 0 : ((Integer)fillAmount2E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 39, column: 40
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

  public void thread386(int [] tdone, int [] ends){
        S357=1;
    if(fillAmount1E.getprestatus()){//sysj\TopLevel\TopLevel.sysj line: 37, column: 26
      fillAmount1.setPresent();//sysj\TopLevel\TopLevel.sysj line: 37, column: 40
      currsigs.addElement(fillAmount1);
      fillAmount1.setValue((Integer)(fillAmount1E.getpreval() == null ? 0 : ((Integer)fillAmount1E.getpreval()).intValue()));//sysj\TopLevel\TopLevel.sysj line: 37, column: 40
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

  public void thread385(int [] tdone, int [] ends){
        S349=1;
    new Thread(new GUI()).start();//sysj\TopLevel\TopLevel.sysj line: 11, column: 9
    new Thread(new POS()).start();//sysj\TopLevel\TopLevel.sysj line: 12, column: 9
    currentCount_thread_2 = 0;//sysj\TopLevel\TopLevel.sysj line: 14, column: 9
    S58=0;
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
      switch(S383){
        case 0 : 
          S383=0;
          break RUN;
        
        case 1 : 
          S383=2;
          S383=2;
          thread385(tdone,ends);
          thread386(tdone,ends);
          thread387(tdone,ends);
          thread388(tdone,ends);
          thread389(tdone,ends);
          int biggest390 = 0;
          if(ends[2]>=biggest390){
            biggest390=ends[2];
          }
          if(ends[3]>=biggest390){
            biggest390=ends[3];
          }
          if(ends[4]>=biggest390){
            biggest390=ends[4];
          }
          if(ends[5]>=biggest390){
            biggest390=ends[5];
          }
          if(ends[6]>=biggest390){
            biggest390=ends[6];
          }
          if(biggest390 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread391(tdone,ends);
          thread392(tdone,ends);
          thread393(tdone,ends);
          thread394(tdone,ends);
          thread395(tdone,ends);
          int biggest396 = 0;
          if(ends[2]>=biggest396){
            biggest396=ends[2];
          }
          if(ends[3]>=biggest396){
            biggest396=ends[3];
          }
          if(ends[4]>=biggest396){
            biggest396=ends[4];
          }
          if(ends[5]>=biggest396){
            biggest396=ends[5];
          }
          if(ends[6]>=biggest396){
            biggest396=ends[6];
          }
          if(biggest396 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest396 == 0){
            S383=0;
            active[1]=0;
            ends[1]=0;
            S383=0;
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
