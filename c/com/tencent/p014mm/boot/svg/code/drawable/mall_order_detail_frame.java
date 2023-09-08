package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_order_detail_frame */
public class mall_order_detail_frame extends C24542c {
    private final int height = 159;
    private final int width = 159;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 159;
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
                instancePaint3.setColor(-16777216);
                canvas.saveLayerAlpha((RectF) null, 23, 31);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(69.69f, 0.0f);
                instancePath.lineTo(89.35f, 0.0f);
                Path path = instancePath;
                path.cubicTo(106.27f, 2.71f, 122.64f, 9.98f, 134.93f, 22.1f);
                path.cubicTo(148.15f, 34.62f, 156.22f, 51.83f, 159.0f, 69.7f);
                instancePath.lineTo(159.0f, 89.29f);
                Path path2 = instancePath;
                path2.cubicTo(156.38f, 106.0f, 149.23f, 122.14f, 137.43f, 134.4f);
                path2.cubicTo(124.86f, 147.9f, 107.45f, 156.17f, 89.34f, 159.0f);
                instancePath.lineTo(69.67f, 159.0f);
                Path path3 = instancePath;
                path3.cubicTo(54.38f, 156.5f, 39.5f, 150.47f, 27.73f, 140.23f);
                path3.cubicTo(12.48f, 127.48f, 2.96f, 108.82f, 0.0f, 89.29f);
                instancePath.lineTo(0.0f, 69.66f);
                Path path4 = instancePath;
                path4.cubicTo(2.74f, 52.26f, 10.43f, 35.46f, 23.1f, 23.05f);
                path4.cubicTo(35.51f, 10.39f, 52.3f, 2.75f, 69.69f, 0.0f);
                instancePath.lineTo(69.69f, 0.0f);
                instancePath.close();
                instancePath.moveTo(72.39f, 1.64f);
                path4.cubicTo(50.03f, 3.41f, 29.01f, 15.72f, 16.0f, 33.9f);
                path4.cubicTo(5.98f, 47.41f, 1.2f, 64.29f, 1.1f, 80.99f);
                path4.cubicTo(1.79f, 91.02f, 3.49f, 101.11f, 7.59f, 110.36f);
                path4.cubicTo(16.56f, 131.17f, 34.91f, 147.82f, 56.67f, 154.32f);
                path4.cubicTo(67.11f, 157.23f, 78.17f, 158.89f, 88.95f, 157.08f);
                path4.cubicTo(109.53f, 154.89f, 128.7f, 143.65f, 141.32f, 127.36f);
                path4.cubicTo(157.73f, 106.72f, 162.16f, 77.57f, 153.09f, 52.87f);
                path4.cubicTo(144.96f, 30.37f, 125.99f, 12.03f, 103.11f, 4.91f);
                path4.cubicTo(93.2f, 2.07f, 82.69f, 0.28f, 72.39f, 1.64f);
                instancePath.lineTo(72.39f, 1.64f);
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
