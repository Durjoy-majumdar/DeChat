package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_cellphone */
public class icons_outlined_cellphone extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(15.0f, 9.0f);
            instancePath.cubicTo(15.0f, 7.343146f, 16.343145f, 6.0f, 18.0f, 6.0f);
            instancePath.lineTo(54.0f, 6.0f);
            instancePath.cubicTo(55.656853f, 6.0f, 57.0f, 7.343146f, 57.0f, 9.0f);
            instancePath.lineTo(57.0f, 63.0f);
            instancePath.cubicTo(57.0f, 64.65685f, 55.656853f, 66.0f, 54.0f, 66.0f);
            instancePath.lineTo(18.0f, 66.0f);
            instancePath.cubicTo(16.343145f, 66.0f, 15.0f, 64.65685f, 15.0f, 63.0f);
            instancePath.lineTo(15.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(18.6f, 9.6f);
            instancePath.lineTo(18.6f, 62.4f);
            instancePath.lineTo(53.4f, 62.4f);
            instancePath.lineTo(53.4f, 9.6f);
            instancePath.lineTo(18.6f, 9.6f);
            instancePath.close();
            instancePath.moveTo(36.0f, 60.0f);
            Path path = instancePath;
            path.cubicTo(34.343147f, 60.0f, 33.0f, 58.656853f, 33.0f, 57.0f);
            path.cubicTo(33.0f, 55.343147f, 34.343147f, 54.0f, 36.0f, 54.0f);
            path.cubicTo(37.656853f, 54.0f, 39.0f, 55.343147f, 39.0f, 57.0f);
            path.cubicTo(39.0f, 58.656853f, 37.656853f, 60.0f, 36.0f, 60.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
