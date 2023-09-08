package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.dialog_successful_icon */
public class dialog_successful_icon extends C24542c {
    private final int height = 270;
    private final int width = 270;

    public int doCommand(int i, Object... objArr) {
        int i2 = 270;
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
                instancePaint3.setColor(14211288);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(270.0f, 0.0f);
                instancePath.lineTo(270.0f, 270.0f);
                instancePath.lineTo(0.0f, 270.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-15028967);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(63.314346f, 140.34763f);
                instancePath2.cubicTo(62.933258f, 139.95532f, 62.89317f, 139.27344f, 63.224213f, 138.8254f);
                instancePath2.lineTo(69.83471f, 129.87872f);
                instancePath2.cubicTo(70.16602f, 129.43033f, 70.79083f, 129.3384f, 71.22918f, 129.67256f);
                instancePath2.lineTo(108.10534f, 157.78488f);
                instancePath2.cubicTo(108.54417f, 158.11943f, 109.244865f, 158.1048f, 109.66647f, 157.75543f);
                instancePath2.lineTo(198.3778f, 84.246925f);
                instancePath2.cubicTo(198.80116f, 83.89612f, 199.4602f, 83.922f, 199.85126f, 84.30612f);
                instancePath2.lineTo(206.24776f, 90.58951f);
                instancePath2.cubicTo(206.63817f, 90.97301f, 206.63751f, 91.59433f, 206.23552f, 91.98784f);
                instancePath2.lineTo(109.616165f, 186.56723f);
                instancePath2.cubicTo(109.219f, 186.956f, 108.58932f, 186.95439f, 108.20701f, 186.56084f);
                instancePath2.lineTo(63.314346f, 140.34763f);
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
