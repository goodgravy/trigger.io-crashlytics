module("crashlytics");

// In this test we call the example showAlert API method with an example string
asyncTest("Cause a crash in native code", 1, function() {
	forge.crashlytics.causeCrash(function () {
		ok(false, "Crash didn't happen");
		start();
	}, function () {
		ok(true, "API method crashed as expected");
		start();
	});
});