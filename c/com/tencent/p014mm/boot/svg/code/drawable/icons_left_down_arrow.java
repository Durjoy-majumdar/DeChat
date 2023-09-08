package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_left_down_arrow */
public class icons_left_down_arrow extends C24542c {
    private final int height = 17;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 16;
        }
        if (i == 1) {
            return 17;
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
            instancePaint3.setColor(-436207616);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(4.61934f, 13.168f);
            instancePath.lineTo(11.286f, 13.168f);
            instancePath.lineTo(11.286f, 11.8346f);
            instancePath.lineTo(5.5623f, 11.8346f);
            instancePath.lineTo(12.6667f, 4.73021f);
            instancePath.lineTo(11.7239f, 3.78741f);
            instancePath.lineTo(4.61934f, 10.892f);
            instancePath.lineTo(4.61934f, 5.16797f);
            instancePath.lineTo(3.28601f, 5.16797f);
            instancePath.lineTo(3.28601f, 11.8346f);
            instancePath.lineTo(3.28601f, 13.168f);
            instancePath.lineTo(4.61934f, 13.168f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
