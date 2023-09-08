package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_star */
public class icons_filled_star extends C24542c {
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
        instancePath.moveTo(36.0f, 55.5f);
        instancePath.lineTo(21.983503f, 62.868908f);
        Path path = instancePath;
        path.cubicTo(20.51697f, 63.63991f, 18.703089f, 63.076073f, 17.932085f, 61.60954f);
        path.cubicTo(17.625069f, 61.025555f, 17.519125f, 60.35665f, 17.630655f, 59.70638f);
        instancePath.lineTo(20.307568f, 44.09878f);
        instancePath.lineTo(8.967983f, 33.045418f);
        Path path2 = instancePath;
        path2.cubicTo(7.781533f, 31.888914f, 7.7572556f, 29.989574f, 8.913759f, 28.803123f);
        path2.cubicTo(9.374285f, 28.330673f, 9.977713f, 28.02321f, 10.630624f, 27.928337f);
        instancePath.lineTo(26.301544f, 25.65122f);
        instancePath.lineTo(33.30979f, 11.450957f);
        Path path3 = instancePath;
        path3.cubicTo(34.04306f, 9.965197f, 35.841938f, 9.355179f, 37.327698f, 10.088447f);
        path3.cubicTo(37.919334f, 10.380437f, 38.398216f, 10.85932f, 38.69021f, 11.450957f);
        instancePath.lineTo(45.698456f, 25.65122f);
        instancePath.lineTo(61.369377f, 27.928337f);
        Path path4 = instancePath;
        path4.cubicTo(63.00901f, 28.16659f, 64.14506f, 29.68892f, 63.906803f, 31.328554f);
        path4.cubicTo(63.811928f, 31.981464f, 63.504467f, 32.584892f, 63.032017f, 33.045418f);
        instancePath.lineTo(51.692432f, 44.09878f);
        instancePath.lineTo(54.369347f, 59.70638f);
        Path path5 = instancePath;
        path5.cubicTo(54.64943f, 61.33939f, 53.552666f, 62.890255f, 51.919655f, 63.170338f);
        path5.cubicTo(51.269382f, 63.281868f, 50.60048f, 63.175926f, 50.0165f, 62.868908f);
        instancePath.lineTo(36.0f, 55.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
