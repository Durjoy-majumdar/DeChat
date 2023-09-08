package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_detail_movie_icon_hl */
public class scan_detail_movie_icon_hl extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-1);
        canvas.saveLayerAlpha((RectF) null, 192, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(57.64f, 0.0f);
        instancePath.lineTo(62.28f, 0.0f);
        Path path = instancePath;
        path.cubicTo(76.76f, 0.59f, 90.96f, 6.52f, 101.4f, 16.59f);
        path.cubicTo(112.61f, 27.16f, 119.33f, 42.17f, 120.0f, 57.54f);
        instancePath.lineTo(120.0f, 62.43f);
        Path path2 = instancePath;
        path2.cubicTo(119.34f, 77.55f, 112.85f, 92.35f, 101.95f, 102.89f);
        path2.cubicTo(91.57f, 113.17f, 77.33f, 119.24f, 62.78f, 120.0f);
        instancePath.lineTo(57.65f, 120.0f);
        Path path3 = instancePath;
        path3.cubicTo(42.48f, 119.36f, 27.64f, 112.85f, 17.09f, 101.92f);
        path3.cubicTo(6.78f, 91.48f, 0.68f, 77.16f, 0.0f, 62.53f);
        instancePath.lineTo(0.0f, 57.62f);
        path3.cubicTo(0.63f, 42.94f, 6.74f, 28.56f, 17.08f, 18.09f);
        path3.cubicTo(27.63f, 7.16f, 42.47f, 0.64f, 57.64f, 0.0f);
        instancePath.lineTo(57.64f, 0.0f);
        instancePath.close();
        instancePath.moveTo(51.51f, 4.65f);
        path3.cubicTo(36.05f, 6.93f, 21.8f, 16.1f, 13.25f, 29.18f);
        path3.cubicTo(4.8f, 41.83f, 1.96f, 58.0f, 5.48f, 72.79f);
        path3.cubicTo(8.55f, 86.14f, 16.78f, 98.19f, 28.04f, 105.97f);
        path3.cubicTo(39.28f, 113.88f, 53.5f, 117.33f, 67.12f, 115.54f);
        path3.cubicTo(82.63f, 113.66f, 97.09f, 104.84f, 105.96f, 91.99f);
        path3.cubicTo(114.35f, 80.09f, 117.7f, 64.82f, 115.18f, 50.48f);
        path3.cubicTo(112.74f, 35.87f, 104.15f, 22.44f, 91.97f, 14.03f);
        path3.cubicTo(80.35f, 5.86f, 65.54f, 2.46f, 51.51f, 4.65f);
        instancePath.lineTo(51.51f, 4.65f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(42.01f, 32.0f);
        Path path4 = instancePath2;
        path4.cubicTo(57.33f, 41.35f, 72.67f, 50.66f, 87.99f, 60.0f);
        path4.cubicTo(72.67f, 69.34f, 57.34f, 78.67f, 42.01f, 87.99f);
        path4.cubicTo(42.0f, 69.33f, 41.99f, 50.67f, 42.01f, 32.0f);
        instancePath2.lineTo(42.01f, 32.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
