package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_mention_icon_pressed */
public class album_mention_icon_pressed extends C24542c {
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
            instancePath.moveTo(34.464844f, 28.101562f);
            Path path = instancePath;
            path.cubicTo(31.265625f, 28.101562f, 29.332031f, 30.84375f, 29.332031f, 35.414062f);
            path.cubicTo(29.332031f, 39.984375f, 31.230469f, 42.726562f, 34.464844f, 42.726562f);
            path.cubicTo(37.69922f, 42.726562f, 39.632812f, 39.94922f, 39.632812f, 35.414062f);
            path.cubicTo(39.632812f, 30.878906f, 37.664062f, 28.101562f, 34.464844f, 28.101562f);
            instancePath.close();
            instancePath.moveTo(35.554688f, 5.8125f);
            path.cubicTo(52.39453f, 5.8125f, 64.03125f, 16.324219f, 64.03125f, 32.039062f);
            path.cubicTo(64.03125f, 43.04297f, 58.652344f, 49.96875f, 49.898438f, 49.96875f);
            path.cubicTo(45.36328f, 49.96875f, 42.09375f, 48.035156f, 41.14453f, 44.660156f);
            instancePath.lineTo(40.546875f, 44.660156f);
            Path path2 = instancePath;
            path2.cubicTo(39.10547f, 48.17578f, 36.328125f, 50.003906f, 32.285156f, 50.003906f);
            path2.cubicTo(24.972656f, 50.003906f, 20.121094f, 44.097656f, 20.121094f, 35.16797f);
            path2.cubicTo(20.121094f, 26.625f, 24.796875f, 20.859375f, 31.722656f, 20.859375f);
            path2.cubicTo(35.554688f, 20.859375f, 38.61328f, 22.722656f, 40.01953f, 25.851562f);
            instancePath.lineTo(40.617188f, 25.851562f);
            instancePath.lineTo(40.617188f, 21.703125f);
            instancePath.lineTo(48.66797f, 21.703125f);
            instancePath.lineTo(48.66797f, 39.5625f);
            Path path3 = instancePath;
            path3.cubicTo(48.66797f, 42.023438f, 49.757812f, 43.535156f, 51.726562f, 43.535156f);
            path3.cubicTo(54.785156f, 43.535156f, 56.789062f, 39.527344f, 56.789062f, 32.882812f);
            path3.cubicTo(56.789062f, 20.121094f, 48.38672f, 12.0f, 35.44922f, 12.0f);
            path3.cubicTo(21.984375f, 12.0f, 12.703125f, 21.457031f, 12.703125f, 35.308594f);
            path3.cubicTo(12.703125f, 49.51172f, 22.230469f, 58.054688f, 36.890625f, 58.054688f);
            path3.cubicTo(40.160156f, 58.054688f, 43.5f, 57.632812f, 45.328125f, 57.070312f);
            instancePath.lineTo(45.328125f, 63.328125f);
            Path path4 = instancePath;
            path4.cubicTo(42.796875f, 63.996094f, 39.527344f, 64.38281f, 36.152344f, 64.38281f);
            path4.cubicTo(17.976562f, 64.38281f, 5.460938f, 52.921875f, 5.460938f, 35.132812f);
            path4.cubicTo(5.460938f, 17.765625f, 17.800781f, 5.8125f, 35.554688f, 5.8125f);
            instancePath.close();
            instancePath.moveTo(35.554688f, 5.8125f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
