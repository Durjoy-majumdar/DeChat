package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_effects */
public class icons_filled_effects extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
        if (i == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
            Paint instancePaint = C24542c.instancePaint(looper);
            instancePaint.setFlags(385);
            instancePaint.setStyle(Paint.Style.FILL);
            Paint instancePaint2 = C24542c.instancePaint(looper);
            instancePaint2.setFlags(385);
            instancePaint2.setStyle(Paint.Style.STROKE);
            instancePaint.setColor(-16777216);
            instancePaint2.setStrokeWidth(1.0f);
            instancePaint2.setStrokeCap(Paint.Cap.BUTT);
            instancePaint2.setStrokeJoin(Paint.Join.MITER);
            instancePaint2.setStrokeMiter(4.0f);
            instancePaint2.setPathEffect((PathEffect) null);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.261719f, 39.98828f);
            instancePath.cubicTo(8.164062f, 41.523438f, 10.117188f, 42.546875f, 12.289062f, 43.07422f);
            instancePath.lineTo(13.113281f, 43.25f);
            instancePath.lineTo(13.316406f, 43.85547f);
            Path path = instancePath;
            path.cubicTo(16.570312f, 53.253906f, 25.496094f, 60.0f, 36.0f, 60.0f);
            path.cubicTo(46.73047f, 60.0f, 55.816406f, 52.960938f, 58.88672f, 43.246094f);
            path.cubicTo(61.39453f, 42.796875f, 63.59375f, 41.71875f, 65.734375f, 39.996094f);
            path.cubicTo(63.785156f, 54.671875f, 51.214844f, 66.0f, 36.0f, 66.0f);
            path.cubicTo(20.785156f, 66.0f, 8.214844f, 54.671875f, 6.261719f, 39.98828f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.597656f);
            Path path2 = instancePath;
            path2.cubicTo(39.984375f, 39.597656f, 43.76172f, 39.910156f, 47.335938f, 40.54297f);
            path2.cubicTo(47.335938f, 46.648438f, 42.26172f, 51.601562f, 36.0f, 51.601562f);
            path2.cubicTo(29.738281f, 51.601562f, 24.664062f, 46.648438f, 24.664062f, 40.54297f);
            path2.cubicTo(28.238281f, 39.910156f, 32.015625f, 39.597656f, 36.0f, 39.597656f);
            instancePath.close();
            instancePath.moveTo(64.89453f, 18.898438f);
            instancePath.lineTo(66.21484f, 19.191406f);
            instancePath.cubicTo(68.05078f, 19.675781f, 69.19141f, 21.46875f, 68.90234f, 23.304688f);
            instancePath.lineTo(68.82422f, 23.671875f);
            instancePath.lineTo(68.5625f, 24.648438f);
            Path path3 = instancePath;
            path3.cubicTo(66.90234f, 30.710938f, 65.20703f, 34.496094f, 63.48047f, 36.01172f);
            path3.cubicTo(60.17578f, 38.910156f, 56.902344f, 39.964844f, 49.683594f, 37.98828f);
            path3.cubicTo(45.121094f, 36.73828f, 41.84375f, 33.871094f, 39.85547f, 29.378906f);
            instancePath.lineTo(39.535156f, 28.613281f);
            instancePath.lineTo(32.464844f, 28.613281f);
            Path path4 = instancePath;
            path4.cubicTo(30.515625f, 33.546875f, 27.132812f, 36.671875f, 22.316406f, 37.98828f);
            path4.cubicTo(15.097656f, 39.964844f, 11.824219f, 38.910156f, 8.519531f, 36.01172f);
            path4.cubicTo(6.792969f, 34.496094f, 5.097656f, 30.710938f, 3.4375f, 24.648438f);
            instancePath.lineTo(3.175781f, 23.671875f);
            instancePath.cubicTo(2.691406f, 21.835938f, 3.6875f, 19.957031f, 5.429688f, 19.304688f);
            instancePath.lineTo(5.875f, 19.171875f);
            instancePath.cubicTo(13.625f, 17.320312f, 22.492188f, 17.664062f, 32.464844f, 20.199219f);
            instancePath.lineTo(33.078125f, 20.269531f);
            instancePath.cubicTo(33.195312f, 20.28125f, 33.320312f, 20.289062f, 33.453125f, 20.300781f);
            instancePath.lineTo(34.335938f, 20.34375f);
            instancePath.lineTo(35.402344f, 20.371094f);
            instancePath.lineTo(36.0f, 20.375f);
            instancePath.lineTo(37.152344f, 20.359375f);
            instancePath.lineTo(38.128906f, 20.324219f);
            instancePath.cubicTo(38.273438f, 20.316406f, 38.414062f, 20.308594f, 38.546875f, 20.300781f);
            instancePath.lineTo(39.25f, 20.238281f);
            Path path5 = instancePath;
            path5.cubicTo(39.351562f, 20.226562f, 39.445312f, 20.210938f, 39.535156f, 20.199219f);
            path5.cubicTo(48.984375f, 17.796875f, 57.4375f, 17.363281f, 64.89453f, 18.898438f);
            instancePath.close();
            instancePath.moveTo(36.0f, 6.0f);
            path5.cubicTo(43.609375f, 6.0f, 50.558594f, 8.832031f, 55.847656f, 13.503906f);
            path5.cubicTo(52.734375f, 13.492188f, 49.507812f, 13.746094f, 46.16797f, 14.253906f);
            path5.cubicTo(43.08203f, 12.808594f, 39.63672f, 12.0f, 36.0f, 12.0f);
            path5.cubicTo(32.367188f, 12.0f, 28.921875f, 12.808594f, 25.835938f, 14.253906f);
            path5.cubicTo(22.488281f, 13.746094f, 19.261719f, 13.492188f, 16.148438f, 13.5f);
            path5.cubicTo(21.4375f, 8.835938f, 28.390625f, 6.0f, 36.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 6.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
