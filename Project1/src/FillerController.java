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
  public Signal fillAmmount1 = new Signal("fillAmmount1", Signal.INPUT);
  public Signal fillAmmount2 = new Signal("fillAmmount2", Signal.INPUT);
  public Signal fillAmmount3 = new Signal("fillAmmount3", Signal.INPUT);
  public Signal fillAmmount4 = new Signal("fillAmmount4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal doneAtPos2 = new Signal("doneAtPos2", Signal.OUTPUT);
  public Signal stillWorking = new Signal("stillWorking", Signal.OUTPUT);
  private Signal filler_1;
  private int S2699 = 1;
  private int S899 = 1;
  private int S443 = 1;
  private int S442 = 1;
  private int S24 = 1;
  private int S6 = 1;
  private int S11 = 1;
  private int S29 = 1;
  private int S34 = 1;
  private int S448 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2732(int [] tdone, int [] ends){
        S448=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 42, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 42, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2731(int [] tdone, int [] ends){
        S443=1;
    S442=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread2729(int [] tdone, int [] ends){
        switch(S448){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 42, column: 17
        currsigs.addElement(stillWorking);
        stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 42, column: 17
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread2727(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2726(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2724(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2723(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2721(int [] tdone, int [] ends){
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

  public void thread2720(int [] tdone, int [] ends){
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

  public void thread2718(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2717(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2715(int [] tdone, int [] ends){
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

  public void thread2714(int [] tdone, int [] ends){
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

  public void thread2712(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2711(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2709(int [] tdone, int [] ends){
        S11=1;
    dosUnitValveRetract.setPresent();//sysj\Filler\FillerController.sysj line: 20, column: 30
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2708(int [] tdone, int [] ends){
        S6=1;
    valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 18, column: 30
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2706(int [] tdone, int [] ends){
        S34=1;
    dosUnitValveExtend.setPresent();//sysj\Filler\FillerController.sysj line: 25, column: 30
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2705(int [] tdone, int [] ends){
        S29=1;
    valveInletOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 23, column: 30
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2704(int [] tdone, int [] ends){
        switch(S443){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S442){
          case 0 : 
            if(bottleAtPos2.getprestatus()){//sysj\Filler\FillerController.sysj line: 13, column: 23
              S442=1;
              valveInjectorOnOff.setPresent();//sysj\Filler\FillerController.sysj line: 16, column: 25
              currsigs.addElement(valveInjectorOnOff);
              S24=0;
              if((dosUnitFilled.getprestatus())){//sysj\Filler\FillerController.sysj line: 17, column: 40
                S24=1;
                if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                    System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                  }
                  else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                      System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                    }
                    else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                        System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                          System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                        }
                      }
                    }
                  }
                  filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                  currsigs.addElement(filler_1);
                  filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                  thread2705(tdone,ends);
                  thread2706(tdone,ends);
                  int biggest2707 = 0;
                  if(ends[5]>=biggest2707){
                    biggest2707=ends[5];
                  }
                  if(ends[6]>=biggest2707){
                    biggest2707=ends[6];
                  }
                  if(biggest2707 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                thread2708(tdone,ends);
                thread2709(tdone,ends);
                int biggest2710 = 0;
                if(ends[3]>=biggest2710){
                  biggest2710=ends[3];
                }
                if(ends[4]>=biggest2710){
                  biggest2710=ends[4];
                }
                if(biggest2710 == 1){
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
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                    thread2711(tdone,ends);
                    thread2712(tdone,ends);
                    int biggest2713 = 0;
                    if(ends[5]>=biggest2713){
                      biggest2713=ends[5];
                    }
                    if(ends[6]>=biggest2713){
                      biggest2713=ends[6];
                    }
                    if(biggest2713 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread2714(tdone,ends);
                  thread2715(tdone,ends);
                  int biggest2716 = 0;
                  if(ends[3]>=biggest2716){
                    biggest2716=ends[3];
                  }
                  if(ends[4]>=biggest2716){
                    biggest2716=ends[4];
                  }
                  if(biggest2716 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest2716 == 0){
                    S24=1;
                    if((dosUnitEvac.getprestatus())){//sysj\Filler\FillerController.sysj line: 22, column: 40
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                        System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                      }
                      else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                          System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                            System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                          }
                          else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                            if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                              System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                            }
                          }
                        }
                      }
                      filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                      currsigs.addElement(filler_1);
                      filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                      thread2717(tdone,ends);
                      thread2718(tdone,ends);
                      int biggest2719 = 0;
                      if(ends[5]>=biggest2719){
                        biggest2719=ends[5];
                      }
                      if(ends[6]>=biggest2719){
                        biggest2719=ends[6];
                      }
                      if(biggest2719 == 1){
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
                    System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                  }
                  else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                      System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                    }
                    else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                        System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                          System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                        }
                      }
                    }
                  }
                  filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                  currsigs.addElement(filler_1);
                  filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                  if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                  thread2720(tdone,ends);
                  thread2721(tdone,ends);
                  int biggest2722 = 0;
                  if(ends[5]>=biggest2722){
                    biggest2722=ends[5];
                  }
                  if(ends[6]>=biggest2722){
                    biggest2722=ends[6];
                  }
                  if(biggest2722 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest2722 == 0){
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 1) {//sysj\Filler\FillerController.sysj line: 28, column: 50
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                      System.out.println("Filler: 1, Fill Percent: " + (Integer)(fillAmmount1.getpreval() == null ? 0 : ((Integer)fillAmmount1.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 28, column: 51
                    }
                    else {//sysj\Filler\FillerController.sysj line: 28, column: 25
                      if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 2) {//sysj\Filler\FillerController.sysj line: 29, column: 55
                        System.out.println("Filler: 2, Fill Percent: " + (Integer)(fillAmmount2.getpreval() == null ? 0 : ((Integer)fillAmmount2.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 29, column: 56
                      }
                      else {//sysj\Filler\FillerController.sysj line: 29, column: 30
                        if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 3) {//sysj\Filler\FillerController.sysj line: 30, column: 55
                          System.out.println("Filler: 3, Fill Percent: " + (Integer)(fillAmmount3.getpreval() == null ? 0 : ((Integer)fillAmmount3.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 30, column: 56
                        }
                        else {//sysj\Filler\FillerController.sysj line: 30, column: 30
                          if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) == 4) {//sysj\Filler\FillerController.sysj line: 31, column: 55
                            System.out.println("Filler: 4, Fill Percent: " + (Integer)(fillAmmount4.getpreval() == null ? 0 : ((Integer)fillAmmount4.getpreval()).intValue()) + "%");//sysj\Filler\FillerController.sysj line: 31, column: 56
                          }
                        }
                      }
                    }
                    filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 33, column: 25
                    currsigs.addElement(filler_1);
                    filler_1.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) + 1);//sysj\Filler\FillerController.sysj line: 33, column: 25
                    if((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()) >= 4){//sysj\Filler\FillerController.sysj line: 34, column: 28
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
                    thread2723(tdone,ends);
                    thread2724(tdone,ends);
                    int biggest2725 = 0;
                    if(ends[5]>=biggest2725){
                      biggest2725=ends[5];
                    }
                    if(ends[6]>=biggest2725){
                      biggest2725=ends[6];
                    }
                    if(biggest2725 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  thread2726(tdone,ends);
                  thread2727(tdone,ends);
                  int biggest2728 = 0;
                  if(ends[3]>=biggest2728){
                    biggest2728=ends[3];
                  }
                  if(ends[4]>=biggest2728){
                    biggest2728=ends[4];
                  }
                  if(biggest2728 == 1){
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

  public void thread2702(int [] tdone, int [] ends){
        S448=1;
    stillWorking.setPresent();//sysj\Filler\FillerController.sysj line: 42, column: 17
    currsigs.addElement(stillWorking);
    stillWorking.setValue((Integer)(filler_1.getpreval() == null ? 0 : ((Integer)filler_1.getpreval()).intValue()));//sysj\Filler\FillerController.sysj line: 42, column: 17
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2701(int [] tdone, int [] ends){
        S443=1;
    S442=0;
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
      switch(S2699){
        case 0 : 
          S2699=0;
          break RUN;
        
        case 1 : 
          S2699=2;
          S2699=2;
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
          currsigs.addElement(filler_1);
          filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
          S899=0;
          thread2701(tdone,ends);
          thread2702(tdone,ends);
          int biggest2703 = 0;
          if(ends[2]>=biggest2703){
            biggest2703=ends[2];
          }
          if(ends[7]>=biggest2703){
            biggest2703=ends[7];
          }
          if(biggest2703 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          filler_1.setClear();//sysj\Filler\FillerController.sysj line: 8, column: 5
          switch(S899){
            case 0 : 
              thread2704(tdone,ends);
              thread2729(tdone,ends);
              int biggest2730 = 0;
              if(ends[2]>=biggest2730){
                biggest2730=ends[2];
              }
              if(ends[7]>=biggest2730){
                biggest2730=ends[7];
              }
              if(biggest2730 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              if(biggest2730 == 2){
                ends[1]=2;
                ;//sysj\Filler\FillerController.sysj line: 11, column: 9
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 45, column: 9
                currsigs.addElement(doneAtPos2);
                S899=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest2730 == 0){
                doneAtPos2.setPresent();//sysj\Filler\FillerController.sysj line: 45, column: 9
                currsigs.addElement(doneAtPos2);
                S899=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S899=1;
              filler_1.setPresent();//sysj\Filler\FillerController.sysj line: 10, column: 9
              currsigs.addElement(filler_1);
              filler_1.setValue(1);//sysj\Filler\FillerController.sysj line: 10, column: 9
              S899=0;
              thread2731(tdone,ends);
              thread2732(tdone,ends);
              int biggest2733 = 0;
              if(ends[2]>=biggest2733){
                biggest2733=ends[2];
              }
              if(ends[7]>=biggest2733){
                biggest2733=ends[7];
              }
              if(biggest2733 == 1){
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
          fillAmmount1.gethook();
          fillAmmount2.gethook();
          fillAmmount3.gethook();
          fillAmmount4.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fillAmmount1.setpreclear();
      fillAmmount2.setpreclear();
      fillAmmount3.setpreclear();
      fillAmmount4.setpreclear();
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
      dummyint = fillAmmount1.getStatus() ? fillAmmount1.setprepresent() : fillAmmount1.setpreclear();
      fillAmmount1.setpreval(fillAmmount1.getValue());
      fillAmmount1.setClear();
      dummyint = fillAmmount2.getStatus() ? fillAmmount2.setprepresent() : fillAmmount2.setpreclear();
      fillAmmount2.setpreval(fillAmmount2.getValue());
      fillAmmount2.setClear();
      dummyint = fillAmmount3.getStatus() ? fillAmmount3.setprepresent() : fillAmmount3.setpreclear();
      fillAmmount3.setpreval(fillAmmount3.getValue());
      fillAmmount3.setClear();
      dummyint = fillAmmount4.getStatus() ? fillAmmount4.setprepresent() : fillAmmount4.setpreclear();
      fillAmmount4.setpreval(fillAmmount4.getValue());
      fillAmmount4.setClear();
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
        fillAmmount1.gethook();
        fillAmmount2.gethook();
        fillAmmount3.gethook();
        fillAmmount4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
