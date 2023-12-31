package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_minifund */
public class icons_outlined_pay_minifund extends C24542c {
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
            instancePath.moveTo(52.94049f, 12.0f);
            instancePath.cubicTo(53.41302f, 12.0f, 53.860718f, 12.206798f, 54.160633f, 12.563604f);
            instancePath.lineTo(65.6412f, 26.221878f);
            instancePath.cubicTo(66.10245f, 26.770628f, 66.12082f, 27.556149f, 65.68569f, 28.124908f);
            instancePath.lineTo(37.183323f, 65.38092f);
            instancePath.cubicTo(36.550747f, 66.20777f, 35.281704f, 66.20607f, 34.65145f, 65.37753f);
            instancePath.lineTo(6.311719f, 28.121517f);
            instancePath.cubicTo(5.888169f, 27.564709f, 5.897053f, 26.800133f, 6.333432f, 26.252865f);
            instancePath.lineTo(17.224245f, 12.594592f);
            instancePath.cubicTo(17.523424f, 12.219389f, 17.982986f, 12.0f, 18.46976f, 12.0f);
            instancePath.lineTo(52.94049f, 12.0f);
            instancePath.close();
            instancePath.moveTo(46.441f, 28.971f);
            instancePath.lineTo(25.565f, 28.971f);
            instancePath.lineTo(36.0f, 59.577f);
            instancePath.lineTo(46.441f, 28.971f);
            instancePath.close();
            instancePath.moveTo(22.236f, 28.971f);
            instancePath.lineTo(10.893f, 28.971f);
            instancePath.lineTo(31.45f, 55.997f);
            instancePath.lineTo(22.236f, 28.971f);
            instancePath.close();
            instancePath.moveTo(61.095f, 28.971f);
            instancePath.lineTo(49.769f, 28.971f);
            instancePath.lineTo(40.655f, 55.689f);
            instancePath.lineTo(61.095f, 28.971f);
            instancePath.close();
            instancePath.moveTo(27.258f, 15.085f);
            instancePath.lineTo(19.241161f, 15.085714f);
            instancePath.lineTo(10.63f, 25.885f);
            instancePath.lineTo(22.348f, 25.885f);
            instancePath.lineTo(27.258f, 15.085f);
            instancePath.close();
            instancePath.moveTo(41.289f, 15.085f);
            instancePath.lineTo(30.714f, 15.085f);
            instancePath.lineTo(25.804f, 25.885f);
            instancePath.lineTo(46.202f, 25.885f);
            instancePath.lineTo(41.289f, 15.085f);
            instancePath.close();
            instancePath.moveTo(52.194088f, 15.085714f);
            instancePath.lineTo(44.745f, 15.085f);
            instancePath.lineTo(49.657f, 25.885f);
            instancePath.lineTo(61.272f, 25.885f);
            instancePath.lineTo(52.194088f, 15.085714f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
