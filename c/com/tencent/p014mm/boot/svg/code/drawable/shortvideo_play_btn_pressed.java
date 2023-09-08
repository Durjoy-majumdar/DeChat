package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shortvideo_play_btn_pressed */
public class shortvideo_play_btn_pressed extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(637534208);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(60.0f, 0.0f);
            Path path2 = instancePath2;
            path2.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            path2.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path2.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path2.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(60.0f, 3.6f);
            Path path3 = instancePath2;
            path3.cubicTo(28.851141f, 3.6f, 3.6f, 28.851141f, 3.6f, 60.0f);
            path3.cubicTo(3.6f, 91.14886f, 28.851141f, 116.4f, 60.0f, 116.4f);
            path3.cubicTo(91.14886f, 116.4f, 116.4f, 91.14886f, 116.4f, 60.0f);
            path3.cubicTo(116.4f, 28.851141f, 91.14886f, 3.6f, 60.0f, 3.6f);
            instancePath2.close();
            instancePath2.moveTo(48.0f, 38.16954f);
            instancePath2.cubicTo(48.52208f, 38.16954f, 49.035122f, 38.305786f, 49.48842f, 38.564808f);
            instancePath2.lineTo(82.44173f, 57.39527f);
            Path path4 = instancePath2;
            path4.cubicTo(83.88028f, 58.2173f, 84.380066f, 60.049866f, 83.55804f, 61.48842f);
            path4.cubicTo(83.29227f, 61.95351f, 82.906815f, 62.338963f, 82.44173f, 62.60473f);
            instancePath2.lineTo(49.48842f, 81.43519f);
            Path path5 = instancePath2;
            path5.cubicTo(48.049866f, 82.25722f, 46.2173f, 81.75743f, 45.39527f, 80.31888f);
            path5.cubicTo(45.136246f, 79.865585f, 45.0f, 79.35254f, 45.0f, 78.83046f);
            instancePath2.lineTo(45.0f, 41.16954f);
            instancePath2.cubicTo(45.0f, 39.512684f, 46.343147f, 38.16954f, 48.0f, 38.16954f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(419430400);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(60.0f, 0.0f);
            Path path6 = instancePath3;
            path6.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            path6.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path6.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path6.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
