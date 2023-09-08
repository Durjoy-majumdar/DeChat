package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_smiley */
public class game_comment_smiley extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(2.66656f, 16.0f);
                Path path = instancePath;
                path.cubicTo(2.66656f, 23.3638f, 8.6361f, 29.3333f, 15.9999f, 29.3333f);
                path.cubicTo(23.3637f, 29.3333f, 29.3332f, 23.3638f, 29.3332f, 16.0f);
                path.cubicTo(29.3332f, 8.63616f, 23.3637f, 2.66663f, 15.9999f, 2.66663f);
                path.cubicTo(8.6361f, 2.66663f, 2.66656f, 8.63616f, 2.66656f, 16.0f);
                instancePath.close();
                instancePath.moveTo(27.7332f, 15.9999f);
                Path path2 = instancePath;
                path2.cubicTo(27.7332f, 22.48f, 22.48f, 27.7332f, 15.9999f, 27.7332f);
                path2.cubicTo(9.51971f, 27.7332f, 4.26652f, 22.48f, 4.26652f, 15.9999f);
                path2.cubicTo(4.26652f, 9.51975f, 9.51971f, 4.26656f, 15.9999f, 4.26656f);
                path2.cubicTo(22.48f, 4.26656f, 27.7332f, 9.51975f, 27.7332f, 15.9999f);
                instancePath.close();
                instancePath.moveTo(23.9999f, 16.6666f);
                path2.cubicTo(23.9999f, 21.0849f, 20.4182f, 24.6666f, 15.9999f, 24.6666f);
                path2.cubicTo(11.5816f, 24.6666f, 7.9999f, 21.0849f, 7.9999f, 16.6666f);
                instancePath.lineTo(23.9999f, 16.6666f);
                instancePath.close();
                instancePath.moveTo(22.1984f, 18.2666f);
                path2.cubicTo(21.4879f, 21.027f, 18.9821f, 23.0666f, 16.0f, 23.0666f);
                path2.cubicTo(13.0179f, 23.0666f, 10.5121f, 21.027f, 9.80163f, 18.2666f);
                instancePath.lineTo(22.1984f, 18.2666f);
                instancePath.close();
                instancePath.moveTo(13.3332f, 11.9999f);
                Path path3 = instancePath;
                path3.cubicTo(13.3332f, 13.1045f, 12.4378f, 13.9999f, 11.3332f, 13.9999f);
                path3.cubicTo(10.2287f, 13.9999f, 9.33324f, 13.1045f, 9.33324f, 11.9999f);
                path3.cubicTo(9.33324f, 10.8954f, 10.2287f, 9.99994f, 11.3332f, 9.99994f);
                path3.cubicTo(12.4378f, 9.99994f, 13.3332f, 10.8954f, 13.3332f, 11.9999f);
                instancePath.close();
                instancePath.moveTo(20.6665f, 13.9999f);
                Path path4 = instancePath;
                path4.cubicTo(21.7711f, 13.9999f, 22.6665f, 13.1045f, 22.6665f, 11.9999f);
                path4.cubicTo(22.6665f, 10.8954f, 21.7711f, 9.99994f, 20.6665f, 9.99994f);
                path4.cubicTo(19.562f, 9.99994f, 18.6665f, 10.8954f, 18.6665f, 11.9999f);
                path4.cubicTo(18.6665f, 13.1045f, 19.562f, 13.9999f, 20.6665f, 13.9999f);
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
