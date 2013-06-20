package io.trigger.forge.android.modules.crashlytics;

import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeEventListener;
import io.trigger.forge.android.core.ForgeLog;
import android.os.Bundle;
import com.crashlytics.android.Crashlytics;

public class EventListener extends ForgeEventListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		ForgeLog.i("starting crashlytics");
		Crashlytics.start(ForgeApp.getActivity());
	}
}


