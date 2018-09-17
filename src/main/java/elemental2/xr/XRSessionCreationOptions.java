package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="Object")
public class XRSessionCreationOptions {

    // false
    public boolean immersive;

    public boolean environmentIntegration;

    public XRPresentationContext outputContext;
}
