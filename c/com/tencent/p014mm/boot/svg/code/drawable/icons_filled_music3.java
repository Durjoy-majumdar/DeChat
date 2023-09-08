package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_music3 */
public class icons_filled_music3 extends C24542c {
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
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(38.4457f, 7.6582f);
            instancePath.cubicTo(36.7889f, 7.6582f, 35.4457f, 9.00135f, 35.4457f, 10.6582f);
            instancePath.lineTo(35.4457f, 41.64f);
            instancePath.lineTo(35.4369f, 42.9763f);
            Path path = instancePath;
            path.cubicTo(35.4369f, 46.437f, 34.4217f, 47.0366f, 30.5f, 47.3507f);
            path.cubicTo(29.1323f, 47.4602f, 27.697f, 47.5151f, 26.2632f, 47.8993f);
            path.cubicTo(19.4616f, 49.7218f, 15.1105f, 55.5389f, 16.5449f, 60.8923f);
            path.cubicTo(17.9794f, 66.2456f, 24.656f, 69.1079f, 31.4577f, 67.2854f);
            path.cubicTo(37.4877f, 65.6697f, 41.5916f, 60.9144f, 41.4457f, 56.126f);
            instancePath.lineTo(41.4457f, 23.5568f);
            Path path2 = instancePath;
            path2.cubicTo(41.4457f, 23.4439f, 41.5388f, 23.3532f, 41.6517f, 23.3583f);
            path2.cubicTo(43.5309f, 23.4445f, 46.3136f, 23.9479f, 48.2955f, 26.5375f);
            path2.cubicTo(50.1226f, 28.9249f, 50.0014f, 31.2496f, 49.8845f, 33.4938f);
            path2.cubicTo(49.8651f, 33.8656f, 49.8458f, 34.2352f, 49.8356f, 34.6024f);
            path2.cubicTo(49.8292f, 34.8312f, 50.0696f, 34.9703f, 50.2484f, 34.8274f);
            path2.cubicTo(52.6917f, 32.8753f, 55.0558f, 25.9132f, 52.4038f, 20.1467f);
            path2.cubicTo(50.0015f, 14.9231f, 45.1264f, 12.7697f, 42.1859f, 11.8837f);
            path2.cubicTo(41.7509f, 11.7527f, 41.4457f, 11.3583f, 41.4457f, 10.9041f);
            instancePath.lineTo(41.4457f, 10.6582f);
            instancePath.cubicTo(41.4457f, 9.00135f, 40.1026f, 7.6582f, 38.4457f, 7.6582f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
