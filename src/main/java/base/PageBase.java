package base;

import configurations.Singleton;
import webWrappers.interfaces.IActions;
import webWrappers.interfaces.IVerifies;
import webWrappers.interfaces.IWaits;
import webWrappers.wrappers.Actions;
import webWrappers.wrappers.Verifies;
import webWrappers.wrappers.Waits;

public class PageBase {

	public IActions actions;
	public IWaits waits;
	public IVerifies verifies;

	public PageBase() {
		actions = Singleton.getInstance(Actions.class);
		waits = Singleton.getInstance(Waits.class);
		verifies = Singleton.getInstance(Verifies.class);
	}

}
