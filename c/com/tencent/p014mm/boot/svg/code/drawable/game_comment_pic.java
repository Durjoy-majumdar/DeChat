package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_pic */
public class game_comment_pic extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.98909f, 5.33336f);
                instancePath.lineTo(28.011f, 5.33336f);
                instancePath.cubicTo(28.7263f, 5.33336f, 29.3334f, 5.97487f, 29.3334f, 6.76622f);
                instancePath.lineTo(29.3334f, 20.6666f);
                instancePath.lineTo(29.3334f, 20.6667f);
                instancePath.lineTo(29.3334f, 20.6667f);
                instancePath.lineTo(29.3334f, 25.2338f);
                instancePath.cubicTo(29.3334f, 26.0282f, 28.7413f, 26.6667f, 28.011f, 26.6667f);
                instancePath.lineTo(3.98909f, 26.6667f);
                instancePath.cubicTo(3.27376f, 26.6667f, 2.66669f, 26.0252f, 2.66669f, 25.2338f);
                instancePath.lineTo(2.66669f, 6.76622f);
                instancePath.cubicTo(2.66669f, 5.97182f, 3.25875f, 5.33336f, 3.98909f, 5.33336f);
                instancePath.close();
                instancePath.moveTo(27.7333f, 19.2117f);
                instancePath.lineTo(27.7333f, 6.93336f);
                instancePath.lineTo(4.26662f, 6.93336f);
                instancePath.lineTo(4.26662f, 18.7897f);
                instancePath.lineTo(10.9324f, 13.399f);
                instancePath.cubicTo(11.5491f, 12.9002f, 12.5396f, 12.9244f, 13.1341f, 13.4468f);
                instancePath.lineTo(19.1026f, 18.691f);
                instancePath.lineTo(22.1455f, 16.1033f);
                instancePath.cubicTo(22.7618f, 15.5793f, 23.7424f, 15.5899f, 24.3407f, 16.1268f);
                instancePath.lineTo(27.7333f, 19.2117f);
                instancePath.close();
                instancePath.moveTo(4.26662f, 20.8475f);
                instancePath.lineTo(12.0082f, 14.5868f);
                instancePath.lineTo(19.7483f, 21.3333f);
                instancePath.lineTo(22.11f, 21.3333f);
                instancePath.lineTo(20.3174f, 19.7583f);
                instancePath.lineTo(23.235f, 17.2772f);
                instancePath.lineTo(27.7333f, 21.3247f);
                instancePath.lineTo(27.7333f, 25.0667f);
                instancePath.lineTo(4.26662f, 25.0667f);
                instancePath.lineTo(4.26662f, 20.8475f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
