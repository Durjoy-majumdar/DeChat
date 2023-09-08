package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_security_digital_certificate */
public class wallet_security_digital_certificate extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 64;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.666667f, 0.0f, 1.0f, 0.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15616);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(40.0f, 0.0f);
            instancePath.cubicTo(41.47276f, 0.0f, 42.666668f, 1.1939074f, 42.666668f, 2.6666667f);
            instancePath.lineTo(42.666668f, 50.666668f);
            instancePath.cubicTo(42.666668f, 52.139427f, 41.47276f, 53.333332f, 40.0f, 53.333332f);
            instancePath.lineTo(2.6666667f, 53.333332f);
            Path path = instancePath;
            path.cubicTo(1.1939074f, 53.333332f, 0.0f, 52.139427f, 0.0f, 50.666668f);
            instancePath.lineTo(0.0f, 2.6666667f);
            path.cubicTo(0.0f, 1.1939074f, 1.1939074f, 0.0f, 2.6666667f, 0.0f);
            instancePath.lineTo(40.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(39.466667f, 3.2f);
            instancePath.lineTo(3.2f, 3.2f);
            instancePath.lineTo(3.2f, 50.133335f);
            instancePath.lineTo(39.466667f, 50.133335f);
            instancePath.lineTo(39.466667f, 3.2f);
            instancePath.close();
            instancePath.moveTo(18.666666f, 18.666666f);
            instancePath.lineTo(18.666666f, 21.866667f);
            instancePath.lineTo(8.0f, 21.866667f);
            instancePath.lineTo(8.0f, 18.666666f);
            instancePath.lineTo(18.666666f, 18.666666f);
            instancePath.close();
            instancePath.moveTo(24.0f, 10.666667f);
            instancePath.lineTo(24.0f, 13.866667f);
            instancePath.lineTo(8.0f, 13.866667f);
            instancePath.lineTo(8.0f, 10.666667f);
            instancePath.lineTo(24.0f, 10.666667f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(64.0f, 0.0f);
            instancePath2.lineTo(64.0f, 64.0f);
            instancePath2.lineTo(0.0f, 64.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            C24542c.done(looper);
        }
        return 0;
    }
}
