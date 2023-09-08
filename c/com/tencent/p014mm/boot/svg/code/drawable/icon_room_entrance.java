package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_room_entrance */
public class icon_room_entrance extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = 16;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(8.6665f, 2.6665f);
                instancePath.lineTo(7.33317f, 2.6665f);
                instancePath.lineTo(7.33317f, 7.33317f);
                instancePath.lineTo(2.66649f, 7.33317f);
                instancePath.lineTo(2.66649f, 8.6665f);
                instancePath.lineTo(7.33317f, 8.6665f);
                instancePath.lineTo(7.33317f, 13.3332f);
                instancePath.lineTo(8.6665f, 13.3332f);
                instancePath.lineTo(8.6665f, 8.6665f);
                instancePath.lineTo(13.3332f, 8.6665f);
                instancePath.lineTo(13.3332f, 7.33317f);
                instancePath.lineTo(8.6665f, 7.33317f);
                instancePath.lineTo(8.6665f, 2.6665f);
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
