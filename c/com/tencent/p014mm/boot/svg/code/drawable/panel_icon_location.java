package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_location */
public class panel_icon_location extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 192;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                Matrix instanceMatrix = C24542c.instanceMatrix(looper);
                float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(45.781845f, 85.01546f);
                Path path = instancePath;
                path.cubicTo(45.781845f, 85.01546f, 18.0f, 61.568542f, 18.0f, 39.0f);
                path.cubicTo(18.0f, 22.431458f, 31.431458f, 9.0f, 48.0f, 9.0f);
                path.cubicTo(64.56854f, 9.0f, 78.0f, 22.431458f, 78.0f, 39.0f);
                path.cubicTo(78.0f, 61.568542f, 50.230366f, 85.00419f, 50.230366f, 85.00419f);
                path.cubicTo(49.015343f, 86.10895f, 47.006897f, 86.11149f, 45.781845f, 85.01546f);
                instancePath.close();
                instancePath.moveTo(48.0f, 51.0f);
                Path path2 = instancePath;
                path2.cubicTo(54.62742f, 51.0f, 60.0f, 45.62742f, 60.0f, 39.0f);
                path2.cubicTo(60.0f, 32.37258f, 54.62742f, 27.0f, 48.0f, 27.0f);
                path2.cubicTo(41.37258f, 27.0f, 36.0f, 32.37258f, 36.0f, 39.0f);
                path2.cubicTo(36.0f, 45.62742f, 41.37258f, 51.0f, 48.0f, 51.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
