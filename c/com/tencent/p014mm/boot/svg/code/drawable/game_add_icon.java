package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_add_icon */
public class game_add_icon extends C24542c {
    private final int height = 11;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 12;
        }
        if (i == 1) {
            return 11;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(Integer.MIN_VALUE);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.49984f, 0.166748f);
            instancePath.lineTo(5.49984f, 0.166748f);
            instancePath.lineTo(5.49984f, 5.00008f);
            instancePath.lineTo(0.666504f, 5.00008f);
            instancePath.lineTo(0.666504f, 6.00008f);
            instancePath.lineTo(5.49984f, 6.00008f);
            instancePath.lineTo(5.49984f, 10.8334f);
            instancePath.lineTo(6.49984f, 10.8334f);
            instancePath.lineTo(6.49984f, 6.00008f);
            instancePath.lineTo(11.3332f, 6.00008f);
            instancePath.lineTo(11.3332f, 5.00008f);
            instancePath.lineTo(6.49984f, 5.00008f);
            instancePath.lineTo(6.49984f, 0.166748f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
