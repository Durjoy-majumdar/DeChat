package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_icon_normal_dark */
public class friendactivity_comment_icon_normal_dark extends C24542c {
    private final int height = 60;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 96;
        }
        if (i2 == 1) {
            return 60;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-13882324);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(84.0f, 0.0f);
        instancePath.cubicTo(90.62742f, 0.0f, 96.0f, 5.3725824f, 96.0f, 12.0f);
        instancePath.lineTo(96.0f, 48.0f);
        Path path = instancePath;
        path.cubicTo(96.0f, 54.62742f, 90.62742f, 60.0f, 84.0f, 60.0f);
        instancePath.lineTo(12.0f, 60.0f);
        path.cubicTo(5.3725824f, 60.0f, 0.0f, 54.62742f, 0.0f, 48.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-10521442);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.0f, 24.0f);
        Path path2 = instancePath2;
        path2.cubicTo(39.31371f, 24.0f, 42.0f, 26.68629f, 42.0f, 30.0f);
        path2.cubicTo(42.0f, 33.31371f, 39.31371f, 36.0f, 36.0f, 36.0f);
        path2.cubicTo(32.68629f, 36.0f, 30.0f, 33.31371f, 30.0f, 30.0f);
        path2.cubicTo(30.0f, 26.68629f, 32.68629f, 24.0f, 36.0f, 24.0f);
        instancePath2.close();
        instancePath2.moveTo(60.0f, 24.0f);
        path2.cubicTo(63.31371f, 24.0f, 66.0f, 26.68629f, 66.0f, 30.0f);
        path2.cubicTo(66.0f, 33.31371f, 63.31371f, 36.0f, 60.0f, 36.0f);
        path2.cubicTo(56.68629f, 36.0f, 54.0f, 33.31371f, 54.0f, 30.0f);
        path2.cubicTo(54.0f, 26.68629f, 56.68629f, 24.0f, 60.0f, 24.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
