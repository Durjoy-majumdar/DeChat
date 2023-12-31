package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_advertise_link_dark_icon */
public class album_advertise_link_dark_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        instancePaint3.setColor(-2130706433);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(32.4853f, 21.1716f);
        instancePath.lineTo(35.3137f, 24.0f);
        instancePath.lineTo(39.5564f, 19.7574f);
        Path path = instancePath;
        path.cubicTo(42.6806f, 16.6332f, 42.6806f, 11.5679f, 39.5564f, 8.44367f);
        path.cubicTo(36.4322f, 5.31948f, 31.3668f, 5.31948f, 28.2427f, 8.44367f);
        instancePath.lineTo(19.7574f, 16.929f);
        path.cubicTo(16.6332f, 20.0531f, 16.6332f, 25.1185f, 19.7574f, 28.2427f);
        instancePath.lineTo(22.5858f, 25.4142f);
        path.cubicTo(21.0237f, 23.8521f, 21.0237f, 21.3195f, 22.5858f, 19.7574f);
        instancePath.lineTo(31.0711f, 11.2721f);
        Path path2 = instancePath;
        path2.cubicTo(32.6332f, 9.71f, 35.1658f, 9.71f, 36.7279f, 11.2721f);
        path2.cubicTo(38.29f, 12.8342f, 38.29f, 15.3669f, 36.7279f, 16.929f);
        instancePath.lineTo(32.4853f, 21.1716f);
        instancePath.close();
        instancePath.moveTo(15.5147f, 26.8284f);
        instancePath.lineTo(12.6863f, 24.0f);
        instancePath.lineTo(8.44367f, 28.2427f);
        Path path3 = instancePath;
        path3.cubicTo(5.31948f, 31.3669f, 5.31948f, 36.4322f, 8.44367f, 39.5564f);
        path3.cubicTo(11.5679f, 42.6806f, 16.6332f, 42.6806f, 19.7574f, 39.5564f);
        instancePath.lineTo(28.2427f, 31.0711f);
        path3.cubicTo(31.3669f, 27.9469f, 31.3669f, 22.8816f, 28.2427f, 19.7574f);
        instancePath.lineTo(25.4142f, 22.5858f);
        path3.cubicTo(26.9763f, 24.1479f, 26.9763f, 26.6806f, 25.4142f, 28.2427f);
        instancePath.lineTo(16.929f, 36.7279f);
        path3.cubicTo(15.3669f, 38.29f, 12.8342f, 38.29f, 11.2721f, 36.7279f);
        path3.cubicTo(9.71f, 35.1658f, 9.71f, 32.6332f, 11.2721f, 31.0711f);
        instancePath.lineTo(15.5147f, 26.8284f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
