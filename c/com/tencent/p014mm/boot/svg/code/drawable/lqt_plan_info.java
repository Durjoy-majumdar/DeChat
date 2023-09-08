package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lqt_plan_info */
public class lqt_plan_info extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-8421505);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 61.0f);
            Path path = instancePath;
            path.cubicTo(22.19288f, 61.0f, 11.0f, 49.807117f, 11.0f, 36.0f);
            path.cubicTo(11.0f, 22.19288f, 22.19288f, 11.0f, 36.0f, 11.0f);
            path.cubicTo(49.807117f, 11.0f, 61.0f, 22.19288f, 61.0f, 36.0f);
            path.cubicTo(61.0f, 49.807117f, 49.807117f, 61.0f, 36.0f, 61.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 58.0f);
            Path path2 = instancePath;
            path2.cubicTo(48.150265f, 58.0f, 58.0f, 48.150265f, 58.0f, 36.0f);
            path2.cubicTo(58.0f, 23.849735f, 48.150265f, 14.0f, 36.0f, 14.0f);
            path2.cubicTo(23.849735f, 14.0f, 14.0f, 23.849735f, 14.0f, 36.0f);
            path2.cubicTo(14.0f, 48.150265f, 23.849735f, 58.0f, 36.0f, 58.0f);
            instancePath.close();
            instancePath.moveTo(34.5f, 31.0f);
            instancePath.lineTo(37.5f, 31.0f);
            instancePath.lineTo(37.5f, 48.5f);
            instancePath.lineTo(34.5f, 48.5f);
            instancePath.lineTo(34.5f, 31.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 28.5f);
            Path path3 = instancePath;
            path3.cubicTo(34.61929f, 28.5f, 33.5f, 27.380713f, 33.5f, 26.0f);
            path3.cubicTo(33.5f, 24.619287f, 34.61929f, 23.5f, 36.0f, 23.5f);
            path3.cubicTo(37.38071f, 23.5f, 38.5f, 24.619287f, 38.5f, 26.0f);
            path3.cubicTo(38.5f, 27.380713f, 37.38071f, 28.5f, 36.0f, 28.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
