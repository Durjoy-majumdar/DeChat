package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_dark_help */
public class icons_dark_help extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15616);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.333333f, 0.0f, 1.0f, 5.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(26.666666f, 0.0f);
            Path path = instancePath;
            path.cubicTo(41.39426f, 0.0f, 53.333332f, 11.939074f, 53.333332f, 26.666666f);
            path.cubicTo(53.333332f, 41.39426f, 41.39426f, 53.333332f, 26.666666f, 53.333332f);
            path.cubicTo(11.939074f, 53.333332f, 0.0f, 41.39426f, 0.0f, 26.666666f);
            path.cubicTo(0.0f, 11.939074f, 11.939074f, 0.0f, 26.666666f, 0.0f);
            instancePath.close();
            instancePath.moveTo(26.666666f, 36.72578f);
            Path path2 = instancePath;
            path2.cubicTo(25.416666f, 36.72578f, 24.440104f, 37.68281f, 24.440104f, 38.952343f);
            path2.cubicTo(24.440104f, 40.202343f, 25.416666f, 41.178905f, 26.666666f, 41.178905f);
            path2.cubicTo(27.936197f, 41.178905f, 28.893229f, 40.202343f, 28.893229f, 38.952343f);
            path2.cubicTo(28.893229f, 37.68281f, 27.936197f, 36.72578f, 26.666666f, 36.72578f);
            instancePath.close();
            instancePath.moveTo(28.424479f, 12.8f);
            instancePath.lineTo(24.908854f, 12.8f);
            instancePath.lineTo(25.143229f, 31.628126f);
            instancePath.lineTo(28.190104f, 31.628126f);
            instancePath.lineTo(28.424479f, 12.8f);
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
