package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_profile */
public class bottomsheet_icon_profile extends C24542c {
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
                instancePath.moveTo(80.0f, 73.0f);
                instancePath.lineTo(80.0f, 73.0f);
                instancePath.lineTo(79.0f, 73.0f);
                instancePath.cubicTo(79.29834f, 73.19833f, 79.27355f, 73.192024f, 79.0f, 73.0f);
                instancePath.lineTo(57.0f, 67.0f);
                instancePath.lineTo(57.0f, 62.0f);
                instancePath.cubicTo(56.61111f, 60.643684f, 57.962963f, 59.314816f, 58.0f, 59.0f);
                instancePath.lineTo(58.0f, 59.0f);
                Path path = instancePath;
                path.cubicTo(63.88858f, 54.7762f, 67.90448f, 45.9815f, 68.0f, 35.0f);
                path.cubicTo(67.8842f, 21.389061f, 59.20126f, 12.0f, 49.0f, 12.0f);
                path.cubicTo(37.79874f, 12.0f, 29.131117f, 21.389061f, 29.0f, 35.0f);
                path.cubicTo(29.151396f, 45.98015f, 33.179913f, 54.775295f, 39.0f, 59.0f);
                instancePath.lineTo(39.0f, 59.0f);
                instancePath.cubicTo(39.037037f, 59.314816f, 40.38889f, 60.643684f, 40.0f, 62.0f);
                instancePath.lineTo(40.0f, 65.0f);
                instancePath.cubicTo(40.38889f, 66.18132f, 39.252434f, 66.882484f, 38.0f, 67.0f);
                instancePath.lineTo(18.0f, 73.0f);
                instancePath.cubicTo(17.725994f, 73.192024f, 17.70166f, 73.19833f, 18.0f, 73.0f);
                instancePath.lineTo(17.0f, 73.0f);
                instancePath.lineTo(17.0f, 73.0f);
                instancePath.cubicTo(14.2589445f, 74.41951f, 12.0f, 77.41431f, 12.0f, 81.0f);
                instancePath.lineTo(12.0f, 85.0f);
                instancePath.lineTo(13.0f, 85.0f);
                instancePath.lineTo(27.0f, 85.0f);
                instancePath.lineTo(70.0f, 85.0f);
                instancePath.lineTo(84.0f, 85.0f);
                instancePath.lineTo(85.0f, 85.0f);
                instancePath.lineTo(85.0f, 81.0f);
                instancePath.cubicTo(85.0f, 77.41431f, 82.74061f, 74.41951f, 80.0f, 73.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
