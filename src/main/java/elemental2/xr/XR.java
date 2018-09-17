package elemental2.xr;

import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The XR interface of the of the WebXR API provides the means to query for attached AR/VR devices
 * and receive events when device availability changes. A requested device is accessed through a
 * returned XRDevice object.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XR implements EventTarget {

    /**
     * Called with a standard Event whenever device availability changes. To get a reference to the device, call requestDevice().
     */
    public Event ondevicechange;

    private XR() {

    }

    /**
     * Returns a "Promise" that resolves with an XRDevice object that provides information about an AR/VR device and methods for obtaining an XRSession object.
     *
     * @return a Promise
     */
    public native Promise<XRDevice> requestDevice();

    public native void addEventListener(
            String type, EventListener listener, EventTarget.AddEventListenerOptionsUnionType options);

    public native void addEventListener(String type, EventListener listener);

    public native boolean dispatchEvent(Event evt);

    public native void removeEventListener(
            String type, EventListener listener, EventTarget.RemoveEventListenerOptionsUnionType options);

    public native void removeEventListener(String type, EventListener listener);
}
