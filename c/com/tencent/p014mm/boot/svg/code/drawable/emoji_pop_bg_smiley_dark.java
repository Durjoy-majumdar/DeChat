package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_pop_bg_smiley_dark */
public class emoji_pop_bg_smiley_dark extends C24542c {
    private final int height = 405;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 192;
        }
        if (i2 == 1) {
            return 405;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-13882324);
        instancePaint5.setColor(234881023);
        instancePaint5.setStrokeWidth(1.5f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(155.25f, 272.53323f);
        instancePath.cubicTo(155.25f, 262.90875f, 158.09885f, 253.49963f, 163.43755f, 245.4916f);
        instancePath.lineTo(183.31438f, 215.67636f);
        instancePath.cubicTo(188.4888f, 207.91472f, 191.25f, 198.7951f, 191.25f, 189.46677f);
        instancePath.lineTo(191.25f, 48.0f);
        Path path = instancePath;
        path.cubicTo(191.25f, 21.904545f, 170.09546f, 0.75f, 144.0f, 0.75f);
        instancePath.lineTo(48.0f, 0.75f);
        path.cubicTo(21.904545f, 0.75f, 0.75f, 21.904545f, 0.75f, 48.0f);
        instancePath.lineTo(0.75f, 189.46677f);
        path.cubicTo(0.75f, 198.7951f, 3.5111969f, 207.91472f, 8.685623f, 215.67636f);
        instancePath.lineTo(28.562452f, 245.4916f);
        path.cubicTo(33.901146f, 253.49963f, 36.75f, 262.90875f, 36.75f, 272.53323f);
        instancePath.lineTo(36.75f, 381.0f);
        path.cubicTo(36.75f, 393.8406f, 47.159378f, 404.25f, 60.0f, 404.25f);
        instancePath.lineTo(132.0f, 404.25f);
        path.cubicTo(144.84062f, 404.25f, 155.25f, 393.8406f, 155.25f, 381.0f);
        instancePath.lineTo(155.25f, 272.53323f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
