package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_txt */
public class file_float_ball_icon_txt extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
            instancePaint3.setColor(-12566464);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(48.0f, 0.0f);
            instancePath.lineTo(48.0f, 48.0f);
            instancePath.lineTo(0.0f, 48.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-12566464);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(24.0f, 0.0f);
            Path path = instancePath2;
            path.cubicTo(37.254837f, 0.0f, 48.0f, 10.745165f, 48.0f, 24.0f);
            path.cubicTo(48.0f, 37.254837f, 37.254837f, 48.0f, 24.0f, 48.0f);
            path.cubicTo(10.745165f, 48.0f, 0.0f, 37.254837f, 0.0f, 24.0f);
            path.cubicTo(0.0f, 10.745165f, 10.745165f, 0.0f, 24.0f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(0.0f, 0.0f);
            instancePath3.lineTo(20.0f, 0.0f);
            instancePath3.lineTo(20.0f, 2.0f);
            instancePath3.lineTo(0.0f, 2.0f);
            instancePath3.lineTo(0.0f, 0.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.save();
            Paint instancePaint8 = C24542c.instancePaint(instancePaint6, looper);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(0.0f, 7.0f);
            instancePath4.lineTo(20.0f, 7.0f);
            instancePath4.lineTo(20.0f, 9.0f);
            instancePath4.lineTo(0.0f, 9.0f);
            instancePath4.lineTo(0.0f, 7.0f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint8);
            canvas.restore();
            canvas.save();
            Paint instancePaint9 = C24542c.instancePaint(instancePaint6, looper);
            Path instancePath5 = C24542c.instancePath(looper);
            instancePath5.moveTo(0.0f, 14.0f);
            instancePath5.lineTo(11.0f, 14.0f);
            instancePath5.lineTo(11.0f, 16.0f);
            instancePath5.lineTo(0.0f, 16.0f);
            instancePath5.lineTo(0.0f, 14.0f);
            instancePath5.close();
            canvas.drawPath(instancePath5, instancePaint9);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
