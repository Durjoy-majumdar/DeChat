package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mm_submenu_normal */
public class mm_submenu_normal extends C24542c {
    private final int height = 38;
    private final int width = 18;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 18;
        }
        if (i == 1) {
            return 38;
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
            instancePaint3.setColor(-6710887);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(10.03f, 6.2841287f, 13.99f, 12.663152f, 18.0f, 19.0f);
            path.cubicTo(13.97f, 25.305216f, 10.03f, 31.673697f, 6.0f, 38.0f);
            instancePath.lineTo(0.0f, 38.0f);
            Path path2 = instancePath;
            path2.cubicTo(3.97f, 31.642065f, 8.0f, 25.326303f, 12.0f, 19.0f);
            path2.cubicTo(8.01f, 12.673696f, 4.04f, 6.336848f, 0.0f, 0.0f);
            instancePath.lineTo(6.0f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
