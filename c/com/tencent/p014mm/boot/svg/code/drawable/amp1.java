package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.amp1 */
public class amp1 extends C24542c {
    private final int height = 51;
    private final int width = 34;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 34;
        }
        if (i2 == 1) {
            return 51;
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
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -50.0f, 0.0f, 1.0f, -50.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 50.666668f, 0.0f, 1.0f, 50.25f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 46.666668f);
        instancePath.lineTo(10.0f, 46.666668f);
        instancePath.lineTo(10.0f, 50.0f);
        instancePath.lineTo(0.0f, 50.0f);
        instancePath.lineTo(0.0f, 46.666668f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 40.0f);
        instancePath2.lineTo(13.333333f, 40.0f);
        instancePath2.lineTo(13.333333f, 43.333332f);
        instancePath2.lineTo(0.0f, 43.333332f);
        instancePath2.lineTo(0.0f, 40.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint5, looper));
        canvas.restore();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 33.333332f);
        instancePath3.lineTo(16.666666f, 33.333332f);
        instancePath3.lineTo(16.666666f, 36.666664f);
        instancePath3.lineTo(0.0f, 36.666664f);
        instancePath3.lineTo(0.0f, 33.333332f);
        instancePath3.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath3, C24542c.instancePaint(instancePaint6, looper));
        canvas.restore();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-1);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(0.0f, 26.666666f);
        instancePath4.lineTo(20.0f, 26.666666f);
        instancePath4.lineTo(20.0f, 30.0f);
        instancePath4.lineTo(0.0f, 30.0f);
        instancePath4.lineTo(0.0f, 26.666666f);
        instancePath4.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath4, C24542c.instancePaint(instancePaint7, looper));
        canvas.restore();
        Paint instancePaint8 = C24542c.instancePaint(paint, looper);
        instancePaint8.setColor(-1);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(0.0f, 20.0f);
        instancePath5.lineTo(23.333334f, 20.0f);
        instancePath5.lineTo(23.333334f, 23.333334f);
        instancePath5.lineTo(0.0f, 23.333334f);
        instancePath5.lineTo(0.0f, 20.0f);
        instancePath5.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath5, C24542c.instancePaint(instancePaint8, looper));
        canvas.restore();
        Paint instancePaint9 = C24542c.instancePaint(paint, looper);
        instancePaint9.setColor(-1);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(0.0f, 13.333333f);
        instancePath6.lineTo(26.666666f, 13.333333f);
        instancePath6.lineTo(26.666666f, 16.666666f);
        instancePath6.lineTo(0.0f, 16.666666f);
        instancePath6.lineTo(0.0f, 13.333333f);
        instancePath6.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath6, C24542c.instancePaint(instancePaint9, looper));
        canvas.restore();
        Paint instancePaint10 = C24542c.instancePaint(paint, looper);
        instancePaint10.setColor(-1);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(0.0f, 6.6666665f);
        instancePath7.lineTo(30.0f, 6.6666665f);
        instancePath7.lineTo(30.0f, 10.0f);
        instancePath7.lineTo(0.0f, 10.0f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 1);
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        Paint instancePaint11 = C24542c.instancePaint(instancePaint10, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint11);
        canvas.restore();
        Paint instancePaint12 = C24542c.instancePaint(paint, looper);
        instancePaint12.setColor(-1);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(0.0f, 0.0f);
        instancePath8.lineTo(33.333332f, 0.0f);
        instancePath8.lineTo(33.333332f, 3.3333333f);
        instancePath8.lineTo(0.0f, 3.3333333f);
        instancePath8.lineTo(0.0f, 0.0f);
        instancePath8.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath8, C24542c.instancePaint(instancePaint12, looper));
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
