package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appitem_del_btn_pressed */
public class appitem_del_btn_pressed extends C24542c {
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
            instancePaint3.setColor(-3194563);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(28.0f, 0.0f);
            instancePath.lineTo(31.91f, 0.0f);
            instancePath.cubicTo(46.53f, 0.77f, 59.15f, 13.36f, 60.0f, 27.97f);
            instancePath.lineTo(60.0f, 31.8f);
            instancePath.cubicTo(59.3f, 46.69f, 46.27f, 59.57f, 31.35f, 60.0f);
            instancePath.lineTo(28.48f, 60.0f);
            instancePath.cubicTo(13.76f, 59.47f, 0.96f, 46.87f, 0.0f, 32.2f);
            instancePath.lineTo(0.0f, 28.26f);
            Path path = instancePath;
            path.cubicTo(0.67f, 13.56f, 13.33f, 0.84f, 28.0f, 0.0f);
            instancePath.moveTo(13.35f, 25.51f);
            path.cubicTo(11.47f, 26.71f, 12.06f, 29.22f, 11.97f, 31.09f);
            path.cubicTo(11.7f, 32.88f, 12.89f, 35.05f, 14.89f, 34.94f);
            path.cubicTo(24.63f, 35.08f, 34.38f, 34.97f, 44.13f, 34.99f);
            path.cubicTo(45.92f, 35.31f, 47.97f, 34.09f, 47.96f, 32.14f);
            path.cubicTo(47.98f, 29.78f, 48.76f, 26.29f, 45.99f, 25.15f);
            path.cubicTo(36.69f, 24.77f, 27.35f, 25.14f, 18.04f, 24.98f);
            path.cubicTo(16.5f, 25.15f, 14.73f, 24.65f, 13.35f, 25.51f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-665128);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(13.35f, 25.51f);
            Path path2 = instancePath2;
            path2.cubicTo(14.73f, 24.65f, 16.5f, 25.15f, 18.04f, 24.98f);
            path2.cubicTo(27.35f, 25.14f, 36.69f, 24.77f, 45.99f, 25.15f);
            path2.cubicTo(48.76f, 26.29f, 47.98f, 29.78f, 47.96f, 32.14f);
            path2.cubicTo(47.97f, 34.09f, 45.92f, 35.31f, 44.13f, 34.99f);
            path2.cubicTo(34.38f, 34.97f, 24.63f, 35.08f, 14.89f, 34.94f);
            path2.cubicTo(12.89f, 35.05f, 11.7f, 32.88f, 11.97f, 31.09f);
            path2.cubicTo(12.06f, 29.22f, 11.47f, 26.71f, 13.35f, 25.51f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
