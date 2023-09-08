package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outlined_tag */
public class finder_outlined_tag extends C24542c {
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
        instancePath.moveTo(30.6f, 10.5f);
        instancePath.lineTo(28.835f, 25.499f);
        instancePath.lineTo(42.635f, 25.499f);
        instancePath.lineTo(44.4f, 10.5f);
        instancePath.lineTo(48.0f, 10.5f);
        instancePath.lineTo(46.235f, 25.499f);
        instancePath.lineTo(60.0f, 25.5f);
        instancePath.lineTo(60.0f, 29.1f);
        instancePath.lineTo(45.812f, 29.099f);
        instancePath.lineTo(44.188f, 42.899f);
        instancePath.lineTo(60.0f, 42.9f);
        instancePath.lineTo(60.0f, 46.5f);
        instancePath.lineTo(43.765f, 46.499f);
        instancePath.lineTo(42.0f, 61.5f);
        instancePath.lineTo(38.4f, 61.5f);
        instancePath.lineTo(40.165f, 46.499f);
        instancePath.lineTo(26.365f, 46.499f);
        instancePath.lineTo(24.6f, 61.5f);
        instancePath.lineTo(21.0f, 61.5f);
        instancePath.lineTo(22.765f, 46.499f);
        instancePath.lineTo(9.0f, 46.5f);
        instancePath.lineTo(9.0f, 42.9f);
        instancePath.lineTo(23.188f, 42.899f);
        instancePath.lineTo(24.812f, 29.099f);
        instancePath.lineTo(9.0f, 29.1f);
        instancePath.lineTo(9.0f, 25.5f);
        instancePath.lineTo(25.235f, 25.499f);
        instancePath.lineTo(27.0f, 10.5f);
        instancePath.lineTo(30.6f, 10.5f);
        instancePath.close();
        instancePath.moveTo(40.588f, 42.899f);
        instancePath.lineTo(42.212f, 29.099f);
        instancePath.lineTo(28.412f, 29.099f);
        instancePath.lineTo(26.788f, 42.899f);
        instancePath.lineTo(40.588f, 42.899f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
