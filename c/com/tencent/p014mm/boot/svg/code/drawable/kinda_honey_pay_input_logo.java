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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_honey_pay_input_logo */
public class kinda_honey_pay_input_logo extends C24542c {
    private final int height = 102;
    private final int width = 112;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 112;
        }
        if (i2 == 1) {
            return 102;
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
        instancePaint4.setColor(-352965);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.89879405f, -0.43837115f, 28.1632f, 0.43837115f, 0.89879405f, -19.495651f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(29.793938f, 16.856665f);
        instancePath.lineTo(98.79637f, 41.881905f);
        instancePath.cubicTo(100.528595f, 42.510136f, 101.42174f, 44.418655f, 100.79126f, 46.144703f);
        instancePath.lineTo(87.09226f, 83.648125f);
        instancePath.cubicTo(86.461784f, 85.374176f, 84.54643f, 86.26413f, 82.8142f, 85.6359f);
        instancePath.lineTo(13.811771f, 60.61066f);
        instancePath.cubicTo(12.079545f, 59.982433f, 11.186401f, 58.073914f, 11.81688f, 56.347866f);
        instancePath.lineTo(25.515879f, 18.84444f);
        instancePath.cubicTo(26.146358f, 17.118393f, 28.06171f, 16.228436f, 29.793938f, 16.856665f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 108, 31);
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-352965);
        instancePaint6.setStrokeWidth(3.0f);
        instancePaint6.setStrokeCap(Paint.Cap.ROUND);
        instancePaint6.setStrokeJoin(Paint.Join.MITER);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9975641f, 0.06975647f, -3.1715105f, -0.06975647f, 0.9975641f, 4.4762454f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(67.294525f, 19.50847f);
        Path path = instancePath2;
        path.cubicTo(72.62902f, 16.715134f, 78.33086f, 15.109462f, 84.400024f, 14.691455f);
        path.cubicTo(93.764915f, 14.630166f, 101.19274f, 17.516296f, 104.61384f, 23.42067f);
        path.cubicTo(111.76379f, 35.760567f, 98.705086f, 56.61107f, 75.44642f, 69.99156f);
        path.cubicTo(52.187748f, 83.37206f, 27.536694f, 84.21563f, 20.386744f, 71.87573f);
        path.cubicTo(19.534513f, 70.40489f, 18.96939f, 68.81314f, 18.674427f, 67.12753f);
        path.cubicTo(18.217703f, 63.51224f, 18.431046f, 60.472187f, 19.314455f, 58.00737f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
