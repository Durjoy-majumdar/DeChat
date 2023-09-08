package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_game_notice_close */
public class icons_game_notice_close extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
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
                instancePaint3.setColor(Integer.MIN_VALUE);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.2084f, 8.91099f);
                instancePath.lineTo(5.04737f, 3.75f);
                instancePath.lineTo(4.16669f, 4.63068f);
                instancePath.lineTo(9.32767f, 9.79167f);
                instancePath.lineTo(4.16669f, 14.9527f);
                instancePath.lineTo(5.04737f, 15.8333f);
                instancePath.lineTo(10.2084f, 10.6723f);
                instancePath.lineTo(15.3693f, 15.8333f);
                instancePath.lineTo(16.25f, 14.9527f);
                instancePath.lineTo(11.089f, 9.79167f);
                instancePath.lineTo(16.25f, 4.63068f);
                instancePath.lineTo(15.3693f, 3.75f);
                instancePath.lineTo(10.2084f, 8.91099f);
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
