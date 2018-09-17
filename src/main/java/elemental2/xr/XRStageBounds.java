package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XRStageBounds interface describes a border around a stage, known as the stage bounds which the user can be expected to safely be able to move within.
 * <p>
 * The polygonal boundary is given by the geometry array of DOMPointReadOnlys, which represents a loop of points at the edges of the safe space. The points describe offsets from the stage origin in meters, and MUST be given in a clockwise order as viewed from above, looking towards the negative end of the Y axis. The y value of each point MUST be 0 and the w value of each point MUST be 1. The bounds can be considered to originate at the floor and extend infinitely high. The shape it describes MAY not be convex. The values reported are relative to the stage origin, but MAY not contain it.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/11/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRStageBounds {
    public Object geometry;
}
