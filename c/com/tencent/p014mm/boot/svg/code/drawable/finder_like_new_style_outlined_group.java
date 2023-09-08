package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_outlined_group */
public class finder_like_new_style_outlined_group extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(55.5f, 45.0f);
        instancePath.cubicTo(57.94168f, 45.0f, 59.92105f, 47.091812f, 59.92105f, 49.66691f);
        instancePath.lineTo(59.92105f, 51.661884f);
        instancePath.cubicTo(59.92105f, 52.990845f, 59.258926f, 54.89667f, 58.44894f, 55.910168f);
        instancePath.lineTo(58.04935f, 56.410156f);
        instancePath.cubicTo(57.397774f, 57.22544f, 57.601315f, 58.26313f, 58.512447f, 58.73226f);
        instancePath.lineTo(64.76863f, 61.953484f);
        instancePath.cubicTo(65.4487f, 62.303642f, 66.0f, 63.229366f, 66.0f, 64.034706f);
        instancePath.lineTo(66.0f, 64.833336f);
        instancePath.cubicTo(66.0f, 65.47767f, 65.47767f, 66.0f, 64.833336f, 66.0f);
        instancePath.lineTo(46.166668f, 66.0f);
        instancePath.cubicTo(45.522335f, 66.0f, 45.0f, 65.47767f, 45.0f, 64.833336f);
        instancePath.lineTo(45.0f, 64.034706f);
        instancePath.cubicTo(45.0f, 63.235435f, 45.550587f, 62.303894f, 46.231373f, 61.95322f);
        instancePath.lineTo(52.487553f, 58.730667f);
        instancePath.cubicTo(53.39489f, 58.263298f, 53.605865f, 57.228138f, 52.95065f, 56.408413f);
        instancePath.lineTo(52.55106f, 55.908493f);
        instancePath.cubicTo(51.738037f, 54.891335f, 51.07895f, 52.991077f, 51.07895f, 51.66084f);
        instancePath.lineTo(51.07895f, 49.666176f);
        instancePath.cubicTo(51.07895f, 47.08912f, 53.06329f, 45.0f, 55.5f, 45.0f);
        instancePath.close();
        instancePath.moveTo(16.758734f, 9.516547f);
        instancePath.lineTo(27.577467f, 20.335281f);
        instancePath.lineTo(22.910563f, 25.002186f);
        instancePath.lineTo(20.099f, 22.191547f);
        instancePath.lineTo(20.1f, 39.0f);
        instancePath.cubicTo(20.1f, 45.099297f, 24.88994f, 50.079838f, 30.913357f, 50.385166f);
        instancePath.lineTo(31.5f, 50.4f);
        instancePath.lineTo(46.578f, 50.399f);
        instancePath.lineTo(46.57895f, 51.66084f);
        instancePath.lineTo(46.599518f, 52.257656f);
        instancePath.cubicTo(46.681156f, 53.47033f, 47.001976f, 54.785965f, 47.49312f, 56.00213f);
        instancePath.lineTo(47.577f, 56.196f);
        instancePath.lineTo(46.018f, 56.999f);
        instancePath.lineTo(31.5f, 57.0f);
        instancePath.cubicTo(21.558874f, 57.0f, 13.5f, 48.941124f, 13.5f, 39.0f);
        instancePath.lineTo(13.499f, 22.107548f);
        instancePath.lineTo(10.606905f, 25.002186f);
        instancePath.lineTo(5.94f, 20.335281f);
        instancePath.lineTo(16.758734f, 9.516547f);
        instancePath.close();
        instancePath.moveTo(30.362f, 14.999f);
        instancePath.lineTo(40.5f, 15.0f);
        instancePath.cubicTo(50.441124f, 15.0f, 58.5f, 23.058874f, 58.5f, 33.0f);
        instancePath.lineTo(58.500927f, 41.029335f);
        Path path = instancePath;
        path.cubicTo(57.565952f, 40.686962f, 56.55645f, 40.5f, 55.5f, 40.5f);
        path.cubicTo(54.214172f, 40.5f, 52.997482f, 40.777306f, 51.899982f, 41.274956f);
        instancePath.lineTo(51.9f, 33.0f);
        instancePath.cubicTo(51.9f, 26.900705f, 47.110058f, 21.920162f, 41.086643f, 21.614834f);
        instancePath.lineTo(40.5f, 21.6f);
        instancePath.lineTo(36.963f, 21.599f);
        instancePath.lineTo(30.362f, 14.999f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
