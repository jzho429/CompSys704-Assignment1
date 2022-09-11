import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorPlant extends ClockDomain{
  public ConveyorPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal bottleAtPos0 = new Signal("bottleAtPos0", Signal.INPUT);
  public Signal RTPutBottleAt2 = new Signal("RTPutBottleAt2", Signal.INPUT);
  public Signal RTPutBottleAt3 = new Signal("RTPutBottleAt3", Signal.INPUT);
  public Signal RTPutBottleAt4 = new Signal("RTPutBottleAt4", Signal.INPUT);
  public Signal RTPutBottleAt5 = new Signal("RTPutBottleAt5", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal bottleLeftPos5E = new Signal("bottleLeftPos5E", Signal.OUTPUT);
  public Signal motorOn = new Signal("motorOn", Signal.OUTPUT);
  public Signal bottleLeftPos5TL = new Signal("bottleLeftPos5TL", Signal.OUTPUT);
  public Signal bottleAtPos1RT = new Signal("bottleAtPos1RT", Signal.OUTPUT);
  public Signal bottleAtPos2RT = new Signal("bottleAtPos2RT", Signal.OUTPUT);
  public Signal bottleAtPos3RT = new Signal("bottleAtPos3RT", Signal.OUTPUT);
  public Signal bottleAtPos4RT = new Signal("bottleAtPos4RT", Signal.OUTPUT);
  public Signal bottleAtPos5RT = new Signal("bottleAtPos5RT", Signal.OUTPUT);
  private int S480 = 1;
  private int S161 = 1;
  private int S105 = 1;
  private int S388 = 1;
  private int S220 = 1;
  private int S164 = 1;
  private int S279 = 1;
  private int S239 = 1;
  private int S311 = 1;
  private int S289 = 1;
  private int S343 = 1;
  private int S321 = 1;
  private int S375 = 1;
  private int S353 = 1;
  private int S386 = 1;
  private int S478 = 1;
  private int S396 = 1;
  private int S404 = 1;
  private int S412 = 1;
  private int S420 = 1;
  private int S428 = 1;
  private int S436 = 1;
  private int S444 = 1;
  private int S452 = 1;
  private int S460 = 1;
  private int S468 = 1;
  private int S476 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread525(int [] tdone, int [] ends){
        switch(S476){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 138, column: 24
          bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 138, column: 38
          currsigs.addElement(bottleAtPos5RT);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread524(int [] tdone, int [] ends){
        switch(S468){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 24
          bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 38
          currsigs.addElement(bottleAtPos4RT);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread523(int [] tdone, int [] ends){
        switch(S460){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 24
          bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 38
          currsigs.addElement(bottleAtPos3RT);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread522(int [] tdone, int [] ends){
        switch(S452){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 24
          bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 38
          currsigs.addElement(bottleAtPos2RT);
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

  public void thread521(int [] tdone, int [] ends){
        switch(S444){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 24
          bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 38
          currsigs.addElement(bottleAtPos1RT);
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

  public void thread520(int [] tdone, int [] ends){
        switch(S436){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 127, column: 24
          bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 127, column: 40
          currsigs.addElement(bottleLeftPos5E);
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

  public void thread519(int [] tdone, int [] ends){
        switch(S428){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 24
          bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 38
          currsigs.addElement(bottleAtPos5E);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread518(int [] tdone, int [] ends){
        switch(S420){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 24
          bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 38
          currsigs.addElement(bottleAtPos4E);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread517(int [] tdone, int [] ends){
        switch(S412){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 24
          bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 38
          currsigs.addElement(bottleAtPos3E);
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

  public void thread516(int [] tdone, int [] ends){
        switch(S404){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 24
          bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 38
          currsigs.addElement(bottleAtPos2E);
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

  public void thread515(int [] tdone, int [] ends){
        switch(S396){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 24
          bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 38
          currsigs.addElement(bottleAtPos1E);
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

  public void thread514(int [] tdone, int [] ends){
        switch(S478){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread515(tdone,ends);
        thread516(tdone,ends);
        thread517(tdone,ends);
        thread518(tdone,ends);
        thread519(tdone,ends);
        thread520(tdone,ends);
        thread521(tdone,ends);
        thread522(tdone,ends);
        thread523(tdone,ends);
        thread524(tdone,ends);
        thread525(tdone,ends);
        int biggest526 = 0;
        if(ends[11]>=biggest526){
          biggest526=ends[11];
        }
        if(ends[12]>=biggest526){
          biggest526=ends[12];
        }
        if(ends[13]>=biggest526){
          biggest526=ends[13];
        }
        if(ends[14]>=biggest526){
          biggest526=ends[14];
        }
        if(ends[15]>=biggest526){
          biggest526=ends[15];
        }
        if(ends[16]>=biggest526){
          biggest526=ends[16];
        }
        if(ends[17]>=biggest526){
          biggest526=ends[17];
        }
        if(ends[18]>=biggest526){
          biggest526=ends[18];
        }
        if(ends[19]>=biggest526){
          biggest526=ends[19];
        }
        if(ends[20]>=biggest526){
          biggest526=ends[20];
        }
        if(ends[21]>=biggest526){
          biggest526=ends[21];
        }
        if(biggest526 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest526 == 0){
          S478=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread512(int [] tdone, int [] ends){
        switch(S386){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus() && motorOn.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 13
          System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 106, column: 6
          bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 107, column: 6
          currsigs.addElement(bottleLeftPos5);
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

  public void thread511(int [] tdone, int [] ends){
        switch(S375){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S353){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 12
              S353=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S353=1;
            S353=0;
            if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 13
              System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 94, column: 7
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S353=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread510(int [] tdone, int [] ends){
        switch(S343){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S321){
          case 0 : 
            if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 12
              S321=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S321=1;
            S321=0;
            if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 13
              System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 82, column: 7
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S321=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread509(int [] tdone, int [] ends){
        switch(S311){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S289){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 12
              S289=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S289=1;
            S289=0;
            if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 13
              System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 70, column: 7
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S289=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread508(int [] tdone, int [] ends){
        switch(S279){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S239){
          case 0 : 
            if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 12
              S239=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 59, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S239=1;
            S239=0;
            if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 13
              System.out.println("Bottle at pre pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 6
              System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 58, column: 7
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 59, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S239=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread507(int [] tdone, int [] ends){
        switch(S220){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S164){
          case 0 : 
            if(bottleAtPos0.getprestatus() && motorOn.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 42, column: 11
              System.out.println("ConveyorPlant: Bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 43, column: 5
              S164=1;
              System.out.println("Bottle at pos 1");//sysj\Conveyor\ConveyorPlant.sysj line: 46, column: 6
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 47, column: 6
              currsigs.addElement(bottleAtPos1);
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
          
          case 1 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 45, column: 11
              S164=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 47, column: 6
              currsigs.addElement(bottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S164=2;
            System.out.println("ConveyorPlant: Waiting for bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 41, column: 5
            S164=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread506(int [] tdone, int [] ends){
        switch(S388){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread507(tdone,ends);
        thread508(tdone,ends);
        thread509(tdone,ends);
        thread510(tdone,ends);
        thread511(tdone,ends);
        thread512(tdone,ends);
        int biggest513 = 0;
        if(ends[4]>=biggest513){
          biggest513=ends[4];
        }
        if(ends[5]>=biggest513){
          biggest513=ends[5];
        }
        if(ends[6]>=biggest513){
          biggest513=ends[6];
        }
        if(ends[7]>=biggest513){
          biggest513=ends[7];
        }
        if(ends[8]>=biggest513){
          biggest513=ends[8];
        }
        if(ends[9]>=biggest513){
          biggest513=ends[9];
        }
        if(biggest513 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest513 == 0){
          S388=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread505(int [] tdone, int [] ends){
        switch(S161){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S105){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
              S105=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
                S105=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
                motorOn.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
                currsigs.addElement(motorOn);
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
            if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
              S105=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(motorOn);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S105=2;
            S105=0;
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
              S105=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
                S105=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
                motorOn.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
                currsigs.addElement(motorOn);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 20, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread502(int [] tdone, int [] ends){
        S476=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 138, column: 24
      bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 138, column: 38
      currsigs.addElement(bottleAtPos5RT);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread501(int [] tdone, int [] ends){
        S468=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 24
      bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 38
      currsigs.addElement(bottleAtPos4RT);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread500(int [] tdone, int [] ends){
        S460=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 24
      bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 38
      currsigs.addElement(bottleAtPos3RT);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread499(int [] tdone, int [] ends){
        S452=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 24
      bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 38
      currsigs.addElement(bottleAtPos2RT);
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

  public void thread498(int [] tdone, int [] ends){
        S444=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 24
      bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 38
      currsigs.addElement(bottleAtPos1RT);
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

  public void thread497(int [] tdone, int [] ends){
        S436=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 127, column: 24
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 127, column: 40
      currsigs.addElement(bottleLeftPos5E);
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

  public void thread496(int [] tdone, int [] ends){
        S428=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 24
      bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 38
      currsigs.addElement(bottleAtPos5E);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread495(int [] tdone, int [] ends){
        S420=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 24
      bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 38
      currsigs.addElement(bottleAtPos4E);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread494(int [] tdone, int [] ends){
        S412=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 24
      bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 38
      currsigs.addElement(bottleAtPos3E);
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

  public void thread493(int [] tdone, int [] ends){
        S404=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 24
      bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 38
      currsigs.addElement(bottleAtPos2E);
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

  public void thread492(int [] tdone, int [] ends){
        S396=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 24
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 38
      currsigs.addElement(bottleAtPos1E);
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

  public void thread491(int [] tdone, int [] ends){
        S478=1;
    thread492(tdone,ends);
    thread493(tdone,ends);
    thread494(tdone,ends);
    thread495(tdone,ends);
    thread496(tdone,ends);
    thread497(tdone,ends);
    thread498(tdone,ends);
    thread499(tdone,ends);
    thread500(tdone,ends);
    thread501(tdone,ends);
    thread502(tdone,ends);
    int biggest503 = 0;
    if(ends[11]>=biggest503){
      biggest503=ends[11];
    }
    if(ends[12]>=biggest503){
      biggest503=ends[12];
    }
    if(ends[13]>=biggest503){
      biggest503=ends[13];
    }
    if(ends[14]>=biggest503){
      biggest503=ends[14];
    }
    if(ends[15]>=biggest503){
      biggest503=ends[15];
    }
    if(ends[16]>=biggest503){
      biggest503=ends[16];
    }
    if(ends[17]>=biggest503){
      biggest503=ends[17];
    }
    if(ends[18]>=biggest503){
      biggest503=ends[18];
    }
    if(ends[19]>=biggest503){
      biggest503=ends[19];
    }
    if(ends[20]>=biggest503){
      biggest503=ends[20];
    }
    if(ends[21]>=biggest503){
      biggest503=ends[21];
    }
    if(biggest503 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread489(int [] tdone, int [] ends){
        S386=1;
    if(bottleAtPos5.getprestatus() && motorOn.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 13
      System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 106, column: 6
      bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 107, column: 6
      currsigs.addElement(bottleLeftPos5);
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

  public void thread488(int [] tdone, int [] ends){
        S375=1;
    S353=0;
    if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 13
      System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 94, column: 7
      bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
      currsigs.addElement(bottleAtPos5);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S353=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread487(int [] tdone, int [] ends){
        S343=1;
    S321=0;
    if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 13
      System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 82, column: 7
      bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
      currsigs.addElement(bottleAtPos4);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S321=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread486(int [] tdone, int [] ends){
        S311=1;
    S289=0;
    if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 13
      System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 70, column: 7
      bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
      currsigs.addElement(bottleAtPos3);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S289=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread485(int [] tdone, int [] ends){
        S279=1;
    S239=0;
    if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 13
      System.out.println("Bottle at pre pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 6
      System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 58, column: 7
      bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 59, column: 7
      currsigs.addElement(bottleAtPos2);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S239=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread484(int [] tdone, int [] ends){
        S220=1;
    System.out.println("ConveyorPlant: Waiting for bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 41, column: 5
    S164=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread483(int [] tdone, int [] ends){
        S388=1;
    thread484(tdone,ends);
    thread485(tdone,ends);
    thread486(tdone,ends);
    thread487(tdone,ends);
    thread488(tdone,ends);
    thread489(tdone,ends);
    int biggest490 = 0;
    if(ends[4]>=biggest490){
      biggest490=ends[4];
    }
    if(ends[5]>=biggest490){
      biggest490=ends[5];
    }
    if(ends[6]>=biggest490){
      biggest490=ends[6];
    }
    if(ends[7]>=biggest490){
      biggest490=ends[7];
    }
    if(ends[8]>=biggest490){
      biggest490=ends[8];
    }
    if(ends[9]>=biggest490){
      biggest490=ends[9];
    }
    if(biggest490 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread482(int [] tdone, int [] ends){
        S161=1;
    S105=0;
    if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
      S105=1;
      if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
        S105=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
        motorOn.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
        currsigs.addElement(motorOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 20, column: 5
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
      switch(S480){
        case 0 : 
          S480=0;
          break RUN;
        
        case 1 : 
          S480=2;
          S480=2;
          thread482(tdone,ends);
          thread483(tdone,ends);
          thread491(tdone,ends);
          int biggest504 = 0;
          if(ends[2]>=biggest504){
            biggest504=ends[2];
          }
          if(ends[3]>=biggest504){
            biggest504=ends[3];
          }
          if(ends[10]>=biggest504){
            biggest504=ends[10];
          }
          if(biggest504 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread505(tdone,ends);
          thread506(tdone,ends);
          thread514(tdone,ends);
          int biggest527 = 0;
          if(ends[2]>=biggest527){
            biggest527=ends[2];
          }
          if(ends[3]>=biggest527){
            biggest527=ends[3];
          }
          if(ends[10]>=biggest527){
            biggest527=ends[10];
          }
          if(biggest527 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest527 == 0){
            S480=0;
            active[1]=0;
            ends[1]=0;
            S480=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          rotaryTableTrigger.gethook();
          bottleAtPos0.gethook();
          RTPutBottleAt2.gethook();
          RTPutBottleAt3.gethook();
          RTPutBottleAt4.gethook();
          RTPutBottleAt5.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos0.setpreclear();
      RTPutBottleAt2.setpreclear();
      RTPutBottleAt3.setpreclear();
      RTPutBottleAt4.setpreclear();
      RTPutBottleAt5.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleAtPos1E.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos3E.setpreclear();
      bottleAtPos4E.setpreclear();
      bottleAtPos5E.setpreclear();
      bottleLeftPos5E.setpreclear();
      motorOn.setpreclear();
      bottleLeftPos5TL.setpreclear();
      bottleAtPos1RT.setpreclear();
      bottleAtPos2RT.setpreclear();
      bottleAtPos3RT.setpreclear();
      bottleAtPos4RT.setpreclear();
      bottleAtPos5RT.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = bottleAtPos0.getStatus() ? bottleAtPos0.setprepresent() : bottleAtPos0.setpreclear();
      bottleAtPos0.setpreval(bottleAtPos0.getValue());
      bottleAtPos0.setClear();
      dummyint = RTPutBottleAt2.getStatus() ? RTPutBottleAt2.setprepresent() : RTPutBottleAt2.setpreclear();
      RTPutBottleAt2.setpreval(RTPutBottleAt2.getValue());
      RTPutBottleAt2.setClear();
      dummyint = RTPutBottleAt3.getStatus() ? RTPutBottleAt3.setprepresent() : RTPutBottleAt3.setpreclear();
      RTPutBottleAt3.setpreval(RTPutBottleAt3.getValue());
      RTPutBottleAt3.setClear();
      dummyint = RTPutBottleAt4.getStatus() ? RTPutBottleAt4.setprepresent() : RTPutBottleAt4.setpreclear();
      RTPutBottleAt4.setpreval(RTPutBottleAt4.getValue());
      RTPutBottleAt4.setClear();
      dummyint = RTPutBottleAt5.getStatus() ? RTPutBottleAt5.setprepresent() : RTPutBottleAt5.setpreclear();
      RTPutBottleAt5.setpreval(RTPutBottleAt5.getValue());
      RTPutBottleAt5.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      bottleLeftPos5E.sethook();
      bottleLeftPos5E.setClear();
      motorOn.sethook();
      motorOn.setClear();
      bottleLeftPos5TL.sethook();
      bottleLeftPos5TL.setClear();
      bottleAtPos1RT.sethook();
      bottleAtPos1RT.setClear();
      bottleAtPos2RT.sethook();
      bottleAtPos2RT.setClear();
      bottleAtPos3RT.sethook();
      bottleAtPos3RT.setClear();
      bottleAtPos4RT.sethook();
      bottleAtPos4RT.setClear();
      bottleAtPos5RT.sethook();
      bottleAtPos5RT.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
        rotaryTableTrigger.gethook();
        bottleAtPos0.gethook();
        RTPutBottleAt2.gethook();
        RTPutBottleAt3.gethook();
        RTPutBottleAt4.gethook();
        RTPutBottleAt5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
