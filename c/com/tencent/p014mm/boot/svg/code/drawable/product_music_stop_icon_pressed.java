package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.product_music_stop_icon_pressed */
public class product_music_stop_icon_pressed extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-9276814);
        canvas.saveLayerAlpha((RectF) null, 128, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.94f, 0.0f);
        instancePath.lineTo(37.86f, 0.0f);
        Path path = instancePath;
        path.cubicTo(45.96f, 0.56f, 53.93f, 3.66f, 59.96f, 9.15f);
        path.cubicTo(67.07f, 15.44f, 71.42f, 24.59f, 72.0f, 34.05f);
        instancePath.lineTo(72.0f, 37.83f);
        Path path2 = instancePath;
        path2.cubicTo(71.46f, 47.59f, 66.85f, 57.03f, 59.39f, 63.35f);
        path2.cubicTo(53.54f, 68.46f, 45.97f, 71.35f, 38.26f, 72.0f);
        instancePath.lineTo(34.11f, 72.0f);
        Path path3 = instancePath;
        path3.cubicTo(25.1f, 71.45f, 16.32f, 67.55f, 10.09f, 60.97f);
        path3.cubicTo(4.16f, 54.9f, 0.65f, 46.69f, 0.0f, 38.25f);
        instancePath.lineTo(0.0f, 34.13f);
        path3.cubicTo(0.55f, 24.37f, 5.18f, 14.93f, 12.65f, 8.61f);
        path3.cubicTo(18.55f, 3.47f, 26.18f, 0.61f, 33.94f, 0.0f);
        instancePath.lineTo(33.94f, 0.0f);
        instancePath.close();
        instancePath.moveTo(29.4f, 3.66f);
        path3.cubicTo(23.12f, 4.97f, 17.2f, 8.12f, 12.68f, 12.67f);
        path3.cubicTo(2.03f, 22.96f, -0.12f, 40.65f, 7.83f, 53.16f);
        path3.cubicTo(16.0f, 67.24f, 35.31f, 73.15f, 49.93f, 65.9f);
        path3.cubicTo(64.75f, 59.37f, 72.74f, 41.04f, 67.36f, 25.73f);
        path3.cubicTo(62.61f, 10.2f, 45.28f, 0.06f, 29.4f, 3.66f);
        instancePath.lineTo(29.4f, 3.66f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 24.0f);
        instancePath2.lineTo(48.0f, 24.0f);
        instancePath2.lineTo(48.0f, 48.0f);
        instancePath2.lineTo(24.0f, 48.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
