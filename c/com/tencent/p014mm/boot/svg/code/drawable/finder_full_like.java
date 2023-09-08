package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_like */
public class finder_full_like extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.658556f, 18.193398f);
                Path path = instancePath;
                path.cubicTo(18.51642f, 12.335534f, 28.013895f, 12.335534f, 33.87176f, 18.193398f);
                path.cubicTo(34.42018f, 18.741817f, 35.127285f, 19.423899f, 35.99308f, 20.239637f);
                path.cubicTo(36.858875f, 19.423899f, 37.56598f, 18.741817f, 38.1144f, 18.193398f);
                path.cubicTo(43.972263f, 12.335534f, 53.469738f, 12.335534f, 59.327602f, 18.193398f);
                path.cubicTo(65.13098f, 23.996773f, 65.18496f, 33.37236f, 59.48955f, 39.242195f);
                instancePath.lineTo(38.11429f, 60.619694f);
                Path path2 = instancePath;
                path2.cubicTo(36.94289f, 61.79144f, 35.043392f, 61.79154f, 33.87176f, 60.620026f);
                path2.cubicTo(33.871723f, 60.61999f, 33.871685f, 60.619953f, 33.87176f, 60.619804f);
                instancePath.lineTo(12.495378f, 39.243423f);
                instancePath.lineTo(12.495378f, 39.243423f);
                instancePath.cubicTo(6.801199f, 33.37236f, 6.8551817f, 23.996773f, 12.658556f, 18.193398f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
