package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_mail */
public class bottomsheet_icon_mail extends C24542c {
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
        instancePath.moveTo(87.0f, 26.0f);
        instancePath.lineTo(81.0f, 32.0f);
        Path path = instancePath;
        path.cubicTo(80.87885f, 32.277943f, 80.9f, 32.483356f, 81.0f, 33.0f);
        instancePath.lineTo(81.0f, 65.0f);
        path.cubicTo(80.9f, 67.14137f, 79.08695f, 68.94447f, 77.0f, 69.0f);
        instancePath.lineTo(20.0f, 69.0f);
        Path path2 = instancePath;
        path2.cubicTo(17.91305f, 68.94447f, 16.1f, 67.14137f, 16.0f, 65.0f);
        instancePath.lineTo(16.0f, 33.0f);
        path2.cubicTo(16.1f, 32.483356f, 16.12115f, 32.277943f, 16.0f, 32.0f);
        instancePath.lineTo(10.0f, 26.0f);
        instancePath.cubicTo(8.75645f, 27.917215f, 8.0f, 30.216175f, 8.0f, 33.0f);
        instancePath.lineTo(8.0f, 65.0f);
        Path path3 = instancePath;
        path3.cubicTo(8.0f, 71.59026f, 13.4396f, 77.0f, 20.0f, 77.0f);
        instancePath.lineTo(77.0f, 77.0f);
        path3.cubicTo(83.5604f, 77.0f, 89.0f, 71.59026f, 89.0f, 65.0f);
        instancePath.lineTo(89.0f, 33.0f);
        instancePath.cubicTo(89.0f, 30.216175f, 88.24355f, 27.917215f, 87.0f, 26.0f);
        instancePath.moveTo(17.0f, 22.0f);
        instancePath.lineTo(24.0f, 29.0f);
        instancePath.lineTo(24.0f, 29.0f);
        instancePath.lineTo(49.0f, 53.0f);
        instancePath.lineTo(73.0f, 29.0f);
        instancePath.lineTo(73.0f, 29.0f);
        instancePath.lineTo(80.0f, 22.0f);
        Path path4 = instancePath;
        path4.cubicTo(80.48633f, 21.519585f, 80.48227f, 21.517807f, 80.0f, 22.0f);
        instancePath.lineTo(81.0f, 21.0f);
        instancePath.lineTo(77.0f, 21.0f);
        path4.cubicTo(77.00033f, 21.002222f, 76.96873f, 21.0f, 77.0f, 21.0f);
        instancePath.lineTo(20.0f, 21.0f);
        path4.cubicTo(20.031721f, 21.0f, 20.000126f, 21.002222f, 20.0f, 21.0f);
        instancePath.lineTo(16.0f, 21.0f);
        instancePath.lineTo(17.0f, 22.0f);
        path4.cubicTo(16.517733f, 21.517807f, 16.514122f, 21.519585f, 17.0f, 22.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
