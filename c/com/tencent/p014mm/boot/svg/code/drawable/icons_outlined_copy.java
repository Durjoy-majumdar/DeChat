package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_copy */
public class icons_outlined_copy extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(37.2f, 9.6f);
            instancePath.lineTo(18.6f, 9.6f);
            instancePath.lineTo(18.6f, 62.4f);
            instancePath.lineTo(56.4f, 62.4f);
            instancePath.lineTo(56.4f, 28.8f);
            instancePath.lineTo(42.0f, 28.8f);
            Path path = instancePath;
            path.cubicTo(39.349033f, 28.8f, 37.2f, 26.650967f, 37.2f, 24.0f);
            instancePath.lineTo(37.2f, 9.6f);
            instancePath.close();
            instancePath.moveTo(40.8f, 9.896984f);
            instancePath.lineTo(40.8f, 24.0f);
            path.cubicTo(40.8f, 24.662743f, 41.337257f, 25.2f, 42.0f, 25.2f);
            instancePath.lineTo(56.10836f, 25.2f);
            instancePath.lineTo(40.8f, 9.896984f);
            instancePath.close();
            instancePath.moveTo(17.987425f, 6.0f);
            instancePath.lineTo(41.993713f, 6.0f);
            instancePath.lineTo(60.0f, 24.0f);
            instancePath.lineTo(60.0f, 63.004063f);
            instancePath.cubicTo(60.0f, 64.66269f, 58.662483f, 66.0f, 57.012573f, 66.0f);
            instancePath.lineTo(17.987425f, 66.0f);
            instancePath.cubicTo(16.34676f, 66.0f, 15.0f, 64.658676f, 15.0f, 63.004063f);
            instancePath.lineTo(15.0f, 8.995937f);
            instancePath.cubicTo(15.0f, 7.33731f, 16.337517f, 6.0f, 17.987425f, 6.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
