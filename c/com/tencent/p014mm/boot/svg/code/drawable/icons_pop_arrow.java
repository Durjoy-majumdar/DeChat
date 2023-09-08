package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_pop_arrow */
public class icons_pop_arrow extends C24542c {
    private final int height = 16;
    private final int width = 42;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 42;
        }
        if (i2 == 1) {
            return 16;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-11776948);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -6.123234E-17f, -1.0f, 25.5f, -1.0f, 6.123234E-17f, 25.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(25.5f, -16.5f);
            instancePath.cubicTo(25.5f, -10.98989f, 23.99602f, -9.600116f, 22.15751f, -7.8845377f);
            instancePath.lineTo(12.007299f, 1.5869969f);
            instancePath.cubicTo(9.997109f, 3.4627786f, 9.998025f, 6.4531126f, 12.007299f, 8.32804f);
            instancePath.lineTo(22.15751f, 17.799574f);
            instancePath.cubicTo(23.999258f, 19.518175f, 25.5f, 22.850643f, 25.5f, 25.39781f);
            instancePath.lineTo(31.5f, 25.5f);
            instancePath.lineTo(31.5f, -16.5f);
            instancePath.lineTo(25.5f, -16.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
