package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_add_chosen */
public class icons_filled_add_chosen extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-855638017);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.0018f, 2.17811f);
                instancePath.cubicTo(12.383f, 1.82084f, 11.6206f, 1.82084f, 11.0018f, 2.17811f);
                instancePath.lineTo(3.99512f, 6.2234f);
                instancePath.cubicTo(3.37632f, 6.58067f, 2.99512f, 7.24092f, 2.99512f, 7.95546f);
                instancePath.lineTo(2.99512f, 16.0461f);
                instancePath.cubicTo(2.99512f, 16.7606f, 3.37632f, 17.4208f, 3.99512f, 17.7781f);
                instancePath.lineTo(11.0018f, 21.8234f);
                instancePath.cubicTo(11.6206f, 22.1807f, 12.383f, 22.1807f, 13.0018f, 21.8234f);
                instancePath.lineTo(20.0084f, 17.7781f);
                instancePath.cubicTo(20.6272f, 17.4208f, 21.0084f, 16.7606f, 21.0084f, 16.0461f);
                instancePath.lineTo(21.0084f, 7.95546f);
                instancePath.cubicTo(21.0084f, 7.24092f, 20.6272f, 6.58067f, 20.0084f, 6.2234f);
                instancePath.lineTo(13.0018f, 2.17811f);
                instancePath.close();
                instancePath.moveTo(13.4697f, 9.978f);
                instancePath.lineTo(12.0002f, 7.00054f);
                instancePath.lineTo(10.5307f, 9.978f);
                instancePath.lineTo(7.24491f, 10.4555f);
                instancePath.lineTo(9.62255f, 12.7731f);
                instancePath.lineTo(9.06126f, 16.0456f);
                instancePath.lineTo(12.0002f, 14.5005f);
                instancePath.lineTo(14.9391f, 16.0456f);
                instancePath.lineTo(14.3778f, 12.7731f);
                instancePath.lineTo(16.7555f, 10.4555f);
                instancePath.lineTo(13.4697f, 9.978f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
