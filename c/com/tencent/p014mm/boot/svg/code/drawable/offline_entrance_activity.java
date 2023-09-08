package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_entrance_activity */
public class offline_entrance_activity extends C24542c {
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
            instancePath.moveTo(54.0f, 9.0f);
            instancePath.cubicTo(55.65625f, 9.0f, 57.0f, 10.34375f, 57.0f, 12.0f);
            instancePath.lineTo(57.0f, 60.0f);
            instancePath.cubicTo(57.0f, 61.65625f, 55.65625f, 63.0f, 54.0f, 63.0f);
            instancePath.lineTo(18.0f, 63.0f);
            instancePath.cubicTo(16.34375f, 63.0f, 15.0f, 61.65625f, 15.0f, 60.0f);
            instancePath.lineTo(15.0f, 12.0f);
            instancePath.cubicTo(15.0f, 10.34375f, 16.34375f, 9.0f, 18.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(53.398438f, 12.601562f);
            instancePath.lineTo(18.601562f, 12.601562f);
            instancePath.lineTo(18.601562f, 59.398438f);
            instancePath.lineTo(53.398438f, 59.398438f);
            instancePath.lineTo(53.398438f, 43.226562f);
            instancePath.lineTo(33.98828f, 53.73828f);
            instancePath.lineTo(33.808594f, 53.835938f);
            Path path = instancePath;
            path.cubicTo(33.585938f, 53.9375f, 33.335938f, 54.0f, 33.07422f, 54.0f);
            path.cubicTo(32.460938f, 54.0f, 31.925781f, 53.683594f, 31.648438f, 53.214844f);
            instancePath.lineTo(31.539062f, 52.996094f);
            instancePath.lineTo(27.078125f, 43.808594f);
            Path path2 = instancePath;
            path2.cubicTo(27.03125f, 43.70703f, 27.0f, 43.59375f, 27.0f, 43.484375f);
            path2.cubicTo(27.0f, 43.058594f, 27.367188f, 42.71875f, 27.816406f, 42.71875f);
            path2.cubicTo(28.0f, 42.71875f, 28.167969f, 42.773438f, 28.304688f, 42.871094f);
            instancePath.lineTo(33.570312f, 46.38672f);
            Path path3 = instancePath;
            path3.cubicTo(33.953125f, 46.625f, 34.414062f, 46.76172f, 34.910156f, 46.76172f);
            path3.cubicTo(35.203125f, 46.76172f, 35.484375f, 46.710938f, 35.746094f, 46.621094f);
            path3.cubicTo(35.746094f, 46.621094f, 42.464844f, 43.82422f, 49.097656f, 41.058594f);
            instancePath.lineTo(50.464844f, 40.492188f);
            instancePath.cubicTo(51.464844f, 40.07422f, 52.44922f, 39.664062f, 53.398438f, 39.26953f);
            instancePath.close();
            instancePath.moveTo(40.5f, 27.0f);
            instancePath.lineTo(40.5f, 30.601562f);
            instancePath.lineTo(22.5f, 30.601562f);
            instancePath.lineTo(22.5f, 27.0f);
            instancePath.close();
            instancePath.moveTo(40.5f, 18.0f);
            instancePath.lineTo(40.5f, 21.601562f);
            instancePath.lineTo(22.5f, 21.601562f);
            instancePath.lineTo(22.5f, 18.0f);
            instancePath.close();
            instancePath.moveTo(40.5f, 18.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
