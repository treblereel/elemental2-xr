package elemental2.xr;

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRInputPose {
    public boolean emulatedPosition;
    public XRRay targetRay;
    public Float32Array gripMatrix;
}
