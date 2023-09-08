package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ic_filled_loading_fail */
public class ic_filled_loading_fail extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        instancePaint3.setColor(-855638017);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -167.0f, 0.0f, 1.0f, -370.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 128.0f, 0.0f, 1.0f, 346.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 16.036478f);
        instancePath.lineTo(37.1022f, 0.13443516f);
        Path path = instancePath;
        path.cubicTo(37.29843f, -0.048027184f, 37.612587f, -0.040865954f, 37.798798f, 0.14534536f);
        instancePath.lineTo(39.854656f, 2.201203f);
        path.cubicTo(40.043144f, 2.389691f, 40.049908f, 2.699546f, 39.865566f, 2.897802f);
        instancePath.lineTo(23.963522f, 20.0f);
        instancePath.lineTo(39.865566f, 37.1022f);
        path.cubicTo(40.048027f, 37.29843f, 40.040867f, 37.612587f, 39.854656f, 37.798798f);
        instancePath.lineTo(37.798798f, 39.854656f);
        path.cubicTo(37.61031f, 40.043144f, 37.300453f, 40.049908f, 37.1022f, 39.865566f);
        instancePath.lineTo(20.0f, 23.963522f);
        instancePath.lineTo(2.897802f, 39.865566f);
        path.cubicTo(2.701569f, 40.048027f, 2.3874145f, 40.040867f, 2.201203f, 39.854656f);
        instancePath.lineTo(0.14534536f, 37.798798f);
        path.cubicTo(-0.04314252f, 37.61031f, -0.049908195f, 37.300453f, 0.13443516f, 37.1022f);
        instancePath.lineTo(16.036478f, 20.0f);
        instancePath.lineTo(0.13443516f, 2.897802f);
        Path path2 = instancePath;
        path2.cubicTo(-0.048027184f, 2.701569f, -0.040865954f, 2.3874145f, 0.14534536f, 2.201203f);
        instancePath.lineTo(2.201203f, 0.14534536f);
        path2.cubicTo(2.389691f, -0.04314252f, 2.699546f, -0.049908195f, 2.897802f, 0.13443516f);
        instancePath.lineTo(20.0f, 16.036478f);
        instancePath.lineTo(20.0f, 16.036478f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
