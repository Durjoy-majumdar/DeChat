package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_fans */
public class icons_filled_fans extends C24542c {
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
        instancePath.moveTo(57.777344f, 27.410156f);
        instancePath.lineTo(61.371094f, 27.929688f);
        Path path = instancePath;
        path.cubicTo(63.007812f, 28.167969f, 64.14453f, 29.6875f, 63.90625f, 31.328125f);
        path.cubicTo(63.8125f, 31.980469f, 63.503906f, 32.585938f, 63.03125f, 33.046875f);
        instancePath.lineTo(51.691406f, 44.097656f);
        instancePath.lineTo(54.371094f, 59.70703f);
        Path path2 = instancePath;
        path2.cubicTo(54.648438f, 61.339844f, 53.55078f, 62.890625f, 51.91797f, 63.171875f);
        path2.cubicTo(51.26953f, 63.28125f, 50.601562f, 63.17578f, 50.015625f, 62.867188f);
        instancePath.lineTo(36.0f, 55.5f);
        instancePath.lineTo(21.984375f, 62.867188f);
        Path path3 = instancePath;
        path3.cubicTo(20.515625f, 63.640625f, 18.703125f, 63.07422f, 17.933594f, 61.609375f);
        path3.cubicTo(17.625f, 61.027344f, 17.519531f, 60.35547f, 17.628906f, 59.70703f);
        instancePath.lineTo(18.386719f, 55.296875f);
        instancePath.cubicTo(21.859375f, 54.539062f, 25.820312f, 53.01172f, 30.039062f, 50.851562f);
        instancePath.lineTo(31.613281f, 50.01953f);
        instancePath.cubicTo(33.539062f, 48.972656f, 35.441406f, 47.83203f, 37.328125f, 46.597656f);
        instancePath.lineTo(38.921875f, 45.53125f);
        instancePath.cubicTo(46.61328f, 40.253906f, 53.253906f, 33.94922f, 57.777344f, 27.410156f);
        instancePath.close();
        instancePath.moveTo(58.289062f, 20.710938f);
        instancePath.cubicTo(54.07422f, 29.15625f, 45.847656f, 37.140625f, 37.253906f, 43.039062f);
        instancePath.lineTo(35.6875f, 44.085938f);
        instancePath.cubicTo(33.85547f, 45.285156f, 32.01953f, 46.382812f, 30.210938f, 47.367188f);
        instancePath.lineTo(28.667969f, 48.179688f);
        instancePath.lineTo(27.480469f, 48.777344f);
        instancePath.lineTo(26.890625f, 49.058594f);
        instancePath.lineTo(25.726562f, 49.597656f);
        instancePath.lineTo(24.578125f, 50.101562f);
        instancePath.lineTo(23.445312f, 50.566406f);
        instancePath.lineTo(22.339844f, 50.98828f);
        instancePath.cubicTo(21.972656f, 51.125f, 21.609375f, 51.25f, 21.253906f, 51.371094f);
        instancePath.lineTo(20.195312f, 51.714844f);
        instancePath.lineTo(19.164062f, 52.01172f);
        instancePath.cubicTo(18.996094f, 52.058594f, 18.828125f, 52.10547f, 18.660156f, 52.148438f);
        instancePath.lineTo(17.675781f, 52.378906f);
        instancePath.cubicTo(17.515625f, 52.414062f, 17.355469f, 52.44922f, 17.199219f, 52.48047f);
        instancePath.lineTo(16.265625f, 52.64453f);
        instancePath.lineTo(15.371094f, 52.76172f);
        Path path4 = instancePath;
        path4.cubicTo(8.523438f, 53.503906f, 5.335938f, 49.84375f, 10.753906f, 39.58203f);
        path4.cubicTo(8.140625f, 46.589844f, 11.386719f, 48.875f, 17.273438f, 48.10547f);
        instancePath.lineTo(18.226562f, 47.95703f);
        instancePath.cubicTo(18.386719f, 47.929688f, 18.550781f, 47.898438f, 18.714844f, 47.867188f);
        instancePath.lineTo(19.726562f, 47.648438f);
        instancePath.cubicTo(19.898438f, 47.60547f, 20.074219f, 47.5625f, 20.25f, 47.51953f);
        instancePath.lineTo(21.453125f, 47.1875f);
        instancePath.cubicTo(22.066406f, 47.007812f, 22.695312f, 46.808594f, 23.335938f, 46.585938f);
        instancePath.lineTo(24.636719f, 46.117188f);
        instancePath.lineTo(25.300781f, 45.86328f);
        instancePath.lineTo(26.644531f, 45.316406f);
        instancePath.lineTo(28.363281f, 44.5625f);
        instancePath.lineTo(30.109375f, 43.742188f);
        instancePath.lineTo(30.816406f, 43.39453f);
        instancePath.lineTo(32.23828f, 42.664062f);
        instancePath.lineTo(32.953125f, 42.285156f);
        instancePath.lineTo(34.38672f, 41.496094f);
        instancePath.lineTo(35.82422f, 40.671875f);
        instancePath.lineTo(37.257812f, 39.8125f);
        instancePath.lineTo(38.6875f, 38.91797f);
        instancePath.lineTo(40.460938f, 37.757812f);
        instancePath.lineTo(42.214844f, 36.554688f);
        instancePath.lineTo(42.90625f, 36.0625f);
        instancePath.lineTo(44.277344f, 35.058594f);
        instancePath.lineTo(45.617188f, 34.03125f);
        instancePath.lineTo(46.933594f, 32.984375f);
        instancePath.lineTo(48.214844f, 31.917969f);
        instancePath.lineTo(49.45703f, 30.835938f);
        instancePath.lineTo(50.0625f, 30.289062f);
        instancePath.lineTo(51.242188f, 29.1875f);
        instancePath.cubicTo(54.132812f, 26.414062f, 56.57422f, 23.542969f, 58.289062f, 20.710938f);
        instancePath.close();
        instancePath.moveTo(37.328125f, 10.089844f);
        instancePath.cubicTo(37.91797f, 10.378906f, 38.398438f, 10.859375f, 38.691406f, 11.449219f);
        instancePath.lineTo(45.69922f, 25.652344f);
        instancePath.lineTo(49.9375f, 26.265625f);
        instancePath.cubicTo(49.683594f, 26.519531f, 49.429688f, 26.769531f, 49.164062f, 27.019531f);
        instancePath.lineTo(48.01172f, 28.097656f);
        instancePath.lineTo(47.44922f, 28.605469f);
        instancePath.lineTo(46.242188f, 29.652344f);
        instancePath.lineTo(45.015625f, 30.675781f);
        instancePath.lineTo(43.75f, 31.683594f);
        instancePath.lineTo(42.453125f, 32.671875f);
        instancePath.lineTo(41.132812f, 33.640625f);
        instancePath.lineTo(40.484375f, 34.101562f);
        instancePath.lineTo(38.789062f, 35.26953f);
        instancePath.lineTo(37.054688f, 36.402344f);
        instancePath.lineTo(35.66797f, 37.265625f);
        instancePath.lineTo(34.28125f, 38.097656f);
        instancePath.lineTo(32.89453f, 38.89453f);
        instancePath.lineTo(31.507812f, 39.65625f);
        instancePath.lineTo(30.832031f, 40.015625f);
        instancePath.lineTo(29.132812f, 40.878906f);
        instancePath.lineTo(27.425781f, 41.695312f);
        instancePath.lineTo(26.792969f, 41.98047f);
        instancePath.lineTo(25.453125f, 42.5625f);
        instancePath.lineTo(24.171875f, 43.08203f);
        instancePath.cubicTo(23.996094f, 43.152344f, 23.789062f, 43.23047f, 23.582031f, 43.308594f);
        instancePath.lineTo(22.320312f, 43.765625f);
        instancePath.cubicTo(21.757812f, 43.95703f, 21.175781f, 44.14453f, 20.609375f, 44.308594f);
        instancePath.lineTo(20.25f, 44.40625f);
        instancePath.lineTo(20.308594f, 44.097656f);
        instancePath.lineTo(8.96875f, 33.046875f);
        Path path5 = instancePath;
        path5.cubicTo(7.78125f, 31.890625f, 7.757812f, 29.988281f, 8.914062f, 28.804688f);
        path5.cubicTo(9.375f, 28.332031f, 9.976562f, 28.023438f, 10.628906f, 27.929688f);
        instancePath.lineTo(26.300781f, 25.652344f);
        instancePath.lineTo(33.308594f, 11.449219f);
        Path path6 = instancePath;
        path6.cubicTo(34.04297f, 9.964844f, 35.84375f, 9.355469f, 37.328125f, 10.089844f);
        instancePath.close();
        instancePath.moveTo(60.097656f, 6.023438f);
        path6.cubicTo(60.183594f, 6.054688f, 60.253906f, 6.121094f, 60.285156f, 6.210938f);
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
