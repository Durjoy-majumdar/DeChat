package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.info_icon */
public class info_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-4868683);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 23.0f, 0.0f, 1.0f, 23.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(20.43f, 0.56f);
                Path path = instancePath;
                path.cubicTo(26.75f, -0.88f, 33.58f, 0.53f, 38.89f, 4.21f);
                path.cubicTo(47.37f, 10.01f, 51.78f, 21.3f, 49.26f, 31.28f);
                path.cubicTo(47.01f, 40.43f, 39.16f, 47.82f, 29.91f, 49.59f);
                path.cubicTo(17.72f, 51.88f, 4.26f, 44.13f, 0.95f, 32.0f);
                path.cubicTo(-3.19f, 18.46f, 6.49f, 2.93f, 20.43f, 0.56f);
                instancePath.lineTo(20.43f, 0.56f);
                instancePath.close();
                instancePath.moveTo(20.46f, 3.53f);
                path.cubicTo(11.63f, 5.29f, 4.4f, 13.0f, 3.28f, 21.94f);
                path.cubicTo(2.12f, 29.59f, 5.43f, 37.68f, 11.58f, 42.35f);
                path.cubicTo(17.99f, 47.43f, 27.32f, 48.37f, 34.62f, 44.71f);
                path.cubicTo(41.38f, 41.48f, 46.2f, 34.55f, 46.83f, 27.08f);
                path.cubicTo(47.61f, 19.72f, 44.29f, 12.11f, 38.4f, 7.64f);
                path.cubicTo(33.4f, 3.72f, 26.66f, 2.21f, 20.46f, 3.53f);
                instancePath.lineTo(20.46f, 3.53f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(24.26f, 11.33f);
                Path path2 = instancePath2;
                path2.cubicTo(27.01f, 9.64f, 29.55f, 14.15f, 26.77f, 15.67f);
                path2.cubicTo(24.01f, 17.4f, 21.42f, 12.82f, 24.26f, 11.33f);
                instancePath2.lineTo(24.26f, 11.33f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(21.0f, 19.0f);
                Path path3 = instancePath3;
                path3.cubicTo(23.29f, 19.0f, 25.58f, 19.0f, 27.87f, 19.01f);
                path3.cubicTo(27.86f, 25.15f, 27.86f, 31.3f, 27.86f, 37.45f);
                path3.cubicTo(28.91f, 37.46f, 29.95f, 37.47f, 31.0f, 37.48f);
                instancePath3.lineTo(31.0f, 38.99f);
                instancePath3.cubicTo(27.67f, 39.0f, 24.33f, 39.0f, 21.0f, 38.99f);
                instancePath3.lineTo(21.0f, 37.49f);
                Path path4 = instancePath3;
                path4.cubicTo(22.05f, 37.47f, 23.1f, 37.44f, 24.15f, 37.4f);
                path4.cubicTo(24.12f, 31.78f, 24.15f, 26.17f, 24.14f, 20.55f);
                path4.cubicTo(23.09f, 20.54f, 22.05f, 20.53f, 21.0f, 20.53f);
                instancePath3.lineTo(21.0f, 19.0f);
                instancePath3.lineTo(21.0f, 19.0f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint6);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
