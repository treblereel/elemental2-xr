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
public class XRNavigator extends Navigator {

    public XRSystem xr;

    private XRNavigator(){

    }

    @JsOverlay
    public static XRNavigator of(Navigator o) {
        // Unchecked is necessary to allow polyfill to work
        return Js.uncheckedCast(o);
    }

}
