package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_wxapp_more */
public class fts_wxapp_more extends C24542c {
    private final int height = 14;
    private final int width = 57;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 57;
        }
        if (i2 == 1) {
            return 14;
        }
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
            instancePaint3.setColor(-3684404);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -799.0f, 0.0f, 1.0f, -836.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 203.0f, 0.0f, 1.0f, 793.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 596.4823f, 0.0f, 1.0f, 43.304348f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.4615383f, 0.0f);
            Path path = instancePath;
            path.cubicTo(10.030148f, 0.0f, 12.923077f, 2.9101489f, 12.923077f, 6.5f);
            path.cubicTo(12.923077f, 10.089851f, 10.030148f, 13.0f, 6.4615383f, 13.0f);
            path.cubicTo(2.892929f, 13.0f, 0.0f, 10.089851f, 0.0f, 6.5f);
            path.cubicTo(0.0f, 2.9101489f, 2.892929f, 0.0f, 6.4615383f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(28.0f, 0.0f);
            Path path2 = instancePath2;
            path2.cubicTo(31.56861f, 0.0f, 34.46154f, 2.9101489f, 34.46154f, 6.5f);
            path2.cubicTo(34.46154f, 10.089851f, 31.56861f, 13.0f, 28.0f, 13.0f);
            path2.cubicTo(24.43139f, 13.0f, 21.538462f, 10.089851f, 21.538462f, 6.5f);
            path2.cubicTo(21.538462f, 2.9101489f, 24.43139f, 0.0f, 28.0f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(49.53846f, 0.0f);
            Path path3 = instancePath3;
            path3.cubicTo(53.10707f, 0.0f, 56.0f, 2.9101489f, 56.0f, 6.5f);
            path3.cubicTo(56.0f, 10.089851f, 53.10707f, 13.0f, 49.53846f, 13.0f);
            path3.cubicTo(45.96985f, 13.0f, 43.07692f, 10.089851f, 43.07692f, 6.5f);
            path3.cubicTo(43.07692f, 2.9101489f, 45.96985f, 0.0f, 49.53846f, 0.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
