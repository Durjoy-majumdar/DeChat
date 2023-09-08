package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_copy */
public class location_copy extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -216.0f, 0.0f, 1.0f, -713.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 216.0f, 0.0f, 1.0f, 713.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(16777215);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(20.0f, 21.33337f);
        instancePath2.lineTo(16.0f, 21.33337f);
        instancePath2.lineTo(16.0f, 25.33337f);
        Path path = instancePath2;
        path.cubicTo(16.0f, 26.06967f, 15.40309f, 26.66667f, 14.66669f, 26.66667f);
        instancePath2.lineTo(1.33333f, 26.66667f);
        path.cubicTo(0.59695f, 26.66667f, 0.0f, 26.06967f, 0.0f, 25.33337f);
        instancePath2.lineTo(0.0f, 6.66666f);
        path.cubicTo(0.0f, 5.93028f, 0.59695f, 5.33333f, 1.33333f, 5.33333f);
        instancePath2.lineTo(5.33329f, 5.33333f);
        instancePath2.lineTo(5.33329f, 1.33333f);
        path.cubicTo(5.33329f, 0.59695f, 5.93029f, 4.440892E-16f, 6.66669f, 4.440892E-16f);
        instancePath2.lineTo(20.0f, 4.440892E-16f);
        path.cubicTo(20.73639f, 4.440892E-16f, 21.33329f, 0.59695f, 21.33329f, 1.33333f);
        instancePath2.lineTo(21.33329f, 19.99997f);
        path.cubicTo(21.33329f, 20.73637f, 20.73639f, 21.33337f, 20.0f, 21.33337f);
        instancePath2.close();
        instancePath2.moveTo(6.93329f, 5.33333f);
        instancePath2.lineTo(14.66669f, 5.33333f);
        path.cubicTo(15.40309f, 5.33333f, 15.99999f, 5.93028f, 15.99999f, 6.66666f);
        instancePath2.lineTo(15.99999f, 19.73337f);
        instancePath2.lineTo(19.73329f, 19.73337f);
        instancePath2.lineTo(19.73329f, 1.6f);
        instancePath2.lineTo(6.93329f, 1.6f);
        instancePath2.lineTo(6.93329f, 5.33333f);
        instancePath2.close();
        instancePath2.moveTo(1.6f, 25.06667f);
        instancePath2.lineTo(14.39999f, 25.06667f);
        instancePath2.lineTo(14.39999f, 6.93333f);
        instancePath2.lineTo(1.6f, 6.93333f);
        instancePath2.lineTo(1.6f, 25.06667f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
