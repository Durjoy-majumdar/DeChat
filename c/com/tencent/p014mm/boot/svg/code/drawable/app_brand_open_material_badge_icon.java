package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_open_material_badge_icon */
public class app_brand_open_material_badge_icon extends C24542c {
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
                instancePath.moveTo(61.0f, 21.0f);
                Path path = instancePath;
                path.cubicTo(57.693f, 21.0f, 54.614f, 21.879f, 52.0f, 23.374f);
                path.cubicTo(47.205f, 26.118f, 44.0f, 30.968f, 44.0f, 36.5f);
                instancePath.lineTo(44.0f, 59.5f);
                Path path2 = instancePath;
                path2.cubicTo(44.0f, 63.642f, 39.97f, 67.0f, 35.0f, 67.0f);
                path2.cubicTo(30.029f, 67.0f, 26.0f, 63.642f, 26.0f, 59.5f);
                path2.cubicTo(26.0f, 56.552f, 28.046f, 54.009f, 31.015f, 52.783f);
                path2.cubicTo(31.229f, 52.695f, 31.446f, 52.611f, 31.669f, 52.537f);
                path2.cubicTo(33.538f, 51.787f, 35.141f, 50.379f, 35.736f, 48.744f);
                path2.cubicTo(36.615f, 46.33f, 34.979f, 44.374f, 32.083f, 44.374f);
                path2.cubicTo(31.361f, 44.374f, 30.629f, 44.496f, 29.923f, 44.716f);
                path2.cubicTo(29.92f, 44.717f, 29.917f, 44.718f, 29.913f, 44.719f);
                path2.cubicTo(25.726f, 45.921f, 22.231f, 48.557f, 20.133f, 52.0f);
                path2.cubicTo(18.778f, 54.225f, 18.0f, 56.78f, 18.0f, 59.5f);
                path2.cubicTo(18.0f, 68.047f, 25.626f, 75.0f, 35.0f, 75.0f);
                path2.cubicTo(38.307f, 75.0f, 41.386f, 74.121f, 44.0f, 72.626f);
                path2.cubicTo(48.795f, 69.882f, 52.0f, 65.032f, 52.0f, 59.5f);
                instancePath.lineTo(52.0f, 36.5f);
                Path path3 = instancePath;
                path3.cubicTo(52.0f, 32.358f, 56.029f, 29.0f, 61.0f, 29.0f);
                path3.cubicTo(65.97f, 29.0f, 70.0f, 32.358f, 70.0f, 36.5f);
                path3.cubicTo(70.0f, 39.574f, 67.781f, 42.216f, 64.604f, 43.374f);
                path3.cubicTo(62.555f, 44.061f, 60.876f, 45.544f, 60.236f, 47.301f);
                path3.cubicTo(59.362f, 49.703f, 60.99f, 51.651f, 63.873f, 51.651f);
                path3.cubicTo(64.526f, 51.651f, 65.186f, 51.539f, 65.829f, 51.357f);
                path3.cubicTo(65.934f, 51.328f, 66.038f, 51.296f, 66.142f, 51.265f);
                path3.cubicTo(70.304f, 50.056f, 73.778f, 47.428f, 75.866f, 44.0f);
                path3.cubicTo(77.222f, 41.776f, 78.0f, 39.22f, 78.0f, 36.5f);
                path3.cubicTo(78.0f, 27.953f, 70.374f, 21.0f, 61.0f, 21.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
