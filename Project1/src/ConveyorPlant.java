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
  private Signal motorOn_1;
  private int S510 = 1;
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
  private int S508 = 1;
  private int S408 = 1;
  private int S367 = 1;
  private int S375 = 1;
  private int S383 = 1;
  private int S391 = 1;
  private int S399 = 1;
  private int S407 = 1;
  
  private int[] ends = new int[17];
  private int[] tdone = new int[17];
  
  public void thread552(int [] tdone, int [] ends){
        S407=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 25
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 41
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

  public void thread551(int [] tdone, int [] ends){
        S399=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 25
      bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 39
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

  public void thread550(int [] tdone, int [] ends){
        S391=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 25
      bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 39
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

  public void thread549(int [] tdone, int [] ends){
        S383=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 25
      bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 39
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

  public void thread548(int [] tdone, int [] ends){
        S375=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 25
      bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 39
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

  public void thread547(int [] tdone, int [] ends){
        S367=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 25
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 39
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

  public void thread545(int [] tdone, int [] ends){
        switch(S407){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 25
          bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 41
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

  public void thread544(int [] tdone, int [] ends){
        switch(S399){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 25
          bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 39
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

  public void thread543(int [] tdone, int [] ends){
        switch(S391){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 25
          bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 39
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

  public void thread542(int [] tdone, int [] ends){
        switch(S383){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 25
          bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 39
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

  public void thread541(int [] tdone, int [] ends){
        switch(S375){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 25
          bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 39
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

  public void thread540(int [] tdone, int [] ends){
        switch(S367){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 25
          bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 39
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

  public void thread539(int [] tdone, int [] ends){
        switch(S508){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S408){
          case 0 : 
            thread540(tdone,ends);
            thread541(tdone,ends);
            thread542(tdone,ends);
            thread543(tdone,ends);
            thread544(tdone,ends);
            thread545(tdone,ends);
            int biggest546 = 0;
            if(ends[11]>=biggest546){
              biggest546=ends[11];
            }
            if(ends[12]>=biggest546){
              biggest546=ends[12];
            }
            if(ends[13]>=biggest546){
              biggest546=ends[13];
            }
            if(ends[14]>=biggest546){
              biggest546=ends[14];
            }
            if(ends[15]>=biggest546){
              biggest546=ends[15];
            }
            if(ends[16]>=biggest546){
              biggest546=ends[16];
            }
            if(biggest546 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest546 == 0){
              S408=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S408=1;
            S408=0;
            thread547(tdone,ends);
            thread548(tdone,ends);
            thread549(tdone,ends);
            thread550(tdone,ends);
            thread551(tdone,ends);
            thread552(tdone,ends);
            int biggest553 = 0;
            if(ends[11]>=biggest553){
              biggest553=ends[11];
            }
            if(ends[12]>=biggest553){
              biggest553=ends[12];
            }
            if(ends[13]>=biggest553){
              biggest553=ends[13];
            }
            if(ends[14]>=biggest553){
              biggest553=ends[14];
            }
            if(ends[15]>=biggest553){
              biggest553=ends[15];
            }
            if(ends[16]>=biggest553){
              biggest553=ends[16];
            }
            if(biggest553 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread537(int [] tdone, int [] ends){
        switch(S357){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 100, column: 13
          System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 102, column: 6
          bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 103, column: 6
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

  public void thread536(int [] tdone, int [] ends){
        switch(S346){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S324){
          case 0 : 
            if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 89, column: 12
              S324=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 91, column: 7
              currsigs.addElement(bottleAtPos5);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S324=1;
            S324=0;
            if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 88, column: 13
              System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 90, column: 7
              bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 91, column: 7
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

  public void thread535(int [] tdone, int [] ends){
        switch(S314){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S292){
          case 0 : 
            if((bottleAtPos5.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 77, column: 12
              S292=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 79, column: 7
              currsigs.addElement(bottleAtPos4);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S292=1;
            S292=0;
            if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 76, column: 13
              System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 78, column: 7
              bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 79, column: 7
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

  public void thread534(int [] tdone, int [] ends){
        switch(S282){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S260){
          case 0 : 
            if((bottleAtPos4.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 65, column: 12
              S260=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 67, column: 7
              currsigs.addElement(bottleAtPos3);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S260=1;
            S260=0;
            if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 64, column: 13
              System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 66, column: 7
              bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 67, column: 7
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

  public void thread533(int [] tdone, int [] ends){
        switch(S250){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S228){
          case 0 : 
            if((bottleAtPos3.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 53, column: 12
              S228=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 7
              currsigs.addElement(bottleAtPos2);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S228=1;
            S228=0;
            if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 52, column: 13
              System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 7
              bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 7
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

  public void thread532(int [] tdone, int [] ends){
        switch(S218){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S180){
          case 0 : 
            if(bottleAtPos0.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 41, column: 11
              S180=1;
              System.out.println("Bottle at pos 1");//sysj\Conveyor\ConveyorPlant.sysj line: 43, column: 6
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 44, column: 6
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
            if(rotaryTableTrigger.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 42, column: 11
              S180=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              bottleAtPos1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 44, column: 6
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

  public void thread531(int [] tdone, int [] ends){
        switch(S359){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread532(tdone,ends);
        thread533(tdone,ends);
        thread534(tdone,ends);
        thread535(tdone,ends);
        thread536(tdone,ends);
        thread537(tdone,ends);
        int biggest538 = 0;
        if(ends[4]>=biggest538){
          biggest538=ends[4];
        }
        if(ends[5]>=biggest538){
          biggest538=ends[5];
        }
        if(ends[6]>=biggest538){
          biggest538=ends[6];
        }
        if(ends[7]>=biggest538){
          biggest538=ends[7];
        }
        if(ends[8]>=biggest538){
          biggest538=ends[8];
        }
        if(ends[9]>=biggest538){
          biggest538=ends[9];
        }
        if(biggest538 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest538 == 0){
          S359=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread530(int [] tdone, int [] ends){
        switch(S162){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S106){
          case 0 : 
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
              S106=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
                S106=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
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
            if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
              S106=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
              currsigs.addElement(motorOn_1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S106=2;
            S106=0;
            if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
              S106=1;
              if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
                S106=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
                motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
                currsigs.addElement(motorOn_1);
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

  public void thread527(int [] tdone, int [] ends){
        S407=1;
    if(bottleLeftPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 25
      bottleLeftPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 123, column: 41
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

  public void thread526(int [] tdone, int [] ends){
        S399=1;
    if(bottleAtPos5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 25
      bottleAtPos5E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 121, column: 39
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

  public void thread525(int [] tdone, int [] ends){
        S391=1;
    if(bottleAtPos4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 25
      bottleAtPos4E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 119, column: 39
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

  public void thread524(int [] tdone, int [] ends){
        S383=1;
    if(bottleAtPos3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 25
      bottleAtPos3E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 117, column: 39
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

  public void thread523(int [] tdone, int [] ends){
        S375=1;
    if(bottleAtPos2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 25
      bottleAtPos2E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 115, column: 39
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

  public void thread522(int [] tdone, int [] ends){
        S367=1;
    if(bottleAtPos1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 25
      bottleAtPos1E.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 113, column: 39
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

  public void thread521(int [] tdone, int [] ends){
        S508=1;
    S408=0;
    thread522(tdone,ends);
    thread523(tdone,ends);
    thread524(tdone,ends);
    thread525(tdone,ends);
    thread526(tdone,ends);
    thread527(tdone,ends);
    int biggest528 = 0;
    if(ends[11]>=biggest528){
      biggest528=ends[11];
    }
    if(ends[12]>=biggest528){
      biggest528=ends[12];
    }
    if(ends[13]>=biggest528){
      biggest528=ends[13];
    }
    if(ends[14]>=biggest528){
      biggest528=ends[14];
    }
    if(ends[15]>=biggest528){
      biggest528=ends[15];
    }
    if(ends[16]>=biggest528){
      biggest528=ends[16];
    }
    if(biggest528 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread519(int [] tdone, int [] ends){
        S357=1;
    if(bottleAtPos5.getprestatus() && motorOn_1.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 100, column: 13
      System.out.println("Bottle left pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 102, column: 6
      bottleLeftPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 103, column: 6
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

  public void thread518(int [] tdone, int [] ends){
        S346=1;
    S324=0;
    if(RTPutBottleAt5.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 88, column: 13
      System.out.println("Bottle at pos 5");//sysj\Conveyor\ConveyorPlant.sysj line: 90, column: 7
      bottleAtPos5.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 91, column: 7
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

  public void thread517(int [] tdone, int [] ends){
        S314=1;
    S292=0;
    if(RTPutBottleAt4.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 76, column: 13
      System.out.println("Bottle at pos 4");//sysj\Conveyor\ConveyorPlant.sysj line: 78, column: 7
      bottleAtPos4.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 79, column: 7
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

  public void thread516(int [] tdone, int [] ends){
        S282=1;
    S260=0;
    if(RTPutBottleAt3.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 64, column: 13
      System.out.println("Bottle at pos 3");//sysj\Conveyor\ConveyorPlant.sysj line: 66, column: 7
      bottleAtPos3.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 67, column: 7
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

  public void thread515(int [] tdone, int [] ends){
        S250=1;
    S228=0;
    if(RTPutBottleAt2.getprestatus()){//sysj\Conveyor\ConveyorPlant.sysj line: 52, column: 13
      System.out.println("Bottle at pos 2");//sysj\Conveyor\ConveyorPlant.sysj line: 54, column: 7
      bottleAtPos2.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 55, column: 7
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

  public void thread514(int [] tdone, int [] ends){
        S218=1;
    S180=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread513(int [] tdone, int [] ends){
        S359=1;
    thread514(tdone,ends);
    thread515(tdone,ends);
    thread516(tdone,ends);
    thread517(tdone,ends);
    thread518(tdone,ends);
    thread519(tdone,ends);
    int biggest520 = 0;
    if(ends[4]>=biggest520){
      biggest520=ends[4];
    }
    if(ends[5]>=biggest520){
      biggest520=ends[5];
    }
    if(ends[6]>=biggest520){
      biggest520=ends[6];
    }
    if(ends[7]>=biggest520){
      biggest520=ends[7];
    }
    if(ends[8]>=biggest520){
      biggest520=ends[8];
    }
    if(ends[9]>=biggest520){
      biggest520=ends[9];
    }
    if(biggest520 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread512(int [] tdone, int [] ends){
        S162=1;
    S106=0;
    if((motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 19, column: 20
      S106=1;
      if((!motConveyorOnOff.getprestatus())){//sysj\Conveyor\ConveyorPlant.sysj line: 23, column: 20
        S106=2;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        System.out.println("ConveyorPlant: Conveyor On");//sysj\Conveyor\ConveyorPlant.sysj line: 24, column: 5
        motorOn_1.setPresent();//sysj\Conveyor\ConveyorPlant.sysj line: 25, column: 5
        currsigs.addElement(motorOn_1);
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
      switch(S510){
        case 0 : 
          S510=0;
          break RUN;
        
        case 1 : 
          S510=2;
          S510=2;
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 16, column: 2
          thread512(tdone,ends);
          thread513(tdone,ends);
          thread521(tdone,ends);
          int biggest529 = 0;
          if(ends[2]>=biggest529){
            biggest529=ends[2];
          }
          if(ends[3]>=biggest529){
            biggest529=ends[3];
          }
          if(ends[10]>=biggest529){
            biggest529=ends[10];
          }
          if(biggest529 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          motorOn_1.setClear();//sysj\Conveyor\ConveyorPlant.sysj line: 16, column: 2
          thread530(tdone,ends);
          thread531(tdone,ends);
          thread539(tdone,ends);
          int biggest554 = 0;
          if(ends[2]>=biggest554){
            biggest554=ends[2];
          }
          if(ends[3]>=biggest554){
            biggest554=ends[3];
          }
          if(ends[10]>=biggest554){
            biggest554=ends[10];
          }
          if(biggest554 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest554 == 0){
            S510=0;
            active[1]=0;
            ends[1]=0;
            S510=0;
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
