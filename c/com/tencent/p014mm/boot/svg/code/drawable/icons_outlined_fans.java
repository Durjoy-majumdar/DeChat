package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_fans */
public class icons_outlined_fans extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(37.328125f, 10.089844f);
        instancePath.cubicTo(37.91797f, 10.378906f, 38.398438f, 10.859375f, 38.691406f, 11.449219f);
        instancePath.lineTo(45.69922f, 25.652344f);
        instancePath.lineTo(53.59375f, 26.796875f);
        Path path = instancePath;
        path.cubicTo(55.464844f, 24.78125f, 57.0625f, 22.734375f, 58.289062f, 20.710938f);
        path.cubicTo(57.23828f, 22.816406f, 55.933594f, 24.898438f, 54.441406f, 26.921875f);
        instancePath.lineTo(61.371094f, 27.929688f);
        Path path2 = instancePath;
        path2.cubicTo(63.007812f, 28.167969f, 64.14453f, 29.6875f, 63.90625f, 31.328125f);
        path2.cubicTo(63.8125f, 31.980469f, 63.503906f, 32.585938f, 63.03125f, 33.046875f);
        instancePath.lineTo(51.691406f, 44.097656f);
        instancePath.lineTo(54.371094f, 59.70703f);
        Path path3 = instancePath;
        path3.cubicTo(54.648438f, 61.339844f, 53.55078f, 62.890625f, 51.91797f, 63.171875f);
        path3.cubicTo(51.26953f, 63.28125f, 50.601562f, 63.17578f, 50.015625f, 62.867188f);
        instancePath.lineTo(36.0f, 55.5f);
        instancePath.lineTo(21.984375f, 62.867188f);
        Path path4 = instancePath;
        path4.cubicTo(20.515625f, 63.640625f, 18.703125f, 63.07422f, 17.933594f, 61.609375f);
        path4.cubicTo(17.625f, 61.027344f, 17.519531f, 60.35547f, 17.628906f, 59.70703f);
        instancePath.lineTo(18.9375f, 52.07422f);
        Path path5 = instancePath;
        path5.cubicTo(9.769531f, 54.507812f, 4.464844f, 51.492188f, 10.753906f, 39.58203f);
        path5.cubicTo(7.800781f, 47.5f, 12.328125f, 49.390625f, 19.699219f, 47.652344f);
        instancePath.lineTo(20.308594f, 44.097656f);
        instancePath.lineTo(8.96875f, 33.046875f);
        Path path6 = instancePath;
        path6.cubicTo(7.78125f, 31.890625f, 7.757812f, 29.988281f, 8.914062f, 28.804688f);
        path6.cubicTo(9.375f, 28.332031f, 9.976562f, 28.023438f, 10.628906f, 27.929688f);
        instancePath.lineTo(26.300781f, 25.652344f);
        instancePath.lineTo(33.308594f, 11.449219f);
        instancePath.cubicTo(34.04297f, 9.964844f, 35.84375f, 9.355469f, 37.328125f, 10.089844f);
        instancePath.close();
        instancePath.moveTo(22.808594f, 50.8125f);
        instancePath.lineTo(21.382812f, 59.117188f);
        instancePath.lineTo(36.0f, 51.433594f);
        instancePath.lineTo(50.617188f, 59.117188f);
        instancePath.lineTo(47.82422f, 42.84375f);
        instancePath.lineTo(59.648438f, 31.316406f);
        instancePath.lineTo(51.83203f, 30.179688f);
        instancePath.cubicTo(43.80078f, 39.496094f, 32.101562f, 47.277344f, 22.808594f, 50.8125f);
        instancePath.close();
        instancePath.moveTo(36.0f, 14.132812f);
        instancePath.lineTo(28.691406f, 28.941406f);
        instancePath.lineTo(12.351562f, 31.316406f);
        instancePath.lineTo(24.175781f, 42.84375f);
        instancePath.lineTo(23.546875f, 46.51172f);
        instancePath.cubicTo(31.980469f, 43.558594f, 42.628906f, 37.16797f, 50.40625f, 29.972656f);
        instancePath.lineTo(43.308594f, 28.941406f);
        instancePath.close();
        instancePath.moveTo(60.097656f, 6.023438f);
        instancePath.cubicTo(60.183594f, 6.054688f, 60.253906f, 6.121094f, 60.285156f, 6.210938f);
        instancePath.lineTo(61.910156f, 10.96875f);
        instancePath.lineTo(66.66797f, 12.59375f);
        Path path7 = instancePath;
        path7.cubicTo(66.82422f, 12.648438f, 66.91016f, 12.820312f, 66.85547f, 12.976562f);
        path7.cubicTo(66.82422f, 13.0625f, 66.75781f, 13.132812f, 66.66797f, 13.164062f);
        instancePath.lineTo(61.910156f, 14.789062f);
        instancePath.lineTo(60.285156f, 19.546875f);
        Path path8 = instancePath;
        path8.cubicTo(60.23047f, 19.703125f, 60.058594f, 19.789062f, 59.902344f, 19.734375f);
        path8.cubicTo(59.816406f, 19.703125f, 59.746094f, 19.636719f, 59.714844f, 19.546875f);
        instancePath.lineTo(58.089844f, 14.789062f);
        instancePath.lineTo(53.33203f, 13.164062f);
        Path path9 = instancePath;
        path9.cubicTo(53.17578f, 13.109375f, 53.089844f, 12.9375f, 53.14453f, 12.78125f);
        path9.cubicTo(53.17578f, 12.695312f, 53.242188f, 12.625f, 53.33203f, 12.59375f);
        instancePath.lineTo(58.089844f, 10.96875f);
        instancePath.lineTo(59.714844f, 6.210938f);
        path9.cubicTo(59.76953f, 6.054688f, 59.941406f, 5.96875f, 60.097656f, 6.023438f);
        instancePath.close();
        instancePath.moveTo(60.097656f, 6.023438f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
