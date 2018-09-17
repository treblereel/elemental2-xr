package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRWebGLLayerInit {
    //true
    boolean antialias;
    //true
    boolean depth;
    //false
    boolean stencil;
    //true
    boolean alpha;
    //false
    boolean multiview;
    // 1.0
    double framebufferScaleFactor;
}
