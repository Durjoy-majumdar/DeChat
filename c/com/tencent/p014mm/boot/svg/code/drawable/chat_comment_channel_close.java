package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_comment_channel_close */
public class chat_comment_channel_close extends C24542c {
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
                instancePaint3.setColor(-2130706433);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(8.00004f, 14.6668f);
                Path path = instancePath;
                path.cubicTo(4.31814f, 14.6668f, 1.33337f, 11.6821f, 1.33337f, 8.00016f);
                path.cubicTo(1.33337f, 4.31826f, 4.31814f, 1.3335f, 8.00004f, 1.3335f);
                path.cubicTo(11.6819f, 1.3335f, 14.6667f, 4.31826f, 14.6667f, 8.00016f);
                path.cubicTo(14.6667f, 11.6821f, 11.6819f, 14.6668f, 8.00004f, 14.6668f);
                instancePath.close();
                instancePath.moveTo(10.0035f, 5.28956f);
                instancePath.lineTo(10.7106f, 5.99666f);
                instancePath.lineTo(8.70715f, 8.00016f);
                instancePath.lineTo(10.7106f, 10.0036f);
                instancePath.lineTo(10.0035f, 10.7107f);
                instancePath.lineTo(8.00004f, 8.70727f);
                instancePath.lineTo(5.9966f, 10.7107f);
                instancePath.lineTo(5.2895f, 10.0036f);
                instancePath.lineTo(7.29293f, 8.00016f);
                instancePath.lineTo(5.28944f, 5.99666f);
                instancePath.lineTo(5.99654f, 5.28956f);
                instancePath.lineTo(8.00004f, 7.29306f);
                instancePath.lineTo(10.0035f, 5.28956f);
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
