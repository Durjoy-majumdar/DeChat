package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_live */
public class icons_outlined_live extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(5.4f);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(36.0f, 8.700001f);
            Path path = instancePath2;
            path.cubicTo(51.077374f, 8.700001f, 63.3f, 20.922626f, 63.3f, 36.0f);
            path.cubicTo(63.3f, 51.077374f, 51.077374f, 63.3f, 36.0f, 63.3f);
            path.cubicTo(20.922626f, 63.3f, 8.700001f, 51.077374f, 8.700001f, 36.0f);
            path.cubicTo(8.700001f, 20.922626f, 20.922626f, 8.700001f, 36.0f, 8.700001f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(36.0f, 19.5f);
            Path path2 = instancePath3;
            path2.cubicTo(45.112698f, 19.5f, 52.5f, 26.887302f, 52.5f, 36.0f);
            path2.cubicTo(52.5f, 45.112698f, 45.112698f, 52.5f, 36.0f, 52.5f);
            path2.cubicTo(26.887302f, 52.5f, 19.5f, 45.112698f, 19.5f, 36.0f);
            path2.cubicTo(19.5f, 26.887302f, 26.887302f, 19.5f, 36.0f, 19.5f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
