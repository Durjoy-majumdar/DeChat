package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_comment */
public class finder_full_comment extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(34.5f, 54.0f);
                instancePath.lineTo(27.62132f, 60.87f);
                Path path = instancePath;
                path.cubicTo(26.449747f, 62.041573f, 24.550253f, 62.041573f, 23.37868f, 60.87f);
                path.cubicTo(22.81607f, 60.307392f, 22.5f, 59.56565f, 22.5f, 58.77f);
                instancePath.lineTo(22.5f, 54.0f);
                instancePath.lineTo(15.0f, 54.0f);
                instancePath.cubicTo(10.857864f, 54.0f, 7.5f, 50.642136f, 7.5f, 46.5f);
                instancePath.lineTo(7.5f, 21.0f);
                instancePath.cubicTo(7.5f, 16.857864f, 10.857864f, 13.5f, 15.0f, 13.5f);
                instancePath.lineTo(57.0f, 13.5f);
                instancePath.cubicTo(61.142136f, 13.5f, 64.5f, 16.857864f, 64.5f, 21.0f);
                instancePath.lineTo(64.5f, 46.5f);
                instancePath.cubicTo(64.5f, 50.642136f, 61.142136f, 54.0f, 57.0f, 54.0f);
                instancePath.lineTo(34.5f, 54.0f);
                instancePath.lineTo(34.5f, 54.0f);
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
