package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.doodle_unselected */
public class doodle_unselected extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 63;
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 31.39409f, 0.70710677f, 0.70710677f, -12.125177f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(25.405478f, 12.6148405f);
                instancePath.lineTo(25.645857f, 54.121506f);
                instancePath.lineTo(30.480642f, 63.385418f);
                instancePath.lineTo(35.31543f, 54.121506f);
                instancePath.lineTo(35.21498f, 12.6148405f);
                instancePath.lineTo(25.405478f, 12.6148405f);
                instancePath.close();
                instancePath.moveTo(25.389639f, 9.879872f);
                instancePath.lineTo(25.351372f, 3.272119f);
                instancePath.cubicTo(25.341805f, 1.6204139f, 26.683146f, 0.28144225f, 28.343227f, 0.28144225f);
                instancePath.lineTo(32.175957f, 0.28144225f);
                instancePath.cubicTo(33.83788f, 0.28144225f, 35.188385f, 1.6257602f, 35.19237f, 3.272119f);
                instancePath.lineTo(35.208363f, 9.879872f);
                instancePath.lineTo(25.389639f, 9.879872f);
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
