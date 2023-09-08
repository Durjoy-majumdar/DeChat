package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_lock_on */
public class icons_outlined_lock_on extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(54.75f, 6.0f);
                instancePath.cubicTo(61.37742f, 6.0f, 66.75f, 11.372583f, 66.75f, 18.0f);
                instancePath.lineTo(66.75f, 27.0f);
                instancePath.lineTo(63.149998f, 27.0f);
                instancePath.lineTo(63.149998f, 18.0f);
                Path path = instancePath;
                path.cubicTo(63.14999f, 13.360799f, 59.389183f, 9.599991f, 54.75f, 9.599991f);
                path.cubicTo(50.110798f, 9.599991f, 46.34999f, 13.360799f, 46.34999f, 18.0f);
                instancePath.lineTo(46.35f, 26.997f);
                instancePath.lineTo(56.997383f, 27.0f);
                instancePath.cubicTo(58.65568f, 27.0f, 60.0f, 28.342468f, 60.0f, 29.995506f);
                instancePath.lineTo(60.0f, 63.004494f);
                instancePath.cubicTo(60.0f, 64.65887f, 58.666107f, 66.0f, 56.997383f, 66.0f);
                instancePath.lineTo(15.002615f, 66.0f);
                instancePath.cubicTo(13.3443165f, 66.0f, 12.0f, 64.65753f, 12.0f, 63.004494f);
                instancePath.lineTo(12.0f, 29.995506f);
                instancePath.cubicTo(12.0f, 28.341135f, 13.333893f, 27.0f, 15.002615f, 27.0f);
                instancePath.lineTo(42.75f, 26.997f);
                instancePath.lineTo(42.75f, 18.0f);
                instancePath.cubicTo(42.75f, 11.372583f, 48.12258f, 6.0f, 54.75f, 6.0f);
                instancePath.close();
                instancePath.moveTo(56.4f, 30.6f);
                instancePath.lineTo(15.6f, 30.6f);
                instancePath.lineTo(15.6f, 62.4f);
                instancePath.lineTo(56.4f, 62.4f);
                instancePath.lineTo(56.4f, 30.6f);
                instancePath.close();
                instancePath.moveTo(36.0f, 39.0f);
                Path path2 = instancePath;
                path2.cubicTo(38.485283f, 39.0f, 40.5f, 41.014717f, 40.5f, 43.5f);
                path2.cubicTo(40.5f, 45.345287f, 39.389313f, 46.93116f, 37.8f, 47.62556f);
                instancePath.lineTo(37.8f, 54.0f);
                instancePath.lineTo(34.2f, 54.0f);
                instancePath.lineTo(34.2f, 47.62556f);
                Path path3 = instancePath;
                path3.cubicTo(32.610683f, 46.93116f, 31.5f, 45.345287f, 31.5f, 43.5f);
                path3.cubicTo(31.5f, 41.014717f, 33.514717f, 39.0f, 36.0f, 39.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
