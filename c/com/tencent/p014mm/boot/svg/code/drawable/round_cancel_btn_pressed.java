package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.round_cancel_btn_pressed */
public class round_cancel_btn_pressed extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 120;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(Integer.MIN_VALUE);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(50.0f, 94.0f);
                Path path = instancePath;
                path.cubicTo(74.30053f, 94.0f, 94.0f, 74.30053f, 94.0f, 50.0f);
                path.cubicTo(94.0f, 25.69947f, 74.30053f, 6.0f, 50.0f, 6.0f);
                path.cubicTo(25.69947f, 6.0f, 6.0f, 25.69947f, 6.0f, 50.0f);
                path.cubicTo(6.0f, 74.30053f, 25.69947f, 94.0f, 50.0f, 94.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(50.0f, 100.0f);
                Path path2 = instancePath2;
                path2.cubicTo(22.385763f, 100.0f, 0.0f, 77.614235f, 0.0f, 50.0f);
                path2.cubicTo(0.0f, 22.385763f, 22.385763f, 0.0f, 50.0f, 0.0f);
                path2.cubicTo(77.614235f, 0.0f, 100.0f, 22.385763f, 100.0f, 50.0f);
                path2.cubicTo(100.0f, 77.614235f, 77.614235f, 100.0f, 50.0f, 100.0f);
                instancePath2.close();
                instancePath2.moveTo(50.0f, 94.0f);
                path2.cubicTo(74.30053f, 94.0f, 94.0f, 74.30053f, 94.0f, 50.0f);
                path2.cubicTo(94.0f, 25.69947f, 74.30053f, 6.0f, 50.0f, 6.0f);
                path2.cubicTo(25.69947f, 6.0f, 6.0f, 25.69947f, 6.0f, 50.0f);
                path2.cubicTo(6.0f, 74.30053f, 25.69947f, 94.0f, 50.0f, 94.0f);
                instancePath2.close();
                instancePath2.moveTo(54.24264f, 49.999996f);
                instancePath2.lineTo(69.79899f, 65.55635f);
                instancePath2.lineTo(65.55635f, 69.79899f);
                instancePath2.lineTo(50.0f, 54.242638f);
                instancePath2.lineTo(34.44365f, 69.79899f);
                instancePath2.lineTo(30.20101f, 65.55635f);
                instancePath2.lineTo(45.75736f, 49.999996f);
                instancePath2.lineTo(30.201012f, 34.44365f);
                instancePath2.lineTo(34.443653f, 30.20101f);
                instancePath2.lineTo(50.0f, 45.757355f);
                instancePath2.lineTo(65.55635f, 30.20101f);
                instancePath2.lineTo(69.79899f, 34.44365f);
                instancePath2.lineTo(54.24264f, 49.999996f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
