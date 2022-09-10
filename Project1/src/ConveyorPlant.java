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
  public Signal bottleAtPos1RT = new Signal("bottleAtPos1RT", Signal.OUTPUT);
  public Signal bottleAtPos2RT = new Signal("bottleAtPos2RT", Signal.OUTPUT);
  public Signal bottleAtPos3RT = new Signal("bottleAtPos3RT", Signal.OUTPUT);
  public Signal bottleAtPos4RT = new Signal("bottleAtPos4RT", Signal.OUTPUT);
  public Signal bottleAtPos5RT = new Signal("bottleAtPos5RT", Signal.OUTPUT);
  private Signal motorOn_1;
  private int S532 = 1;
  private int S162 = 1;
  private int S106 = 1;
  private int S440 = 1;
  private int S218 = 1;
  private int S180 = 1;
  private int S331 = 1;
  private int S255 = 1;
  private int S363 = 1;
  private int S341 = 1;
  private int S395 = 1;
  private int S373 = 1;
  private int S427 = 1;
  private int S405 = 1;
  private int S438 = 1;
  private int S530 = 1;
  private int S448 = 1;
  private int S456 = 1;
  private int S464 = 1;
  private int S472 = 1;
  private int S480 = 1;
  private int S488 = 1;
  private int S496 = 1;
  private int S504 = 1;
  private int S512 = 1;
  private int S520 = 1;
  private int S528 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread577(int [] tdone, int [] ends){
        switch(S528){
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

  public void thread576(int [] tdone, int [] ends){
        switch(S520){
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

  public void thread575(int [] tdone, int [] ends){
        switch(S512){
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

  public void thread574(int [] tdone, int [] ends){
        switch(S504){
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

  public void thread573(int [] tdone, int [] ends){
        switch(S496){
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

  public void thread572(int [] tdone, int [] ends){
        switch(S488){
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

  public void thread571(int [] tdone, int [] ends){
        switch(S480){
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

  public void thread570(int [] tdone, int [] ends){
        switch(S472){
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

  public void thread569(int [] tdone, int [] ends){
        switch(S464){
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

  public void thread568(int [] tdone, int [] ends){
        switch(S456){
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

  public void thread567(int [] tdone, int [] ends){
        switch(S448){
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

  public void thread566(int [] tdone, int [] ends){
        switch(S530){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread567(tdone,ends);
        thread568(tdone,ends);
        thread569(tdone,ends);
        thread570(tdone,ends);
        thread571(tdone,ends);
        thread572(tdone,ends);
        thread573(tdone,ends);
        thread574(tdone,ends);
        thread575(tdone,ends);
        thread576(tdone,ends);
        thread577(tdone,ends);
        int biggest578 = 0;
        if(ends[11]>=biggest578){
          biggest578=ends[11];
        }
        if(ends[12]>=biggest578){
          biggest578=ends[12];
        }
        if(ends[13]>=biggest578){
          biggest578=ends[13];
        }
        if(ends[14]>=biggest578){
          biggest578=ends[14];
        }
        if(ends[15]>=biggest578){
          biggest578=ends[15];
        }
        if(ends[16]>=biggest578){
          biggest578=ends[16];
        }
        if(ends[17]>=biggest578){
          biggest578=ends[17];
        }
        if(ends[18]>=biggest578){
          biggest578=ends[18];
        }
        if(ends[19]>=biggest578){
          biggest578=ends[19];
        }
        if(ends[20]>=biggest578){
          biggest578=ends[20];
        }
        if(ends[21]>=biggest578){
          biggest578=ends[21];
        }
        if(biggest578 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest578 == 0){
          S530=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread564(int [] tdone, int [] ends){
        switch(S438){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 13
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

  public void thread563(int [] tdone, int [] ends){
        switch(S427){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S405){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 12
              S405=1;
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
            S405=1;
            S405=0;
            if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 13
              System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 94, column: 7
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S405=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread562(int [] tdone, int [] ends){
        switch(S395){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S373){
          case 0 : 
            if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 12
              S373=1;
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
            S373=1;
            S373=0;
            if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 13
              System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 82, column: 7
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S373=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread561(int [] tdone, int [] ends){
        switch(S363){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S341){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 12
              S341=1;
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
            S341=1;
            S341=0;
            if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 13
              System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 70, column: 7
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S341=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread560(int [] tdone, int [] ends){
        switch(S331){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S255){
          case 0 : 
            if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 12
              S255=1;
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
            S255=1;
            System.out.println("tester2");//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 5
            S255=0;
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
              S255=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread559(int [] tdone, int [] ends){
        switch(S218){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S180){
          case 0 : 
            if(motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 43, column: 11
              S180=1;
              System.out.println("Bottle at pos 1");//sysj\Conveyor\ConveyorPlant.sysj line: 45, column: 6
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 46, column: 6
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
            if(rotaryTableTrigger.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 44, column: 11
              S180=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 46, column: 6
              currsigs.addElement(bottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S180=2;
            S180=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread558(int [] tdone, int [] ends){
        switch(S440){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread559(tdone,ends);
        thread560(tdone,ends);
        thread561(tdone,ends);
        thread562(tdone,ends);
        thread563(tdone,ends);
        thread564(tdone,ends);
        int biggest565 = 0;
        if(ends[4]>=biggest565){
          biggest565=ends[4];
        }
        if(ends[5]>=biggest565){
          biggest565=ends[5];
        }
        if(ends[6]>=biggest565){
          biggest565=ends[6];
        }
        if(ends[7]>=biggest565){
          biggest565=ends[7];
        }
        if(ends[8]>=biggest565){
          biggest565=ends[8];
        }
        if(ends[9]>=biggest565){
          biggest565=ends[9];
        }
        if(biggest565 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest565 == 0){
          S440=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread557(int [] tdone, int [] ends){
        switch(S162){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S106){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 20, column: 20
              S106=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 20
                S106=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 26, column: 5
                currsigs.addElement(motorOn_1);
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
            if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 20
              S106=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 26, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S106=2;
            S106=0;
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 20, column: 20
              S106=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 20
                S106=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 26, column: 5
                currsigs.addElement(motorOn_1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 5
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread554(int [] tdone, int [] ends){
        S528=1;
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

  public void thread553(int [] tdone, int [] ends){
        S520=1;
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

  public void thread552(int [] tdone, int [] ends){
        S512=1;
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

  public void thread551(int [] tdone, int [] ends){
        S504=1;
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

  public void thread550(int [] tdone, int [] ends){
        S496=1;
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

  public void thread549(int [] tdone, int [] ends){
        S488=1;
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

  public void thread548(int [] tdone, int [] ends){
        S480=1;
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

  public void thread547(int [] tdone, int [] ends){
        S472=1;
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

  public void thread546(int [] tdone, int [] ends){
        S464=1;
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

  public void thread545(int [] tdone, int [] ends){
        S456=1;
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

  public void thread544(int [] tdone, int [] ends){
        S448=1;
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

  public void thread543(int [] tdone, int [] ends){
        S530=1;
    thread544(tdone,ends);
    thread545(tdone,ends);
    thread546(tdone,ends);
    thread547(tdone,ends);
    thread548(tdone,ends);
    thread549(tdone,ends);
    thread550(tdone,ends);
    thread551(tdone,ends);
    thread552(tdone,ends);
    thread553(tdone,ends);
    thread554(tdone,ends);
    int biggest555 = 0;
    if(ends[11]>=biggest555){
      biggest555=ends[11];
    }
    if(ends[12]>=biggest555){
      biggest555=ends[12];
    }
    if(ends[13]>=biggest555){
      biggest555=ends[13];
    }
    if(ends[14]>=biggest555){
      biggest555=ends[14];
    }
    if(ends[15]>=biggest555){
      biggest555=ends[15];
    }
    if(ends[16]>=biggest555){
      biggest555=ends[16];
    }
    if(ends[17]>=biggest555){
      biggest555=ends[17];
    }
    if(ends[18]>=biggest555){
      biggest555=ends[18];
    }
    if(ends[19]>=biggest555){
      biggest555=ends[19];
    }
    if(ends[20]>=biggest555){
      biggest555=ends[20];
    }
    if(ends[21]>=biggest555){
      biggest555=ends[21];
    }
    if(biggest555 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread541(int [] tdone, int [] ends){
        S438=1;
    if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 13
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

  public void thread540(int [] tdone, int [] ends){
        S427=1;
    S405=0;
    if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 13
      System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 94, column: 7
      bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
      currsigs.addElement(bottleAtPos5);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S405=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread539(int [] tdone, int [] ends){
        S395=1;
    S373=0;
    if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 13
      System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 82, column: 7
      bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
      currsigs.addElement(bottleAtPos4);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S373=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread538(int [] tdone, int [] ends){
        S363=1;
    S341=0;
    if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 13
      System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 70, column: 7
      bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
      currsigs.addElement(bottleAtPos3);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S341=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread537(int [] tdone, int [] ends){
        S331=1;
    System.out.println("tester2");//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 5
    S255=0;
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
      S255=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread536(int [] tdone, int [] ends){
        S218=1;
    S180=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread535(int [] tdone, int [] ends){
        S440=1;
    thread536(tdone,ends);
    thread537(tdone,ends);
    thread538(tdone,ends);
    thread539(tdone,ends);
    thread540(tdone,ends);
    thread541(tdone,ends);
    int biggest542 = 0;
    if(ends[4]>=biggest542){
      biggest542=ends[4];
    }
    if(ends[5]>=biggest542){
      biggest542=ends[5];
    }
    if(ends[6]>=biggest542){
      biggest542=ends[6];
    }
    if(ends[7]>=biggest542){
      biggest542=ends[7];
    }
    if(ends[8]>=biggest542){
      biggest542=ends[8];
    }
    if(ends[9]>=biggest542){
      biggest542=ends[9];
    }
    if(biggest542 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread534(int [] tdone, int [] ends){
        S162=1;
    S106=0;
    if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 20, column: 20
      S106=1;
      if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 20
        S106=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
        motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 26, column: 5
        currsigs.addElement(motorOn_1);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
    else {
      System.out.println("ConveyorPlant: Conveyor Off");//sysj\Conveyor\ConveyorPlant.sysj line: 21, column: 5
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
      switch(S532){
        case 0 : 
          S532=0;
          break RUN;
        
        case 1 : 
          S532=2;
          S532=2;
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread534(tdone,ends);
          thread535(tdone,ends);
          thread543(tdone,ends);
          int biggest556 = 0;
          if(ends[2]>=biggest556){
            biggest556=ends[2];
          }
          if(ends[3]>=biggest556){
            biggest556=ends[3];
          }
          if(ends[10]>=biggest556){
            biggest556=ends[10];
          }
          if(biggest556 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread557(tdone,ends);
          thread558(tdone,ends);
          thread566(tdone,ends);
          int biggest579 = 0;
          if(ends[2]>=biggest579){
            biggest579=ends[2];
          }
          if(ends[3]>=biggest579){
            biggest579=ends[3];
          }
          if(ends[10]>=biggest579){
            biggest579=ends[10];
          }
          if(biggest579 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest579 == 0){
            S532=0;
            active[1]=0;
            ends[1]=0;
            S532=0;
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
    motorOn_1 = new Signal();
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
      bottleAtPos1RT.setpreclear();
      bottleAtPos2RT.setpreclear();
      bottleAtPos3RT.setpreclear();
      bottleAtPos4RT.setpreclear();
      bottleAtPos5RT.setpreclear();
      motorOn_1.setpreclear();
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
      motorOn_1.setClear();
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
