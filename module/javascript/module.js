// Expose the native API to javascript
forge.crashlytics = {
    causeCrash: function (success, error) {
        forge.internal.call('crashlytics.causeCrash', {}, success, error);
    }
};
