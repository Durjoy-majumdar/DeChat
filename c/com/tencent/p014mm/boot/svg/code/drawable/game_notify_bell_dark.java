package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_notify_bell_dark */
public class game_notify_bell_dark extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        instancePaint3.setColor(420523775);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 20.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        path.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
        instancePath.lineTo(40.0f, 20.0f);
        path.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
        instancePath.lineTo(20.0f, 40.0f);
        path.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(19.0001f, 28.0f);
        instancePath2.lineTo(13.1868f, 28.0f);
        Path path2 = instancePath2;
        path2.cubicTo(12.9738f, 28.0f, 12.7664f, 27.932f, 12.5948f, 27.8059f);
        path2.cubicTo(12.1497f, 27.4789f, 12.054f, 26.8531f, 12.3809f, 26.408f);
        instancePath2.lineTo(12.3809f, 26.408f);
        instancePath2.cubicTo(13.4604f, 24.9387f, 14.0001f, 23.4693f, 14.0001f, 22.0f);
        instancePath2.lineTo(14.0001f, 18.0f);
        Path path3 = instancePath2;
        path3.cubicTo(14.0001f, 15.3773f, 15.6828f, 13.1477f, 18.0275f, 12.3318f);
        path3.cubicTo(18.0095f, 12.2239f, 18.0001f, 12.113f, 18.0001f, 12.0f);
        path3.cubicTo(18.0001f, 10.8954f, 18.8955f, 10.0f, 20.0001f, 10.0f);
        path3.cubicTo(21.1047f, 10.0f, 22.0001f, 10.8954f, 22.0001f, 12.0f);
        path3.cubicTo(22.0001f, 12.113f, 21.9907f, 12.2239f, 21.9727f, 12.3318f);
        path3.cubicTo(24.3174f, 13.1477f, 26.0001f, 15.3773f, 26.0001f, 18.0f);
        instancePath2.lineTo(26.0001f, 22.0f);
        Path path4 = instancePath2;
        path4.cubicTo(26.0001f, 23.4693f, 26.5398f, 24.9386f, 27.6192f, 26.4079f);
        path4.cubicTo(27.7453f, 26.5796f, 27.8134f, 26.787f, 27.8134f, 27.0f);
        path4.cubicTo(27.8134f, 27.5523f, 27.3656f, 28.0f, 26.8133f, 28.0f);
        instancePath2.lineTo(21.0001f, 28.0f);
        instancePath2.lineTo(21.0001f, 28.2f);
        Path path5 = instancePath2;
        path5.cubicTo(21.0001f, 28.7523f, 20.5524f, 29.2f, 20.0001f, 29.2f);
        path5.cubicTo(19.4478f, 29.2f, 19.0001f, 28.7523f, 19.0001f, 28.2f);
        instancePath2.lineTo(19.0001f, 28.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
