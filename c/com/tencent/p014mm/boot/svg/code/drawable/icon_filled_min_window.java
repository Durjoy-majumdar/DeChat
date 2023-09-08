package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_min_window */
public class icon_filled_min_window extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.363961f, 15.22f);
        instancePath.lineTo(4.7799997f, 15.22f);
        instancePath.lineTo(4.7799997f, 13.22f);
        instancePath.lineTo(9.78f, 13.22f);
        instancePath.cubicTo(10.332285f, 13.22f, 10.78f, 13.667715f, 10.78f, 14.22f);
        instancePath.lineTo(10.78f, 19.220001f);
        instancePath.lineTo(8.78f, 19.220001f);
        instancePath.lineTo(8.78f, 16.63364f);
        instancePath.lineTo(4.4142137f, 20.998175f);
        instancePath.lineTo(3.0f, 19.583961f);
        instancePath.lineTo(7.363961f, 15.22f);
        instancePath.close();
        instancePath.moveTo(16.63604f, 8.778174f);
        instancePath.lineTo(19.220001f, 8.778174f);
        instancePath.lineTo(19.220001f, 10.778174f);
        instancePath.lineTo(14.22f, 10.778174f);
        instancePath.cubicTo(13.667715f, 10.778174f, 13.22f, 10.33046f, 13.22f, 9.778174f);
        instancePath.lineTo(13.22f, 4.7781744f);
        instancePath.lineTo(15.22f, 4.7781744f);
        instancePath.lineTo(15.22f, 7.364534f);
        instancePath.lineTo(19.585787f, 3.0f);
        instancePath.lineTo(21.0f, 4.4142137f);
        instancePath.lineTo(16.63604f, 8.778174f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
