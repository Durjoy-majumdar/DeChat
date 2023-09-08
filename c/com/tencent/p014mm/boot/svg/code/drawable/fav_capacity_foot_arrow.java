package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_capacity_foot_arrow */
public class fav_capacity_foot_arrow extends C24542c {
    private final int height = 30;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 24;
        }
        if (i == 1) {
            return 30;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(22.0f, 14.999688f);
            instancePath.lineTo(7.130435f, 29.999374f);
            instancePath.lineTo(3.826087f, 26.666111f);
            instancePath.lineTo(15.391304f, 14.999688f);
            instancePath.lineTo(3.0f, 3.3332639f);
            instancePath.lineTo(6.304348f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.saveLayerAlpha((RectF) null, 51, 31);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(24.0f, 0.0f);
            instancePath2.lineTo(24.0f, 30.0f);
            instancePath2.lineTo(0.0f, 30.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            C24542c.done(looper);
        }
        return 0;
    }
}
