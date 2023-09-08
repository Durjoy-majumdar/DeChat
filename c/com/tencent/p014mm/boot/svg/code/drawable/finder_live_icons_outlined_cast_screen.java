package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_icons_outlined_cast_screen */
public class finder_live_icons_outlined_cast_screen extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(6.0f, 36.0f);
        instancePath.lineTo(12.0f, 36.0f);
        instancePath.lineTo(12.0f, 33.0f);
        instancePath.lineTo(7.75f, 33.0f);
        instancePath.cubicTo(7.33579f, 33.0f, 7.0f, 32.6642f, 7.0f, 32.25f);
        instancePath.lineTo(7.0f, 9.75f);
        instancePath.cubicTo(7.0f, 9.33579f, 7.33579f, 9.0f, 7.75f, 9.0f);
        instancePath.lineTo(40.75f, 9.0f);
        instancePath.cubicTo(41.1642f, 9.0f, 41.5f, 9.33579f, 41.5f, 9.75f);
        instancePath.lineTo(41.5f, 32.25f);
        Path path = instancePath;
        path.cubicTo(41.5f, 32.6642f, 41.1642f, 33.0f, 40.75f, 33.0f);
        instancePath.lineTo(36.0f, 33.0f);
        instancePath.lineTo(36.0f, 36.0f);
        instancePath.lineTo(42.0f, 36.0f);
        path.cubicTo(43.1046f, 36.0f, 44.0f, 35.1046f, 44.0f, 34.0f);
        instancePath.lineTo(44.0f, 8.0f);
        Path path2 = instancePath;
        path2.cubicTo(44.0f, 6.89543f, 43.1046f, 6.0f, 42.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        path2.cubicTo(4.89543f, 6.0f, 4.0f, 6.89543f, 4.0f, 8.0f);
        instancePath.lineTo(4.0f, 34.0f);
        path2.cubicTo(4.0f, 35.1046f, 4.89543f, 36.0f, 6.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(25.239f, 28.1488f);
        path2.cubicTo(24.5627f, 27.3034f, 23.4453f, 27.2934f, 22.761f, 28.1488f);
        instancePath.lineTo(13.239f, 40.0512f);
        instancePath.cubicTo(12.5627f, 40.8966f, 12.8976f, 41.6f, 14.0049f, 41.6f);
        instancePath.lineTo(33.9951f, 41.6f);
        instancePath.cubicTo(35.0885f, 41.6f, 35.4453f, 40.9066f, 34.761f, 40.0512f);
        instancePath.lineTo(25.239f, 28.1488f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
