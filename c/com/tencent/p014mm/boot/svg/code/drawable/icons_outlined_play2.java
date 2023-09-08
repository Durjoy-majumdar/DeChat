package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_play2 */
public class icons_outlined_play2 extends C24542c {
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
            instancePath.moveTo(36.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(55.882812f, 0.0f, 72.0f, 16.117188f, 72.0f, 36.0f);
            path.cubicTo(72.0f, 55.882812f, 55.882812f, 72.0f, 36.0f, 72.0f);
            path.cubicTo(16.117188f, 72.0f, 0.0f, 55.882812f, 0.0f, 36.0f);
            path.cubicTo(0.0f, 16.117188f, 16.117188f, 0.0f, 36.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 2.160156f);
            Path path2 = instancePath;
            path2.cubicTo(17.3125f, 2.160156f, 2.160156f, 17.3125f, 2.160156f, 36.0f);
            path2.cubicTo(2.160156f, 54.6875f, 17.3125f, 69.83984f, 36.0f, 69.83984f);
            path2.cubicTo(54.6875f, 69.83984f, 69.83984f, 54.6875f, 69.83984f, 36.0f);
            path2.cubicTo(69.83984f, 17.3125f, 54.6875f, 2.160156f, 36.0f, 2.160156f);
            instancePath.close();
            instancePath.moveTo(28.800781f, 22.902344f);
            path2.cubicTo(29.113281f, 22.902344f, 29.421875f, 22.984375f, 29.691406f, 23.140625f);
            instancePath.lineTo(49.464844f, 34.4375f);
            Path path3 = instancePath;
            path3.cubicTo(50.328125f, 34.929688f, 50.628906f, 36.03125f, 50.13672f, 36.89453f);
            path3.cubicTo(49.976562f, 37.171875f, 49.742188f, 37.402344f, 49.464844f, 37.5625f);
            instancePath.lineTo(29.691406f, 48.859375f);
            Path path4 = instancePath;
            path4.cubicTo(28.828125f, 49.35547f, 27.730469f, 49.054688f, 27.238281f, 48.191406f);
            path4.cubicTo(27.082031f, 47.91797f, 27.0f, 47.61328f, 27.0f, 47.296875f);
            instancePath.lineTo(27.0f, 24.703125f);
            instancePath.cubicTo(27.0f, 23.707031f, 27.804688f, 22.902344f, 28.800781f, 22.902344f);
            instancePath.close();
            instancePath.moveTo(28.800781f, 22.902344f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
