package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_play2 */
public class icons_filled_play2 extends C24542c {
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
                instancePath.moveTo(36.0f, 6.0f);
                Path path = instancePath;
                path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(31.5f, 24.912743f);
                instancePath.cubicTo(30.671574f, 24.912743f, 30.0f, 25.584316f, 30.0f, 26.412743f);
                instancePath.lineTo(30.0f, 45.587257f);
                Path path2 = instancePath;
                path2.cubicTo(30.0f, 45.868385f, 30.079004f, 46.14386f, 30.228003f, 46.382256f);
                path2.cubicTo(30.667068f, 47.08476f, 31.592493f, 47.29832f, 32.295f, 46.859253f);
                instancePath.lineTo(47.63461f, 37.272f);
                Path path3 = instancePath;
                path3.cubicTo(47.827763f, 37.151276f, 47.990887f, 36.98815f, 48.11161f, 36.795f);
                path3.cubicTo(48.550674f, 36.092495f, 48.337116f, 35.16707f, 47.63461f, 34.728f);
                instancePath.lineTo(32.295f, 25.140745f);
                instancePath.cubicTo(32.056602f, 24.991747f, 31.78113f, 24.912743f, 31.5f, 24.912743f);
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
