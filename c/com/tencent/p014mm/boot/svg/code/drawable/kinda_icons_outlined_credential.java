package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icons_outlined_credential */
public class kinda_icons_outlined_credential extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(25.333334f, 2.6666667f);
                instancePath.cubicTo(26.069714f, 2.6666667f, 26.666666f, 3.2636204f, 26.666666f, 4.0f);
                instancePath.lineTo(26.666666f, 28.0f);
                instancePath.cubicTo(26.666666f, 28.73638f, 26.069714f, 29.333334f, 25.333334f, 29.333334f);
                instancePath.lineTo(6.6666665f, 29.333334f);
                instancePath.cubicTo(5.930287f, 29.333334f, 5.3333335f, 28.73638f, 5.3333335f, 28.0f);
                instancePath.lineTo(5.3333335f, 4.0f);
                instancePath.cubicTo(5.3333335f, 3.2636204f, 5.930287f, 2.6666667f, 6.6666665f, 2.6666667f);
                instancePath.lineTo(25.333334f, 2.6666667f);
                instancePath.close();
                instancePath.moveTo(25.066668f, 4.266667f);
                instancePath.lineTo(6.9333334f, 4.266667f);
                instancePath.lineTo(6.9333334f, 27.733334f);
                instancePath.lineTo(25.066668f, 27.733334f);
                instancePath.lineTo(25.066668f, 4.266667f);
                instancePath.close();
                instancePath.moveTo(14.666667f, 12.0f);
                instancePath.lineTo(14.666667f, 13.6f);
                instancePath.lineTo(9.333333f, 13.6f);
                instancePath.lineTo(9.333333f, 12.0f);
                instancePath.lineTo(14.666667f, 12.0f);
                instancePath.close();
                instancePath.moveTo(17.333334f, 8.0f);
                instancePath.lineTo(17.333334f, 9.6f);
                instancePath.lineTo(9.333333f, 9.6f);
                instancePath.lineTo(9.333333f, 8.0f);
                instancePath.lineTo(17.333334f, 8.0f);
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
