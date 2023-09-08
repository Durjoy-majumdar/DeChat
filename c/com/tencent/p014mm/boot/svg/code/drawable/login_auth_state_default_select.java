package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_auth_state_default_select */
public class login_auth_state_default_select extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        instancePaint3.setColor(-15028967);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -69.0f, 0.0f, 1.0f, -98.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 69.0f, 0.0f, 1.0f, 98.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 6.0063868f);
        Path path = instancePath;
        path.cubicTo(0.0f, 2.6891508f, 2.6835413f, 0.0f, 6.0063868f, 0.0f);
        instancePath.lineTo(41.993614f, 0.0f);
        path.cubicTo(45.31085f, 0.0f, 48.0f, 2.6835413f, 48.0f, 6.0063868f);
        instancePath.lineTo(48.0f, 41.993614f);
        path.cubicTo(48.0f, 45.31085f, 45.31646f, 48.0f, 41.993614f, 48.0f);
        instancePath.lineTo(6.0063868f, 48.0f);
        path.cubicTo(2.6891508f, 48.0f, 0.0f, 45.31646f, 0.0f, 41.993614f);
        instancePath.lineTo(0.0f, 6.0063868f);
        instancePath.lineTo(0.0f, 6.0063868f);
        instancePath.close();
        instancePath.moveTo(6.0f, 26.576923f);
        instancePath.lineTo(10.2f, 22.538462f);
        instancePath.lineTo(19.0f, 30.923077f);
        instancePath.lineTo(37.8f, 13.0f);
        instancePath.lineTo(42.0f, 17.038462f);
        instancePath.lineTo(19.0f, 39.0f);
        instancePath.lineTo(6.0f, 26.576923f);
        instancePath.lineTo(6.0f, 26.576923f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
