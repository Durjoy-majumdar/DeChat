package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_quote_location */
public class icons_outlined_quote_location extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(5.0625f);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.6875f, 0.0f, 1.0f, 3.9375f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(25.3125f, 2.53125f);
            Path path = instancePath;
            path.cubicTo(31.605444f, 2.53125f, 37.303436f, 5.0624957f, 41.427666f, 9.1574335f);
            path.cubicTo(45.545345f, 13.245865f, 48.09375f, 18.893545f, 48.09375f, 25.132717f);
            path.cubicTo(48.09375f, 43.167248f, 26.02464f, 61.312508f, 26.02464f, 61.312508f);
            path.cubicTo(25.772068f, 61.53961f, 25.541258f, 61.596313f, 25.320568f, 61.59681f);
            path.cubicTo(25.09186f, 61.59732f, 24.853292f, 61.537315f, 24.675802f, 61.378483f);
            path.cubicTo(24.611698f, 61.32302f, 2.53125f, 43.167595f, 2.53125f, 25.132717f);
            path.cubicTo(2.53125f, 18.893545f, 5.079656f, 13.245865f, 9.197333f, 9.1574335f);
            path.cubicTo(13.321564f, 5.0624957f, 19.019556f, 2.53125f, 25.3125f, 2.53125f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(25.3125f, 16.03125f);
            Path path2 = instancePath2;
            path2.cubicTo(30.438393f, 16.03125f, 34.59375f, 20.186607f, 34.59375f, 25.3125f);
            path2.cubicTo(34.59375f, 30.438393f, 30.438393f, 34.59375f, 25.3125f, 34.59375f);
            path2.cubicTo(20.186607f, 34.59375f, 16.03125f, 30.438393f, 16.03125f, 25.3125f);
            path2.cubicTo(16.03125f, 20.186607f, 20.186607f, 16.03125f, 25.3125f, 16.03125f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
