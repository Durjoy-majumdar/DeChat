package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.diehua */
public class diehua extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-855638017);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(35.200096f, 1.3362876f);
                instancePath.cubicTo(35.713497f, 1.873547f, 36.0f, 2.5880585f, 36.0f, 3.331179f);
                instancePath.lineTo(36.0f, 32.639317f);
                Path path = instancePath;
                path.cubicTo(36.0f, 34.23404f, 34.707222f, 35.526817f, 33.1125f, 35.526817f);
                path.cubicTo(32.36938f, 35.526817f, 31.654867f, 35.240314f, 31.117609f, 34.726913f);
                instancePath.lineTo(17.912905f, 22.108675f);
                instancePath.lineTo(4.9219f, 34.66337f);
                Path path2 = instancePath;
                path2.cubicTo(3.775109f, 35.771523f, 1.9471134f, 35.740204f, 0.83895725f, 34.593414f);
                path2.cubicTo(0.31870332f, 34.055023f, 0.027905475f, 33.335606f, 0.027905475f, 32.586918f);
                instancePath.lineTo(0.027905475f, 3.3835757f);
                Path path3 = instancePath;
                path3.cubicTo(0.027905475f, 1.7888535f, 1.3206832f, 0.49607575f, 2.9154055f, 0.49607575f);
                path3.cubicTo(3.664091f, 0.49607575f, 4.3835077f, 0.7868736f, 4.9219f, 1.3071276f);
                instancePath.lineTo(17.912905f, 13.860674f);
                instancePath.lineTo(31.117609f, 1.2435809f);
                instancePath.cubicTo(32.270557f, 0.1418329f, 34.09835f, 0.18333909f, 35.200096f, 1.3362876f);
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
