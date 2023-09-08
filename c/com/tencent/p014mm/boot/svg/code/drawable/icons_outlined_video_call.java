package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_video_call */
public class icons_outlined_video_call extends C24542c {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(9.6f, 20.1f);
            instancePath.lineTo(9.6f, 51.9f);
            instancePath.lineTo(47.4f, 51.9f);
            instancePath.lineTo(47.4f, 20.1f);
            instancePath.lineTo(9.6f, 20.1f);
            instancePath.close();
            instancePath.moveTo(9.0f, 16.5f);
            instancePath.lineTo(48.0f, 16.5f);
            instancePath.cubicTo(49.656853f, 16.5f, 51.0f, 17.843145f, 51.0f, 19.5f);
            instancePath.lineTo(51.0f, 52.5f);
            instancePath.cubicTo(51.0f, 54.156853f, 49.656853f, 55.5f, 48.0f, 55.5f);
            instancePath.lineTo(9.0f, 55.5f);
            instancePath.cubicTo(7.343146f, 55.5f, 6.0f, 54.156853f, 6.0f, 52.5f);
            instancePath.lineTo(6.0f, 19.5f);
            instancePath.cubicTo(6.0f, 17.843145f, 7.343146f, 16.5f, 9.0f, 16.5f);
            instancePath.close();
            instancePath.moveTo(57.6f, 40.26975f);
            instancePath.lineTo(65.4f, 46.50975f);
            instancePath.lineTo(65.4f, 25.49025f);
            instancePath.lineTo(57.6f, 31.73025f);
            instancePath.lineTo(57.6f, 40.26975f);
            instancePath.close();
            instancePath.moveTo(54.0f, 30.0f);
            instancePath.lineTo(64.125916f, 21.899267f);
            Path path = instancePath;
            path.cubicTo(65.4197f, 20.864239f, 67.30758f, 21.074003f, 68.342606f, 22.36779f);
            path.cubicTo(68.76816f, 22.899729f, 69.0f, 23.56066f, 69.0f, 24.241875f);
            instancePath.lineTo(69.0f, 47.758125f);
            Path path2 = instancePath;
            path2.cubicTo(69.0f, 49.414978f, 67.65685f, 50.758125f, 66.0f, 50.758125f);
            path2.cubicTo(65.31879f, 50.758125f, 64.65785f, 50.526283f, 64.125916f, 50.10073f);
            instancePath.lineTo(54.0f, 42.0f);
            instancePath.lineTo(54.0f, 30.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
