package base;

import configurations.Singleton;
import webWrappers.interfaces.IActions;
import webWrappers.interfaces.IVerifies;
import webWrappers.interfaces.IWaits;
import webWrappers.wrappers.Actions;
import webWrappers.wrappers.Verifies;
import webWrappers.wrappers.Waits;

public class PageBase {

	public IActions webActions;
	public IWaits webWaits;
	public IVerifies webVerifies;

	public PageBase() {
		webActions = Singleton.getInstance(Actions.class);
		webWaits = Singleton.getInstance(Waits.class);
		webVerifies = Singleton.getInstance(Verifies.class);
	}

}
