package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.cancel_crop_normal */
public class cancel_crop_normal extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 63;
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
            instancePaint3.setStrokeCap(Paint.Cap.SQUARE);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(7.5f);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.5f, 0.0f, 1.0f, 13.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.6666667f, 0.6666667f);
            instancePath.lineTo(14.956543f, 14.956543f);
            instancePath.lineTo(35.333332f, 35.333332f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 36.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.6666667f, 0.6666667f);
            instancePath2.lineTo(14.956543f, 14.956543f);
            instancePath2.lineTo(35.333332f, 35.333332f);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
