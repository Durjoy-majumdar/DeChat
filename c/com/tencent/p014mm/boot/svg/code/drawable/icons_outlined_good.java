package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_good */
public class icons_outlined_good extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-6842473);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.5f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.5f, 8.346154f);
            instancePath.lineTo(3.5f, 19.5f);
            instancePath.lineTo(0.84942085f, 19.5f);
            instancePath.lineTo(0.5f, 8.692307f);
            instancePath.lineTo(3.5f, 8.346154f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(9.810811f, 0.5f);
            Path path = instancePath2;
            path.cubicTo(10.242683f, 0.5f, 10.619177f, 0.65353614f, 10.912958f, 0.90582216f);
            path.cubicTo(11.240121f, 1.1867741f, 11.465509f, 1.586257f, 11.561556f, 2.029064f);
            path.cubicTo(11.710274f, 2.6227212f, 11.781854f, 3.2729785f, 11.781854f, 3.9230769f);
            path.cubicTo(11.781854f, 5.204612f, 11.552982f, 6.3715816f, 11.089932f, 7.423077f);
            instancePath2.lineTo(11.089932f, 7.423077f);
            instancePath2.lineTo(16.580177f, 7.423077f);
            Path path2 = instancePath2;
            path2.cubicTo(17.196596f, 7.4905233f, 17.814562f, 7.7958183f, 18.18559f, 8.411823f);
            path2.cubicTo(18.446613f, 8.802871f, 18.498081f, 9.237287f, 18.49994f, 9.667372f);
            path2.cubicTo(18.464209f, 10.015849f, 18.438932f, 10.232803f, 18.420803f, 10.317602f);
            path2.cubicTo(17.936535f, 12.582813f, 16.9819f, 16.898571f, 16.6878f, 18.143236f);
            path2.cubicTo(16.490795f, 18.690409f, 16.266588f, 19.005083f, 15.963558f, 19.186201f);
            path2.cubicTo(15.6529045f, 19.371878f, 15.280899f, 19.5f, 14.907336f, 19.5f);
            instancePath2.lineTo(14.907336f, 19.5f);
            instancePath2.lineTo(3.5f, 19.5f);
            instancePath2.lineTo(3.5f, 8.280641f);
            path2.cubicTo(5.3086267f, 7.954559f, 6.447856f, 6.8391895f, 7.0386815f, 5.723351f);
            path2.cubicTo(7.4886675f, 4.873503f, 7.8036327f, 3.8217907f, 7.839469f, 2.7865283f);
            path2.cubicTo(7.8397684f, 2.089062f, 8.027642f, 1.5001117f, 8.393714f, 1.0898645f);
            path2.cubicTo(8.730702f, 0.71221155f, 9.217119f, 0.5f, 9.810811f, 0.5f);
            instancePath2.lineTo(9.810811f, 0.5f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
