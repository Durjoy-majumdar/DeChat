package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.userguide_nearfriends_icon */
public class userguide_nearfriends_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-12799249);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(85.09563f, 39.728813f);
        instancePath.lineTo(69.08572f, 39.728813f);
        instancePath.lineTo(69.08572f, 35.441456f);
        Path path = instancePath;
        path.cubicTo(69.08572f, 34.95495f, 68.989655f, 34.49417f, 68.833855f, 34.064964f);
        path.cubicTo(72.43834f, 32.391422f, 74.942856f, 28.754305f, 74.942856f, 24.525423f);
        path.cubicTo(74.942856f, 18.711882f, 70.223175f, 14.0f, 64.4f, 14.0f);
        path.cubicTo(58.576828f, 14.0f, 53.857143f, 18.711882f, 53.857143f, 24.525423f);
        path.cubicTo(53.857143f, 28.755474f, 56.361656f, 32.392593f, 59.966145f, 34.064964f);
        path.cubicTo(59.810345f, 34.49417f, 59.714287f, 34.95495f, 59.714287f, 35.441456f);
        instancePath.lineTo(59.714287f, 39.728813f);
        instancePath.lineTo(36.285713f, 39.728813f);
        instancePath.lineTo(36.285713f, 35.441456f);
        path.cubicTo(36.285713f, 34.95495f, 36.189655f, 34.49417f, 36.033855f, 34.064964f);
        path.cubicTo(39.638344f, 32.391422f, 42.142857f, 28.754305f, 42.142857f, 24.525423f);
        path.cubicTo(42.142857f, 18.711882f, 37.423172f, 14.0f, 31.6f, 14.0f);
        path.cubicTo(25.776829f, 14.0f, 21.057142f, 18.711882f, 21.057142f, 24.525423f);
        path.cubicTo(21.057142f, 28.755474f, 23.561657f, 32.392593f, 27.166143f, 34.064964f);
        path.cubicTo(27.010344f, 34.49417f, 26.914286f, 34.95495f, 26.914286f, 35.441456f);
        instancePath.lineTo(26.914286f, 39.728813f);
        instancePath.lineTo(10.904371f, 39.728813f);
        Path path2 = instancePath;
        path2.cubicTo(8.747771f, 39.728813f, 7.0f, 41.561405f, 7.0f, 43.822033f);
        path2.cubicTo(7.0f, 46.08383f, 8.747771f, 47.915253f, 10.904371f, 47.915253f);
        instancePath.lineTo(26.914286f, 47.915253f);
        instancePath.lineTo(26.914286f, 50.575848f);
        instancePath.lineTo(12.7154f, 76.53739f);
        Path path3 = instancePath;
        path3.cubicTo(11.685715f, 78.41793f, 12.2972f, 80.82591f, 14.080114f, 81.91354f);
        path3.cubicTo(15.863029f, 83.0f, 18.142628f, 82.35444f, 19.172314f, 80.4739f);
        instancePath.lineTo(31.115028f, 58.64066f);
        instancePath.lineTo(43.654f, 80.4739f);
        path3.cubicTo(44.550144f, 82.03283f, 46.345943f, 82.72517f, 48.00117f, 82.30415f);
        path3.cubicTo(49.655228f, 82.72517f, 51.451027f, 82.03283f, 52.34717f, 80.4739f);
        instancePath.lineTo(64.88615f, 58.64066f);
        instancePath.lineTo(76.82886f, 80.4739f);
        Path path4 = instancePath;
        path4.cubicTo(77.85854f, 82.35444f, 80.13697f, 83.0f, 81.922226f, 81.91354f);
        path4.cubicTo(83.70397f, 80.82591f, 84.31546f, 78.4191f, 83.285774f, 76.53739f);
        instancePath.lineTo(69.08688f, 50.578186f);
        instancePath.lineTo(69.08688f, 47.915253f);
        instancePath.lineTo(85.0968f, 47.915253f);
        path4.cubicTo(87.2534f, 47.915253f, 89.001175f, 46.08383f, 89.001175f, 43.822033f);
        path4.cubicTo(89.0f, 41.561405f, 87.25223f, 39.728813f, 85.09563f, 39.728813f);
        instancePath.lineTo(85.09563f, 39.728813f);
        instancePath.close();
        instancePath.moveTo(47.99883f, 72.30032f);
        instancePath.lineTo(36.213085f, 51.776917f);
        instancePath.cubicTo(36.2576f, 51.536f, 36.285713f, 51.289238f, 36.285713f, 51.034286f);
        instancePath.lineTo(36.285713f, 47.915253f);
        instancePath.lineTo(59.714287f, 47.915253f);
        instancePath.lineTo(59.714287f, 51.034286f);
        instancePath.cubicTo(59.714287f, 51.289238f, 59.74123f, 51.536f, 59.786915f, 51.776917f);
        instancePath.lineTo(47.99883f, 72.30032f);
        instancePath.lineTo(47.99883f, 72.30032f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
