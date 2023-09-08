package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_comment */
public class icons_outlined_comment extends C24542c {
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
        instancePath.moveTo(31.508831f, 53.4f);
        instancePath.lineTo(61.5f, 53.4f);
        instancePath.cubicTo(61.997055f, 53.4f, 62.4f, 52.997055f, 62.4f, 52.5f);
        instancePath.lineTo(62.4f, 16.5f);
        instancePath.cubicTo(62.4f, 16.002943f, 61.997055f, 15.6f, 61.5f, 15.6f);
        instancePath.lineTo(10.5f, 15.6f);
        instancePath.cubicTo(10.002944f, 15.6f, 9.6f, 16.002943f, 9.6f, 16.5f);
        instancePath.lineTo(9.6f, 52.5f);
        instancePath.cubicTo(9.6f, 52.997055f, 10.002944f, 53.4f, 10.5f, 53.4f);
        instancePath.lineTo(24.6f, 53.4f);
        instancePath.lineTo(24.6f, 60.30883f);
        instancePath.lineTo(31.508831f, 53.4f);
        instancePath.close();
        instancePath.moveTo(33.0f, 57.0f);
        instancePath.lineTo(26.12132f, 63.87868f);
        Path path = instancePath;
        path.cubicTo(24.949747f, 65.050255f, 23.050253f, 65.050255f, 21.87868f, 63.87868f);
        path.cubicTo(21.31607f, 63.31607f, 21.0f, 62.55301f, 21.0f, 61.75736f);
        instancePath.lineTo(21.0f, 57.0f);
        instancePath.lineTo(10.5f, 57.0f);
        Path path2 = instancePath;
        path2.cubicTo(8.014719f, 57.0f, 6.0f, 54.985283f, 6.0f, 52.5f);
        instancePath.lineTo(6.0f, 16.5f);
        path2.cubicTo(6.0f, 14.014719f, 8.014719f, 12.0f, 10.5f, 12.0f);
        instancePath.lineTo(61.5f, 12.0f);
        path2.cubicTo(63.985283f, 12.0f, 66.0f, 14.014719f, 66.0f, 16.5f);
        instancePath.lineTo(66.0f, 52.5f);
        path2.cubicTo(66.0f, 54.985283f, 63.985283f, 57.0f, 61.5f, 57.0f);
        instancePath.lineTo(33.0f, 57.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
