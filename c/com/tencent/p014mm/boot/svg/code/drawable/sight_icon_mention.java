package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_icon_mention */
public class sight_icon_mention extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = 90;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(25.0f, 20.0f);
                Path path = instancePath;
                path.cubicTo(37.355473f, 8.722359f, 58.488342f, 9.416998f, 70.0f, 22.0f);
                path.cubicTo(76.14214f, 29.279669f, 77.27532f, 39.981148f, 75.0f, 49.0f);
                path.cubicTo(73.59745f, 53.7028f, 70.824135f, 57.7901f, 67.0f, 60.0f);
                path.cubicTo(62.72287f, 62.39083f, 56.818386f, 63.6593f, 53.0f, 60.0f);
                path.cubicTo(51.738945f, 58.967968f, 51.95763f, 57.145798f, 52.0f, 56.0f);
                path.cubicTo(49.00539f, 59.008236f, 45.397095f, 61.968006f, 41.0f, 62.0f);
                path.cubicTo(36.540375f, 62.78345f, 31.83866f, 59.894154f, 31.0f, 55.0f);
                path.cubicTo(28.956001f, 48.92086f, 31.033503f, 41.934193f, 34.0f, 36.0f);
                path.cubicTo(37.434994f, 30.095116f, 44.71122f, 25.464184f, 52.0f, 28.0f);
                path.cubicTo(54.571903f, 28.957516f, 55.605682f, 31.997824f, 57.0f, 34.0f);
                path.cubicTo(57.49432f, 32.722664f, 57.86211f, 30.95083f, 58.0f, 29.0f);
                path.cubicTo(58.846188f, 29.108524f, 60.168236f, 28.967585f, 61.0f, 29.0f);
                path.cubicTo(58.4287f, 36.155594f, 56.589764f, 43.595287f, 54.0f, 51.0f);
                path.cubicTo(53.826385f, 53.45112f, 53.03117f, 56.712906f, 55.0f, 59.0f);
                path.cubicTo(58.28954f, 61.33377f, 62.613525f, 59.98476f, 66.0f, 58.0f);
                path.cubicTo(69.820175f, 55.756516f, 72.08654f, 51.24639f, 73.0f, 47.0f);
                path.cubicTo(74.61135f, 39.961014f, 74.02488f, 32.44078f, 70.0f, 27.0f);
                path.cubicTo(61.052914f, 12.155288f, 38.81668f, 10.000898f, 27.0f, 22.0f);
                path.cubicTo(18.031717f, 29.390408f, 13.956235f, 42.38722f, 17.0f, 54.0f);
                path.cubicTo(19.015799f, 58.615612f, 21.351746f, 63.528427f, 25.0f, 67.0f);
                path.cubicTo(32.176624f, 74.36078f, 43.041267f, 77.33062f, 53.0f, 75.0f);
                path.cubicTo(59.30344f, 73.78695f, 65.20792f, 70.14261f, 70.0f, 65.0f);
                path.cubicTo(70.62533f, 63.6291f, 71.95731f, 64.44455f, 73.0f, 66.0f);
                path.cubicTo(66.997154f, 72.00504f, 59.3432f, 76.927925f, 51.0f, 78.0f);
                path.cubicTo(38.468773f, 79.42461f, 24.910337f, 73.92789f, 19.0f, 63.0f);
                path.cubicTo(10.666028f, 49.353752f, 13.011916f, 30.105183f, 25.0f, 20.0f);
                instancePath.lineTo(25.0f, 20.0f);
                instancePath.close();
                instancePath.moveTo(43.0f, 30.0f);
                path.cubicTo(37.254753f, 32.748024f, 34.166744f, 38.905125f, 33.0f, 45.0f);
                path.cubicTo(31.795235f, 49.12286f, 31.16956f, 54.547215f, 35.0f, 58.0f);
                path.cubicTo(37.708874f, 60.82644f, 42.684f, 60.572014f, 46.0f, 58.0f);
                path.cubicTo(50.77741f, 53.987476f, 53.34066f, 47.677723f, 55.0f, 42.0f);
                path.cubicTo(55.015854f, 38.386097f, 55.51034f, 34.7529f, 53.0f, 32.0f);
                path.cubicTo(51.16089f, 28.656858f, 46.32704f, 28.28031f, 43.0f, 30.0f);
                instancePath.lineTo(43.0f, 30.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
