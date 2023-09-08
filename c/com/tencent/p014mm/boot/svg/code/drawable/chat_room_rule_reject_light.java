package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_room_rule_reject_light */
public class chat_room_rule_reject_light extends C24542c {
    private final int height = 12;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = 12;
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
                instancePaint3.setColor(637534208);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(6.0f, 11.0f);
                Path path = instancePath;
                path.cubicTo(3.23858f, 11.0f, 1.0f, 8.76142f, 1.0f, 6.0f);
                path.cubicTo(1.0f, 3.23858f, 3.23858f, 1.0f, 6.0f, 1.0f);
                path.cubicTo(8.76142f, 1.0f, 11.0f, 3.23858f, 11.0f, 6.0f);
                path.cubicTo(11.0f, 8.76142f, 8.76142f, 11.0f, 6.0f, 11.0f);
                instancePath.close();
                instancePath.moveTo(7.50262f, 3.96705f);
                instancePath.lineTo(8.03296f, 4.49738f);
                instancePath.lineTo(6.53033f, 6.0f);
                instancePath.lineTo(8.03291f, 7.50258f);
                instancePath.lineTo(7.50258f, 8.03291f);
                instancePath.lineTo(6.0f, 6.53033f);
                instancePath.lineTo(4.49742f, 8.03291f);
                instancePath.lineTo(3.96709f, 7.50258f);
                instancePath.lineTo(5.46967f, 6.0f);
                instancePath.lineTo(3.96705f, 4.49738f);
                instancePath.lineTo(4.49738f, 3.96705f);
                instancePath.lineTo(6.0f, 5.46967f);
                instancePath.lineTo(7.50262f, 3.96705f);
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
