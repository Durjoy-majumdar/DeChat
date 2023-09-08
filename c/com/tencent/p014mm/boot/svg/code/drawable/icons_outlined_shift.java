package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_shift */
public class icons_outlined_shift extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(18.0f, 6.0f);
                instancePath.lineTo(18.0f, 7.2003f);
                instancePath.lineTo(8.192f, 7.2f);
                instancePath.lineTo(17.924242f, 16.93516f);
                instancePath.lineTo(17.075714f, 17.7839f);
                instancePath.lineTo(7.198f, 7.903f);
                instancePath.lineTo(7.2f, 18.0f);
                instancePath.lineTo(6.0f, 18.0f);
                instancePath.lineTo(6.0f, 6.595082f);
                instancePath.lineTo(6.003f, 6.563f);
                instancePath.lineTo(6.007971f, 6.5028024f);
                instancePath.lineTo(6.031519f, 6.40699f);
                instancePath.cubicTo(6.041712f, 6.3774304f, 6.054218f, 6.3489013f, 6.0688024f, 6.3216076f);
                instancePath.lineTo(6.093588f, 6.2795477f);
                instancePath.cubicTo(6.200504f, 6.111543f, 6.3876815f, 6.0f, 6.595082f, 6.0f);
                instancePath.lineTo(18.0f, 6.0f);
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
