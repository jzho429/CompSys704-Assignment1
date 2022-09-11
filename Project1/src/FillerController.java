import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal fillAmount1 = new Signal("fillAmount1", Signal.INPUT);
  public Signal fillAmount2 = new Signal("fillAmount2", Signal.INPUT);
  public Signal fillAmount3 = new Signal("fillAmount3", Signal.INPUT);
  public Signal fillAmount4 = new Signal("fillAmount4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal doneAtPos2 = new Signal("doneAtPos2", Signal.OUTPUT);
  public Signal stillWorking = new Signal("stillWorking", Signal.OUTPUT);
  private Signal filler_1;
  private int S2915 = 1;
  private int S971 = 1;
  private int S479 = 1;
  private int S478 = 1;
  private int S24 = 1;
  private int S6 = 1;
  private int S11 = 1;
  private int S29 = 1;
  private int S34 = 1;
  private int S484 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2948(int [] tdone, int [] ends){
        S484=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 46, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 46, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2947(int [] tdone, int [] ends){
        S479=1;
    S478=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread2945(int [] tdone, int [] ends){
        switch(S484){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 46, column: 17
        currsigs.addElement(stillWorking);
        stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 46, column: 17
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread2943(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2942(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2940(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2939(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2937(int [] tdone, int [] ends){
        switch(S34){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
        currsigs.addElement(dosUnitValveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread2936(int [] tdone, int [] ends){
        switch(S29){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
        currsigs.addElement(valveInletOnOff);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread2934(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2933(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2931(int [] tdone, int [] ends){
        switch(S11){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
        currsigs.addElement(dosUnitValveRetract);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread2930(int [] tdone, int [] ends){
        switch(S6){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
        currsigs.addElement(valveInjectorOnOff);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread2928(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2927(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2925(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2924(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2922(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2921(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2920(int [] tdone, int [] ends){
        switch(S479){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S478){
          case 0 : 
            if(bottleAtPos2.getprestatus()){//sysj\Filler\FillerController.sysj line: 13, column: 23
              S478=1;
              valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 16, column: 25
              currsigs.addElement(valveInjectorOnOff);
              S24=0;
              if((dosUnitFilled.getprestatus())){//sysj\Filler\FillerController.sysj line: 17, column: 40
                S24=1;
                if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                    System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                  }
                  else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                      System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                    }
                    else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                        System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                          System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                        }
                      }
                    }
                  }
                  filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                  currsigs.addElement(filler_1);
                  filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                  System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                    System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                    ends[2]=3;
                    ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                    ends[2]=2;
                    tdone[2]=1;
                  }
                  else {
                    S24=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread2921(tdone,ends);
                  thread2922(tdone,ends);
                  int biggest2923 = 0;
                  if(ends[5]>=biggest2923){
                    biggest2923=ends[5];
                  }
                  if(ends[6]>=biggest2923){
                    biggest2923=ends[6];
                  }
                  if(biggest2923 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                thread2924(tdone,ends);
                thread2925(tdone,ends);
                int biggest2926 = 0;
                if(ends[3]>=biggest2926){
                  biggest2926=ends[3];
                }
                if(ends[4]>=biggest2926){
                  biggest2926=ends[4];
                }
                if(biggest2926 == 1){
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
            switch(S24){
              case 0 : 
                if((dosUnitFilled.getprestatus())){//sysj\Filler\FillerController.sysj line: 17, column: 40
                  S24=1;
                  if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                      System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                      ends[2]=2;
                      tdone[2]=1;
                    }
                    else {
                      S24=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    thread2927(tdone,ends);
                    thread2928(tdone,ends);
                    int biggest2929 = 0;
                    if(ends[5]>=biggest2929){
                      biggest2929=ends[5];
                    }
                    if(ends[6]>=biggest2929){
                      biggest2929=ends[6];
                    }
                    if(biggest2929 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread2930(tdone,ends);
                  thread2931(tdone,ends);
                  int biggest2932 = 0;
                  if(ends[3]>=biggest2932){
                    biggest2932=ends[3];
                  }
                  if(ends[4]>=biggest2932){
                    biggest2932=ends[4];
                  }
                  if(biggest2932 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest2932 == 0){
                    S24=1;
                    if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                        System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                      }
                      else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                          System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                            System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                          }
                          else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                            if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                              System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                            }
                          }
                        }
                      }
                      filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                      currsigs.addElement(filler_1);
                      filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                      System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                        ends[2]=3;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=2;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      thread2933(tdone,ends);
                      thread2934(tdone,ends);
                      int biggest2935 = 0;
                      if(ends[5]>=biggest2935){
                        biggest2935=ends[5];
                      }
                      if(ends[6]>=biggest2935){
                        biggest2935=ends[6];
                      }
                      if(biggest2935 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                }
                break;
              
              case 1 : 
                if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                    System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                  }
                  else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                      System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                    }
                    else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                        System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                          System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                        }
                      }
                    }
                  }
                  filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                  currsigs.addElement(filler_1);
                  filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                  System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                    System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                    ends[2]=3;
                    ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                    ends[2]=2;
                    tdone[2]=1;
                  }
                  else {
                    S24=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread2936(tdone,ends);
                  thread2937(tdone,ends);
                  int biggest2938 = 0;
                  if(ends[5]>=biggest2938){
                    biggest2938=ends[5];
                  }
                  if(ends[6]>=biggest2938){
                    biggest2938=ends[6];
                  }
                  if(biggest2938 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest2938 == 0){
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                      System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                      ends[2]=2;
                      tdone[2]=1;
                    }
                    else {
                      S24=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 2 : 
                S24=2;
                valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 16, column: 25
                currsigs.addElement(valveInjectorOnOff);
                S24=0;
                if((dosUnitFilled.getprestatus())){//sysj\Filler\FillerController.sysj line: 17, column: 40
                  S24=1;
                  if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmount1.getpreval() == null ? 0 : ((Integer)fillAmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmount2.getpreval() == null ? 0 : ((Integer)fillAmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmount3.getpreval() == null ? 0 : ((Integer)fillAmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmount4.getpreval() == null ? 0 : ((Integer)fillAmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    System.out.println((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 34, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 35, column: 28
                      System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 36, column: 29
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                      ends[2]=2;
                      tdone[2]=1;
                    }
                    else {
                      S24=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    thread2939(tdone,ends);
                    thread2940(tdone,ends);
                    int biggest2941 = 0;
                    if(ends[5]>=biggest2941){
                      biggest2941=ends[5];
                    }
                    if(ends[6]>=biggest2941){
                      biggest2941=ends[6];
                    }
                    if(biggest2941 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread2942(tdone,ends);
                  thread2943(tdone,ends);
                  int biggest2944 = 0;
                  if(ends[3]>=biggest2944){
                    biggest2944=ends[3];
                  }
                  if(ends[4]>=biggest2944){
                    biggest2944=ends[4];
                  }
                  if(biggest2944 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2918(int [] tdone, int [] ends){
        S484=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 46, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 46, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2917(int [] tdone, int [] ends){
        S479=1;
    S478=0;
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
      switch(S2915){
        case 0 : 
          S2915=0;
          break RUN;
        
        case 1 : 
          S2915=2;
          S2915=2;
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
          currsigs.addElement(filler_1);
          filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
          S971=0;
          thread2917(tdone,ends);
          thread2918(tdone,ends);
          int biggest2919 = 0;
          if(ends[2]>=biggest2919){
            biggest2919=ends[2];
          }
          if(ends[7]>=biggest2919){
            biggest2919=ends[7];
          }
          if(biggest2919 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          switch(S971){
            case 0 : 
              thread2920(tdone,ends);
              thread2945(tdone,ends);
              int biggest2946 = 0;
              if(ends[2]>=biggest2946){
                biggest2946=ends[2];
              }
              if(ends[7]>=biggest2946){
                biggest2946=ends[7];
              }
              if(biggest2946 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest2946 == 2){
                ends[1]=2;
                ;//sysj\Filler\FillerController.sysj line: 11, column: 9
                System.out.println("Done at pos 2");//sysj\Filler\FillerController.sysj line: 49, column: 9
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 50, column: 9
                currsigs.addElement(doneAtPos2);
                S971=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest2946 == 0){
                System.out.println("Done at pos 2");//sysj\Filler\FillerController.sysj line: 49, column: 9
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 50, column: 9
                currsigs.addElement(doneAtPos2);
                S971=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S971=1;
              filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
              currsigs.addElement(filler_1);
              filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
              S971=0;
              thread2947(tdone,ends);
              thread2948(tdone,ends);
              int biggest2949 = 0;
              if(ends[2]>=biggest2949){
                biggest2949=ends[2];
              }
              if(ends[7]>=biggest2949){
                biggest2949=ends[7];
              }
              if(biggest2949 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
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
    filler_1 = new Signal();
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          fillAmount1.gethook();
          fillAmount2.gethook();
          fillAmount3.gethook();
          fillAmount4.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fillAmount1.setpreclear();
      fillAmount2.setpreclear();
      fillAmount3.setpreclear();
      fillAmount4.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      doneAtPos2.setpreclear();
      stillWorking.setpreclear();
      filler_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = fillAmount1.getStatus() ? fillAmount1.setprepresent() : fillAmount1.setpreclear();
      fillAmount1.setpreval(fillAmount1.getValue());
      fillAmount1.setClear();
      dummyint = fillAmount2.getStatus() ? fillAmount2.setprepresent() : fillAmount2.setpreclear();
      fillAmount2.setpreval(fillAmount2.getValue());
      fillAmount2.setClear();
      dummyint = fillAmount3.getStatus() ? fillAmount3.setprepresent() : fillAmount3.setpreclear();
      fillAmount3.setpreval(fillAmount3.getValue());
      fillAmount3.setClear();
      dummyint = fillAmount4.getStatus() ? fillAmount4.setprepresent() : fillAmount4.setpreclear();
      fillAmount4.setpreval(fillAmount4.getValue());
      fillAmount4.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      doneAtPos2.sethook();
      doneAtPos2.setClear();
      stillWorking.sethook();
      stillWorking.setClear();
      filler_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        fillAmount1.gethook();
        fillAmount2.gethook();
        fillAmount3.gethook();
        fillAmount4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
