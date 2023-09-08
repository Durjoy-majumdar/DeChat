package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_sms */
public class bottomsheet_sms extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        instancePaint3.setColor(-9276814);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(120.0f, 12.0f);
        instancePath.lineTo(24.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(17.4f, 12.0f, 12.06f, 17.4f, 12.06f, 24.0f);
        instancePath.lineTo(12.0f, 132.0f);
        instancePath.lineTo(36.0f, 108.0f);
        instancePath.lineTo(120.0f, 108.0f);
        path.cubicTo(126.6f, 108.0f, 132.0f, 102.6f, 132.0f, 96.0f);
        instancePath.lineTo(132.0f, 24.0f);
        path.cubicTo(132.0f, 17.4f, 126.6f, 12.0f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(108.0f, 84.0f);
        instancePath.lineTo(36.0f, 84.0f);
        instancePath.lineTo(36.0f, 72.0f);
        instancePath.lineTo(108.0f, 72.0f);
        instancePath.lineTo(108.0f, 84.0f);
        instancePath.lineTo(108.0f, 84.0f);
        instancePath.close();
        instancePath.moveTo(108.0f, 66.0f);
        instancePath.lineTo(36.0f, 66.0f);
        instancePath.lineTo(36.0f, 54.0f);
        instancePath.lineTo(108.0f, 54.0f);
        instancePath.lineTo(108.0f, 66.0f);
        instancePath.lineTo(108.0f, 66.0f);
        instancePath.close();
        instancePath.moveTo(108.0f, 48.0f);
        instancePath.lineTo(36.0f, 48.0f);
        instancePath.lineTo(36.0f, 36.0f);
        instancePath.lineTo(108.0f, 36.0f);
        instancePath.lineTo(108.0f, 48.0f);
        instancePath.lineTo(108.0f, 48.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
