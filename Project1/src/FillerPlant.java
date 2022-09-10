import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerPlant extends ClockDomain{
  public FillerPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  private int S2803 = 1;
  private int S2747 = 1;
  private int S2737 = 1;
  private int S2761 = 1;
  private int S2751 = 1;
  private int S2781 = 1;
  private int S2767 = 1;
  private int S2801 = 1;
  private int S2787 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2813(int [] tdone, int [] ends){
        switch(S2801){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2787){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 44, column: 23
              S2787=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 45, column: 21
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S2787=1;
            S2787=0;
            if(dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 43, column: 21
              dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 45, column: 21
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S2787=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2812(int [] tdone, int [] ends){
        switch(S2781){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2767){
          case 0 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 33, column: 23
              S2767=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 34, column: 21
              currsigs.addElement(dosUnitEvac);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2767=1;
            S2767=0;
            if(dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 32, column: 21
              dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 34, column: 21
              currsigs.addElement(dosUnitEvac);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S2767=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2811(int [] tdone, int [] ends){
        switch(S2761){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2751){
          case 0 : 
            if(!valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 21, column: 23
              S2751=1;
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
            S2751=1;
            S2751=0;
            if(valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 20, column: 21
              System.out.println("valveInletOnOff");//sysj\Filler\FillerPlant.sysj line: 22, column: 21
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S2751=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2810(int [] tdone, int [] ends){
        switch(S2747){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2737){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 9, column: 23
              S2737=1;
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
            S2737=1;
            S2737=0;
            if(valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 8, column: 21
              System.out.println("valveInjectorOnOff");//sysj\Filler\FillerPlant.sysj line: 10, column: 21
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S2737=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2808(int [] tdone, int [] ends){
        S2801=1;
    S2787=0;
    if(dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 43, column: 21
      dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 45, column: 21
      currsigs.addElement(dosUnitFilled);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S2787=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2807(int [] tdone, int [] ends){
        S2781=1;
    S2767=0;
    if(dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 32, column: 21
      dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 34, column: 21
      currsigs.addElement(dosUnitEvac);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S2767=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2806(int [] tdone, int [] ends){
        S2761=1;
    S2751=0;
    if(valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 20, column: 21
      System.out.println("valveInletOnOff");//sysj\Filler\FillerPlant.sysj line: 22, column: 21
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S2751=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread2805(int [] tdone, int [] ends){
        S2747=1;
    S2737=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 8, column: 21
      System.out.println("valveInjectorOnOff");//sysj\Filler\FillerPlant.sysj line: 10, column: 21
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S2737=1;
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
      switch(S2803){
        case 0 : 
          S2803=0;
          break RUN;
        
        case 1 : 
          S2803=2;
          S2803=2;
          thread2805(tdone,ends);
          thread2806(tdone,ends);
          thread2807(tdone,ends);
          thread2808(tdone,ends);
          int biggest2809 = 0;
          if(ends[2]>=biggest2809){
            biggest2809=ends[2];
          }
          if(ends[3]>=biggest2809){
            biggest2809=ends[3];
          }
          if(ends[4]>=biggest2809){
            biggest2809=ends[4];
          }
          if(ends[5]>=biggest2809){
            biggest2809=ends[5];
          }
          if(biggest2809 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2810(tdone,ends);
          thread2811(tdone,ends);
          thread2812(tdone,ends);
          thread2813(tdone,ends);
          int biggest2814 = 0;
          if(ends[2]>=biggest2814){
            biggest2814=ends[2];
          }
          if(ends[3]>=biggest2814){
            biggest2814=ends[3];
          }
          if(ends[4]>=biggest2814){
            biggest2814=ends[4];
          }
          if(ends[5]>=biggest2814){
            biggest2814=ends[5];
          }
          if(biggest2814 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2814 == 0){
            S2803=0;
            active[1]=0;
            ends[1]=0;
            S2803=0;
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
