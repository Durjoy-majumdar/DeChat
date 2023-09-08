package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_indicator_icon */
public class float_indicator_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(24.0f, 41.6f);
            Path path = instancePath;
            path.cubicTo(33.72021f, 41.6f, 41.6f, 33.72021f, 41.6f, 24.0f);
            path.cubicTo(41.6f, 14.279788f, 33.72021f, 6.4f, 24.0f, 6.4f);
            path.cubicTo(14.279788f, 6.4f, 6.4f, 14.279788f, 6.4f, 24.0f);
            path.cubicTo(6.4f, 33.72021f, 14.279788f, 41.6f, 24.0f, 41.6f);
            instancePath.close();
            instancePath.moveTo(24.0f, 44.0f);
            Path path2 = instancePath;
            path2.cubicTo(12.954305f, 44.0f, 4.0f, 35.045696f, 4.0f, 24.0f);
            path2.cubicTo(4.0f, 12.954305f, 12.954305f, 4.0f, 24.0f, 4.0f);
            path2.cubicTo(35.045696f, 4.0f, 44.0f, 12.954305f, 44.0f, 24.0f);
            path2.cubicTo(44.0f, 35.045696f, 35.045696f, 44.0f, 24.0f, 44.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(24.0f, 35.6f);
            Path path3 = instancePath2;
            path3.cubicTo(30.406504f, 35.6f, 35.6f, 30.406504f, 35.6f, 24.0f);
            path3.cubicTo(35.6f, 17.593496f, 30.406504f, 12.4f, 24.0f, 12.4f);
            path3.cubicTo(17.593496f, 12.4f, 12.4f, 17.593496f, 12.4f, 24.0f);
            path3.cubicTo(12.4f, 30.406504f, 17.593496f, 35.6f, 24.0f, 35.6f);
            instancePath2.close();
            instancePath2.moveTo(24.0f, 38.0f);
            path3.cubicTo(16.268013f, 38.0f, 10.0f, 31.731987f, 10.0f, 24.0f);
            path3.cubicTo(10.0f, 16.268013f, 16.268013f, 10.0f, 24.0f, 10.0f);
            path3.cubicTo(31.731987f, 10.0f, 38.0f, 16.268013f, 38.0f, 24.0f);
            path3.cubicTo(38.0f, 31.731987f, 31.731987f, 38.0f, 24.0f, 38.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
