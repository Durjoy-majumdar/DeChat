package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_anchor_icon_talk_on */
public class finder_live_anchor_icon_talk_on extends C24542c {
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
            instancePath.moveTo(29.148438f, 14.0f);
            Path path = instancePath;
            path.cubicTo(29.128906f, 13.949219f, 29.105469f, 13.898438f, 29.082031f, 13.851562f);
            path.cubicTo(28.488281f, 12.664062f, 27.046875f, 12.183594f, 25.859375f, 12.777344f);
            instancePath.lineTo(15.601562f, 17.90625f);
            instancePath.lineTo(15.601562f, 52.308594f);
            instancePath.lineTo(27.394531f, 57.36328f);
            Path path2 = instancePath;
            path2.cubicTo(27.570312f, 57.4375f, 27.753906f, 57.492188f, 27.945312f, 57.523438f);
            path2.cubicTo(29.25f, 57.742188f, 30.488281f, 56.859375f, 30.707031f, 55.55078f);
            instancePath.lineTo(32.804688f, 42.953125f);
            instancePath.lineTo(40.1875f, 40.492188f);
            instancePath.close();
            instancePath.moveTo(41.9375f, 43.703125f);
            instancePath.lineTo(36.0f, 45.683594f);
            instancePath.lineTo(34.257812f, 56.14453f);
            Path path3 = instancePath;
            path3.cubicTo(33.710938f, 59.410156f, 30.621094f, 61.621094f, 27.351562f, 61.07422f);
            path3.cubicTo(26.878906f, 60.996094f, 26.414062f, 60.859375f, 25.976562f, 60.671875f);
            instancePath.lineTo(13.816406f, 55.460938f);
            instancePath.cubicTo(12.714844f, 54.98828f, 12.0f, 53.90625f, 12.0f, 52.703125f);
            instancePath.lineTo(12.0f, 17.535156f);
            instancePath.cubicTo(12.0f, 16.402344f, 12.640625f, 15.363281f, 13.660156f, 14.855469f);
            instancePath.lineTo(24.25f, 9.558594f);
            Path path4 = instancePath;
            path4.cubicTo(27.214844f, 8.074219f, 30.820312f, 9.277344f, 32.30078f, 12.242188f);
            path4.cubicTo(32.36328f, 12.363281f, 32.41797f, 12.488281f, 32.472656f, 12.617188f);
            instancePath.lineTo(43.757812f, 39.703125f);
            Path path5 = instancePath;
            path5.cubicTo(44.39453f, 41.234375f, 43.671875f, 42.98828f, 42.14453f, 43.625f);
            path5.cubicTo(42.07422f, 43.65625f, 42.007812f, 43.679688f, 41.9375f, 43.703125f);
            instancePath.close();
            instancePath.moveTo(55.96875f, 22.03125f);
            Path path6 = instancePath;
            path6.cubicTo(60.3125f, 26.371094f, 63.0f, 32.371094f, 63.0f, 39.0f);
            path6.cubicTo(63.0f, 45.628906f, 60.3125f, 51.628906f, 55.96875f, 55.96875f);
            instancePath.lineTo(53.42578f, 53.42578f);
            Path path7 = instancePath;
            path7.cubicTo(57.226562f, 49.621094f, 59.398438f, 44.48828f, 59.398438f, 39.0f);
            path7.cubicTo(59.398438f, 33.51172f, 57.226562f, 28.378906f, 53.42578f, 24.574219f);
            instancePath.close();
            instancePath.moveTo(50.03125f, 27.96875f);
            path7.cubicTo(52.85547f, 30.792969f, 54.601562f, 34.691406f, 54.601562f, 39.0f);
            path7.cubicTo(54.601562f, 43.308594f, 52.85547f, 47.20703f, 50.03125f, 50.03125f);
            instancePath.lineTo(47.484375f, 47.484375f);
            Path path8 = instancePath;
            path8.cubicTo(49.722656f, 45.246094f, 51.0f, 42.23047f, 51.0f, 39.0f);
            path8.cubicTo(51.0f, 35.76953f, 49.722656f, 32.753906f, 47.484375f, 30.515625f);
            instancePath.close();
            instancePath.moveTo(50.03125f, 27.96875f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
