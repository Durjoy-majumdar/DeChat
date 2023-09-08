package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_filled_lock */
public class finder_like_new_style_filled_lock extends C24542c {
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
        instancePath.moveTo(55.5f, 40.72867f);
        instancePath.cubicTo(59.642136f, 40.72867f, 63.0f, 44.086533f, 63.0f, 48.22867f);
        instancePath.lineTo(63.0f, 49.1271f);
        instancePath.cubicTo(64.65685f, 49.1271f, 66.0f, 50.470245f, 66.0f, 52.1271f);
        instancePath.lineTo(66.0f, 63.00636f);
        instancePath.cubicTo(66.0f, 64.663216f, 64.65685f, 66.00636f, 63.0f, 66.00636f);
        instancePath.lineTo(48.0f, 66.00636f);
        instancePath.cubicTo(46.343147f, 66.00636f, 45.0f, 64.663216f, 45.0f, 63.00636f);
        instancePath.lineTo(45.0f, 52.1271f);
        Path path = instancePath;
        path.cubicTo(45.0f, 50.470245f, 46.343147f, 49.1271f, 48.0f, 49.1271f);
        instancePath.lineTo(48.0f, 48.22867f);
        path.cubicTo(48.0f, 44.086533f, 51.357864f, 40.72867f, 55.5f, 40.72867f);
        instancePath.close();
        instancePath.moveTo(16.758734f, 9.516547f);
        instancePath.lineTo(27.577467f, 20.335281f);
        instancePath.lineTo(22.910563f, 25.002186f);
        instancePath.lineTo(20.099f, 22.191547f);
        instancePath.lineTo(20.1f, 39.0f);
        instancePath.cubicTo(20.1f, 45.099297f, 24.88994f, 50.079838f, 30.913357f, 50.385166f);
        instancePath.lineTo(31.5f, 50.4f);
        instancePath.lineTo(40.70005f, 50.399036f);
        instancePath.cubicTo(40.56922f, 50.95381f, 40.5f, 51.53237f, 40.5f, 52.1271f);
        instancePath.lineTo(40.5f, 56.999f);
        instancePath.lineTo(31.5f, 57.0f);
        instancePath.cubicTo(21.558874f, 57.0f, 13.5f, 48.941124f, 13.5f, 39.0f);
        instancePath.lineTo(13.499f, 22.107548f);
        instancePath.lineTo(10.606905f, 25.002186f);
        instancePath.lineTo(5.94f, 20.335281f);
        instancePath.lineTo(16.758734f, 9.516547f);
        instancePath.close();
        instancePath.moveTo(55.5f, 44.32867f);
        instancePath.cubicTo(53.48071f, 44.32867f, 51.819855f, 45.86332f, 51.620136f, 47.829918f);
        instancePath.lineTo(51.6f, 48.22867f);
        instancePath.lineTo(51.597f, 49.125668f);
        instancePath.lineTo(59.4f, 49.125668f);
        instancePath.lineTo(59.4f, 48.22867f);
        instancePath.cubicTo(59.4f, 46.209377f, 57.865353f, 44.548523f, 55.898754f, 44.348804f);
        instancePath.lineTo(55.5f, 44.32867f);
        instancePath.close();
        instancePath.moveTo(30.362f, 14.999f);
        instancePath.lineTo(40.5f, 15.0f);
        instancePath.cubicTo(50.441124f, 15.0f, 58.5f, 23.058874f, 58.5f, 33.0f);
        instancePath.lineTo(58.500874f, 36.606945f);
        instancePath.cubicTo(57.541748f, 36.36001f, 56.536213f, 36.22867f, 55.5f, 36.22867f);
        instancePath.lineTo(54.901077f, 36.243355f);
        instancePath.cubicTo(53.860603f, 36.2945f, 52.854965f, 36.478157f, 51.900692f, 36.777817f);
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
