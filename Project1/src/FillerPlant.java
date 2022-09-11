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
  public Signal stillWorking = new Signal("stillWorking", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal fillerE = new Signal("fillerE", Signal.OUTPUT);
  public Signal filler1E = new Signal("filler1E", Signal.OUTPUT);
  public Signal filler2E = new Signal("filler2E", Signal.OUTPUT);
  public Signal filler3E = new Signal("filler3E", Signal.OUTPUT);
  public Signal filler4E = new Signal("filler4E", Signal.OUTPUT);
  private int S2831 = 1;
  private int S2747 = 1;
  private int S2737 = 1;
  private int S2761 = 1;
  private int S2751 = 1;
  private int S2781 = 1;
  private int S2767 = 1;
  private int S2801 = 1;
  private int S2787 = 1;
  private int S2809 = 1;
  private int S2803 = 1;
  private int S2829 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2845(int [] tdone, int [] ends){
        switch(S2829){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(stillWorking.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 60, column: 21
          if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 1){//sysj\Filler\FillerPlant.sysj line: 61, column: 20
            filler1E.setPresent();//sysj\Filler\FillerPlant.sysj line: 62, column: 21
            currsigs.addElement(filler1E);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 2){//sysj\Filler\FillerPlant.sysj line: 63, column: 27
              filler2E.setPresent();//sysj\Filler\FillerPlant.sysj line: 64, column: 21
              currsigs.addElement(filler2E);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 3){//sysj\Filler\FillerPlant.sysj line: 65, column: 27
                filler3E.setPresent();//sysj\Filler\FillerPlant.sysj line: 66, column: 21
                currsigs.addElement(filler3E);
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 4){//sysj\Filler\FillerPlant.sysj line: 67, column: 27
                  filler4E.setPresent();//sysj\Filler\FillerPlant.sysj line: 68, column: 21
                  currsigs.addElement(filler4E);
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
          }
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2844(int [] tdone, int [] ends){
        switch(S2809){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S2803){
          case 0 : 
            S2803=0;
            if(stillWorking.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 55, column: 29
              fillerE.setPresent();//sysj\Filler\FillerPlant.sysj line: 55, column: 43
              currsigs.addElement(fillerE);
              S2803=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S2803=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S2803=1;
            S2803=0;
            if(stillWorking.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 55, column: 29
              fillerE.setPresent();//sysj\Filler\FillerPlant.sysj line: 55, column: 43
              currsigs.addElement(fillerE);
              S2803=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S2803=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2843(int [] tdone, int [] ends){
        switch(S2801){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2787){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 46, column: 23
              S2787=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 47, column: 21
              currsigs.addElement(dosUnitFilled);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S2787=1;
            S2787=0;
            if(dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 45, column: 21
              dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 47, column: 21
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

  public void thread2842(int [] tdone, int [] ends){
        switch(S2781){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2767){
          case 0 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 35, column: 23
              S2767=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 36, column: 21
              currsigs.addElement(dosUnitEvac);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S2767=1;
            S2767=0;
            if(dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 34, column: 21
              dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 36, column: 21
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

  public void thread2841(int [] tdone, int [] ends){
        switch(S2761){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2751){
          case 0 : 
            if(!valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 23, column: 23
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
            if(valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 22, column: 21
              System.out.println("FillerPlant: valveInletOnOff");//sysj\Filler\FillerPlant.sysj line: 24, column: 21
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

  public void thread2840(int [] tdone, int [] ends){
        switch(S2747){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2737){
          case 0 : 
            if(!valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 11, column: 23
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
            if(valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 10, column: 21
              System.out.println("FillerPlant: valveInjectorOnOff");//sysj\Filler\FillerPlant.sysj line: 12, column: 21
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

  public void thread2838(int [] tdone, int [] ends){
        S2829=1;
    if(stillWorking.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 60, column: 21
      if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 1){//sysj\Filler\FillerPlant.sysj line: 61, column: 20
        filler1E.setPresent();//sysj\Filler\FillerPlant.sysj line: 62, column: 21
        currsigs.addElement(filler1E);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
      else {
        if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 2){//sysj\Filler\FillerPlant.sysj line: 63, column: 27
          filler2E.setPresent();//sysj\Filler\FillerPlant.sysj line: 64, column: 21
          currsigs.addElement(filler2E);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 3){//sysj\Filler\FillerPlant.sysj line: 65, column: 27
            filler3E.setPresent();//sysj\Filler\FillerPlant.sysj line: 66, column: 21
            currsigs.addElement(filler3E);
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            if((stillWorking.getpreval() == null ? 0 : ((Integer)stillWorking.getpreval()).intValue()) == 4){//sysj\Filler\FillerPlant.sysj line: 67, column: 27
              filler4E.setPresent();//sysj\Filler\FillerPlant.sysj line: 68, column: 21
              currsigs.addElement(filler4E);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
          }
        }
      }
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2837(int [] tdone, int [] ends){
        S2809=1;
    S2803=0;
    if(stillWorking.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 55, column: 29
      fillerE.setPresent();//sysj\Filler\FillerPlant.sysj line: 55, column: 43
      currsigs.addElement(fillerE);
      S2803=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S2803=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread2836(int [] tdone, int [] ends){
        S2801=1;
    S2787=0;
    if(dosUnitValveRetract.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 45, column: 21
      dosUnitFilled.setPresent();//sysj\Filler\FillerPlant.sysj line: 47, column: 21
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

  public void thread2835(int [] tdone, int [] ends){
        S2781=1;
    S2767=0;
    if(dosUnitValveExtend.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 34, column: 21
      dosUnitEvac.setPresent();//sysj\Filler\FillerPlant.sysj line: 36, column: 21
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

  public void thread2834(int [] tdone, int [] ends){
        S2761=1;
    S2751=0;
    if(valveInletOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 22, column: 21
      System.out.println("FillerPlant: valveInletOnOff");//sysj\Filler\FillerPlant.sysj line: 24, column: 21
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

  public void thread2833(int [] tdone, int [] ends){
        S2747=1;
    S2737=0;
    if(valveInjectorOnOff.getprestatus()){//sysj\Filler\FillerPlant.sysj line: 10, column: 21
      System.out.println("FillerPlant: valveInjectorOnOff");//sysj\Filler\FillerPlant.sysj line: 12, column: 21
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
      switch(S2831){
        case 0 : 
          S2831=0;
          break RUN;
        
        case 1 : 
          S2831=2;
          S2831=2;
          thread2833(tdone,ends);
          thread2834(tdone,ends);
          thread2835(tdone,ends);
          thread2836(tdone,ends);
          thread2837(tdone,ends);
          thread2838(tdone,ends);
          int biggest2839 = 0;
          if(ends[2]>=biggest2839){
            biggest2839=ends[2];
          }
          if(ends[3]>=biggest2839){
            biggest2839=ends[3];
          }
          if(ends[4]>=biggest2839){
            biggest2839=ends[4];
          }
          if(ends[5]>=biggest2839){
            biggest2839=ends[5];
          }
          if(ends[6]>=biggest2839){
            biggest2839=ends[6];
          }
          if(ends[7]>=biggest2839){
            biggest2839=ends[7];
          }
          if(biggest2839 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2840(tdone,ends);
          thread2841(tdone,ends);
          thread2842(tdone,ends);
          thread2843(tdone,ends);
          thread2844(tdone,ends);
          thread2845(tdone,ends);
          int biggest2846 = 0;
          if(ends[2]>=biggest2846){
            biggest2846=ends[2];
          }
          if(ends[3]>=biggest2846){
            biggest2846=ends[3];
          }
          if(ends[4]>=biggest2846){
            biggest2846=ends[4];
          }
          if(ends[5]>=biggest2846){
            biggest2846=ends[5];
          }
          if(ends[6]>=biggest2846){
            biggest2846=ends[6];
          }
          if(ends[7]>=biggest2846){
            biggest2846=ends[7];
          }
          if(biggest2846 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2846 == 0){
            S2831=0;
            active[1]=0;
            ends[1]=0;
            S2831=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
          stillWorking.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      stillWorking.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fillerE.setpreclear();
      filler1E.setpreclear();
      filler2E.setpreclear();
      filler3E.setpreclear();
      filler4E.setpreclear();
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
      dummyint = stillWorking.getStatus() ? stillWorking.setprepresent() : stillWorking.setpreclear();
      stillWorking.setpreval(stillWorking.getValue());
      stillWorking.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      fillerE.sethook();
      fillerE.setClear();
      filler1E.sethook();
      filler1E.setClear();
      filler2E.sethook();
      filler2E.setClear();
      filler3E.sethook();
      filler3E.setClear();
      filler4E.sethook();
      filler4E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        stillWorking.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
