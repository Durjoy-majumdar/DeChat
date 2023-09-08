package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_comment_outlined */
public class finder_full_comment_outlined extends C24542c {
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(57.0f, 13.5f);
        instancePath.cubicTo(61.142136f, 13.5f, 64.5f, 16.857864f, 64.5f, 21.0f);
        instancePath.lineTo(64.5f, 46.5f);
        instancePath.cubicTo(64.5f, 50.642136f, 61.142136f, 54.0f, 57.0f, 54.0f);
        instancePath.lineTo(34.5f, 54.0f);
        instancePath.lineTo(27.62132f, 60.87f);
        Path path = instancePath;
        path.cubicTo(26.449747f, 62.041573f, 24.550253f, 62.041573f, 23.37868f, 60.87f);
        path.cubicTo(22.81607f, 60.307392f, 22.5f, 59.56565f, 22.5f, 58.77f);
        instancePath.lineTo(22.5f, 54.0f);
        instancePath.lineTo(15.0f, 54.0f);
        Path path2 = instancePath;
        path2.cubicTo(10.857864f, 54.0f, 7.5f, 50.642136f, 7.5f, 46.5f);
        instancePath.lineTo(7.5f, 21.0f);
        path2.cubicTo(7.5f, 16.857864f, 10.857864f, 13.5f, 15.0f, 13.5f);
        instancePath.lineTo(57.0f, 13.5f);
        instancePath.close();
        instancePath.moveTo(57.0f, 17.1f);
        instancePath.lineTo(15.0f, 17.1f);
        path2.cubicTo(12.980709f, 17.1f, 11.319854f, 18.63465f, 11.120135f, 20.601248f);
        instancePath.lineTo(11.1f, 21.0f);
        instancePath.lineTo(11.1f, 46.5f);
        instancePath.cubicTo(11.1f, 48.51929f, 12.634649f, 50.180145f, 14.601248f, 50.379864f);
        instancePath.lineTo(15.0f, 50.4f);
        instancePath.lineTo(26.1f, 50.4f);
        instancePath.lineTo(26.097f, 57.3f);
        instancePath.lineTo(33.010162f, 50.4f);
        instancePath.lineTo(57.0f, 50.4f);
        instancePath.cubicTo(59.01929f, 50.4f, 60.680145f, 48.865353f, 60.879864f, 46.898754f);
        instancePath.lineTo(60.9f, 46.5f);
        instancePath.lineTo(60.9f, 21.0f);
        instancePath.cubicTo(60.9f, 18.98071f, 59.365353f, 17.319855f, 57.398754f, 17.120134f);
        instancePath.lineTo(57.0f, 17.1f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
