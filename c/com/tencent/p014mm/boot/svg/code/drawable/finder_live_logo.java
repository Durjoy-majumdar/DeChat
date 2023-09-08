package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_logo */
public class finder_live_logo extends C24542c {
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
            instancePath.moveTo(36.0f, 6.0f);
            Path path = instancePath;
            path.cubicTo(52.570312f, 6.0f, 66.0f, 19.429688f, 66.0f, 36.0f);
            path.cubicTo(66.0f, 52.570312f, 52.570312f, 66.0f, 36.0f, 66.0f);
            path.cubicTo(19.429688f, 66.0f, 6.0f, 52.570312f, 6.0f, 36.0f);
            path.cubicTo(6.0f, 19.429688f, 19.429688f, 6.0f, 36.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 10.5f);
            Path path2 = instancePath;
            path2.cubicTo(21.917969f, 10.5f, 10.5f, 21.917969f, 10.5f, 36.0f);
            path2.cubicTo(10.5f, 50.08203f, 21.917969f, 61.5f, 36.0f, 61.5f);
            path2.cubicTo(50.08203f, 61.5f, 61.5f, 50.08203f, 61.5f, 36.0f);
            path2.cubicTo(61.5f, 21.917969f, 50.08203f, 10.5f, 36.0f, 10.5f);
            instancePath.close();
            instancePath.moveTo(36.0f, 19.5f);
            path2.cubicTo(45.11328f, 19.5f, 52.5f, 26.886719f, 52.5f, 36.0f);
            path2.cubicTo(52.5f, 45.11328f, 45.11328f, 52.5f, 36.0f, 52.5f);
            path2.cubicTo(26.886719f, 52.5f, 19.5f, 45.11328f, 19.5f, 36.0f);
            path2.cubicTo(19.5f, 26.886719f, 26.886719f, 19.5f, 36.0f, 19.5f);
            instancePath.close();
            instancePath.moveTo(36.0f, 19.5f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
