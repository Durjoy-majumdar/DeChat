package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_pay_mother_card_input_icon */
public class honey_pay_mother_card_input_icon extends C24542c {
    private final int height = 120;
    private final int width = 140;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 140;
        }
        if (i == 1) {
            return 120;
        }
        if (i == 2) {
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
            instancePaint3.setStrokeCap(Paint.Cap.ROUND);
            instancePaint3.setStrokeJoin(Paint.Join.MITER);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-25290);
            instancePaint4.setStrokeWidth(2.0f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(24.0f, 42.220886f);
            Path path = instancePath;
            path.cubicTo(37.25718f, 26.622805f, 49.25718f, 25.956137f, 60.0f, 40.220886f);
            path.cubicTo(70.74282f, 54.485634f, 82.74282f, 55.152298f, 96.0f, 42.220886f);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(24.0f, 62.220886f);
            Path path2 = instancePath2;
            path2.cubicTo(37.25718f, 46.622803f, 49.25718f, 45.95614f, 60.0f, 60.220886f);
            path2.cubicTo(70.74282f, 74.485634f, 82.74282f, 75.1523f, 96.0f, 62.220886f);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(24.0f, 82.22089f);
            Path path3 = instancePath3;
            path3.cubicTo(37.25718f, 66.6228f, 49.25718f, 65.95614f, 60.0f, 80.22089f);
            path3.cubicTo(70.74282f, 94.485634f, 82.74282f, 95.1523f, 96.0f, 82.22089f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
