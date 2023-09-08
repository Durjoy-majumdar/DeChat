package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_search_nearby_icon */
public class app_brand_search_nearby_icon extends C24542c {
    private final int height = 75;
    private final int width = 57;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 57;
        }
        if (i == 1) {
            return 75;
        }
        if (i == 2) {
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-11184811);
            instancePaint4.setStrokeWidth(3.0f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -1448.0f, 0.0f, 1.0f, -685.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(1474.4348f, 755.2621f);
            Path path = instancePath;
            path.cubicTo(1475.5754f, 756.4586f, 1477.4377f, 756.46204f, 1478.5652f, 755.2621f);
            path.cubicTo(1478.5652f, 755.2621f, 1502.0f, 731.94885f, 1502.0f, 712.67706f);
            path.cubicTo(1502.0f, 698.43427f, 1490.5833f, 687.0f, 1476.8696f, 687.0f);
            path.cubicTo(1462.4167f, 687.0f, 1451.0f, 698.43427f, 1451.0f, 712.67706f);
            path.cubicTo(1451.0f, 731.94885f, 1474.4348f, 755.2621f, 1474.4348f, 755.2621f);
            instancePath.close();
            instancePath.moveTo(1476.5f, 721.0f);
            Path path2 = instancePath;
            path2.cubicTo(1481.1945f, 721.0f, 1485.0f, 717.1944f, 1485.0f, 712.5f);
            path2.cubicTo(1485.0f, 707.8056f, 1481.1945f, 704.0f, 1476.5f, 704.0f);
            path2.cubicTo(1471.8055f, 704.0f, 1468.0f, 707.8056f, 1468.0f, 712.5f);
            path2.cubicTo(1468.0f, 717.1944f, 1471.8055f, 721.0f, 1476.5f, 721.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
