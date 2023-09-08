package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_post_add_picture_btn */
public class album_post_add_picture_btn extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = 32;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-5066062);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(17.0f, 15.0f);
                instancePath.lineTo(32.0f, 15.0f);
                instancePath.lineTo(32.0f, 17.0f);
                instancePath.lineTo(17.0f, 17.0f);
                instancePath.lineTo(17.0f, 32.0f);
                instancePath.lineTo(15.0f, 32.0f);
                instancePath.lineTo(15.0f, 17.0f);
                instancePath.lineTo(0.0f, 17.0f);
                instancePath.lineTo(0.0f, 15.0f);
                instancePath.lineTo(15.0f, 15.0f);
                instancePath.lineTo(15.0f, 0.0f);
                instancePath.lineTo(17.0f, 0.0f);
                instancePath.lineTo(17.0f, 15.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
