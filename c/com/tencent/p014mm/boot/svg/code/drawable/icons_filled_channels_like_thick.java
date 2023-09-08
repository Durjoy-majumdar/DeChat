package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_channels_like_thick */
public class icons_filled_channels_like_thick extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(33.87176f, 18.193398f);
                instancePath.lineTo(35.030296f, 19.324907f);
                instancePath.lineTo(35.99308f, 20.239637f);
                instancePath.lineTo(37.380127f, 18.915659f);
                instancePath.lineTo(38.1144f, 18.193398f);
                Path path = instancePath;
                path.cubicTo(43.972263f, 12.335534f, 53.469738f, 12.335534f, 59.327602f, 18.193398f);
                path.cubicTo(65.13098f, 23.996773f, 65.18496f, 33.37236f, 59.48955f, 39.242195f);
                instancePath.lineTo(38.11429f, 60.619694f);
                instancePath.cubicTo(37.032997f, 61.701305f, 35.331314f, 61.78459f, 34.154396f, 60.86958f);
                instancePath.lineTo(33.87176f, 60.619804f);
                instancePath.lineTo(12.495378f, 39.243423f);
                Path path2 = instancePath;
                path2.cubicTo(6.801199f, 33.37236f, 6.8551817f, 23.996773f, 12.658556f, 18.193398f);
                path2.cubicTo(18.51642f, 12.335534f, 28.013895f, 12.335534f, 33.87176f, 18.193398f);
                instancePath.close();
                instancePath.moveTo(31.326176f, 20.738983f);
                path2.cubicTo(26.874199f, 16.287006f, 19.656118f, 16.287006f, 15.204141f, 20.738983f);
                path2.cubicTo(10.950482f, 24.992641f, 10.75639f, 31.782394f, 14.612329f, 36.230446f);
                instancePath.lineTo(15.040962f, 36.697838f);
                instancePath.lineTo(35.988f, 57.654f);
                instancePath.lineTo(56.90587f, 36.735287f);
                instancePath.cubicTo(61.08883f, 32.42422f, 61.185925f, 25.632872f, 57.222237f, 21.20422f);
                instancePath.lineTo(56.78202f, 20.738983f);
                instancePath.cubicTo(52.330044f, 16.287006f, 45.11196f, 16.287006f, 40.659985f, 20.738983f);
                instancePath.lineTo(39.453827f, 21.917252f);
                instancePath.lineTo(35.99308f, 25.185825f);
                instancePath.lineTo(32.092857f, 21.493258f);
                instancePath.lineTo(31.326176f, 20.738983f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
