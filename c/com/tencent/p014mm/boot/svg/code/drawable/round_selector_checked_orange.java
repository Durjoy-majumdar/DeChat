package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.round_selector_checked_orange */
public class round_selector_checked_orange extends C24542c {
    private final int height = 49;
    private final int width = 56;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 56;
        }
        if (i == 1) {
            return 49;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-27648);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(52.0f, 0.0f);
            instancePath.cubicTo(53.5f, 1.0525777f, 54.73f, 2.1051555f, 56.0f, 3.0f);
            instancePath.lineTo(56.0f, 5.0f);
            Path path = instancePath;
            path.cubicTo(53.09f, 7.1074057f, 50.94f, 10.395458f, 49.0f, 13.0f);
            path.cubicTo(39.47f, 25.301964f, 30.39f, 37.161007f, 21.0f, 49.0f);
            path.cubicTo(13.57f, 41.7723f, 7.51f, 33.00082f, 0.0f, 26.0f);
            instancePath.lineTo(0.0f, 24.0f);
            Path path2 = instancePath;
            path2.cubicTo(0.87f, 22.956219f, 1.72f, 21.643003f, 3.0f, 20.0f);
            path2.cubicTo(8.66f, 25.121523f, 14.88f, 29.762888f, 21.0f, 34.0f);
            path2.cubicTo(31.45f, 22.986294f, 41.91f, 11.538257f, 52.0f, 0.0f);
            instancePath.lineTo(52.0f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
