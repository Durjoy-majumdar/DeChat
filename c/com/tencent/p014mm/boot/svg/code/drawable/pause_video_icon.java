package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pause_video_icon */
public class pause_video_icon extends C24542c {
    private final int height = 10;
    private final int width = 9;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 9;
        }
        if (i2 == 1) {
            return 10;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -162.0f, 0.0f, 1.0f, -172.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 162.0f, 0.0f, 1.0f, 172.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 1.0f);
        instancePath.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
        instancePath.lineTo(2.0f, 0.0f);
        instancePath.cubicTo(2.5522847f, 0.0f, 3.0f, 0.44771522f, 3.0f, 1.0f);
        instancePath.lineTo(3.0f, 9.0f);
        Path path = instancePath;
        path.cubicTo(3.0f, 9.552285f, 2.5522847f, 10.0f, 2.0f, 10.0f);
        instancePath.lineTo(1.0f, 10.0f);
        path.cubicTo(0.44771522f, 10.0f, 0.0f, 9.552285f, 0.0f, 9.0f);
        instancePath.lineTo(0.0f, 1.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 1.0f);
        instancePath2.cubicTo(6.0f, 0.44771522f, 6.4477153f, 0.0f, 7.0f, 0.0f);
        instancePath2.lineTo(8.0f, 0.0f);
        Path path2 = instancePath2;
        path2.cubicTo(8.552285f, 0.0f, 9.0f, 0.44771522f, 9.0f, 1.0f);
        instancePath2.lineTo(9.0f, 9.0f);
        path2.cubicTo(9.0f, 9.552285f, 8.552285f, 10.0f, 8.0f, 10.0f);
        instancePath2.lineTo(7.0f, 10.0f);
        instancePath2.cubicTo(6.4477153f, 10.0f, 6.0f, 9.552285f, 6.0f, 9.0f);
        instancePath2.lineTo(6.0f, 1.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
