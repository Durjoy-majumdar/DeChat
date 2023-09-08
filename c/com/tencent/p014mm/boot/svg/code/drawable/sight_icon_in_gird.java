package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_icon_in_gird */
public class sight_icon_in_gird extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 80;
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
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(4.0f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.925568f, 47.054665f);
            Path path = instancePath;
            path.cubicTo(56.11064f, 47.054665f, 71.45919f, 26.668798f, 71.45919f, 26.668798f);
            path.cubicTo(72.148895f, 25.817219f, 72.17743f, 24.403841f, 71.5037f, 23.523014f);
            path.cubicTo(71.5037f, 23.523014f, 55.69043f, 0.96764195f, 36.505352f, 0.96764195f);
            path.cubicTo(17.320274f, 0.96764195f, 1.4598377f, 23.541723f, 1.4598377f, 23.541723f);
            path.cubicTo(0.8014887f, 24.417181f, 0.84271175f, 25.819351f, 1.5628284f, 26.651388f);
            path.cubicTo(1.5628284f, 26.651388f, 17.740492f, 47.054665f, 36.925568f, 47.054665f);
            instancePath.lineTo(36.925568f, 47.054665f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(22.42774f, 20.499218f);
            Path path2 = instancePath2;
            path2.cubicTo(22.148413f, 21.58994f, 22.0f, 22.732264f, 22.0f, 23.908884f);
            path2.cubicTo(22.0f, 31.55521f, 28.267693f, 37.75321f, 36.0f, 37.75321f);
            path2.cubicTo(43.732307f, 37.75321f, 50.0f, 31.55521f, 50.0f, 23.908884f);
            path2.cubicTo(50.0f, 16.262556f, 43.732307f, 10.064558f, 36.0f, 10.064558f);
            path2.cubicTo(34.347454f, 10.064558f, 32.76181f, 10.347658f, 31.289946f, 10.867492f);
            instancePath2.lineTo(34.60256f, 20.195063f);
            instancePath2.lineTo(31.98528f, 23.138868f);
            instancePath2.lineTo(22.42774f, 20.499218f);
            instancePath2.lineTo(22.42774f, 20.499218f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
