package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_me */
public class icons_outlined_me extends C24542c {
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.9f, 59.4f);
            instancePath.lineTo(60.9f, 57.94639f);
            instancePath.cubicTo(60.9f, 57.25818f, 60.19404f, 56.13006f, 59.57943f, 55.83026f);
            instancePath.lineTo(42.59837f, 47.54712f);
            instancePath.cubicTo(38.018623f, 45.31318f, 36.88672f, 39.90874f, 40.16801f, 36.019104f);
            instancePath.lineTo(41.25261f, 34.733425f);
            instancePath.cubicTo(42.906586f, 32.772804f, 44.4f, 28.693172f, 44.4f, 26.130558f);
            instancePath.lineTo(44.4f, 21.000622f);
            Path path = instancePath;
            path.cubicTo(44.4f, 16.364742f, 40.63677f, 12.6f, 36.0f, 12.6f);
            path.cubicTo(31.368927f, 12.6f, 27.6f, 16.365608f, 27.6f, 20.998741f);
            instancePath.lineTo(27.6f, 26.127872f);
            instancePath.cubicTo(27.6f, 28.696991f, 29.08724f, 32.76145f, 30.747236f, 34.728935f);
            instancePath.lineTo(31.831833f, 36.01444f);
            instancePath.cubicTo(35.119907f, 39.91158f, 33.975643f, 45.31095f, 29.402159f, 47.54276f);
            instancePath.lineTo(12.421099f, 55.82933f);
            instancePath.cubicTo(11.811051f, 56.127026f, 11.1f, 57.26603f, 11.1f, 57.94639f);
            instancePath.lineTo(11.1f, 59.4f);
            instancePath.lineTo(60.9f, 59.4f);
            instancePath.close();
            instancePath.moveTo(7.5f, 60.0f);
            instancePath.lineTo(7.5f, 57.94639f);
            instancePath.cubicTo(7.5f, 55.891125f, 8.994452f, 53.495724f, 10.842293f, 52.593998f);
            instancePath.lineTo(27.823353f, 44.30743f);
            instancePath.cubicTo(30.28613f, 43.10562f, 30.858778f, 40.443787f, 29.080336f, 38.33592f);
            instancePath.lineTo(27.995739f, 37.050415f);
            instancePath.cubicTo(25.788954f, 34.434856f, 24.0f, 29.548489f, 24.0f, 26.127872f);
            instancePath.lineTo(24.0f, 20.998741f);
            Path path2 = instancePath;
            path2.cubicTo(24.0f, 14.37202f, 29.386068f, 9.0f, 36.0f, 9.0f);
            path2.cubicTo(42.62742f, 9.0f, 48.0f, 14.378941f, 48.0f, 21.000622f);
            instancePath.lineTo(48.0f, 26.130558f);
            instancePath.cubicTo(48.0f, 29.547888f, 46.202797f, 34.44858f, 44.00426f, 37.054718f);
            instancePath.lineTo(42.919662f, 38.340397f);
            instancePath.cubicTo(41.151096f, 40.43685f, 41.703564f, 43.105194f, 44.176647f, 44.31153f);
            instancePath.lineTo(61.157707f, 52.594673f);
            instancePath.cubicTo(63.003605f, 53.49508f, 64.5f, 55.87551f, 64.5f, 57.94639f);
            instancePath.lineTo(64.5f, 60.0f);
            instancePath.cubicTo(64.5f, 61.656853f, 63.156853f, 63.0f, 61.5f, 63.0f);
            instancePath.lineTo(10.5f, 63.0f);
            instancePath.cubicTo(8.843145f, 63.0f, 7.5f, 61.656853f, 7.5f, 60.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
