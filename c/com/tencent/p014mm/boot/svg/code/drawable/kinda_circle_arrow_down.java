package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_circle_arrow_down */
public class kinda_circle_arrow_down extends C24542c {
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
                instancePaint3.setColor(117440512);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
                path.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
                path.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
                path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(11.2962f, 15.3462f);
                instancePath2.cubicTo(11.6867f, 15.7367f, 12.3199f, 15.7367f, 12.7104f, 15.3462f);
                instancePath2.lineTo(17.3066f, 10.75f);
                instancePath2.lineTo(16.1281f, 9.57147f);
                instancePath2.lineTo(12.0033f, 13.6963f);
                instancePath2.lineTo(7.87851f, 9.57147f);
                instancePath2.lineTo(6.7f, 10.75f);
                instancePath2.lineTo(11.2962f, 15.3462f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
