package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_non_task */
public class download_non_task extends C24542c {
    private final int height = 81;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 80;
        }
        if (i2 == 1) {
            return 81;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(419430400);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -140.0f, 0.0f, 1.0f, -261.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 129.33333f, 0.0f, 1.0f, 260.33334f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 10.666667f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(40.0f, 0.6666667f);
            Path path = instancePath;
            path.cubicTo(62.09139f, 0.6666667f, 80.0f, 18.575277f, 80.0f, 40.666668f);
            path.cubicTo(80.0f, 62.758057f, 62.09139f, 80.666664f, 40.0f, 80.666664f);
            path.cubicTo(17.90861f, 80.666664f, 0.0f, 62.758057f, 0.0f, 40.666668f);
            path.cubicTo(0.0f, 18.575277f, 17.90861f, 0.6666667f, 40.0f, 0.6666667f);
            instancePath.close();
            instancePath.moveTo(43.453426f, 24.666666f);
            instancePath.lineTo(36.96895f, 24.666666f);
            instancePath.lineTo(36.968f, 46.393665f);
            instancePath.lineTo(27.724499f, 37.304573f);
            instancePath.lineTo(24.0f, 40.972958f);
            instancePath.lineTo(39.951744f, 56.666668f);
            instancePath.lineTo(56.0f, 41.028053f);
            instancePath.lineTo(52.235523f, 37.398624f);
            instancePath.lineTo(43.453f, 45.878666f);
            instancePath.lineTo(43.453426f, 24.666666f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
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
