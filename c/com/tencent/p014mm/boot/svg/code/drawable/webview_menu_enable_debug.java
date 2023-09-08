package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_menu_enable_debug */
public class webview_menu_enable_debug extends C24542c {
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(3.6f);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(6.6f, 16.2f);
        instancePath.cubicTo(6.6f, 13.549034f, 8.749033f, 11.4f, 11.4f, 11.4f);
        instancePath.lineTo(60.600002f, 11.4f);
        instancePath.cubicTo(63.25097f, 11.4f, 65.4f, 13.549034f, 65.4f, 16.2f);
        instancePath.lineTo(65.4f, 55.8f);
        instancePath.cubicTo(65.4f, 58.450966f, 63.25097f, 60.6f, 60.600002f, 60.6f);
        instancePath.lineTo(11.4f, 60.6f);
        instancePath.cubicTo(8.749033f, 60.6f, 6.6f, 58.450966f, 6.6f, 55.8f);
        instancePath.lineTo(6.6f, 16.2f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(21.45f, 27.75f);
        instancePath2.lineTo(29.85f, 35.94179f);
        instancePath2.lineTo(21.45f, 44.55f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(34.65f, 43.35f);
        instancePath3.lineTo(51.45f, 43.35f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
