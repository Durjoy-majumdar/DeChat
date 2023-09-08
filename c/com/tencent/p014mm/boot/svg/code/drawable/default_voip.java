package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_voip */
public class default_voip extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = 192;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-12206054);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(192.0f, 0.0f);
                instancePath.lineTo(192.0f, 192.0f);
                instancePath.lineTo(0.0f, 192.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(125.05173f, 106.30443f);
                Path path = instancePath2;
                path.cubicTo(134.37202f, 117.3619f, 151.40338f, 137.34488f, 152.32759f, 139.00922f);
                path.cubicTo(156.1268f, 140.24745f, 158.94827f, 137.81317f, 158.94827f, 135.69887f);
                instancePath2.lineTo(158.94827f, 56.250595f);
                Path path2 = instancePath2;
                path2.cubicTo(158.94827f, 53.69053f, 155.8298f, 51.942085f, 152.32759f, 52.94025f);
                path2.cubicTo(150.75885f, 54.967968f, 134.14519f, 74.351326f, 125.05173f, 85.322044f);
                instancePath2.lineTo(125.05173f, 106.30443f);
                instancePath2.lineTo(125.05173f, 106.30443f);
                instancePath2.close();
                instancePath2.moveTo(33.051723f, 67.973175f);
                path2.cubicTo(33.051723f, 61.34662f, 38.431973f, 55.97473f, 45.052055f, 55.97473f);
                instancePath2.lineTo(103.05139f, 55.97473f);
                instancePath2.cubicTo(109.67899f, 55.97473f, 115.05173f, 61.34798f, 115.05173f, 67.973175f);
                instancePath2.lineTo(115.05173f, 123.976295f);
                instancePath2.cubicTo(115.05173f, 130.60284f, 109.67148f, 135.97473f, 103.05139f, 135.97473f);
                instancePath2.lineTo(45.052055f, 135.97473f);
                instancePath2.cubicTo(38.424454f, 135.97473f, 33.051723f, 130.60149f, 33.051723f, 123.976295f);
                instancePath2.lineTo(33.051723f, 67.973175f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
