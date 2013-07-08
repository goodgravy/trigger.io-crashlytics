#import "Crashlytics.h"
#import "crashlytics_EventListener.h"

@implementation crashlytics_EventListener

+ (void)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
	[Crashlytics startWithAPIKey:@"YOUR_API_KEY"];
}

@end