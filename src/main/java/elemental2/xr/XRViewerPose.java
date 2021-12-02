package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRViewerPose describes the position and orientation of an XRDevice relative to the XRCoordinateSystem it was queried with. It also describes the view and projection matrices that should be used by the application to render a frame of an XR scene.
 *
 * @author Dmitrii Tikhomirov
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRViewerPose extends XRPose {

    public XRView[] views;

}
