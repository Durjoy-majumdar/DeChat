package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.image_gallery_load_hd_cancel_icon */
public class image_gallery_load_hd_cancel_icon extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.saveLayerAlpha((RectF) null, 153, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.5f, 0.0f);
        instancePath.lineTo(1.32f, 0.0f);
        Path path = instancePath;
        path.cubicTo(5.04f, 3.33f, 8.42f, 7.02f, 12.0f, 10.5f);
        path.cubicTo(15.57f, 7.02f, 18.96f, 3.36f, 22.63f, 0.0f);
        instancePath.lineTo(23.38f, 0.0f);
        instancePath.lineTo(23.52f, 0.52f);
        instancePath.lineTo(24.0f, 0.5f);
        instancePath.lineTo(24.0f, 1.32f);
        path.cubicTo(20.67f, 5.04f, 16.98f, 8.42f, 13.5f, 12.0f);
        path.cubicTo(16.99f, 15.56f, 20.63f, 18.96f, 24.0f, 22.63f);
        instancePath.lineTo(24.0f, 23.38f);
        instancePath.lineTo(23.48f, 23.52f);
        instancePath.lineTo(23.5f, 24.0f);
        instancePath.lineTo(22.67f, 24.0f);
        path.cubicTo(18.96f, 20.66f, 15.58f, 16.98f, 12.0f, 13.51f);
        path.cubicTo(8.43f, 16.98f, 5.04f, 20.65f, 1.35f, 24.0f);
        instancePath.lineTo(0.55f, 24.0f);
        instancePath.lineTo(0.56f, 23.47f);
        instancePath.lineTo(0.0f, 23.48f);
        instancePath.lineTo(0.0f, 22.69f);
        path.cubicTo(3.32f, 18.96f, 7.02f, 15.59f, 10.48f, 12.0f);
        path.cubicTo(7.02f, 8.43f, 3.36f, 5.04f, 0.0f, 1.37f);
        instancePath.lineTo(0.0f, 0.62f);
        instancePath.lineTo(0.52f, 0.48f);
        instancePath.lineTo(0.5f, 0.0f);
        instancePath.lineTo(0.5f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
