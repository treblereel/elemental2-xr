package elemental2.xr;

import elemental2.dom.Navigator;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRNavigator extends elemental2.dom.Navigator {

    public XR xr;

    private XRNavigator(){

    }

    @JsOverlay
    public static XRNavigator of(Navigator o) {
        return Js.cast(o);
    }
}
