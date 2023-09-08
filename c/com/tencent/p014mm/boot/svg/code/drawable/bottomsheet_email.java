package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_email */
public class bottomsheet_email extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 144;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-9276814);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(8.0f, 32.0f);
                instancePath.cubicTo(8.0f, 28.68629f, 10.686291f, 26.0f, 14.0f, 26.0f);
                instancePath.lineTo(130.0f, 26.0f);
                instancePath.cubicTo(133.3137f, 26.0f, 136.0f, 28.68629f, 136.0f, 32.0f);
                instancePath.lineTo(136.0f, 112.0f);
                instancePath.cubicTo(136.0f, 115.313705f, 133.3137f, 118.0f, 130.0f, 118.0f);
                instancePath.lineTo(14.0f, 118.0f);
                instancePath.cubicTo(10.686291f, 118.0f, 8.0f, 115.313705f, 8.0f, 112.0f);
                instancePath.lineTo(8.0f, 32.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(71.88509f, 65.0309f);
                instancePath2.lineTo(27.494259f, 39.401836f);
                instancePath2.cubicTo(26.058262f, 38.57276f, 24.230272f, 39.068474f, 23.401754f, 40.50351f);
                instancePath2.lineTo(21.402084f, 43.967037f);
                instancePath2.cubicTo(20.576242f, 45.39744f, 21.06255f, 47.23549f, 22.494259f, 48.062088f);
                instancePath2.lineTo(70.312874f, 75.67018f);
                Path path = instancePath2;
                path.cubicTo(70.809265f, 75.95677f, 71.3525f, 76.08506f, 71.88509f, 76.07097f);
                path.cubicTo(72.417694f, 76.08506f, 72.96093f, 75.95677f, 73.45732f, 75.67018f);
                instancePath2.lineTo(121.27593f, 48.062088f);
                instancePath2.cubicTo(122.70764f, 47.23549f, 123.19395f, 45.39744f, 122.36811f, 43.967037f);
                instancePath2.lineTo(120.36844f, 40.50351f);
                instancePath2.cubicTo(119.53992f, 39.068474f, 117.71193f, 38.57276f, 116.27593f, 39.401836f);
                instancePath2.lineTo(71.88509f, 65.0309f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
