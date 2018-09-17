package elemental2.xr;

import elemental2.webgl.WebGLFramebuffer;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Each XRSession MUST identify a native WebGL framebuffer resolution, which is the pixel resolution of a WebGL framebuffer required to match the physical pixel resolution of the XRDevice.
 * <p>
 * The native WebGL framebuffer resolution is detemined by running the following steps:
 * <p>
 * 1. Let session be the target XRSession.
 * 2. If session’s immersive value is true, set the native WebGL framebuffer resolution to the resolution required to have a 1:1 ratio between the pixels of a framebuffer large enough to contain all of the session’s XRViews and the physical screen pixels in the area of the display under the highest magnification and abort these steps. If no method exists to determine the native resolution as described, the recommended WebGL framebuffer resolution MAY be used.
 * 3. If session’s immersive value is false, set the native WebGL framebuffer resolution to the size of the session’s outputContext's canvas in physical display pixels and reevaluate these steps every time the size of the canvas changes.
 * <p>
 * Additionally, the XRSession MUST identify a recommended WebGL framebuffer resolution, which represents a best estimate of the WebGL framebuffer resolution large enough to contain all of the session’s XRViews that provides an average application a good balance between performance and quality. It MAY be smaller than, larger than, or equal to the native WebGL framebuffer resolution.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRWebGLLayer implements XRLayer {

    // Attributes
    public XRWebGLRenderingContext context;

    public boolean antialias;
    public boolean depth;
    public boolean stencil;
    public boolean alpha;
    public boolean multiview;

    public WebGLFramebuffer framebuffer;
    public long framebufferWidth;
    public long framebufferHeight;

    public XRWebGLLayer(XRSession session, XRWebGLRenderingContext context) {

    }

    public XRWebGLLayer(XRSession session, XRWebGLRenderingContext context, XRWebGLLayerInit layerInit) {

    }

    // Methods
    public native XRViewport getViewport(XRView view);

    public native void requestViewportScaling(double viewportScaleFactor);

    // Static Methods
    public static native double getNativeFramebufferScaleFactor(XRSession session);
}
