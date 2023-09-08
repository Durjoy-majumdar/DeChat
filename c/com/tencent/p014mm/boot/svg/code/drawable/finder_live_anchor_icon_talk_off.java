package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_anchor_icon_talk_off */
public class finder_live_anchor_icon_talk_off extends C24542c {
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
            instancePath.moveTo(32.30078f, 12.242188f);
            instancePath.cubicTo(32.36328f, 12.363281f, 32.41797f, 12.488281f, 32.472656f, 12.617188f);
            instancePath.lineTo(39.78125f, 30.160156f);
            instancePath.cubicTo(38.757812f, 30.9375f, 37.816406f, 31.816406f, 36.972656f, 32.785156f);
            instancePath.lineTo(29.148438f, 14.0f);
            Path path = instancePath;
            path.cubicTo(29.128906f, 13.949219f, 29.105469f, 13.898438f, 29.082031f, 13.851562f);
            path.cubicTo(28.488281f, 12.664062f, 27.046875f, 12.183594f, 25.859375f, 12.777344f);
            instancePath.lineTo(15.601562f, 17.90625f);
            instancePath.lineTo(15.601562f, 52.308594f);
            instancePath.lineTo(27.394531f, 57.36328f);
            Path path2 = instancePath;
            path2.cubicTo(27.570312f, 57.4375f, 27.753906f, 57.492188f, 27.945312f, 57.523438f);
            path2.cubicTo(29.25f, 57.742188f, 30.488281f, 56.859375f, 30.707031f, 55.55078f);
            instancePath.lineTo(32.40625f, 45.34375f);
            instancePath.lineTo(32.414062f, 45.683594f);
            instancePath.cubicTo(32.51953f, 48.632812f, 33.3125f, 51.410156f, 34.640625f, 53.85547f);
            instancePath.lineTo(34.257812f, 56.14453f);
            Path path3 = instancePath;
            path3.cubicTo(33.710938f, 59.410156f, 30.621094f, 61.621094f, 27.351562f, 61.07422f);
            path3.cubicTo(26.878906f, 60.996094f, 26.414062f, 60.859375f, 25.976562f, 60.671875f);
            instancePath.lineTo(13.816406f, 55.460938f);
            instancePath.cubicTo(12.714844f, 54.98828f, 12.0f, 53.90625f, 12.0f, 52.703125f);
            instancePath.lineTo(12.0f, 17.535156f);
            instancePath.cubicTo(12.0f, 16.402344f, 12.640625f, 15.363281f, 13.660156f, 14.855469f);
            instancePath.lineTo(24.25f, 9.558594f);
            instancePath.cubicTo(27.214844f, 8.074219f, 30.820312f, 9.277344f, 32.30078f, 12.242188f);
            instancePath.close();
            instancePath.moveTo(51.0f, 30.0f);
            Path path4 = instancePath;
            path4.cubicTo(59.285156f, 30.0f, 66.0f, 36.714844f, 66.0f, 45.0f);
            path4.cubicTo(66.0f, 53.285156f, 59.285156f, 60.0f, 51.0f, 60.0f);
            path4.cubicTo(42.714844f, 60.0f, 36.0f, 53.285156f, 36.0f, 45.0f);
            path4.cubicTo(36.0f, 36.714844f, 42.714844f, 30.0f, 51.0f, 30.0f);
            instancePath.close();
            instancePath.moveTo(41.765625f, 38.3125f);
            Path path5 = instancePath;
            path5.cubicTo(40.402344f, 40.191406f, 39.601562f, 42.5f, 39.601562f, 45.0f);
            path5.cubicTo(39.601562f, 51.296875f, 44.703125f, 56.398438f, 51.0f, 56.398438f);
            path5.cubicTo(53.5f, 56.398438f, 55.808594f, 55.597656f, 57.6875f, 54.234375f);
            instancePath.close();
            instancePath.moveTo(51.0f, 33.601562f);
            path5.cubicTo(48.5f, 33.601562f, 46.191406f, 34.402344f, 44.3125f, 35.765625f);
            instancePath.lineTo(60.234375f, 51.6875f);
            Path path6 = instancePath;
            path6.cubicTo(61.597656f, 49.808594f, 62.398438f, 47.5f, 62.398438f, 45.0f);
            path6.cubicTo(62.398438f, 38.703125f, 57.296875f, 33.601562f, 51.0f, 33.601562f);
            instancePath.close();
            instancePath.moveTo(51.0f, 33.601562f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
