package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_writeicon */
public class friendactivity_writeicon extends C24542c {
    private final int height = 36;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 40;
        }
        if (i2 == 1) {
            return 36;
        }
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
            instancePaint3.setColor(-11048043);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(2.95f, 1.02f);
            Path path = instancePath;
            path.cubicTo(12.96f, 0.94f, 22.98f, 1.06f, 32.99f, 0.97f);
            path.cubicTo(34.31f, 1.13f, 36.14f, 0.52f, 36.9f, 2.0f);
            path.cubicTo(37.18f, 8.98f, 36.88f, 15.98f, 37.03f, 22.97f);
            path.cubicTo(36.86f, 24.28f, 37.48f, 26.12f, 36.02f, 26.9f);
            path.cubicTo(28.94f, 27.17f, 21.85f, 26.9f, 14.76f, 27.0f);
            path.cubicTo(12.19f, 28.76f, 9.6f, 30.48f, 7.0f, 32.2f);
            path.cubicTo(7.0f, 30.47f, 6.99f, 28.75f, 7.0f, 27.02f);
            path.cubicTo(5.09f, 26.72f, 2.45f, 27.83f, 1.1f, 26.03f);
            path.cubicTo(0.84f, 18.67f, 1.09f, 11.3f, 0.98f, 3.93f);
            path.cubicTo(0.79f, 2.67f, 1.23f, 0.69f, 2.95f, 1.02f);
            instancePath.close();
            instancePath.moveTo(5.0f, 5.0f);
            instancePath.lineTo(5.0f, 23.0f);
            instancePath.lineTo(9.99f, 23.0f);
            Path path2 = instancePath;
            path2.cubicTo(9.99f, 23.67f, 10.0f, 25.03f, 10.0f, 25.7f);
            path2.cubicTo(10.93f, 24.8f, 11.84f, 23.9f, 12.75f, 22.99f);
            path2.cubicTo(19.5f, 23.01f, 26.25f, 23.0f, 33.0f, 23.0f);
            instancePath.lineTo(33.0f, 5.0f);
            instancePath.lineTo(5.0f, 5.0f);
            instancePath.lineTo(5.0f, 5.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
