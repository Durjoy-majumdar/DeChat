package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_custom_tips_image_bg */
public class scan_custom_tips_image_bg extends C24542c {
    private final int height = 279;
    private final int width = CdnLogic.kGroupNoticeCDNAppType;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return CdnLogic.kGroupNoticeCDNAppType;
        }
        if (i2 == 1) {
            return 279;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-421667363);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(24.0f, 264.0f);
            instancePath.cubicTo(10.745166f, 264.0f, 0.0f, 253.25484f, 0.0f, 240.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.cubicTo(0.0f, 10.745166f, 10.745166f, -2.1316282E-13f, 24.0f, -2.1316282E-13f);
            instancePath.lineTo(240.0f, -2.1316282E-13f);
            Path path = instancePath;
            path.cubicTo(253.25484f, -2.1316282E-13f, 264.0f, 10.745166f, 264.0f, 24.0f);
            instancePath.lineTo(264.0f, 240.0f);
            path.cubicTo(264.0f, 253.25484f, 253.25484f, 264.0f, 240.0f, 264.0f);
            instancePath.lineTo(148.97057f, 264.0f);
            instancePath.lineTo(136.24265f, 276.72794f);
            instancePath.cubicTo(133.89949f, 279.07108f, 130.10051f, 279.07108f, 127.75736f, 276.72794f);
            instancePath.lineTo(115.029434f, 264.0f);
            instancePath.lineTo(24.0f, 264.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
