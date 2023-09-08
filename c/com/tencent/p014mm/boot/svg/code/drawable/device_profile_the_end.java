package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.device_profile_the_end */
public class device_profile_the_end extends C24542c {
    private final int height = 8;
    private final int width = 242;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 242;
        }
        if (i2 == 1) {
            return 8;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1498304079);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(119.5f, 0.0f);
            Path path = instancePath;
            path.cubicTo(121.433f, 0.0f, 123.0f, 1.5670033f, 123.0f, 3.5f);
            path.cubicTo(123.0f, 5.4329967f, 121.433f, 7.0f, 119.5f, 7.0f);
            path.cubicTo(117.567f, 7.0f, 116.0f, 5.4329967f, 116.0f, 3.5f);
            path.cubicTo(116.0f, 1.5670033f, 117.567f, 0.0f, 119.5f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(-1716407887);
            instancePaint5.setStrokeCap(Paint.Cap.SQUARE);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(130.5f, 3.5f);
            instancePath2.lineTo(238.51852f, 3.5f);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint6.setColor(-1716407887);
            instancePaint6.setStrokeCap(Paint.Cap.SQUARE);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(0.5f, 3.5f);
            instancePath3.lineTo(108.51852f, 3.5f);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
