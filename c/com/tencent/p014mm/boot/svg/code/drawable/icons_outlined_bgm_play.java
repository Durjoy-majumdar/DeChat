package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_bgm_play */
public class icons_outlined_bgm_play extends C24542c {
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
            instancePath.moveTo(32.023438f, 10.832031f);
            instancePath.lineTo(32.554688f, 14.394531f);
            instancePath.lineTo(32.253906f, 14.4375f);
            Path path = instancePath;
            path.cubicTo(21.113281f, 16.230469f, 12.601562f, 25.890625f, 12.601562f, 37.539062f);
            path.cubicTo(12.601562f, 50.460938f, 23.078125f, 60.9375f, 36.0f, 60.9375f);
            path.cubicTo(48.921875f, 60.9375f, 59.398438f, 50.460938f, 59.398438f, 37.539062f);
            path.cubicTo(59.398438f, 32.1875f, 57.601562f, 27.253906f, 54.58203f, 23.3125f);
            instancePath.lineTo(57.433594f, 21.128906f);
            instancePath.lineTo(57.765625f, 21.5625f);
            Path path2 = instancePath;
            path2.cubicTo(61.058594f, 26.035156f, 63.0f, 31.5625f, 63.0f, 37.539062f);
            path2.cubicTo(63.0f, 52.44922f, 50.910156f, 64.53906f, 36.0f, 64.53906f);
            path2.cubicTo(21.089844f, 64.53906f, 9.0f, 52.44922f, 9.0f, 37.539062f);
            path2.cubicTo(9.0f, 23.980469f, 18.996094f, 12.753906f, 32.023438f, 10.832031f);
            instancePath.close();
            instancePath.moveTo(57.890625f, 6.222656f);
            instancePath.lineTo(57.898438f, 6.261719f);
            instancePath.lineTo(57.898438f, 10.519531f);
            instancePath.cubicTo(57.898438f, 10.65625f, 57.808594f, 10.773438f, 57.67578f, 10.808594f);
            instancePath.lineTo(43.496094f, 14.570312f);
            instancePath.lineTo(41.98828f, 37.875f);
            Path path3 = instancePath;
            path3.cubicTo(41.79297f, 41.015625f, 39.1875f, 43.5f, 36.0f, 43.5f);
            path3.cubicTo(32.6875f, 43.5f, 30.0f, 40.8125f, 30.0f, 37.5f);
            path3.cubicTo(30.0f, 34.1875f, 32.6875f, 31.5f, 36.0f, 31.5f);
            path3.cubicTo(36.98828f, 31.5f, 37.921875f, 31.738281f, 38.746094f, 32.164062f);
            instancePath.lineTo(39.898438f, 12.996094f);
            instancePath.cubicTo(39.898438f, 11.636719f, 40.816406f, 10.445312f, 42.128906f, 10.097656f);
            instancePath.lineTo(57.523438f, 6.011719f);
            instancePath.cubicTo(57.683594f, 5.96875f, 57.847656f, 6.0625f, 57.890625f, 6.222656f);
            instancePath.close();
            instancePath.moveTo(57.890625f, 6.222656f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
