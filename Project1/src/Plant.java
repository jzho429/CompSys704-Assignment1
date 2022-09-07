import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\LidLoader\LidLoaderPlant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetractedE = new Signal("pusherRetractedE", Signal.OUTPUT);
  public Signal pusherExtendedE = new Signal("pusherExtendedE", Signal.OUTPUT);
  public Signal WPgrippedE = new Signal("WPgrippedE", Signal.OUTPUT);
  public Signal armAtSourceE = new Signal("armAtSourceE", Signal.OUTPUT);
  public Signal armAtDestE = new Signal("armAtDestE", Signal.OUTPUT);
  public Signal emptyE = new Signal("emptyE", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\LidLoader\LidLoaderPlant.sysj line: 82, column: 3
  private int S2167 = 1;
  private int S894 = 1;
  private int S848 = 1;
  private int S947 = 1;
  private int S901 = 1;
  private int S991 = 1;
  private int S961 = 1;
  private int S956 = 1;
  private int S1059 = 1;
  private int S1013 = 1;
  private int S995 = 1;
  private int S1121 = 1;
  private int S1171 = 1;
  private int S1129 = 1;
  private int S1137 = 1;
  private int S1145 = 1;
  private int S1153 = 1;
  private int S1161 = 1;
  private int S1169 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread2194(int [] tdone, int [] ends){
        switch(S1169){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 110, column: 24
          emptyE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 110, column: 31
          currsigs.addElement(emptyE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread2193(int [] tdone, int [] ends){
        switch(S1161){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 108, column: 24
          armAtDestE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 108, column: 35
          currsigs.addElement(armAtDestE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread2192(int [] tdone, int [] ends){
        switch(S1153){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 106, column: 24
          armAtSourceE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 106, column: 37
          currsigs.addElement(armAtSourceE);
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

  public void thread2191(int [] tdone, int [] ends){
        switch(S1145){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 104, column: 24
          WPgrippedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 104, column: 35
          currsigs.addElement(WPgrippedE);
          active[10]=1;
          ends[10]=1;
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

  public void thread2190(int [] tdone, int [] ends){
        switch(S1137){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 102, column: 24
          pusherExtendedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 102, column: 40
          currsigs.addElement(pusherExtendedE);
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
      
    }
  }

  public void thread2189(int [] tdone, int [] ends){
        switch(S1129){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 100, column: 24
          pusherRetractedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 100, column: 41
          currsigs.addElement(pusherRetractedE);
          active[8]=1;
          ends[8]=1;
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

  public void thread2188(int [] tdone, int [] ends){
        switch(S1171){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread2189(tdone,ends);
        thread2190(tdone,ends);
        thread2191(tdone,ends);
        thread2192(tdone,ends);
        thread2193(tdone,ends);
        thread2194(tdone,ends);
        int biggest2195 = 0;
        if(ends[8]>=biggest2195){
          biggest2195=ends[8];
        }
        if(ends[9]>=biggest2195){
          biggest2195=ends[9];
        }
        if(ends[10]>=biggest2195){
          biggest2195=ends[10];
        }
        if(ends[11]>=biggest2195){
          biggest2195=ends[11];
        }
        if(ends[12]>=biggest2195){
          biggest2195=ends[12];
        }
        if(ends[13]>=biggest2195){
          biggest2195=ends[13];
        }
        if(biggest2195 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest2195 == 0){
          S1171=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2187(int [] tdone, int [] ends){
        switch(S1121){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 84, column: 12
          if(capcount_thread_6 > 0) {//sysj\LidLoader\LidLoaderPlant.sysj line: 85, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\LidLoader\LidLoaderPlant.sysj line: 86, column: 6
          }
          if(refill.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\LidLoader\LidLoaderPlant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
              empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
              empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
              currsigs.addElement(empty);
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
        }
        else {
          if(refill.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 88, column: 12
            capcount_thread_6 = 5;//sysj\LidLoader\LidLoaderPlant.sysj line: 89, column: 5
            if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
              empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
              currsigs.addElement(empty);
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
          else {
            if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
              empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
              currsigs.addElement(empty);
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
        }
        break;
      
    }
  }

  public void thread2186(int [] tdone, int [] ends){
        switch(S1059){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1013){
          case 0 : 
            if(empty.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 67, column: 10
              S1013=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S995){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 69, column: 13
                    S995=1;
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
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 70, column: 13
                    capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 72, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\LidLoader\LidLoaderPlant.sysj line: 72, column: 7
                    S995=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 73, column: 13
                    capDec_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 74, column: 7
                    currsigs.addElement(capDec_1);
                    S995=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 77, column: 10
              S1013=0;
              S995=0;
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
        break;
      
    }
  }

  public void thread2185(int [] tdone, int [] ends){
        switch(S991){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S961){
          case 0 : 
            switch(S956){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 47, column: 12
                  S956=1;
                  if(armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 50, column: 14
                    capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 51, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\LidLoader\LidLoaderPlant.sysj line: 51, column: 7
                    S961=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S961=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 48, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S961=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 44, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\LidLoader\LidLoaderPlant.sysj line: 45, column: 8
                    capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
                    S956=0;
                    WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 48, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S961=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S961=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S961=1;
            S961=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 44, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\LidLoader\LidLoaderPlant.sysj line: 45, column: 8
                capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
                S956=0;
                WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 48, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S961=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S961=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2184(int [] tdone, int [] ends){
        switch(S947){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S901){
          case 0 : 
            if(pusherExtend.getprestatus() && enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 31, column: 10
              S901=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 32, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 34, column: 10
              S901=2;
              pusherExtended.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 36, column: 5
              currsigs.addElement(pusherExtended);
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
          
          case 2 : 
            if(!pusherExtend.getprestatus() && enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 35, column: 10
              S901=3;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 36, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 38, column: 10
              S901=0;
              pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 32, column: 5
              currsigs.addElement(pusherRetracted);
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
        break;
      
    }
  }

  public void thread2183(int [] tdone, int [] ends){
        switch(S894){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S848){
          case 0 : 
            if(armSource.getprestatus() && enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 18, column: 10
              S848=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 21, column: 10
              S848=2;
              armAtSource.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 23, column: 5
              currsigs.addElement(armAtSource);
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
          
          case 2 : 
            if(armDest.getprestatus() && enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 22, column: 10
              S848=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 23, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!enable.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 25, column: 10
              S848=0;
              armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 19, column: 5
              currsigs.addElement(armAtDest);
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
          
        }
        break;
      
    }
  }

  public void thread2180(int [] tdone, int [] ends){
        S1169=1;
    if(empty.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 110, column: 24
      emptyE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 110, column: 31
      currsigs.addElement(emptyE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread2179(int [] tdone, int [] ends){
        S1161=1;
    if(armAtDest.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 108, column: 24
      armAtDestE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 108, column: 35
      currsigs.addElement(armAtDestE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread2178(int [] tdone, int [] ends){
        S1153=1;
    if(armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 106, column: 24
      armAtSourceE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 106, column: 37
      currsigs.addElement(armAtSourceE);
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

  public void thread2177(int [] tdone, int [] ends){
        S1145=1;
    if(WPgripped.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 104, column: 24
      WPgrippedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 104, column: 35
      currsigs.addElement(WPgrippedE);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread2176(int [] tdone, int [] ends){
        S1137=1;
    if(pusherExtended.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 102, column: 24
      pusherExtendedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 102, column: 40
      currsigs.addElement(pusherExtendedE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread2175(int [] tdone, int [] ends){
        S1129=1;
    if(pusherRetracted.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 100, column: 24
      pusherRetractedE.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 100, column: 41
      currsigs.addElement(pusherRetractedE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2174(int [] tdone, int [] ends){
        S1171=1;
    thread2175(tdone,ends);
    thread2176(tdone,ends);
    thread2177(tdone,ends);
    thread2178(tdone,ends);
    thread2179(tdone,ends);
    thread2180(tdone,ends);
    int biggest2181 = 0;
    if(ends[8]>=biggest2181){
      biggest2181=ends[8];
    }
    if(ends[9]>=biggest2181){
      biggest2181=ends[9];
    }
    if(ends[10]>=biggest2181){
      biggest2181=ends[10];
    }
    if(ends[11]>=biggest2181){
      biggest2181=ends[11];
    }
    if(ends[12]>=biggest2181){
      biggest2181=ends[12];
    }
    if(ends[13]>=biggest2181){
      biggest2181=ends[13];
    }
    if(biggest2181 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2173(int [] tdone, int [] ends){
        S1121=1;
    capcount_thread_6 = 5;//sysj\LidLoader\LidLoaderPlant.sysj line: 82, column: 3
    if(capDec_1.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 84, column: 12
      if(capcount_thread_6 > 0) {//sysj\LidLoader\LidLoaderPlant.sysj line: 85, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\LidLoader\LidLoaderPlant.sysj line: 86, column: 6
      }
      if(refill.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\LidLoader\LidLoaderPlant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
          empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
          empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
          currsigs.addElement(empty);
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
    }
    else {
      if(refill.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 88, column: 12
        capcount_thread_6 = 5;//sysj\LidLoader\LidLoaderPlant.sysj line: 89, column: 5
        if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
          empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
          currsigs.addElement(empty);
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
      else {
        if(capcount_thread_6 == 0){//sysj\LidLoader\LidLoaderPlant.sysj line: 92, column: 8
          empty.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 93, column: 6
          currsigs.addElement(empty);
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
    }
  }

  public void thread2172(int [] tdone, int [] ends){
        S1059=1;
    S1013=0;
    S995=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2171(int [] tdone, int [] ends){
        S991=1;
    S961=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\LidLoader\LidLoaderPlant.sysj line: 44, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\LidLoader\LidLoaderPlant.sysj line: 45, column: 8
        capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\LidLoader\LidLoaderPlant.sysj line: 46, column: 6
        S956=0;
        WPgripped.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 48, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S961=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S961=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2170(int [] tdone, int [] ends){
        S947=1;
    S901=0;
    pusherRetracted.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 32, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2169(int [] tdone, int [] ends){
        S894=1;
    S848=0;
    armAtDest.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 19, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S2167){
        case 0 : 
          S2167=0;
          break RUN;
        
        case 1 : 
          S2167=2;
          S2167=2;
          new Thread(new GUI()).start();//sysj\LidLoader\LidLoaderPlant.sysj line: 11, column: 2
          capDec_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 14, column: 2
          capPos_1.setPresent();//sysj\LidLoader\LidLoaderPlant.sysj line: 15, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\LidLoader\LidLoaderPlant.sysj line: 15, column: 2
          thread2169(tdone,ends);
          thread2170(tdone,ends);
          thread2171(tdone,ends);
          thread2172(tdone,ends);
          thread2173(tdone,ends);
          thread2174(tdone,ends);
          int biggest2182 = 0;
          if(ends[2]>=biggest2182){
            biggest2182=ends[2];
          }
          if(ends[3]>=biggest2182){
            biggest2182=ends[3];
          }
          if(ends[4]>=biggest2182){
            biggest2182=ends[4];
          }
          if(ends[5]>=biggest2182){
            biggest2182=ends[5];
          }
          if(ends[6]>=biggest2182){
            biggest2182=ends[6];
          }
          if(ends[7]>=biggest2182){
            biggest2182=ends[7];
          }
          if(biggest2182 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 13, column: 2
          capPos_1.setClear();//sysj\LidLoader\LidLoaderPlant.sysj line: 14, column: 2
          thread2183(tdone,ends);
          thread2184(tdone,ends);
          thread2185(tdone,ends);
          thread2186(tdone,ends);
          thread2187(tdone,ends);
          thread2188(tdone,ends);
          int biggest2196 = 0;
          if(ends[2]>=biggest2196){
            biggest2196=ends[2];
          }
          if(ends[3]>=biggest2196){
            biggest2196=ends[3];
          }
          if(ends[4]>=biggest2196){
            biggest2196=ends[4];
          }
          if(ends[5]>=biggest2196){
            biggest2196=ends[5];
          }
          if(ends[6]>=biggest2196){
            biggest2196=ends[6];
          }
          if(ends[7]>=biggest2196){
            biggest2196=ends[7];
          }
          if(biggest2196 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2196 == 0){
            S2167=0;
            active[1]=0;
            ends[1]=0;
            S2167=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          enable.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      enable.setpreclear();
      refill.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetractedE.setpreclear();
      pusherExtendedE.setpreclear();
      WPgrippedE.setpreclear();
      armAtSourceE.setpreclear();
      armAtDestE.setpreclear();
      emptyE.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetractedE.sethook();
      pusherRetractedE.setClear();
      pusherExtendedE.sethook();
      pusherExtendedE.setClear();
      WPgrippedE.sethook();
      WPgrippedE.setClear();
      armAtSourceE.sethook();
      armAtSourceE.setClear();
      armAtDestE.sethook();
      armAtDestE.setClear();
      emptyE.sethook();
      emptyE.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        enable.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
