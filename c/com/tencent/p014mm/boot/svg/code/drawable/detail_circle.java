package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.detail_circle */
public class detail_circle extends C24542c {
    private final int height = 100;
    private final int width = 100;

    public int doCommand(int i, Object... objArr) {
        int i2 = 100;
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
                instancePaint3.setColor(-10329502);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(50.0f, 98.0f);
                Path path = instancePath;
                path.cubicTo(76.50967f, 98.0f, 98.0f, 76.50967f, 98.0f, 50.0f);
                path.cubicTo(98.0f, 23.490332f, 76.50967f, 2.0f, 50.0f, 2.0f);
                path.cubicTo(23.490332f, 2.0f, 2.0f, 23.490332f, 2.0f, 50.0f);
                path.cubicTo(2.0f, 76.50967f, 23.490332f, 98.0f, 50.0f, 98.0f);
                instancePath.close();
                instancePath.moveTo(50.0f, 94.0f);
                Path path2 = instancePath;
                path2.cubicTo(74.30053f, 94.0f, 94.0f, 74.30053f, 94.0f, 50.0f);
                path2.cubicTo(94.0f, 25.69947f, 74.30053f, 6.0f, 50.0f, 6.0f);
                path2.cubicTo(25.69947f, 6.0f, 6.0f, 25.69947f, 6.0f, 50.0f);
                path2.cubicTo(6.0f, 74.30053f, 25.69947f, 94.0f, 50.0f, 94.0f);
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
