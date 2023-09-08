package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.product_media_play_btn_pressed */
public class product_media_play_btn_pressed extends C24542c {
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
        canvas.saveLayerAlpha((RectF) null, WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(87.28f, 0.0f);
        instancePath.lineTo(92.51f, 0.0f);
        Path path = instancePath;
        path.cubicTo(113.57f, 0.61f, 134.34f, 8.79f, 149.99f, 22.93f);
        path.cubicTo(168.12f, 38.95f, 179.11f, 62.56f, 180.0f, 86.72f);
        instancePath.lineTo(180.0f, 92.68f);
        Path path2 = instancePath;
        path2.cubicTo(179.38f, 113.25f, 171.51f, 133.48f, 157.98f, 148.99f);
        path2.cubicTo(141.79f, 167.8f, 117.59f, 179.28f, 92.78f, 180.0f);
        instancePath.lineTo(87.53f, 180.0f);
        Path path3 = instancePath;
        path3.cubicTo(66.65f, 179.42f, 46.09f, 171.37f, 30.47f, 157.49f);
        path3.cubicTo(12.08f, 141.44f, 0.89f, 117.65f, 0.0f, 93.27f);
        instancePath.lineTo(0.0f, 87.28f);
        path3.cubicTo(0.7f, 63.65f, 11.08f, 40.48f, 28.42f, 24.38f);
        path3.cubicTo(44.21f, 9.43f, 65.56f, 0.68f, 87.28f, 0.0f);
        instancePath.lineTo(87.28f, 0.0f);
        instancePath.close();
        instancePath.moveTo(78.54f, 6.79f);
        path3.cubicTo(52.9f, 10.12f, 29.4f, 26.19f, 16.83f, 48.75f);
        path3.cubicTo(5.72f, 68.22f, 3.03f, 92.22f, 9.41f, 113.7f);
        path3.cubicTo(14.51f, 131.23f, 25.57f, 146.95f, 40.32f, 157.72f);
        path3.cubicTo(54.3f, 168.06f, 71.59f, 173.82f, 88.98f, 173.98f);
        path3.cubicTo(107.05f, 174.25f, 125.16f, 168.48f, 139.68f, 157.72f);
        path3.cubicTo(153.56f, 147.57f, 164.19f, 133.06f, 169.63f, 116.75f);
        path3.cubicTo(176.1f, 97.62f, 175.35f, 76.15f, 167.48f, 57.54f);
        path3.cubicTo(160.07f, 39.76f, 146.32f, 24.72f, 129.28f, 15.75f);
        path3.cubicTo(113.87f, 7.52f, 95.83f, 4.4f, 78.54f, 6.79f);
        instancePath.lineTo(78.54f, 6.79f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(66.01f, 49.0f);
        Path path4 = instancePath2;
        path4.cubicTo(88.67f, 62.68f, 111.34f, 76.33f, 134.0f, 90.01f);
        path4.cubicTo(111.33f, 103.67f, 88.67f, 117.33f, 66.01f, 131.0f);
        path4.cubicTo(66.0f, 103.67f, 66.0f, 76.34f, 66.01f, 49.0f);
        instancePath2.lineTo(66.01f, 49.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
