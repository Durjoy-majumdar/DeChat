package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tips_background */
public class tips_background extends C24542c {
    private final int height = 101;
    private final int width = 200;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 200;
        }
        if (i2 == 1) {
            return 101;
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint5.setColor(436207616);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -192.0f, 0.0f, 1.0f, -236.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(192.5f, 244.5f);
            instancePath.cubicTo(192.5f, 240.08173f, 196.08173f, 236.5f, 200.5f, 236.5f);
            instancePath.lineTo(383.5f, 236.5f);
            instancePath.cubicTo(387.91827f, 236.5f, 391.5f, 240.08173f, 391.5f, 244.5f);
            instancePath.lineTo(391.5f, 328.5f);
            instancePath.cubicTo(391.5f, 332.91827f, 387.91827f, 336.5f, 383.5f, 336.5f);
            instancePath.lineTo(200.5f, 336.5f);
            instancePath.cubicTo(196.08173f, 336.5f, 192.5f, 332.91827f, 192.5f, 328.5f);
            instancePath.lineTo(192.5f, 244.5f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint6);
            canvas.drawPath(instancePath, instancePaint7);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
