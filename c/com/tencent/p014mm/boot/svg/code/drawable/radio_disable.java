package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radio_disable */
public class radio_disable extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(60.0f, 0.0f);
        instancePath.lineTo(60.0f, 60.0f);
        instancePath.lineTo(0.0f, 60.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 30.0f);
        Path path = instancePath2;
        path.cubicTo(6.0f, 43.2f, 16.8f, 54.0f, 30.0f, 54.0f);
        path.cubicTo(43.2f, 54.0f, 54.0f, 43.2f, 54.0f, 30.0f);
        path.cubicTo(54.0f, 16.8f, 43.2f, 6.0f, 30.0f, 6.0f);
        path.cubicTo(16.8f, 6.0f, 6.0f, 16.8f, 6.0f, 30.0f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 30.0f);
        path.cubicTo(10.0f, 19.0f, 19.0f, 10.0f, 30.0f, 10.0f);
        path.cubicTo(41.0f, 10.0f, 50.0f, 19.0f, 50.0f, 30.0f);
        path.cubicTo(50.0f, 41.0f, 41.0f, 50.0f, 30.0f, 50.0f);
        path.cubicTo(19.0f, 50.0f, 10.0f, 41.0f, 10.0f, 30.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
