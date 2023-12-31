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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_pay_watermask */
public class honey_pay_watermask extends C24542c {
    private final int height = 111;
    private final int width = 121;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 121;
        }
        if (i2 == 1) {
            return 111;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1203649);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.89879405f, -0.43837115f, 30.552965f, 0.43837115f, 0.89879405f, -20.803411f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(31.45411f, 18.344019f);
        instancePath.lineTo(106.61748f, 45.577366f);
        instancePath.cubicTo(108.504364f, 46.26103f, 109.47725f, 48.337948f, 108.79048f, 50.216293f);
        instancePath.lineTo(93.868355f, 91.02885f);
        instancePath.cubicTo(93.18159f, 92.90719f, 91.09522f, 93.87567f, 89.20833f, 93.19201f);
        instancePath.lineTo(14.044966f, 65.958664f);
        instancePath.cubicTo(12.158075f, 65.275f, 11.185187f, 63.198082f, 11.871959f, 61.319736f);
        instancePath.lineTo(26.794083f, 20.507185f);
        instancePath.cubicTo(27.480854f, 18.62884f, 29.56722f, 17.660357f, 31.45411f, 18.344019f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 108, 31);
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-1203649);
        instancePaint6.setStrokeWidth(2.216448f);
        instancePaint6.setStrokeCap(Paint.Cap.ROUND);
        instancePaint6.setStrokeJoin(Paint.Join.MITER);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9975641f, 0.06975647f, -3.4536302f, -0.06975647f, 0.9975641f, 4.806033f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(72.30296f, 21.229805f);
        Path path = instancePath2;
        path.cubicTo(78.113754f, 18.189999f, 84.32468f, 16.44265f, 90.93574f, 15.98776f);
        path.cubicTo(101.13679f, 15.921063f, 109.227806f, 19.061852f, 112.95436f, 25.4872f);
        path.cubicTo(120.7427f, 38.915913f, 106.51804f, 61.60616f, 81.18271f, 76.16729f);
        path.cubicTo(55.84737f, 90.72842f, 28.995327f, 91.64642f, 21.20699f, 78.21771f);
        path.cubicTo(20.278666f, 76.61709f, 19.663086f, 74.88489f, 19.341787f, 73.05055f);
        path.cubicTo(18.844284f, 69.116264f, 19.076675f, 65.80797f, 20.03896f, 63.125668f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
