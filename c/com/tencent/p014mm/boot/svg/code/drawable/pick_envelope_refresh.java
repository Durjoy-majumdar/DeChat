package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pick_envelope_refresh */
public class pick_envelope_refresh extends C24542c {
    private final int height = 34;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 28;
        }
        if (i2 == 1) {
            return 34;
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
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -39.0f, 0.0f, 1.0f, -37.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 33.0f, 0.0f, 1.0f, 34.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.57191f, 29.428091f);
        Path path = instancePath;
        path.cubicTo(8.159051f, 27.015232f, 6.6666665f, 23.681898f, 6.6666665f, 20.0f);
        path.cubicTo(6.6666665f, 12.636204f, 12.636204f, 6.6666665f, 20.0f, 6.6666665f);
        instancePath.lineTo(20.0f, 8.666667f);
        Path path2 = instancePath;
        path2.cubicTo(13.740773f, 8.666667f, 8.666667f, 13.740773f, 8.666667f, 20.0f);
        path2.cubicTo(8.666667f, 23.048483f, 9.87313f, 25.900885f, 11.986123f, 28.013876f);
        instancePath.moveTo(20.0f, 31.333334f);
        Path path3 = instancePath;
        path3.cubicTo(26.259228f, 31.333334f, 31.333334f, 26.259228f, 31.333334f, 20.0f);
        path3.cubicTo(31.333334f, 16.951517f, 30.12687f, 14.099116f, 28.013876f, 11.986123f);
        instancePath.lineTo(29.428091f, 10.57191f);
        path3.cubicTo(31.84095f, 12.984768f, 33.333332f, 16.318102f, 33.333332f, 20.0f);
        path3.cubicTo(33.333332f, 27.363796f, 27.363796f, 33.333332f, 20.0f, 33.333332f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -0.70710677f, -0.70710677f, 36.499157f, -0.70710677f, 0.70710677f, 15.118446f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.714045f, 6.7140455f);
        instancePath2.lineTo(16.714045f, 11.380712f);
        instancePath2.lineTo(14.714046f, 11.380712f);
        instancePath2.lineTo(14.714046f, 6.7140455f);
        instancePath2.lineTo(14.714046f, 5.214045f);
        instancePath2.cubicTo(14.714046f, 4.937903f, 14.937902f, 4.714045f, 15.214046f, 4.714045f);
        instancePath2.lineTo(21.380713f, 4.714045f);
        instancePath2.lineTo(21.380713f, 6.7140455f);
        instancePath2.lineTo(16.714045f, 6.7140455f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 0.70710677f, 0.70710677f, -16.161968f, -0.70710677f, 0.70710677f, 24.876308f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(20.614046f, 30.614046f);
        instancePath3.lineTo(20.614046f, 35.280712f);
        instancePath3.lineTo(18.614046f, 35.280712f);
        instancePath3.lineTo(18.614046f, 30.614046f);
        instancePath3.lineTo(18.614046f, 29.114046f);
        instancePath3.cubicTo(18.614046f, 28.837904f, 18.837904f, 28.614046f, 19.114046f, 28.614046f);
        instancePath3.lineTo(25.280712f, 28.614046f);
        instancePath3.lineTo(25.280712f, 30.614046f);
        instancePath3.lineTo(20.614046f, 30.614046f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
