package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mosaic_selected */
public class mosaic_selected extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 63;
        }
        if (i2 != 2) {
            return 0;
        }
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(16777215);
        instancePaint5.setColor(-14624737);
        instancePaint5.setStrokeWidth(2.0f);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 1.5f);
        Path path = instancePath;
        path.cubicTo(0.0f, 0.6715728f, 0.6715728f, 0.0f, 1.5f, 0.0f);
        instancePath.lineTo(37.5f, 0.0f);
        path.cubicTo(38.328426f, 0.0f, 39.0f, 0.6715728f, 39.0f, 1.5f);
        instancePath.lineTo(39.0f, 37.5f);
        path.cubicTo(39.0f, 38.328426f, 38.328426f, 39.0f, 37.5f, 39.0f);
        instancePath.lineTo(1.5f, 39.0f);
        path.cubicTo(0.6715728f, 39.0f, 0.0f, 38.328426f, 0.0f, 37.5f);
        instancePath.lineTo(0.0f, 1.5f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-14624737);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(20.0f, 0.0f);
        instancePath2.lineTo(20.0f, 20.0f);
        instancePath2.lineTo(0.0f, 20.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-14624737);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(20.0f, 20.0f);
        instancePath3.lineTo(39.5f, 20.0f);
        instancePath3.lineTo(39.5f, 39.5f);
        instancePath3.lineTo(20.0f, 39.5f);
        instancePath3.lineTo(20.0f, 20.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
