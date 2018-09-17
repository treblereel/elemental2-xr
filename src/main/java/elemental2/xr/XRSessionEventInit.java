package elemental2.xr;

import elemental2.dom.EventInit;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRSessionEventInit implements EventInit {

    /**
     * session The XRSession associated with this event.
     */
    public XRSession session;

    public native boolean isBubbles();

    public native boolean isCancelable();

    public native boolean isComposed();

    public native void setBubbles(boolean bubbles);

    public native void setCancelable(boolean cancelable);

    public native void setComposed(boolean composed);
}
