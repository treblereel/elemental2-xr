package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRLayer defines a source of bitmap images and a description of how the image is to be rendered in the XRDevice. Initially only one type of layer, the XRWebGLLayer, is defined but future revisions of the spec may extend the available layer types.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface XRLayer {

}

