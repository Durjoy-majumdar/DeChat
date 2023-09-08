package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_channels_fav_thick */
public class icons_filled_channels_fav_thick extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.4111f, 6.6253f);
        instancePath.cubicTo(34.8409f, 5.79125f, 37.1602f, 5.79188f, 38.5889f, 6.6253f);
        instancePath.lineTo(60.4111f, 19.3549f);
        instancePath.cubicTo(61.8409f, 20.189f, 63.0f, 22.2186f, 63.0f, 23.857f);
        instancePath.lineTo(63.0f, 49.3733f);
        instancePath.cubicTo(63.0f, 51.0256f, 61.8398f, 53.0419f, 60.4111f, 53.8753f);
        instancePath.lineTo(38.5889f, 66.6049f);
        instancePath.cubicTo(37.1591f, 67.439f, 34.8398f, 67.4384f, 33.4111f, 66.6049f);
        instancePath.lineTo(11.5889f, 53.8753f);
        instancePath.cubicTo(10.1591f, 53.0413f, 9.0f, 51.0116f, 9.0f, 49.3733f);
        instancePath.lineTo(9.0f, 23.857f);
        instancePath.cubicTo(9.0f, 22.2046f, 10.1602f, 20.1884f, 11.5889f, 19.3549f);
        instancePath.lineTo(33.4111f, 6.6253f);
        instancePath.close();
        instancePath.moveTo(12.6f, 49.3733f);
        instancePath.lineTo(12.6f, 25.1836f);
        instancePath.lineTo(34.2f, 37.6544f);
        instancePath.lineTo(34.2f, 62.8974f);
        instancePath.lineTo(13.4028f, 50.7657f);
        instancePath.cubicTo(13.0837f, 50.5795f, 12.6f, 49.7366f, 12.6f, 49.3733f);
        instancePath.close();
        instancePath.moveTo(36.0f, 34.5367f);
        instancePath.lineTo(57.7577f, 21.9748f);
        instancePath.lineTo(36.7749f, 9.7349f);
        instancePath.cubicTo(36.4667f, 9.55507f, 35.5335f, 9.55499f, 35.2251f, 9.7349f);
        instancePath.lineTo(14.2423f, 21.9748f);
        instancePath.lineTo(36.0f, 34.5367f);
        instancePath.close();
        instancePath.moveTo(37.8f, 37.6544f);
        instancePath.lineTo(37.8f, 62.8974f);
        instancePath.lineTo(58.5972f, 50.7657f);
        instancePath.cubicTo(58.921f, 50.5768f, 59.4f, 49.744f, 59.4f, 49.3733f);
        instancePath.lineTo(59.4f, 25.1836f);
        instancePath.lineTo(37.8f, 37.6544f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
