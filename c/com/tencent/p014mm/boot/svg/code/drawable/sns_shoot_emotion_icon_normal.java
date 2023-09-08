package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_emotion_icon_normal */
public class sns_shoot_emotion_icon_normal extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 80;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                C24542c.instanceMatrix(looper);
                C24542c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-11316397);
                canvas.saveLayerAlpha((RectF) null, 192, 31);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(37.22f, 0.0f);
                instancePath.lineTo(41.24f, 0.0f);
                Path path = instancePath;
                path.cubicTo(51.3f, 0.4f, 61.21f, 4.53f, 68.29f, 11.75f);
                path.cubicTo(75.07f, 18.41f, 79.06f, 27.57f, 80.0f, 36.98f);
                instancePath.lineTo(80.0f, 42.08f);
                Path path2 = instancePath;
                path2.cubicTo(79.34f, 53.27f, 73.92f, 64.13f, 65.09f, 71.1f);
                path2.cubicTo(58.82f, 76.35f, 50.85f, 79.17f, 42.77f, 80.0f);
                instancePath.lineTo(37.53f, 80.0f);
                Path path3 = instancePath;
                path3.cubicTo(29.35f, 79.27f, 21.28f, 76.41f, 14.93f, 71.12f);
                path3.cubicTo(5.92f, 64.01f, 0.41f, 52.84f, 0.0f, 41.39f);
                instancePath.lineTo(0.0f, 37.28f);
                Path path4 = instancePath;
                path4.cubicTo(0.83f, 27.74f, 4.89f, 18.45f, 11.75f, 11.72f);
                path4.cubicTo(18.45f, 4.85f, 27.73f, 0.92f, 37.22f, 0.0f);
                instancePath.lineTo(37.22f, 0.0f);
                instancePath.lineTo(37.22f, 0.0f);
                instancePath.close();
                instancePath.moveTo(22.36f, 21.51f);
                path4.cubicTo(17.63f, 23.88f, 17.96f, 32.09f, 23.09f, 33.78f);
                path4.cubicTo(27.53f, 35.16f, 30.98f, 29.87f, 29.83f, 25.92f);
                path4.cubicTo(29.37f, 22.59f, 25.58f, 19.78f, 22.36f, 21.51f);
                instancePath.lineTo(22.36f, 21.51f);
                instancePath.lineTo(22.36f, 21.51f);
                instancePath.close();
                instancePath.moveTo(53.42f, 21.49f);
                path4.cubicTo(48.62f, 23.81f, 48.94f, 32.09f, 54.09f, 33.78f);
                path4.cubicTo(58.54f, 35.16f, 61.99f, 29.86f, 60.82f, 25.91f);
                path4.cubicTo(60.36f, 22.61f, 56.63f, 19.81f, 53.42f, 21.49f);
                instancePath.lineTo(53.42f, 21.49f);
                instancePath.lineTo(53.42f, 21.49f);
                instancePath.close();
                instancePath.moveTo(11.95f, 42.99f);
                path4.cubicTo(12.95f, 52.73f, 19.22f, 62.19f, 28.79f, 65.26f);
                path4.cubicTo(37.5f, 67.98f, 47.39f, 67.67f, 55.7f, 63.77f);
                path4.cubicTo(63.52f, 60.07f, 68.0f, 51.44f, 68.08f, 42.99f);
                path4.cubicTo(49.6f, 39.13f, 30.42f, 39.11f, 11.95f, 42.99f);
                instancePath.lineTo(11.95f, 42.99f);
                instancePath.lineTo(11.95f, 42.99f);
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
