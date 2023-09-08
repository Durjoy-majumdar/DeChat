package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_previous */
public class icons_outlined_previous extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(31.322699f, 25.5f);
        instancePath.lineTo(38.61396f, 32.791264f);
        instancePath.lineTo(35.43198f, 35.973244f);
        instancePath.lineTo(25.88604f, 26.427301f);
        instancePath.lineTo(23.764719f, 24.305983f);
        instancePath.cubicTo(23.178932f, 23.720196f, 23.178932f, 22.770449f, 23.764719f, 22.184662f);
        instancePath.lineTo(35.43198f, 10.5174f);
        instancePath.lineTo(38.61396f, 13.69938f);
        instancePath.lineTo(31.313341f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        Path path = instancePath;
        path.cubicTo(54.941124f, 21.0f, 63.0f, 29.058874f, 63.0f, 39.0f);
        path.cubicTo(63.0f, 48.941124f, 54.941124f, 57.0f, 45.0f, 57.0f);
        instancePath.lineTo(12.0f, 57.0f);
        instancePath.lineTo(12.0f, 52.5f);
        instancePath.lineTo(45.0f, 52.5f);
        Path path2 = instancePath;
        path2.cubicTo(52.455845f, 52.5f, 58.5f, 46.455845f, 58.5f, 39.0f);
        path2.cubicTo(58.5f, 31.544155f, 52.455845f, 25.5f, 45.0f, 25.5f);
        instancePath.lineTo(31.322699f, 25.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
