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
  private long __start_thread_2;//sysj\Filler\FillerController.sysj line: 35, column: 32
  private int S6515 = 1;
  private int S2171 = 1;
  private int S1079 = 1;
  private int S1078 = 1;
  private int S24 = 1;
  private int S6 = 1;
  private int S11 = 1;
  private int S29 = 1;
  private int S34 = 1;
  private int S70 = 1;
  private int S1084 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread6548(int [] tdone, int [] ends){
        S1084=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 47, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 47, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6547(int [] tdone, int [] ends){
        S1079=1;
    S1078=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread6545(int [] tdone, int [] ends){
        switch(S1084){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 47, column: 17
        currsigs.addElement(stillWorking);
        stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 47, column: 17
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread6543(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread6542(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6540(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6539(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6537(int [] tdone, int [] ends){
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

  public void thread6536(int [] tdone, int [] ends){
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

  public void thread6534(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6533(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6531(int [] tdone, int [] ends){
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

  public void thread6530(int [] tdone, int [] ends){
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

  public void thread6528(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6527(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6525(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread6524(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6522(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6521(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6520(int [] tdone, int [] ends){
        switch(S1079){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1078){
          case 0 : 
            if(bottleAtPos2.getprestatus()){//sysj\Filler\FillerController.sysj line: 13, column: 23
              S1078=1;
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
                  S24=2;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                  S70=0;
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                    ends[2]=3;
                    ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                    ends[2]=4;
                    ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                      System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                      ends[2]=5;
                      ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                      ends[2]=2;
                      tdone[2]=1;
                    }
                    else {
                      S24=3;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S70=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread6521(tdone,ends);
                  thread6522(tdone,ends);
                  int biggest6523 = 0;
                  if(ends[5]>=biggest6523){
                    biggest6523=ends[5];
                  }
                  if(ends[6]>=biggest6523){
                    biggest6523=ends[6];
                  }
                  if(biggest6523 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                thread6524(tdone,ends);
                thread6525(tdone,ends);
                int biggest6526 = 0;
                if(ends[3]>=biggest6526){
                  biggest6526=ends[3];
                }
                if(ends[4]>=biggest6526){
                  biggest6526=ends[4];
                }
                if(biggest6526 == 1){
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
                    S24=2;
                    __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                    S70=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=4;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                        ends[2]=5;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S70=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    thread6527(tdone,ends);
                    thread6528(tdone,ends);
                    int biggest6529 = 0;
                    if(ends[5]>=biggest6529){
                      biggest6529=ends[5];
                    }
                    if(ends[6]>=biggest6529){
                      biggest6529=ends[6];
                    }
                    if(biggest6529 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread6530(tdone,ends);
                  thread6531(tdone,ends);
                  int biggest6532 = 0;
                  if(ends[3]>=biggest6532){
                    biggest6532=ends[3];
                  }
                  if(ends[4]>=biggest6532){
                    biggest6532=ends[4];
                  }
                  if(biggest6532 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest6532 == 0){
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
                      S24=2;
                      __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                      S70=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                        ends[2]=3;
                        ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                        ends[2]=4;
                        ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                          System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                          ends[2]=5;
                          ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                          ends[2]=2;
                          tdone[2]=1;
                        }
                        else {
                          S24=3;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S70=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      thread6533(tdone,ends);
                      thread6534(tdone,ends);
                      int biggest6535 = 0;
                      if(ends[5]>=biggest6535){
                        biggest6535=ends[5];
                      }
                      if(ends[6]>=biggest6535){
                        biggest6535=ends[6];
                      }
                      if(biggest6535 == 1){
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
                  S24=2;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                  S70=0;
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                    ends[2]=3;
                    ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                    ends[2]=4;
                    ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                      System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                      ends[2]=5;
                      ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                      ends[2]=2;
                      tdone[2]=1;
                    }
                    else {
                      S24=3;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S70=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread6536(tdone,ends);
                  thread6537(tdone,ends);
                  int biggest6538 = 0;
                  if(ends[5]>=biggest6538){
                    biggest6538=ends[5];
                  }
                  if(ends[6]>=biggest6538){
                    biggest6538=ends[6];
                  }
                  if(biggest6538 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest6538 == 0){
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
                    S24=2;
                    __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                    S70=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=4;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                        ends[2]=5;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S70=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 2 : 
                switch(S70){
                  case 0 : 
                    S70=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=4;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                        ends[2]=5;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S70=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S70=1;
                    S70=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=4;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                        ends[2]=5;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S70=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 3 : 
                S24=3;
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
                    S24=2;
                    __start_thread_2 = com.systemj.Timer.getMs();//sysj\Filler\FillerController.sysj line: 35, column: 32
                    S70=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (1) * 1000){//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=3;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 32
                      ends[2]=4;
                      ;//sysj\Filler\FillerController.sysj line: 35, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 36, column: 28
                        System.out.println("exiting");//sysj\Filler\FillerController.sysj line: 37, column: 29
                        ends[2]=5;
                        ;//sysj\Filler\FillerController.sysj line: 14, column: 17
                        ends[2]=2;
                        tdone[2]=1;
                      }
                      else {
                        S24=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S70=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    thread6539(tdone,ends);
                    thread6540(tdone,ends);
                    int biggest6541 = 0;
                    if(ends[5]>=biggest6541){
                      biggest6541=ends[5];
                    }
                    if(ends[6]>=biggest6541){
                      biggest6541=ends[6];
                    }
                    if(biggest6541 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread6542(tdone,ends);
                  thread6543(tdone,ends);
                  int biggest6544 = 0;
                  if(ends[3]>=biggest6544){
                    biggest6544=ends[3];
                  }
                  if(ends[4]>=biggest6544){
                    biggest6544=ends[4];
                  }
                  if(biggest6544 == 1){
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

  public void thread6518(int [] tdone, int [] ends){
        S1084=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 47, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 47, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6517(int [] tdone, int [] ends){
        S1079=1;
    S1078=0;
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
      switch(S6515){
        case 0 : 
          S6515=0;
          break RUN;
        
        case 1 : 
          S6515=2;
          S6515=2;
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
          currsigs.addElement(filler_1);
          filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
          S2171=0;
          thread6517(tdone,ends);
          thread6518(tdone,ends);
          int biggest6519 = 0;
          if(ends[2]>=biggest6519){
            biggest6519=ends[2];
          }
          if(ends[7]>=biggest6519){
            biggest6519=ends[7];
          }
          if(biggest6519 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          switch(S2171){
            case 0 : 
              thread6520(tdone,ends);
              thread6545(tdone,ends);
              int biggest6546 = 0;
              if(ends[2]>=biggest6546){
                biggest6546=ends[2];
              }
              if(ends[7]>=biggest6546){
                biggest6546=ends[7];
              }
              if(biggest6546 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest6546 == 2){
                ends[1]=2;
                ;//sysj\Filler\FillerController.sysj line: 11, column: 9
                System.out.println("Done at pos 2");//sysj\Filler\FillerController.sysj line: 50, column: 9
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 51, column: 9
                currsigs.addElement(doneAtPos2);
                S2171=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest6546 == 0){
                System.out.println("Done at pos 2");//sysj\Filler\FillerController.sysj line: 50, column: 9
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 51, column: 9
                currsigs.addElement(doneAtPos2);
                S2171=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S2171=1;
              filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
              currsigs.addElement(filler_1);
              filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
              S2171=0;
              thread6547(tdone,ends);
              thread6548(tdone,ends);
              int biggest6549 = 0;
              if(ends[2]>=biggest6549){
                biggest6549=ends[2];
              }
              if(ends[7]>=biggest6549){
                biggest6549=ends[7];
              }
              if(biggest6549 == 1){
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
