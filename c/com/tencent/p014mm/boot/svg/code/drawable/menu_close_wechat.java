package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.menu_close_wechat */
public class menu_close_wechat extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                instancePaint3.setColor(-8617851);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 14.048469f);
                instancePath.lineTo(36.0f, 22.694517f);
                Path path = instancePath;
                path.cubicTo(26.54021f, 27.188381f, 20.0f, 36.830418f, 20.0f, 48.0f);
                path.cubicTo(20.0f, 63.463974f, 32.536026f, 76.0f, 48.0f, 76.0f);
                path.cubicTo(63.463974f, 76.0f, 76.0f, 63.463974f, 76.0f, 48.0f);
                path.cubicTo(76.0f, 36.830418f, 69.45979f, 27.188381f, 60.0f, 22.694525f);
                instancePath.lineTo(60.0f, 14.048469f);
                Path path2 = instancePath;
                path2.cubicTo(73.98231f, 18.990505f, 84.0f, 32.325375f, 84.0f, 48.0f);
                path2.cubicTo(84.0f, 67.88225f, 67.88225f, 84.0f, 48.0f, 84.0f);
                path2.cubicTo(28.117748f, 84.0f, 12.0f, 67.88225f, 12.0f, 48.0f);
                path2.cubicTo(12.0f, 32.325375f, 22.01769f, 18.990505f, 36.0f, 14.048469f);
                instancePath.close();
                instancePath.moveTo(44.0f, 6.0f);
                instancePath.lineTo(52.0f, 6.0f);
                instancePath.lineTo(52.0f, 48.0f);
                instancePath.lineTo(44.0f, 48.0f);
                instancePath.lineTo(44.0f, 6.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
