package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.seller_block_menu_icon */
public class seller_block_menu_icon extends C24542c {
    private final int height = 9;
    private final int width = 39;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 39;
        }
        if (i == 1) {
            return 9;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(9.0f, 0.0f);
            instancePath.lineTo(9.0f, 9.0f);
            instancePath.lineTo(0.0f, 9.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2565928);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(15.0f, 0.0f);
            instancePath2.lineTo(24.0f, 0.0f);
            instancePath2.lineTo(24.0f, 9.0f);
            instancePath2.lineTo(15.0f, 9.0f);
            instancePath2.lineTo(15.0f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-2565928);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(30.0f, 0.0f);
            instancePath3.lineTo(39.0f, 0.0f);
            instancePath3.lineTo(39.0f, 9.0f);
            instancePath3.lineTo(30.0f, 9.0f);
            instancePath3.lineTo(30.0f, 0.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
