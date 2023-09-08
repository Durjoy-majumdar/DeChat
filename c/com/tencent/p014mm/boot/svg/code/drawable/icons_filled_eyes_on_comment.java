package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eyes_on_comment */
public class icons_filled_eyes_on_comment extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 5.0f);
                Path path = instancePath;
                path.cubicTo(16.807985f, 5.0f, 20.972399f, 7.847857f, 23.000246f, 12.000502f);
                path.cubicTo(20.971735f, 16.152597f, 16.807602f, 19.0f, 12.0f, 19.0f);
                path.cubicTo(7.192399f, 19.0f, 3.0282645f, 16.152597f, 1.0002397f, 12.000491f);
                path.cubicTo(3.0276008f, 7.847857f, 7.1920156f, 5.0f, 12.0f, 5.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 8.5f);
                Path path2 = instancePath;
                path2.cubicTo(10.067003f, 8.5f, 8.5f, 10.067003f, 8.5f, 12.0f);
                path2.cubicTo(8.5f, 13.932997f, 10.067003f, 15.5f, 12.0f, 15.5f);
                path2.cubicTo(13.932997f, 15.5f, 15.5f, 13.932997f, 15.5f, 12.0f);
                path2.cubicTo(15.5f, 10.067003f, 13.932997f, 8.5f, 12.0f, 8.5f);
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
