import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECS extends ClockDomain{
  public ECS(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal sec1Temp = new Signal("sec1Temp", Signal.INPUT);
  public Signal sec2Temp = new Signal("sec2Temp", Signal.INPUT);
  public Signal sec3Temp = new Signal("sec3Temp", Signal.INPUT);
  public Signal sec1PIR = new Signal("sec1PIR", Signal.INPUT);
  public Signal sec2PIR = new Signal("sec2PIR", Signal.INPUT);
  public Signal sec3PIR = new Signal("sec3PIR", Signal.INPUT);
  public Signal sec1Lumen = new Signal("sec1Lumen", Signal.INPUT);
  public Signal sec2Lumen = new Signal("sec2Lumen", Signal.INPUT);
  public Signal sec3Lumen = new Signal("sec3Lumen", Signal.INPUT);
  public Signal sec1Smoke = new Signal("sec1Smoke", Signal.INPUT);
  public Signal sec2Smoke = new Signal("sec2Smoke", Signal.INPUT);
  public Signal sec3Smoke = new Signal("sec3Smoke", Signal.INPUT);
  public Signal time = new Signal("time", Signal.INPUT);
  public Signal sec1AC = new Signal("sec1AC", Signal.OUTPUT);
  public Signal sec2AC = new Signal("sec2AC", Signal.OUTPUT);
  public Signal sec3AC = new Signal("sec3AC", Signal.OUTPUT);
  public Signal sec1LightBulb = new Signal("sec1LightBulb", Signal.OUTPUT);
  public Signal sec2LightBulb = new Signal("sec2LightBulb", Signal.OUTPUT);
  public Signal sec3LightBulb = new Signal("sec3LightBulb", Signal.OUTPUT);
  public Signal smokeAlarm = new Signal("smokeAlarm", Signal.OUTPUT);
  private Signal sec1Occupied_1;
  private Signal sec2Occupied_1;
  private Signal sec3Occupied_1;
  private Signal workingHours_1;
  private int startTime_thread_1;//sysj\ECS\ECS.sysj line: 12, column: 2
  private int endTime_thread_1;//sysj\ECS\ECS.sysj line: 13, column: 2
  private int startTime_thread_14;//sysj\ECS\ECS.sysj line: 110, column: 3
  private int endTime_thread_14;//sysj\ECS\ECS.sysj line: 111, column: 3
  private int S691 = 1;
  private int S48 = 1;
  private int S18 = 1;
  private int S32 = 1;
  private int S46 = 1;
  private int S83 = 1;
  private int S59 = 1;
  private int S70 = 1;
  private int S81 = 1;
  private int S289 = 1;
  private int S151 = 1;
  private int S105 = 1;
  private int S103 = 1;
  private int S219 = 1;
  private int S173 = 1;
  private int S171 = 1;
  private int S287 = 1;
  private int S241 = 1;
  private int S239 = 1;
  private int S309 = 1;
  private int S344 = 1;
  private int S320 = 1;
  private int S331 = 1;
  private int S342 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread734(int [] tdone, int [] ends){
        switch(S342){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(sec3Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 133, column: 24
          System.out.println("Sec3 Smoke Alarm");//sysj\ECS\ECS.sysj line: 134, column: 4
          smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 135, column: 4
          currsigs.addElement(smokeAlarm);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread733(int [] tdone, int [] ends){
        switch(S331){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(sec2Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 129, column: 24
          System.out.println("Sec2 Smoke Alarm");//sysj\ECS\ECS.sysj line: 130, column: 4
          smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 131, column: 4
          currsigs.addElement(smokeAlarm);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread732(int [] tdone, int [] ends){
        switch(S320){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(sec1Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 124, column: 24
          System.out.println("Sec1 Smoke Alarm");//sysj\ECS\ECS.sysj line: 125, column: 4
          smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 126, column: 4
          currsigs.addElement(smokeAlarm);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread731(int [] tdone, int [] ends){
        switch(S344){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread732(tdone,ends);
        thread733(tdone,ends);
        thread734(tdone,ends);
        int biggest735 = 0;
        if(ends[16]>=biggest735){
          biggest735=ends[16];
        }
        if(ends[17]>=biggest735){
          biggest735=ends[17];
        }
        if(ends[18]>=biggest735){
          biggest735=ends[18];
        }
        if(biggest735 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest735 == 0){
          S344=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread730(int [] tdone, int [] ends){
        switch(S309){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if((Integer)(time.getpreval() == null ? 0 : ((Integer)time.getpreval()).intValue()) > 900 && (Integer)(time.getpreval() == null ? 0 : ((Integer)time.getpreval()).intValue()) < 2100){//sysj\ECS\ECS.sysj line: 113, column: 7
          System.out.println("Working Hours");//sysj\ECS\ECS.sysj line: 114, column: 5
          workingHours_1.setPresent();//sysj\ECS\ECS.sysj line: 115, column: 5
          currsigs.addElement(workingHours_1);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          System.out.println("Not Working Hours");//sysj\ECS\ECS.sysj line: 117, column: 5
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread728(int [] tdone, int [] ends){
        switch(S287){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S241){
          case 0 : 
            switch(S239){
              case 0 : 
                if(sec3Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 96, column: 12
                  S239=1;
                  if((Integer)(sec3Lumen.getpreval() == null ? 0 : ((Integer)sec3Lumen.getpreval()).intValue()) < 800){//sysj\ECS\ECS.sysj line: 98, column: 10
                    System.out.println("Section 3 Lights On");//sysj\ECS\ECS.sysj line: 99, column: 8
                    sec3LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 100, column: 8
                    currsigs.addElement(sec3LightBulb);
                    sec3LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 100, column: 8
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    S241=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
              case 1 : 
                if(!sec3Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 97, column: 12
                  S241=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  sec3LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 100, column: 8
                  currsigs.addElement(sec3LightBulb);
                  sec3LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 100, column: 8
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S241=1;
            S241=0;
            if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 95, column: 13
              S239=0;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              S241=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread727(int [] tdone, int [] ends){
        switch(S219){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S173){
          case 0 : 
            switch(S171){
              case 0 : 
                if(sec2Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 81, column: 12
                  S171=1;
                  if((Integer)(sec2Lumen.getpreval() == null ? 0 : ((Integer)sec2Lumen.getpreval()).intValue()) < 800){//sysj\ECS\ECS.sysj line: 83, column: 10
                    System.out.println("Section 2 Light On");//sysj\ECS\ECS.sysj line: 84, column: 8
                    sec2LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 85, column: 8
                    currsigs.addElement(sec2LightBulb);
                    sec2LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 85, column: 8
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                  else {
                    S173=1;
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                else {
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
              case 1 : 
                if(!sec2Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 82, column: 12
                  S173=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  sec2LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 85, column: 8
                  currsigs.addElement(sec2LightBulb);
                  sec2LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 85, column: 8
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S173=1;
            S173=0;
            if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 80, column: 13
              S171=0;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              S173=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread726(int [] tdone, int [] ends){
        switch(S151){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S105){
          case 0 : 
            switch(S103){
              case 0 : 
                if(sec1Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 66, column: 12
                  S103=1;
                  if((Integer)(sec1Lumen.getpreval() == null ? 0 : ((Integer)sec1Lumen.getpreval()).intValue()) < 800){//sysj\ECS\ECS.sysj line: 68, column: 10
                    System.out.println("Section 1 Lights On");//sysj\ECS\ECS.sysj line: 69, column: 8
                    sec1LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 70, column: 8
                    currsigs.addElement(sec1LightBulb);
                    sec1LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 70, column: 8
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                  else {
                    S105=1;
                    active[11]=1;
                    ends[11]=1;
                    tdone[11]=1;
                  }
                }
                else {
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
              case 1 : 
                if(!sec1Occupied_1.getprestatus()){//sysj\ECS\ECS.sysj line: 67, column: 12
                  S105=1;
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                else {
                  sec1LightBulb.setPresent();//sysj\ECS\ECS.sysj line: 70, column: 8
                  currsigs.addElement(sec1LightBulb);
                  sec1LightBulb.setValue(100);//sysj\ECS\ECS.sysj line: 70, column: 8
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S105=1;
            S105=0;
            if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 65, column: 13
              S103=0;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              S105=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread725(int [] tdone, int [] ends){
        switch(S289){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread726(tdone,ends);
        thread727(tdone,ends);
        thread728(tdone,ends);
        int biggest729 = 0;
        if(ends[11]>=biggest729){
          biggest729=ends[11];
        }
        if(ends[12]>=biggest729){
          biggest729=ends[12];
        }
        if(ends[13]>=biggest729){
          biggest729=ends[13];
        }
        if(biggest729 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest729 == 0){
          S289=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread723(int [] tdone, int [] ends){
        switch(S81){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(sec3PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 56, column: 24
          System.out.println("Sec 3 Person Detected");//sysj\ECS\ECS.sysj line: 57, column: 4
          sec3Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 58, column: 4
          currsigs.addElement(sec3Occupied_1);
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

  public void thread722(int [] tdone, int [] ends){
        switch(S70){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(sec2PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 52, column: 24
          System.out.println("Sec 2 Person Detected");//sysj\ECS\ECS.sysj line: 53, column: 4
          sec2Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 54, column: 4
          currsigs.addElement(sec2Occupied_1);
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

  public void thread721(int [] tdone, int [] ends){
        switch(S59){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(sec1PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 48, column: 24
          System.out.println("Sec 1 Person Detected");//sysj\ECS\ECS.sysj line: 49, column: 4
          sec1Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 50, column: 4
          currsigs.addElement(sec1Occupied_1);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread720(int [] tdone, int [] ends){
        switch(S83){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread721(tdone,ends);
        thread722(tdone,ends);
        thread723(tdone,ends);
        int biggest724 = 0;
        if(ends[7]>=biggest724){
          biggest724=ends[7];
        }
        if(ends[8]>=biggest724){
          biggest724=ends[8];
        }
        if(ends[9]>=biggest724){
          biggest724=ends[9];
        }
        if(biggest724 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest724 == 0){
          S83=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread718(int [] tdone, int [] ends){
        switch(S46){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 38, column: 13
          if((Integer)(sec3Temp.getpreval() == null ? 0 : ((Integer)sec3Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 38, column: 31
            System.out.println("AC 3 on");//sysj\ECS\ECS.sysj line: 39, column: 6
            sec3AC.setPresent();//sysj\ECS\ECS.sysj line: 40, column: 6
            currsigs.addElement(sec3AC);
            sec3AC.setValue(22);//sysj\ECS\ECS.sysj line: 40, column: 6
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
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread717(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 29, column: 13
          if((Integer)(sec2Temp.getpreval() == null ? 0 : ((Integer)sec2Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 29, column: 31
            System.out.println("AC 2 on");//sysj\ECS\ECS.sysj line: 30, column: 6
            sec2AC.setPresent();//sysj\ECS\ECS.sysj line: 31, column: 6
            currsigs.addElement(sec2AC);
            sec2AC.setValue(22);//sysj\ECS\ECS.sysj line: 31, column: 6
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
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread716(int [] tdone, int [] ends){
        switch(S18){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 19, column: 13
          if((Integer)(sec1Temp.getpreval() == null ? 0 : ((Integer)sec1Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 19, column: 31
            System.out.println((sec1Temp.getpreval() == null ? 0 : ((Integer)sec1Temp.getpreval()).intValue()));//sysj\ECS\ECS.sysj line: 20, column: 6
            System.out.println("AC 1 on");//sysj\ECS\ECS.sysj line: 21, column: 6
            sec1AC.setPresent();//sysj\ECS\ECS.sysj line: 22, column: 6
            currsigs.addElement(sec1AC);
            sec1AC.setValue(22);//sysj\ECS\ECS.sysj line: 22, column: 6
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
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread715(int [] tdone, int [] ends){
        switch(S48){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread716(tdone,ends);
        thread717(tdone,ends);
        thread718(tdone,ends);
        int biggest719 = 0;
        if(ends[3]>=biggest719){
          biggest719=ends[3];
        }
        if(ends[4]>=biggest719){
          biggest719=ends[4];
        }
        if(ends[5]>=biggest719){
          biggest719=ends[5];
        }
        if(biggest719 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest719 == 0){
          S48=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread712(int [] tdone, int [] ends){
        S342=1;
    if(sec3Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 133, column: 24
      System.out.println("Sec3 Smoke Alarm");//sysj\ECS\ECS.sysj line: 134, column: 4
      smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 135, column: 4
      currsigs.addElement(smokeAlarm);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread711(int [] tdone, int [] ends){
        S331=1;
    if(sec2Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 129, column: 24
      System.out.println("Sec2 Smoke Alarm");//sysj\ECS\ECS.sysj line: 130, column: 4
      smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 131, column: 4
      currsigs.addElement(smokeAlarm);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread710(int [] tdone, int [] ends){
        S320=1;
    if(sec1Smoke.getprestatus()){//sysj\ECS\ECS.sysj line: 124, column: 24
      System.out.println("Sec1 Smoke Alarm");//sysj\ECS\ECS.sysj line: 125, column: 4
      smokeAlarm.setPresent();//sysj\ECS\ECS.sysj line: 126, column: 4
      currsigs.addElement(smokeAlarm);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread709(int [] tdone, int [] ends){
        S344=1;
    thread710(tdone,ends);
    thread711(tdone,ends);
    thread712(tdone,ends);
    int biggest713 = 0;
    if(ends[16]>=biggest713){
      biggest713=ends[16];
    }
    if(ends[17]>=biggest713){
      biggest713=ends[17];
    }
    if(ends[18]>=biggest713){
      biggest713=ends[18];
    }
    if(biggest713 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread708(int [] tdone, int [] ends){
        S309=1;
    startTime_thread_14 = 900;//sysj\ECS\ECS.sysj line: 110, column: 3
    endTime_thread_14 = 1700;//sysj\ECS\ECS.sysj line: 111, column: 3
    if((Integer)(time.getpreval() == null ? 0 : ((Integer)time.getpreval()).intValue()) > 900 && (Integer)(time.getpreval() == null ? 0 : ((Integer)time.getpreval()).intValue()) < 2100){//sysj\ECS\ECS.sysj line: 113, column: 7
      System.out.println("Working Hours");//sysj\ECS\ECS.sysj line: 114, column: 5
      workingHours_1.setPresent();//sysj\ECS\ECS.sysj line: 115, column: 5
      currsigs.addElement(workingHours_1);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      System.out.println("Not Working Hours");//sysj\ECS\ECS.sysj line: 117, column: 5
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread706(int [] tdone, int [] ends){
        S287=1;
    S241=0;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 95, column: 13
      S239=0;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S241=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread705(int [] tdone, int [] ends){
        S219=1;
    S173=0;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 80, column: 13
      S171=0;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread704(int [] tdone, int [] ends){
        S151=1;
    S105=0;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 65, column: 13
      S103=0;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      S105=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread703(int [] tdone, int [] ends){
        S289=1;
    thread704(tdone,ends);
    thread705(tdone,ends);
    thread706(tdone,ends);
    int biggest707 = 0;
    if(ends[11]>=biggest707){
      biggest707=ends[11];
    }
    if(ends[12]>=biggest707){
      biggest707=ends[12];
    }
    if(ends[13]>=biggest707){
      biggest707=ends[13];
    }
    if(biggest707 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread701(int [] tdone, int [] ends){
        S81=1;
    if(sec3PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 56, column: 24
      System.out.println("Sec 3 Person Detected");//sysj\ECS\ECS.sysj line: 57, column: 4
      sec3Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 58, column: 4
      currsigs.addElement(sec3Occupied_1);
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

  public void thread700(int [] tdone, int [] ends){
        S70=1;
    if(sec2PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 52, column: 24
      System.out.println("Sec 2 Person Detected");//sysj\ECS\ECS.sysj line: 53, column: 4
      sec2Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 54, column: 4
      currsigs.addElement(sec2Occupied_1);
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

  public void thread699(int [] tdone, int [] ends){
        S59=1;
    if(sec1PIR.getprestatus()){//sysj\ECS\ECS.sysj line: 48, column: 24
      System.out.println("Sec 1 Person Detected");//sysj\ECS\ECS.sysj line: 49, column: 4
      sec1Occupied_1.setPresent();//sysj\ECS\ECS.sysj line: 50, column: 4
      currsigs.addElement(sec1Occupied_1);
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

  public void thread698(int [] tdone, int [] ends){
        S83=1;
    thread699(tdone,ends);
    thread700(tdone,ends);
    thread701(tdone,ends);
    int biggest702 = 0;
    if(ends[7]>=biggest702){
      biggest702=ends[7];
    }
    if(ends[8]>=biggest702){
      biggest702=ends[8];
    }
    if(ends[9]>=biggest702){
      biggest702=ends[9];
    }
    if(biggest702 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread696(int [] tdone, int [] ends){
        S46=1;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 38, column: 13
      if((Integer)(sec3Temp.getpreval() == null ? 0 : ((Integer)sec3Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 38, column: 31
        System.out.println("AC 3 on");//sysj\ECS\ECS.sysj line: 39, column: 6
        sec3AC.setPresent();//sysj\ECS\ECS.sysj line: 40, column: 6
        currsigs.addElement(sec3AC);
        sec3AC.setValue(22);//sysj\ECS\ECS.sysj line: 40, column: 6
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
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread695(int [] tdone, int [] ends){
        S32=1;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 29, column: 13
      if((Integer)(sec2Temp.getpreval() == null ? 0 : ((Integer)sec2Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 29, column: 31
        System.out.println("AC 2 on");//sysj\ECS\ECS.sysj line: 30, column: 6
        sec2AC.setPresent();//sysj\ECS\ECS.sysj line: 31, column: 6
        currsigs.addElement(sec2AC);
        sec2AC.setValue(22);//sysj\ECS\ECS.sysj line: 31, column: 6
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
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread694(int [] tdone, int [] ends){
        S18=1;
    if(workingHours_1.getprestatus()){//sysj\ECS\ECS.sysj line: 19, column: 13
      if((Integer)(sec1Temp.getpreval() == null ? 0 : ((Integer)sec1Temp.getpreval()).intValue()) != 22){//sysj\ECS\ECS.sysj line: 19, column: 31
        System.out.println((sec1Temp.getpreval() == null ? 0 : ((Integer)sec1Temp.getpreval()).intValue()));//sysj\ECS\ECS.sysj line: 20, column: 6
        System.out.println("AC 1 on");//sysj\ECS\ECS.sysj line: 21, column: 6
        sec1AC.setPresent();//sysj\ECS\ECS.sysj line: 22, column: 6
        currsigs.addElement(sec1AC);
        sec1AC.setValue(22);//sysj\ECS\ECS.sysj line: 22, column: 6
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
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread693(int [] tdone, int [] ends){
        S48=1;
    thread694(tdone,ends);
    thread695(tdone,ends);
    thread696(tdone,ends);
    int biggest697 = 0;
    if(ends[3]>=biggest697){
      biggest697=ends[3];
    }
    if(ends[4]>=biggest697){
      biggest697=ends[4];
    }
    if(ends[5]>=biggest697){
      biggest697=ends[5];
    }
    if(biggest697 == 1){
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
      switch(S691){
        case 0 : 
          S691=0;
          break RUN;
        
        case 1 : 
          S691=2;
          S691=2;
          startTime_thread_1 = 900;//sysj\ECS\ECS.sysj line: 12, column: 2
          endTime_thread_1 = 1700;//sysj\ECS\ECS.sysj line: 13, column: 2
          sec1Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          sec2Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          sec3Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          workingHours_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          thread693(tdone,ends);
          thread698(tdone,ends);
          thread703(tdone,ends);
          thread708(tdone,ends);
          thread709(tdone,ends);
          int biggest714 = 0;
          if(ends[2]>=biggest714){
            biggest714=ends[2];
          }
          if(ends[6]>=biggest714){
            biggest714=ends[6];
          }
          if(ends[10]>=biggest714){
            biggest714=ends[10];
          }
          if(ends[14]>=biggest714){
            biggest714=ends[14];
          }
          if(ends[15]>=biggest714){
            biggest714=ends[15];
          }
          if(biggest714 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          sec1Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          sec2Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          sec3Occupied_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          workingHours_1.setClear();//sysj\ECS\ECS.sysj line: 14, column: 2
          thread715(tdone,ends);
          thread720(tdone,ends);
          thread725(tdone,ends);
          thread730(tdone,ends);
          thread731(tdone,ends);
          int biggest736 = 0;
          if(ends[2]>=biggest736){
            biggest736=ends[2];
          }
          if(ends[6]>=biggest736){
            biggest736=ends[6];
          }
          if(ends[10]>=biggest736){
            biggest736=ends[10];
          }
          if(ends[14]>=biggest736){
            biggest736=ends[14];
          }
          if(ends[15]>=biggest736){
            biggest736=ends[15];
          }
          if(biggest736 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest736 == 0){
            S691=0;
            active[1]=0;
            ends[1]=0;
            S691=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    sec1Occupied_1 = new Signal();
    sec2Occupied_1 = new Signal();
    sec3Occupied_1 = new Signal();
    workingHours_1 = new Signal();
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
          sec1Temp.gethook();
          sec2Temp.gethook();
          sec3Temp.gethook();
          sec1PIR.gethook();
          sec2PIR.gethook();
          sec3PIR.gethook();
          sec1Lumen.gethook();
          sec2Lumen.gethook();
          sec3Lumen.gethook();
          sec1Smoke.gethook();
          sec2Smoke.gethook();
          sec3Smoke.gethook();
          time.gethook();
          df = true;
        }
        runClockDomain();
      }
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
      sec1AC.setpreclear();
      sec2AC.setpreclear();
      sec3AC.setpreclear();
      sec1LightBulb.setpreclear();
      sec2LightBulb.setpreclear();
      sec3LightBulb.setpreclear();
      smokeAlarm.setpreclear();
      sec1Occupied_1.setpreclear();
      sec2Occupied_1.setpreclear();
      sec3Occupied_1.setpreclear();
      workingHours_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = sec1Temp.getStatus() ? sec1Temp.setprepresent() : sec1Temp.setpreclear();
      sec1Temp.setpreval(sec1Temp.getValue());
      sec1Temp.setClear();
      dummyint = sec2Temp.getStatus() ? sec2Temp.setprepresent() : sec2Temp.setpreclear();
      sec2Temp.setpreval(sec2Temp.getValue());
      sec2Temp.setClear();
      dummyint = sec3Temp.getStatus() ? sec3Temp.setprepresent() : sec3Temp.setpreclear();
      sec3Temp.setpreval(sec3Temp.getValue());
      sec3Temp.setClear();
      dummyint = sec1PIR.getStatus() ? sec1PIR.setprepresent() : sec1PIR.setpreclear();
      sec1PIR.setpreval(sec1PIR.getValue());
      sec1PIR.setClear();
      dummyint = sec2PIR.getStatus() ? sec2PIR.setprepresent() : sec2PIR.setpreclear();
      sec2PIR.setpreval(sec2PIR.getValue());
      sec2PIR.setClear();
      dummyint = sec3PIR.getStatus() ? sec3PIR.setprepresent() : sec3PIR.setpreclear();
      sec3PIR.setpreval(sec3PIR.getValue());
      sec3PIR.setClear();
      dummyint = sec1Lumen.getStatus() ? sec1Lumen.setprepresent() : sec1Lumen.setpreclear();
      sec1Lumen.setpreval(sec1Lumen.getValue());
      sec1Lumen.setClear();
      dummyint = sec2Lumen.getStatus() ? sec2Lumen.setprepresent() : sec2Lumen.setpreclear();
      sec2Lumen.setpreval(sec2Lumen.getValue());
      sec2Lumen.setClear();
      dummyint = sec3Lumen.getStatus() ? sec3Lumen.setprepresent() : sec3Lumen.setpreclear();
      sec3Lumen.setpreval(sec3Lumen.getValue());
      sec3Lumen.setClear();
      dummyint = sec1Smoke.getStatus() ? sec1Smoke.setprepresent() : sec1Smoke.setpreclear();
      sec1Smoke.setpreval(sec1Smoke.getValue());
      sec1Smoke.setClear();
      dummyint = sec2Smoke.getStatus() ? sec2Smoke.setprepresent() : sec2Smoke.setpreclear();
      sec2Smoke.setpreval(sec2Smoke.getValue());
      sec2Smoke.setClear();
      dummyint = sec3Smoke.getStatus() ? sec3Smoke.setprepresent() : sec3Smoke.setpreclear();
      sec3Smoke.setpreval(sec3Smoke.getValue());
      sec3Smoke.setClear();
      dummyint = time.getStatus() ? time.setprepresent() : time.setpreclear();
      time.setpreval(time.getValue());
      time.setClear();
      sec1AC.sethook();
      sec1AC.setClear();
      sec2AC.sethook();
      sec2AC.setClear();
      sec3AC.sethook();
      sec3AC.setClear();
      sec1LightBulb.sethook();
      sec1LightBulb.setClear();
      sec2LightBulb.sethook();
      sec2LightBulb.setClear();
      sec3LightBulb.sethook();
      sec3LightBulb.setClear();
      smokeAlarm.sethook();
      smokeAlarm.setClear();
      sec1Occupied_1.setClear();
      sec2Occupied_1.setClear();
      sec3Occupied_1.setClear();
      workingHours_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        sec1Temp.gethook();
        sec2Temp.gethook();
        sec3Temp.gethook();
        sec1PIR.gethook();
        sec2PIR.gethook();
        sec3PIR.gethook();
        sec1Lumen.gethook();
        sec2Lumen.gethook();
        sec3Lumen.gethook();
        sec1Smoke.gethook();
        sec2Smoke.gethook();
        sec3Smoke.gethook();
        time.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
