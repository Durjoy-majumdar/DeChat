package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bank_remit_success */
public class bank_remit_success extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = 120;
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
                instancePaint3.setColor(-16139513);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(115.8f, 60.68889f);
                Path path = instancePath;
                path.cubicTo(115.8f, 29.181868f, 90.81813f, 4.2f, 59.31111f, 4.2f);
                path.cubicTo(29.181868f, 4.2f, 4.2f, 29.181868f, 4.2f, 60.68889f);
                path.cubicTo(4.2f, 90.81813f, 29.181868f, 115.8f, 59.31111f, 115.8f);
                path.cubicTo(90.81813f, 115.8f, 115.8f, 90.81813f, 115.8f, 60.68889f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(32.582005f, 63.962925f);
                instancePath2.cubicTo(32.19982f, 63.567383f, 32.154182f, 62.887268f, 32.48211f, 62.44106f);
                instancePath2.lineTo(34.52614f, 59.65979f);
                instancePath2.cubicTo(34.853153f, 59.21483f, 35.480194f, 59.131527f, 35.906685f, 59.458405f);
                instancePath2.lineTo(50.22881f, 70.43549f);
                instancePath2.cubicTo(50.66425f, 70.76923f, 51.36269f, 70.752f, 51.77925f, 70.40497f);
                instancePath2.lineTo(87.55628f, 40.59981f);
                instancePath2.cubicTo(87.97712f, 40.249214f, 88.639626f, 40.282352f, 89.03474f, 40.672565f);
                instancePath2.lineTo(90.83008f, 42.44564f);
                instancePath2.cubicTo(91.22577f, 42.836422f, 91.23205f, 43.46271f, 90.83447f, 43.85398f);
                instancePath2.lineTo(51.728115f, 82.340485f);
                instancePath2.cubicTo(51.334854f, 82.72751f, 50.700047f, 82.714195f, 50.32405f, 82.325066f);
                instancePath2.lineTo(32.582005f, 63.962925f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
