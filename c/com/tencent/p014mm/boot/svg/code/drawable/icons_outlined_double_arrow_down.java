package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_double_arrow_down */
public class icons_outlined_double_arrow_down extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.6f);
        canvas.save();
        Paint paint = instancePaint5;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 1.2246469E-16f, 24.0f, -1.2246469E-16f, -1.0f, 22.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.8369701E-16f, -1.0f, 24.0f, 1.0f, -1.8369701E-16f, 1.1021821E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 19.4375f);
        instancePath.lineTo(8.954533f, 20.5f);
        instancePath.lineTo(1.2894928f, 12.710085f);
        Paint paint2 = paint;
        Path path = instancePath;
        instancePath.cubicTo(0.9036102f, 12.317916f, 0.90844613f, 11.677169f, 1.2894928f, 11.289915f);
        path.lineTo(8.954533f, 3.5f);
        path.lineTo(10.0f, 4.5625f);
        path.lineTo(2.681726f, 12.0f);
        path.lineTo(10.0f, 19.4375f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint6);
        canvas.drawPath(path, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, -1.8369701E-16f, -1.0f, 24.0f, 1.0f, -1.8369701E-16f, 1.1021821E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint9 = C24542c.instancePaint(paint2, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.0f, 19.4375f);
        instancePath2.lineTo(8.954533f, 20.5f);
        instancePath2.lineTo(1.2894928f, 12.710085f);
        instancePath2.cubicTo(0.9036102f, 12.317916f, 0.90844613f, 11.677169f, 1.2894928f, 11.289915f);
        instancePath2.lineTo(8.954533f, 3.5f);
        instancePath2.lineTo(10.0f, 4.5625f);
        instancePath2.lineTo(2.681726f, 12.0f);
        instancePath2.lineTo(10.0f, 19.4375f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint8);
        canvas.drawPath(instancePath2, instancePaint9);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
