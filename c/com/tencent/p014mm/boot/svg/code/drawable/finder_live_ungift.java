package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_ungift */
public class finder_live_ungift extends C24542c {
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
        instancePath.moveTo(51.0f, 36.0f);
        Path path = instancePath;
        path.cubicTo(59.285156f, 36.0f, 66.0f, 42.714844f, 66.0f, 51.0f);
        path.cubicTo(66.0f, 59.285156f, 59.285156f, 66.0f, 51.0f, 66.0f);
        path.cubicTo(42.714844f, 66.0f, 36.0f, 59.285156f, 36.0f, 51.0f);
        path.cubicTo(36.0f, 42.714844f, 42.714844f, 36.0f, 51.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(25.6875f, 7.5f);
        path.cubicTo(30.617188f, 7.5f, 34.847656f, 10.878906f, 36.003906f, 15.578125f);
        path.cubicTo(37.109375f, 11.058594f, 41.066406f, 7.761719f, 45.75f, 7.515625f);
        instancePath.lineTo(46.5f, 7.5f);
        path.cubicTo(51.46875f, 7.5f, 55.5f, 11.53125f, 55.5f, 16.5f);
        path.cubicTo(55.5f, 18.140625f, 55.0625f, 19.679688f, 54.29297f, 21.003906f);
        instancePath.lineTo(60.0f, 21.0f);
        instancePath.cubicTo(61.65625f, 21.0f, 63.0f, 22.34375f, 63.0f, 24.0f);
        instancePath.lineTo(63.0f, 36.789062f);
        instancePath.cubicTo(61.902344f, 35.859375f, 60.695312f, 35.058594f, 59.402344f, 34.402344f);
        instancePath.lineTo(59.398438f, 24.601562f);
        instancePath.lineTo(12.601562f, 24.601562f);
        instancePath.lineTo(12.601562f, 35.398438f);
        instancePath.lineTo(40.867188f, 35.398438f);
        instancePath.cubicTo(38.0f, 37.265625f, 35.679688f, 39.902344f, 34.19922f, 43.01172f);
        instancePath.lineTo(34.195312f, 39.0f);
        instancePath.lineTo(15.601562f, 39.0f);
        instancePath.lineTo(15.601562f, 59.398438f);
        instancePath.lineTo(34.195312f, 59.39453f);
        instancePath.lineTo(34.19922f, 58.98828f);
        Path path2 = instancePath;
        path2.cubicTo(34.88672f, 60.4375f, 35.76172f, 61.785156f, 36.789062f, 63.0f);
        instancePath.lineTo(15.0f, 63.0f);
        path2.cubicTo(13.34375f, 63.0f, 12.0f, 61.65625f, 12.0f, 60.0f);
        instancePath.lineTo(12.0f, 39.0f);
        instancePath.lineTo(9.0f, 39.0f);
        instancePath.lineTo(9.0f, 24.0f);
        path2.cubicTo(9.0f, 22.34375f, 10.34375f, 21.0f, 12.0f, 21.0f);
        instancePath.lineTo(17.707031f, 21.003906f);
        path2.cubicTo(16.9375f, 19.679688f, 16.5f, 18.140625f, 16.5f, 16.5f);
        path2.cubicTo(16.5f, 11.53125f, 20.53125f, 7.5f, 25.5f, 7.5f);
        instancePath.close();
        instancePath.moveTo(41.765625f, 44.3125f);
        path2.cubicTo(40.402344f, 46.191406f, 39.601562f, 48.5f, 39.601562f, 51.0f);
        path2.cubicTo(39.601562f, 57.296875f, 44.703125f, 62.398438f, 51.0f, 62.398438f);
        path2.cubicTo(53.5f, 62.398438f, 55.808594f, 61.597656f, 57.6875f, 60.234375f);
        instancePath.close();
        instancePath.moveTo(51.0f, 39.601562f);
        path2.cubicTo(48.5f, 39.601562f, 46.191406f, 40.402344f, 44.3125f, 41.765625f);
        instancePath.lineTo(60.234375f, 57.6875f);
        path2.cubicTo(61.597656f, 55.808594f, 62.398438f, 53.5f, 62.398438f, 51.0f);
        path2.cubicTo(62.398438f, 44.703125f, 57.296875f, 39.601562f, 51.0f, 39.601562f);
        instancePath.close();
        instancePath.moveTo(25.6875f, 11.101562f);
        instancePath.lineTo(25.5f, 11.101562f);
        path2.cubicTo(22.519531f, 11.101562f, 20.101562f, 13.519531f, 20.101562f, 16.5f);
        path2.cubicTo(20.101562f, 18.378906f, 21.058594f, 20.035156f, 22.515625f, 21.0f);
        instancePath.lineTo(33.203125f, 21.0f);
        instancePath.lineTo(32.63672f, 17.109375f);
        instancePath.cubicTo(32.183594f, 13.996094f, 29.730469f, 11.609375f, 26.691406f, 11.171875f);
        instancePath.lineTo(26.183594f, 11.117188f);
        instancePath.close();
        instancePath.moveTo(46.5f, 11.101562f);
        instancePath.lineTo(46.3125f, 11.101562f);
        instancePath.cubicTo(42.992188f, 11.101562f, 40.148438f, 13.421875f, 39.44922f, 16.625f);
        instancePath.lineTo(39.36328f, 17.109375f);
        instancePath.lineTo(38.79297f, 21.0f);
        instancePath.lineTo(49.484375f, 21.0f);
        instancePath.cubicTo(50.82422f, 20.109375f, 51.746094f, 18.636719f, 51.882812f, 16.941406f);
        instancePath.lineTo(51.898438f, 16.5f);
        instancePath.cubicTo(51.898438f, 13.667969f, 49.71875f, 11.34375f, 46.941406f, 11.117188f);
        instancePath.close();
        instancePath.moveTo(46.5f, 11.101562f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
