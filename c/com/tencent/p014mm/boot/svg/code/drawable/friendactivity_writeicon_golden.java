package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_writeicon_golden */
public class friendactivity_writeicon_golden extends C24542c {
    private final int height = 33;
    private final int width = 38;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 38;
        }
        if (i2 == 1) {
            return 33;
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
            instancePaint3.setColor(-4547478);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(14.666667f, 23.0f);
            instancePath.lineTo(33.0f, 23.0f);
            instancePath.lineTo(33.0f, 5.0f);
            instancePath.lineTo(5.0f, 5.0f);
            instancePath.lineTo(5.0f, 23.0f);
            instancePath.lineTo(11.0f, 23.0f);
            instancePath.lineTo(11.0f, 26.0f);
            instancePath.lineTo(14.666667f, 23.0f);
            instancePath.close();
            instancePath.moveTo(15.222222f, 27.0f);
            instancePath.lineTo(35.000294f, 27.0f);
            instancePath.cubicTo(36.110107f, 27.0f, 37.0f, 26.105911f, 37.0f, 25.002995f);
            instancePath.lineTo(37.0f, 2.9970047f);
            instancePath.cubicTo(37.0f, 1.8949789f, 36.104702f, 1.0f, 35.000294f, 1.0f);
            instancePath.lineTo(2.9997072f, 1.0f);
            instancePath.cubicTo(1.8898926f, 1.0f, 1.0f, 1.8940895f, 1.0f, 2.9970047f);
            instancePath.lineTo(1.0f, 25.002995f);
            instancePath.cubicTo(1.0f, 26.10502f, 1.8952994f, 27.0f, 2.9997072f, 27.0f);
            instancePath.lineTo(8.0f, 27.0f);
            instancePath.lineTo(8.0f, 32.0f);
            instancePath.lineTo(15.222222f, 27.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
