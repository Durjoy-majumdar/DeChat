package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.msg_channel_mark */
public class msg_channel_mark extends C24542c {
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
                instancePaint3.setColor(-8548183);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.8191f, 5.18372f);
                instancePath.lineTo(12.7134f, 2.65039f);
                instancePath.lineTo(11.1134f, 2.65039f);
                instancePath.lineTo(10.2194f, 5.18306f);
                instancePath.lineTo(8.48322f, 5.18347f);
                instancePath.lineTo(7.91841f, 6.78347f);
                instancePath.lineTo(9.65455f, 6.78306f);
                instancePath.lineTo(7.34801f, 13.3171f);
                instancePath.lineTo(8.94801f, 13.3171f);
                instancePath.lineTo(9.84253f, 10.7831f);
                instancePath.lineTo(11.709f, 10.7837f);
                instancePath.lineTo(12.2738f, 9.18373f);
                instancePath.lineTo(10.4073f, 9.18306f);
                instancePath.lineTo(11.2543f, 6.78372f);
                instancePath.lineTo(13.121f, 6.78372f);
                instancePath.lineTo(13.6858f, 5.18372f);
                instancePath.lineTo(11.8191f, 5.18372f);
                instancePath.close();
                instancePath.moveTo(6.40664f, 9.18311f);
                instancePath.lineTo(8.71338f, 2.65044f);
                instancePath.lineTo(7.11338f, 2.65044f);
                instancePath.lineTo(6.21934f, 5.18311f);
                instancePath.lineTo(4.35243f, 5.18377f);
                instancePath.lineTo(3.78762f, 6.78377f);
                instancePath.lineTo(5.65452f, 6.78311f);
                instancePath.lineTo(4.80707f, 9.18377f);
                instancePath.lineTo(2.94041f, 9.18377f);
                instancePath.lineTo(2.3756f, 10.7838f);
                instancePath.lineTo(4.24226f, 10.7838f);
                instancePath.lineTo(3.34798f, 13.3171f);
                instancePath.lineTo(4.94798f, 13.3171f);
                instancePath.lineTo(5.84183f, 10.7831f);
                instancePath.lineTo(7.57968f, 10.7835f);
                instancePath.lineTo(8.14449f, 9.18353f);
                instancePath.lineTo(6.40664f, 9.18311f);
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
