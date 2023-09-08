package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_facebook */
public class bottomsheet_facebook extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9276814);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.052474f, 8.0f);
        instancePath.cubicTo(11.166417f, 8.0f, 8.0f, 11.165231f, 8.0f, 15.049831f);
        instancePath.lineTo(8.0f, 128.9022f);
        instancePath.cubicTo(8.0f, 132.78682f, 11.166417f, 135.95204f, 15.052474f, 135.95204f);
        instancePath.lineTo(76.365814f, 135.95204f);
        instancePath.lineTo(76.365814f, 86.41139f);
        instancePath.lineTo(59.670166f, 86.41139f);
        instancePath.lineTo(59.670166f, 67.084305f);
        instancePath.lineTo(76.365814f, 67.084305f);
        instancePath.lineTo(76.365814f, 52.840763f);
        Path path = instancePath;
        path.cubicTo(76.365814f, 36.295242f, 86.488754f, 27.32709f, 101.21739f, 27.32709f);
        path.cubicTo(108.26987f, 27.32709f, 114.362816f, 27.854628f, 116.13793f, 28.094418f);
        instancePath.lineTo(116.13793f, 45.35931f);
        instancePath.lineTo(105.91904f, 45.35931f);
        instancePath.cubicTo(97.90704f, 45.35931f, 96.32384f, 49.147995f, 96.32384f, 54.759087f);
        instancePath.lineTo(96.32384f, 67.084305f);
        instancePath.lineTo(115.46627f, 67.084305f);
        instancePath.lineTo(112.97151f, 86.41139f);
        instancePath.lineTo(96.32384f, 86.41139f);
        instancePath.lineTo(96.32384f, 136.0f);
        instancePath.lineTo(128.94753f, 136.0f);
        instancePath.cubicTo(132.83359f, 136.0f, 136.0f, 132.83476f, 136.0f, 128.95016f);
        instancePath.lineTo(136.0f, 15.049831f);
        instancePath.cubicTo(136.0f, 11.117272f, 132.88156f, 8.0f, 128.94753f, 8.0f);
        instancePath.lineTo(15.052474f, 8.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
