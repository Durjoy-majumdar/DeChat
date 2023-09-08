package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ic_chat_list_empty */
public class ic_chat_list_empty extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -156.0f, 0.0f, 1.0f, -435.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 240.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 119.0f, 0.0f, 1.0f, 195.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 37.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(64.0f, 0.0f);
            instancePath.lineTo(64.0f, 64.0f);
            instancePath.lineTo(0.0f, 64.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(637534208);
            instancePaint4.setStrokeWidth(2.4f);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(32.0f, 11.2f);
            Path path = instancePath2;
            path.cubicTo(38.31807f, 11.2f, 44.0435f, 13.403544f, 48.185806f, 16.98427f);
            path.cubicTo(52.26018f, 20.506271f, 54.8f, 25.366123f, 54.8f, 30.74626f);
            path.cubicTo(54.8f, 36.126396f, 52.26018f, 40.986248f, 48.185806f, 44.508247f);
            path.cubicTo(44.0435f, 48.088974f, 38.31807f, 50.29252f, 32.0f, 50.29252f);
            path.cubicTo(29.244429f, 50.29252f, 26.602167f, 49.873325f, 24.154348f, 49.10354f);
            instancePath2.lineTo(24.154348f, 49.10354f);
            instancePath2.lineTo(16.581964f, 52.796207f);
            instancePath2.lineTo(17.382318f, 45.743576f);
            Path path2 = instancePath2;
            path2.cubicTo(12.4016285f, 42.17084f, 9.2f, 36.787598f, 9.2f, 30.74626f);
            path2.cubicTo(9.2f, 25.366123f, 11.73982f, 20.506271f, 15.814193f, 16.98427f);
            path2.cubicTo(19.956501f, 13.403544f, 25.68193f, 11.2f, 32.0f, 11.2f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
