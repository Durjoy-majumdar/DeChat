package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.net_warn_icon */
public class net_warn_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                instancePaint3.setColor(-16896);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.2080674f, 81.84925f);
                instancePath.cubicTo(3.9541583f, 83.99987f, 4.9507284f, 85.7433f, 7.4474754f, 85.7433f);
                instancePath.lineTo(88.74638f, 85.7433f);
                instancePath.cubicTo(91.23708f, 85.7433f, 92.23893f, 83.99854f, 90.985794f, 81.84925f);
                instancePath.lineTo(50.367332f, 12.183118f);
                Path path = instancePath;
                path.cubicTo(49.113426f, 10.032495f, 47.07966f, 10.033827f, 45.826527f, 12.183118f);
                instancePath.lineTo(5.2080674f, 81.84925f);
                instancePath.close();
                instancePath.moveTo(45.896564f, 36.946117f);
                path.cubicTo(45.070587f, 36.946117f, 44.432064f, 37.61737f, 44.470753f, 38.453403f);
                instancePath.lineTo(45.63274f, 63.56276f);
                instancePath.lineTo(50.5597f, 63.56276f);
                instancePath.lineTo(51.721687f, 38.453403f);
                instancePath.cubicTo(51.760212f, 37.620953f, 51.122555f, 36.946117f, 50.295876f, 36.946117f);
                instancePath.lineTo(45.896564f, 36.946117f);
                instancePath.close();
                instancePath.moveTo(48.096222f, 75.39238f);
                Path path2 = instancePath;
                path2.cubicTo(50.137035f, 75.39238f, 51.791443f, 73.73729f, 51.791443f, 71.695625f);
                path2.cubicTo(51.791443f, 69.65396f, 50.137035f, 67.99887f, 48.096222f, 67.99887f);
                path2.cubicTo(46.055405f, 67.99887f, 44.401f, 69.65396f, 44.401f, 71.695625f);
                path2.cubicTo(44.401f, 73.73729f, 46.055405f, 75.39238f, 48.096222f, 75.39238f);
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
