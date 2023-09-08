package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_follow */
public class icons_filled_follow extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            instancePath.moveTo(50.244003f, 56.653404f);
            instancePath.lineTo(64.84218f, 42.055225f);
            instancePath.lineTo(68.51913f, 45.732174f);
            instancePath.lineTo(51.608696f, 62.637745f);
            instancePath.cubicTo(50.98391f, 63.262634f, 50.01399f, 63.331936f, 49.312534f, 62.84585f);
            instancePath.lineTo(49.06327f, 62.63722f);
            instancePath.lineTo(49.06327f, 62.63722f);
            instancePath.lineTo(40.614532f, 54.18394f);
            instancePath.lineTo(44.194534f, 50.60394f);
            instancePath.lineTo(50.244003f, 56.653404f);
            instancePath.close();
            instancePath.moveTo(35.7f, 9.0f);
            instancePath.cubicTo(42.327415f, 9.0f, 47.7f, 14.378941f, 47.7f, 21.000622f);
            instancePath.lineTo(47.7f, 26.130558f);
            instancePath.cubicTo(47.7f, 29.547888f, 45.902798f, 34.44858f, 43.70426f, 37.054718f);
            instancePath.lineTo(42.619663f, 38.340397f);
            instancePath.cubicTo(41.160698f, 40.06985f, 41.281265f, 42.18849f, 42.756573f, 43.554497f);
            instancePath.lineTo(36.37303f, 49.94016f);
            instancePath.cubicTo(34.03147f, 52.284f, 34.030964f, 56.08211f, 36.37189f, 58.42658f);
            instancePath.lineTo(40.941f, 63.0f);
            instancePath.lineTo(10.2042885f, 63.0f);
            instancePath.cubicTo(8.545066f, 63.0f, 7.2f, 61.667267f, 7.2f, 60.004684f);
            instancePath.lineTo(7.2f, 57.94639f);
            instancePath.cubicTo(7.2f, 55.891125f, 8.694452f, 53.495724f, 10.542293f, 52.593998f);
            instancePath.lineTo(27.523352f, 44.30743f);
            instancePath.cubicTo(29.986132f, 43.10562f, 30.558777f, 40.443787f, 28.780336f, 38.33592f);
            instancePath.lineTo(27.695738f, 37.050415f);
            instancePath.cubicTo(25.488953f, 34.434856f, 23.7f, 29.548489f, 23.7f, 26.127872f);
            instancePath.lineTo(23.7f, 20.998741f);
            instancePath.cubicTo(23.7f, 14.37202f, 29.08607f, 9.0f, 35.7f, 9.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
