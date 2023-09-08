package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.comment_channel_mark */
public class comment_channel_mark extends C24542c {
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
                instancePaint3.setColor(-2130706433);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.8191f, 5.18372f);
                instancePath.lineTo(12.7134f, 2.65039f);
                instancePath.lineTo(11.1134f, 2.65039f);
                instancePath.lineTo(10.2193f, 5.18306f);
                instancePath.lineTo(8.48317f, 5.18347f);
                instancePath.lineTo(7.91836f, 6.78347f);
                instancePath.lineTo(9.65451f, 6.78306f);
                instancePath.lineTo(7.34796f, 13.3171f);
                instancePath.lineTo(8.94796f, 13.3171f);
                instancePath.lineTo(9.84248f, 10.7831f);
                instancePath.lineTo(11.7089f, 10.7837f);
                instancePath.lineTo(12.2737f, 9.18373f);
                instancePath.lineTo(10.4073f, 9.18306f);
                instancePath.lineTo(11.2543f, 6.78372f);
                instancePath.lineTo(13.1209f, 6.78372f);
                instancePath.lineTo(13.6858f, 5.18372f);
                instancePath.lineTo(11.8191f, 5.18372f);
                instancePath.close();
                instancePath.moveTo(6.4066f, 9.18311f);
                instancePath.lineTo(8.71334f, 2.65044f);
                instancePath.lineTo(7.11334f, 2.65044f);
                instancePath.lineTo(6.21929f, 5.18311f);
                instancePath.lineTo(4.35239f, 5.18377f);
                instancePath.lineTo(3.78758f, 6.78377f);
                instancePath.lineTo(5.65448f, 6.78311f);
                instancePath.lineTo(4.80703f, 9.18377f);
                instancePath.lineTo(2.94036f, 9.18377f);
                instancePath.lineTo(2.37555f, 10.7838f);
                instancePath.lineTo(4.24222f, 10.7838f);
                instancePath.lineTo(3.34793f, 13.3171f);
                instancePath.lineTo(4.94793f, 13.3171f);
                instancePath.lineTo(5.84178f, 10.7831f);
                instancePath.lineTo(7.57964f, 10.7835f);
                instancePath.lineTo(8.14445f, 9.18353f);
                instancePath.lineTo(6.4066f, 9.18311f);
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
