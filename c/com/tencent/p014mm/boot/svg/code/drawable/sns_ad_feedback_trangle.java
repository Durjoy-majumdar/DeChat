package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_feedback_trangle */
public class sns_ad_feedback_trangle extends C24542c {
    private final int height = 6;
    private final int width = 15;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 15;
        }
        if (i2 == 1) {
            return 6;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 12.71027f, 1.0f, -1.8369701E-16f, -2.4164877f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(8.416489f, -3.8531091f);
            instancePath.lineTo(8.416489f, -1.4806807f);
            instancePath.cubicTo(8.416489f, -0.9334073f, 8.088407f, -0.1992531f, 7.6654387f, 0.17526627f);
            instancePath.lineTo(2.7301433f, 4.545249f);
            instancePath.cubicTo(2.31535f, 4.91253f, 2.3161323f, 5.5073094f, 2.7301433f, 5.8721867f);
            instancePath.lineTo(7.6654387f, 10.221771f);
            instancePath.cubicTo(8.080232f, 10.5873375f, 8.416489f, 11.337422f, 8.416489f, 11.880487f);
            instancePath.lineTo(8.416489f, 14.146891f);
            instancePath.lineTo(13.147665f, 14.146891f);
            instancePath.lineTo(13.147665f, -3.8531091f);
            instancePath.lineTo(8.416489f, -3.8531091f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
