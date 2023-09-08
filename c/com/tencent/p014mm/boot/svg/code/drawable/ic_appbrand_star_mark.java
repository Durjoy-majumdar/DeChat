package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ic_appbrand_star_mark */
public class ic_appbrand_star_mark extends C24542c {
    private final int height = 18;
    private final int width = 19;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 19;
        }
        if (i2 == 1) {
            return 18;
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
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-15616);
        instancePaint5.setColor(-15616);
        instancePaint5.setStrokeWidth(1.2f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -321.0f, 0.0f, 1.0f, -308.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 227.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 20.0f, 0.0f, 1.0f, 49.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(245.3613f, 20.165895f);
        instancePath.lineTo(250.31267f, 17.562805f);
        instancePath.lineTo(255.26404f, 20.165895f);
        Path path = instancePath;
        path.cubicTo(255.34189f, 20.206831f, 255.43108f, 20.220957f, 255.51779f, 20.206087f);
        path.cubicTo(255.73552f, 20.168741f, 255.88176f, 19.96196f, 255.8444f, 19.744225f);
        instancePath.lineTo(254.89879f, 14.230793f);
        instancePath.lineTo(258.90454f, 10.326159f);
        Path path2 = instancePath;
        path2.cubicTo(258.96753f, 10.264755f, 259.0085f, 10.1842985f, 259.02118f, 10.097244f);
        path2.cubicTo(259.05292f, 9.878626f, 258.90146f, 9.675649f, 258.68283f, 9.643882f);
        instancePath.lineTo(253.14703f, 8.839482f);
        instancePath.lineTo(250.67136f, 3.8231966f);
        Path path3 = instancePath;
        path3.cubicTo(250.63242f, 3.7443118f, 250.56857f, 3.6804607f, 250.48969f, 3.6415286f);
        path3.cubicTo(250.29158f, 3.5437596f, 250.05174f, 3.6250954f, 249.95396f, 3.8231966f);
        instancePath.lineTo(247.47829f, 8.839482f);
        instancePath.lineTo(241.94247f, 9.643882f);
        Path path4 = instancePath;
        path4.cubicTo(241.85542f, 9.656531f, 241.77496f, 9.697526f, 241.71356f, 9.76052f);
        path4.cubicTo(241.55937f, 9.918714f, 241.5626f, 10.171959f, 241.7208f, 10.326159f);
        instancePath.lineTo(245.72653f, 14.230793f);
        instancePath.lineTo(244.78091f, 19.744225f);
        Path path5 = instancePath;
        path5.cubicTo(244.76604f, 19.830929f, 244.78017f, 19.920115f, 244.8211f, 19.99798f);
        path5.cubicTo(244.9239f, 20.193518f, 245.16576f, 20.268696f, 245.3613f, 20.165895f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
