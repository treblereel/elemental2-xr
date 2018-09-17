package elemental2.xr;

import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsFunction
@FunctionalInterface
public interface XRFrameRequestCallback {
    void OnCallback(double timestamp, XRFrame xrFrame);
}
