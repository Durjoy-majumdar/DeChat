package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.read_more_btn_icon */
public class read_more_btn_icon extends C24542c {
    private final int height = 46;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = 46;
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
                instancePaint3.setColor(-8744017);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(30.152525f, 34.384174f);
                Path path = instancePath;
                path.cubicTo(27.020466f, 36.658646f, 23.166878f, 38.0f, 19.0f, 38.0f);
                path.cubicTo(8.50659f, 38.0f, 0.0f, 29.49341f, 0.0f, 19.0f);
                path.cubicTo(0.0f, 8.50659f, 8.50659f, 0.0f, 19.0f, 0.0f);
                path.cubicTo(29.49341f, 0.0f, 38.0f, 8.50659f, 38.0f, 19.0f);
                path.cubicTo(38.0f, 23.166878f, 36.658646f, 27.020466f, 34.384174f, 30.152525f);
                instancePath.lineTo(45.66412f, 41.432472f);
                instancePath.lineTo(41.432472f, 45.66412f);
                instancePath.lineTo(30.152525f, 34.384174f);
                instancePath.close();
                instancePath.moveTo(19.0f, 33.0f);
                Path path2 = instancePath;
                path2.cubicTo(26.731987f, 33.0f, 33.0f, 26.731987f, 33.0f, 19.0f);
                path2.cubicTo(33.0f, 11.268014f, 26.731987f, 5.0f, 19.0f, 5.0f);
                path2.cubicTo(11.268014f, 5.0f, 5.0f, 11.268014f, 5.0f, 19.0f);
                path2.cubicTo(5.0f, 26.731987f, 11.268014f, 33.0f, 19.0f, 33.0f);
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
