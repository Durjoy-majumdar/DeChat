package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lqt_plan_logo */
public class lqt_plan_logo extends C24542c {
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.333333f, 0.0f, 1.0f, 5.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-871936);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(32.360928f, 33.960926f);
            instancePath.lineTo(25.066666f, 26.666666f);
            instancePath.lineTo(25.066666f, 10.666667f);
            instancePath.lineTo(28.266666f, 10.666667f);
            instancePath.lineTo(28.266666f, 25.341183f);
            instancePath.lineTo(34.67662f, 31.751137f);
            instancePath.cubicTo(34.125797f, 32.04063f, 33.630104f, 32.437782f, 33.22223f, 32.927273f);
            instancePath.lineTo(32.360928f, 33.960926f);
            instancePath.close();
            instancePath.moveTo(52.44347f, 33.523678f);
            instancePath.lineTo(51.836155f, 32.832275f);
            Path path = instancePath;
            path.cubicTo(51.246536f, 32.16102f, 50.48835f, 31.675097f, 49.652542f, 31.415672f);
            path.cubicTo(49.96776f, 29.881962f, 50.133335f, 28.29365f, 50.133335f, 26.666666f);
            path.cubicTo(50.133335f, 13.706385f, 39.62695f, 3.2f, 26.666666f, 3.2f);
            path.cubicTo(13.706385f, 3.2f, 3.2f, 13.706385f, 3.2f, 26.666666f);
            path.cubicTo(3.2f, 39.62695f, 13.706385f, 50.133335f, 26.666666f, 50.133335f);
            path.cubicTo(29.255632f, 50.133335f, 31.746675f, 49.71408f, 34.075607f, 48.939762f);
            instancePath.lineTo(36.17955f, 51.586544f);
            Path path2 = instancePath;
            path2.cubicTo(33.224854f, 52.71513f, 30.017956f, 53.333332f, 26.666666f, 53.333332f);
            path2.cubicTo(11.939074f, 53.333332f, 0.0f, 41.39426f, 0.0f, 26.666666f);
            path2.cubicTo(0.0f, 11.939074f, 11.939074f, 0.0f, 26.666666f, 0.0f);
            path2.cubicTo(41.39426f, 0.0f, 53.333332f, 11.939074f, 53.333332f, 26.666666f);
            path2.cubicTo(53.333332f, 29.037308f, 53.02399f, 31.3357f, 52.44347f, 33.523678f);
            instancePath.close();
            instancePath.moveTo(35.680626f, 34.975758f);
            path2.cubicTo(35.984615f, 34.61094f, 36.43495f, 34.4f, 36.909824f, 34.4f);
            instancePath.lineTo(48.22984f, 34.4f);
            instancePath.cubicTo(48.69015f, 34.4f, 49.128166f, 34.59825f, 49.431946f, 34.94409f);
            instancePath.lineTo(53.202106f, 39.236256f);
            instancePath.cubicTo(53.714092f, 39.819126f, 53.734158f, 40.68531f, 53.249714f, 41.291267f);
            instancePath.lineTo(43.889675f, 52.999107f);
            instancePath.cubicTo(43.248005f, 53.801727f, 42.026894f, 53.800026f, 41.387466f, 52.995617f);
            instancePath.lineTo(32.080837f, 41.28778f);
            instancePath.cubicTo(31.608892f, 40.69407f, 31.618622f, 39.850586f, 32.104134f, 39.26792f);
            instancePath.lineTo(35.680626f, 34.975758f);
            instancePath.close();
            instancePath.moveTo(35.396164f, 40.315956f);
            instancePath.lineTo(42.643543f, 49.43323f);
            instancePath.lineTo(49.912876f, 40.340515f);
            instancePath.lineTo(47.505653f, 37.6f);
            instancePath.lineTo(37.659264f, 37.6f);
            instancePath.lineTo(35.396164f, 40.315956f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
