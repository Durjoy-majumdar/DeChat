package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.progress_cancel_btn_pressed */
public class progress_cancel_btn_pressed extends C24542c {
    private final int height = 66;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = 66;
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
                instancePaint3.setColor(-2800572);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(29.81802f, 33.0f);
                instancePath.lineTo(17.90901f, 21.09099f);
                instancePath.lineTo(21.09099f, 17.90901f);
                instancePath.lineTo(33.0f, 29.81802f);
                instancePath.lineTo(44.909008f, 17.90901f);
                instancePath.lineTo(48.090992f, 21.09099f);
                instancePath.lineTo(36.18198f, 33.0f);
                instancePath.lineTo(48.090992f, 44.909008f);
                instancePath.lineTo(44.909008f, 48.090992f);
                instancePath.lineTo(33.0f, 36.18198f);
                instancePath.lineTo(21.09099f, 48.090992f);
                instancePath.lineTo(17.90901f, 44.909008f);
                instancePath.lineTo(29.81802f, 33.0f);
                instancePath.close();
                instancePath.moveTo(33.0f, 66.0f);
                Path path = instancePath;
                path.cubicTo(51.225395f, 66.0f, 66.0f, 51.225395f, 66.0f, 33.0f);
                path.cubicTo(66.0f, 14.774603f, 51.225395f, 0.0f, 33.0f, 0.0f);
                path.cubicTo(14.774603f, 0.0f, 0.0f, 14.774603f, 0.0f, 33.0f);
                path.cubicTo(0.0f, 51.225395f, 14.774603f, 66.0f, 33.0f, 66.0f);
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
