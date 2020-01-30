package io.github.ihexon;

import io.github.ihexon.other.HelpClass;
import io.github.ihexon.utils.control.Control;

import java.io.IOException;

public class Bootstrap extends AbstractBootstrap {

	public Bootstrap(CommandLine cmdLine) {
		super(cmdLine);
	}

	protected void initControl() {
		Control.initSingleton(getControlOverrides());
	}

	@Override
	public void start() throws IOException {
		super.start();
		initControl();
		if (Control.getSingleton().showHelp){
			new HelpClass();
			System.exit(1);
		}else {
			PathWatcher pathWatcher = new PathWatcher();
			pathWatcher.processEvents();
		}
	}
}
