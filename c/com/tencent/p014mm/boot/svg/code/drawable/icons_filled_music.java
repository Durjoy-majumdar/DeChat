package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_music */
public class icons_filled_music extends C24542c {
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
                instancePath.moveTo(54.0f, 12.926538f);
                instancePath.lineTo(24.0f, 19.503462f);
                instancePath.lineTo(24.0f, 54.587288f);
                instancePath.lineTo(24.0f, 57.603806f);
                Path path = instancePath;
                path.cubicTo(24.0f, 60.412968f, 22.11874f, 63.15209f, 19.588413f, 64.3322f);
                path.cubicTo(19.118036f, 64.551575f, 16.14658f, 65.21572f, 15.758582f, 65.29378f);
                path.cubicTo(12.030496f, 66.043785f, 9.166035f, 62.850475f, 9.008285f, 59.62134f);
                path.cubicTo(8.850535f, 56.39221f, 10.96819f, 53.699585f, 13.425209f, 53.205288f);
                instancePath.lineTo(17.218742f, 52.253464f);
                instancePath.cubicTo(18.559702f, 51.917004f, 19.5f, 50.711636f, 19.5f, 49.32911f);
                instancePath.lineTo(19.5f, 18.935236f);
                instancePath.lineTo(19.5f, 17.881247f);
                instancePath.cubicTo(19.5f, 16.471695f, 20.481295f, 15.252241f, 21.858213f, 14.950698f);
                instancePath.lineTo(56.679108f, 7.3249645f);
                Path path2 = instancePath;
                path2.cubicTo(57.488354f, 7.1477404f, 58.288048f, 7.660097f, 58.465275f, 8.469345f);
                path2.cubicTo(58.488358f, 8.574749f, 58.5f, 8.682337f, 58.5f, 8.790238f);
                instancePath.lineTo(58.5f, 10.462189f);
                instancePath.lineTo(58.5f, 46.601345f);
                instancePath.lineTo(58.5f, 49.617863f);
                Path path3 = instancePath;
                path3.cubicTo(58.5f, 52.427025f, 56.602406f, 55.166145f, 54.050106f, 56.346252f);
                path3.cubicTo(53.575645f, 56.56563f, 50.57839f, 57.229782f, 50.187023f, 57.30784f);
                path3.cubicTo(46.426563f, 58.057846f, 43.53723f, 54.864536f, 43.37811f, 51.635403f);
                path3.cubicTo(43.21899f, 48.40627f, 45.355034f, 45.713642f, 47.833385f, 45.219345f);
                instancePath.lineTo(51.70845f, 44.261543f);
                instancePath.cubicTo(53.054424f, 43.928856f, 54.0f, 42.721104f, 54.0f, 41.334625f);
                instancePath.lineTo(54.0f, 12.926538f);
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
