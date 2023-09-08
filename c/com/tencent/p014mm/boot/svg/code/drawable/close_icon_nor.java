package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.close_icon_nor */
public class close_icon_nor extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -0.70710677f, -0.70710677f, 131.874f, 0.70710677f, -0.70710677f, 32.16815f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(85.83542f, 16.085417f);
                instancePath.cubicTo(86.106865f, 16.356863f, 86.27476f, 16.731863f, 86.27476f, 17.146076f);
                instancePath.lineTo(86.27476f, 69.64608f);
                instancePath.cubicTo(86.27476f, 70.4745f, 85.60318f, 71.14608f, 84.77476f, 71.14608f);
                instancePath.lineTo(81.77476f, 71.14608f);
                instancePath.cubicTo(80.94633f, 71.14608f, 80.27476f, 70.4745f, 80.27476f, 69.64608f);
                instancePath.lineTo(80.27476f, 21.646076f);
                instancePath.lineTo(33.774757f, 21.646076f);
                instancePath.cubicTo(32.94633f, 21.646076f, 32.274757f, 20.974504f, 32.274757f, 20.146076f);
                instancePath.lineTo(32.274757f, 17.146076f);
                instancePath.cubicTo(32.274757f, 16.31765f, 32.94633f, 15.646077f, 33.774757f, 15.646077f);
                instancePath.lineTo(84.77476f, 15.646077f);
                instancePath.cubicTo(85.18897f, 15.646077f, 85.56397f, 15.81397f, 85.83542f, 16.085417f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
