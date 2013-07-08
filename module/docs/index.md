
Crashlytics collects and categorises problems in your iOS and Android app running in the wild.

This plugin lets you identify problematic modules or plugins in your apps, and give better bug reports, internally or externally.

> ::Note:: To use this module, you will need a Crashlytics account: sign up for free at [http://try.crashlytics.com/](http://try.crashlytics.com/).

## Config options

API key
:  You can find out your API key by starting the iOS or Android Crashlytics integration instructions. It should be a 40-character hexadecimal string


## API

!method: forge.crashlytics.causeCrash(success, error)
!param: success `function()` shouldn't be called - the app will either crash out (iOS) or invoke the error callback (Android)
!description: Cause a crash to check that the module is working properly. On Android, you should see "This is a caught Exception" in your Crashlytics dashboard; for iOS you should see a hard crash.
!platforms: iOS, Android
!param: error `function(content)` called with details of the deliberately caused error - on iOS the app will crash before this is invoked