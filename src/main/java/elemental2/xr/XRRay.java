package elemental2.xr;

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/11/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRRay {
    public Object origin;
    public Object direction;
    public Float32Array transformMatrix;
}
