package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_previous */
public class icons_filled_previous extends C24542c {
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
        instancePath.moveTo(31.757359f, 27.0f);
        instancePath.lineTo(37.24264f, 32.485283f);
        instancePath.lineTo(33.0f, 36.72792f);
        instancePath.lineTo(24.514719f, 28.242641f);
        instancePath.lineTo(22.393398f, 26.12132f);
        instancePath.cubicTo(21.221825f, 24.949747f, 21.221825f, 23.050253f, 22.393398f, 21.87868f);
        instancePath.lineTo(33.0f, 11.272078f);
        instancePath.lineTo(37.24264f, 15.514719f);
        instancePath.lineTo(31.757359f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        Path path = instancePath;
        path.cubicTo(54.941124f, 21.0f, 63.0f, 29.058874f, 63.0f, 39.0f);
        path.cubicTo(63.0f, 48.941124f, 54.941124f, 57.0f, 45.0f, 57.0f);
        instancePath.lineTo(12.0f, 57.0f);
        instancePath.lineTo(12.0f, 51.0f);
        instancePath.lineTo(45.0f, 51.0f);
        Path path2 = instancePath;
        path2.cubicTo(51.62742f, 51.0f, 57.0f, 45.62742f, 57.0f, 39.0f);
        path2.cubicTo(57.0f, 32.37258f, 51.62742f, 27.0f, 45.0f, 27.0f);
        instancePath.lineTo(31.757359f, 27.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
