package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_multitask */
public class icons_outlined_multitask extends C24542c {
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(49.5f, 30.0f);
                Path path = instancePath;
                path.cubicTo(52.81371f, 30.0f, 55.5f, 32.68629f, 55.5f, 36.0f);
                path.cubicTo(55.5f, 39.31371f, 52.81371f, 42.0f, 49.5f, 42.0f);
                path.cubicTo(46.18629f, 42.0f, 43.5f, 39.31371f, 43.5f, 36.0f);
                path.cubicTo(43.5f, 32.68629f, 46.18629f, 30.0f, 49.5f, 30.0f);
                instancePath.close();
                instancePath.moveTo(22.5f, 30.0f);
                Path path2 = instancePath;
                path2.cubicTo(25.81371f, 30.0f, 28.5f, 32.68629f, 28.5f, 36.0f);
                path2.cubicTo(28.5f, 39.31371f, 25.81371f, 42.0f, 22.5f, 42.0f);
                path2.cubicTo(19.18629f, 42.0f, 16.5f, 39.31371f, 16.5f, 36.0f);
                path2.cubicTo(16.5f, 32.68629f, 19.18629f, 30.0f, 22.5f, 30.0f);
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