package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.websearch_icon_movie */
public class websearch_icon_movie extends C24542c {
    private final int height = 15;
    private final int width = 14;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 14;
        }
        if (i2 == 1) {
            return 15;
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
            instancePaint4.setColor(-5066062);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -74.0f, 0.0f, 1.0f, -747.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 143.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(14.393222f, 10.420385f);
            instancePath.lineTo(4.321909f, 15.7654f);
            Path path = instancePath;
            path.cubicTo(3.882854f, 15.998414f, 3.3380342f, 15.831385f, 3.1050203f, 15.392329f);
            path.cubicTo(3.036059f, 15.262389f, 3.0f, 15.117526f, 3.0f, 14.970421f);
            instancePath.lineTo(3.0f, 4.153231f);
            Path path2 = instancePath;
            path2.cubicTo(3.0f, 3.6009462f, 3.4477153f, 3.153231f, 4.0f, 3.153231f);
            path2.cubicTo(4.171167f, 3.153231f, 4.3394685f, 3.1971664f, 4.4887943f, 3.2808318f);
            instancePath.lineTo(14.411227f, 8.840247f);
            Path path3 = instancePath;
            path3.cubicTo(14.844859f, 9.083205f, 14.99943f, 9.631689f, 14.756472f, 10.065321f);
            path3.cubicTo(14.671992f, 10.216099f, 14.545886f, 10.339364f, 14.393222f, 10.420385f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
