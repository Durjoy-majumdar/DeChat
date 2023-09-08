package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.apply_credit_arrow */
public class apply_credit_arrow extends C24542c {
    private final int height = 27;
    private final int width = 18;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 18;
        }
        if (i == 1) {
            return 27;
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
            instancePaint3.setColor(-11048043);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(18.0f, 13.534457f);
            instancePath.lineTo(3.7358053f, 27.0f);
            instancePath.lineTo(0.43568945f, 23.747923f);
            instancePath.lineTo(11.398609f, 13.397723f);
            instancePath.lineTo(0.0f, 3.32099f);
            instancePath.lineTo(3.5179605f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
