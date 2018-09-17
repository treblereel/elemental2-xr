package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRFrame provides all the values needed to render a single frame of an XR scene to the XRDevice's display. Applications can only aquire an XRFrame by calling requestAnimationFrame() on an XRSession with an XRFrameRequestCallback. When the callback is called it will be passed an XRFrame.
 * <p>
 * The session attribute returns the XRSession that produced the XRFrame.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRFrame {

    public XRSession session;
    public XRView[] views;

    private XRFrame() {

    }

    public native XRDevicePose getDevicePose(XRCoordinateSystem coordinateSystem);

    public native XRInputPose getInputPose(XRInputSource inputSource, XRCoordinateSystem coordinateSystem);

}
