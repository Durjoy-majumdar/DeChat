package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icons_outlined_insurance */
public class kinda_icons_outlined_insurance extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.8f, 27.733334f);
        instancePath.cubicTo(14.1254835f, 27.733334f, 15.2f, 26.658817f, 15.2f, 25.333334f);
        instancePath.lineTo(15.199667f, 21.332666f);
        instancePath.lineTo(4.0f, 21.333334f);
        Path path = instancePath;
        path.cubicTo(3.2636204f, 21.333334f, 2.6666667f, 20.73638f, 2.6666667f, 20.0f);
        instancePath.lineTo(2.6666667f, 17.333334f);
        path.cubicTo(2.6666667f, 10.238116f, 8.208692f, 4.4373074f, 15.200049f, 4.0236015f);
        instancePath.lineTo(15.2f, 2.6666667f);
        instancePath.lineTo(16.8f, 2.6666667f);
        instancePath.lineTo(16.80054f, 4.0236363f);
        Path path2 = instancePath;
        path2.cubicTo(23.79162f, 4.4376345f, 29.333334f, 10.238316f, 29.333334f, 17.333334f);
        instancePath.lineTo(29.333334f, 20.0f);
        path2.cubicTo(29.333334f, 20.73638f, 28.73638f, 21.333334f, 28.0f, 21.333334f);
        instancePath.lineTo(16.799667f, 21.332666f);
        instancePath.lineTo(16.8f, 25.333334f);
        path2.cubicTo(16.8f, 27.475529f, 15.116032f, 29.224413f, 12.99964f, 29.328438f);
        instancePath.lineTo(12.8f, 29.333334f);
        path2.cubicTo(10.590861f, 29.333334f, 8.8f, 27.542473f, 8.8f, 25.333334f);
        instancePath.lineTo(10.4f, 25.333334f);
        path2.cubicTo(10.4f, 26.658817f, 11.474517f, 27.733334f, 12.8f, 27.733334f);
        instancePath.close();
        instancePath.moveTo(16.0f, 5.6f);
        path2.cubicTo(9.519859f, 5.6f, 4.266667f, 10.853192f, 4.266667f, 17.333334f);
        instancePath.lineTo(4.266667f, 19.733334f);
        instancePath.lineTo(27.733334f, 19.733334f);
        instancePath.lineTo(27.733334f, 17.333334f);
        path2.cubicTo(27.733334f, 10.853192f, 22.48014f, 5.6f, 16.0f, 5.6f);
        instancePath.close();
        instancePath.moveTo(21.333334f, 9.733334f);
        instancePath.lineTo(22.423265f, 10.904678f);
        instancePath.lineTo(15.258624f, 17.571344f);
        path2.cubicTo(14.9515085f, 17.857115f, 14.475808f, 17.857115f, 14.168693f, 17.571344f);
        instancePath.lineTo(10.666667f, 14.312725f);
        instancePath.lineTo(11.756598f, 13.14138f);
        instancePath.lineTo(14.713658f, 15.892912f);
        instancePath.lineTo(21.333334f, 9.733334f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
