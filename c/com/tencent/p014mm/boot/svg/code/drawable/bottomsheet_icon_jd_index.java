package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_jd_index */
public class bottomsheet_icon_jd_index extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-8617851);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(69.0f, 73.0f);
        instancePath.cubicTo(69.0f, 75.18871f, 67.16411f, 77.0f, 65.0f, 77.0f);
        instancePath.lineTo(57.0f, 77.0f);
        instancePath.lineTo(57.0f, 57.0f);
        instancePath.lineTo(40.0f, 57.0f);
        instancePath.lineTo(40.0f, 77.0f);
        instancePath.lineTo(32.0f, 77.0f);
        instancePath.cubicTo(29.835434f, 77.0f, 28.0f, 75.18871f, 28.0f, 73.0f);
        instancePath.lineTo(28.0f, 38.0f);
        instancePath.lineTo(49.0f, 18.0f);
        instancePath.lineTo(69.0f, 38.0f);
        instancePath.lineTo(69.0f, 73.0f);
        instancePath.close();
        instancePath.moveTo(52.0f, 9.0f);
        instancePath.lineTo(52.0f, 9.0f);
        Path path = instancePath;
        path.cubicTo(50.78988f, 8.532246f, 49.708397f, 8.0f, 49.0f, 8.0f);
        path.cubicTo(47.291603f, 8.0f, 46.21012f, 8.532246f, 45.0f, 9.0f);
        instancePath.lineTo(45.0f, 9.0f);
        instancePath.lineTo(8.0f, 47.0f);
        instancePath.lineTo(14.0f, 53.0f);
        instancePath.lineTo(20.0f, 46.0f);
        instancePath.lineTo(20.0f, 73.0f);
        instancePath.cubicTo(20.146534f, 79.55686f, 25.5868f, 85.0f, 32.0f, 85.0f);
        instancePath.lineTo(40.0f, 85.0f);
        instancePath.lineTo(57.0f, 85.0f);
        instancePath.lineTo(65.0f, 85.0f);
        instancePath.cubicTo(71.4132f, 85.0f, 76.85346f, 79.55686f, 77.0f, 73.0f);
        instancePath.lineTo(77.0f, 46.0f);
        instancePath.lineTo(83.0f, 53.0f);
        instancePath.lineTo(89.0f, 47.0f);
        instancePath.lineTo(52.0f, 9.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
