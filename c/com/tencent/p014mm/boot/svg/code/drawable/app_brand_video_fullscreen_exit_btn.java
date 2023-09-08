package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_fullscreen_exit_btn */
public class app_brand_video_fullscreen_exit_btn extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -330.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 330.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(12.0f, 0.0f);
        instancePath2.lineTo(12.0f, 5.3816547f);
        instancePath2.cubicTo(12.0f, 5.54734f, 12.134315f, 5.6816545f, 12.3f, 5.6816545f);
        instancePath2.lineTo(17.964392f, 5.6816545f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 29.681654f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(12.0f, 12.0f);
        instancePath3.lineTo(12.0f, 17.381655f);
        instancePath3.cubicTo(12.0f, 17.54734f, 12.134315f, 17.681654f, 12.3f, 17.681654f);
        instancePath3.lineTo(17.964392f, 17.681654f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(5.964391f, 17.681654f);
        instancePath4.lineTo(5.964391f, 12.3f);
        instancePath4.cubicTo(5.964391f, 12.134315f, 5.8300767f, 12.0f, 5.6643915f, 12.0f);
        instancePath4.lineTo(0.0f, 12.0f);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(5.9643393f, 0.010877698f);
        instancePath5.lineTo(5.9643393f, 5.3925323f);
        instancePath5.cubicTo(5.9643393f, 5.558218f, 5.8300247f, 5.6925325f, 5.664339f, 5.6925325f);
        instancePath5.lineTo(-5.2173913E-5f, 5.6925325f);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
