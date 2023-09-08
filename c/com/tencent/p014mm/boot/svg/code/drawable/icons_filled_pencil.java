package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pencil */
public class icons_filled_pencil extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(42.0f, 9.0f);
        instancePath.lineTo(42.0f, 15.0f);
        instancePath.lineTo(15.0f, 15.0f);
        instancePath.lineTo(15.0f, 57.0f);
        instancePath.lineTo(57.0f, 57.0f);
        instancePath.lineTo(57.0f, 30.0f);
        instancePath.lineTo(63.0f, 30.0f);
        instancePath.lineTo(63.0f, 60.0f);
        Path path = instancePath;
        path.cubicTo(63.0f, 61.656853f, 61.656853f, 63.0f, 60.0f, 63.0f);
        instancePath.lineTo(12.0f, 63.0f);
        path.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        instancePath.lineTo(9.0f, 12.0f);
        path.cubicTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f);
        instancePath.lineTo(42.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(59.8211f, 10.06066f);
        instancePath.lineTo(61.94242f, 12.18198f);
        instancePath.cubicTo(62.528206f, 12.767767f, 62.528206f, 13.717514f, 61.94242f, 14.303301f);
        instancePath.lineTo(33.94283f, 42.302895f);
        instancePath.lineTo(27.965082f, 45.2428f);
        Path path2 = instancePath;
        path2.cubicTo(27.51905f, 45.462166f, 26.979641f, 45.27841f, 26.760279f, 44.832382f);
        path2.cubicTo(26.637094f, 44.581913f, 26.637094f, 44.288467f, 26.760279f, 44.038f);
        instancePath.lineTo(29.700188f, 38.060253f);
        instancePath.lineTo(57.69978f, 10.06066f);
        instancePath.cubicTo(58.285564f, 9.474874f, 59.235313f, 9.474874f, 59.8211f, 10.06066f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
