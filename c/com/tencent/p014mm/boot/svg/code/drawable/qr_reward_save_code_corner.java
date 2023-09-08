package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.qr_reward_save_code_corner */
public class qr_reward_save_code_corner extends C24542c {
    private final int height = 36;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = 36;
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
                instancePaint3.setColor(-3833595);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(30.0f, 18.0f);
                Path path = instancePath;
                path.cubicTo(30.0f, 18.0f, 26.249992f, 20.250055f, 23.249962f, 23.249962f);
                path.cubicTo(20.250055f, 26.249992f, 18.0f, 30.0f, 18.0f, 30.0f);
                path.cubicTo(18.0f, 30.0f, 15.698808f, 26.198854f, 12.750039f, 23.249962f);
                path.cubicTo(9.801146f, 20.301191f, 6.0f, 18.0f, 6.0f, 18.0f);
                path.cubicTo(6.0f, 18.0f, 9.750008f, 15.749946f, 12.750039f, 12.750039f);
                path.cubicTo(15.749946f, 9.750008f, 18.0f, 6.0f, 18.0f, 6.0f);
                path.cubicTo(18.0f, 6.0f, 20.223738f, 9.723691f, 23.249962f, 12.750039f);
                path.cubicTo(26.27631f, 15.776262f, 30.0f, 18.0f, 30.0f, 18.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
