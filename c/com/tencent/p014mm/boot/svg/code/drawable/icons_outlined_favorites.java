package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_favorites */
public class icons_outlined_favorites extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(57.7577f, 21.974848f);
        instancePath.lineTo(36.774937f, 9.734903f);
        instancePath.cubicTo(36.466652f, 9.555071f, 35.53348f, 9.554993f, 35.225063f, 9.734903f);
        instancePath.lineTo(14.2423f, 21.974848f);
        instancePath.lineTo(36.0f, 34.536663f);
        instancePath.lineTo(57.7577f, 21.974848f);
        instancePath.close();
        instancePath.moveTo(59.4f, 25.183588f);
        instancePath.lineTo(37.8f, 37.654354f);
        instancePath.lineTo(37.8f, 62.89739f);
        instancePath.lineTo(58.59719f, 50.765697f);
        Path path = instancePath;
        path.cubicTo(58.920998f, 50.57681f, 59.4f, 49.743988f, 59.4f, 49.37328f);
        instancePath.lineTo(59.4f, 25.183588f);
        instancePath.close();
        instancePath.moveTo(12.6f, 25.183588f);
        instancePath.lineTo(12.6f, 49.37328f);
        path.cubicTo(12.6f, 49.73662f, 13.083672f, 50.579533f, 13.402809f, 50.765697f);
        instancePath.lineTo(34.2f, 62.89739f);
        instancePath.lineTo(34.2f, 37.654354f);
        instancePath.lineTo(12.6f, 25.183588f);
        instancePath.close();
        instancePath.moveTo(33.411125f, 6.6252995f);
        instancePath.cubicTo(34.840923f, 5.791252f, 37.160156f, 5.791881f, 38.588875f, 6.6252995f);
        instancePath.lineTo(60.411125f, 19.354948f);
        instancePath.cubicTo(61.840923f, 20.188995f, 63.0f, 22.21864f, 63.0f, 23.856966f);
        instancePath.lineTo(63.0f, 49.37328f);
        instancePath.cubicTo(63.0f, 51.02563f, 61.839844f, 53.04188f, 60.411125f, 53.8753f);
        instancePath.lineTo(38.588875f, 66.60495f);
        instancePath.cubicTo(37.159077f, 67.438995f, 34.839844f, 67.43836f, 33.411125f, 66.60495f);
        instancePath.lineTo(11.588874f, 53.8753f);
        instancePath.cubicTo(10.159078f, 53.041252f, 9.0f, 51.01161f, 9.0f, 49.37328f);
        instancePath.lineTo(9.0f, 23.856966f);
        instancePath.cubicTo(9.0f, 22.204617f, 10.160156f, 20.188366f, 11.588874f, 19.354948f);
        instancePath.lineTo(33.411125f, 6.6252995f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
