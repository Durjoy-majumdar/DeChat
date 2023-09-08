package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_search */
public class icons_filled_search extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                instancePath.moveTo(49.864876f, 45.51525f);
                instancePath.lineTo(62.598618f, 58.248997f);
                instancePath.lineTo(58.355976f, 62.49164f);
                instancePath.lineTo(45.63759f, 49.77325f);
                Path path = instancePath;
                path.cubicTo(42.1214f, 52.426655f, 37.744442f, 54.0f, 33.0f, 54.0f);
                path.cubicTo(21.402f, 54.0f, 12.0f, 44.598f, 12.0f, 33.0f);
                path.cubicTo(12.0f, 21.402f, 21.402f, 12.0f, 33.0f, 12.0f);
                path.cubicTo(44.598f, 12.0f, 54.0f, 21.402f, 54.0f, 33.0f);
                path.cubicTo(54.0f, 37.68957f, 52.462833f, 42.020115f, 49.864876f, 45.51525f);
                instancePath.close();
                instancePath.moveTo(48.0f, 33.0f);
                Path path2 = instancePath;
                path2.cubicTo(48.0f, 24.715714f, 41.284286f, 18.0f, 33.0f, 18.0f);
                path2.cubicTo(24.715714f, 18.0f, 18.0f, 24.715714f, 18.0f, 33.0f);
                path2.cubicTo(18.0f, 41.284286f, 24.715714f, 48.0f, 33.0f, 48.0f);
                path2.cubicTo(41.284286f, 48.0f, 48.0f, 41.284286f, 48.0f, 33.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
