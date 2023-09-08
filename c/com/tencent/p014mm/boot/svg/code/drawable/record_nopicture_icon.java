package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.record_nopicture_icon */
public class record_nopicture_icon extends C24542c {
    private final int height = 180;
    private final int width = 180;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 180;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1315861);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 20.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 9.032258f);
                instancePath.lineTo(9.0f, 9.032258f);
                instancePath.lineTo(9.0f, 89.96034f);
                instancePath.lineTo(60.553738f, 41.65066f);
                instancePath.lineTo(121.92021f, 98.15694f);
                instancePath.lineTo(113.13358f, 80.02691f);
                instancePath.lineTo(138.16164f, 60.600388f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.close();
                instancePath.moveTo(4.494371f, 0.0f);
                instancePath.cubicTo(2.0121984f, 0.0f, 0.0f, 2.0194945f, 0.0f, 4.5191708f);
                instancePath.lineTo(0.0f, 135.48083f);
                instancePath.cubicTo(0.0f, 137.9767f, 2.0214844f, 140.0f, 4.494371f, 140.0f);
                instancePath.lineTo(175.50563f, 140.0f);
                instancePath.cubicTo(177.98781f, 140.0f, 180.0f, 137.9805f, 180.0f, 135.48083f);
                instancePath.lineTo(180.0f, 4.5191708f);
                instancePath.cubicTo(180.0f, 2.0233016f, 177.97852f, 0.0f, 175.50563f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
                instancePath.close();
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
