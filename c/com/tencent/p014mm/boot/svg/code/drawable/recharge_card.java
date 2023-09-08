package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.recharge_card */
public class recharge_card extends C24542c {
    private final int height = 36;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 46;
        }
        if (i2 == 1) {
            return 36;
        }
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
            instancePaint3.setColor(-9205837);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(9.0f, 12.0f);
            instancePath.lineTo(36.0f, 12.0f);
            instancePath.lineTo(36.0f, 17.0f);
            instancePath.lineTo(9.0f, 17.0f);
            instancePath.lineTo(9.0f, 12.0f);
            instancePath.lineTo(9.0f, 12.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 3.0074198f);
            instancePath2.cubicTo(0.0f, 1.3464677f, 1.3517805f, 0.0f, 3.0004442f, 0.0f);
            instancePath2.lineTo(42.999557f, 0.0f);
            instancePath2.cubicTo(44.656654f, 0.0f, 46.0f, 1.3455393f, 46.0f, 3.0074198f);
            instancePath2.lineTo(46.0f, 32.99258f);
            instancePath2.cubicTo(46.0f, 34.653534f, 44.64822f, 36.0f, 42.999557f, 36.0f);
            instancePath2.lineTo(3.0004442f, 36.0f);
            instancePath2.cubicTo(1.3433446f, 36.0f, 0.0f, 34.65446f, 0.0f, 32.99258f);
            instancePath2.lineTo(0.0f, 3.0074198f);
            instancePath2.close();
            instancePath2.moveTo(3.0666666f, 3.0f);
            instancePath2.lineTo(43.0f, 3.0f);
            instancePath2.lineTo(43.0f, 33.0f);
            instancePath2.lineTo(3.0666666f, 33.0f);
            instancePath2.lineTo(3.0666666f, 3.0f);
            instancePath2.close();
            instancePath2.moveTo(9.2f, 12.0f);
            instancePath2.lineTo(37.0f, 12.0f);
            instancePath2.lineTo(37.0f, 17.0f);
            instancePath2.lineTo(9.2f, 17.0f);
            instancePath2.lineTo(9.2f, 12.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
