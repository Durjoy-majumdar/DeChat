package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_verify_back */
public class icons_verify_back extends C24542c {
    private final int height = 28;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 28;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.333333f, 0.0f, 1.0f, 2.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(11.666667f, 0.0f);
        Path path = instancePath;
        path.cubicTo(18.10999f, 0.0f, 23.333334f, 5.223345f, 23.333334f, 11.666667f);
        path.cubicTo(23.333334f, 18.10999f, 18.10999f, 23.333334f, 11.666667f, 23.333334f);
        path.cubicTo(5.223345f, 23.333334f, 0.0f, 18.10999f, 0.0f, 11.666667f);
        path.cubicTo(0.0f, 5.223345f, 5.223345f, 0.0f, 11.666667f, 0.0f);
        instancePath.close();
        instancePath.moveTo(12.778577f, 6.4166665f);
        instancePath.lineTo(8.384757f, 10.947684f);
        instancePath.cubicTo(8.006012f, 11.338256f, 7.9996977f, 11.988565f, 8.384757f, 12.385649f);
        instancePath.lineTo(8.384757f, 12.385649f);
        instancePath.lineTo(12.778577f, 16.916666f);
        instancePath.lineTo(13.99829f, 15.677083f);
        instancePath.lineTo(10.12697f, 11.666667f);
        instancePath.lineTo(13.99829f, 7.65625f);
        instancePath.lineTo(12.778577f, 6.4166665f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
