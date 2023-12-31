package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_tags_icon */
public class fav_tags_icon extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(43.49117f, 12.6f);
        instancePath.lineTo(14.091168f, 42.0f);
        instancePath.lineTo(29.999989f, 57.90882f);
        instancePath.lineTo(59.39849f, 28.508768f);
        instancePath.lineTo(59.399723f, 12.6f);
        instancePath.lineTo(43.49117f, 12.6f);
        instancePath.close();
        instancePath.moveTo(60.0f, 9.0f);
        instancePath.cubicTo(61.657085f, 8.999896f, 63.00013f, 10.343145f, 63.0f, 12.0f);
        instancePath.lineTo(62.99847f, 28.757538f);
        instancePath.cubicTo(62.99841f, 29.553082f, 62.682365f, 30.316027f, 62.119843f, 30.878574f);
        instancePath.lineTo(32.12132f, 60.87868f);
        instancePath.cubicTo(30.949696f, 62.050304f, 29.0502f, 62.050304f, 27.878628f, 60.87873f);
        instancePath.lineTo(11.121321f, 44.12132f);
        instancePath.cubicTo(9.949747f, 42.94975f, 9.949747f, 41.05025f, 11.121321f, 39.87868f);
        instancePath.lineTo(41.12132f, 9.878679f);
        instancePath.cubicTo(41.68393f, 9.316071f, 42.44699f, 9.0f, 43.24264f, 9.0f);
        instancePath.lineTo(60.0f, 9.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(48.0f, 20.4f);
        Path path = instancePath2;
        path.cubicTo(49.988224f, 20.4f, 51.6f, 22.011774f, 51.6f, 24.0f);
        path.cubicTo(51.6f, 25.988226f, 49.988224f, 27.6f, 48.0f, 27.6f);
        path.cubicTo(46.011776f, 27.6f, 44.4f, 25.988226f, 44.4f, 24.0f);
        path.cubicTo(44.4f, 22.011774f, 46.011776f, 20.4f, 48.0f, 20.4f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.drawPath(instancePath2, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
