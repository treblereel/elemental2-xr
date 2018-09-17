package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRFrameOfReference describes an XRCoordinateSystem that is generally expected to remain static for the duration of the XRSession, with the most common exception being mid-session reconfiguration by the user. An XRFrameOfReference is created by calling requestFrameOfReference(). Every XRFrameOfReference describes a coordinate system where the Y axis MUST be aligned with gravity, with positive Y being "Up". Negative Z is considered "Forward", and positive X is considered "Right".
 * <p>
 * Each XRFrameOfReference has as session, which is the XRSession that created it, and a frame of reference type, which is one of the XRFrameOfReferenceType values, set to the type passed requestFrameOfReference(). The behavior of the XRFrameOfReference differs depending on its frame of reference type as follows:
 * <p>
 * eye-level
 * <p>
 * An XRFrameOfReference with a frame of reference type of "eye-level" describes a coordinate system with an origin that corresponds to the first device pose acquired by the XRSession after the "head-model" frame of reference is created, with the device yaw (rotation around the Y axis) at that point defining the coordinate system’s forward direction.
 * <p>
 * head-model
 * <p>
 * An XRFrameOfReference with a frame of reference type of "head-model" describes a coordinate system identical to an eye-level frame of reference, but where the device is always located at the origin. Any translation is provided by a software estimate of the devices position based solely on the device orientation and the assumption that the device is being worn as a headset. The translation estimate SHOULD be based off of modeling how the human head moves on average when an individual is only moving their neck.
 * <p>
 * If the device is capable of reporting accurate translation, it MUST be discarded when using this frame of reference type in favor of an orientation-based estimate. If the translation reported by the device is already based on head modeling the device-provided translation MAY be preserved.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRFrameOfReference extends XRCoordinateSystem {
    public XRStageBounds bounds;
    /**
     * The emulatedHeight attribute is initially set to 0.0. This value indicates the offset in meters along the Y axis that will be applied to poses acquired with this frame of reference.
     */
    public double emulatedHeight;
    /**
     * The onboundschange attribute is an Event handler IDL attribute for the boundschange event type.
     */
    public EventHandler onboundschange;
}
