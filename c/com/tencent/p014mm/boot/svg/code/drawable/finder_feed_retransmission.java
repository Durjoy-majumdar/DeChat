package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_feed_retransmission */
public class finder_feed_retransmission extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.8440943f, 7.672352f);
                instancePath.lineTo(6.25884f, 9.086903f);
                Path path = instancePath;
                path.cubicTo(5.48387f, 9.816408f, 5.0f, 10.851697f, 5.0f, 12.0f);
                path.cubicTo(5.0f, 14.209139f, 6.790861f, 16.0f, 9.0f, 16.0f);
                instancePath.lineTo(13.447f, 15.998f);
                instancePath.lineTo(11.642458f, 14.333333f);
                instancePath.lineTo(13.0876665f, 13.0f);
                instancePath.lineTo(16.700687f, 16.333334f);
                instancePath.cubicTo(17.099771f, 16.701523f, 17.099771f, 17.298477f, 16.700687f, 17.666666f);
                instancePath.lineTo(13.0876665f, 21.0f);
                instancePath.lineTo(11.642458f, 19.666666f);
                instancePath.lineTo(13.447f, 18.0f);
                instancePath.lineTo(9.0f, 18.0f);
                Path path2 = instancePath;
                path2.cubicTo(5.6862917f, 18.0f, 3.0f, 15.313708f, 3.0f, 12.0f);
                path2.cubicTo(3.0f, 10.299465f, 3.70745f, 8.764164f, 4.8440943f, 7.672352f);
                instancePath.close();
                instancePath.moveTo(12.357542f, 9.666667f);
                instancePath.lineTo(10.9123335f, 11.0f);
                instancePath.lineTo(7.2993126f, 7.6666665f);
                instancePath.cubicTo(6.900229f, 7.2984767f, 6.900229f, 6.7015233f, 7.2993126f, 6.3333335f);
                instancePath.lineTo(10.9123335f, 3.0f);
                instancePath.lineTo(12.357542f, 4.3333335f);
                instancePath.lineTo(10.551f, 6.0f);
                instancePath.lineTo(15.0f, 6.0f);
                Path path3 = instancePath;
                path3.cubicTo(18.31371f, 6.0f, 21.0f, 8.686292f, 21.0f, 12.0f);
                path3.cubicTo(21.0f, 13.700535f, 20.292551f, 15.235836f, 19.155907f, 16.327648f);
                instancePath.lineTo(17.74116f, 14.913096f);
                Path path4 = instancePath;
                path4.cubicTo(18.51613f, 14.183592f, 19.0f, 13.148303f, 19.0f, 12.0f);
                path4.cubicTo(19.0f, 9.790861f, 17.209139f, 8.0f, 15.0f, 8.0f);
                instancePath.lineTo(10.552f, 8.0f);
                instancePath.lineTo(12.357542f, 9.666667f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
