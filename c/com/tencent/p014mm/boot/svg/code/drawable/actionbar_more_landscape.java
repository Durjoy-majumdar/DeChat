package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_more_landscape */
public class actionbar_more_landscape extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 90;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -245.0f, 0.0f, 1.0f, -283.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 245.0f, 0.0f, 1.0f, 283.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(2113929216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(90.0f, 0.0f);
                instancePath.lineTo(90.0f, 90.0f);
                instancePath.lineTo(0.0f, 90.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(45.0f, 27.0f);
                Path path = instancePath2;
                path.cubicTo(47.761425f, 27.0f, 50.0f, 24.761423f, 50.0f, 22.0f);
                path.cubicTo(50.0f, 19.238577f, 47.761425f, 17.0f, 45.0f, 17.0f);
                path.cubicTo(42.238575f, 17.0f, 40.0f, 19.238577f, 40.0f, 22.0f);
                path.cubicTo(40.0f, 24.761423f, 42.238575f, 27.0f, 45.0f, 27.0f);
                instancePath2.close();
                instancePath2.moveTo(45.0f, 50.0f);
                Path path2 = instancePath2;
                path2.cubicTo(47.761425f, 50.0f, 50.0f, 47.761425f, 50.0f, 45.0f);
                path2.cubicTo(50.0f, 42.238575f, 47.761425f, 40.0f, 45.0f, 40.0f);
                path2.cubicTo(42.238575f, 40.0f, 40.0f, 42.238575f, 40.0f, 45.0f);
                path2.cubicTo(40.0f, 47.761425f, 42.238575f, 50.0f, 45.0f, 50.0f);
                instancePath2.close();
                instancePath2.moveTo(45.0f, 73.0f);
                Path path3 = instancePath2;
                path3.cubicTo(47.761425f, 73.0f, 50.0f, 70.76142f, 50.0f, 68.0f);
                path3.cubicTo(50.0f, 65.23858f, 47.761425f, 63.0f, 45.0f, 63.0f);
                path3.cubicTo(42.238575f, 63.0f, 40.0f, 65.23858f, 40.0f, 68.0f);
                path3.cubicTo(40.0f, 70.76142f, 42.238575f, 73.0f, 45.0f, 73.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
