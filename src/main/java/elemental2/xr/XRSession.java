package elemental2.xr;

import elemental2.core.Float32Array;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Any interaction with XR hardware outside of enumeration is done via an XRSession object, which can only be retrieved by calling requestSession() on an XRDevice. Once a session has been successfully acquired it can be used to poll the device pose, query information about the user’s environment and, present imagery to the user.
 * <p>
 * The user agent, when possible, SHOULD NOT initialize device tracking or rendering capabilities until an XRSession has been acquired. This is to prevent unwanted side effects of engaging the XR systems when they’re not actively being used, such as increased battery usage or related utility applications from appearing when first navigating to a page that only wants to test for the presence of XR hardware in order to advertise XR features. Not all XR platforms offer ways to detect the hardware’s presence without initializing tracking, however, so this is only a strong recommendation.
 * <p>
 * When an XRSession is created, the user agent MUST initialize the session by running the following steps:
 * <p>
 * 1. Let session be the newly created XRSession object.
 * 2. Let device be the XRDevice object that requested session’s creation.
 * 3. Let options be the XRSessionCreationOptions passed to requestSession().
 * 4. Initialize session’s device to device.
 * 5. Initialize session’s immersive to options immersive value.
 * 6. Initialize session’s outputContext to options outputContext value.
 * 7. Initialize session’s depthNear to 0.1.
 * 8. Initialize session’s depthFar to 1000.0.
 * 9. Initialize session’s baseLayer to null.
 * 10. If no other features of the user agent have done so already, perform the necessary platform-specific steps to initialize the device’s tracking and rendering capabilities.
 * <p>
 * A number of diffrent circumstances may shut down the session, which is permanent and irreversable. Once a session has been shut down the only way to access the XRDevice's tracking or rendering capabilities again is to request a new session. Each XRSession has an ended boolean, initially set to false, that indicates if it has been shut down.
 * <p>
 * When an XRSession is shut down the following steps are run:
 * <p>
 * 1. Let session be the target XRSession object.
 * 2. Let device be session’s device.
 * 3. Set session’s ended value to true.
 * 4. If device’s active immersive session is equal to session, set device’s active immersive session to null.
 * 5. If device’s list of non-immersive sessions contains session, remove it from the list.
 * 6. If no other features of the user agent are actively using them, perform the necessary platform-specific steps to shut down the device’s tracking and rendering capabilities.
 * <p>
 * The end() method provides a way to manually shut down a session. When invoked, it MUST return a new Promise promise and run the following steps in parallel:
 * <p>
 * 1. Shut down the target XRSession object.
 * 2. Resolve promise.
 * <p>
 * When the requestFrameOfReference(type, options) method is invoked, the user agent MUST return a new Promise promise and run the following steps in parallel:
 * <p>
 * 1. Let session be the target XRSession object.
 * 2. Let frameOfRef be a new XRFrameOfReference.
 * 3. Initialize the frame of reference frameOfRef with session, type, and options.
 * 4. Resolve promise with frameOfRef.
 * <p>
 * When the getInputSources() method is invoked, the user agent MUST run the following steps:
 * <p>
 * 1. Return the current list of active input sources.
 * <p>
 * Each XRSession has a environment blending mode value, which is a enum which MUST be set to whichever of the following values best matches the behavior of imagery rendered by the session in relation to the user’s surrounding environment.
 * <p>
 * * A blend mode of opaque indicates that the user’s surrounding environment is not visible at all. Alpha values in the baseLayer will be ignored, with the compositor treating all alpha values as 1.0.
 * <p>
 * * A blend mode of additive indicates that the user’s surrounding environment is visible and the baseLayer will be shown additively against it. Alpha values in the baseLayer will be ignored, with the compositor treating all alpha values as 1.0. When this blend mode is in use black pixels will appear fully transparent, and there is no way to make a pixel appear fully opaque.
 * <p>
 * * A blend mode of alpha-blend indicates that the user’s surrounding environment is visible and the baseLayer will be blended with it according to the alpha values of each pixel. Pixels with an alpha value of 1.0 will be fully opaque and pixels with an alpha value of 0.0 will be fully transparent.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRSession implements EventTarget {

    // readonly
    public XRDevice device;
    // readonly
    public boolean immersive;
    // readonly
    public XRPresentationContext outputContext;
    // readonly
    public XREnvironmentBlendMode environmentBlendMode;

    public double depthNear;
    public double depthFar;
    public XRLayer baseLayer;

    public native Promise<XRFrameOfReference> requestFrameOfReference(String type);

    public native Promise<XRFrameOfReference> requestFrameOfReference(String type, XRFrameOfReferenceOptions options);

    public native XRInputSource[] getInputSources();

    /**
     * The requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser call a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
     *
     * @param callback instance of XRFrameRequestCallback
     * @return handler id
     */
    public native double requestAnimationFrame(XRFrameRequestCallback callback);

    /**
     * @param handle id
     */
    public native void cancelAnimationFrame(double handle);

    public native Promise<Void> end();

    // Events
    // The onblur attribute is an Event handler IDL attribute for the blur event type.
    public EventHandler onblur;
    // The onfocus attribute is an Event handler IDL attribute for the focus event type.
    public EventHandler onfocus;
    // The onresetpose attribute is an Event handler IDL attribute for the resetpose event type.
    public EventHandler onresetpose;
    // The onend attribute is an Event handler IDL attribute for the end event type.
    public EventHandler onend;
    // The onselectstart attribute is an Event handler IDL attribute for the selectstart event type.
    public EventHandler onselect;
    // The onselectend attribute is an Event handler IDL attribute for the selectend event type.
    public EventHandler onselectstart;
    // The onselect attribute is an Event handler IDL attribute for the select event type.
    public EventHandler onselectend;

    public native Float32Array getTransformTo(XRCoordinateSystem other);

    public native void addEventListener(String type, EventListener listener, AddEventListenerOptionsUnionType options);

    public native void addEventListener(String type, EventListener listener);

    public native boolean dispatchEvent(Event evt);

    public native void removeEventListener(String type, EventListener listener, RemoveEventListenerOptionsUnionType options);

    public native void removeEventListener(String type, EventListener listener);

}
