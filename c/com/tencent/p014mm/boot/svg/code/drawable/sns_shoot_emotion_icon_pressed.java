package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_emotion_icon_pressed */
public class sns_shoot_emotion_icon_pressed extends C24542c {
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
                instancePaint3.setColor(-7960954);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(37.78f, 0.0f);
                instancePath.lineTo(41.06f, 0.0f);
                Path path = instancePath;
                path.cubicTo(50.72f, 0.32f, 60.25f, 4.09f, 67.28f, 10.76f);
                path.cubicTo(74.82f, 17.7f, 79.36f, 27.62f, 80.0f, 37.82f);
                instancePath.lineTo(80.0f, 41.96f);
                Path path2 = instancePath;
                path2.cubicTo(79.4f, 53.2f, 73.96f, 64.11f, 65.11f, 71.1f);
                path2.cubicTo(58.68f, 76.45f, 50.49f, 79.36f, 42.2f, 80.0f);
                instancePath.lineTo(38.02f, 80.0f);
                Path path3 = instancePath;
                path3.cubicTo(29.65f, 79.43f, 21.38f, 76.49f, 14.9f, 71.1f);
                path3.cubicTo(5.88f, 63.97f, 0.36f, 52.77f, 0.0f, 41.29f);
                instancePath.lineTo(0.0f, 38.03f);
                Path path4 = instancePath;
                path4.cubicTo(0.57f, 27.75f, 5.14f, 17.73f, 12.73f, 10.75f);
                path4.cubicTo(19.48f, 4.33f, 28.54f, 0.68f, 37.78f, 0.0f);
                instancePath.lineTo(37.78f, 0.0f);
                instancePath.close();
                instancePath.moveTo(22.35f, 21.53f);
                path4.cubicTo(17.6f, 23.92f, 17.99f, 32.16f, 23.16f, 33.8f);
                path4.cubicTo(27.59f, 35.1f, 30.99f, 29.79f, 29.81f, 25.87f);
                path4.cubicTo(29.31f, 22.58f, 25.55f, 19.78f, 22.35f, 21.53f);
                instancePath.lineTo(22.35f, 21.53f);
                instancePath.close();
                instancePath.moveTo(53.4f, 21.51f);
                path4.cubicTo(48.31f, 23.96f, 49.12f, 33.05f, 54.92f, 33.96f);
                path4.cubicTo(59.09f, 34.44f, 61.82f, 29.6f, 60.82f, 25.93f);
                path4.cubicTo(60.35f, 22.64f, 56.62f, 19.79f, 53.4f, 21.51f);
                instancePath.lineTo(53.4f, 21.51f);
                instancePath.close();
                instancePath.moveTo(11.94f, 43.0f);
                path4.cubicTo(12.98f, 52.49f, 18.9f, 61.77f, 28.15f, 65.02f);
                path4.cubicTo(36.8f, 68.0f, 46.7f, 67.7f, 55.11f, 64.05f);
                path4.cubicTo(63.24f, 60.48f, 68.0f, 51.67f, 68.07f, 43.0f);
                path4.cubicTo(49.59f, 39.13f, 30.42f, 39.11f, 11.94f, 43.0f);
                instancePath.lineTo(11.94f, 43.0f);
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
