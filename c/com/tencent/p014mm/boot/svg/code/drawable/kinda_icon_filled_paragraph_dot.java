package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icon_filled_paragraph_dot */
public class kinda_icon_filled_paragraph_dot extends C24542c {
    private final int height = 4;
    private final int width = 4;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 4;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.6666667f, 0.0f, 0.0f, 0.0f, 0.6666667f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-436207616);
        instancePaint4.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.0f, 1.0f);
        Path path = instancePath;
        path.cubicTo(4.1045694f, 1.0f, 5.0f, 1.8954304f, 5.0f, 3.0f);
        path.cubicTo(5.0f, 4.1045694f, 4.1045694f, 5.0f, 3.0f, 5.0f);
        path.cubicTo(1.8954304f, 5.0f, 1.0f, 4.1045694f, 1.0f, 3.0f);
        path.cubicTo(1.0f, 1.8954304f, 1.8954304f, 1.0f, 3.0f, 1.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
