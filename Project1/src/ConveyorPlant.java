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
  private int S481 = 1;
  private int S162 = 1;
  private int S106 = 1;
  private int S389 = 1;
  private int S221 = 1;
  private int S165 = 1;
  private int S280 = 1;
  private int S240 = 1;
  private int S312 = 1;
  private int S290 = 1;
  private int S344 = 1;
  private int S322 = 1;
  private int S376 = 1;
  private int S354 = 1;
  private int S387 = 1;
  private int S479 = 1;
  private int S397 = 1;
  private int S405 = 1;
  private int S413 = 1;
  private int S421 = 1;
  private int S429 = 1;
  private int S437 = 1;
  private int S445 = 1;
  private int S453 = 1;
  private int S461 = 1;
  private int S469 = 1;
  private int S477 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread526(int [] tdone, int [] ends){
        switch(S477){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 139, column: 24
          bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 139, column: 38
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

  public void thread525(int [] tdone, int [] ends){
        switch(S469){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 137, column: 24
          bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 137, column: 38
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

  public void thread524(int [] tdone, int [] ends){
        switch(S461){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 135, column: 24
          bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 135, column: 38
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

  public void thread523(int [] tdone, int [] ends){
        switch(S453){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 133, column: 24
          bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 133, column: 38
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

  public void thread522(int [] tdone, int [] ends){
        switch(S445){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 131, column: 24
          bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 131, column: 38
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

  public void thread521(int [] tdone, int [] ends){
        switch(S437){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 24
          bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 40
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

  public void thread520(int [] tdone, int [] ends){
        switch(S429){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 126, column: 24
          bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 126, column: 38
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

  public void thread519(int [] tdone, int [] ends){
        switch(S421){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 124, column: 24
          bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 124, column: 38
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

  public void thread518(int [] tdone, int [] ends){
        switch(S413){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 122, column: 24
          bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 122, column: 38
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

  public void thread517(int [] tdone, int [] ends){
        switch(S405){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 120, column: 24
          bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 120, column: 38
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

  public void thread516(int [] tdone, int [] ends){
        switch(S397){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 118, column: 24
          bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 118, column: 38
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

  public void thread515(int [] tdone, int [] ends){
        switch(S479){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
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
        thread526(tdone,ends);
        int biggest527 = 0;
        if(ends[11]>=biggest527){
          biggest527=ends[11];
        }
        if(ends[12]>=biggest527){
          biggest527=ends[12];
        }
        if(ends[13]>=biggest527){
          biggest527=ends[13];
        }
        if(ends[14]>=biggest527){
          biggest527=ends[14];
        }
        if(ends[15]>=biggest527){
          biggest527=ends[15];
        }
        if(ends[16]>=biggest527){
          biggest527=ends[16];
        }
        if(ends[17]>=biggest527){
          biggest527=ends[17];
        }
        if(ends[18]>=biggest527){
          biggest527=ends[18];
        }
        if(ends[19]>=biggest527){
          biggest527=ends[19];
        }
        if(ends[20]>=biggest527){
          biggest527=ends[20];
        }
        if(ends[21]>=biggest527){
          biggest527=ends[21];
        }
        if(biggest527 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest527 == 0){
          S479=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread513(int [] tdone, int [] ends){
        switch(S387){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 105, column: 13
          System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 107, column: 6
          bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 108, column: 6
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

  public void thread512(int [] tdone, int [] ends){
        switch(S376){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S354){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 94, column: 12
              S354=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 96, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S354=1;
            S354=0;
            if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 13
              System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 96, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S354=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread511(int [] tdone, int [] ends){
        switch(S344){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S322){
          case 0 : 
            if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 82, column: 12
              S322=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 84, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S322=1;
            S322=0;
            if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 13
              System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 84, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S322=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread510(int [] tdone, int [] ends){
        switch(S312){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S290){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 70, column: 12
              S290=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 72, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S290=1;
            S290=0;
            if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 13
              System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 72, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S290=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread509(int [] tdone, int [] ends){
        switch(S280){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S240){
          case 0 : 
            if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 58, column: 12
              S240=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 60, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S240=1;
            S240=0;
            if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 13
              System.out.println("Bottle at pre pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 6
              System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 59, column: 7
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 60, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S240=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread508(int [] tdone, int [] ends){
        switch(S221){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S165){
          case 0 : 
            if(bottleAtPos0.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 43, column: 11
              System.out.println("ConveyorPlant: Bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 44, column: 5
              S165=1;
              System.out.println("Bottle at pos 1");//sysj\Conveyor\ConveyorPlant.sysj line: 47, column: 6
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 48, column: 6
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
            if(rotaryTableTrigger.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 46, column: 11
              S165=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 48, column: 6
              currsigs.addElement(bottleAtPos1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S165=2;
            System.out.println("ConveyorPlant: Waiting for bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 42, column: 5
            S165=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread507(int [] tdone, int [] ends){
        switch(S389){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread508(tdone,ends);
        thread509(tdone,ends);
        thread510(tdone,ends);
        thread511(tdone,ends);
        thread512(tdone,ends);
        thread513(tdone,ends);
        int biggest514 = 0;
        if(ends[4]>=biggest514){
          biggest514=ends[4];
        }
        if(ends[5]>=biggest514){
          biggest514=ends[5];
        }
        if(ends[6]>=biggest514){
          biggest514=ends[6];
        }
        if(ends[7]>=biggest514){
          biggest514=ends[7];
        }
        if(ends[8]>=biggest514){
          biggest514=ends[8];
        }
        if(ends[9]>=biggest514){
          biggest514=ends[9];
        }
        if(biggest514 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest514 == 0){
          S389=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread506(int [] tdone, int [] ends){
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

  public void thread503(int [] tdone, int [] ends){
        S477=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 139, column: 24
      bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 139, column: 38
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

  public void thread502(int [] tdone, int [] ends){
        S469=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 137, column: 24
      bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 137, column: 38
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

  public void thread501(int [] tdone, int [] ends){
        S461=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 135, column: 24
      bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 135, column: 38
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

  public void thread500(int [] tdone, int [] ends){
        S453=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 133, column: 24
      bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 133, column: 38
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

  public void thread499(int [] tdone, int [] ends){
        S445=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 131, column: 24
      bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 131, column: 38
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

  public void thread498(int [] tdone, int [] ends){
        S437=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 24
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 40
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

  public void thread497(int [] tdone, int [] ends){
        S429=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 126, column: 24
      bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 126, column: 38
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

  public void thread496(int [] tdone, int [] ends){
        S421=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 124, column: 24
      bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 124, column: 38
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

  public void thread495(int [] tdone, int [] ends){
        S413=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 122, column: 24
      bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 122, column: 38
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

  public void thread494(int [] tdone, int [] ends){
        S405=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 120, column: 24
      bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 120, column: 38
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

  public void thread493(int [] tdone, int [] ends){
        S397=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 118, column: 24
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 118, column: 38
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

  public void thread492(int [] tdone, int [] ends){
        S479=1;
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
    thread503(tdone,ends);
    int biggest504 = 0;
    if(ends[11]>=biggest504){
      biggest504=ends[11];
    }
    if(ends[12]>=biggest504){
      biggest504=ends[12];
    }
    if(ends[13]>=biggest504){
      biggest504=ends[13];
    }
    if(ends[14]>=biggest504){
      biggest504=ends[14];
    }
    if(ends[15]>=biggest504){
      biggest504=ends[15];
    }
    if(ends[16]>=biggest504){
      biggest504=ends[16];
    }
    if(ends[17]>=biggest504){
      biggest504=ends[17];
    }
    if(ends[18]>=biggest504){
      biggest504=ends[18];
    }
    if(ends[19]>=biggest504){
      biggest504=ends[19];
    }
    if(ends[20]>=biggest504){
      biggest504=ends[20];
    }
    if(ends[21]>=biggest504){
      biggest504=ends[21];
    }
    if(biggest504 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread490(int [] tdone, int [] ends){
        S387=1;
    if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 105, column: 13
      System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 107, column: 6
      bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 108, column: 6
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

  public void thread489(int [] tdone, int [] ends){
        S376=1;
    S354=0;
    if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 13
      System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 95, column: 7
      bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 96, column: 7
      currsigs.addElement(bottleAtPos5);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S354=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread488(int [] tdone, int [] ends){
        S344=1;
    S322=0;
    if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 13
      System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 83, column: 7
      bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 84, column: 7
      currsigs.addElement(bottleAtPos4);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S322=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread487(int [] tdone, int [] ends){
        S312=1;
    S290=0;
    if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 13
      System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 71, column: 7
      bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 72, column: 7
      currsigs.addElement(bottleAtPos3);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S290=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread486(int [] tdone, int [] ends){
        S280=1;
    S240=0;
    if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 13
      System.out.println("Bottle at pre pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 6
      System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 59, column: 7
      bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 60, column: 7
      currsigs.addElement(bottleAtPos2);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S240=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread485(int [] tdone, int [] ends){
        S221=1;
    System.out.println("ConveyorPlant: Waiting for bottle at pos 0");//sysj\Conveyor\ConveyorPlant.sysj line: 42, column: 5
    S165=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread484(int [] tdone, int [] ends){
        S389=1;
    thread485(tdone,ends);
    thread486(tdone,ends);
    thread487(tdone,ends);
    thread488(tdone,ends);
    thread489(tdone,ends);
    thread490(tdone,ends);
    int biggest491 = 0;
    if(ends[4]>=biggest491){
      biggest491=ends[4];
    }
    if(ends[5]>=biggest491){
      biggest491=ends[5];
    }
    if(ends[6]>=biggest491){
      biggest491=ends[6];
    }
    if(ends[7]>=biggest491){
      biggest491=ends[7];
    }
    if(ends[8]>=biggest491){
      biggest491=ends[8];
    }
    if(ends[9]>=biggest491){
      biggest491=ends[9];
    }
    if(biggest491 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread483(int [] tdone, int [] ends){
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
      switch(S481){
        case 0 : 
          S481=0;
          break RUN;
        
        case 1 : 
          S481=2;
          S481=2;
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread483(tdone,ends);
          thread484(tdone,ends);
          thread492(tdone,ends);
          int biggest505 = 0;
          if(ends[2]>=biggest505){
            biggest505=ends[2];
          }
          if(ends[3]>=biggest505){
            biggest505=ends[3];
          }
          if(ends[10]>=biggest505){
            biggest505=ends[10];
          }
          if(biggest505 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread506(tdone,ends);
          thread507(tdone,ends);
          thread515(tdone,ends);
          int biggest528 = 0;
          if(ends[2]>=biggest528){
            biggest528=ends[2];
          }
          if(ends[3]>=biggest528){
            biggest528=ends[3];
          }
          if(ends[10]>=biggest528){
            biggest528=ends[10];
          }
          if(biggest528 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest528 == 0){
            S481=0;
            active[1]=0;
            ends[1]=0;
            S481=0;
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
