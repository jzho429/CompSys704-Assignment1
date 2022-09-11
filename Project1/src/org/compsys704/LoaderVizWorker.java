package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker {

	@Override
	public void setSignal(boolean status) {
		// System.out.println(signame + " " + status);
		switch (signame) {
			case "bottleAtPos1E":
				States.bottleAtPos1E = status;
				break;
			case "bottleAtPos2E":
				States.bottleAtPos2E = status;
				break;
			case "bottleAtPos3E":
				States.bottleAtPos3E = status;
				break;
			case "bottleAtPos4E":
				States.bottleAtPos4E = status;
				break;
			case "bottleAtPos5E":
				States.bottleAtPos5E = status;
				break;
			case "fillerE":
				States.fillerE = status;
				break;
			case "filler1E":
				States.filler1E = status;
				States.filler2E = false;
				States.filler3E = false;
				States.filler4E = false;
				break;
			case "filler2E":
				States.filler1E = false;
				States.filler2E = status;
				States.filler3E = false;
				States.filler4E = false;
				break;
			case "filler3E":
				States.filler1E = false;
				States.filler2E = false;
				States.filler3E = status;
				States.filler4E = false;
				break;
			case "filler4E":
				States.filler1E = false;
				States.filler2E = false;
				States.filler3E = false;
				States.filler4E = status;
				break;
			case "rotaryTableTriggerE":
				States.rotaryTableTriggerE = status;
				break;
			case "conveyorOnE":
				States.conveyorOnE = status;
				break;
			default:
				System.err.println("Wrong sig name : " + signame);
				System.exit(1);
		}
	}

	static final List<String> signames = Arrays.asList("bottleAtPos1E", "bottleAtPos2E", "bottleAtPos3E",
			"bottleAtPos4E", "bottleAtPos5E", "fillerE", "filler1E", "filler2E", "filler3E", "filler4E",
			"rotaryTableTriggerE", "conveyorOnE");

	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
