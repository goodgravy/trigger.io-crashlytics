# Crashlytics native plugin for Trigger.io

Crashlytics collects and categorises problems in your iOS and Android app running in the wild.

Trigger.io lets web developers quickly and easily create high quality mobile apps.

This plugin lets you identify problematic modules or plugins in your apps, and give better bug reports, internally or externally.

## Usage

* sign up for [Crashlytics](https://crashlytics.com/)
* in your Trigger.io Toolkit, create a new app (or select an existing one)
* get your Crashlytics API key: easiest way seems to be to install the Xcode helper and grab the key from its integration wizard
* in the app config, search for and activate the module named "crashlytics"
* in the module configuration, supply your Crashlytics API key

## Limitations
To display snippets around lines where exceptions occured, Crashlytics appears to create and upload dSYM files from an Xcode Build Phase. That's not currently supported from a Trigger.io native plugin, but is on our list to support in the future. At the moment, your iOS reports aren't as useful as they might be.

On Android, we automatically catch exceptions raised in plugin / module code. You can still cause Exceptions to be logged, using something like `Crashlytics.logException(new Exception("this, for example"));`.
