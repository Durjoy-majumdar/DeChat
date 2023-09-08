package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_gift */
public class finder_icons_filled_gift extends C24542c {
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
        instancePath.moveTo(60.0f, 39.0f);
        instancePath.lineTo(60.0f, 60.0f);
        instancePath.cubicTo(60.0f, 61.65625f, 58.65625f, 63.0f, 57.0f, 63.0f);
        instancePath.lineTo(38.25f, 62.996094f);
        instancePath.lineTo(38.25f, 39.0f);
        instancePath.close();
        instancePath.moveTo(33.75f, 39.0f);
        instancePath.lineTo(33.75f, 62.996094f);
        instancePath.lineTo(15.0f, 63.0f);
        instancePath.cubicTo(13.34375f, 63.0f, 12.0f, 61.65625f, 12.0f, 60.0f);
        instancePath.lineTo(12.0f, 39.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 12.0f);
        instancePath.lineTo(45.984375f, 12.007812f);
        instancePath.cubicTo(43.242188f, 12.152344f, 40.941406f, 14.113281f, 40.339844f, 16.765625f);
        instancePath.lineTo(40.253906f, 17.242188f);
        instancePath.lineTo(39.703125f, 21.0f);
        instancePath.lineTo(46.5f, 21.0f);
        instancePath.cubicTo(48.839844f, 21.0f, 50.76172f, 19.214844f, 50.98047f, 16.933594f);
        instancePath.lineTo(51.0f, 16.5f);
        Path path = instancePath;
        path.cubicTo(51.0f, 14.160156f, 49.214844f, 12.238281f, 46.933594f, 12.019531f);
        instancePath.close();
        instancePath.moveTo(25.6875f, 12.0f);
        instancePath.lineTo(25.5f, 12.0f);
        path.cubicTo(23.015625f, 12.0f, 21.0f, 14.015625f, 21.0f, 16.5f);
        path.cubicTo(21.0f, 18.839844f, 22.785156f, 20.761719f, 25.066406f, 20.980469f);
        instancePath.lineTo(25.5f, 21.0f);
        instancePath.lineTo(32.296875f, 21.0f);
        instancePath.lineTo(31.746094f, 17.242188f);
        instancePath.cubicTo(31.355469f, 14.558594f, 29.261719f, 12.492188f, 26.65625f, 12.078125f);
        instancePath.lineTo(26.164062f, 12.019531f);
        instancePath.close();
        instancePath.moveTo(9.0f, 24.0f);
        instancePath.cubicTo(9.0f, 22.34375f, 10.34375f, 21.0f, 12.0f, 21.0f);
        instancePath.lineTo(17.707031f, 21.003906f);
        Path path2 = instancePath;
        path2.cubicTo(16.9375f, 19.679688f, 16.5f, 18.140625f, 16.5f, 16.5f);
        path2.cubicTo(16.5f, 11.707031f, 20.246094f, 7.789062f, 24.972656f, 7.515625f);
        instancePath.lineTo(25.6875f, 7.5f);
        path2.cubicTo(30.617188f, 7.5f, 34.847656f, 10.878906f, 36.003906f, 15.578125f);
        path2.cubicTo(37.109375f, 11.058594f, 41.066406f, 7.761719f, 45.75f, 7.515625f);
        instancePath.lineTo(46.5f, 7.5f);
        path2.cubicTo(51.46875f, 7.5f, 55.5f, 11.53125f, 55.5f, 16.5f);
        path2.cubicTo(55.5f, 18.140625f, 55.0625f, 19.679688f, 54.29297f, 21.003906f);
        instancePath.lineTo(60.0f, 21.0f);
        path2.cubicTo(61.65625f, 21.0f, 63.0f, 22.34375f, 63.0f, 24.0f);
        instancePath.lineTo(63.0f, 34.5f);
        instancePath.lineTo(9.0f, 34.5f);
        instancePath.close();
        instancePath.moveTo(9.0f, 24.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
