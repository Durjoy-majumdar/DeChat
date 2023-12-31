package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_tencentmeeting_logo */
public class icons_outlined_tencentmeeting_logo extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.421936f, 23.540632f);
        instancePath.lineTo(30.371902f, 26.590569f);
        instancePath.lineTo(25.19693f, 21.415598f);
        instancePath.lineTo(20.010904f, 26.60172f);
        instancePath.lineTo(15.488806f, 22.079622f);
        instancePath.lineTo(20.33928f, 17.229147f);
        instancePath.lineTo(20.689379f, 16.886322f);
        instancePath.lineTo(20.685791f, 16.882637f);
        instancePath.lineTo(25.19693f, 12.371497f);
        instancePath.lineTo(33.421837f, 20.596403f);
        Path path = instancePath;
        path.cubicTo(34.233562f, 21.40813f, 34.233562f, 22.728907f, 33.421936f, 23.540632f);
        instancePath.lineTo(33.421936f, 23.540632f);
        instancePath.close();
        instancePath.moveTo(6.57815f, 23.54073f);
        path.cubicTo(5.7664237f, 22.728907f, 5.7664237f, 21.40813f, 6.578053f, 20.596403f);
        instancePath.lineTo(14.803057f, 12.371593f);
        instancePath.lineTo(19.314198f, 16.882734f);
        instancePath.lineTo(14.803057f, 21.393873f);
        instancePath.lineTo(9.617321f, 26.579706f);
        instancePath.lineTo(6.57815f, 23.54073f);
        instancePath.close();
        instancePath.moveTo(34.107685f, 19.910656f);
        instancePath.lineTo(25.19693f, 11.0f);
        instancePath.lineTo(20.000042f, 16.196888f);
        instancePath.lineTo(14.803057f, 11.0f);
        instancePath.lineTo(5.8923044f, 19.910656f);
        instancePath.cubicTo(4.702549f, 21.100508f, 4.702549f, 23.036528f, 5.8924017f, 24.226477f);
        instancePath.lineTo(9.617321f, 27.951202f);
        instancePath.lineTo(14.803057f, 22.765371f);
        instancePath.lineTo(20.010904f, 27.973314f);
        instancePath.lineTo(25.19693f, 22.787191f);
        instancePath.lineTo(30.371902f, 27.962065f);
        instancePath.lineTo(34.107685f, 24.22638f);
        instancePath.cubicTo(35.29744f, 23.036528f, 35.29744f, 21.100508f, 34.107685f, 19.910656f);
        instancePath.lineTo(34.107685f, 19.910656f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
