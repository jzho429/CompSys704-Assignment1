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
  private int S451 = 1;
  private int S162 = 1;
  private int S106 = 1;
  private int S359 = 1;
  private int S218 = 1;
  private int S180 = 1;
  private int S250 = 1;
  private int S228 = 1;
  private int S282 = 1;
  private int S260 = 1;
  private int S314 = 1;
  private int S292 = 1;
  private int S346 = 1;
  private int S324 = 1;
  private int S357 = 1;
  private int S449 = 1;
  private int S367 = 1;
  private int S375 = 1;
  private int S383 = 1;
  private int S391 = 1;
  private int S399 = 1;
  private int S407 = 1;
  private int S415 = 1;
  private int S423 = 1;
  private int S431 = 1;
  private int S439 = 1;
  private int S447 = 1;
  
  private int[] ends = new int[22];
  private int[] tdone = new int[22];
  
  public void thread496(int [] tdone, int [] ends){
        switch(S447){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 24
          bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 38
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

  public void thread495(int [] tdone, int [] ends){
        switch(S439){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 24
          bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 38
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

  public void thread494(int [] tdone, int [] ends){
        switch(S431){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 24
          bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 38
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

  public void thread493(int [] tdone, int [] ends){
        switch(S423){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 24
          bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 38
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

  public void thread492(int [] tdone, int [] ends){
        switch(S415){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 24
          bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 38
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

  public void thread491(int [] tdone, int [] ends){
        switch(S407){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 24
          bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 40
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

  public void thread490(int [] tdone, int [] ends){
        switch(S399){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 24
          bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 38
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

  public void thread489(int [] tdone, int [] ends){
        switch(S391){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 24
          bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 38
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

  public void thread488(int [] tdone, int [] ends){
        switch(S383){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 24
          bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 38
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

  public void thread487(int [] tdone, int [] ends){
        switch(S375){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 24
          bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 38
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

  public void thread486(int [] tdone, int [] ends){
        switch(S367){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 24
          bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 38
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

  public void thread485(int [] tdone, int [] ends){
        switch(S449){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread486(tdone,ends);
        thread487(tdone,ends);
        thread488(tdone,ends);
        thread489(tdone,ends);
        thread490(tdone,ends);
        thread491(tdone,ends);
        thread492(tdone,ends);
        thread493(tdone,ends);
        thread494(tdone,ends);
        thread495(tdone,ends);
        thread496(tdone,ends);
        int biggest497 = 0;
        if(ends[11]>=biggest497){
          biggest497=ends[11];
        }
        if(ends[12]>=biggest497){
          biggest497=ends[12];
        }
        if(ends[13]>=biggest497){
          biggest497=ends[13];
        }
        if(ends[14]>=biggest497){
          biggest497=ends[14];
        }
        if(ends[15]>=biggest497){
          biggest497=ends[15];
        }
        if(ends[16]>=biggest497){
          biggest497=ends[16];
        }
        if(ends[17]>=biggest497){
          biggest497=ends[17];
        }
        if(ends[18]>=biggest497){
          biggest497=ends[18];
        }
        if(ends[19]>=biggest497){
          biggest497=ends[19];
        }
        if(ends[20]>=biggest497){
          biggest497=ends[20];
        }
        if(ends[21]>=biggest497){
          biggest497=ends[21];
        }
        if(biggest497 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest497 == 0){
          S449=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread483(int [] tdone, int [] ends){
        switch(S357){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 102, column: 13
          System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 6
          bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 105, column: 6
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

  public void thread482(int [] tdone, int [] ends){
        switch(S346){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S324){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 91, column: 12
              S324=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S324=1;
            S324=0;
            if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 90, column: 13
              System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 7
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S324=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread481(int [] tdone, int [] ends){
        switch(S314){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S292){
          case 0 : 
            if((bottleAtPos5.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 79, column: 12
              S292=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S292=1;
            S292=0;
            if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 78, column: 13
              System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 7
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              S292=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread480(int [] tdone, int [] ends){
        switch(S282){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S260){
          case 0 : 
            if((bottleAtPos4.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 67, column: 12
              S260=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S260=1;
            S260=0;
            if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 66, column: 13
              System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 7
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S260=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread479(int [] tdone, int [] ends){
        switch(S250){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S228){
          case 0 : 
            if((bottleAtPos3.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 12
              S228=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S228=1;
            S228=0;
            if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 13
              System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 7
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S228=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread478(int [] tdone, int [] ends){
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

  public void thread477(int [] tdone, int [] ends){
        switch(S359){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread478(tdone,ends);
        thread479(tdone,ends);
        thread480(tdone,ends);
        thread481(tdone,ends);
        thread482(tdone,ends);
        thread483(tdone,ends);
        int biggest484 = 0;
        if(ends[4]>=biggest484){
          biggest484=ends[4];
        }
        if(ends[5]>=biggest484){
          biggest484=ends[5];
        }
        if(ends[6]>=biggest484){
          biggest484=ends[6];
        }
        if(ends[7]>=biggest484){
          biggest484=ends[7];
        }
        if(ends[8]>=biggest484){
          biggest484=ends[8];
        }
        if(ends[9]>=biggest484){
          biggest484=ends[9];
        }
        if(biggest484 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest484 == 0){
          S359=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread476(int [] tdone, int [] ends){
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

  public void thread473(int [] tdone, int [] ends){
        S447=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 24
      bottleAtPos5RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 136, column: 38
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

  public void thread472(int [] tdone, int [] ends){
        S439=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 24
      bottleAtPos4RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 134, column: 38
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

  public void thread471(int [] tdone, int [] ends){
        S431=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 24
      bottleAtPos3RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 132, column: 38
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

  public void thread470(int [] tdone, int [] ends){
        S423=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 24
      bottleAtPos2RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 130, column: 38
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

  public void thread469(int [] tdone, int [] ends){
        S415=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 24
      bottleAtPos1RT.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 128, column: 38
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

  public void thread468(int [] tdone, int [] ends){
        S407=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 24
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 125, column: 40
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

  public void thread467(int [] tdone, int [] ends){
        S399=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 24
      bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 38
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

  public void thread466(int [] tdone, int [] ends){
        S391=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 24
      bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 38
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

  public void thread465(int [] tdone, int [] ends){
        S383=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 24
      bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 38
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

  public void thread464(int [] tdone, int [] ends){
        S375=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 24
      bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 38
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

  public void thread463(int [] tdone, int [] ends){
        S367=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 24
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 38
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

  public void thread462(int [] tdone, int [] ends){
        S449=1;
    thread463(tdone,ends);
    thread464(tdone,ends);
    thread465(tdone,ends);
    thread466(tdone,ends);
    thread467(tdone,ends);
    thread468(tdone,ends);
    thread469(tdone,ends);
    thread470(tdone,ends);
    thread471(tdone,ends);
    thread472(tdone,ends);
    thread473(tdone,ends);
    int biggest474 = 0;
    if(ends[11]>=biggest474){
      biggest474=ends[11];
    }
    if(ends[12]>=biggest474){
      biggest474=ends[12];
    }
    if(ends[13]>=biggest474){
      biggest474=ends[13];
    }
    if(ends[14]>=biggest474){
      biggest474=ends[14];
    }
    if(ends[15]>=biggest474){
      biggest474=ends[15];
    }
    if(ends[16]>=biggest474){
      biggest474=ends[16];
    }
    if(ends[17]>=biggest474){
      biggest474=ends[17];
    }
    if(ends[18]>=biggest474){
      biggest474=ends[18];
    }
    if(ends[19]>=biggest474){
      biggest474=ends[19];
    }
    if(ends[20]>=biggest474){
      biggest474=ends[20];
    }
    if(ends[21]>=biggest474){
      biggest474=ends[21];
    }
    if(biggest474 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread460(int [] tdone, int [] ends){
        S357=1;
    if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 102, column: 13
      System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 104, column: 6
      bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 105, column: 6
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

  public void thread459(int [] tdone, int [] ends){
        S346=1;
    S324=0;
    if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 90, column: 13
      System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 92, column: 7
      bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 93, column: 7
      currsigs.addElement(bottleAtPos5);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S324=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread458(int [] tdone, int [] ends){
        S314=1;
    S292=0;
    if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 78, column: 13
      System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 80, column: 7
      bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 81, column: 7
      currsigs.addElement(bottleAtPos4);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      S292=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread457(int [] tdone, int [] ends){
        S282=1;
    S260=0;
    if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 66, column: 13
      System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 68, column: 7
      bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 69, column: 7
      currsigs.addElement(bottleAtPos3);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S260=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread456(int [] tdone, int [] ends){
        S250=1;
    S228=0;
    if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 13
      System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 56, column: 7
      bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 57, column: 7
      currsigs.addElement(bottleAtPos2);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S228=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread455(int [] tdone, int [] ends){
        S218=1;
    S180=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread454(int [] tdone, int [] ends){
        S359=1;
    thread455(tdone,ends);
    thread456(tdone,ends);
    thread457(tdone,ends);
    thread458(tdone,ends);
    thread459(tdone,ends);
    thread460(tdone,ends);
    int biggest461 = 0;
    if(ends[4]>=biggest461){
      biggest461=ends[4];
    }
    if(ends[5]>=biggest461){
      biggest461=ends[5];
    }
    if(ends[6]>=biggest461){
      biggest461=ends[6];
    }
    if(ends[7]>=biggest461){
      biggest461=ends[7];
    }
    if(ends[8]>=biggest461){
      biggest461=ends[8];
    }
    if(ends[9]>=biggest461){
      biggest461=ends[9];
    }
    if(biggest461 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread453(int [] tdone, int [] ends){
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
      switch(S451){
        case 0 : 
          S451=0;
          break RUN;
        
        case 1 : 
          S451=2;
          S451=2;
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread453(tdone,ends);
          thread454(tdone,ends);
          thread462(tdone,ends);
          int biggest475 = 0;
          if(ends[2]>=biggest475){
            biggest475=ends[2];
          }
          if(ends[3]>=biggest475){
            biggest475=ends[3];
          }
          if(ends[10]>=biggest475){
            biggest475=ends[10];
          }
          if(biggest475 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 17, column: 2
          thread476(tdone,ends);
          thread477(tdone,ends);
          thread485(tdone,ends);
          int biggest498 = 0;
          if(ends[2]>=biggest498){
            biggest498=ends[2];
          }
          if(ends[3]>=biggest498){
            biggest498=ends[3];
          }
          if(ends[10]>=biggest498){
            biggest498=ends[10];
          }
          if(biggest498 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest498 == 0){
            S451=0;
            active[1]=0;
            ends[1]=0;
            S451=0;
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
