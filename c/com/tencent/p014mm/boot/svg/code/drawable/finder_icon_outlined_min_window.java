package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_outlined_min_window */
public class finder_icon_outlined_min_window extends C24542c {
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
        instancePath.moveTo(28.59801f, 40.41f);
        instancePath.cubicTo(30.254864f, 40.41f, 31.59801f, 41.753147f, 31.59801f, 43.41f);
        instancePath.lineTo(31.59801f, 57.66f);
        instancePath.lineTo(27.09801f, 57.66f);
        instancePath.lineTo(27.09801f, 48.091515f);
        instancePath.lineTo(12.72f, 62.464516f);
        instancePath.lineTo(9.54f, 59.284515f);
        instancePath.lineTo(23.912008f, 44.911514f);
        instancePath.lineTo(14.348009f, 44.91f);
        instancePath.lineTo(14.348009f, 40.41f);
        instancePath.lineTo(28.59801f, 40.41f);
        instancePath.close();
        instancePath.moveTo(59.28801f, 9.530009f);
        instancePath.lineTo(62.46801f, 12.71001f);
        instancePath.lineTo(48.096f, 27.08301f);
        instancePath.lineTo(57.66f, 27.084524f);
        instancePath.lineTo(57.66f, 31.584524f);
        instancePath.lineTo(43.41f, 31.584524f);
        instancePath.cubicTo(41.753147f, 31.584524f, 40.41f, 30.241379f, 40.41f, 28.584524f);
        instancePath.lineTo(40.41f, 14.334524f);
        instancePath.lineTo(44.91f, 14.334524f);
        instancePath.lineTo(44.91f, 23.90301f);
        instancePath.lineTo(59.28801f, 9.530009f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
