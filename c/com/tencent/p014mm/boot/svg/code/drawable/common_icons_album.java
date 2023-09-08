package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.common_icons_album */
public class common_icons_album extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(17.538166f, 8.3f);
                instancePath2.cubicTo(17.990835f, 8.3f, 18.375f, 8.675888f, 18.375f, 9.13957f);
                instancePath2.lineTo(18.375f, 19.96043f);
                instancePath2.cubicTo(18.375f, 20.4259f, 18.000338f, 20.8f, 17.538166f, 20.8f);
                instancePath2.lineTo(2.336834f, 20.8f);
                instancePath2.cubicTo(1.8841641f, 20.8f, 1.5f, 20.424112f, 1.5f, 19.96043f);
                instancePath2.lineTo(1.5f, 9.13957f);
                Path path = instancePath2;
                path.cubicTo(1.5f, 8.6741f, 1.8746632f, 8.3f, 2.336834f, 8.3f);
                instancePath2.lineTo(17.538166f, 8.3f);
                instancePath2.close();
                instancePath2.moveTo(21.1875f, 4.5f);
                path.cubicTo(21.739784f, 4.5f, 22.1875f, 4.9477153f, 22.1875f, 5.5f);
                instancePath2.lineTo(22.1875f, 16.25f);
                instancePath2.cubicTo(22.1875f, 16.802284f, 21.739784f, 17.25f, 21.1875f, 17.25f);
                instancePath2.lineTo(19.6875f, 17.25f);
                instancePath2.lineTo(19.6875f, 8.5f);
                instancePath2.cubicTo(19.6875f, 7.6715727f, 19.015926f, 7.0f, 18.1875f, 7.0f);
                instancePath2.lineTo(4.6875f, 7.0f);
                instancePath2.lineTo(4.6875f, 5.5f);
                instancePath2.cubicTo(4.6875f, 4.9477153f, 5.1352153f, 4.5f, 5.6875f, 4.5f);
                instancePath2.lineTo(21.1875f, 4.5f);
                instancePath2.close();
                instancePath2.moveTo(17.109375f, 9.471875f);
                instancePath2.lineTo(2.765625f, 9.471875f);
                instancePath2.lineTo(2.765f, 15.995f);
                instancePath2.lineTo(6.730613f, 13.025983f);
                instancePath2.cubicTo(7.120893f, 12.733738f, 7.747653f, 12.747911f, 8.123856f, 13.053971f);
                instancePath2.lineTo(11.900841f, 16.12674f);
                instancePath2.lineTo(13.82643f, 14.610545f);
                instancePath2.cubicTo(14.216424f, 14.303467f, 14.836923f, 14.309705f, 15.21552f, 14.624284f);
                instancePath2.lineTo(17.109f, 16.219f);
                instancePath2.lineTo(17.109375f, 9.471875f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
