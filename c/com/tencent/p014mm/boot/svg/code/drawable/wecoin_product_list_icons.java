package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wecoin_product_list_icons */
public class wecoin_product_list_icons extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 20;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.5f, 0.8660254f, 0.7303667f, -0.8660254f, 0.5f, 13.685536f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.801277f, 0.0f, 1.0f, 0.787784f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-7746194);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.798704f, 0.0015978813f);
            Path path = instancePath;
            path.cubicTo(10.554192f, 0.0015978813f, 13.598616f, 2.4758546f, 13.598616f, 5.528005f);
            path.cubicTo(13.598616f, 8.580155f, 10.554192f, 11.054413f, 6.798704f, 11.054413f);
            path.cubicTo(3.0432167f, 11.054413f, -0.0012068748f, 8.580155f, -0.0012068748f, 5.528005f);
            path.cubicTo(-0.0012068748f, 2.4758546f, 3.0432167f, 0.0015978813f, 6.798704f, 0.0015978813f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2130706433);
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 0.95105654f, -0.309017f, 1.4288014f, 0.309017f, 0.95105654f, -2.972626f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(10.098612f, 2.0242364f);
            Path path2 = instancePath2;
            path2.cubicTo(10.834071f, 2.0242364f, 11.430279f, 2.4719517f, 11.430279f, 3.0242364f);
            path2.cubicTo(11.430279f, 3.5765212f, 10.834071f, 4.0242367f, 10.098612f, 4.0242367f);
            path2.cubicTo(9.3631525f, 4.0242367f, 8.766945f, 3.5765212f, 8.766945f, 3.0242364f);
            path2.cubicTo(8.766945f, 2.4719517f, 9.3631525f, 2.0242364f, 10.098612f, 2.0242364f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
