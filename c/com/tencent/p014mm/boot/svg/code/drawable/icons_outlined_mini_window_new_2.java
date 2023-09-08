package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mini_window_new_2 */
public class icons_outlined_mini_window_new_2 extends C24542c {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(4.5f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.2f, 39.0f);
        instancePath2.lineTo(3.0f, 39.0f);
        Path path = instancePath2;
        path.cubicTo(1.3431457f, 39.0f, 1.0910845E-15f, 37.656853f, 0.0f, 36.0f);
        instancePath2.lineTo(0.0f, 3.0f);
        path.cubicTo(2.4118308E-16f, 1.3431457f, 1.3431457f, -2.360176E-15f, 3.0f, 0.0f);
        instancePath2.lineTo(36.0f, 0.0f);
        path.cubicTo(37.656853f, -3.043592E-16f, 39.0f, 1.3431457f, 39.0f, 3.0f);
        instancePath2.lineTo(39.0f, 16.2f);
        instancePath2.lineTo(39.0f, 16.2f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(44.04045f, 24.0f);
        instancePath3.lineTo(40.0809f, 24.0f);
        instancePath3.lineTo(28.5f, 24.0f);
        Path path2 = instancePath3;
        path2.cubicTo(26.014719f, 24.0f, 24.0f, 26.014719f, 24.0f, 28.5f);
        instancePath3.lineTo(24.0f, 43.5f);
        path2.cubicTo(24.0f, 45.985283f, 26.014719f, 48.0f, 28.5f, 48.0f);
        instancePath3.lineTo(43.5f, 48.0f);
        path2.cubicTo(45.985283f, 48.0f, 48.0f, 45.985283f, 48.0f, 43.5f);
        instancePath3.lineTo(48.0f, 27.95955f);
        instancePath3.cubicTo(48.0f, 25.77275f, 46.22725f, 24.0f, 44.04045f, 24.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
