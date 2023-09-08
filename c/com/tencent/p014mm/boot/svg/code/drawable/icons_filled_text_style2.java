package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_text_style2 */
public class icons_filled_text_style2 extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(58.5f, 9.0f);
                instancePath.lineTo(13.5f, 9.0f);
                instancePath.cubicTo(11.843145f, 9.0f, 10.5f, 10.343145f, 10.5f, 12.0f);
                instancePath.lineTo(10.5f, 24.0f);
                instancePath.cubicTo(10.5f, 25.656855f, 11.843145f, 27.0f, 13.5f, 27.0f);
                instancePath.lineTo(27.0f, 27.0f);
                instancePath.lineTo(27.0f, 27.0f);
                instancePath.lineTo(27.0f, 60.0f);
                instancePath.cubicTo(27.0f, 61.656853f, 28.343145f, 63.0f, 30.0f, 63.0f);
                instancePath.lineTo(42.0f, 63.0f);
                instancePath.cubicTo(43.656853f, 63.0f, 45.0f, 61.656853f, 45.0f, 60.0f);
                instancePath.lineTo(45.0f, 27.0f);
                instancePath.lineTo(45.0f, 27.0f);
                instancePath.lineTo(58.5f, 27.0f);
                instancePath.cubicTo(60.156853f, 27.0f, 61.5f, 25.656855f, 61.5f, 24.0f);
                instancePath.lineTo(61.5f, 12.0f);
                instancePath.cubicTo(61.5f, 10.343145f, 60.156853f, 9.0f, 58.5f, 9.0f);
                instancePath.close();
                instancePath.moveTo(55.5f, 15.0f);
                instancePath.lineTo(55.5f, 21.0f);
                instancePath.lineTo(39.0f, 21.0f);
                instancePath.lineTo(39.0f, 57.0f);
                instancePath.lineTo(33.0f, 57.0f);
                instancePath.lineTo(33.0f, 21.0f);
                instancePath.lineTo(16.5f, 21.0f);
                instancePath.lineTo(16.5f, 15.0f);
                instancePath.lineTo(55.5f, 15.0f);
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
