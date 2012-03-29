Mobile GWT app 
==============

The goal is to evaluate GWT with jquerymobile for writing mobile applications that can be deployed as a native application.

# Modules
---------
## Mobile-jqm

This module contains the jquerymobile verison of the app styled with themeroller. The HTML is than ported on the GWT module. 

See it here http://mobilesampleapp.appspot.com/.

## Mobile-gwt

GWT/PhoneGap module. Run with:

> mvn gwt:run

Compile with:

> mvn install

Result on target/Mobile-gwt-1.0-SNAPSHOT-clientcode.zip

Using GWT 2.4, PhoneGap 1.4.1 and gwt-phonegap (http://code.google.com/p/gwt-phonegap/ 1.4.0.1). PhoneGap and gwt-phonegap must be aligned. 

	NOTE: it contains the iOS version of phonegap-xyz.js!

I'm also using http://code.google.com/p/gwt-jquery/ which is not available on any maven repository. I've installed it on my local repo as:

		<dependency>
			<groupId>com.xedge</groupId>
			<artifactId>gwt-jquery</artifactId>
			<version>x</version>
		</dependency>

## Mobile-iOS

Unzip Mobile-gwt/target/Mobile-gwt-1.0-SNAPSHOT-clientcode.zip into App/App/www

    NOTE: use the iOS version of phonegap-xyz.js.
## Mobile-Android

Unzip Mobile-gwt/target/Mobile-gwt-1.0-SNAPSHOT-clientcode.zip into assets/www

    NOTE: use the Android version of phonegap-xyz.js.

    NOTE: Still an old sample, not even updated to phonegap 1.4.0.1