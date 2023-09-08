package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wu */
public class C24266wu extends C24542c {
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
            canvas.saveLayerAlpha((RectF) null, 204, 31);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 16.0f);
            Path path = instancePath;
            path.cubicTo(47.045696f, 16.0f, 56.0f, 24.954306f, 56.0f, 36.0f);
            path.cubicTo(56.0f, 47.045696f, 47.045696f, 56.0f, 36.0f, 56.0f);
            path.cubicTo(24.954306f, 56.0f, 16.0f, 47.045696f, 16.0f, 36.0f);
            path.cubicTo(16.0f, 24.954306f, 24.954306f, 16.0f, 36.0f, 16.0f);
            instancePath.close();
            instancePath.moveTo(23.48019f, 26.306059f);
            Path path2 = instancePath;
            path2.cubicTo(21.4031f, 28.98474f, 20.166666f, 32.347977f, 20.166666f, 36.0f);
            path2.cubicTo(20.166666f, 44.744507f, 27.255491f, 51.833332f, 36.0f, 51.833332f);
            path2.cubicTo(39.652023f, 51.833332f, 43.01526f, 50.5969f, 45.693943f, 48.51981f);
            instancePath.close();
            instancePath.moveTo(36.0f, 20.166666f);
            instancePath.cubicTo(32.347977f, 20.166666f, 28.98474f, 21.4031f, 26.306059f, 23.48019f);
            instancePath.lineTo(48.51981f, 45.693943f);
            Path path3 = instancePath;
            path3.cubicTo(50.5969f, 43.01526f, 51.833332f, 39.652023f, 51.833332f, 36.0f);
            path3.cubicTo(51.833332f, 27.255491f, 44.744507f, 20.166666f, 36.0f, 20.166666f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
