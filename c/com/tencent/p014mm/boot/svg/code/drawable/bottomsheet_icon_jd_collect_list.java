package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_jd_collect_list */
public class bottomsheet_icon_jd_collect_list extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 28.0f);
                instancePath.lineTo(85.0f, 28.0f);
                instancePath.lineTo(85.0f, 20.0f);
                instancePath.lineTo(32.0f, 20.0f);
                instancePath.lineTo(32.0f, 28.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 28.0f);
                instancePath.lineTo(24.0f, 28.0f);
                instancePath.lineTo(24.0f, 20.0f);
                instancePath.lineTo(12.0f, 20.0f);
                instancePath.lineTo(12.0f, 28.0f);
                instancePath.close();
                instancePath.moveTo(32.0f, 52.0f);
                instancePath.lineTo(85.0f, 52.0f);
                instancePath.lineTo(85.0f, 44.0f);
                instancePath.lineTo(32.0f, 44.0f);
                instancePath.lineTo(32.0f, 52.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 52.0f);
                instancePath.lineTo(24.0f, 52.0f);
                instancePath.lineTo(24.0f, 44.0f);
                instancePath.lineTo(12.0f, 44.0f);
                instancePath.lineTo(12.0f, 52.0f);
                instancePath.close();
                instancePath.moveTo(32.0f, 77.0f);
                instancePath.lineTo(85.0f, 77.0f);
                instancePath.lineTo(85.0f, 69.0f);
                instancePath.lineTo(32.0f, 69.0f);
                instancePath.lineTo(32.0f, 77.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 77.0f);
                instancePath.lineTo(24.0f, 77.0f);
                instancePath.lineTo(24.0f, 69.0f);
                instancePath.lineTo(12.0f, 69.0f);
                instancePath.lineTo(12.0f, 77.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
