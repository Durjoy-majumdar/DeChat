package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.msg_state_sending */
public class msg_state_sending extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 60;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-5592406);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(28.0f, 24.0f);
                instancePath.lineTo(34.0f, 24.0f);
                instancePath.lineTo(34.0f, 36.0f);
                instancePath.lineTo(28.0f, 36.0f);
                instancePath.lineTo(28.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(38.0f, 24.0f);
                instancePath.lineTo(43.0f, 24.0f);
                instancePath.lineTo(43.0f, 36.0f);
                instancePath.lineTo(38.0f, 36.0f);
                instancePath.lineTo(38.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(47.0f, 24.0f);
                instancePath.lineTo(51.0f, 24.0f);
                instancePath.lineTo(51.0f, 36.0f);
                instancePath.lineTo(47.0f, 36.0f);
                instancePath.lineTo(47.0f, 24.0f);
                instancePath.close();
                instancePath.moveTo(25.763962f, 14.012434f);
                instancePath.cubicTo(26.998892f, 12.900997f, 28.0f, 13.345539f, 28.0f, 15.00742f);
                instancePath.lineTo(28.0f, 44.99258f);
                instancePath.cubicTo(28.0f, 46.653534f, 27.008198f, 47.107376f, 25.763962f, 45.987564f);
                instancePath.lineTo(10.236038f, 32.012436f);
                instancePath.cubicTo(9.001108f, 30.900997f, 8.991803f, 29.107378f, 10.236038f, 27.987566f);
                instancePath.lineTo(25.763962f, 14.012434f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
