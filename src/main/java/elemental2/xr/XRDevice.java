package elemental2.xr;

import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRDevice represents a physical unit of XR hardware that can present imagery to the user somehow. On desktop devices this may take the form of a headset peripheral; on mobile devices it may represent the device itself in conjunction with a viewer harness. It may also represent devices without the ability to present content in stereo but with advanced (6DoF) tracking capabilities.
 * <p>
 * Each XRDevice has a supports immersive value, which is a boolean which MUST be set to true if the device can support immersive sessions and false if it cannot.
 * <p>
 * Each XRDevice has an active immersive session, which MUST be initially null, and a list of non-immersive sessions, which MUST be initially empty.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRDevice {

    private XRDevice() {

    }

    /**
     * When the supportsSession(options) method is invoked, it MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with null.
     * 3. Else resolve promise with null.
     *
     * @return Promise
     */
    public native Promise<Void> supportsSession();


    /**
     * When the supportsSession(options) method is invoked, it MUST return a new Promise promise and run the following steps in parallel:
     * <p>
     * 1. Let device be the target XRDevice object.
     * 2. If the options are not supported by the device device, reject promise with null.
     * 3. Else resolve promise with null.
     *
     * @param options The XRSessionCreationOptions dictionary provides a session description
     * @return Promise
     */
    public native Promise<Void> supportsSession(XRSessionCreationOptions options);

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
     * @param options The XRSessionCreationOptions dictionary provides a session description
     * @return Promise with XRSession
     */
    public native Promise<XRSession> requestSession(XRSessionCreationOptions options);
}
