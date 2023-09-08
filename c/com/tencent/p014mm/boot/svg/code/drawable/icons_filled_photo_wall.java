package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_photo_wall */
public class icons_filled_photo_wall extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(18.0f, 19.5f);
                instancePath.lineTo(18.0f, 15.0f);
                instancePath.cubicTo(18.0f, 13.343145f, 19.343145f, 12.0f, 21.0f, 12.0f);
                instancePath.lineTo(63.0f, 12.0f);
                instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
                instancePath.lineTo(66.0f, 45.0f);
                instancePath.cubicTo(66.0f, 46.656853f, 64.65685f, 48.0f, 63.0f, 48.0f);
                instancePath.lineTo(58.5f, 48.0f);
                instancePath.lineTo(58.5f, 24.0f);
                instancePath.cubicTo(58.5f, 21.514719f, 56.485283f, 19.5f, 54.0f, 19.5f);
                instancePath.lineTo(18.0f, 19.5f);
                instancePath.close();
                instancePath.moveTo(9.0f, 24.0f);
                instancePath.lineTo(51.0f, 24.0f);
                instancePath.cubicTo(52.656853f, 24.0f, 54.0f, 25.343145f, 54.0f, 27.0f);
                instancePath.lineTo(54.0f, 57.0f);
                instancePath.cubicTo(54.0f, 58.656853f, 52.656853f, 60.0f, 51.0f, 60.0f);
                instancePath.lineTo(9.0f, 60.0f);
                instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
                instancePath.lineTo(6.0f, 27.0f);
                instancePath.cubicTo(6.0f, 25.343145f, 7.343146f, 24.0f, 9.0f, 24.0f);
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
