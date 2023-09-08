package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_favorites */
public class icons_filled_favorites extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePath.moveTo(60.597374f, 19.200624f);
                instancePath.lineTo(36.0f, 33.401924f);
                instancePath.lineTo(11.402575f, 19.200594f);
                instancePath.cubicTo(11.4641075f, 19.16046f, 11.526233f, 19.122423f, 11.588874f, 19.086618f);
                instancePath.lineTo(33.411125f, 6.612736f);
                instancePath.cubicTo(34.840923f, 5.7954464f, 37.160156f, 5.796063f, 38.588875f, 6.612736f);
                instancePath.lineTo(60.411125f, 19.086618f);
                Path path = instancePath;
                path.cubicTo(60.47375f, 19.122416f, 60.53586f, 19.160461f, 60.597374f, 19.200624f);
                instancePath.close();
                instancePath.moveTo(62.96887f, 23.027594f);
                path.cubicTo(62.98936f, 23.187063f, 63.0f, 23.344381f, 63.0f, 23.49818f);
                instancePath.lineTo(63.0f, 48.50182f);
                instancePath.cubicTo(63.0f, 50.120968f, 61.839844f, 52.09671f, 60.411125f, 52.913383f);
                instancePath.lineTo(38.588875f, 65.38726f);
                instancePath.cubicTo(38.480747f, 65.44907f, 38.36753f, 65.5062f, 38.25f, 65.558655f);
                instancePath.lineTo(38.25f, 37.299038f);
                instancePath.lineTo(62.96887f, 23.027594f);
                instancePath.close();
                instancePath.moveTo(33.75f, 65.55865f);
                instancePath.cubicTo(33.632458f, 65.506195f, 33.51924f, 65.449066f, 33.411125f, 65.38726f);
                instancePath.lineTo(11.588874f, 52.913383f);
                instancePath.cubicTo(10.159078f, 52.096092f, 9.0f, 50.107227f, 9.0f, 48.50182f);
                instancePath.lineTo(9.0f, 23.49818f);
                instancePath.cubicTo(9.0f, 23.344044f, 9.010513f, 23.186676f, 9.030771f, 23.027386f);
                instancePath.lineTo(33.75f, 37.299038f);
                instancePath.lineTo(33.75f, 65.55865f);
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
