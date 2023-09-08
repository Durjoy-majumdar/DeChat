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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_pay_main_logo */
public class honey_pay_main_logo extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
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
        instancePaint4.setColor(-15616);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.89879405f, -0.43837115f, 28.230295f, 0.43837115f, 0.89879405f, -15.78627f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(21.793938f, 18.856665f);
        instancePath.lineTo(90.79637f, 43.881905f);
        instancePath.cubicTo(92.528595f, 44.510136f, 93.42174f, 46.418655f, 92.79126f, 48.144703f);
        instancePath.lineTo(79.09226f, 85.648125f);
        instancePath.cubicTo(78.461784f, 87.374176f, 76.54643f, 88.26413f, 74.8142f, 87.6359f);
        instancePath.lineTo(5.8117714f, 62.61066f);
        instancePath.cubicTo(4.0795445f, 61.982433f, 3.1864014f, 60.073914f, 3.8168805f, 58.347866f);
        instancePath.lineTo(17.515879f, 20.84444f);
        instancePath.cubicTo(18.146358f, 19.118393f, 20.06171f, 18.228436f, 21.793938f, 18.856665f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-15616);
        instancePaint6.setStrokeWidth(3.0f);
        instancePaint6.setStrokeCap(Paint.Cap.ROUND);
        instancePaint6.setStrokeJoin(Paint.Join.MITER);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9975641f, 0.06975647f, -3.3305128f, -0.06975647f, 0.9975641f, 3.923065f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(59.294525f, 21.50847f);
        Path path = instancePath2;
        path.cubicTo(64.62902f, 18.715134f, 70.33086f, 17.109463f, 76.400024f, 16.691454f);
        path.cubicTo(85.764915f, 16.630167f, 93.19274f, 19.516296f, 96.61384f, 25.42067f);
        path.cubicTo(103.76379f, 37.760567f, 90.705086f, 58.61107f, 67.44642f, 71.99156f);
        path.cubicTo(44.187748f, 85.37206f, 19.536694f, 86.21563f, 12.386744f, 73.87573f);
        path.cubicTo(11.5345125f, 72.40489f, 10.96939f, 70.81314f, 10.674427f, 69.12753f);
        path.cubicTo(10.217703f, 65.51224f, 10.431046f, 62.472187f, 11.314454f, 60.00737f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
