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
public class XRSystem implements EventTarget {

    /**
     * Called with a standard Event whenever device availability changes. To get a reference to the device, call requestDevice().
     */
    public Event ondevicechange;

    private XRSystem() {

    }

    public native void addEventListener(
            String type, EventListener listener, AddEventListenerOptionsUnionType options);

    public native void addEventListener(String type, EventListener listener);

    public native boolean dispatchEvent(Event evt);

    public native void removeEventListener(
            String type, EventListener listener, RemoveEventListenerOptionsUnionType options);

    public native void removeEventListener(String type, EventListener listener);

    /**
     * When the supportsSession(options) method is invoked, it MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with null.
     * 3. Else resolve promise with null.
     *
     * @return Promise
     */
    public native Promise<Boolean> isSessionSupported();


    /**
     * When the supportsSession(options) method is invoked, it MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with null.
     * 3. Else resolve promise with null.
     *
     * @param mode A String specifying the WebXR session mode for which support is to be checked
     * @return Promise
     */
    public native Promise<Boolean> isSessionSupported(String mode);

    /**
     * When the requestSession(options) method is invoked, the user agent MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with a NotSupportedError and abort these steps.
     * 3. Let immersive be the immersive attribute of the options argument.
     * 4. If immersive is true and device’s active immersive session is not null, reject promise with an InvalidStateError and abort these steps.
     * 5. If immersive is true and the algorithm is not triggered by user activation, reject promise with a SecurityError and abort these steps.
     * 6. Let session be a new XRSession.
     * 7. Initialize the session session with the session description given by options.
     * 8. If immersive is true set the device’s active immersive session to session.
     * 9. Else append session to device’s list of non-immersive sessions.
     * 10. Resolve promise with session.
     *
     * @return Promise with XRSession
     */
    public native Promise<XRSession> requestSession();

    /**
     * When the requestSession(options) method is invoked, the user agent MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with a NotSupportedError and abort these steps.
     * 3. Let immersive be the immersive attribute of the options argument.
     * 4. If immersive is true and device’s active immersive session is not null, reject promise with an InvalidStateError and abort these steps.
     * 5. If immersive is true and the algorithm is not triggered by user activation, reject promise with a SecurityError and abort these steps.
     * 6. Let session be a new XRSession.
     * 7. Initialize the session session with the session description given by options.
     * 8. If immersive is true set the device’s active immersive session to session.
     * 9. Else append session to device’s list of non-immersive sessions.
     * 10. Resolve promise with session.
     *
     * @param mode A String defining the XR session mode
     * @return Promise with XRSession
     */
    public native Promise<XRSession> requestSession(String mode);

    /**
     * When the requestSession(options) method is invoked, the user agent MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with a NotSupportedError and abort these steps.
     * 3. Let immersive be the immersive attribute of the options argument.
     * 4. If immersive is true and device’s active immersive session is not null, reject promise with an InvalidStateError and abort these steps.
     * 5. If immersive is true and the algorithm is not triggered by user activation, reject promise with a SecurityError and abort these steps.
     * 6. Let session be a new XRSession.
     * 7. Initialize the session session with the session description given by options.
     * 8. If immersive is true set the device’s active immersive session to session.
     * 9. Else append session to device’s list of non-immersive sessions.
     * 10. Resolve promise with session.
     *
     * @param mode A String specifying the WebXR session mode for which support is to be checked
     * @param options The XRSessionCreationOptions dictionary provides a session description
     * @return Promise with XRSession
     */
    public native Promise<XRSession> requestSession(String mode, XRSessionCreationOptions options);
}
