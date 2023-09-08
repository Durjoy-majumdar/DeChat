package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_finder_internal_feedback */
public class icons_outlined_finder_internal_feedback extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(19.0f, 2.0f);
                instancePath.cubicTo(19.552284f, 2.0f, 20.0f, 2.4477153f, 20.0f, 3.0f);
                instancePath.lineTo(20.0f, 21.0f);
                instancePath.cubicTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f);
                instancePath.lineTo(5.0f, 22.0f);
                instancePath.cubicTo(4.4477153f, 22.0f, 4.0f, 21.552284f, 4.0f, 21.0f);
                instancePath.lineTo(4.0f, 3.0f);
                instancePath.cubicTo(4.0f, 2.4477153f, 4.4477153f, 2.0f, 5.0f, 2.0f);
                instancePath.lineTo(19.0f, 2.0f);
                instancePath.close();
                instancePath.moveTo(18.8f, 3.2f);
                instancePath.lineTo(5.2f, 3.2f);
                instancePath.lineTo(5.2f, 20.8f);
                instancePath.lineTo(18.8f, 20.8f);
                instancePath.lineTo(18.8f, 3.2f);
                instancePath.close();
                instancePath.moveTo(11.0f, 16.2f);
                instancePath.lineTo(11.0f, 17.4f);
                instancePath.lineTo(7.0f, 17.4f);
                instancePath.lineTo(7.0f, 16.2f);
                instancePath.lineTo(11.0f, 16.2f);
                instancePath.close();
                instancePath.moveTo(16.0f, 11.4f);
                instancePath.lineTo(16.0f, 12.6f);
                instancePath.lineTo(7.0f, 12.6f);
                instancePath.lineTo(7.0f, 11.4f);
                instancePath.lineTo(16.0f, 11.4f);
                instancePath.close();
                instancePath.moveTo(14.5f, 6.6f);
                instancePath.lineTo(14.5f, 7.8f);
                instancePath.lineTo(7.0f, 7.8f);
                instancePath.lineTo(7.0f, 6.6f);
                instancePath.lineTo(14.5f, 6.6f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
