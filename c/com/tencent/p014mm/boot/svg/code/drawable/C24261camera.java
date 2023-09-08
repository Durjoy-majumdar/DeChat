package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.camera */
public class C24261camera extends C24542c {
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
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.001331f, 33.0f);
        instancePath.cubicTo(17.239172f, 33.0f, 15.0f, 35.236286f, 15.0f, 38.00532f);
        instancePath.lineTo(15.0f, 67.994675f);
        instancePath.cubicTo(15.0f, 70.75904f, 17.233757f, 73.0f, 20.001331f, 73.0f);
        instancePath.lineTo(75.998665f, 73.0f);
        instancePath.cubicTo(78.760826f, 73.0f, 81.0f, 70.76372f, 81.0f, 67.994675f);
        instancePath.lineTo(81.0f, 38.00532f);
        instancePath.cubicTo(81.0f, 35.24096f, 78.76624f, 33.0f, 75.998665f, 33.0f);
        instancePath.lineTo(20.001331f, 33.0f);
        instancePath.close();
        instancePath.moveTo(41.230534f, 24.0f);
        instancePath.lineTo(48.0f, 24.0f);
        instancePath.lineTo(48.0f, 33.0f);
        instancePath.lineTo(27.74054f, 33.0f);
        Path path = instancePath;
        path.cubicTo(33.113003f, 33.0f, 35.999054f, 24.0f, 41.230534f, 24.0f);
        instancePath.close();
        instancePath.moveTo(68.25946f, 33.0f);
        path.cubicTo(62.886997f, 33.0f, 60.000946f, 24.0f, 54.7683f, 24.0f);
        instancePath.lineTo(48.0f, 24.0f);
        instancePath.lineTo(48.0f, 33.0f);
        instancePath.lineTo(68.25946f, 33.0f);
        instancePath.close();
        instancePath.moveTo(48.0f, 36.0f);
        path.cubicTo(56.83692f, 36.0f, 64.0f, 43.16308f, 64.0f, 52.0f);
        path.cubicTo(64.0f, 60.83692f, 56.83692f, 68.0f, 48.0f, 68.0f);
        path.cubicTo(39.16308f, 68.0f, 32.0f, 60.83692f, 32.0f, 52.0f);
        path.cubicTo(32.0f, 43.16308f, 39.16308f, 36.0f, 48.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(58.0f, 52.0f);
        Path path2 = instancePath;
        path2.cubicTo(58.0f, 57.523f, 53.523f, 62.0f, 48.0f, 62.0f);
        path2.cubicTo(42.477f, 62.0f, 38.0f, 57.523f, 38.0f, 52.0f);
        path2.cubicTo(38.0f, 46.477f, 42.477f, 42.0f, 48.0f, 42.0f);
        path2.cubicTo(53.523f, 42.0f, 58.0f, 46.477f, 58.0f, 52.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 27.0f);
        instancePath.lineTo(27.0f, 27.0f);
        instancePath.lineTo(27.0f, 30.0f);
        instancePath.lineTo(18.0f, 30.0f);
        instancePath.lineTo(18.0f, 27.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
