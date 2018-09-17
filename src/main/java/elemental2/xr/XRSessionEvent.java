package elemental2.xr;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRSessionEvent extends Event {

    /**
     * session The XRSession associated with this event.
     */
    public XRSession session;

    private XRSessionEvent(String type, XRSessionEventInit eventInitDict) {
        super(type, eventInitDict);
    }
}
