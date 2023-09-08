package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_cards */
public class icons_outlined_pay_cards extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
        if (i == 2) {
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
            instancePath.moveTo(63.02459f, 12.0f);
            instancePath.cubicTo(64.66786f, 12.0f, 66.0f, 13.333893f, 66.0f, 15.002615f);
            instancePath.lineTo(66.0f, 56.997383f);
            instancePath.cubicTo(66.0f, 58.65568f, 64.63409f, 60.0f, 63.02459f, 60.0f);
            instancePath.lineTo(8.9754095f, 60.0f);
            instancePath.cubicTo(7.332136f, 60.0f, 6.0f, 58.666107f, 6.0f, 56.997383f);
            instancePath.lineTo(6.0f, 15.002615f);
            instancePath.cubicTo(6.0f, 13.3443165f, 7.3659167f, 12.0f, 8.9754095f, 12.0f);
            instancePath.lineTo(63.02459f, 12.0f);
            instancePath.close();
            instancePath.moveTo(62.4f, 15.6f);
            instancePath.lineTo(9.6f, 15.6f);
            instancePath.lineTo(9.6f, 56.4f);
            instancePath.lineTo(62.4f, 56.4f);
            instancePath.lineTo(62.4f, 15.6f);
            instancePath.close();
            instancePath.moveTo(57.0f, 24.0f);
            instancePath.lineTo(57.0f, 27.6f);
            instancePath.lineTo(15.0f, 27.6f);
            instancePath.lineTo(15.0f, 24.0f);
            instancePath.lineTo(57.0f, 24.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
