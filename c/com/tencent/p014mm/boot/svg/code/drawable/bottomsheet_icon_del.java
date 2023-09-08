package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_del */
public class bottomsheet_icon_del extends C24542c {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(53.00009f, 8.0f);
                instancePath.lineTo(45.00009f, 0.0f);
                instancePath.lineTo(20.00009f, 0.0f);
                instancePath.lineTo(12.000091f, 8.0f);
                instancePath.lineTo(9.0277776E-5f, 8.0f);
                instancePath.lineTo(9.0277776E-5f, 16.0f);
                instancePath.lineTo(65.00009f, 16.0f);
                instancePath.lineTo(65.00009f, 8.0f);
                instancePath.lineTo(53.00009f, 8.0f);
                instancePath.close();
                instancePath.moveTo(12.000091f, 67.0f);
                instancePath.lineTo(20.00009f, 67.0f);
                instancePath.lineTo(20.00009f, 31.0f);
                instancePath.lineTo(12.000091f, 31.0f);
                instancePath.lineTo(12.000091f, 67.0f);
                instancePath.close();
                instancePath.moveTo(28.00009f, 67.0f);
                instancePath.lineTo(36.00009f, 67.0f);
                instancePath.lineTo(36.00009f, 31.0f);
                instancePath.lineTo(28.00009f, 31.0f);
                instancePath.lineTo(28.00009f, 67.0f);
                instancePath.close();
                instancePath.moveTo(45.00009f, 67.0f);
                instancePath.lineTo(53.00009f, 67.0f);
                instancePath.lineTo(53.00009f, 31.0f);
                instancePath.lineTo(45.00009f, 31.0f);
                instancePath.lineTo(45.00009f, 67.0f);
                instancePath.close();
                instancePath.moveTo(4.00009f, 68.0f);
                instancePath.cubicTo(4.00009f, 74.53162f, 9.468924f, 80.0f, 16.00009f, 80.0f);
                instancePath.lineTo(49.00009f, 80.0f);
                instancePath.cubicTo(55.531708f, 80.0f, 61.00009f, 74.53162f, 61.00009f, 68.0f);
                instancePath.lineTo(61.00009f, 23.0f);
                instancePath.lineTo(4.00009f, 23.0f);
                instancePath.lineTo(4.00009f, 68.0f);
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
