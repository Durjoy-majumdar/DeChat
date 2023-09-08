package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_search_waiting */
public class radar_search_waiting extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 48;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.9f, 0.0f);
                instancePath.lineTo(34.1f, 0.0f);
                Path path = instancePath;
                path.cubicTo(33.86f, 7.5f, 29.44f, 14.06f, 24.1f, 19.0f);
                path.cubicTo(29.21f, 23.71f, 33.38f, 29.87f, 34.09f, 36.94f);
                path.cubicTo(23.03f, 37.05f, 11.96f, 37.01f, 0.9f, 36.97f);
                path.cubicTo(1.62f, 29.89f, 5.78f, 23.72f, 10.9f, 19.01f);
                path.cubicTo(5.57f, 14.06f, 1.14f, 7.5f, 0.9f, 0.0f);
                instancePath.lineTo(0.9f, 0.0f);
                instancePath.close();
                instancePath.moveTo(8.27f, 6.01f);
                path.cubicTo(10.16f, 10.93f, 16.03f, 13.56f, 16.48f, 19.02f);
                path.cubicTo(16.19f, 24.12f, 10.8f, 26.53f, 8.87f, 30.95f);
                path.cubicTo(14.62f, 31.03f, 20.37f, 31.03f, 26.12f, 30.94f);
                path.cubicTo(24.2f, 26.52f, 18.8f, 24.11f, 18.52f, 19.01f);
                path.cubicTo(18.99f, 13.55f, 24.84f, 10.93f, 26.73f, 6.01f);
                path.cubicTo(20.58f, 6.0f, 14.42f, 6.0f, 8.27f, 6.01f);
                instancePath.lineTo(8.27f, 6.01f);
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
