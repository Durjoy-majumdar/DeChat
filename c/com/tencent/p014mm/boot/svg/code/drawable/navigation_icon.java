package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.navigation_icon */
public class navigation_icon extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16268960);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(17.081476f, 2.9393399f);
        instancePath2.lineTo(29.102291f, 14.9601555f);
        Path path = instancePath2;
        path.cubicTo(29.688078f, 15.545941f, 29.688078f, 16.49569f, 29.102291f, 17.081476f);
        instancePath2.lineTo(17.081476f, 29.102291f);
        path.cubicTo(16.49569f, 29.688078f, 15.545941f, 29.688078f, 14.9601555f, 29.102291f);
        instancePath2.lineTo(2.9393399f, 17.081476f);
        path.cubicTo(2.3535533f, 16.49569f, 2.3535533f, 15.545941f, 2.9393399f, 14.9601555f);
        instancePath2.lineTo(14.9601555f, 2.9393399f);
        path.cubicTo(15.545941f, 2.3535533f, 16.49569f, 2.3535533f, 17.081476f, 2.9393399f);
        instancePath2.close();
        instancePath2.moveTo(15.770947f, 10.174019f);
        instancePath2.cubicTo(15.6878195f, 10.101282f, 15.561467f, 10.109706f, 15.488731f, 10.192833f);
        instancePath2.lineTo(12.429484f, 13.689115f);
        Path path2 = instancePath2;
        path2.cubicTo(12.397584f, 13.725573f, 12.38f, 13.77237f, 12.38f, 13.820815f);
        path2.cubicTo(12.38f, 13.9312725f, 12.469543f, 14.020815f, 12.58f, 14.020815f);
        instancePath2.lineTo(14.939246f, 14.020815f);
        instancePath2.lineTo(14.939246f, 21.820816f);
        instancePath2.cubicTo(14.939246f, 21.931273f, 15.0287895f, 22.020815f, 15.139246f, 22.020815f);
        instancePath2.lineTo(16.439247f, 22.020815f);
        instancePath2.lineTo(16.439f, 19.342531f);
        instancePath2.lineTo(16.44344f, 19.227316f);
        instancePath2.cubicTo(16.501554f, 18.429903f, 17.065067f, 18.030796f, 18.133978f, 18.029997f);
        instancePath2.lineTo(16.607f, 18.02053f);
        instancePath2.lineTo(18.939247f, 18.020815f);
        instancePath2.cubicTo(19.049704f, 18.020815f, 19.139246f, 17.931273f, 19.139246f, 17.820816f);
        instancePath2.lineTo(19.139246f, 16.720816f);
        Path path3 = instancePath2;
        path3.cubicTo(19.139246f, 16.61036f, 19.049704f, 16.520815f, 18.939247f, 16.520815f);
        instancePath2.lineTo(16.439f, 16.52053f);
        instancePath2.lineTo(16.439247f, 14.020815f);
        instancePath2.lineTo(18.698492f, 14.020815f);
        path3.cubicTo(18.746937f, 14.020815f, 18.793736f, 14.003232f, 18.830194f, 13.971331f);
        path3.cubicTo(18.91332f, 13.898594f, 18.921745f, 13.772242f, 18.849009f, 13.689115f);
        instancePath2.lineTo(15.789762f, 10.192833f);
        instancePath2.cubicTo(15.783915f, 10.186151f, 15.77763f, 10.179865f, 15.770947f, 10.174019f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
