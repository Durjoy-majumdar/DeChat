package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_bell_on */
public class icons_bell_on extends C24542c {
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
                instancePaint3.setColor(-15616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.9999f, 20.0f);
                instancePath.lineTo(5.1866f, 20.0f);
                Path path = instancePath;
                path.cubicTo(4.3807f, 20.0f, 3.901f, 19.061f, 4.38073f, 18.408f);
                path.cubicTo(5.46019f, 16.9387f, 5.99989f, 15.4693f, 5.99989f, 14.0f);
                instancePath.lineTo(5.99989f, 10.0f);
                Path path2 = instancePath;
                path2.cubicTo(5.99989f, 7.37734f, 7.6826f, 5.14769f, 10.0273f, 4.3318f);
                path2.cubicTo(10.0093f, 4.22388f, 9.99989f, 4.11304f, 9.99989f, 4.0f);
                path2.cubicTo(9.99989f, 2.89543f, 10.8953f, 2.0f, 11.9999f, 2.0f);
                path2.cubicTo(13.1045f, 2.0f, 13.9999f, 2.89543f, 13.9999f, 4.0f);
                path2.cubicTo(13.9999f, 4.11304f, 13.9905f, 4.22388f, 13.9725f, 4.3318f);
                path2.cubicTo(16.3172f, 5.14769f, 17.9999f, 7.37734f, 17.9999f, 10.0f);
                instancePath.lineTo(17.9999f, 14.0f);
                Path path3 = instancePath;
                path3.cubicTo(17.9999f, 15.4693f, 18.5396f, 16.9386f, 19.619f, 18.4079f);
                path3.cubicTo(20.0876f, 19.0457f, 19.619f, 20.0f, 18.8131f, 20.0f);
                instancePath.lineTo(12.9999f, 20.0f);
                instancePath.lineTo(12.9999f, 20.2f);
                Path path4 = instancePath;
                path4.cubicTo(12.9999f, 20.7523f, 12.5522f, 21.2f, 11.9999f, 21.2f);
                path4.cubicTo(11.4476f, 21.2f, 10.9999f, 20.7523f, 10.9999f, 20.2f);
                instancePath.lineTo(10.9999f, 20.0f);
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
