# elemental2-xr
Elemental2 like WebXR Device API for GWT, based on draft from 20 August 2018.

Abstract
This library allows user to access virtual reality (VR) and augmented reality (AR) devices, including sensors and head-mounted displays, on the Web.

UNSTABLE API
The version of the WebXR Device API represented in this library is incomplete and may change at any time.

Source https://immersive-web.github.io/webxr/
Demo https://env-1339767.cloud.unispace.io/
Demo source code: https://github.com/treblereel/ar-with-webxr

![Alt Text](https://media.giphy.com/media/tHMgucnsrqUftbbWOC/giphy.gif)

Maven
Current Version 0.1-beta1
```
<dependency>
    <groupId>org.treblereel.gwt</groupId>
    <artifactId>elemental2-xr</artifactId>
    <version>0.1-beta1</version>
</dependency>
```

Setup
all you need to do is to add this
```
<inherits name="elemental2.xr.XR"/>
```

to your module configuration.


Chrome Canary
chrome://flags → webxr features must be turned on
