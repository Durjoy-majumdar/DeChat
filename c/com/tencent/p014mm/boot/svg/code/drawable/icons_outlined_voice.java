package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_voice */
public class icons_outlined_voice extends C24542c {
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
            instancePath.moveTo(36.0f, 66.0f);
            Path path = instancePath;
            path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 62.4f);
            Path path2 = instancePath;
            path2.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
            path2.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
            path2.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
            path2.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
            instancePath.close();
            instancePath.moveTo(36.92498f, 50.42498f);
            path2.cubicTo(40.728367f, 46.62159f, 42.9f, 41.48727f, 42.9f, 36.0f);
            path2.cubicTo(42.9f, 30.51273f, 40.728367f, 25.378408f, 36.92498f, 21.575022f);
            instancePath.lineTo(39.470562f, 19.029438f);
            Path path3 = instancePath;
            path3.cubicTo(43.81371f, 23.372583f, 46.5f, 29.372583f, 46.5f, 36.0f);
            path3.cubicTo(46.5f, 42.62742f, 43.81371f, 48.62742f, 39.470562f, 52.970562f);
            instancePath.lineTo(36.92498f, 50.42498f);
            instancePath.close();
            instancePath.moveTo(30.985281f, 44.485283f);
            path3.cubicTo(33.22353f, 42.247032f, 34.5f, 39.22912f, 34.5f, 36.0f);
            path3.cubicTo(34.5f, 32.77088f, 33.22353f, 29.752968f, 30.985281f, 27.514719f);
            instancePath.lineTo(33.530865f, 24.969133f);
            Path path4 = instancePath;
            path4.cubicTo(36.353912f, 27.79218f, 38.1f, 31.692179f, 38.1f, 36.0f);
            path4.cubicTo(38.1f, 40.30782f, 36.353912f, 44.20782f, 33.530865f, 47.030865f);
            instancePath.lineTo(30.985281f, 44.485283f);
            instancePath.close();
            instancePath.moveTo(27.59117f, 41.091167f);
            instancePath.lineTo(22.5f, 36.0f);
            instancePath.lineTo(27.59117f, 30.90883f);
            Path path5 = instancePath;
            path5.cubicTo(28.894112f, 32.211777f, 29.7f, 34.011776f, 29.7f, 36.0f);
            path5.cubicTo(29.7f, 37.988224f, 28.894112f, 39.788223f, 27.59117f, 41.091167f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
