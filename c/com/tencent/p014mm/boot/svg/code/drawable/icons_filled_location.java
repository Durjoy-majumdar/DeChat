package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_location */
public class icons_filled_location extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(33.785156f, 66.40343f);
                Path path = instancePath;
                path.cubicTo(33.785156f, 66.40343f, 12.0f, 48.054832f, 12.0f, 30.0f);
                path.cubicTo(12.0f, 16.745167f, 22.745167f, 6.0f, 36.0f, 6.0f);
                path.cubicTo(49.254833f, 6.0f, 60.0f, 16.745167f, 60.0f, 30.0f);
                path.cubicTo(60.0f, 48.054832f, 38.225567f, 66.39341f, 38.225567f, 66.39341f);
                path.cubicTo(37.000694f, 67.51806f, 35.00838f, 67.5061f, 33.785156f, 66.40343f);
                instancePath.close();
                instancePath.moveTo(36.0f, 40.5f);
                Path path2 = instancePath;
                path2.cubicTo(41.79899f, 40.5f, 46.5f, 35.79899f, 46.5f, 30.0f);
                path2.cubicTo(46.5f, 24.20101f, 41.79899f, 19.5f, 36.0f, 19.5f);
                path2.cubicTo(30.20101f, 19.5f, 25.5f, 24.20101f, 25.5f, 30.0f);
                path2.cubicTo(25.5f, 35.79899f, 30.20101f, 40.5f, 36.0f, 40.5f);
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
