package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_finder_post_lucky_money */
public class icon_finder_post_lucky_money extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 36.1875f);
            Path path = instancePath;
            path.cubicTo(33.410156f, 36.1875f, 31.3125f, 34.089844f, 31.3125f, 31.5f);
            path.cubicTo(31.3125f, 28.910156f, 33.410156f, 26.8125f, 36.0f, 26.8125f);
            path.cubicTo(38.589844f, 26.8125f, 40.6875f, 28.910156f, 40.6875f, 31.5f);
            path.cubicTo(40.6875f, 34.089844f, 38.589844f, 36.1875f, 36.0f, 36.1875f);
            instancePath.moveTo(58.5f, 11.28125f);
            path.cubicTo(58.5f, 10.019531f, 57.476562f, 9.0f, 56.26953f, 9.0f);
            instancePath.lineTo(15.730469f, 9.0f);
            instancePath.cubicTo(14.5f, 9.0f, 13.5f, 10.011719f, 13.5f, 11.28125f);
            instancePath.lineTo(13.5f, 13.355469f);
            Path path2 = instancePath;
            path2.cubicTo(13.5f, 21.285156f, 20.375f, 27.972656f, 29.769531f, 30.0625f);
            path2.cubicTo(29.644531f, 30.5625f, 29.570312f, 31.085938f, 29.570312f, 31.628906f);
            path2.cubicTo(29.570312f, 31.84375f, 29.582031f, 32.054688f, 29.605469f, 32.265625f);
            path2.cubicTo(23.402344f, 31.296875f, 17.847656f, 28.9375f, 13.5f, 25.632812f);
            instancePath.lineTo(13.5f, 63.007812f);
            instancePath.cubicTo(13.5f, 64.24609f, 14.523438f, 65.25f, 15.730469f, 65.25f);
            instancePath.lineTo(56.26953f, 65.25f);
            instancePath.cubicTo(57.5f, 65.25f, 58.5f, 64.26953f, 58.5f, 63.007812f);
            instancePath.lineTo(58.5f, 25.632812f);
            Path path3 = instancePath;
            path3.cubicTo(54.152344f, 28.9375f, 48.597656f, 31.296875f, 42.39453f, 32.265625f);
            path3.cubicTo(42.41797f, 32.054688f, 42.429688f, 31.84375f, 42.429688f, 31.628906f);
            path3.cubicTo(42.429688f, 31.085938f, 42.35547f, 30.5625f, 42.23047f, 30.0625f);
            path3.cubicTo(51.625f, 27.972656f, 58.5f, 21.285156f, 58.5f, 13.355469f);
            instancePath.close();
            instancePath.moveTo(58.5f, 11.28125f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
