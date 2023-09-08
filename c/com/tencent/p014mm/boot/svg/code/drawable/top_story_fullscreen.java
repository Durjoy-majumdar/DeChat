package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.top_story_fullscreen */
public class top_story_fullscreen extends C24542c {
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
            canvas.saveLayerAlpha((RectF) null, 230, 31);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(1.3f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.0198066E-14f, 5.8581343f);
            instancePath.lineTo(3.0142555E-14f, 0.37615737f);
            instancePath.cubicTo(3.0122264E-14f, 0.21047194f, 0.13431458f, 0.07615736f, 0.3f, 0.07615736f);
            instancePath.lineTo(6.0260386f, 0.07615736f);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(3.0198066E-14f, 10.096506f);
            instancePath2.lineTo(3.0142555E-14f, 15.578483f);
            instancePath2.cubicTo(3.06779E-14f, 15.744168f, 0.13431458f, 15.878483f, 0.3f, 15.878483f);
            instancePath2.lineTo(6.0260386f, 15.878483f);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(15.876585f, 9.997669f);
            instancePath3.lineTo(15.876585f, 15.6773205f);
            instancePath3.cubicTo(15.876585f, 15.843005f, 15.74227f, 15.977321f, 15.576586f, 15.977321f);
            instancePath3.lineTo(9.850547f, 15.977321f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.save();
            Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(15.876585f, 5.9344497f);
            instancePath4.lineTo(15.876585f, 0.3f);
            instancePath4.cubicTo(15.876585f, 0.13431458f, 15.74227f, 7.796637E-15f, 15.576586f, 7.827072E-15f);
            instancePath4.lineTo(9.916438f, 7.1054274E-15f);
            canvas.drawPath(instancePath4, instancePaint8);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
