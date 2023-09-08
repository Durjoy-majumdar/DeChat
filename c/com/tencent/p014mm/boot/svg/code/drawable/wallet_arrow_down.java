package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_arrow_down */
public class wallet_arrow_down extends C24542c {
    private final int height = 12;
    private final int width = 22;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 22;
        }
        if (i == 1) {
            return 12;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            instancePaint3.setStrokeCap(Paint.Cap.ROUND);
            instancePaint3.setStrokeJoin(Paint.Join.MITER);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-2697514);
            instancePaint4.setStrokeWidth(4.0f);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(2.0f, 2.0f);
            instancePath.lineTo(10.705484f, 10.0f);
            instancePath.lineTo(20.0f, 2.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
