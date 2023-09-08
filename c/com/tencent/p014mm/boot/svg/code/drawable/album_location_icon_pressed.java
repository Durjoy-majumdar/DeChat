package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_location_icon_pressed */
public class album_location_icon_pressed extends C24542c {
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
            instancePath.moveTo(33.785156f, 66.40234f);
            Path path = instancePath;
            path.cubicTo(33.785156f, 66.40234f, 12.0f, 48.054688f, 12.0f, 30.0f);
            path.cubicTo(12.0f, 16.746094f, 22.746094f, 6.0f, 36.0f, 6.0f);
            path.cubicTo(49.253906f, 6.0f, 60.0f, 16.746094f, 60.0f, 30.0f);
            path.cubicTo(60.0f, 48.054688f, 38.214844f, 66.40234f, 38.214844f, 66.40234f);
            path.cubicTo(37.0f, 67.51953f, 35.007812f, 67.50781f, 33.785156f, 66.40234f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.601562f);
            path.cubicTo(41.30078f, 39.601562f, 45.601562f, 35.30078f, 45.601562f, 30.0f);
            path.cubicTo(45.601562f, 24.699219f, 41.30078f, 20.398438f, 36.0f, 20.398438f);
            path.cubicTo(30.699219f, 20.398438f, 26.398438f, 24.699219f, 26.398438f, 30.0f);
            path.cubicTo(26.398438f, 35.30078f, 30.699219f, 39.601562f, 36.0f, 39.601562f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.601562f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
