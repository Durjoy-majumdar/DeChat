package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.product_media_play_btn_normal */
public class product_media_play_btn_normal extends C24542c {
    private final int height = 180;
    private final int width = 180;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 180;
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
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(87.2f, 0.0f);
        instancePath.lineTo(92.22f, 0.0f);
        Path path = instancePath;
        path.cubicTo(113.42f, 0.53f, 134.32f, 8.75f, 150.06f, 22.99f);
        path.cubicTo(168.44f, 39.28f, 179.52f, 63.39f, 180.0f, 87.94f);
        instancePath.lineTo(180.0f, 92.07f);
        Path path2 = instancePath;
        path2.cubicTo(179.55f, 113.06f, 171.47f, 133.75f, 157.55f, 149.48f);
        path2.cubicTo(141.39f, 167.99f, 117.4f, 179.26f, 92.84f, 180.0f);
        instancePath.lineTo(87.55f, 180.0f);
        Path path3 = instancePath;
        path3.cubicTo(65.97f, 179.42f, 44.72f, 170.82f, 28.92f, 156.09f);
        path3.cubicTo(11.34f, 140.02f, 0.77f, 116.72f, 0.0f, 92.92f);
        instancePath.lineTo(0.0f, 87.36f);
        path3.cubicTo(0.68f, 63.01f, 11.7f, 39.15f, 29.95f, 22.98f);
        path3.cubicTo(45.54f, 8.88f, 66.21f, 0.69f, 87.2f, 0.0f);
        instancePath.lineTo(87.2f, 0.0f);
        instancePath.close();
        instancePath.moveTo(78.51f, 6.8f);
        path3.cubicTo(52.12f, 10.22f, 28.04f, 27.17f, 15.74f, 50.74f);
        path3.cubicTo(5.37f, 70.12f, 3.19f, 93.65f, 9.69f, 114.64f);
        path3.cubicTo(14.98f, 132.03f, 26.14f, 147.55f, 40.91f, 158.15f);
        path3.cubicTo(55.33f, 168.63f, 73.18f, 174.25f, 91.01f, 173.98f);
        path3.cubicTo(108.18f, 173.82f, 125.27f, 168.21f, 139.16f, 158.1f);
        path3.cubicTo(153.28f, 147.95f, 164.1f, 133.29f, 169.62f, 116.8f);
        path3.cubicTo(176.01f, 97.92f, 175.37f, 76.76f, 167.8f, 58.32f);
        path3.cubicTo(160.56f, 40.44f, 146.93f, 25.24f, 129.94f, 16.11f);
        path3.cubicTo(114.38f, 7.61f, 96.07f, 4.36f, 78.51f, 6.8f);
        instancePath.lineTo(78.51f, 6.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(66.0f, 49.0f);
        Path path4 = instancePath2;
        path4.cubicTo(88.66f, 62.67f, 111.34f, 76.33f, 134.0f, 90.01f);
        path4.cubicTo(111.33f, 103.67f, 88.66f, 117.33f, 66.0f, 131.01f);
        instancePath2.lineTo(66.0f, 49.0f);
        instancePath2.lineTo(66.0f, 49.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
