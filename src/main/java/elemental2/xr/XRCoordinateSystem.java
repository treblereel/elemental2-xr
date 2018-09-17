package elemental2.xr;

import elemental2.core.Float32Array;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRCoordinateSystem implements EventTarget {

    public native Float32Array getTransformTo(XRCoordinateSystem other);

    public native void addEventListener(String type, EventListener listener, AddEventListenerOptionsUnionType options);

    public native void addEventListener(String type, EventListener listener);

    public native boolean dispatchEvent(Event evt);

    public native void removeEventListener(String type, EventListener listener, RemoveEventListenerOptionsUnionType options);

    public native void removeEventListener(String type, EventListener listener);
}
