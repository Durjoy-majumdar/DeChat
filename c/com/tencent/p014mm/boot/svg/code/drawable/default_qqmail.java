package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_qqmail */
public class default_qqmail extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 192;
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
        instancePaint3.setColor(-14187817);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(31.0f, 60.0f);
        instancePath2.lineTo(31.0f, 136.9996f);
        instancePath2.cubicTo(31.0f, 138.65668f, 32.350418f, 140.0f, 33.990707f, 140.0f);
        instancePath2.lineTo(158.0093f, 140.0f);
        instancePath2.cubicTo(159.66101f, 140.0f, 161.0f, 138.65442f, 161.0f, 136.9996f);
        instancePath2.lineTo(161.0f, 60.0f);
        instancePath2.lineTo(103.2854f, 107.40642f);
        instancePath2.cubicTo(99.16379f, 110.791885f, 92.83887f, 110.79407f, 88.7146f, 107.40642f);
        instancePath2.lineTo(31.0f, 60.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(32.66113f, 52.0f);
        instancePath3.cubicTo(31.001602f, 52.0f, 30.711802f, 52.82119f, 32.017536f, 53.837048f);
        instancePath3.lineTo(93.63985f, 101.779144f);
        instancePath3.cubicTo(94.94393f, 102.79372f, 97.05661f, 102.795f, 98.36234f, 101.779144f);
        instancePath3.lineTo(159.98466f, 53.837048f);
        instancePath3.cubicTo(161.28874f, 52.822475f, 161.01111f, 52.0f, 159.34106f, 52.0f);
        instancePath3.lineTo(32.66113f, 52.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
