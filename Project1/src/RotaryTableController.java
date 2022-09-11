import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryTableController extends ClockDomain{
  public RotaryTableController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos1RT = new Signal("bottleAtPos1RT", Signal.INPUT);
  public Signal bottleAtPos2RT = new Signal("bottleAtPos2RT", Signal.INPUT);
  public Signal bottleAtPos3RT = new Signal("bottleAtPos3RT", Signal.INPUT);
  public Signal bottleAtPos4RT = new Signal("bottleAtPos4RT", Signal.INPUT);
  public Signal bottleAtPos5RT = new Signal("bottleAtPos5RT", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal doneAtPos2 = new Signal("doneAtPos2", Signal.INPUT);
  public Signal doneAtPos3 = new Signal("doneAtPos3", Signal.INPUT);
  public Signal doneAtPos4 = new Signal("doneAtPos4", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal rotaryTableTriggerCV = new Signal("rotaryTableTriggerCV", Signal.OUTPUT);
  private long __start_thread_4;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
  private long __start_thread_6;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
  private long __start_thread_8;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
  private long __start_thread_10;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
  private int S1811 = 1;
  private int S1801 = 1;
  private int S47 = 1;
  private int S5 = 1;
  private int S21 = 1;
  private int S7 = 1;
  private int S52 = 1;
  private int S68 = 1;
  private int S167 = 1;
  private int S183 = 1;
  private int S351 = 1;
  private int S367 = 1;
  private int S1809 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread1895(int [] tdone, int [] ends){
        switch(S1809){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 38, column: 24
          rotaryTableTriggerCV.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 38, column: 44
          currsigs.addElement(rotaryTableTriggerCV);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread1893(int [] tdone, int [] ends){
        switch(S367){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
          ends[10]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
          ends[10]=2;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread1892(int [] tdone, int [] ends){
        switch(S351){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread1890(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1889(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1887(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1886(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1884(int [] tdone, int [] ends){
        switch(S183){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
          ends[8]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
          ends[8]=2;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread1883(int [] tdone, int [] ends){
        switch(S167){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread1881(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1880(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1878(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1877(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1875(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1874(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1872(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1871(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1869(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1868(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1866(int [] tdone, int [] ends){
        switch(S68){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
          ends[6]=3;
          ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
          ends[6]=2;
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

  public void thread1865(int [] tdone, int [] ends){
        switch(S52){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread1863(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1862(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1860(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1859(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1857(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1856(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1854(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1853(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1851(int [] tdone, int [] ends){
        S68=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=2;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1850(int [] tdone, int [] ends){
        S52=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1848(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1847(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1845(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1844(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1842(int [] tdone, int [] ends){
        S68=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=2;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1841(int [] tdone, int [] ends){
        S52=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1839(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S7){
          case 0 : 
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=3;
              ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S7=1;
            S7=0;
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=3;
              ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              S7=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1838(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 7
        currsigs.addElement(rotaryTableTrigger);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread1836(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1835(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1833(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1832(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1830(int [] tdone, int [] ends){
        S68=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=2;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1829(int [] tdone, int [] ends){
        S52=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1827(int [] tdone, int [] ends){
        S367=1;
    __start_thread_10 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_10 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 37
      ends[10]=2;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1826(int [] tdone, int [] ends){
        S351=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 30, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1824(int [] tdone, int [] ends){
        S183=1;
    __start_thread_8 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_8 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 37
      ends[8]=2;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1823(int [] tdone, int [] ends){
        S167=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 24, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1821(int [] tdone, int [] ends){
        S68=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 37
      ends[6]=2;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1820(int [] tdone, int [] ends){
        S52=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 18, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1818(int [] tdone, int [] ends){
        S21=1;
    __start_thread_4 = com.systemj.Timer.getMs();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
    S7=0;
    if(com.systemj.Timer.getMs() - __start_thread_4 >= (0.5) * 1000){//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
      ends[4]=3;
      ;//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 37
      ends[4]=2;
      tdone[4]=1;
    }
    else {
      S7=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1817(int [] tdone, int [] ends){
        S5=1;
    rotaryTableTrigger.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 12, column: 7
    currsigs.addElement(rotaryTableTrigger);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1816(int [] tdone, int [] ends){
        switch(S1801){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S47){
          case 0 : 
            if(bottleAtPos1RT.getprestatus() && !capOnBottleAtPos1.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 9, column: 10
              S47=1;
              thread1817(tdone,ends);
              thread1818(tdone,ends);
              int biggest1819 = 0;
              if(ends[3]>=biggest1819){
                biggest1819=ends[3];
              }
              if(ends[4]>=biggest1819){
                biggest1819=ends[4];
              }
              if(biggest1819 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1819 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 11, column: 5
                S47=2;
                thread1820(tdone,ends);
                thread1821(tdone,ends);
                int biggest1822 = 0;
                if(ends[5]>=biggest1822){
                  biggest1822=ends[5];
                }
                if(ends[6]>=biggest1822){
                  biggest1822=ends[6];
                }
                if(biggest1822 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1822 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                  S47=3;
                  thread1823(tdone,ends);
                  thread1824(tdone,ends);
                  int biggest1825 = 0;
                  if(ends[7]>=biggest1825){
                    biggest1825=ends[7];
                  }
                  if(ends[8]>=biggest1825){
                    biggest1825=ends[8];
                  }
                  if(biggest1825 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1825 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                    S47=4;
                    thread1826(tdone,ends);
                    thread1827(tdone,ends);
                    int biggest1828 = 0;
                    if(ends[9]>=biggest1828){
                      biggest1828=ends[9];
                    }
                    if(ends[10]>=biggest1828){
                      biggest1828=ends[10];
                    }
                    if(biggest1828 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    if(biggest1828 == 2){
                      ends[2]=2;
                      ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                      S47=5;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
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
            if(bottleAtPos2RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 10, column: 10
              S47=2;
              thread1829(tdone,ends);
              thread1830(tdone,ends);
              int biggest1831 = 0;
              if(ends[5]>=biggest1831){
                biggest1831=ends[5];
              }
              if(ends[6]>=biggest1831){
                biggest1831=ends[6];
              }
              if(biggest1831 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1831 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                S47=3;
                thread1832(tdone,ends);
                thread1833(tdone,ends);
                int biggest1834 = 0;
                if(ends[7]>=biggest1834){
                  biggest1834=ends[7];
                }
                if(ends[8]>=biggest1834){
                  biggest1834=ends[8];
                }
                if(biggest1834 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1834 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                  S47=4;
                  thread1835(tdone,ends);
                  thread1836(tdone,ends);
                  int biggest1837 = 0;
                  if(ends[9]>=biggest1837){
                    biggest1837=ends[9];
                  }
                  if(ends[10]>=biggest1837){
                    biggest1837=ends[10];
                  }
                  if(biggest1837 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1837 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                    S47=5;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
            else {
              thread1838(tdone,ends);
              thread1839(tdone,ends);
              int biggest1840 = 0;
              if(ends[3]>=biggest1840){
                biggest1840=ends[3];
              }
              if(ends[4]>=biggest1840){
                biggest1840=ends[4];
              }
              if(biggest1840 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1840 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 11, column: 5
                S47=2;
                thread1841(tdone,ends);
                thread1842(tdone,ends);
                int biggest1843 = 0;
                if(ends[5]>=biggest1843){
                  biggest1843=ends[5];
                }
                if(ends[6]>=biggest1843){
                  biggest1843=ends[6];
                }
                if(biggest1843 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1843 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                  S47=3;
                  thread1844(tdone,ends);
                  thread1845(tdone,ends);
                  int biggest1846 = 0;
                  if(ends[7]>=biggest1846){
                    biggest1846=ends[7];
                  }
                  if(ends[8]>=biggest1846){
                    biggest1846=ends[8];
                  }
                  if(biggest1846 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1846 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                    S47=4;
                    thread1847(tdone,ends);
                    thread1848(tdone,ends);
                    int biggest1849 = 0;
                    if(ends[9]>=biggest1849){
                      biggest1849=ends[9];
                    }
                    if(ends[10]>=biggest1849){
                      biggest1849=ends[10];
                    }
                    if(biggest1849 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    if(biggest1849 == 2){
                      ends[2]=2;
                      ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                      S47=5;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              //FINXME code
              if(biggest1840 == 0){
                S47=2;
                thread1850(tdone,ends);
                thread1851(tdone,ends);
                int biggest1852 = 0;
                if(ends[5]>=biggest1852){
                  biggest1852=ends[5];
                }
                if(ends[6]>=biggest1852){
                  biggest1852=ends[6];
                }
                if(biggest1852 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1852 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                  S47=3;
                  thread1853(tdone,ends);
                  thread1854(tdone,ends);
                  int biggest1855 = 0;
                  if(ends[7]>=biggest1855){
                    biggest1855=ends[7];
                  }
                  if(ends[8]>=biggest1855){
                    biggest1855=ends[8];
                  }
                  if(biggest1855 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1855 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                    S47=4;
                    thread1856(tdone,ends);
                    thread1857(tdone,ends);
                    int biggest1858 = 0;
                    if(ends[9]>=biggest1858){
                      biggest1858=ends[9];
                    }
                    if(ends[10]>=biggest1858){
                      biggest1858=ends[10];
                    }
                    if(biggest1858 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    if(biggest1858 == 2){
                      ends[2]=2;
                      ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                      S47=5;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            break;
          
          case 2 : 
            if(bottleAtPos3RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 16, column: 10
              S47=3;
              thread1859(tdone,ends);
              thread1860(tdone,ends);
              int biggest1861 = 0;
              if(ends[7]>=biggest1861){
                biggest1861=ends[7];
              }
              if(ends[8]>=biggest1861){
                biggest1861=ends[8];
              }
              if(biggest1861 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1861 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                S47=4;
                thread1862(tdone,ends);
                thread1863(tdone,ends);
                int biggest1864 = 0;
                if(ends[9]>=biggest1864){
                  biggest1864=ends[9];
                }
                if(ends[10]>=biggest1864){
                  biggest1864=ends[10];
                }
                if(biggest1864 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1864 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                  S47=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              thread1865(tdone,ends);
              thread1866(tdone,ends);
              int biggest1867 = 0;
              if(ends[5]>=biggest1867){
                biggest1867=ends[5];
              }
              if(ends[6]>=biggest1867){
                biggest1867=ends[6];
              }
              if(biggest1867 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1867 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 17, column: 5
                S47=3;
                thread1868(tdone,ends);
                thread1869(tdone,ends);
                int biggest1870 = 0;
                if(ends[7]>=biggest1870){
                  biggest1870=ends[7];
                }
                if(ends[8]>=biggest1870){
                  biggest1870=ends[8];
                }
                if(biggest1870 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1870 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                  S47=4;
                  thread1871(tdone,ends);
                  thread1872(tdone,ends);
                  int biggest1873 = 0;
                  if(ends[9]>=biggest1873){
                    biggest1873=ends[9];
                  }
                  if(ends[10]>=biggest1873){
                    biggest1873=ends[10];
                  }
                  if(biggest1873 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1873 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                    S47=5;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              //FINXME code
              if(biggest1867 == 0){
                S47=3;
                thread1874(tdone,ends);
                thread1875(tdone,ends);
                int biggest1876 = 0;
                if(ends[7]>=biggest1876){
                  biggest1876=ends[7];
                }
                if(ends[8]>=biggest1876){
                  biggest1876=ends[8];
                }
                if(biggest1876 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1876 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                  S47=4;
                  thread1877(tdone,ends);
                  thread1878(tdone,ends);
                  int biggest1879 = 0;
                  if(ends[9]>=biggest1879){
                    biggest1879=ends[9];
                  }
                  if(ends[10]>=biggest1879){
                    biggest1879=ends[10];
                  }
                  if(biggest1879 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  if(biggest1879 == 2){
                    ends[2]=2;
                    ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                    S47=5;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
            break;
          
          case 3 : 
            if(bottleAtPos4RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 22, column: 10
              S47=4;
              thread1880(tdone,ends);
              thread1881(tdone,ends);
              int biggest1882 = 0;
              if(ends[9]>=biggest1882){
                biggest1882=ends[9];
              }
              if(ends[10]>=biggest1882){
                biggest1882=ends[10];
              }
              if(biggest1882 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1882 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                S47=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              thread1883(tdone,ends);
              thread1884(tdone,ends);
              int biggest1885 = 0;
              if(ends[7]>=biggest1885){
                biggest1885=ends[7];
              }
              if(ends[8]>=biggest1885){
                biggest1885=ends[8];
              }
              if(biggest1885 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1885 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 23, column: 5
                S47=4;
                thread1886(tdone,ends);
                thread1887(tdone,ends);
                int biggest1888 = 0;
                if(ends[9]>=biggest1888){
                  biggest1888=ends[9];
                }
                if(ends[10]>=biggest1888){
                  biggest1888=ends[10];
                }
                if(biggest1888 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1888 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                  S47=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              //FINXME code
              if(biggest1885 == 0){
                S47=4;
                thread1889(tdone,ends);
                thread1890(tdone,ends);
                int biggest1891 = 0;
                if(ends[9]>=biggest1891){
                  biggest1891=ends[9];
                }
                if(ends[10]>=biggest1891){
                  biggest1891=ends[10];
                }
                if(biggest1891 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest1891 == 2){
                  ends[2]=2;
                  ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                  S47=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(bottleAtPos5RT.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 28, column: 10
              S47=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread1892(tdone,ends);
              thread1893(tdone,ends);
              int biggest1894 = 0;
              if(ends[9]>=biggest1894){
                biggest1894=ends[9];
              }
              if(ends[10]>=biggest1894){
                biggest1894=ends[10];
              }
              if(biggest1894 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              if(biggest1894 == 2){
                ends[2]=2;
                ;//sysj\RotaryTable\RotaryTableController.sysj line: 29, column: 5
                S47=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest1894 == 0){
                S47=5;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 5 : 
            S47=5;
            S47=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1814(int [] tdone, int [] ends){
        S1809=1;
    if(rotaryTableTrigger.getprestatus()){//sysj\RotaryTable\RotaryTableController.sysj line: 38, column: 24
      rotaryTableTriggerCV.setPresent();//sysj\RotaryTable\RotaryTableController.sysj line: 38, column: 44
      currsigs.addElement(rotaryTableTriggerCV);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1813(int [] tdone, int [] ends){
        S1801=1;
    S47=0;
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
      switch(S1811){
        case 0 : 
          S1811=0;
          break RUN;
        
        case 1 : 
          S1811=2;
          S1811=2;
          thread1813(tdone,ends);
          thread1814(tdone,ends);
          int biggest1815 = 0;
          if(ends[2]>=biggest1815){
            biggest1815=ends[2];
          }
          if(ends[11]>=biggest1815){
            biggest1815=ends[11];
          }
          if(biggest1815 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1816(tdone,ends);
          thread1895(tdone,ends);
          int biggest1896 = 0;
          if(ends[2]>=biggest1896){
            biggest1896=ends[2];
          }
          if(ends[11]>=biggest1896){
            biggest1896=ends[11];
          }
          if(biggest1896 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1896 == 0){
            S1811=0;
            active[1]=0;
            ends[1]=0;
            S1811=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          tableAlignedWithSensor.gethook();
          bottleAtPos1RT.gethook();
          bottleAtPos2RT.gethook();
          bottleAtPos3RT.gethook();
          bottleAtPos4RT.gethook();
          bottleAtPos5RT.gethook();
          capOnBottleAtPos1.gethook();
          doneAtPos2.gethook();
          doneAtPos3.gethook();
          doneAtPos4.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1RT.setpreclear();
      bottleAtPos2RT.setpreclear();
      bottleAtPos3RT.setpreclear();
      bottleAtPos4RT.setpreclear();
      bottleAtPos5RT.setpreclear();
      capOnBottleAtPos1.setpreclear();
      doneAtPos2.setpreclear();
      doneAtPos3.setpreclear();
      doneAtPos4.setpreclear();
      rotaryTableTrigger.setpreclear();
      rotaryTableTriggerCV.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos1RT.getStatus() ? bottleAtPos1RT.setprepresent() : bottleAtPos1RT.setpreclear();
      bottleAtPos1RT.setpreval(bottleAtPos1RT.getValue());
      bottleAtPos1RT.setClear();
      dummyint = bottleAtPos2RT.getStatus() ? bottleAtPos2RT.setprepresent() : bottleAtPos2RT.setpreclear();
      bottleAtPos2RT.setpreval(bottleAtPos2RT.getValue());
      bottleAtPos2RT.setClear();
      dummyint = bottleAtPos3RT.getStatus() ? bottleAtPos3RT.setprepresent() : bottleAtPos3RT.setpreclear();
      bottleAtPos3RT.setpreval(bottleAtPos3RT.getValue());
      bottleAtPos3RT.setClear();
      dummyint = bottleAtPos4RT.getStatus() ? bottleAtPos4RT.setprepresent() : bottleAtPos4RT.setpreclear();
      bottleAtPos4RT.setpreval(bottleAtPos4RT.getValue());
      bottleAtPos4RT.setClear();
      dummyint = bottleAtPos5RT.getStatus() ? bottleAtPos5RT.setprepresent() : bottleAtPos5RT.setpreclear();
      bottleAtPos5RT.setpreval(bottleAtPos5RT.getValue());
      bottleAtPos5RT.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = doneAtPos2.getStatus() ? doneAtPos2.setprepresent() : doneAtPos2.setpreclear();
      doneAtPos2.setpreval(doneAtPos2.getValue());
      doneAtPos2.setClear();
      dummyint = doneAtPos3.getStatus() ? doneAtPos3.setprepresent() : doneAtPos3.setpreclear();
      doneAtPos3.setpreval(doneAtPos3.getValue());
      doneAtPos3.setClear();
      dummyint = doneAtPos4.getStatus() ? doneAtPos4.setprepresent() : doneAtPos4.setpreclear();
      doneAtPos4.setpreval(doneAtPos4.getValue());
      doneAtPos4.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      rotaryTableTriggerCV.sethook();
      rotaryTableTriggerCV.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos1RT.gethook();
        bottleAtPos2RT.gethook();
        bottleAtPos3RT.gethook();
        bottleAtPos4RT.gethook();
        bottleAtPos5RT.gethook();
        capOnBottleAtPos1.gethook();
        doneAtPos2.gethook();
        doneAtPos3.gethook();
        doneAtPos4.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
