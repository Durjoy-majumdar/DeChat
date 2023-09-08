package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_crop */
public class icons_filled_crop extends C24542c {
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
                instancePath.moveTo(18.0f, 60.0f);
                instancePath.lineTo(8.997152f, 60.0f);
                instancePath.cubicTo(7.341871f, 60.0f, 6.0f, 58.666107f, 6.0f, 56.997383f);
                instancePath.lineTo(6.0f, 15.002615f);
                instancePath.cubicTo(6.0f, 13.3443165f, 7.341623f, 12.0f, 8.997152f, 12.0f);
                instancePath.lineTo(12.0f, 12.0f);
                instancePath.lineTo(60.0f, 12.0f);
                instancePath.lineTo(63.00285f, 12.0f);
                instancePath.cubicTo(64.65813f, 12.0f, 66.0f, 13.333893f, 66.0f, 15.002615f);
                instancePath.lineTo(66.0f, 56.997383f);
                instancePath.cubicTo(66.0f, 58.65568f, 64.65838f, 60.0f, 63.00285f, 60.0f);
                instancePath.lineTo(54.0f, 60.0f);
                instancePath.lineTo(18.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(18.0f, 57.0f);
                instancePath.lineTo(54.0f, 57.0f);
                instancePath.lineTo(54.0f, 15.0f);
                instancePath.lineTo(18.0f, 15.0f);
                instancePath.lineTo(18.0f, 57.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 33.333332f);
                instancePath.lineTo(10.0f, 40.444443f);
                instancePath.lineTo(14.0f, 40.444443f);
                instancePath.lineTo(14.0f, 33.333332f);
                instancePath.lineTo(10.0f, 33.333332f);
                instancePath.close();
                instancePath.moveTo(58.0f, 33.333332f);
                instancePath.lineTo(58.0f, 40.444443f);
                instancePath.lineTo(62.0f, 40.444443f);
                instancePath.lineTo(62.0f, 33.333332f);
                instancePath.lineTo(58.0f, 33.333332f);
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
