package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_volume_off */
public class top_story_volume_off extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(3.6f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            instancePaint5.setStrokeCap(Paint.Cap.SQUARE);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(1.5f, 1.2857143f);
            instancePath.lineTo(16.5f, 16.714285f);
            canvas.drawPath(instancePath, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(1.5f, 1.2857143f);
            instancePath2.lineTo(16.5f, 16.714285f);
            canvas.drawPath(instancePath2, instancePaint7);
            canvas.restore();
            canvas.restore();
            canvas.save();
            Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(1.8f, 15.3f);
            instancePath3.lineTo(1.8f, 36.0f);
            instancePath3.lineTo(14.15169f, 36.0f);
            instancePath3.lineTo(27.9f, 47.456924f);
            instancePath3.lineTo(27.9f, 3.8430748f);
            instancePath3.lineTo(14.15169f, 15.3f);
            instancePath3.lineTo(1.8f, 15.3f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint8);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
