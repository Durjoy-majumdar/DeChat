package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_game_add */
public class icons_filled_game_add extends C24542c {
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
        instancePath.moveTo(44.996094f, 15.0f);
        instancePath.lineTo(45.0f, 16.414062f);
        Path path = instancePath;
        path.cubicTo(45.0f, 16.988281f, 45.101562f, 17.511719f, 45.39453f, 18.0625f);
        path.cubicTo(45.69922f, 18.632812f, 46.16797f, 19.101562f, 46.73828f, 19.40625f);
        instancePath.lineTo(47.066406f, 19.558594f);
        instancePath.cubicTo(47.5f, 19.734375f, 47.92578f, 19.800781f, 48.382812f, 19.800781f);
        instancePath.lineTo(52.195312f, 19.792969f);
        instancePath.lineTo(52.19922f, 23.617188f);
        Path path2 = instancePath;
        path2.cubicTo(52.19922f, 24.191406f, 52.30078f, 24.710938f, 52.59375f, 25.261719f);
        path2.cubicTo(52.898438f, 25.832031f, 53.367188f, 26.300781f, 53.9375f, 26.605469f);
        path2.cubicTo(54.48828f, 26.898438f, 55.01172f, 27.0f, 55.585938f, 27.0f);
        instancePath.lineTo(58.414062f, 27.0f);
        Path path3 = instancePath;
        path3.cubicTo(58.98828f, 27.0f, 59.51172f, 26.898438f, 60.0625f, 26.605469f);
        path3.cubicTo(60.632812f, 26.300781f, 61.101562f, 25.832031f, 61.40625f, 25.261719f);
        instancePath.lineTo(61.41797f, 25.230469f);
        Path path4 = instancePath;
        path4.cubicTo(62.58203f, 28.265625f, 63.46875f, 32.066406f, 63.929688f, 36.746094f);
        path4.cubicTo(65.08203f, 48.390625f, 64.49609f, 55.214844f, 62.078125f, 58.222656f);
        path4.cubicTo(61.13672f, 59.402344f, 59.91797f, 60.0f, 58.464844f, 60.0f);
        path4.cubicTo(54.73047f, 60.0f, 52.60547f, 57.503906f, 50.13672f, 54.621094f);
        path4.cubicTo(49.265625f, 53.601562f, 48.359375f, 52.539062f, 47.308594f, 51.48828f);
        path4.cubicTo(44.55078f, 48.73828f, 41.76953f, 48.35547f, 39.179688f, 48.35547f);
        path4.cubicTo(38.71875f, 48.35547f, 38.26172f, 48.371094f, 37.828125f, 48.382812f);
        path4.cubicTo(37.414062f, 48.39453f, 37.007812f, 48.402344f, 36.628906f, 48.402344f);
        instancePath.lineTo(35.378906f, 48.402344f);
        Path path5 = instancePath;
        path5.cubicTo(34.996094f, 48.402344f, 34.59375f, 48.390625f, 34.17578f, 48.382812f);
        path5.cubicTo(33.742188f, 48.371094f, 33.29297f, 48.35547f, 32.82422f, 48.35547f);
        path5.cubicTo(30.230469f, 48.35547f, 27.457031f, 48.73828f, 24.695312f, 51.48828f);
        path5.cubicTo(23.640625f, 52.539062f, 22.742188f, 53.597656f, 21.863281f, 54.621094f);
        path5.cubicTo(19.402344f, 57.503906f, 17.269531f, 60.0f, 13.535156f, 60.0f);
        path5.cubicTo(12.082031f, 60.0f, 10.867188f, 59.402344f, 9.921875f, 58.222656f);
        path5.cubicTo(7.503906f, 55.20703f, 6.917969f, 48.382812f, 8.070312f, 36.746094f);
        path5.cubicTo(9.660156f, 20.710938f, 16.21875f, 15.0f, 21.835938f, 15.0f);
        instancePath.close();
        instancePath.moveTo(24.925781f, 28.574219f);
        instancePath.lineTo(23.074219f, 28.574219f);
        instancePath.lineTo(22.894531f, 28.59375f);
        instancePath.cubicTo(22.554688f, 28.675781f, 22.300781f, 28.980469f, 22.300781f, 29.347656f);
        instancePath.lineTo(22.300781f, 33.171875f);
        instancePath.lineTo(18.472656f, 33.171875f);
        instancePath.cubicTo(18.046875f, 33.171875f, 17.699219f, 33.51953f, 17.699219f, 33.945312f);
        instancePath.lineTo(17.699219f, 35.80078f);
        instancePath.lineTo(17.71875f, 35.976562f);
        instancePath.cubicTo(17.800781f, 36.320312f, 18.105469f, 36.57422f, 18.472656f, 36.57422f);
        instancePath.lineTo(22.300781f, 36.570312f);
        instancePath.lineTo(22.300781f, 40.402344f);
        instancePath.cubicTo(22.300781f, 40.828125f, 22.644531f, 41.171875f, 23.074219f, 41.171875f);
        instancePath.lineTo(24.925781f, 41.171875f);
        instancePath.lineTo(25.105469f, 41.152344f);
        instancePath.cubicTo(25.445312f, 41.07422f, 25.699219f, 40.765625f, 25.699219f, 40.398438f);
        instancePath.lineTo(25.695312f, 36.570312f);
        instancePath.lineTo(29.527344f, 36.57422f);
        instancePath.cubicTo(29.953125f, 36.57422f, 30.300781f, 36.226562f, 30.300781f, 35.80078f);
        instancePath.lineTo(30.300781f, 33.945312f);
        instancePath.lineTo(30.28125f, 33.76953f);
        Path path6 = instancePath;
        path6.cubicTo(30.199219f, 33.429688f, 29.894531f, 33.171875f, 29.527344f, 33.171875f);
        instancePath.lineTo(25.695312f, 33.171875f);
        instancePath.lineTo(25.699219f, 29.347656f);
        path6.cubicTo(25.699219f, 28.917969f, 25.355469f, 28.574219f, 24.925781f, 28.574219f);
        instancePath.close();
        instancePath.moveTo(48.0f, 28.5f);
        path6.cubicTo(44.51953f, 28.5f, 41.69922f, 31.320312f, 41.69922f, 34.80078f);
        path6.cubicTo(41.69922f, 38.28125f, 44.51953f, 41.101562f, 48.0f, 41.101562f);
        path6.cubicTo(51.48047f, 41.101562f, 54.30078f, 38.28125f, 54.30078f, 34.80078f);
        path6.cubicTo(54.30078f, 31.320312f, 51.48047f, 28.5f, 48.0f, 28.5f);
        instancePath.close();
        instancePath.moveTo(48.0f, 28.5f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(45.0f, 34.80078f);
        Path path7 = instancePath2;
        path7.cubicTo(45.0f, 36.45703f, 46.34375f, 37.80078f, 48.0f, 37.80078f);
        path7.cubicTo(49.65625f, 37.80078f, 51.0f, 36.45703f, 51.0f, 34.80078f);
        path7.cubicTo(51.0f, 33.14453f, 49.65625f, 31.800781f, 48.0f, 31.800781f);
        path7.cubicTo(46.34375f, 31.800781f, 45.0f, 33.14453f, 45.0f, 34.80078f);
        instancePath2.close();
        instancePath2.moveTo(45.0f, 34.80078f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(55.476562f, 6.003906f);
        instancePath3.lineTo(58.414062f, 6.0f);
        Path path8 = instancePath3;
        path8.cubicTo(58.55078f, 6.0f, 58.597656f, 6.015625f, 58.648438f, 6.039062f);
        path8.cubicTo(58.695312f, 6.066406f, 58.734375f, 6.105469f, 58.76172f, 6.152344f);
        path8.cubicTo(58.777344f, 6.1875f, 58.789062f, 6.21875f, 58.796875f, 6.277344f);
        instancePath3.lineTo(58.796875f, 13.195312f);
        instancePath3.lineTo(65.61719f, 13.199219f);
        Path path9 = instancePath3;
        path9.cubicTo(65.75f, 13.199219f, 65.796875f, 13.214844f, 65.84766f, 13.238281f);
        path9.cubicTo(65.89453f, 13.265625f, 65.93359f, 13.304688f, 65.96094f, 13.351562f);
        path9.cubicTo(65.97656f, 13.386719f, 65.98828f, 13.417969f, 65.99609f, 13.476562f);
        instancePath3.lineTo(66.0f, 16.414062f);
        Path path10 = instancePath3;
        path10.cubicTo(66.0f, 16.550781f, 65.984375f, 16.597656f, 65.96094f, 16.648438f);
        path10.cubicTo(65.93359f, 16.695312f, 65.89453f, 16.734375f, 65.84766f, 16.761719f);
        path10.cubicTo(65.8125f, 16.777344f, 65.78125f, 16.789062f, 65.72266f, 16.796875f);
        instancePath3.lineTo(58.796875f, 16.796875f);
        instancePath3.lineTo(58.80078f, 23.617188f);
        Path path11 = instancePath3;
        path11.cubicTo(58.80078f, 23.75f, 58.785156f, 23.796875f, 58.76172f, 23.847656f);
        path11.cubicTo(58.734375f, 23.894531f, 58.695312f, 23.933594f, 58.648438f, 23.960938f);
        path11.cubicTo(58.597656f, 23.984375f, 58.55078f, 24.0f, 58.414062f, 24.0f);
        instancePath3.lineTo(55.585938f, 24.0f);
        Path path12 = instancePath3;
        path12.cubicTo(55.44922f, 24.0f, 55.402344f, 23.984375f, 55.351562f, 23.960938f);
        path12.cubicTo(55.304688f, 23.933594f, 55.265625f, 23.894531f, 55.23828f, 23.847656f);
        path12.cubicTo(55.214844f, 23.796875f, 55.19922f, 23.75f, 55.19922f, 23.617188f);
        instancePath3.lineTo(55.195312f, 16.796875f);
        instancePath3.lineTo(48.382812f, 16.800781f);
        Path path13 = instancePath3;
        path13.cubicTo(48.25f, 16.800781f, 48.203125f, 16.785156f, 48.152344f, 16.761719f);
        path13.cubicTo(48.10547f, 16.734375f, 48.066406f, 16.695312f, 48.039062f, 16.648438f);
        path13.cubicTo(48.015625f, 16.597656f, 48.0f, 16.550781f, 48.0f, 16.414062f);
        instancePath3.lineTo(48.0f, 13.585938f);
        Path path14 = instancePath3;
        path14.cubicTo(48.0f, 13.449219f, 48.015625f, 13.402344f, 48.039062f, 13.351562f);
        path14.cubicTo(48.066406f, 13.304688f, 48.10547f, 13.265625f, 48.152344f, 13.238281f);
        path14.cubicTo(48.203125f, 13.214844f, 48.25f, 13.199219f, 48.382812f, 13.199219f);
        instancePath3.lineTo(55.195312f, 13.195312f);
        instancePath3.lineTo(55.19922f, 6.382812f);
        Path path15 = instancePath3;
        path15.cubicTo(55.19922f, 6.25f, 55.214844f, 6.203125f, 55.23828f, 6.152344f);
        path15.cubicTo(55.265625f, 6.105469f, 55.304688f, 6.066406f, 55.351562f, 6.039062f);
        path15.cubicTo(55.38672f, 6.023438f, 55.41797f, 6.011719f, 55.476562f, 6.003906f);
        instancePath3.close();
        instancePath3.moveTo(55.476562f, 6.003906f);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
