package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_play */
public class icons_filled_play extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(22.488417f, 14.56481f);
                instancePath.lineTo(55.441723f, 33.39527f);
                Path path = instancePath;
                path.cubicTo(56.880276f, 34.2173f, 57.380066f, 36.049866f, 56.558037f, 37.48842f);
                path.cubicTo(56.292267f, 37.95351f, 55.90682f, 38.338963f, 55.441723f, 38.60473f);
                instancePath.lineTo(22.488417f, 57.435192f);
                Path path2 = instancePath;
                path2.cubicTo(21.049864f, 58.25722f, 19.2173f, 57.75743f, 18.395271f, 56.31888f);
                path2.cubicTo(18.136246f, 55.865585f, 18.0f, 55.352543f, 18.0f, 54.83046f);
                instancePath.lineTo(18.0f, 17.169538f);
                Path path3 = instancePath;
                path3.cubicTo(18.0f, 15.512685f, 19.343145f, 14.169539f, 21.0f, 14.169539f);
                path3.cubicTo(21.522081f, 14.169539f, 22.035124f, 14.305785f, 22.488417f, 14.56481f);
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
