package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_chat */
public class icons_filled_chat extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 20.0f);
                Path path = instancePath;
                path.cubicTo(17.522848f, 20.0f, 22.0f, 16.19442f, 22.0f, 11.5f);
                path.cubicTo(22.0f, 6.8055797f, 17.522848f, 3.0f, 12.0f, 3.0f);
                path.cubicTo(6.4771523f, 3.0f, 2.0f, 6.8055797f, 2.0f, 11.5f);
                path.cubicTo(2.0f, 14.036405f, 3.306998f, 16.313334f, 5.3797565f, 17.870733f);
                instancePath.lineTo(5.077659f, 20.469614f);
                Path path2 = instancePath;
                path2.cubicTo(5.0457745f, 20.74391f, 5.2422876f, 20.992117f, 5.516583f, 21.024002f);
                path2.cubicTo(5.6103826f, 21.034904f, 5.705353f, 21.019022f, 5.790501f, 20.978193f);
                instancePath.lineTo(8.773454f, 19.547836f);
                instancePath.cubicTo(9.78573f, 19.840973f, 10.8710165f, 20.0f, 12.0f, 20.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
