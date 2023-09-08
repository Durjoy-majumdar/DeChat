package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_multiple_choice_new */
public class icons_filled_multiple_choice_new extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = 32;
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.0f, 6.0f);
                instancePath.lineTo(6.0f, 6.0f);
                instancePath.lineTo(6.0f, 8.0f);
                instancePath.lineTo(4.0f, 8.0f);
                instancePath.lineTo(4.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(9.33333f, 6.0f);
                instancePath.lineTo(26.6667f, 6.0f);
                instancePath.lineTo(26.6667f, 8.0f);
                instancePath.lineTo(9.33333f, 8.0f);
                instancePath.lineTo(9.33333f, 6.0f);
                instancePath.close();
                instancePath.moveTo(22.6667f, 16.6667f);
                instancePath.lineTo(22.6667f, 14.6667f);
                instancePath.lineTo(9.33333f, 14.6667f);
                instancePath.lineTo(9.33333f, 16.6667f);
                instancePath.lineTo(22.6667f, 16.6667f);
                instancePath.close();
                instancePath.moveTo(22.0474f, 27.2328f);
                instancePath.lineTo(29.1185f, 20.1617f);
                instancePath.lineTo(27.7041f, 18.7474f);
                instancePath.lineTo(22.0466f, 24.4034f);
                instancePath.lineTo(20.1618f, 22.5187f);
                instancePath.lineTo(18.7476f, 23.9329f);
                instancePath.lineTo(22.0474f, 27.2328f);
                instancePath.close();
                instancePath.moveTo(16.0f, 23.3333f);
                instancePath.lineTo(16.0f, 25.3333f);
                instancePath.lineTo(9.33333f, 25.3333f);
                instancePath.lineTo(9.33333f, 23.3333f);
                instancePath.lineTo(16.0f, 23.3333f);
                instancePath.close();
                instancePath.moveTo(6.0f, 14.6667f);
                instancePath.lineTo(4.0f, 14.6667f);
                instancePath.lineTo(4.0f, 16.6667f);
                instancePath.lineTo(6.0f, 16.6667f);
                instancePath.lineTo(6.0f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(4.0f, 23.3333f);
                instancePath.lineTo(6.0f, 23.3333f);
                instancePath.lineTo(6.0f, 25.3333f);
                instancePath.lineTo(4.0f, 25.3333f);
                instancePath.lineTo(4.0f, 23.3333f);
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
