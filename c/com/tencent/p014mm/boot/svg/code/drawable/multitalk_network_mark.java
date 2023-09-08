package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_network_mark */
public class multitalk_network_mark extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(30.0f, 0.0f);
        Path path = instancePath;
        instancePath.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        Path path2 = path;
        path2.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        path2.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        path2.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
        path.close();
        canvas.drawPath(path2, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1686720);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, 1.0f, -1.3117828f, -1.0f, 6.123234E-17f, 61.688217f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.14667f, 51.0f);
        Path path3 = instancePath2;
        path3.cubicTo(40.93666f, 45.963642f, 43.87644f, 39.151093f, 43.87644f, 31.651924f);
        path3.cubicTo(43.87644f, 24.000854f, 40.81636f, 17.064505f, 35.85333f, 12.0f);
        instancePath2.lineTo(32.543938f, 15.309392f);
        Path path4 = instancePath2;
        path4.cubicTo(36.660168f, 19.526825f, 39.196537f, 25.293175f, 39.196537f, 31.651924f);
        path4.cubicTo(39.196537f, 37.858765f, 36.779907f, 43.50117f, 32.836227f, 47.689556f);
        instancePath2.lineTo(36.14667f, 51.0f);
        instancePath2.close();
        instancePath2.moveTo(28.464663f, 43.31799f);
        path4.cubicTo(31.478422f, 40.347473f, 33.34667f, 36.217873f, 33.34667f, 31.651924f);
        path4.cubicTo(33.34667f, 26.934067f, 31.352043f, 22.682077f, 28.160082f, 19.693247f);
        instancePath2.lineTo(24.848375f, 23.004953f);
        Path path5 = instancePath2;
        path5.cubicTo(27.194576f, 25.144638f, 28.666769f, 28.226358f, 28.666769f, 31.651924f);
        path5.cubicTo(28.666769f, 34.925556f, 27.322275f, 37.885162f, 25.155354f, 40.008682f);
        instancePath2.lineTo(28.464663f, 43.31799f);
        instancePath2.close();
        instancePath2.moveTo(21.018442f, 35.871773f);
        path5.cubicTo(22.12694f, 34.807247f, 22.816896f, 33.31016f, 22.816896f, 31.651924f);
        path5.cubicTo(22.816896f, 29.841587f, 21.994562f, 28.223316f, 20.703054f, 27.150274f);
        instancePath2.lineTo(16.5f, 31.353329f);
        instancePath2.lineTo(21.018442f, 35.871773f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, paint);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.70710677f, 0.70710677f, -8.70495f, -0.70710677f, 0.70710677f, 31.622213f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(31.568913f, 8.3189125f);
        instancePath3.lineTo(36.068913f, 8.3189125f);
        instancePath3.lineTo(36.068913f, 44.318913f);
        instancePath3.lineTo(31.568913f, 44.318913f);
        instancePath3.lineTo(31.568913f, 8.3189125f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1686720);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 0.70710677f, 0.70710677f, -11.485281f, -0.70710677f, 0.70710677f, 30.909903f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(29.568913f, 11.3189125f);
        instancePath4.lineTo(33.568913f, 11.3189125f);
        instancePath4.lineTo(33.568913f, 47.318913f);
        instancePath4.lineTo(29.568913f, 47.318913f);
        instancePath4.lineTo(29.568913f, 11.3189125f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
