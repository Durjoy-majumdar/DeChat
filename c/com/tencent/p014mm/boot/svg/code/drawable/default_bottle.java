package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_bottle */
public class default_bottle extends C24542c {
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
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(110.90694f, 140.57062f);
                Path path = instancePath2;
                path.cubicTo(115.39648f, 133.81949f, 120.514946f, 125.826996f, 125.18189f, 117.83344f);
                path.cubicTo(132.5147f, 105.2738f, 118.942276f, 91.864136f, 121.05859f, 88.2393f);
                instancePath2.lineTo(133.6816f, 66.618614f);
                instancePath2.lineTo(137.24696f, 68.6542f);
                instancePath2.lineTo(140.59984f, 62.91139f);
                instancePath2.lineTo(114.816216f, 48.190643f);
                instancePath2.lineTo(111.46334f, 53.933456f);
                instancePath2.lineTo(113.825035f, 55.28183f);
                instancePath2.lineTo(113.825035f, 55.28183f);
                Path path2 = instancePath2;
                path2.cubicTo(110.083145f, 61.69095f, 102.824165f, 74.12414f, 101.20204f, 76.90253f);
                path2.cubicTo(98.99318f, 80.68586f, 81.064964f, 75.49447f, 73.554855f, 88.35781f);
                path2.cubicTo(67.73289f, 98.32967f, 53.740925f, 118.98361f, 48.758373f, 126.291245f);
                path2.cubicTo(59.07041f, 125.45091f, 74.24749f, 125.95091f, 88.1873f, 133.06181f);
                path2.cubicTo(96.19743f, 137.1479f, 103.822685f, 139.4944f, 110.90694f, 140.57062f);
                instancePath2.lineTo(110.90694f, 140.57062f);
                instancePath2.close();
                instancePath2.moveTo(132.08064f, 36.41379f);
                instancePath2.lineTo(124.87423f, 49.809467f);
                instancePath2.lineTo(135.35979f, 56.026367f);
                instancePath2.lineTo(149.97533f, 45.104786f);
                instancePath2.lineTo(132.08064f, 36.41379f);
                instancePath2.close();
                instancePath2.moveTo(157.39185f, 138.754f);
                Path path3 = instancePath2;
                path3.cubicTo(157.39185f, 138.754f, 137.7422f, 158.59561f, 114.86281f, 158.59561f);
                path3.cubicTo(65.0383f, 158.59561f, 84.342834f, 136.6334f, 26.48276f, 134.37212f);
                path3.cubicTo(26.479265f, 134.37747f, 58.087933f, 125.80052f, 85.2693f, 138.754f);
                path3.cubicTo(126.68277f, 158.48987f, 157.39185f, 138.754f, 157.39185f, 138.754f);
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
