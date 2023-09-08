package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.recharge_icon_clicked */
public class recharge_icon_clicked extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = 64;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-12082593);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 64.0f);
                Path path = instancePath;
                path.cubicTo(49.67311f, 64.0f, 64.0f, 49.67311f, 64.0f, 32.0f);
                path.cubicTo(64.0f, 14.326888f, 49.67311f, 0.0f, 32.0f, 0.0f);
                path.cubicTo(14.326888f, 0.0f, 0.0f, 14.326888f, 0.0f, 32.0f);
                path.cubicTo(0.0f, 49.67311f, 14.326888f, 64.0f, 32.0f, 64.0f);
                instancePath.lineTo(32.0f, 64.0f);
                instancePath.close();
                instancePath.moveTo(3.0553617f, 31.019482f);
                path.cubicTo(2.559515f, 38.25722f, 5.4354253f, 45.386047f, 10.036881f, 50.881187f);
                path.cubicTo(14.08299f, 46.57419f, 20.043064f, 45.029606f, 24.71394f, 41.613712f);
                path.cubicTo(26.132061f, 40.73251f, 26.608074f, 38.811687f, 25.626297f, 37.415623f);
                path.cubicTo(23.623077f, 34.207653f, 20.757084f, 31.088789f, 21.104177f, 27.009516f);
                path.cubicTo(20.63808f, 20.05891f, 27.689018f, 13.524151f, 34.63087f, 15.623195f);
                path.cubicTo(41.850395f, 17.46481f, 45.093235f, 26.979813f, 41.13638f, 33.078922f);
                path.cubicTo(39.926514f, 35.42549f, 37.06052f, 37.47503f, 38.012543f, 40.415672f);
                path.cubicTo(42.495f, 45.019707f, 49.63519f, 46.00982f, 53.849884f, 51.0f);
                path.cubicTo(60.008297f, 43.910778f, 62.497448f, 33.890816f, 60.09755f, 24.80156f);
                path.cubicTo(57.16214f, 13.048896f, 46.14443f, 3.652706f, 33.9466f, 3.127945f);
                path.cubicTo(18.21835f, 1.5239588f, 3.015694f, 15.23705f, 3.0553617f, 31.019482f);
                instancePath.lineTo(3.0553617f, 31.019482f);
                instancePath.lineTo(3.0553617f, 31.019482f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
