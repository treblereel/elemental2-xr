package elemental2.xr;

import elemental2.promise.Promise;
import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRWebGLRenderingContext extends WebGLRenderingContext {

    private XRWebGLRenderingContext() {

    }

    public native Promise<Void> setCompatibleXRDevice(XRDevice device);

    @JsOverlay
    public static XRWebGLRenderingContext of(WebGLRenderingContext o) {
        return Js.cast(o);
    }
}
