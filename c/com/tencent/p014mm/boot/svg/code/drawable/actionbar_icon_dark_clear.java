package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_icon_dark_clear */
public class actionbar_icon_dark_clear extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                canvas.saveLayerAlpha((RectF) null, 230, 31);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(1275068416);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 60.0f);
                Path path = instancePath;
                path.cubicTo(22.745167f, 60.0f, 12.0f, 49.254833f, 12.0f, 36.0f);
                path.cubicTo(12.0f, 22.745167f, 22.745167f, 12.0f, 36.0f, 12.0f);
                path.cubicTo(49.254833f, 12.0f, 60.0f, 22.745167f, 60.0f, 36.0f);
                path.cubicTo(60.0f, 49.254833f, 49.254833f, 60.0f, 36.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 32.938873f);
                instancePath.lineTo(27.061129f, 24.0f);
                instancePath.lineTo(24.0f, 27.061129f);
                instancePath.lineTo(32.938873f, 36.0f);
                instancePath.lineTo(24.0f, 44.938873f);
                instancePath.lineTo(27.061129f, 48.0f);
                instancePath.lineTo(36.0f, 39.061127f);
                instancePath.lineTo(44.938873f, 48.0f);
                instancePath.lineTo(48.0f, 44.938873f);
                instancePath.lineTo(39.061127f, 36.0f);
                instancePath.lineTo(48.0f, 27.061129f);
                instancePath.lineTo(44.938873f, 24.0f);
                instancePath.lineTo(36.0f, 32.938873f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
