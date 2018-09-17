package elemental2.xr;

import elemental2.dom.HTMLCanvasElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRSessionCreationOptions dictionary provides a session description, indicating the desired properties of a session to be returned from requestSession().
 * <p>
 * To determine if an XRSessionCreationOptions options is supported by the device device run the following steps:
 * <p>
 * 1. Let immersive be options.immersive.
 * 2. If immersive is true and device’s supports immersive boolean is false return false.
 * 3. If immersive is false and options.outputContext is null, return false
 * <p>
 * A session is considered to be an immersive session if it’s output is displayed to the user in a way that makes the user feel the content is present in the same space with them, shown at the proper scale. Sessions are considered non-immersive (sometimes referred to as inline) if their output is displayed as an element in an HTML document.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRPresentationContext {

    // readonly
    public HTMLCanvasElement canvas;

    private XRPresentationContext(){

    }

}
