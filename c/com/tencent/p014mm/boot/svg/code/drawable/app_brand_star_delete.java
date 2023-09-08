package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_star_delete */
public class app_brand_star_delete extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 20;
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
            instancePaint3.setColor(-372399);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(10.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
            path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
            path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
            path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(14.0f, 9.5f);
            instancePath.lineTo(6.0f, 9.5f);
            path.cubicTo(5.7238574f, 9.5f, 5.5f, 9.723858f, 5.5f, 10.0f);
            path.cubicTo(5.5f, 10.276142f, 5.7238574f, 10.5f, 6.0f, 10.5f);
            instancePath.lineTo(6.0f, 10.5f);
            instancePath.lineTo(14.0f, 10.5f);
            Path path2 = instancePath;
            path2.cubicTo(14.276142f, 10.5f, 14.5f, 10.276142f, 14.5f, 10.0f);
            path2.cubicTo(14.5f, 9.723858f, 14.276142f, 9.5f, 14.0f, 9.5f);
            instancePath.lineTo(14.0f, 9.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
