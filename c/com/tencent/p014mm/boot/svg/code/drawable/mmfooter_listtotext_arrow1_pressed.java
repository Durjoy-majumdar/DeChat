package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mmfooter_listtotext_arrow1_pressed */
public class mmfooter_listtotext_arrow1_pressed extends C24542c {
    private final int height = 56;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 40;
        }
        if (i == 1) {
            return 56;
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
            instancePaint3.setColor(-8355712);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(0.53f, 0.0f);
            Path path = instancePath;
            path.cubicTo(4.16f, 3.26f, 8.39f, 5.74f, 12.27f, 8.67f);
            path.cubicTo(21.58f, 15.0f, 30.72f, 21.59f, 40.0f, 27.97f);
            instancePath.lineTo(40.0f, 27.98f);
            instancePath.cubicTo(26.85f, 37.4f, 13.29f, 46.35f, 0.36f, 56.0f);
            instancePath.lineTo(0.0f, 56.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
