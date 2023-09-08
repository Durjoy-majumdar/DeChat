package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_at */
public class icons_outlined_at extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(33.808594f, 24.5625f);
                Path path = instancePath;
                path.cubicTo(28.710938f, 24.5625f, 25.40625f, 28.886719f, 25.40625f, 35.53125f);
                path.cubicTo(25.40625f, 42.140625f, 28.675781f, 46.429688f, 33.773438f, 46.429688f);
                path.cubicTo(38.976562f, 46.429688f, 42.316406f, 42.070312f, 42.316406f, 35.35547f);
                path.cubicTo(42.316406f, 28.746094f, 39.046875f, 24.5625f, 33.808594f, 24.5625f);
                instancePath.close();
                instancePath.moveTo(34.933594f, 6.0f);
                Path path2 = instancePath;
                path2.cubicTo(50.339474f, 6.0f, 63.058594f, 16.582031f, 63.058594f, 32.15625f);
                path2.cubicTo(63.058594f, 43.335938f, 58.41797f, 50.507812f, 50.683594f, 50.507812f);
                path2.cubicTo(46.5f, 50.507812f, 43.195312f, 47.976562f, 42.66797f, 44.039062f);
                instancePath.lineTo(42.421875f, 44.039062f);
                Path path3 = instancePath;
                path3.cubicTo(40.839844f, 48.046875f, 37.570312f, 50.26172f, 33.210938f, 50.26172f);
                path3.cubicTo(25.96875f, 50.26172f, 21.046875f, 44.285156f, 21.046875f, 35.42578f);
                path3.cubicTo(21.046875f, 26.777344f, 26.039062f, 20.800781f, 33.210938f, 20.800781f);
                path3.cubicTo(37.289062f, 20.800781f, 40.839844f, 23.015625f, 42.140625f, 26.460938f);
                instancePath.lineTo(42.38672f, 26.460938f);
                instancePath.lineTo(42.38672f, 21.503906f);
                instancePath.lineTo(46.464844f, 21.503906f);
                instancePath.lineTo(46.464844f, 41.61328f);
                Path path4 = instancePath;
                path4.cubicTo(46.464844f, 44.8125f, 48.152344f, 46.921875f, 51.351562f, 46.921875f);
                path4.cubicTo(56.027344f, 46.921875f, 59.226562f, 41.54297f, 59.226562f, 32.085938f);
                path4.cubicTo(59.226562f, 18.65625f, 48.71459f, 9.527114f, 34.933594f, 9.527114f);
                path4.cubicTo(21.1526f, 9.527114f, 9.8671875f, 19.576914f, 9.8671875f, 35.320312f);
                path4.cubicTo(9.8671875f, 49.944553f, 21.909554f, 61.089844f, 35.320312f, 61.089844f);
                path4.cubicTo(40.066406f, 61.089844f, 44.601562f, 60.492188f, 46.992188f, 59.54297f);
                instancePath.lineTo(46.992188f, 63.023438f);
                Path path5 = instancePath;
                path5.cubicTo(44.14453f, 64.00781f, 39.996094f, 64.57031f, 35.285156f, 64.57031f);
                path5.cubicTo(18.59385f, 64.57031f, 6.0f, 51.976818f, 6.0f, 35.179688f);
                path5.cubicTo(6.0f, 18.382557f, 19.527716f, 6.0f, 34.933594f, 6.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
