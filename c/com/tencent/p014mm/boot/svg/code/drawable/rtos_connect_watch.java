package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.rtos_connect_watch */
public class rtos_connect_watch extends C24542c {
    private final int height = 104;
    private final int width = 70;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 70;
        }
        if (i2 == 1) {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -172.0f, 0.0f, 1.0f, -279.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 273.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 117.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 23.423077f, 0.0f, 1.0f, 6.692308f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 24.629887f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(55.758347f, 0.0f);
        instancePath.lineTo(51.595768f, 21.134918f);
        instancePath.cubicTo(51.194424f, 23.065136f, 49.318867f, 24.629887f, 47.39626f, 24.629887f);
        instancePath.lineTo(21.746704f, 24.629887f);
        instancePath.cubicTo(19.828724f, 24.629887f, 17.949306f, 23.068823f, 17.547197f, 21.134918f);
        instancePath.lineTo(13.384615f, 0.0f);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(55.758347f, 78.07692f);
        instancePath2.lineTo(51.595768f, 99.13339f);
        Path path = instancePath2;
        path.cubicTo(51.194424f, 101.05644f, 49.318867f, 102.61539f, 47.39626f, 102.61539f);
        instancePath2.lineTo(21.746704f, 102.61539f);
        path.cubicTo(19.828724f, 102.61539f, 17.949306f, 101.06012f, 17.547197f, 99.13339f);
        instancePath2.lineTo(13.384615f, 78.07692f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(34.576923f, 17.130772f);
        Path path2 = instancePath3;
        path2.cubicTo(53.452316f, 17.130772f, 68.753845f, 32.4323f, 68.753845f, 51.307693f);
        path2.cubicTo(68.753845f, 70.18309f, 53.452316f, 85.48462f, 34.576923f, 85.48462f);
        path2.cubicTo(15.70153f, 85.48462f, 0.40000153f, 70.18309f, 0.40000153f, 51.307693f);
        path2.cubicTo(0.40000153f, 32.4323f, 15.70153f, 17.130772f, 34.576923f, 17.130772f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(34.576923f, 26.053846f);
        Path path3 = instancePath4;
        path3.cubicTo(48.52424f, 26.053846f, 59.830772f, 37.36038f, 59.830772f, 51.307693f);
        path3.cubicTo(59.830772f, 65.255005f, 48.52424f, 76.56154f, 34.576923f, 76.56154f);
        path3.cubicTo(20.629608f, 76.56154f, 9.323076f, 65.255005f, 9.323076f, 51.307693f);
        path3.cubicTo(9.323076f, 37.36038f, 20.629608f, 26.053846f, 34.576923f, 26.053846f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(16777215);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(0.0f, 0.0f);
        instancePath5.lineTo(116.0f, 0.0f);
        instancePath5.lineTo(116.0f, 116.0f);
        instancePath5.lineTo(0.0f, 116.0f);
        instancePath5.lineTo(0.0f, 0.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
