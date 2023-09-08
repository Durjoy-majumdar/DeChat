package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_panel_set_intro_arrow */
public class emoji_panel_set_intro_arrow extends C24542c {
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(18.6465f, 11.6465f);
                instancePath.cubicTo(18.8418f, 11.8417f, 18.8418f, 12.1583f, 18.6465f, 12.3536f);
                instancePath.lineTo(17.9394f, 13.0607f);
                instancePath.lineTo(14.7574f, 16.2427f);
                instancePath.lineTo(13.6968f, 15.182f);
                instancePath.lineTo(16.1288f, 12.75f);
                instancePath.lineTo(11.0001f, 12.75f);
                instancePath.lineTo(11.0001f, 11.25f);
                instancePath.lineTo(16.1288f, 11.25f);
                instancePath.lineTo(13.6968f, 8.81806f);
                instancePath.lineTo(14.7574f, 7.7574f);
                instancePath.lineTo(17.9394f, 10.9394f);
                instancePath.lineTo(18.6465f, 11.6465f);
                instancePath.close();
                instancePath.moveTo(9.50008f, 12.75f);
                instancePath.lineTo(8.00008f, 12.75f);
                instancePath.lineTo(8.00007f, 11.25f);
                instancePath.lineTo(9.50007f, 11.25f);
                instancePath.lineTo(9.50008f, 12.75f);
                instancePath.close();
                instancePath.moveTo(5.00008f, 12.75f);
                instancePath.lineTo(6.50008f, 12.75f);
                instancePath.lineTo(6.50007f, 11.25f);
                instancePath.lineTo(5.00007f, 11.25f);
                instancePath.lineTo(5.00008f, 12.75f);
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
