package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_mute_btn_on */
public class app_brand_video_mute_btn_on extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -222.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 222.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(1.5f);
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.75f, 5.266332f);
            instancePath2.lineTo(0.75f, 12.733709f);
            instancePath2.lineTo(5.1924944f, 12.733709f);
            instancePath2.lineTo(11.25f, 17.016748f);
            instancePath2.lineTo(11.25f, 0.9832927f);
            instancePath2.lineTo(5.1924944f, 5.266332f);
            instancePath2.lineTo(0.75f, 5.266332f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            instancePaint6.setStrokeCap(Paint.Cap.SQUARE);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(16.0f, 5.0f);
            Path path = instancePath3;
            path.cubicTo(17.8f, 5.857143f, 18.7f, 7.357143f, 18.7f, 9.5f);
            path.cubicTo(18.7f, 11.642858f, 17.8f, 13.142858f, 16.0f, 14.0f);
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
