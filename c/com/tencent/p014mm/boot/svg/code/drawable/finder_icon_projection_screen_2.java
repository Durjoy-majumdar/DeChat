package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_projection_screen_2 */
public class finder_icon_projection_screen_2 extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(37.8585f, 42.2231f);
                instancePath.lineTo(52.1415f, 60.0768f);
                instancePath.cubicTo(53.1679f, 61.3599f, 52.6327f, 62.4f, 50.9926f, 62.4f);
                instancePath.lineTo(21.0074f, 62.4f);
                instancePath.cubicTo(19.3465f, 62.4f, 18.844f, 61.345f, 19.8585f, 60.0768f);
                instancePath.lineTo(34.1415f, 42.2231f);
                Path path = instancePath;
                path.cubicTo(35.1679f, 40.9401f, 36.844f, 40.955f, 37.8585f, 42.2231f);
                instancePath.close();
                instancePath.moveTo(63.0f, 12.0f);
                path.cubicTo(64.6569f, 12.0f, 66.0f, 13.3431f, 66.0f, 15.0f);
                instancePath.lineTo(66.0f, 54.0f);
                instancePath.cubicTo(66.0f, 55.6569f, 64.6569f, 57.0f, 63.0f, 57.0f);
                instancePath.lineTo(54.0f, 57.0f);
                instancePath.lineTo(54.0f, 52.5f);
                instancePath.lineTo(61.5f, 52.5f);
                instancePath.lineTo(61.5f, 16.5f);
                instancePath.lineTo(10.5f, 16.5f);
                instancePath.lineTo(10.5f, 52.5f);
                instancePath.lineTo(18.0f, 52.5f);
                instancePath.lineTo(18.0f, 57.0f);
                instancePath.lineTo(9.0f, 57.0f);
                instancePath.cubicTo(7.34315f, 57.0f, 6.0f, 55.6569f, 6.0f, 54.0f);
                instancePath.lineTo(6.0f, 15.0f);
                instancePath.cubicTo(6.0f, 13.3431f, 7.34315f, 12.0f, 9.0f, 12.0f);
                instancePath.lineTo(63.0f, 12.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
