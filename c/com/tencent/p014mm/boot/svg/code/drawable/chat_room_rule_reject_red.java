package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chat_room_rule_reject_red */
public class chat_room_rule_reject_red extends C24542c {
    private final int height = 10;
    private final int width = 10;

    public int doCommand(int i, Object... objArr) {
        int i2 = 10;
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
                instancePaint3.setColor(-372399);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.0f, 10.0f);
                Path path = instancePath;
                path.cubicTo(2.23858f, 10.0f, 0.0f, 7.76142f, 0.0f, 5.0f);
                path.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
                path.cubicTo(7.76142f, 0.0f, 10.0f, 2.23858f, 10.0f, 5.0f);
                path.cubicTo(10.0f, 7.76142f, 7.76142f, 10.0f, 5.0f, 10.0f);
                instancePath.close();
                instancePath.moveTo(6.50262f, 2.96705f);
                instancePath.lineTo(7.03296f, 3.49738f);
                instancePath.lineTo(5.53033f, 5.0f);
                instancePath.lineTo(7.03291f, 6.50258f);
                instancePath.lineTo(6.50258f, 7.03291f);
                instancePath.lineTo(5.0f, 5.53033f);
                instancePath.lineTo(3.49742f, 7.03291f);
                instancePath.lineTo(2.96709f, 6.50258f);
                instancePath.lineTo(4.46967f, 5.0f);
                instancePath.lineTo(2.96705f, 3.49738f);
                instancePath.lineTo(3.49738f, 2.96705f);
                instancePath.lineTo(5.0f, 4.46967f);
                instancePath.lineTo(6.50262f, 2.96705f);
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
