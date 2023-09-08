package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_copy */
public class bottomsheet_copy extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9276814);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(90.0f, 38.572f);
        instancePath.cubicTo(90.0f, 40.466f, 91.536f, 42.0f, 93.428f, 42.0f);
        instancePath.lineTo(122.0f, 42.0f);
        instancePath.lineTo(90.0f, 10.0f);
        instancePath.lineTo(90.0f, 38.572f);
        instancePath.lineTo(90.0f, 38.572f);
        instancePath.close();
        instancePath.moveTo(84.0f, 10.0f);
        instancePath.lineTo(40.0f, 10.0f);
        Path path = instancePath;
        path.cubicTo(36.686f, 10.0f, 34.0f, 12.686f, 34.0f, 16.0f);
        instancePath.lineTo(34.0f, 116.0f);
        path.cubicTo(34.0f, 119.314f, 36.686f, 122.0f, 40.0f, 122.0f);
        instancePath.lineTo(116.0f, 122.0f);
        path.cubicTo(119.314f, 122.0f, 122.0f, 119.314f, 122.0f, 116.0f);
        instancePath.lineTo(122.0f, 48.0f);
        instancePath.lineTo(90.0f, 48.0f);
        path.cubicTo(86.686f, 48.002f, 84.0f, 45.316f, 84.0f, 42.0f);
        instancePath.lineTo(84.0f, 10.0f);
        instancePath.close();
        instancePath.moveTo(28.0f, 34.0f);
        path.cubicTo(24.686f, 34.0f, 22.0f, 36.686f, 22.0f, 40.0f);
        instancePath.lineTo(22.0f, 128.0f);
        instancePath.cubicTo(22.0f, 131.314f, 24.686f, 134.0f, 28.0f, 134.0f);
        instancePath.lineTo(96.0f, 134.0f);
        Path path2 = instancePath;
        path2.cubicTo(99.314f, 134.0f, 102.0f, 131.314f, 102.0f, 128.0f);
        instancePath.lineTo(34.0f, 128.0f);
        path2.cubicTo(30.686f, 128.0f, 28.0f, 125.314f, 28.0f, 122.0f);
        instancePath.lineTo(28.0f, 34.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
