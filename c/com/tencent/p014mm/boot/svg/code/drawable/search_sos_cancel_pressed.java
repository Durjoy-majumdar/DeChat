package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.search_sos_cancel_pressed */
public class search_sos_cancel_pressed extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 144;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1710619);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(144.0f, 0.0f);
                instancePath.lineTo(144.0f, 146.0f);
                instancePath.lineTo(0.0f, 146.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(67.462845f, 72.00018f);
                instancePath2.lineTo(49.3112f, 53.848534f);
                instancePath2.cubicTo(48.899487f, 53.43682f, 48.89414f, 52.760975f, 49.30799f, 52.347126f);
                instancePath2.lineTo(52.346096f, 49.30795f);
                instancePath2.cubicTo(52.7546f, 48.899445f, 53.432587f, 48.896236f, 53.848576f, 49.312225f);
                instancePath2.lineTo(72.00022f, 67.46281f);
                instancePath2.lineTo(90.1508f, 49.312225f);
                instancePath2.cubicTo(90.56358f, 48.899445f, 91.239426f, 48.89517f, 91.65435f, 49.30795f);
                instancePath2.lineTo(94.69138f, 52.347126f);
                instancePath2.cubicTo(95.09989f, 52.75456f, 95.104164f, 53.433613f, 94.68818f, 53.848534f);
                instancePath2.lineTo(76.53653f, 72.00018f);
                instancePath2.lineTo(94.68818f, 90.151825f);
                instancePath2.cubicTo(95.09989f, 90.56354f, 95.10523f, 91.23939f, 94.69138f, 91.654305f);
                instancePath2.lineTo(91.65435f, 94.69241f);
                instancePath2.cubicTo(91.244774f, 95.100914f, 90.56679f, 95.104126f, 90.1508f, 94.68921f);
                instancePath2.lineTo(72.00022f, 76.53649f);
                instancePath2.lineTo(53.848576f, 94.68921f);
                instancePath2.cubicTo(53.436863f, 95.100914f, 52.759945f, 95.105194f, 52.346096f, 94.69241f);
                instancePath2.lineTo(49.30799f, 91.654305f);
                instancePath2.cubicTo(48.899487f, 91.244736f, 48.89628f, 90.56675f, 49.3112f, 90.151825f);
                instancePath2.lineTo(67.462845f, 72.00018f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
