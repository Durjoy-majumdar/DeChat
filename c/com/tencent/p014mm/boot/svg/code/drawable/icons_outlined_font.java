package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_font */
public class icons_outlined_font extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(34.450928f, 52.877197f);
            instancePath.lineTo(30.94629f, 42.89502f);
            instancePath.lineTo(17.072754f, 42.89502f);
            instancePath.lineTo(13.568115f, 52.877197f);
            instancePath.lineTo(9.0f, 52.877197f);
            instancePath.lineTo(21.858398f, 18.0f);
            instancePath.lineTo(26.160645f, 18.0f);
            instancePath.lineTo(39.019043f, 52.877197f);
            instancePath.lineTo(34.450928f, 52.877197f);
            instancePath.close();
            instancePath.moveTo(23.937012f, 23.293213f);
            instancePath.lineTo(18.35376f, 39.19702f);
            instancePath.lineTo(29.665283f, 39.19702f);
            instancePath.lineTo(24.082031f, 23.293213f);
            instancePath.lineTo(23.937012f, 23.293213f);
            instancePath.close();
            instancePath.moveTo(50.983154f, 49.46924f);
            instancePath.cubicTo(55.23706f, 49.46924f, 58.35498f, 46.713867f, 58.35498f, 42.96753f);
            instancePath.lineTo(58.35498f, 40.864746f);
            instancePath.lineTo(51.539062f, 41.299805f);
            Path path = instancePath;
            path.cubicTo(47.623535f, 41.541504f, 45.59326f, 42.96753f, 45.59326f, 45.4812f);
            path.cubicTo(45.59326f, 47.898193f, 47.696045f, 49.46924f, 50.983154f, 49.46924f);
            instancePath.close();
            instancePath.moveTo(50.088867f, 53.118896f);
            Path path2 = instancePath;
            path2.cubicTo(44.795654f, 53.118896f, 41.291016f, 50.073486f, 41.291016f, 45.45703f);
            path2.cubicTo(41.291016f, 40.985596f, 44.723145f, 38.351074f, 51.055664f, 37.964355f);
            instancePath.lineTo(58.35498f, 37.529297f);
            instancePath.lineTo(58.35498f, 35.354004f);
            Path path3 = instancePath;
            path3.cubicTo(58.35498f, 32.115234f, 56.228027f, 30.32666f, 52.38501f, 30.32666f);
            path3.cubicTo(49.36377f, 30.32666f, 47.115967f, 31.873535f, 46.6084f, 34.338867f);
            instancePath.lineTo(42.57202f, 34.338867f);
            Path path4 = instancePath;
            path4.cubicTo(42.69287f, 29.939941f, 46.970947f, 26.580322f, 52.43335f, 26.580322f);
            path4.cubicTo(58.59668f, 26.580322f, 62.560547f, 29.867432f, 62.560547f, 34.991455f);
            instancePath.lineTo(62.560547f, 52.877197f);
            instancePath.lineTo(58.57251f, 52.877197f);
            instancePath.lineTo(58.57251f, 48.35742f);
            instancePath.lineTo(58.47583f, 48.35742f);
            instancePath.cubicTo(57.001465f, 51.257812f, 53.738525f, 53.118896f, 50.088867f, 53.118896f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
