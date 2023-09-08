package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tipsbar_icon_location */
public class tipsbar_icon_location extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(46.62213f, 76.7455f);
                Path path = instancePath;
                path.cubicTo(46.62213f, 76.7455f, 27.0f, 57.136356f, 27.0f, 41.21418f);
                path.cubicTo(27.0f, 29.446882f, 36.40202f, 20.0f, 48.304348f, 20.0f);
                path.cubicTo(59.59798f, 20.0f, 69.0f, 29.446882f, 69.0f, 41.21418f);
                path.cubicTo(69.0f, 57.136356f, 49.37787f, 76.7455f, 49.37787f, 76.7455f);
                path.cubicTo(48.628487f, 77.53978f, 47.383106f, 77.54187f, 46.62213f, 76.7455f);
                instancePath.close();
                instancePath.moveTo(48.0f, 48.0905f);
                Path path2 = instancePath;
                path2.cubicTo(51.865993f, 48.0905f, 55.0f, 44.94636f, 55.0f, 41.067875f);
                path2.cubicTo(55.0f, 37.189384f, 51.865993f, 34.04525f, 48.0f, 34.04525f);
                path2.cubicTo(44.134007f, 34.04525f, 41.0f, 37.189384f, 41.0f, 41.067875f);
                path2.cubicTo(41.0f, 44.94636f, 44.134007f, 48.0905f, 48.0f, 48.0905f);
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
