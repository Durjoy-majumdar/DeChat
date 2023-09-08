package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_qr_reward_icon */
public class offline_qr_reward_icon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
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
            instancePath.moveTo(49.183594f, 9.386719f);
            Path path = instancePath;
            path.cubicTo(51.226562f, 12.371094f, 51.773438f, 15.519531f, 51.773438f, 22.140625f);
            path.cubicTo(51.773438f, 23.945312f, 52.80078f, 25.050781f, 54.20703f, 25.90625f);
            path.cubicTo(55.61328f, 26.761719f, 59.195312f, 26.761719f, 61.746094f, 31.640625f);
            path.cubicTo(62.304688f, 32.70703f, 62.691406f, 34.45703f, 62.875f, 36.609375f);
            path.cubicTo(62.882812f, 36.617188f, 62.890625f, 36.628906f, 62.89453f, 36.63672f);
            path.cubicTo(63.027344f, 36.914062f, 63.023438f, 37.195312f, 62.941406f, 37.453125f);
            path.cubicTo(63.39453f, 45.195312f, 61.39453f, 57.246094f, 55.61328f, 61.972656f);
            path.cubicTo(53.308594f, 63.85547f, 48.683594f, 65.578125f, 45.109375f, 65.87109f);
            path.cubicTo(44.15625f, 65.94922f, 42.070312f, 65.98828f, 38.39453f, 65.99609f);
            instancePath.lineTo(34.17578f, 65.99609f);
            Path path2 = instancePath;
            path2.cubicTo(29.390625f, 65.98828f, 22.863281f, 65.953125f, 14.132812f, 65.89844f);
            path2.cubicTo(11.296875f, 65.88281f, 9.0f, 63.617188f, 9.0f, 60.816406f);
            instancePath.lineTo(9.0f, 36.71875f);
            instancePath.cubicTo(9.0f, 33.90625f, 11.324219f, 31.640625f, 14.171875f, 31.640625f);
            instancePath.lineTo(20.421875f, 31.640625f);
            Path path3 = instancePath;
            path3.cubicTo(21.980469f, 31.640625f, 23.433594f, 31.496094f, 25.171875f, 31.117188f);
            path3.cubicTo(26.398438f, 30.847656f, 27.414062f, 30.367188f, 29.285156f, 29.277344f);
            path3.cubicTo(31.382812f, 28.058594f, 32.617188f, 26.671875f, 33.546875f, 24.238281f);
            path3.cubicTo(34.070312f, 22.859375f, 34.246094f, 21.507812f, 34.4375f, 17.503906f);
            path3.cubicTo(34.45703f, 17.105469f, 34.464844f, 16.914062f, 34.48828f, 16.332031f);
            instancePath.lineTo(34.51172f, 15.605469f);
            Path path4 = instancePath;
            path4.cubicTo(34.70703f, 10.148438f, 35.289062f, 8.203125f, 38.33203f, 6.800781f);
            path4.cubicTo(42.402344f, 4.925781f, 47.257812f, 6.570312f, 49.183594f, 9.386719f);
            instancePath.close();
            instancePath.moveTo(39.839844f, 10.070312f);
            path4.cubicTo(38.48047f, 10.699219f, 38.273438f, 11.203125f, 38.109375f, 15.734375f);
            path4.cubicTo(38.066406f, 16.980469f, 38.058594f, 17.140625f, 38.035156f, 17.675781f);
            path4.cubicTo(37.82422f, 22.050781f, 37.609375f, 23.675781f, 36.910156f, 25.519531f);
            path4.cubicTo(35.70703f, 28.675781f, 33.953125f, 30.726562f, 31.097656f, 32.390625f);
            path4.cubicTo(28.847656f, 33.69922f, 27.566406f, 34.277344f, 25.941406f, 34.632812f);
            path4.cubicTo(24.003906f, 35.054688f, 22.292969f, 35.242188f, 20.421875f, 35.242188f);
            instancePath.lineTo(14.171875f, 35.242188f);
            instancePath.cubicTo(13.289062f, 35.242188f, 12.601562f, 35.91797f, 12.601562f, 36.71875f);
            instancePath.lineTo(12.601562f, 60.816406f);
            Path path5 = instancePath;
            path5.cubicTo(12.601562f, 61.621094f, 13.28125f, 62.29297f, 14.15625f, 62.296875f);
            path5.cubicTo(23.109375f, 62.35547f, 29.542969f, 62.38672f, 34.148438f, 62.398438f);
            instancePath.lineTo(35.933594f, 62.398438f);
            instancePath.cubicTo(36.308594f, 62.398438f, 36.66797f, 62.398438f, 37.015625f, 62.398438f);
            instancePath.lineTo(38.484375f, 62.398438f);
            Path path6 = instancePath;
            path6.cubicTo(42.164062f, 62.390625f, 43.972656f, 62.351562f, 44.816406f, 62.28125f);
            path6.cubicTo(47.683594f, 62.05078f, 51.617188f, 60.585938f, 53.33203f, 59.183594f);
            path6.cubicTo(57.078125f, 56.121094f, 59.390625f, 46.78125f, 59.53125f, 39.910156f);
            path6.cubicTo(57.48047f, 41.01953f, 55.179688f, 42.265625f, 52.820312f, 43.54297f);
            instancePath.lineTo(50.621094f, 44.73047f);
            instancePath.cubicTo(42.304688f, 49.234375f, 33.98828f, 53.73828f, 33.98828f, 53.73828f);
            instancePath.lineTo(33.808594f, 53.835938f);
            Path path7 = instancePath;
            path7.cubicTo(33.585938f, 53.9375f, 33.335938f, 54.0f, 33.07422f, 54.0f);
            path7.cubicTo(32.460938f, 54.0f, 31.925781f, 53.683594f, 31.648438f, 53.214844f);
            instancePath.lineTo(31.539062f, 52.996094f);
            instancePath.lineTo(27.078125f, 43.808594f);
            Path path8 = instancePath;
            path8.cubicTo(27.03125f, 43.70703f, 27.0f, 43.59375f, 27.0f, 43.484375f);
            path8.cubicTo(27.0f, 43.058594f, 27.367188f, 42.71875f, 27.816406f, 42.71875f);
            path8.cubicTo(28.0f, 42.71875f, 28.167969f, 42.773438f, 28.304688f, 42.871094f);
            instancePath.lineTo(33.570312f, 46.38672f);
            Path path9 = instancePath;
            path9.cubicTo(33.953125f, 46.625f, 34.414062f, 46.76172f, 34.910156f, 46.76172f);
            path9.cubicTo(35.203125f, 46.76172f, 35.484375f, 46.710938f, 35.746094f, 46.621094f);
            path9.cubicTo(35.746094f, 46.621094f, 41.183594f, 44.35547f, 47.101562f, 41.890625f);
            instancePath.lineTo(48.589844f, 41.273438f);
            Path path10 = instancePath;
            path10.cubicTo(52.70703f, 39.554688f, 56.86328f, 37.828125f, 59.421875f, 36.76172f);
            path10.cubicTo(59.273438f, 35.33203f, 58.98828f, 34.13672f, 58.554688f, 33.308594f);
            path10.cubicTo(58.01953f, 32.285156f, 57.441406f, 31.566406f, 56.804688f, 31.054688f);
            path10.cubicTo(56.08203f, 30.46875f, 56.515625f, 30.652344f, 53.73047f, 29.628906f);
            path10.cubicTo(53.195312f, 29.433594f, 52.765625f, 29.242188f, 52.335938f, 28.980469f);
            path10.cubicTo(49.734375f, 27.398438f, 48.171875f, 25.199219f, 48.171875f, 22.140625f);
            path10.cubicTo(48.171875f, 15.996094f, 47.69922f, 13.589844f, 46.210938f, 11.417969f);
            path10.cubicTo(45.14453f, 9.855469f, 42.09375f, 9.03125f, 39.839844f, 10.070312f);
            instancePath.close();
            instancePath.moveTo(39.839844f, 10.070312f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
