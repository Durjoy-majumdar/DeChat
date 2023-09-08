package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.confirm_dialog_successful_icon */
public class confirm_dialog_successful_icon extends C24542c {
    private final int height = 80;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 120;
        }
        if (i == 1) {
            return 80;
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
            instancePaint3.setColor(-12206054);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(46.16f, 67.69f);
            Path path = instancePath;
            path.cubicTo(68.72f, 45.13f, 91.28f, 22.57f, 113.84f, 0.01f);
            path.cubicTo(115.9f, 2.05f, 117.95f, 4.1f, 119.99f, 6.16f);
            path.cubicTo(95.39f, 30.78f, 70.77f, 55.38f, 46.16f, 79.99f);
            path.cubicTo(30.77f, 64.62f, 15.38f, 49.24f, 0.01f, 33.85f);
            path.cubicTo(2.05f, 31.79f, 4.1f, 29.74f, 6.16f, 27.71f);
            path.cubicTo(19.5f, 41.02f, 32.81f, 54.37f, 46.16f, 67.69f);
            instancePath.lineTo(46.16f, 67.69f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
