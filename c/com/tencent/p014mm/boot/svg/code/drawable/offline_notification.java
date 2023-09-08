package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_notification */
public class offline_notification extends C24542c {
    private final int height = 42;
    private final int width = 33;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 33;
        }
        if (i2 == 1) {
            return 42;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16036);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, -1.0f, 37.0f, 1.0f, 6.123234E-17f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(-4.0f, 13.0f);
            instancePath.lineTo(6.0f, 13.0f);
            instancePath.lineTo(17.0f, 5.0f);
            instancePath.lineTo(20.0f, 5.0f);
            instancePath.lineTo(20.0f, 36.0f);
            instancePath.lineTo(17.0f, 36.0f);
            instancePath.lineTo(6.0f, 28.0f);
            instancePath.lineTo(-4.0f, 28.0f);
            instancePath.lineTo(-4.0f, 13.0f);
            instancePath.close();
            instancePath.moveTo(27.0f, 19.0f);
            instancePath.lineTo(37.0f, 19.0f);
            instancePath.lineTo(37.0f, 22.0f);
            instancePath.lineTo(27.0f, 22.0f);
            instancePath.lineTo(27.0f, 19.0f);
            instancePath.close();
            instancePath.moveTo(27.0f, 12.0f);
            instancePath.lineTo(37.0f, 8.0f);
            instancePath.lineTo(37.0f, 11.0f);
            instancePath.lineTo(27.0f, 15.0f);
            instancePath.lineTo(27.0f, 12.0f);
            instancePath.close();
            instancePath.moveTo(37.0f, 29.0f);
            instancePath.lineTo(27.0f, 25.0f);
            instancePath.lineTo(27.0f, 28.0f);
            instancePath.lineTo(37.0f, 32.0f);
            instancePath.lineTo(37.0f, 29.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
