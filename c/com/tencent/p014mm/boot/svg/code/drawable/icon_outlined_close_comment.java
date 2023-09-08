package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_close_comment */
public class icon_outlined_close_comment extends C24542c {
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
        instancePath.moveTo(10.25783f, 12.349655f);
        instancePath.lineTo(13.508f, 15.6f);
        instancePath.lineTo(12.0f, 15.6f);
        instancePath.cubicTo(11.502944f, 15.6f, 11.1f, 16.002943f, 11.1f, 16.5f);
        instancePath.lineTo(11.1f, 48.0f);
        instancePath.cubicTo(11.1f, 48.497055f, 11.502944f, 48.9f, 12.0f, 48.9f);
        instancePath.lineTo(26.1f, 48.9f);
        instancePath.lineTo(26.1f, 55.8f);
        instancePath.lineTo(33.00883f, 48.9f);
        instancePath.lineTo(46.808f, 48.899f);
        instancePath.lineTo(50.409f, 52.5f);
        instancePath.lineTo(34.5f, 52.5f);
        instancePath.lineTo(27.62132f, 59.37f);
        Path path = instancePath;
        path.cubicTo(26.449747f, 60.541573f, 24.550253f, 60.541573f, 23.37868f, 59.37f);
        path.cubicTo(22.81607f, 58.807392f, 22.5f, 58.06565f, 22.5f, 57.27f);
        instancePath.lineTo(22.5f, 52.5f);
        instancePath.lineTo(12.0f, 52.5f);
        instancePath.cubicTo(9.514719f, 52.5f, 7.5f, 50.485283f, 7.5f, 48.0f);
        instancePath.lineTo(7.5f, 16.5f);
        Path path2 = instancePath;
        path2.cubicTo(7.5f, 14.632412f, 8.637693f, 13.030547f, 10.25783f, 12.349655f);
        instancePath.close();
        instancePath.moveTo(60.0f, 12.0f);
        path2.cubicTo(62.485283f, 12.0f, 64.5f, 14.014719f, 64.5f, 16.5f);
        instancePath.lineTo(64.5f, 48.0f);
        Path path3 = instancePath;
        path3.cubicTo(64.5f, 50.485283f, 62.485283f, 52.5f, 60.0f, 52.5f);
        instancePath.lineTo(55.5f, 52.5f);
        instancePath.lineTo(51.899f, 48.899f);
        instancePath.lineTo(60.0f, 48.9f);
        path3.cubicTo(60.497055f, 48.9f, 60.9f, 48.497055f, 60.9f, 48.0f);
        instancePath.lineTo(60.9f, 16.5f);
        path3.cubicTo(60.9f, 16.002943f, 60.497055f, 15.6f, 60.0f, 15.6f);
        instancePath.lineTo(18.599f, 15.6f);
        instancePath.lineTo(14.999f, 12.0f);
        instancePath.lineTo(60.0f, 12.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(11.545586f, 8.545585f);
        instancePath2.lineTo(14.09117f, 6.0f);
        instancePath2.lineTo(64.27494f, 56.183765f);
        instancePath2.lineTo(61.72935f, 58.72935f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
