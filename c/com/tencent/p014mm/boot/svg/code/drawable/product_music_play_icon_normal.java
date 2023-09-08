package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.product_music_play_icon_normal */
public class product_music_play_icon_normal extends C24542c {
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
        instancePaint3.setColor(-6710887);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.88f, 0.0f);
        instancePath.lineTo(37.99f, 0.0f);
        Path path = instancePath;
        path.cubicTo(46.5f, 0.63f, 54.85f, 4.06f, 60.96f, 10.08f);
        path.cubicTo(67.43f, 16.24f, 71.33f, 24.85f, 72.0f, 33.73f);
        instancePath.lineTo(72.0f, 37.97f);
        Path path2 = instancePath;
        path2.cubicTo(71.44f, 46.97f, 67.49f, 55.71f, 60.95f, 61.93f);
        path2.cubicTo(54.91f, 67.87f, 46.69f, 71.3f, 38.29f, 72.0f);
        instancePath.lineTo(34.16f, 72.0f);
        Path path3 = instancePath;
        path3.cubicTo(25.58f, 71.47f, 17.17f, 67.95f, 11.02f, 61.9f);
        path3.cubicTo(4.53f, 55.72f, 0.62f, 47.06f, 0.0f, 38.14f);
        instancePath.lineTo(0.0f, 34.2f);
        path3.cubicTo(0.52f, 24.67f, 4.91f, 15.44f, 12.08f, 9.12f);
        path3.cubicTo(18.04f, 3.69f, 25.89f, 0.64f, 33.88f, 0.0f);
        instancePath.lineTo(33.88f, 0.0f);
        instancePath.close();
        instancePath.moveTo(29.41f, 3.66f);
        path3.cubicTo(22.9f, 5.01f, 16.79f, 8.34f, 12.2f, 13.16f);
        path3.cubicTo(1.73f, 23.69f, -0.01f, 41.47f, 8.24f, 53.82f);
        path3.cubicTo(16.74f, 67.7f, 36.16f, 73.15f, 50.6f, 65.58f);
        path3.cubicTo(65.28f, 58.72f, 72.84f, 40.21f, 67.13f, 25.04f);
        path3.cubicTo(62.1f, 9.87f, 45.03f, 0.13f, 29.41f, 3.66f);
        instancePath.lineTo(29.41f, 3.66f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(26.0f, 19.01f);
        Path path4 = instancePath2;
        path4.cubicTo(35.33f, 24.67f, 44.66f, 30.33f, 53.99f, 36.0f);
        path4.cubicTo(44.67f, 41.67f, 35.34f, 47.33f, 26.0f, 52.99f);
        instancePath2.lineTo(26.0f, 19.01f);
        instancePath2.lineTo(26.0f, 19.01f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
