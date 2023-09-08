package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_messenger */
public class bottomsheet_messenger extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = 144;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-9276814);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.316944f, 114.45962f);
                Path path = instancePath;
                path.cubicTo(17.49707f, 103.41242f, 8.0f, 86.3897f, 8.0f, 67.29348f);
                path.cubicTo(8.0f, 33.99431f, 36.877632f, 7.0f, 72.5f, 7.0f);
                path.cubicTo(108.12237f, 7.0f, 137.0f, 33.99431f, 137.0f, 67.29348f);
                path.cubicTo(137.0f, 100.59264f, 108.12237f, 127.58696f, 72.5f, 127.58696f);
                path.cubicTo(66.06798f, 127.58696f, 59.85585f, 126.70688f, 53.993908f, 125.06851f);
                instancePath.lineTo(32.316944f, 136.89055f);
                instancePath.lineTo(32.316944f, 114.45962f);
                instancePath.close();
                instancePath.moveTo(30.467037f, 88.38713f);
                instancePath.lineTo(66.017456f, 50.875744f);
                instancePath.lineTo(82.72663f, 68.6543f);
                instancePath.lineTo(114.75198f, 50.19022f);
                instancePath.lineTo(79.51087f, 88.32609f);
                instancePath.lineTo(63.189262f, 70.64465f);
                instancePath.lineTo(30.467037f, 88.38713f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
