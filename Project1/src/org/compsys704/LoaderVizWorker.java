package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker {

	@Override
	public void setSignal(boolean status) {
		System.out.println(signame + " " + status);
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
			case "rotaryTableTriggerE":
				States.rotaryTableTriggerE = status;
				break;
			default:
				System.err.println("Wrong sig name : " + signame);
				System.exit(1);
		}
	}

	static final List<String> signames = Arrays.asList("bottleAtPos1E", "bottleAtPos2E", "bottleAtPos3E",
			"bottleAtPos4E", "bottleAtPos5E", "fillerE", "rotaryTableTriggerE");

	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
