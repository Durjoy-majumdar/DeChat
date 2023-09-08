package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_endline */
public class icon_filled_endline extends C24542c {
    private final int height = 4;
    private final int width = 69;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 69;
        }
        if (i2 == 1) {
            return 4;
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
        instancePaint3.setColor(637534208);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -173.0f, 0.0f, 1.0f, -620.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 580.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 173.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.5f, 1.5f);
        instancePath.lineTo(24.5f, 1.5f);
        instancePath.lineTo(24.5f, 2.5f);
        instancePath.lineTo(0.5f, 2.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(44.5f, 1.5f);
        instancePath2.lineTo(68.5f, 1.5f);
        instancePath2.lineTo(68.5f, 2.5f);
        instancePath2.lineTo(44.5f, 2.5f);
        instancePath2.lineTo(44.5f, 1.5f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(34.5f, 0.0f);
        Path path = instancePath3;
        path.cubicTo(35.60457f, 0.0f, 36.5f, 0.89543045f, 36.5f, 2.0f);
        path.cubicTo(36.5f, 3.1045694f, 35.60457f, 4.0f, 34.5f, 4.0f);
        path.cubicTo(33.39543f, 4.0f, 32.5f, 3.1045694f, 32.5f, 2.0f);
        path.cubicTo(32.5f, 0.89543045f, 33.39543f, 0.0f, 34.5f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
