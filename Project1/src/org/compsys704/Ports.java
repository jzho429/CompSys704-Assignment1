package org.compsys704;

public class Ports {
	public static final String REQUEST_SIGNAL = "ControllerCD.request";
	public static final String REFILL_SIGNAL = "PlantCD.refill";
	public static final String ENABLE_SIGNAL = "PlantCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;

	/* 30000 Series for New Ports
	 * 3***1 = Controller
	 * 3***2 = Plant
	 * 
	 * public static final int PORT_CONVEYOR_CONTROLLER = 30000;
	 * public static final int PORT_CONVEYOR_PLANT = 30001
	 * 
	 * public static final int PORT_ROTARYTABLE_CONTROLLER = 31000;
	 * public static final int PORT_ROTARYTABLE_PLANT = 31001;
	 * 
	 * public static final int PORT_FILLER_CONTROLLER = 32000;
	 * public static final int PORT_FILLER_CONTROLLER = 32001;
	 * 
	 * public static final int PORT_CAPPER_CONTROLLER = 33000;
	 * public static final int PORT_CAPPER_PLANT = 33001;
	 * 
	 */
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   = "ControllerCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           = "ControllerCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      = "ControllerCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        = "ControllerCD.armDestM";
	public static final String SIGNAL_Mode            = "ControllerCD.mode";
}
