#import "Crashlytics.h"
#import "crashlytics_API.h"

@implementation crashlytics_API

+ (void)causeCrash:(ForgeTask*)task {
	[[Crashlytics sharedInstance] crash];
}

@end