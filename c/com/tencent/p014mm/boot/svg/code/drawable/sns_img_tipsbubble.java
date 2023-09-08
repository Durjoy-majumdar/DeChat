package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import fm0.C86980s1;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_img_tipsbubble */
public class sns_img_tipsbubble extends C24542c {
    private final int height = 96;
    private final int width = C86980s1.CTRL_INDEX;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return C86980s1.CTRL_INDEX;
        }
        if (i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(419430400);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 9.00051f);
            instancePath.cubicTo(0.0f, 4.0296655f, 4.0212784f, 0.0f, 8.997707f, 0.0f);
            instancePath.lineTo(575.0023f, 0.0f);
            instancePath.cubicTo(579.9716f, 0.0f, 584.0f, 4.0326095f, 584.0f, 9.00051f);
            instancePath.lineTo(584.0f, 76.99949f);
            instancePath.cubicTo(584.0f, 81.97034f, 579.9787f, 86.0f, 575.0023f, 86.0f);
            instancePath.lineTo(8.997707f, 86.0f);
            instancePath.cubicTo(4.028411f, 86.0f, 0.0f, 81.96739f, 0.0f, 76.99949f);
            instancePath.lineTo(0.0f, 9.00051f);
            instancePath.close();
            instancePath.moveTo(113.04867f, 96.0f);
            instancePath.lineTo(104.0f, 86.0f);
            instancePath.lineTo(122.09733f, 86.0f);
            instancePath.lineTo(113.04867f, 96.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
