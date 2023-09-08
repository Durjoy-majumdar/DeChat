package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.error_image_sub */
public class error_image_sub extends C24542c {
    private final int height = 27;
    private final int width = 27;

    public int doCommand(int i, Object... objArr) {
        int i2 = 27;
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
                instancePaint3.setColor(-772816);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(27.0f, 13.666667f);
                Path path = instancePath;
                path.cubicTo(27.0f, 6.044f, 20.956f, 0.0f, 13.333333f, 0.0f);
                path.cubicTo(6.044f, 0.0f, 0.0f, 6.044f, 0.0f, 13.666667f);
                path.cubicTo(0.0f, 20.956f, 6.044f, 27.0f, 13.333333f, 27.0f);
                path.cubicTo(20.956f, 27.0f, 27.0f, 20.956f, 27.0f, 13.666667f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(13.5f, 6.0f);
                instancePath2.cubicTo(14.334203f, 6.0f, 14.962531f, 6.674437f, 14.916311f, 7.5063977f);
                instancePath2.lineTo(14.5f, 15.0f);
                instancePath2.lineTo(12.5f, 15.0f);
                instancePath2.lineTo(12.083689f, 7.5063977f);
                instancePath2.cubicTo(12.037581f, 6.6764627f, 12.671573f, 6.0f, 13.5f, 6.0f);
                instancePath2.close();
                instancePath2.moveTo(13.5f, 20.0f);
                Path path2 = instancePath2;
                path2.cubicTo(12.671573f, 20.0f, 12.0f, 19.328426f, 12.0f, 18.5f);
                path2.cubicTo(12.0f, 17.671574f, 12.671573f, 17.0f, 13.5f, 17.0f);
                path2.cubicTo(14.328427f, 17.0f, 15.0f, 17.671574f, 15.0f, 18.5f);
                path2.cubicTo(15.0f, 19.328426f, 14.328427f, 20.0f, 13.5f, 20.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
