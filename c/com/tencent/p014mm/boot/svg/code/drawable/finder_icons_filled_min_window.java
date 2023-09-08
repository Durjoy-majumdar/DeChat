package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_min_window */
public class finder_icons_filled_min_window extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(22.091883f, 45.66f);
        instancePath.lineTo(14.339999f, 45.66f);
        instancePath.lineTo(14.339999f, 39.66f);
        instancePath.lineTo(29.34f, 39.66f);
        instancePath.cubicTo(30.996853f, 39.66f, 32.34f, 41.003147f, 32.34f, 42.66f);
        instancePath.lineTo(32.34f, 57.66f);
        instancePath.lineTo(26.34f, 57.66f);
        instancePath.lineTo(26.34f, 49.900925f);
        instancePath.lineTo(13.2426405f, 62.994526f);
        instancePath.lineTo(9.0f, 58.751884f);
        instancePath.lineTo(22.091883f, 45.66f);
        instancePath.close();
        instancePath.moveTo(49.908115f, 26.334524f);
        instancePath.lineTo(57.66f, 26.334524f);
        instancePath.lineTo(57.66f, 32.334522f);
        instancePath.lineTo(42.66f, 32.334522f);
        instancePath.cubicTo(41.003147f, 32.334522f, 39.66f, 30.991379f, 39.66f, 29.334524f);
        instancePath.lineTo(39.66f, 14.334524f);
        instancePath.lineTo(45.66f, 14.334524f);
        instancePath.lineTo(45.66f, 22.093601f);
        instancePath.lineTo(58.75736f, 9.0f);
        instancePath.lineTo(63.0f, 13.2426405f);
        instancePath.lineTo(49.908115f, 26.334524f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
