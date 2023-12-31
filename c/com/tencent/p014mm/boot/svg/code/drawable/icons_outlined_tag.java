package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_tag */
public class icons_outlined_tag extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            instancePath.moveTo(9.621321f, 42.62132f);
            instancePath.cubicTo(8.449747f, 41.44975f, 8.449747f, 39.55025f, 9.621321f, 38.37868f);
            instancePath.lineTo(38.12132f, 9.878679f);
            instancePath.cubicTo(38.68393f, 9.316071f, 39.44699f, 9.0f, 40.24264f, 9.0f);
            instancePath.lineTo(60.0f, 9.0f);
            instancePath.cubicTo(61.656853f, 9.0f, 63.0f, 10.343145f, 63.0f, 12.0f);
            instancePath.lineTo(63.0f, 31.757359f);
            instancePath.cubicTo(63.0f, 32.55301f, 62.68393f, 33.31607f, 62.12132f, 33.87868f);
            instancePath.lineTo(33.62132f, 62.37868f);
            instancePath.cubicTo(32.44975f, 63.55025f, 30.550253f, 63.55025f, 29.37868f, 62.37868f);
            instancePath.lineTo(9.621321f, 42.62132f);
            instancePath.close();
            instancePath.moveTo(59.4f, 31.508831f);
            instancePath.lineTo(59.4f, 12.6f);
            instancePath.lineTo(40.49117f, 12.6f);
            instancePath.lineTo(12.591168f, 40.5f);
            instancePath.lineTo(31.5f, 59.408833f);
            instancePath.lineTo(59.4f, 31.508831f);
            instancePath.close();
            instancePath.moveTo(48.0f, 28.5f);
            Path path = instancePath;
            path.cubicTo(45.514717f, 28.5f, 43.5f, 26.485281f, 43.5f, 24.0f);
            path.cubicTo(43.5f, 21.514719f, 45.514717f, 19.5f, 48.0f, 19.5f);
            path.cubicTo(50.485283f, 19.5f, 52.5f, 21.514719f, 52.5f, 24.0f);
            path.cubicTo(52.5f, 26.485281f, 50.485283f, 28.5f, 48.0f, 28.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
