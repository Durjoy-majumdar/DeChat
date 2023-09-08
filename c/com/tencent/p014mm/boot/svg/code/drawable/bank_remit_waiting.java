package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bank_remit_waiting */
public class bank_remit_waiting extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = 120;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15683841);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(115.8f, 60.68889f);
                Path path = instancePath;
                path.cubicTo(115.8f, 29.181868f, 90.81813f, 4.2f, 59.31111f, 4.2f);
                path.cubicTo(29.181868f, 4.2f, 4.2f, 29.181868f, 4.2f, 60.68889f);
                path.cubicTo(4.2f, 90.81813f, 29.181868f, 115.8f, 59.31111f, 115.8f);
                path.cubicTo(90.81813f, 115.8f, 115.8f, 90.81813f, 115.8f, 60.68889f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(62.12374f, 65.15995f);
                instancePath2.lineTo(60.59251f, 27.389608f);
                instancePath2.cubicTo(60.57021f, 26.839443f, 60.108807f, 26.4f, 59.561615f, 26.4f);
                instancePath2.lineTo(55.54317f, 26.4f);
                instancePath2.cubicTo(55.00337f, 26.4f, 54.53443f, 26.843063f, 54.51227f, 27.389608f);
                instancePath2.lineTo(52.833233f, 68.80597f);
                Path path2 = instancePath2;
                path2.cubicTo(52.807594f, 69.43838f, 53.077152f, 69.998924f, 53.51898f, 70.363365f);
                path2.cubicTo(53.700817f, 70.78672f, 54.031994f, 71.146774f, 54.481876f, 71.3614f);
                instancePath2.lineTo(81.584015f, 84.290726f);
                instancePath2.cubicTo(82.09355f, 84.5338f, 82.71503f, 84.33845f, 82.98967f, 83.862755f);
                instancePath2.lineTo(84.3951f, 81.42847f);
                instancePath2.cubicTo(84.6709f, 80.95077f, 84.51857f, 80.31419f, 84.05744f, 80.00215f);
                instancePath2.lineTo(62.12374f, 65.15995f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
