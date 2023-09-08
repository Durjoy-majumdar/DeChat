package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_playbtn_white */
public class icons_outlined_playbtn_white extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 32;
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
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(16.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(24.836555f, 0.0f, 32.0f, 7.163444f, 32.0f, 16.0f);
            path.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
            path.cubicTo(7.163444f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
            path.cubicTo(0.0f, 7.163444f, 7.163444f, 0.0f, 16.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(16.0f, 1.0f);
            path.cubicTo(7.7157288f, 1.0f, 1.0f, 7.7157288f, 1.0f, 16.0f);
            path.cubicTo(1.0f, 24.284271f, 7.7157288f, 31.0f, 16.0f, 31.0f);
            path.cubicTo(24.284271f, 31.0f, 31.0f, 24.284271f, 31.0f, 16.0f);
            path.cubicTo(31.0f, 7.7157288f, 24.284271f, 1.0f, 16.0f, 1.0f);
            instancePath.close();
            instancePath.moveTo(12.8f, 10.178544f);
            instancePath.cubicTo(12.939221f, 10.178544f, 13.076033f, 10.214876f, 13.196911f, 10.283949f);
            instancePath.lineTo(21.984459f, 15.305406f);
            Path path2 = instancePath;
            path2.cubicTo(22.368074f, 15.524613f, 22.50135f, 16.013298f, 22.282143f, 16.396912f);
            path2.cubicTo(22.211271f, 16.520937f, 22.108484f, 16.623724f, 21.984459f, 16.694595f);
            instancePath.lineTo(13.196911f, 21.716051f);
            Path path3 = instancePath;
            path3.cubicTo(12.813297f, 21.935259f, 12.324614f, 21.801981f, 12.105406f, 21.418367f);
            path3.cubicTo(12.036332f, 21.29749f, 12.0f, 21.160677f, 12.0f, 21.021456f);
            instancePath.lineTo(12.0f, 10.978543f);
            instancePath.cubicTo(12.0f, 10.5367155f, 12.358172f, 10.178544f, 12.8f, 10.178544f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
