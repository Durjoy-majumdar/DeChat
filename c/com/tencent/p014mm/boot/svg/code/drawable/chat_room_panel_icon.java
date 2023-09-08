package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_room_panel_icon */
public class chat_room_panel_icon extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = 16;
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
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(9.0f, -6.3004E-6f);
                instancePath.lineTo(7.0f, -6.3004E-6f);
                instancePath.lineTo(7.0f, 6.99999f);
                instancePath.lineTo(-2.47955E-5f, 6.99999f);
                instancePath.lineTo(-2.47955E-5f, 8.99999f);
                instancePath.lineTo(7.0f, 8.99999f);
                instancePath.lineTo(7.0f, 16.0f);
                instancePath.lineTo(9.0f, 16.0f);
                instancePath.lineTo(9.0f, 8.99999f);
                instancePath.lineTo(16.0f, 8.99999f);
                instancePath.lineTo(16.0f, 6.99999f);
                instancePath.lineTo(9.0f, 6.99999f);
                instancePath.lineTo(9.0f, -6.3004E-6f);
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
