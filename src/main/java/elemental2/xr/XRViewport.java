package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRViewport object describes a viewport, or rectangular region, of a graphics surface. The x and y attributes define an offset from the surface origin and the width and height attributes define the rectangular dimensions of the viewport.
 * <p>
 * The exact interpretation of the viewport values depends on the conventions of the graphics API the viewport is associated with:
 * <p>
 * When used with a XRWebGLLayer the x and y attributes specify the lower left corner of the viewport rectangle, in pixels, with the viewport rectangle extending width pixels to the right of x and height pixels above y. The values can be passed to the WebGL viewport function directly.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRViewport {

    private XRViewport() {

    }

    public int x;
    public int y;
    public int width;
    public int height;
}
