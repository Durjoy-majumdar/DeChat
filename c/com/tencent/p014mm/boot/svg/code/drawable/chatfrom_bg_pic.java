package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatfrom_bg_pic */
public class chatfrom_bg_pic extends C24542c {
    private final int height = 294;
    private final int width = 300;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 300;
        }
        if (i2 == 1) {
            return 294;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-657931);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 15.00912f);
        Path path = instancePath;
        path.cubicTo(0.0f, 6.719812f, 6.722175f, 0.0f, 15.005396f, 0.0f);
        instancePath.lineTo(284.9946f, 0.0f);
        path.cubicTo(293.28186f, 0.0f, 300.0f, 6.710611f, 300.0f, 15.00912f);
        instancePath.lineTo(300.0f, 278.99088f);
        path.cubicTo(300.0f, 287.28018f, 293.27783f, 294.0f, 284.9946f, 294.0f);
        instancePath.lineTo(15.005396f, 294.0f);
        path.cubicTo(6.718145f, 294.0f, 0.0f, 287.2894f, 0.0f, 278.99088f);
        instancePath.lineTo(0.0f, 15.00912f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 64.0f, 0.0f, 1.0f, 83.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-3552823);
        instancePaint5.setStrokeWidth(20.0f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 2.0f);
        instancePath2.cubicTo(0.0f, 0.89543045f, 0.89543045f, 0.0f, 2.0f, 0.0f);
        instancePath2.lineTo(163.0f, 0.0f);
        instancePath2.cubicTo(164.10457f, 0.0f, 165.0f, 0.89543045f, 165.0f, 2.0f);
        instancePath2.lineTo(165.0f, 118.0f);
        instancePath2.cubicTo(165.0f, 119.10457f, 164.10457f, 120.0f, 163.0f, 120.0f);
        instancePath2.lineTo(2.0f, 120.0f);
        instancePath2.cubicTo(0.89543045f, 120.0f, 0.0f, 119.10457f, 0.0f, 118.0f);
        instancePath2.lineTo(0.0f, 2.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-3552823);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(126.73595f, 64.14897f);
        instancePath3.lineTo(103.837265f, 81.98572f);
        instancePath3.lineTo(111.876335f, 98.63208f);
        instancePath3.lineTo(55.73088f, 46.75f);
        instancePath3.lineTo(2.75f, 96.57307f);
        instancePath3.lineTo(2.75f, 119.245766f);
        instancePath3.lineTo(162.59375f, 119.245766f);
        instancePath3.lineTo(162.59375f, 96.57307f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
