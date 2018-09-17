package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Each XRInputSource SHOULD define a primary action. The primary action is a platform-specific action that, when engaged, produces selectstart, selectend, and select events. Examples of possible primary actions are pressing a trigger, touchpad, or button, speaking a command, or making a hand gesture. If the platform guidelines define a recommended primary input then it should be used as the primary action, otherwise the user agent is free to select one.
 * <p>
 * The handedness attribute describes which hand the input source is associated with, if any. Input sources with no natural handedness (such as headset-mounted controls or standard gamepads) or for which the handedness is not currently known MUST set this attribute to the empty string.
 * <p>
 * The targetRayMode attribute describes the method used to produce the target ray, and indicates how the application should present the target ray to the user if desired.
 * <p>
 * gaze indicates the target ray will originate at the user’s head and follow the direction they are looking (this is commonly referred to as a "gaze input" device).
 * <p>
 * tracked-pointer indicates that the target ray originates from either a handheld device or other hand-tracking mechanism and represents that the user is using their hands or the held device for pointing.
 * <p>
 * screen indicates that the input source was an interaction with the canvas element associated with a non-immersive session’s output context, such as a mouse click or touch event.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRInputSource {
    public XRHandedness handedness;
    public XRTargetRayMode targetRayMode;
}
