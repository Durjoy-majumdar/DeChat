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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.music_mv_slider_left_bar */
public class music_mv_slider_left_bar extends C24542c {
    private final int height = 52;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 16;
        }
        if (i2 == 1) {
            return 52;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -31.0f, 0.0f, 1.0f, -680.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 31.0f, 0.0f, 1.0f, 648.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, -1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(12.0f, 0.0f);
        instancePath.cubicTo(14.209139f, -4.0581224E-16f, 16.0f, 1.790861f, 16.0f, 4.0f);
        instancePath.lineTo(16.0f, 48.0f);
        instancePath.cubicTo(16.0f, 50.20914f, 14.209139f, 52.0f, 12.0f, 52.0f);
        instancePath.lineTo(0.0f, 52.0f);
        instancePath.lineTo(0.0f, 52.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 23.0f);
        instancePath2.cubicTo(6.0f, 21.89543f, 6.8954306f, 21.0f, 8.0f, 21.0f);
        instancePath2.lineTo(8.0f, 21.0f);
        instancePath2.cubicTo(9.104569f, 21.0f, 10.0f, 21.89543f, 10.0f, 23.0f);
        instancePath2.lineTo(10.0f, 29.0f);
        instancePath2.cubicTo(10.0f, 30.10457f, 9.104569f, 31.0f, 8.0f, 31.0f);
        instancePath2.lineTo(8.0f, 31.0f);
        instancePath2.cubicTo(6.8954306f, 31.0f, 6.0f, 30.10457f, 6.0f, 29.0f);
        instancePath2.lineTo(6.0f, 23.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
