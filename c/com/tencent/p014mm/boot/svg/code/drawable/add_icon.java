package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.add_icon */
public class add_icon extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-5066062);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -54.0f, 0.0f, 1.0f, -710.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 254.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 432.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(34.0f, 34.0f);
        instancePath.lineTo(26.004946f, 34.0f);
        Path path = instancePath;
        path.cubicTo(24.897026f, 34.0f, 24.0f, 34.89543f, 24.0f, 36.0f);
        path.cubicTo(24.0f, 37.11227f, 24.897646f, 38.0f, 26.004946f, 38.0f);
        instancePath.lineTo(34.0f, 38.0f);
        instancePath.lineTo(34.0f, 45.995052f);
        path.cubicTo(34.0f, 47.102974f, 34.89543f, 48.0f, 36.0f, 48.0f);
        path.cubicTo(37.11227f, 48.0f, 38.0f, 47.102356f, 38.0f, 45.995052f);
        instancePath.lineTo(38.0f, 38.0f);
        instancePath.lineTo(45.995052f, 38.0f);
        path.cubicTo(47.102974f, 38.0f, 48.0f, 37.10457f, 48.0f, 36.0f);
        path.cubicTo(48.0f, 34.88773f, 47.102356f, 34.0f, 45.995052f, 34.0f);
        instancePath.lineTo(38.0f, 34.0f);
        instancePath.lineTo(38.0f, 26.004946f);
        path.cubicTo(38.0f, 24.897026f, 37.10457f, 24.0f, 36.0f, 24.0f);
        path.cubicTo(34.88773f, 24.0f, 34.0f, 24.897646f, 34.0f, 26.004946f);
        instancePath.lineTo(34.0f, 34.0f);
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
