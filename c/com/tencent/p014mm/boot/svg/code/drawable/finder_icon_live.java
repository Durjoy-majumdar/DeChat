package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_live */
public class finder_icon_live extends C24542c {
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(36.0f, 6.0f);
            Path path = instancePath2;
            path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            instancePath2.close();
            instancePath2.moveTo(36.0f, 10.5f);
            Path path2 = instancePath2;
            path2.cubicTo(21.916739f, 10.5f, 10.5f, 21.916739f, 10.5f, 36.0f);
            path2.cubicTo(10.5f, 50.08326f, 21.916739f, 61.5f, 36.0f, 61.5f);
            path2.cubicTo(50.08326f, 61.5f, 61.5f, 50.08326f, 61.5f, 36.0f);
            path2.cubicTo(61.5f, 21.916739f, 50.08326f, 10.5f, 36.0f, 10.5f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(36.0f, 19.5f);
            Path path3 = instancePath3;
            path3.cubicTo(45.112698f, 19.5f, 52.5f, 26.887302f, 52.5f, 36.0f);
            path3.cubicTo(52.5f, 45.112698f, 45.112698f, 52.5f, 36.0f, 52.5f);
            path3.cubicTo(26.887302f, 52.5f, 19.5f, 45.112698f, 19.5f, 36.0f);
            path3.cubicTo(19.5f, 26.887302f, 26.887302f, 19.5f, 36.0f, 19.5f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
