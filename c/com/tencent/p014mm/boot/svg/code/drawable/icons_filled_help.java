package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_help */
public class icons_filled_help extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 66.0f);
                Path path = instancePath;
                path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                instancePath.close();
                instancePath.moveTo(27.0f, 29.34668f);
                instancePath.lineTo(31.819336f, 29.34668f);
                Path path2 = instancePath;
                path2.cubicTo(31.983398f, 26.80371f, 33.685547f, 25.183594f, 36.331055f, 25.183594f);
                path2.cubicTo(38.91504f, 25.183594f, 40.637695f, 26.762695f, 40.637695f, 28.936523f);
                path2.cubicTo(40.637695f, 30.966797f, 39.776367f, 32.07422f, 37.2334f, 33.612305f);
                path2.cubicTo(34.40332f, 35.273438f, 33.213867f, 37.11914f, 33.398438f, 40.154297f);
                instancePath.lineTo(33.418945f, 41.61035f);
                instancePath.lineTo(38.176758f, 41.61035f);
                instancePath.lineTo(38.176758f, 40.4209f);
                Path path3 = instancePath;
                path3.cubicTo(38.176758f, 38.370117f, 38.935547f, 37.30371f, 41.62207f, 35.745117f);
                path3.cubicTo(44.411133f, 34.083984f, 45.969727f, 31.889648f, 45.969727f, 28.751953f);
                path3.cubicTo(45.969727f, 24.240234f, 42.216797f, 21.0f, 36.597656f, 21.0f);
                path3.cubicTo(30.506836f, 21.0f, 27.164062f, 24.527344f, 27.0f, 29.34668f);
                instancePath.close();
                instancePath.moveTo(35.859375f, 51.249023f);
                Path path4 = instancePath;
                path4.cubicTo(37.520508f, 51.249023f, 38.833008f, 49.95703f, 38.833008f, 48.336914f);
                path4.cubicTo(38.833008f, 46.716797f, 37.520508f, 45.445312f, 35.859375f, 45.445312f);
                path4.cubicTo(34.198242f, 45.445312f, 32.865234f, 46.716797f, 32.865234f, 48.336914f);
                path4.cubicTo(32.865234f, 49.95703f, 34.198242f, 51.249023f, 35.859375f, 51.249023f);
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
