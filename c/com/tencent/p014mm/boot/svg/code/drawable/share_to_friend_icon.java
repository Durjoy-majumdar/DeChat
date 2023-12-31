package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.share_to_friend_icon */
public class share_to_friend_icon extends C24542c {
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
                instancePaint3.setColor(-12799249);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(27.39f, 1.59f);
                Path path = instancePath;
                path.cubicTo(34.1f, -0.34f, 42.03f, 2.41f, 45.55f, 8.57f);
                path.cubicTo(50.69f, 17.75f, 47.8f, 30.26f, 40.07f, 37.12f);
                path.cubicTo(38.37f, 38.32f, 38.73f, 41.26f, 40.63f, 42.07f);
                path.cubicTo(48.12f, 45.88f, 55.8f, 50.27f, 60.7f, 57.32f);
                path.cubicTo(63.44f, 60.98f, 63.18f, 65.75f, 62.92f, 70.07f);
                path.cubicTo(62.88f, 71.98f, 60.86f, 73.2f, 59.09f, 72.98f);
                path.cubicTo(41.02f, 73.01f, 22.93f, 73.01f, 4.86f, 72.98f);
                path.cubicTo(3.09f, 73.2f, 1.11f, 71.94f, 1.08f, 70.05f);
                path.cubicTo(0.85f, 65.98f, 0.57f, 61.52f, 2.96f, 57.98f);
                path.cubicTo(7.67f, 50.59f, 15.53f, 46.13f, 23.04f, 42.09f);
                path.cubicTo(25.09f, 41.02f, 25.02f, 38.06f, 23.18f, 36.81f);
                path.cubicTo(16.97f, 30.9f, 14.24f, 21.58f, 16.21f, 13.24f);
                path.cubicTo(17.51f, 7.74f, 21.84f, 2.97f, 27.39f, 1.59f);
                instancePath.lineTo(27.39f, 1.59f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(57.39f, 12.35f);
                Path path2 = instancePath2;
                path2.cubicTo(61.78f, 5.69f, 72.63f, 5.2f, 77.63f, 11.4f);
                path2.cubicTo(82.95f, 18.02f, 81.57f, 28.16f, 76.57f, 34.55f);
                path2.cubicTo(75.23f, 36.15f, 72.17f, 38.3f, 74.42f, 40.47f);
                path2.cubicTo(80.64f, 43.86f, 87.25f, 47.44f, 91.24f, 53.54f);
                path2.cubicTo(93.55f, 56.87f, 93.11f, 61.13f, 92.88f, 64.96f);
                path2.cubicTo(92.77f, 66.27f, 91.38f, 67.11f, 90.15f, 66.98f);
                path2.cubicTo(82.44f, 67.05f, 74.73f, 66.97f, 67.02f, 67.0f);
                path2.cubicTo(66.74f, 57.77f, 60.71f, 49.78f, 52.66f, 45.67f);
                path2.cubicTo(55.44f, 43.69f, 58.58f, 42.3f, 61.36f, 40.34f);
                path2.cubicTo(62.61f, 39.12f, 61.92f, 37.31f, 60.74f, 36.34f);
                path2.cubicTo(54.71f, 30.25f, 52.54f, 19.75f, 57.39f, 12.35f);
                instancePath2.lineTo(57.39f, 12.35f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
