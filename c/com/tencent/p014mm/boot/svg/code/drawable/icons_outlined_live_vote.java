package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_live_vote */
public class icons_outlined_live_vote extends C24542c {
    private final int height = 28;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 28;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(28.0f, 0.0f);
            instancePath.lineTo(28.0f, 28.0f);
            instancePath.lineTo(0.0f, 28.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(28.0f, 0.0f);
            instancePath2.lineTo(28.0f, 28.0f);
            instancePath2.lineTo(0.0f, 28.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(15.587017f, 2.2175019f);
            instancePath3.lineTo(24.488838f, 11.119323f);
            instancePath3.cubicTo(25.308228f, 11.938713f, 25.296658f, 13.278777f, 24.462994f, 14.112441f);
            instancePath3.lineTo(15.406101f, 23.169333f);
            instancePath3.cubicTo(15.328558f, 23.246876f, 15.2466345f, 23.317307f, 15.161155f, 23.380617f);
            instancePath3.lineTo(23.441807f, 23.37999f);
            instancePath3.lineTo(23.441807f, 25.514719f);
            instancePath3.lineTo(4.558193f, 25.514719f);
            instancePath3.lineTo(4.558193f, 23.37999f);
            instancePath3.lineTo(12.626741f, 23.381702f);
            instancePath3.cubicTo(12.552305f, 23.325226f, 12.480858f, 23.263052f, 12.412983f, 23.195177f);
            instancePath3.lineTo(3.511162f, 14.293357f);
            instancePath3.cubicTo(2.691772f, 13.473968f, 2.7033432f, 12.133903f, 3.537007f, 11.300239f);
            instancePath3.lineTo(12.593899f, 2.243347f);
            instancePath3.cubicTo(13.427563f, 1.4096831f, 14.767628f, 1.3981119f, 15.587017f, 2.2175019f);
            instancePath3.close();
            instancePath3.moveTo(14.077536f, 3.7269838f);
            instancePath3.lineTo(5.0206437f, 12.783875f);
            instancePath3.lineTo(13.922464f, 21.685696f);
            instancePath3.lineTo(22.979357f, 12.628804f);
            instancePath3.lineTo(14.077536f, 3.7269838f);
            instancePath3.close();
            instancePath3.moveTo(17.68921f, 9.504245f);
            instancePath3.lineTo(18.609194f, 10.57397f);
            instancePath3.lineTo(13.483574f, 15.788879f);
            Path path = instancePath3;
            path.cubicTo(13.352148f, 15.922595f, 13.220722f, 16.05631f, 12.95787f, 16.05631f);
            path.cubicTo(12.848348f, 16.05631f, 12.647557f, 15.963452f, 12.507613f, 15.855119f);
            instancePath3.lineTo(12.432165f, 15.788879f);
            instancePath3.lineTo(9.803641f, 13.114567f);
            instancePath3.lineTo(10.723624f, 12.044842f);
            instancePath3.lineTo(12.95787f, 14.318007f);
            instancePath3.lineTo(17.68921f, 9.504245f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
