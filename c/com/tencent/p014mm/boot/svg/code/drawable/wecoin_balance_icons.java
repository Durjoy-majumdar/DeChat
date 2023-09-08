package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wecoin_balance_icons */
public class wecoin_balance_icons extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
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
                instancePaint3.setColor(-8727808);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(14.660116f, 5.9295855f);
                Path path = instancePath;
                path.cubicTo(13.89521f, 5.1705894f, 12.896751f, 4.7460914f, 11.80079f, 4.6335917f);
                path.cubicTo(11.662472f, 4.96959f, 11.447815f, 5.349088f, 11.123562f, 5.793086f);
                path.cubicTo(10.205221f, 7.0515804f, 8.798612f, 7.6478276f, 8.798612f, 7.6478276f);
                path.cubicTo(8.798612f, 7.6478276f, 10.273247f, 6.090085f, 10.4478445f, 4.599842f);
                path.cubicTo(10.534765f, 3.8580954f, 10.381331f, 2.9341f, 10.048763f, 2.6003513f);
                path.cubicTo(9.850735f, 2.4001024f, 9.511364f, 2.5171018f, 9.483398f, 2.7961006f);
                path.cubicTo(9.438804f, 3.2535982f, 9.267229f, 3.8798454f, 8.818263f, 4.4738426f);
                path.cubicTo(8.458486f, 4.9500904f, 7.6950917f, 5.499088f, 7.422235f, 5.687337f);
                path.cubicTo(6.764658f, 6.070585f, 6.130512f, 6.5505824f, 5.547763f, 7.12883f);
                path.cubicTo(2.698263f, 9.956316f, 2.1570847f, 14.004797f, 4.3399377f, 16.170786f);
                path.cubicTo(6.5220346f, 18.336027f, 10.602035f, 17.79978f, 13.451535f, 14.971542f);
                path.cubicTo(16.30179f, 12.143306f, 16.842968f, 8.095575f, 14.660116f, 5.9295855f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
