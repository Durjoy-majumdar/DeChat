package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_sendinvitation */
public class icons_outlined_sendinvitation extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, -2.4492937E-16f, 2.7f, 2.4492937E-16f, 1.0f, 3.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.193228f, 11.500111f);
        instancePath.lineTo(16.2968f, 1.497872f);
        instancePath.lineTo(6.2928934f, 1.597385f);
        instancePath.lineTo(6.2928934f, 2.1094485E-15f);
        instancePath.lineTo(17.793005f, 0.0f);
        instancePath.lineTo(17.793005f, 11.470228f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -0.70710677f, 0.70710677f, 8.243742f, -0.70710677f, -0.70710677f, 21.708208f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(7.8177876f, -2.2406225f);
        instancePath2.lineTo(9.417788f, -2.2406225f);
        instancePath2.lineTo(9.417788f, 20.534163f);
        instancePath2.lineTo(7.8177876f, 20.534163f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(24.0f, 0.0f);
        instancePath3.lineTo(24.0f, 24.0f);
        instancePath3.lineTo(0.0f, 24.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        C24542c.done(looper);
        return 0;
    }
}
