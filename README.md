# Crashlytics native plugin for Trigger.io

Crashlytics collects and categorises problems in your iOS and Android app running in the wild.

Trigger.io lets web developers quickly and easily create high quality mobile apps.

This plugin lets you identify problematic modules or plugins in your apps, and give better bug reports, internally or externally.

## Usage

* sign up for [Crashlytics](https://crashlytics.com/)
* create a new plugin in the [Trigger.io Toolkit](https://trigger.io/forge/toolkit/) called `crashlytics`
* create a new local version of that plugin
* clone this repo
* copy this cloned repo's files over the local version of your plugin, overwriting where applicable
* get your Crashlytics API key: easiest way seems to be to install the Xcode helper and grab the key from its integration wizard
* replace `YOUR_API_KEY` with this key in:
  * `inspector/ios-inspector/ForgeModule/crashlytics_EventListener.m`
  * `plugin/android/build_steps.json`
* run the Inspector projects: there is an API called `crashlytics.causeCrash` which should cause events to pop up in your Crashlytics dashboard
* **note:** errors may not appear immediately - try restarting the app and waiting a minute if you don't see events
* (the Xcode debugger should not be attached when testing this on iOS - the app must be allowed to crash normally)

## Limitations
To display snippets around lines where exceptions occured, Crashlytics appears to create and upload dSYM files from an Xcode Build Phase. That's not currently supported from a Trigger.io native plugin, but is on our list to support in the future. At the moment, your iOS reports aren't as useful as they might be.

On Android, we automatically catch exceptions raised in plugin / module code. You can still cause Exceptions to be logged, using something like `Crashlytics.logException(new Exception("this, for example"));`.
