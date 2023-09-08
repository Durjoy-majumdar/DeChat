package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_info_circle */
public class icons_info_circle extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = 64;
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
                instancePaint3.setColor(419430400);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 58.6667f);
                Path path = instancePath;
                path.cubicTo(17.2724f, 58.6667f, 5.33331f, 46.7276f, 5.33331f, 32.0f);
                path.cubicTo(5.33331f, 17.2724f, 17.2724f, 5.33334f, 32.0f, 5.33334f);
                path.cubicTo(46.7276f, 5.33334f, 58.6666f, 17.2724f, 58.6666f, 32.0f);
                path.cubicTo(58.6666f, 46.7276f, 46.7276f, 58.6667f, 32.0f, 58.6667f);
                instancePath.close();
                instancePath.moveTo(34.0f, 26.6667f);
                instancePath.lineTo(34.0f, 45.3333f);
                instancePath.lineTo(30.0f, 45.3333f);
                instancePath.lineTo(30.0f, 26.6667f);
                instancePath.lineTo(34.0f, 26.6667f);
                instancePath.close();
                instancePath.moveTo(32.0f, 24.0f);
                Path path2 = instancePath;
                path2.cubicTo(33.4727f, 24.0f, 34.6666f, 22.8061f, 34.6666f, 21.3333f);
                path2.cubicTo(34.6666f, 19.8606f, 33.4727f, 18.6667f, 32.0f, 18.6667f);
                path2.cubicTo(30.5272f, 18.6667f, 29.3333f, 19.8606f, 29.3333f, 21.3333f);
                path2.cubicTo(29.3333f, 22.8061f, 30.5272f, 24.0f, 32.0f, 24.0f);
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
