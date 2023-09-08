package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_icon_dark_more */
public class actionbar_icon_dark_more extends C24542c {
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
                instancePath.moveTo(18.0f, 37.5f);
                Path path = instancePath;
                path.cubicTo(18.0f, 39.9849f, 15.9849f, 42.0f, 13.5f, 42.0f);
                path.cubicTo(11.0151f, 42.0f, 9.0f, 39.9849f, 9.0f, 37.5f);
                path.cubicTo(9.0f, 35.0142f, 11.0151f, 33.0f, 13.5f, 33.0f);
                path.cubicTo(15.9849f, 33.0f, 18.0f, 35.0142f, 18.0f, 37.5f);
                instancePath.close();
                instancePath.moveTo(34.5f, 33.0f);
                Path path2 = instancePath;
                path2.cubicTo(36.9849f, 33.0f, 39.0f, 35.0142f, 39.0f, 37.5f);
                path2.cubicTo(39.0f, 39.9849f, 36.9849f, 42.0f, 34.5f, 42.0f);
                path2.cubicTo(32.0151f, 42.0f, 30.0f, 39.9849f, 30.0f, 37.5f);
                path2.cubicTo(30.0f, 35.0142f, 32.0151f, 33.0f, 34.5f, 33.0f);
                instancePath.close();
                instancePath.moveTo(55.5f, 33.0f);
                Path path3 = instancePath;
                path3.cubicTo(57.9849f, 33.0f, 60.0f, 35.0142f, 60.0f, 37.5f);
                path3.cubicTo(60.0f, 39.9849f, 57.9849f, 42.0f, 55.5f, 42.0f);
                path3.cubicTo(53.0151f, 42.0f, 51.0f, 39.9849f, 51.0f, 37.5f);
                path3.cubicTo(51.0f, 35.0142f, 53.0151f, 33.0f, 55.5f, 33.0f);
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
