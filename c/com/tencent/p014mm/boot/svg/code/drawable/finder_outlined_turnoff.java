package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outlined_turnoff */
public class finder_outlined_turnoff extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint4.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.8f, 0.9f);
        instancePath.lineTo(3.8f, 19.5f);
        instancePath.lineTo(0.2f, 19.5f);
        instancePath.lineTo(0.2f, 0.9f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.6f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(22.675255f, 20.968033f);
        Path path = instancePath2;
        path.cubicTo(17.988972f, 24.819468f, 15.0f, 30.660679f, 15.0f, 37.2f);
        path.cubicTo(15.0f, 48.79798f, 24.40202f, 58.2f, 36.0f, 58.2f);
        path.cubicTo(47.59798f, 58.2f, 57.0f, 48.79798f, 57.0f, 37.2f);
        path.cubicTo(57.0f, 30.684082f, 54.032383f, 24.861288f, 49.374996f, 21.009462f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
