package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_liked */
public class game_comment_liked extends C24542c {
    private final int height = 12;
    private final int width = 11;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 11;
        }
        if (i == 1) {
            return 12;
        }
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
            instancePaint3.setColor(-9578023);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(7.48831f, 3.55906f);
            Path path = instancePath;
            path.cubicTo(7.48831f, 2.39232f, 7.39243f, 1.83733f, 7.03533f, 1.31129f);
            path.cubicTo(6.69848f, 0.814971f, 5.84834f, 0.525282f, 5.13666f, 0.855816f);
            path.cubicTo(4.60416f, 1.1031f, 4.50221f, 1.44568f, 4.46811f, 2.40718f);
            path.cubicTo(4.46059f, 2.61919f, 4.45948f, 2.64858f, 4.45506f, 2.74197f);
            path.cubicTo(4.42169f, 3.44731f, 4.39054f, 3.68569f, 4.29879f, 3.92868f);
            path.cubicTo(4.13651f, 4.35778f, 3.92034f, 4.60188f, 3.55349f, 4.81696f);
            path.cubicTo(3.42706f, 4.89109f, 3.32288f, 4.94925f, 3.23028f, 4.99544f);
            instancePath.lineTo(3.23028f, 11.2838f);
            Path path2 = instancePath;
            path2.cubicTo(5.34359f, 11.2933f, 6.55521f, 11.2899f, 6.84967f, 11.2658f);
            path2.cubicTo(6.97794f, 11.2553f, 7.11427f, 11.2487f, 7.25342f, 11.2419f);
            path2.cubicTo(7.79272f, 11.2157f, 8.37451f, 11.1874f, 8.69477f, 10.9236f);
            path2.cubicTo(10.0376f, 9.81825f, 10.7554f, 6.37982f, 10.1836f, 5.10581f);
            path2.cubicTo(10.0235f, 4.74888f, 9.70838f, 4.51042f, 9.29756f, 4.36213f);
            path2.cubicTo(8.96675f, 4.24271f, 7.75612f, 4.16143f, 7.517f, 4.15752f);
            path2.cubicTo(7.44303f, 4.02702f, 7.45309f, 3.94783f, 7.4692f, 3.821f);
            path2.cubicTo(7.47788f, 3.75267f, 7.48831f, 3.67052f, 7.48831f, 3.55906f);
            instancePath.close();
            instancePath.moveTo(2.53028f, 11.2803f);
            instancePath.lineTo(2.53028f, 5.19658f);
            instancePath.cubicTo(2.34959f, 5.22256f, 2.17985f, 5.23338f, 2.00263f, 5.23338f);
            instancePath.lineTo(0.909074f, 5.23338f);
            instancePath.cubicTo(0.410414f, 5.23338f, 0.00390625f, 5.63283f, 0.00390625f, 6.12855f);
            instancePath.lineTo(0.00390625f, 10.3755f);
            Path path3 = instancePath;
            path3.cubicTo(0.00390625f, 10.8691f, 0.405923f, 11.2677f, 0.902313f, 11.2707f);
            path3.cubicTo(1.48731f, 11.2744f, 2.03001f, 11.2776f, 2.53028f, 11.2803f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
