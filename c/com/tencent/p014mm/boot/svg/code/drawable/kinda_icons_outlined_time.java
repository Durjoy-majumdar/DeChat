package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icons_outlined_time */
public class kinda_icons_outlined_time extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.599999f, 11.502944f);
            instancePath.lineTo(16.491169f, 15.394113f);
            instancePath.lineTo(15.64264f, 16.242641f);
            instancePath.lineTo(11.4f, 12.0f);
            instancePath.lineTo(11.4f, 6.0f);
            instancePath.lineTo(12.599999f, 6.0f);
            instancePath.lineTo(12.599999f, 11.502944f);
            instancePath.close();
            instancePath.moveTo(12.0f, 22.0f);
            Path path = instancePath;
            path.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
            path.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
            path.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
            path.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 20.8f);
            Path path2 = instancePath;
            path2.cubicTo(16.860106f, 20.8f, 20.8f, 16.860106f, 20.8f, 12.0f);
            path2.cubicTo(20.8f, 7.139894f, 16.860106f, 3.2f, 12.0f, 3.2f);
            path2.cubicTo(7.139894f, 3.2f, 3.2f, 7.139894f, 3.2f, 12.0f);
            path2.cubicTo(3.2f, 16.860106f, 7.139894f, 20.8f, 12.0f, 20.8f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
