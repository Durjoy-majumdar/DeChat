package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_brand_contact */
public class default_brand_contact extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = 192;
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
                instancePaint3.setColor(-14187817);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(192.0f, 0.0f);
                instancePath.lineTo(192.0f, 192.0f);
                instancePath.lineTo(0.0f, 192.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(56.891357f, 44.8f);
                instancePath2.cubicTo(54.926315f, 44.8f, 53.333332f, 46.40846f, 53.333332f, 48.354576f);
                instancePath2.lineTo(53.333332f, 143.64542f);
                instancePath2.cubicTo(53.333332f, 145.60857f, 54.924335f, 147.2f, 56.891357f, 147.2f);
                instancePath2.lineTo(135.10864f, 147.2f);
                instancePath2.cubicTo(137.07368f, 147.2f, 138.66667f, 145.59154f, 138.66667f, 143.64542f);
                instancePath2.lineTo(138.66667f, 48.354576f);
                instancePath2.cubicTo(138.66667f, 46.391438f, 137.07567f, 44.8f, 135.10864f, 44.8f);
                instancePath2.lineTo(56.891357f, 44.8f);
                instancePath2.lineTo(56.891357f, 44.8f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 76.8f);
                instancePath2.lineTo(64.0f, 83.2f);
                instancePath2.lineTo(108.8f, 83.2f);
                instancePath2.lineTo(108.8f, 76.8f);
                instancePath2.lineTo(64.0f, 76.8f);
                instancePath2.lineTo(64.0f, 76.8f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 89.6f);
                instancePath2.lineTo(64.0f, 96.0f);
                instancePath2.lineTo(87.46667f, 96.0f);
                instancePath2.lineTo(87.46667f, 89.6f);
                instancePath2.lineTo(64.0f, 89.6f);
                instancePath2.lineTo(64.0f, 89.6f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 102.4f);
                instancePath2.lineTo(64.0f, 108.8f);
                instancePath2.lineTo(91.73333f, 108.8f);
                instancePath2.lineTo(91.73333f, 102.4f);
                instancePath2.lineTo(64.0f, 102.4f);
                instancePath2.lineTo(64.0f, 102.4f);
                instancePath2.close();
                instancePath2.moveTo(70.4f, 55.466667f);
                Path path = instancePath2;
                path.cubicTo(73.93463f, 55.466667f, 76.8f, 58.33163f, 76.8f, 61.865753f);
                path.cubicTo(76.8f, 65.39988f, 73.93463f, 68.26667f, 70.4f, 68.26667f);
                path.cubicTo(66.86537f, 68.26667f, 64.0f, 65.39988f, 64.0f, 61.865753f);
                path.cubicTo(64.0f, 58.33163f, 66.86537f, 55.466667f, 70.4f, 55.466667f);
                instancePath2.lineTo(70.4f, 55.466667f);
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
