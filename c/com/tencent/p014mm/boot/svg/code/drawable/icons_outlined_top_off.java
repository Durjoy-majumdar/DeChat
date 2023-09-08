package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_top_off */
public class icons_outlined_top_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(7.408529f, 9.105f);
        instancePath.lineTo(8.256529f, 9.953f);
        instancePath.lineTo(6.412f, 11.799f);
        instancePath.lineTo(9.2f, 11.8f);
        instancePath.lineTo(9.2f, 20.8f);
        instancePath.lineTo(14.8f, 20.8f);
        instancePath.lineTo(14.799529f, 16.496f);
        instancePath.lineTo(15.999529f, 17.696f);
        instancePath.lineTo(16.0f, 21.0f);
        instancePath.cubicTo(16.0f, 21.552284f, 15.552284f, 22.0f, 15.0f, 22.0f);
        instancePath.lineTo(9.0f, 22.0f);
        instancePath.cubicTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f);
        instancePath.lineTo(8.0f, 13.0f);
        instancePath.lineTo(5.928932f, 13.0f);
        Path path = instancePath;
        path.cubicTo(5.3766475f, 13.0f, 4.928932f, 12.552284f, 4.928932f, 12.0f);
        path.cubicTo(4.928932f, 11.734783f, 5.034289f, 11.48043f, 5.2218256f, 11.292893f);
        instancePath.lineTo(7.408529f, 9.105f);
        instancePath.close();
        instancePath.moveTo(4.697057f, 3.0f);
        instancePath.lineTo(9.105529f, 7.408f);
        instancePath.lineTo(11.292893f, 5.2218256f);
        instancePath.cubicTo(11.683417f, 4.831301f, 12.316583f, 4.831301f, 12.707107f, 5.2218256f);
        instancePath.lineTo(18.778175f, 11.292893f);
        Path path2 = instancePath;
        path2.cubicTo(19.1687f, 11.683417f, 19.1687f, 12.316583f, 18.778175f, 12.707107f);
        path2.cubicTo(18.59064f, 12.894643f, 18.336285f, 13.0f, 18.071068f, 13.0f);
        instancePath.lineTo(16.0f, 13.0f);
        instancePath.lineTo(15.999529f, 14.302f);
        instancePath.lineTo(21.424978f, 19.727922f);
        instancePath.lineTo(20.57645f, 20.57645f);
        instancePath.lineTo(3.8485286f, 3.8485281f);
        instancePath.lineTo(4.697057f, 3.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 6.212f);
        instancePath.lineTo(9.953528f, 8.257f);
        instancePath.lineTo(14.799529f, 13.102f);
        instancePath.lineTo(14.8f, 11.8f);
        instancePath.lineTo(17.588f, 11.8f);
        instancePath.lineTo(12.0f, 6.212f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
