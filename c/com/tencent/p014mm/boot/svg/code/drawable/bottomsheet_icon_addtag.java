package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_addtag */
public class bottomsheet_icon_addtag extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-8617851);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(20.0f, 65.0f);
                Path path = instancePath;
                path.cubicTo(15.581831f, 65.0f, 12.0f, 61.418266f, 12.0f, 57.00022f);
                path.cubicTo(12.0f, 52.581734f, 15.581831f, 49.0f, 20.0f, 49.0f);
                path.cubicTo(24.418169f, 49.0f, 28.0f, 52.581734f, 28.0f, 57.00022f);
                path.cubicTo(28.0f, 61.418266f, 24.418169f, 65.0f, 20.0f, 65.0f);
                instancePath.moveTo(75.81466f, 29.779163f);
                instancePath.lineTo(47.19909f, 1.1844771f);
                instancePath.cubicTo(45.618633f, -0.3948257f, 43.056522f, -0.3948257f, 41.476063f, 1.1844771f);
                instancePath.lineTo(1.252038f, 41.379147f);
                instancePath.cubicTo(0.3639593f, 42.26658f, -0.024743835f, 43.463757f, 0.08502881f, 44.62272f);
                instancePath.lineTo(0.004948767f, 44.70319f);
                instancePath.lineTo(0.0f, 76.91503f);
                instancePath.lineTo(0.08502881f, 77.0f);
                instancePath.cubicTo(5.8085027f, 77.0f, 23.96283f, 76.97392f, 32.275406f, 76.961334f);
                instancePath.lineTo(32.376633f, 76.86018f);
                instancePath.cubicTo(33.526546f, 76.95999f, 34.71065f, 76.57157f, 35.59063f, 75.69268f);
                instancePath.lineTo(75.81466f, 35.49801f);
                instancePath.cubicTo(77.39511f, 33.91871f, 77.39511f, 31.358015f, 75.81466f, 29.779163f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
