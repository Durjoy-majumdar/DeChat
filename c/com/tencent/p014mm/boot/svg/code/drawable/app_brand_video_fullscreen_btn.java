package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_fullscreen_btn */
public class app_brand_video_fullscreen_btn extends C24542c {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -276.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 276.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
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
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.saveLayerAlpha((RectF) null, 230, 31);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 5.8581343f);
            instancePath2.lineTo(-5.551115E-17f, 0.37615737f);
            instancePath2.cubicTo(-7.5801766E-17f, 0.21047194f, 0.13431458f, 0.07615736f, 0.3f, 0.07615736f);
            instancePath2.lineTo(6.0260386f, 0.07615736f);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(0.0f, 10.096506f);
            instancePath3.lineTo(-5.551115E-17f, 15.578483f);
            instancePath3.cubicTo(4.798332E-16f, 15.744168f, 0.13431458f, 15.878483f, 0.3f, 15.878483f);
            instancePath3.lineTo(6.0260386f, 15.878483f);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(15.876585f, 9.997669f);
            instancePath4.lineTo(15.876585f, 15.6773205f);
            instancePath4.cubicTo(15.876585f, 15.843005f, 15.74227f, 15.977321f, 15.576586f, 15.977321f);
            instancePath4.lineTo(9.850547f, 15.977321f);
            canvas.drawPath(instancePath4, instancePaint7);
            canvas.restore();
            canvas.save();
            Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath5 = C24542c.instancePath(looper);
            instancePath5.moveTo(15.876585f, 5.9344497f);
            instancePath5.lineTo(15.876585f, 0.3f);
            instancePath5.cubicTo(15.876585f, 0.13431458f, 15.74227f, 6.9120906E-16f, 15.576586f, 7.2164497E-16f);
            instancePath5.lineTo(9.916438f, 0.0f);
            canvas.drawPath(instancePath5, instancePaint8);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
