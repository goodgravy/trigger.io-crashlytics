package io.trigger.forge.android.modules.crashlytics;

import io.trigger.forge.android.core.ForgeTask;

import com.crashlytics.android.Crashlytics;

public class API {
	public static void causeCrash(final ForgeTask task) {
		Crashlytics.logException(new Exception("This is a caught Exception"));
		
		// Although this will cause an UNEXPECTED_FAILURE, it's caught at the
		// bridge, so won't cause a report to be uploaded
		throw new RuntimeException("This is a crash");
	}
}
