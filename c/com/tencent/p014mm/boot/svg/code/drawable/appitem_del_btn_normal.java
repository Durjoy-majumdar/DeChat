package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appitem_del_btn_normal */
public class appitem_del_btn_normal extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1158579);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(28.12f, 0.0f);
            instancePath.lineTo(31.27f, 0.0f);
            instancePath.cubicTo(46.17f, 0.38f, 59.22f, 13.21f, 60.0f, 28.08f);
            instancePath.lineTo(60.0f, 31.41f);
            instancePath.cubicTo(59.54f, 46.48f, 46.34f, 59.63f, 31.27f, 60.0f);
            instancePath.lineTo(28.62f, 60.0f);
            instancePath.cubicTo(13.75f, 59.56f, 0.77f, 46.74f, 0.0f, 31.91f);
            instancePath.lineTo(0.0f, 28.41f);
            Path path = instancePath;
            path.cubicTo(0.57f, 13.61f, 13.35f, 0.76f, 28.12f, 0.0f);
            instancePath.moveTo(13.33f, 25.52f);
            path.cubicTo(11.45f, 26.76f, 12.08f, 29.29f, 11.98f, 31.17f);
            path.cubicTo(11.71f, 32.93f, 12.93f, 35.04f, 14.88f, 34.94f);
            path.cubicTo(24.96f, 35.04f, 35.06f, 35.05f, 45.14f, 34.93f);
            path.cubicTo(47.09f, 35.04f, 48.25f, 32.9f, 48.02f, 31.17f);
            path.cubicTo(48.05f, 29.08f, 48.46f, 26.07f, 46.0f, 25.17f);
            path.cubicTo(36.68f, 24.75f, 27.32f, 25.15f, 17.99f, 24.97f);
            path.cubicTo(16.46f, 25.14f, 14.7f, 24.67f, 13.33f, 25.52f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(13.33f, 25.52f);
            Path path2 = instancePath2;
            path2.cubicTo(14.7f, 24.67f, 16.46f, 25.14f, 17.99f, 24.97f);
            path2.cubicTo(27.32f, 25.15f, 36.68f, 24.75f, 46.0f, 25.17f);
            path2.cubicTo(48.46f, 26.07f, 48.05f, 29.08f, 48.02f, 31.17f);
            path2.cubicTo(48.25f, 32.9f, 47.09f, 35.04f, 45.14f, 34.93f);
            path2.cubicTo(35.06f, 35.05f, 24.96f, 35.04f, 14.88f, 34.94f);
            path2.cubicTo(12.93f, 35.04f, 11.71f, 32.93f, 11.98f, 31.17f);
            path2.cubicTo(12.08f, 29.29f, 11.45f, 26.76f, 13.33f, 25.52f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
