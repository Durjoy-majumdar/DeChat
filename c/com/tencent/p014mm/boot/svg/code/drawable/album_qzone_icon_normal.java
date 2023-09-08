package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_qzone_icon_normal */
public class album_qzone_icon_normal extends C24542c {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(65.16406f, 28.359375f);
            instancePath.lineTo(46.625f, 24.953125f);
            instancePath.cubicTo(46.304688f, 24.890625f, 46.01953f, 24.695312f, 45.867188f, 24.398438f);
            instancePath.lineTo(36.92578f, 8.015625f);
            Path path = instancePath;
            path.cubicTo(36.73828f, 7.667969f, 36.36328f, 7.5f, 35.996094f, 7.5f);
            path.cubicTo(35.625f, 7.5f, 35.257812f, 7.679688f, 35.070312f, 8.015625f);
            instancePath.lineTo(26.128906f, 24.398438f);
            instancePath.cubicTo(25.96875f, 24.683594f, 25.691406f, 24.890625f, 25.371094f, 24.953125f);
            instancePath.lineTo(6.828125f, 28.359375f);
            instancePath.cubicTo(6.035156f, 28.503906f, 5.722656f, 29.476562f, 6.285156f, 30.054688f);
            instancePath.lineTo(19.769531f, 43.929688f);
            instancePath.cubicTo(20.007812f, 44.179688f, 20.117188f, 44.51953f, 20.0625f, 44.859375f);
            instancePath.lineTo(16.984375f, 63.410156f);
            instancePath.cubicTo(16.859375f, 64.203125f, 17.679688f, 64.82031f, 18.410156f, 64.47266f);
            instancePath.lineTo(35.535156f, 56.34375f);
            Path path2 = instancePath;
            path2.cubicTo(35.6875f, 56.26953f, 35.847656f, 56.234375f, 36.007812f, 56.234375f);
            path2.cubicTo(36.16797f, 56.234375f, 36.328125f, 56.26953f, 36.48047f, 56.34375f);
            instancePath.lineTo(53.601562f, 64.47266f);
            instancePath.cubicTo(54.33203f, 64.82031f, 55.14453f, 64.203125f, 55.03125f, 63.410156f);
            instancePath.lineTo(52.710938f, 49.4375f);
            Path path3 = instancePath;
            path3.cubicTo(55.628906f, 47.367188f, 57.046875f, 45.589844f, 57.214844f, 45.32422f);
            path3.cubicTo(57.414062f, 45.01953f, 57.289062f, 44.76172f, 57.289062f, 44.76172f);
            path3.cubicTo(52.585938f, 46.714844f, 41.164062f, 50.0f, 27.128906f, 49.515625f);
            path3.cubicTo(25.433594f, 49.464844f, 23.746094f, 49.265625f, 22.800781f, 49.097656f);
            path3.cubicTo(21.785156f, 48.910156f, 21.625f, 47.820312f, 22.25f, 47.304688f);
            path3.cubicTo(26.183594f, 44.003906f, 39.28125f, 34.632812f, 39.48828f, 34.472656f);
            path3.cubicTo(39.726562f, 34.285156f, 39.73828f, 34.007812f, 39.523438f, 33.83203f);
            path3.cubicTo(39.21875f, 33.570312f, 32.054688f, 31.046875f, 21.097656f, 32.722656f);
            path3.cubicTo(20.347656f, 32.839844f, 19.910156f, 31.8125f, 20.640625f, 31.429688f);
            path3.cubicTo(23.730469f, 29.796875f, 30.769531f, 27.78125f, 37.941406f, 27.835938f);
            path3.cubicTo(42.94922f, 27.878906f, 47.277344f, 29.378906f, 48.507812f, 30.28125f);
            path3.cubicTo(49.148438f, 30.753906f, 49.007812f, 31.332031f, 48.48047f, 31.777344f);
            path3.cubicTo(45.785156f, 34.0625f, 38.128906f, 39.36328f, 35.460938f, 41.414062f);
            path3.cubicTo(35.148438f, 41.65625f, 35.265625f, 42.03125f, 35.60547f, 42.15625f);
            path3.cubicTo(40.191406f, 43.914062f, 47.0625f, 44.45703f, 51.90625f, 44.503906f);
            instancePath.lineTo(65.74609f, 30.046875f);
            instancePath.cubicTo(66.26172f, 29.476562f, 65.94922f, 28.503906f, 65.16406f, 28.359375f);
            instancePath.close();
            instancePath.moveTo(65.16406f, 28.359375f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
