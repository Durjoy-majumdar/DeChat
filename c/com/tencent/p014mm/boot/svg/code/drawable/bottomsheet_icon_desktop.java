package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_desktop */
public class bottomsheet_icon_desktop extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-8617851);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(77.0f, 40.0f);
        instancePath.lineTo(77.0f, 48.0f);
        Path path = instancePath;
        path.cubicTo(79.00536f, 48.166668f, 80.833336f, 49.995094f, 81.0f, 52.0f);
        instancePath.lineTo(81.0f, 77.0f);
        path.cubicTo(80.833336f, 79.00536f, 79.00536f, 80.833336f, 77.0f, 81.0f);
        instancePath.lineTo(52.0f, 81.0f);
        path.cubicTo(49.99464f, 80.833336f, 48.166668f, 79.00536f, 48.0f, 77.0f);
        instancePath.lineTo(40.0f, 77.0f);
        path.cubicTo(40.0f, 83.51563f, 45.48437f, 89.0f, 52.0f, 89.0f);
        instancePath.lineTo(77.0f, 89.0f);
        path.cubicTo(83.51563f, 89.0f, 89.0f, 83.51563f, 89.0f, 77.0f);
        instancePath.lineTo(89.0f, 52.0f);
        path.cubicTo(89.0f, 45.48437f, 83.51563f, 40.0f, 77.0f, 40.0f);
        instancePath.moveTo(16.0f, 57.0f);
        instancePath.lineTo(16.0f, 20.0f);
        path.cubicTo(16.0f, 17.831364f, 17.831364f, 16.0f, 20.0f, 16.0f);
        instancePath.lineTo(57.0f, 16.0f);
        path.cubicTo(59.168636f, 16.0f, 61.0f, 17.831364f, 61.0f, 20.0f);
        instancePath.lineTo(61.0f, 57.0f);
        path.cubicTo(61.0f, 59.168636f, 59.168636f, 61.0f, 57.0f, 61.0f);
        instancePath.lineTo(20.0f, 61.0f);
        path.cubicTo(17.831364f, 61.0f, 16.0f, 59.168636f, 16.0f, 57.0f);
        instancePath.moveTo(69.0f, 57.0f);
        instancePath.lineTo(69.0f, 20.0f);
        path.cubicTo(69.0f, 13.462437f, 63.538013f, 8.0f, 57.0f, 8.0f);
        instancePath.lineTo(20.0f, 8.0f);
        path.cubicTo(13.461986f, 8.0f, 8.0f, 13.462437f, 8.0f, 20.0f);
        instancePath.lineTo(8.0f, 57.0f);
        path.cubicTo(8.0f, 63.538013f, 13.461986f, 69.0f, 20.0f, 69.0f);
        instancePath.lineTo(57.0f, 69.0f);
        path.cubicTo(63.538013f, 69.0f, 69.0f, 63.538013f, 69.0f, 57.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
