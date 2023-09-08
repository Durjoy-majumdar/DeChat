package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_msg_top_tip */
public class game_msg_top_tip extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePath.moveTo(10.0001f, 4.0f);
        Path path = instancePath;
        path.cubicTo(10.0001f, 2.89543f, 10.8955f, 2.0f, 12.0001f, 2.0f);
        path.cubicTo(13.1047f, 2.0f, 14.0001f, 2.89543f, 14.0001f, 4.0f);
        path.cubicTo(14.0001f, 4.11304f, 13.9907f, 4.22388f, 13.9727f, 4.3318f);
        path.cubicTo(16.3174f, 5.14769f, 18.0001f, 7.37734f, 18.0001f, 10.0f);
        instancePath.lineTo(18.0001f, 14.0f);
        path.cubicTo(18.0001f, 15.4693f, 18.5398f, 16.9386f, 19.6192f, 18.4079f);
        path.cubicTo(19.7453f, 18.5796f, 19.8134f, 18.787f, 19.8134f, 19.0f);
        path.cubicTo(19.8134f, 19.5523f, 19.3656f, 20.0f, 18.8133f, 20.0f);
        instancePath.lineTo(13.0001f, 20.0f);
        instancePath.lineTo(12.0001f, 20.0f);
        instancePath.lineTo(5.1868f, 20.0f);
        Path path2 = instancePath;
        path2.cubicTo(4.97382f, 20.0f, 4.7664f, 19.932f, 4.59476f, 19.8059f);
        path2.cubicTo(4.14969f, 19.4789f, 4.05396f, 18.8531f, 4.38093f, 18.408f);
        path2.cubicTo(5.46036f, 16.9386f, 6.00009f, 15.4693f, 6.00009f, 14.0f);
        instancePath.lineTo(6.00009f, 10.0f);
        Path path3 = instancePath;
        path3.cubicTo(6.00009f, 7.37734f, 7.6828f, 5.14769f, 10.0275f, 4.3318f);
        path3.cubicTo(10.0095f, 4.22388f, 10.0001f, 4.11304f, 10.0001f, 4.0f);
        instancePath.close();
        instancePath.moveTo(13.0001f, 20.0f);
        instancePath.lineTo(13.0001f, 20.2f);
        Path path4 = instancePath;
        path4.cubicTo(13.0001f, 20.7523f, 12.5524f, 21.2f, 12.0001f, 21.2f);
        path4.cubicTo(11.4478f, 21.2f, 11.0001f, 20.7523f, 11.0001f, 20.2f);
        instancePath.lineTo(11.0001f, 20.0f);
        instancePath.lineTo(13.0001f, 20.0f);
        instancePath.close();
        instancePath.moveTo(12.0001f, 18.8f);
        instancePath.lineTo(18.4259f, 18.8f);
        instancePath.cubicTo(17.3516f, 17.2356f, 16.8001f, 15.6304f, 16.8001f, 14.0f);
        instancePath.lineTo(16.8001f, 10.0f);
        instancePath.cubicTo(16.8001f, 7.94087f, 15.4915f, 6.13088f, 13.5783f, 5.46516f);
        instancePath.lineTo(12.6224f, 5.13252f);
        instancePath.lineTo(12.7891f, 4.13419f);
        Path path5 = instancePath;
        path5.cubicTo(12.7964f, 4.0905f, 12.8001f, 4.04575f, 12.8001f, 4.00001f);
        path5.cubicTo(12.8001f, 3.55818f, 12.4419f, 3.20001f, 12.0001f, 3.20001f);
        path5.cubicTo(11.5583f, 3.20001f, 11.2001f, 3.55818f, 11.2001f, 4.00001f);
        path5.cubicTo(11.2001f, 4.04575f, 11.2038f, 4.0905f, 11.2111f, 4.13419f);
        instancePath.lineTo(11.3778f, 5.13252f);
        instancePath.lineTo(10.4219f, 5.46516f);
        Path path6 = instancePath;
        path6.cubicTo(8.50871f, 6.13088f, 7.20009f, 7.94087f, 7.20009f, 10.0f);
        instancePath.lineTo(7.20009f, 14.0f);
        path6.cubicTo(7.20009f, 15.6303f, 6.64859f, 17.2355f, 5.57431f, 18.8f);
        instancePath.lineTo(12.0001f, 18.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
