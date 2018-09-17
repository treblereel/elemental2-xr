package elemental2.xr;

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRDevicePose describes the position and orientation of an XRDevice relative to the XRCoordinateSystem it was queried with. It also describes the view and projection matrices that should be used by the application to render a frame of an XR scene.
 *
 * @author Dmitrii Tikhomirov
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRDevicePose {

    /**
     * The poseModelMatrix is a matrix describing the transform from the origin of the XRCoordinateSystem to the XRDevice.
     */
    public Float32Array poseModelMatrix;

    /**
     * The getViewMatrix(view) method returns a matrix describing the view transform to be used when rendering the passed XRView. The matrices represent the inverse of the model matrix of the associated viewpoint.
     *
     * @param view as XRView
     * @return Float32Array
     */
    public native Float32Array getViewMatrix(XRView view);
}
