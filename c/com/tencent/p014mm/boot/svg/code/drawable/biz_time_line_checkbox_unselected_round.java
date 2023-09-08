package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_time_line_checkbox_unselected_round */
public class biz_time_line_checkbox_unselected_round extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(16777215);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(15.522848f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        path.cubicTo(20.0f, 15.522848f, 15.522848f, 20.0f, 10.0f, 20.0f);
        path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522848f, 0.0f, 10.0f);
        path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.0f, 19.4f);
        Path path2 = instancePath2;
        path2.cubicTo(15.191477f, 19.4f, 19.4f, 15.191477f, 19.4f, 10.0f);
        path2.cubicTo(19.4f, 4.808523f, 15.191477f, 0.6f, 10.0f, 0.6f);
        path2.cubicTo(4.808523f, 0.6f, 0.6f, 4.808523f, 0.6f, 10.0f);
        path2.cubicTo(0.6f, 15.191477f, 4.808523f, 19.4f, 10.0f, 19.4f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint5, looper));
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
