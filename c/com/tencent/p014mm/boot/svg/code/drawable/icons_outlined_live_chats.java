package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_live_chats */
public class icons_outlined_live_chats extends C24542c {
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
        instancePath.moveTo(61.5f, 12.0f);
        instancePath.cubicTo(63.984375f, 12.0f, 66.0f, 14.015625f, 66.0f, 16.5f);
        instancePath.lineTo(66.0f, 52.5f);
        instancePath.cubicTo(66.0f, 54.984375f, 63.984375f, 57.0f, 61.5f, 57.0f);
        instancePath.lineTo(33.0f, 57.0f);
        instancePath.lineTo(26.121094f, 63.878906f);
        Path path = instancePath;
        path.cubicTo(24.949219f, 65.05078f, 23.050781f, 65.05078f, 21.878906f, 63.878906f);
        path.cubicTo(21.316406f, 63.316406f, 21.0f, 62.554688f, 21.0f, 61.757812f);
        instancePath.lineTo(21.0f, 57.0f);
        instancePath.lineTo(10.5f, 57.0f);
        instancePath.cubicTo(8.015625f, 57.0f, 6.0f, 54.984375f, 6.0f, 52.5f);
        instancePath.lineTo(6.0f, 16.5f);
        Path path2 = instancePath;
        path2.cubicTo(6.0f, 14.015625f, 8.015625f, 12.0f, 10.5f, 12.0f);
        instancePath.close();
        instancePath.moveTo(61.5f, 15.601562f);
        instancePath.lineTo(10.5f, 15.601562f);
        path2.cubicTo(10.003906f, 15.601562f, 9.601562f, 16.003906f, 9.601562f, 16.5f);
        instancePath.lineTo(9.601562f, 52.5f);
        path2.cubicTo(9.601562f, 52.996094f, 10.003906f, 53.398438f, 10.5f, 53.398438f);
        instancePath.lineTo(24.601562f, 53.398438f);
        instancePath.lineTo(24.601562f, 60.308594f);
        instancePath.lineTo(31.507812f, 53.398438f);
        instancePath.lineTo(61.5f, 53.398438f);
        Path path3 = instancePath;
        path3.cubicTo(61.996094f, 53.398438f, 62.398438f, 52.996094f, 62.398438f, 52.5f);
        instancePath.lineTo(62.398438f, 16.5f);
        path3.cubicTo(62.398438f, 16.003906f, 61.996094f, 15.601562f, 61.5f, 15.601562f);
        instancePath.close();
        instancePath.moveTo(61.5f, 15.601562f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
