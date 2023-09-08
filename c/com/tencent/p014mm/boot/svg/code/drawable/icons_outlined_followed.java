package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_followed */
public class icons_outlined_followed extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(50.10547f, 57.617188f);
        instancePath.lineTo(65.19531f, 42.523438f);
        instancePath.lineTo(68.32422f, 45.652344f);
        instancePath.lineTo(51.414062f, 62.558594f);
        Path path = instancePath;
        path.cubicTo(50.710938f, 63.26172f, 49.570312f, 63.26172f, 48.871094f, 62.558594f);
        path.cubicTo(48.867188f, 62.558594f, 48.867188f, 62.558594f, 48.871094f, 62.558594f);
        instancePath.lineTo(40.421875f, 54.10547f);
        instancePath.lineTo(43.503906f, 51.01953f);
        instancePath.close();
        instancePath.moveTo(35.69922f, 9.0f);
        instancePath.cubicTo(42.328125f, 9.0f, 47.69922f, 14.378906f, 47.69922f, 21.0f);
        instancePath.lineTo(47.69922f, 26.128906f);
        instancePath.cubicTo(47.69922f, 29.546875f, 45.902344f, 34.44922f, 43.703125f, 37.054688f);
        instancePath.lineTo(42.621094f, 38.339844f);
        instancePath.cubicTo(41.851562f, 39.25f, 41.51953f, 40.26953f, 41.597656f, 41.226562f);
        instancePath.lineTo(36.910156f, 41.226562f);
        instancePath.cubicTo(36.847656f, 39.382812f, 37.414062f, 37.484375f, 38.660156f, 35.804688f);
        instancePath.lineTo(39.04297f, 35.32422f);
        instancePath.lineTo(40.128906f, 34.035156f);
        instancePath.cubicTo(41.492188f, 32.41797f, 42.785156f, 29.0625f, 42.992188f, 26.738281f);
        instancePath.lineTo(43.01953f, 26.128906f);
        instancePath.lineTo(43.01953f, 21.0f);
        Path path2 = instancePath;
        path2.cubicTo(43.01953f, 16.960938f, 39.73828f, 13.679688f, 35.69922f, 13.679688f);
        path2.cubicTo(31.847656f, 13.679688f, 28.679688f, 16.671875f, 28.398438f, 20.453125f);
        instancePath.lineTo(28.378906f, 21.0f);
        instancePath.lineTo(28.378906f, 26.128906f);
        instancePath.cubicTo(28.378906f, 28.25f, 29.554688f, 31.632812f, 30.902344f, 33.546875f);
        instancePath.lineTo(31.273438f, 34.03125f);
        instancePath.lineTo(32.35547f, 35.316406f);
        instancePath.cubicTo(35.964844f, 39.59375f, 34.867188f, 45.53125f, 30.117188f, 48.226562f);
        instancePath.lineTo(29.574219f, 48.51172f);
        instancePath.lineTo(12.59375f, 56.80078f);
        instancePath.cubicTo(12.394531f, 56.898438f, 12.03125f, 57.441406f, 11.917969f, 57.777344f);
        instancePath.lineTo(11.878906f, 57.945312f);
        instancePath.lineTo(11.878906f, 58.320312f);
        instancePath.lineTo(35.695312f, 58.316406f);
        instancePath.lineTo(35.695312f, 63.0f);
        instancePath.lineTo(10.203125f, 63.0f);
        instancePath.cubicTo(8.546875f, 63.0f, 7.199219f, 61.66797f, 7.199219f, 60.003906f);
        instancePath.lineTo(7.199219f, 57.945312f);
        instancePath.cubicTo(7.199219f, 55.890625f, 8.695312f, 53.496094f, 10.542969f, 52.59375f);
        instancePath.lineTo(27.523438f, 44.308594f);
        instancePath.cubicTo(29.984375f, 43.10547f, 30.558594f, 40.445312f, 28.78125f, 38.335938f);
        instancePath.lineTo(27.695312f, 37.05078f);
        instancePath.cubicTo(25.488281f, 34.433594f, 23.699219f, 29.546875f, 23.699219f, 26.128906f);
        instancePath.lineTo(23.699219f, 21.0f);
        instancePath.cubicTo(23.699219f, 14.371094f, 29.085938f, 9.0f, 35.69922f, 9.0f);
        instancePath.close();
        instancePath.moveTo(35.69922f, 9.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
