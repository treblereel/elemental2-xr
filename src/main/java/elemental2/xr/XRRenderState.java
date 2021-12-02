package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRRenderState {

    // readonly
    public XRWebGLLayer baseLayer;
    // readonly
    public double depthNear;
    // readonly
    public double depthFar;

}
