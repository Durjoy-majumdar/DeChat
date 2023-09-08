package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_icon */
public class more_icon extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.75f, 2.0f);
                Path path = instancePath;
                path.cubicTo(3.75f, 2.96635f, 2.96635f, 3.75f, 2.0f, 3.75f);
                path.cubicTo(1.03365f, 3.75f, 0.25f, 2.96635f, 0.25f, 2.0f);
                path.cubicTo(0.25f, 1.0333f, 1.03365f, 0.25f, 2.0f, 0.25f);
                path.cubicTo(2.96635f, 0.25f, 3.75f, 1.0333f, 3.75f, 2.0f);
                instancePath.close();
                instancePath.moveTo(9.0f, 0.25f);
                Path path2 = instancePath;
                path2.cubicTo(9.96635f, 0.25f, 10.75f, 1.0333f, 10.75f, 2.0f);
                path2.cubicTo(10.75f, 2.96635f, 9.96635f, 3.75f, 9.0f, 3.75f);
                path2.cubicTo(8.03365f, 3.75f, 7.25f, 2.96635f, 7.25f, 2.0f);
                path2.cubicTo(7.25f, 1.0333f, 8.03365f, 0.25f, 9.0f, 0.25f);
                instancePath.close();
                instancePath.moveTo(16.0f, 0.25f);
                Path path3 = instancePath;
                path3.cubicTo(16.96635f, 0.25f, 17.75f, 1.0333f, 17.75f, 2.0f);
                path3.cubicTo(17.75f, 2.96635f, 16.96635f, 3.75f, 16.0f, 3.75f);
                path3.cubicTo(15.03365f, 3.75f, 14.25f, 2.96635f, 14.25f, 2.0f);
                path3.cubicTo(14.25f, 1.0333f, 15.03365f, 0.25f, 16.0f, 0.25f);
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
