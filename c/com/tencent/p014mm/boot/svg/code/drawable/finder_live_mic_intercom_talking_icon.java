package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_mic_intercom_talking_icon */
public class finder_live_mic_intercom_talking_icon extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 16;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.083333f, 8.0f);
                instancePath.cubicTo(12.083333f, 10.73367f, 11.038665f, 13.208544f, 9.349664f, 15.0f);
                instancePath.lineTo(8.359714f, 13.95f);
                Path path = instancePath;
                path.cubicTo(9.795364f, 12.427262f, 10.683333f, 10.32362f, 10.683333f, 8.0f);
                path.cubicTo(10.683333f, 5.6763806f, 9.795364f, 3.5727377f, 8.359714f, 2.05f);
                instancePath.lineTo(9.349664f, 1.0f);
                path.cubicTo(11.038665f, 2.7914562f, 12.083333f, 5.26633f, 12.083333f, 8.0f);
                instancePath.close();
                instancePath.moveTo(8.816667f, 8.0f);
                path.cubicTo(8.816667f, 9.77663f, 8.137827f, 11.385092f, 7.040253f, 12.5494995f);
                instancePath.lineTo(6.050304f, 11.499499f);
                path.cubicTo(6.894527f, 10.60381f, 7.4166665f, 9.36658f, 7.4166665f, 8.0f);
                path.cubicTo(7.4166665f, 6.6334195f, 6.894527f, 5.396189f, 6.050304f, 4.5005007f);
                instancePath.lineTo(7.040253f, 3.450501f);
                path.cubicTo(8.137827f, 4.6149077f, 8.816667f, 6.223369f, 8.816667f, 8.0f);
                instancePath.close();
                instancePath.moveTo(4.730811f, 5.900968f);
                path.cubicTo(5.2369757f, 6.4383283f, 5.55f, 7.1803913f, 5.55f, 8.0f);
                path.cubicTo(5.55f, 8.820101f, 5.2365994f, 9.562563f, 4.729899f, 10.1f);
                instancePath.lineTo(2.75f, 8.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
