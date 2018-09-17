package elemental2.xr;

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An XRView describes a single view into an XR scene. Each view corresponds to a display or portion of a display used by an XR device to present imagery to the user. They are used to retrieve all the information necessary to render content that is well aligned to the view's physical output properties, including the field of view, eye offset, and other optical properties. Views may cover overlapping regions of the user’s vision. No guarantee is made about the number of views any XR device uses or their order, nor is the number of views required to be constant for the duration of an XRSession.
 * <p>
 * NOTE: Many HMDs will request that content render two views, one for the left eye and one for the right, while most magic window devices will only request one view, but applications should never assume a specific view comfiguration. For example: A magic window device may request two views if it is capable of stereo output, but may revert to requesting a single view for performance reasons if the stereo output mode is turned off. Similarly, HMDs may request more than two views to facilitate a wide field of view or displays of different pixel density.
 * <p>
 * The eye attribute describes which eye this view is expected to be shown to. This attribute’s primary purpose is to ensure that prerendered stereo content can present the correct portion of the content to the correct eye. If the view does not have an intrinsicly associated eye (the display is monoscopic, for example) this attribute MUST be set to "left".
 * <p>
 * The projectionMatrix attribute provides a matrix describing the projection to be used for the view’s rendering. It is strongly recommended that applications use this matrix without modification. Failure to use the provided projection matrices when rendering may cause the presented frame to be distorted or badly aligned, resulting in varying degrees of user discomfort.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRView {
    public XREye eye;
    public Float32Array projectionMatrix;
}
