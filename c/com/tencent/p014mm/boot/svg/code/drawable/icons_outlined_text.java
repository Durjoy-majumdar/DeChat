package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_text */
public class icons_outlined_text extends C24542c {
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
        instancePath.moveTo(12.0f, 9.0f);
        instancePath.lineTo(60.0f, 9.0f);
        Path path = instancePath;
        path.cubicTo(61.656853f, 9.0f, 63.0f, 10.343145f, 63.0f, 12.0f);
        instancePath.lineTo(63.0f, 60.0f);
        path.cubicTo(63.0f, 61.656853f, 61.656853f, 63.0f, 60.0f, 63.0f);
        instancePath.lineTo(12.0f, 63.0f);
        path.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        instancePath.lineTo(9.0f, 12.0f);
        path.cubicTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(12.6f, 12.6f);
        instancePath.lineTo(12.6f, 59.4f);
        instancePath.lineTo(59.4f, 59.4f);
        instancePath.lineTo(59.4f, 12.6f);
        instancePath.lineTo(12.6f, 12.6f);
        instancePath.close();
        instancePath.moveTo(37.79998f, 26.1f);
        instancePath.lineTo(37.79998f, 52.5f);
        instancePath.lineTo(34.19998f, 52.5f);
        instancePath.lineTo(34.19998f, 26.1f);
        instancePath.lineTo(22.5f, 26.1f);
        instancePath.lineTo(22.5f, 22.5f);
        instancePath.lineTo(49.5f, 22.5f);
        instancePath.lineTo(49.5f, 26.1f);
        instancePath.lineTo(37.79998f, 26.1f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
