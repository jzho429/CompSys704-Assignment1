import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECSSim extends ClockDomain{
  public ECSSim(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal sec1AC = new Signal("sec1AC", Signal.INPUT);
  public Signal sec2AC = new Signal("sec2AC", Signal.INPUT);
  public Signal sec3AC = new Signal("sec3AC", Signal.INPUT);
  public Signal sec1LightBulb = new Signal("sec1LightBulb", Signal.INPUT);
  public Signal sec2LightBulb = new Signal("sec2LightBulb", Signal.INPUT);
  public Signal sec3LightBulb = new Signal("sec3LightBulb", Signal.INPUT);
  public Signal smokeAlarm = new Signal("smokeAlarm", Signal.INPUT);
  public Signal sec1Temp = new Signal("sec1Temp", Signal.OUTPUT);
  public Signal sec2Temp = new Signal("sec2Temp", Signal.OUTPUT);
  public Signal sec3Temp = new Signal("sec3Temp", Signal.OUTPUT);
  public Signal sec1PIR = new Signal("sec1PIR", Signal.OUTPUT);
  public Signal sec2PIR = new Signal("sec2PIR", Signal.OUTPUT);
  public Signal sec3PIR = new Signal("sec3PIR", Signal.OUTPUT);
  public Signal sec1Lumen = new Signal("sec1Lumen", Signal.OUTPUT);
  public Signal sec2Lumen = new Signal("sec2Lumen", Signal.OUTPUT);
  public Signal sec3Lumen = new Signal("sec3Lumen", Signal.OUTPUT);
  public Signal sec1Smoke = new Signal("sec1Smoke", Signal.OUTPUT);
  public Signal sec2Smoke = new Signal("sec2Smoke", Signal.OUTPUT);
  public Signal sec3Smoke = new Signal("sec3Smoke", Signal.OUTPUT);
  public Signal time = new Signal("time", Signal.OUTPUT);
  private Signal temp1_1;
  private Signal temp2_1;
  private Signal temp3_1;
  private int rand_thread_6;//sysj\ECS\ECSSim.sysj line: 49, column: 3
  private int rand_thread_11;//sysj\ECS\ECSSim.sysj line: 109, column: 3
  private int time_thread_12;//sysj\ECS\ECSSim.sysj line: 124, column: 3
  private int S1161 = 1;
  private int S775 = 1;
  private int S751 = 1;
  private int S762 = 1;
  private int S773 = 1;
  private int S819 = 1;
  private int S881 = 1;
  private int S839 = 1;
  private int S825 = 1;
  private int S859 = 1;
  private int S845 = 1;
  private int S879 = 1;
  private int S865 = 1;
  private int S925 = 1;
  private int S933 = 1;
  private int S950 = 1;
  private int S938 = 1;
  private int S943 = 1;
  private int S948 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread1198(int [] tdone, int [] ends){
        switch(S948){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        sec3Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 140, column: 16
        currsigs.addElement(sec3Temp);
        sec3Temp.setValue((temp3_1.getpreval() == null ? 0 : ((Integer)temp3_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 140, column: 16
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread1197(int [] tdone, int [] ends){
        switch(S943){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        sec2Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 138, column: 16
        currsigs.addElement(sec2Temp);
        sec2Temp.setValue((temp2_1.getpreval() == null ? 0 : ((Integer)temp2_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 138, column: 16
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread1196(int [] tdone, int [] ends){
        switch(S938){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        sec1Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 136, column: 16
        currsigs.addElement(sec1Temp);
        sec1Temp.setValue((temp1_1.getpreval() == null ? 0 : ((Integer)temp1_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 136, column: 16
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread1195(int [] tdone, int [] ends){
        switch(S950){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread1196(tdone,ends);
        thread1197(tdone,ends);
        thread1198(tdone,ends);
        int biggest1199 = 0;
        if(ends[14]>=biggest1199){
          biggest1199=ends[14];
        }
        if(ends[15]>=biggest1199){
          biggest1199=ends[15];
        }
        if(ends[16]>=biggest1199){
          biggest1199=ends[16];
        }
        if(biggest1199 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest1199 == 0){
          S950=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread1194(int [] tdone, int [] ends){
        switch(S933){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(time_thread_12 > 2400) {//sysj\ECS\ECSSim.sysj line: 126, column: 20
          time_thread_12 = 0;//sysj\ECS\ECSSim.sysj line: 127, column: 5
        }
        time_thread_12 = time_thread_12 + 100;//sysj\ECS\ECSSim.sysj line: 129, column: 4
        time.setPresent();//sysj\ECS\ECSSim.sysj line: 130, column: 4
        currsigs.addElement(time);
        time.setValue(time_thread_12);//sysj\ECS\ECSSim.sysj line: 130, column: 4
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread1193(int [] tdone, int [] ends){
        switch(S925){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        rand_thread_11 = (int)(Math.random() * 100);//sysj\ECS\ECSSim.sysj line: 111, column: 4
        if(rand_thread_11 == 1){//sysj\ECS\ECSSim.sysj line: 112, column: 7
          sec1Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 113, column: 5
          currsigs.addElement(sec1Smoke);
          sec1Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 113, column: 5
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          if(rand_thread_11 == 2){//sysj\ECS\ECSSim.sysj line: 114, column: 13
            sec2Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 115, column: 5
            currsigs.addElement(sec2Smoke);
            sec2Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 115, column: 5
            active[11]=1;
            ends[11]=1;
            tdone[11]=1;
          }
          else {
            if(rand_thread_11 == 3){//sysj\ECS\ECSSim.sysj line: 116, column: 13
              sec3Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 117, column: 5
              currsigs.addElement(sec3Smoke);
              sec3Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 117, column: 5
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
        }
        break;
      
    }
  }

  public void thread1191(int [] tdone, int [] ends){
        switch(S879){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S865){
          case 0 : 
            if(!sec3LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 96, column: 12
              S865=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              sec3Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 97, column: 7
              currsigs.addElement(sec3Lumen);
              sec3Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 97, column: 7
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S865=1;
            S865=0;
            if(sec3LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 95, column: 13
              sec3Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 97, column: 7
              currsigs.addElement(sec3Lumen);
              sec3Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 97, column: 7
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              sec3Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 100, column: 6
              currsigs.addElement(sec3Lumen);
              sec3Lumen.setValue(0);//sysj\ECS\ECSSim.sysj line: 100, column: 6
              S865=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1190(int [] tdone, int [] ends){
        switch(S859){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S845){
          case 0 : 
            if(!sec2LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 83, column: 12
              S845=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              sec2Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 84, column: 7
              currsigs.addElement(sec2Lumen);
              sec2Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 84, column: 7
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S845=1;
            S845=0;
            if(sec2LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 82, column: 13
              sec2Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 84, column: 7
              currsigs.addElement(sec2Lumen);
              sec2Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 84, column: 7
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              sec2Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 87, column: 6
              currsigs.addElement(sec2Lumen);
              sec2Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 87, column: 6
              S845=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1189(int [] tdone, int [] ends){
        switch(S839){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S825){
          case 0 : 
            if(!sec1LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 70, column: 12
              S825=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              sec1Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 71, column: 7
              currsigs.addElement(sec1Lumen);
              sec1Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 71, column: 7
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S825=1;
            S825=0;
            if(sec1LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 69, column: 13
              sec1Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 71, column: 7
              currsigs.addElement(sec1Lumen);
              sec1Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 71, column: 7
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              sec1Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 74, column: 6
              currsigs.addElement(sec1Lumen);
              sec1Lumen.setValue(500);//sysj\ECS\ECSSim.sysj line: 74, column: 6
              S825=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1188(int [] tdone, int [] ends){
        switch(S881){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread1189(tdone,ends);
        thread1190(tdone,ends);
        thread1191(tdone,ends);
        int biggest1192 = 0;
        if(ends[8]>=biggest1192){
          biggest1192=ends[8];
        }
        if(ends[9]>=biggest1192){
          biggest1192=ends[9];
        }
        if(ends[10]>=biggest1192){
          biggest1192=ends[10];
        }
        if(biggest1192 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest1192 == 0){
          S881=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread1187(int [] tdone, int [] ends){
        switch(S819){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        rand_thread_6 = (int)(Math.random() * 100);//sysj\ECS\ECSSim.sysj line: 51, column: 4
        if(rand_thread_6 < 2){//sysj\ECS\ECSSim.sysj line: 52, column: 7
          sec1PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 53, column: 5
          currsigs.addElement(sec1PIR);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          if(rand_thread_6 > 2 && rand_thread_6 < 4){//sysj\ECS\ECSSim.sysj line: 54, column: 13
            sec2PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 55, column: 5
            currsigs.addElement(sec2PIR);
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
          }
          else {
            if(rand_thread_6 > 4 && rand_thread_6 < 6){//sysj\ECS\ECSSim.sysj line: 56, column: 13
              sec3PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 57, column: 5
              currsigs.addElement(sec3PIR);
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

  public void thread1185(int [] tdone, int [] ends){
        switch(S773){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(sec3AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 40, column: 13
          temp3_1.setPresent();//sysj\ECS\ECSSim.sysj line: 41, column: 6
          currsigs.addElement(temp3_1);
          temp3_1.setValue((sec3AC.getpreval() == null ? 0 : ((Integer)sec3AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 41, column: 6
          sec3Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 42, column: 6
          currsigs.addElement(sec3Temp);
          sec3Temp.setValue((sec3AC.getpreval() == null ? 0 : ((Integer)sec3AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 42, column: 6
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

  public void thread1184(int [] tdone, int [] ends){
        switch(S762){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(sec2AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 31, column: 13
          temp2_1.setPresent();//sysj\ECS\ECSSim.sysj line: 32, column: 6
          currsigs.addElement(temp2_1);
          temp2_1.setValue((sec2AC.getpreval() == null ? 0 : ((Integer)sec2AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 32, column: 6
          sec2Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 33, column: 6
          currsigs.addElement(sec2Temp);
          sec2Temp.setValue((sec2AC.getpreval() == null ? 0 : ((Integer)sec2AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 33, column: 6
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

  public void thread1183(int [] tdone, int [] ends){
        switch(S751){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(sec1AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 22, column: 13
          temp1_1.setPresent();//sysj\ECS\ECSSim.sysj line: 23, column: 6
          currsigs.addElement(temp1_1);
          temp1_1.setValue((sec1AC.getpreval() == null ? 0 : ((Integer)sec1AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 23, column: 6
          sec1Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 24, column: 6
          currsigs.addElement(sec1Temp);
          sec1Temp.setValue((sec1AC.getpreval() == null ? 0 : ((Integer)sec1AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 24, column: 6
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

  public void thread1182(int [] tdone, int [] ends){
        switch(S775){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread1183(tdone,ends);
        thread1184(tdone,ends);
        thread1185(tdone,ends);
        int biggest1186 = 0;
        if(ends[3]>=biggest1186){
          biggest1186=ends[3];
        }
        if(ends[4]>=biggest1186){
          biggest1186=ends[4];
        }
        if(ends[5]>=biggest1186){
          biggest1186=ends[5];
        }
        if(biggest1186 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest1186 == 0){
          S775=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread1179(int [] tdone, int [] ends){
        S948=1;
    sec3Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 140, column: 16
    currsigs.addElement(sec3Temp);
    sec3Temp.setValue((temp3_1.getpreval() == null ? 0 : ((Integer)temp3_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 140, column: 16
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread1178(int [] tdone, int [] ends){
        S943=1;
    sec2Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 138, column: 16
    currsigs.addElement(sec2Temp);
    sec2Temp.setValue((temp2_1.getpreval() == null ? 0 : ((Integer)temp2_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 138, column: 16
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread1177(int [] tdone, int [] ends){
        S938=1;
    sec1Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 136, column: 16
    currsigs.addElement(sec1Temp);
    sec1Temp.setValue((temp1_1.getpreval() == null ? 0 : ((Integer)temp1_1.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 136, column: 16
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread1176(int [] tdone, int [] ends){
        S950=1;
    thread1177(tdone,ends);
    thread1178(tdone,ends);
    thread1179(tdone,ends);
    int biggest1180 = 0;
    if(ends[14]>=biggest1180){
      biggest1180=ends[14];
    }
    if(ends[15]>=biggest1180){
      biggest1180=ends[15];
    }
    if(ends[16]>=biggest1180){
      biggest1180=ends[16];
    }
    if(biggest1180 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1175(int [] tdone, int [] ends){
        S933=1;
    time_thread_12 = 0;//sysj\ECS\ECSSim.sysj line: 124, column: 3
    if(time_thread_12 > 2400) {//sysj\ECS\ECSSim.sysj line: 126, column: 20
      time_thread_12 = 0;//sysj\ECS\ECSSim.sysj line: 127, column: 5
    }
    time_thread_12 = time_thread_12 + 100;//sysj\ECS\ECSSim.sysj line: 129, column: 4
    time.setPresent();//sysj\ECS\ECSSim.sysj line: 130, column: 4
    currsigs.addElement(time);
    time.setValue(time_thread_12);//sysj\ECS\ECSSim.sysj line: 130, column: 4
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread1174(int [] tdone, int [] ends){
        S925=1;
        rand_thread_11 = (int)(Math.random() * 100);//sysj\ECS\ECSSim.sysj line: 111, column: 4
    if(rand_thread_11 == 1){//sysj\ECS\ECSSim.sysj line: 112, column: 7
      sec1Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 113, column: 5
      currsigs.addElement(sec1Smoke);
      sec1Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 113, column: 5
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      if(rand_thread_11 == 2){//sysj\ECS\ECSSim.sysj line: 114, column: 13
        sec2Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 115, column: 5
        currsigs.addElement(sec2Smoke);
        sec2Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 115, column: 5
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        if(rand_thread_11 == 3){//sysj\ECS\ECSSim.sysj line: 116, column: 13
          sec3Smoke.setPresent();//sysj\ECS\ECSSim.sysj line: 117, column: 5
          currsigs.addElement(sec3Smoke);
          sec3Smoke.setValue(true);//sysj\ECS\ECSSim.sysj line: 117, column: 5
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
    }
  }

  public void thread1172(int [] tdone, int [] ends){
        S879=1;
    S865=0;
    if(sec3LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 95, column: 13
      sec3Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 97, column: 7
      currsigs.addElement(sec3Lumen);
      sec3Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 97, column: 7
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      sec3Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 100, column: 6
      currsigs.addElement(sec3Lumen);
      sec3Lumen.setValue(0);//sysj\ECS\ECSSim.sysj line: 100, column: 6
      S865=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1171(int [] tdone, int [] ends){
        S859=1;
    S845=0;
    if(sec2LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 82, column: 13
      sec2Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 84, column: 7
      currsigs.addElement(sec2Lumen);
      sec2Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 84, column: 7
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      sec2Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 87, column: 6
      currsigs.addElement(sec2Lumen);
      sec2Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 87, column: 6
      S845=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread1170(int [] tdone, int [] ends){
        S839=1;
    S825=0;
    if(sec1LightBulb.getprestatus()){//sysj\ECS\ECSSim.sysj line: 69, column: 13
      sec1Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 71, column: 7
      currsigs.addElement(sec1Lumen);
      sec1Lumen.setValue(1000);//sysj\ECS\ECSSim.sysj line: 71, column: 7
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      sec1Lumen.setPresent();//sysj\ECS\ECSSim.sysj line: 74, column: 6
      currsigs.addElement(sec1Lumen);
      sec1Lumen.setValue(500);//sysj\ECS\ECSSim.sysj line: 74, column: 6
      S825=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1169(int [] tdone, int [] ends){
        S881=1;
    thread1170(tdone,ends);
    thread1171(tdone,ends);
    thread1172(tdone,ends);
    int biggest1173 = 0;
    if(ends[8]>=biggest1173){
      biggest1173=ends[8];
    }
    if(ends[9]>=biggest1173){
      biggest1173=ends[9];
    }
    if(ends[10]>=biggest1173){
      biggest1173=ends[10];
    }
    if(biggest1173 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread1168(int [] tdone, int [] ends){
        S819=1;
        rand_thread_6 = (int)(Math.random() * 100);//sysj\ECS\ECSSim.sysj line: 51, column: 4
    if(rand_thread_6 < 2){//sysj\ECS\ECSSim.sysj line: 52, column: 7
      sec1PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 53, column: 5
      currsigs.addElement(sec1PIR);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      if(rand_thread_6 > 2 && rand_thread_6 < 4){//sysj\ECS\ECSSim.sysj line: 54, column: 13
        sec2PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 55, column: 5
        currsigs.addElement(sec2PIR);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
      }
      else {
        if(rand_thread_6 > 4 && rand_thread_6 < 6){//sysj\ECS\ECSSim.sysj line: 56, column: 13
          sec3PIR.setPresent();//sysj\ECS\ECSSim.sysj line: 57, column: 5
          currsigs.addElement(sec3PIR);
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

  public void thread1166(int [] tdone, int [] ends){
        S773=1;
    if(sec3AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 40, column: 13
      temp3_1.setPresent();//sysj\ECS\ECSSim.sysj line: 41, column: 6
      currsigs.addElement(temp3_1);
      temp3_1.setValue((sec3AC.getpreval() == null ? 0 : ((Integer)sec3AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 41, column: 6
      sec3Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 42, column: 6
      currsigs.addElement(sec3Temp);
      sec3Temp.setValue((sec3AC.getpreval() == null ? 0 : ((Integer)sec3AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 42, column: 6
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

  public void thread1165(int [] tdone, int [] ends){
        S762=1;
    if(sec2AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 31, column: 13
      temp2_1.setPresent();//sysj\ECS\ECSSim.sysj line: 32, column: 6
      currsigs.addElement(temp2_1);
      temp2_1.setValue((sec2AC.getpreval() == null ? 0 : ((Integer)sec2AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 32, column: 6
      sec2Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 33, column: 6
      currsigs.addElement(sec2Temp);
      sec2Temp.setValue((sec2AC.getpreval() == null ? 0 : ((Integer)sec2AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 33, column: 6
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

  public void thread1164(int [] tdone, int [] ends){
        S751=1;
    if(sec1AC.getprestatus()){//sysj\ECS\ECSSim.sysj line: 22, column: 13
      temp1_1.setPresent();//sysj\ECS\ECSSim.sysj line: 23, column: 6
      currsigs.addElement(temp1_1);
      temp1_1.setValue((sec1AC.getpreval() == null ? 0 : ((Integer)sec1AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 23, column: 6
      sec1Temp.setPresent();//sysj\ECS\ECSSim.sysj line: 24, column: 6
      currsigs.addElement(sec1Temp);
      sec1Temp.setValue((sec1AC.getpreval() == null ? 0 : ((Integer)sec1AC.getpreval()).intValue()));//sysj\ECS\ECSSim.sysj line: 24, column: 6
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

  public void thread1163(int [] tdone, int [] ends){
        S775=1;
    thread1164(tdone,ends);
    thread1165(tdone,ends);
    thread1166(tdone,ends);
    int biggest1167 = 0;
    if(ends[3]>=biggest1167){
      biggest1167=ends[3];
    }
    if(ends[4]>=biggest1167){
      biggest1167=ends[4];
    }
    if(ends[5]>=biggest1167){
      biggest1167=ends[5];
    }
    if(biggest1167 == 1){
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
      switch(S1161){
        case 0 : 
          S1161=0;
          break RUN;
        
        case 1 : 
          S1161=2;
          S1161=2;
          temp1_1.setClear();//sysj\ECS\ECSSim.sysj line: 12, column: 3
          temp2_1.setClear();//sysj\ECS\ECSSim.sysj line: 13, column: 3
          temp3_1.setClear();//sysj\ECS\ECSSim.sysj line: 14, column: 3
          temp1_1.setPresent();//sysj\ECS\ECSSim.sysj line: 15, column: 3
          currsigs.addElement(temp1_1);
          temp1_1.setValue(18);//sysj\ECS\ECSSim.sysj line: 15, column: 3
          temp2_1.setPresent();//sysj\ECS\ECSSim.sysj line: 16, column: 3
          currsigs.addElement(temp2_1);
          temp2_1.setValue(22);//sysj\ECS\ECSSim.sysj line: 16, column: 3
          temp3_1.setPresent();//sysj\ECS\ECSSim.sysj line: 17, column: 3
          currsigs.addElement(temp3_1);
          temp3_1.setValue(25);//sysj\ECS\ECSSim.sysj line: 17, column: 3
          thread1163(tdone,ends);
          thread1168(tdone,ends);
          thread1169(tdone,ends);
          thread1174(tdone,ends);
          thread1175(tdone,ends);
          thread1176(tdone,ends);
          int biggest1181 = 0;
          if(ends[2]>=biggest1181){
            biggest1181=ends[2];
          }
          if(ends[6]>=biggest1181){
            biggest1181=ends[6];
          }
          if(ends[7]>=biggest1181){
            biggest1181=ends[7];
          }
          if(ends[11]>=biggest1181){
            biggest1181=ends[11];
          }
          if(ends[12]>=biggest1181){
            biggest1181=ends[12];
          }
          if(ends[13]>=biggest1181){
            biggest1181=ends[13];
          }
          if(biggest1181 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          temp1_1.setClear();//sysj\ECS\ECSSim.sysj line: 12, column: 3
          temp2_1.setClear();//sysj\ECS\ECSSim.sysj line: 13, column: 3
          temp3_1.setClear();//sysj\ECS\ECSSim.sysj line: 14, column: 3
          thread1182(tdone,ends);
          thread1187(tdone,ends);
          thread1188(tdone,ends);
          thread1193(tdone,ends);
          thread1194(tdone,ends);
          thread1195(tdone,ends);
          int biggest1200 = 0;
          if(ends[2]>=biggest1200){
            biggest1200=ends[2];
          }
          if(ends[6]>=biggest1200){
            biggest1200=ends[6];
          }
          if(ends[7]>=biggest1200){
            biggest1200=ends[7];
          }
          if(ends[11]>=biggest1200){
            biggest1200=ends[11];
          }
          if(ends[12]>=biggest1200){
            biggest1200=ends[12];
          }
          if(ends[13]>=biggest1200){
            biggest1200=ends[13];
          }
          if(biggest1200 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1200 == 0){
            S1161=0;
            active[1]=0;
            ends[1]=0;
            S1161=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    temp1_1 = new Signal();
    temp2_1 = new Signal();
    temp3_1 = new Signal();
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
          sec1AC.gethook();
          sec2AC.gethook();
          sec3AC.gethook();
          sec1LightBulb.gethook();
          sec2LightBulb.gethook();
          sec3LightBulb.gethook();
          smokeAlarm.gethook();
          df = true;
        }
        runClockDomain();
      }
      sec1AC.setpreclear();
      sec2AC.setpreclear();
      sec3AC.setpreclear();
      sec1LightBulb.setpreclear();
      sec2LightBulb.setpreclear();
      sec3LightBulb.setpreclear();
      smokeAlarm.setpreclear();
      sec1Temp.setpreclear();
      sec2Temp.setpreclear();
      sec3Temp.setpreclear();
      sec1PIR.setpreclear();
      sec2PIR.setpreclear();
      sec3PIR.setpreclear();
      sec1Lumen.setpreclear();
      sec2Lumen.setpreclear();
      sec3Lumen.setpreclear();
      sec1Smoke.setpreclear();
      sec2Smoke.setpreclear();
      sec3Smoke.setpreclear();
      time.setpreclear();
      temp1_1.setpreclear();
      temp2_1.setpreclear();
      temp3_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = sec1AC.getStatus() ? sec1AC.setprepresent() : sec1AC.setpreclear();
      sec1AC.setpreval(sec1AC.getValue());
      sec1AC.setClear();
      dummyint = sec2AC.getStatus() ? sec2AC.setprepresent() : sec2AC.setpreclear();
      sec2AC.setpreval(sec2AC.getValue());
      sec2AC.setClear();
      dummyint = sec3AC.getStatus() ? sec3AC.setprepresent() : sec3AC.setpreclear();
      sec3AC.setpreval(sec3AC.getValue());
      sec3AC.setClear();
      dummyint = sec1LightBulb.getStatus() ? sec1LightBulb.setprepresent() : sec1LightBulb.setpreclear();
      sec1LightBulb.setpreval(sec1LightBulb.getValue());
      sec1LightBulb.setClear();
      dummyint = sec2LightBulb.getStatus() ? sec2LightBulb.setprepresent() : sec2LightBulb.setpreclear();
      sec2LightBulb.setpreval(sec2LightBulb.getValue());
      sec2LightBulb.setClear();
      dummyint = sec3LightBulb.getStatus() ? sec3LightBulb.setprepresent() : sec3LightBulb.setpreclear();
      sec3LightBulb.setpreval(sec3LightBulb.getValue());
      sec3LightBulb.setClear();
      dummyint = smokeAlarm.getStatus() ? smokeAlarm.setprepresent() : smokeAlarm.setpreclear();
      smokeAlarm.setpreval(smokeAlarm.getValue());
      smokeAlarm.setClear();
      sec1Temp.sethook();
      sec1Temp.setClear();
      sec2Temp.sethook();
      sec2Temp.setClear();
      sec3Temp.sethook();
      sec3Temp.setClear();
      sec1PIR.sethook();
      sec1PIR.setClear();
      sec2PIR.sethook();
      sec2PIR.setClear();
      sec3PIR.sethook();
      sec3PIR.setClear();
      sec1Lumen.sethook();
      sec1Lumen.setClear();
      sec2Lumen.sethook();
      sec2Lumen.setClear();
      sec3Lumen.sethook();
      sec3Lumen.setClear();
      sec1Smoke.sethook();
      sec1Smoke.setClear();
      sec2Smoke.sethook();
      sec2Smoke.setClear();
      sec3Smoke.sethook();
      sec3Smoke.setClear();
      time.sethook();
      time.setClear();
      temp1_1.setClear();
      temp2_1.setClear();
      temp3_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        sec1AC.gethook();
        sec2AC.gethook();
        sec3AC.gethook();
        sec1LightBulb.gethook();
        sec2LightBulb.gethook();
        sec3LightBulb.gethook();
        smokeAlarm.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
