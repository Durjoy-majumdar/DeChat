package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_hb_card_share_icon */
public class sns_ad_hb_card_share_icon extends C24542c {
    private final int height = 17;
    private final int width = 17;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 17;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.38f, 9.20004f);
        instancePath.lineTo(9.38f, 1.80925f);
        instancePath.lineTo(11.0496f, 3.47886f);
        instancePath.lineTo(11.7284f, 2.80003f);
        instancePath.lineTo(9.46569f, 0.537293f);
        instancePath.cubicTo(9.15327f, 0.224874f, 8.64673f, 0.224874f, 8.33431f, 0.537293f);
        instancePath.lineTo(6.07157f, 2.80003f);
        instancePath.lineTo(6.7504f, 3.47886f);
        instancePath.lineTo(8.42f, 1.80926f);
        instancePath.lineTo(8.42f, 9.20004f);
        instancePath.lineTo(9.38f, 9.20004f);
        instancePath.close();
        instancePath.moveTo(12.1f, 4.96003f);
        instancePath.lineTo(14.34f, 4.96003f);
        instancePath.lineTo(14.34f, 15.04f);
        instancePath.lineTo(3.46f, 15.04f);
        instancePath.lineTo(3.46f, 4.96003f);
        instancePath.lineTo(5.7f, 4.96003f);
        instancePath.lineTo(5.7f, 4.00003f);
        instancePath.lineTo(3.29917f, 4.00003f);
        instancePath.cubicTo(2.8578f, 4.00003f, 2.5f, 4.35917f, 2.5f, 4.79668f);
        instancePath.lineTo(2.5f, 15.2034f);
        instancePath.cubicTo(2.5f, 15.6434f, 2.85914f, 16.0f, 3.29665f, 16.0f);
        instancePath.lineTo(14.5034f, 16.0f);
        instancePath.cubicTo(14.9433f, 16.0f, 15.3f, 15.6409f, 15.3f, 15.2034f);
        instancePath.lineTo(15.3f, 4.79668f);
        instancePath.cubicTo(15.3f, 4.35671f, 14.9407f, 4.00003f, 14.5008f, 4.00003f);
        instancePath.lineTo(12.1f, 4.00003f);
        instancePath.lineTo(12.1f, 4.96003f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(9.38f, 1.80925f);
        instancePath2.lineTo(9.52142f, 1.66783f);
        instancePath2.lineTo(9.18f, 1.32641f);
        instancePath2.lineTo(9.18f, 1.80925f);
        instancePath2.lineTo(9.38f, 1.80925f);
        instancePath2.close();
        instancePath2.moveTo(9.38f, 9.20004f);
        instancePath2.lineTo(9.38f, 9.40003f);
        instancePath2.lineTo(9.58f, 9.40003f);
        instancePath2.lineTo(9.58f, 9.20004f);
        instancePath2.lineTo(9.38f, 9.20004f);
        instancePath2.close();
        instancePath2.moveTo(11.0496f, 3.47886f);
        instancePath2.lineTo(10.9082f, 3.62028f);
        instancePath2.lineTo(11.0496f, 3.7617f);
        instancePath2.lineTo(11.191f, 3.62028f);
        instancePath2.lineTo(11.0496f, 3.47886f);
        instancePath2.close();
        instancePath2.moveTo(11.7284f, 2.80003f);
        instancePath2.lineTo(11.8698f, 2.94146f);
        instancePath2.lineTo(12.0113f, 2.80003f);
        instancePath2.lineTo(11.8698f, 2.65861f);
        instancePath2.lineTo(11.7284f, 2.80003f);
        instancePath2.close();
        instancePath2.moveTo(9.46569f, 0.537293f);
        instancePath2.lineTo(9.32426f, 0.678714f);
        instancePath2.lineTo(9.46569f, 0.537293f);
        instancePath2.close();
        instancePath2.moveTo(8.33431f, 0.537293f);
        instancePath2.lineTo(8.19289f, 0.395872f);
        instancePath2.lineTo(8.19289f, 0.395872f);
        instancePath2.lineTo(8.33431f, 0.537293f);
        instancePath2.close();
        instancePath2.moveTo(6.07157f, 2.80003f);
        instancePath2.lineTo(5.93015f, 2.65861f);
        instancePath2.lineTo(5.78873f, 2.80003f);
        instancePath2.lineTo(5.93015f, 2.94146f);
        instancePath2.lineTo(6.07157f, 2.80003f);
        instancePath2.close();
        instancePath2.moveTo(6.7504f, 3.47886f);
        instancePath2.lineTo(6.60897f, 3.62028f);
        instancePath2.lineTo(6.7504f, 3.7617f);
        instancePath2.lineTo(6.89182f, 3.62028f);
        instancePath2.lineTo(6.7504f, 3.47886f);
        instancePath2.close();
        instancePath2.moveTo(8.42f, 1.80926f);
        instancePath2.lineTo(8.62f, 1.80926f);
        instancePath2.lineTo(8.62f, 1.32641f);
        instancePath2.lineTo(8.27857f, 1.66784f);
        instancePath2.lineTo(8.42f, 1.80926f);
        instancePath2.close();
        instancePath2.moveTo(8.42f, 9.20004f);
        instancePath2.lineTo(8.22f, 9.20004f);
        instancePath2.lineTo(8.22f, 9.40003f);
        instancePath2.lineTo(8.42f, 9.40003f);
        instancePath2.lineTo(8.42f, 9.20004f);
        instancePath2.close();
        instancePath2.moveTo(14.34f, 4.96003f);
        instancePath2.lineTo(14.54f, 4.96003f);
        instancePath2.lineTo(14.54f, 4.76004f);
        instancePath2.lineTo(14.34f, 4.76004f);
        instancePath2.lineTo(14.34f, 4.96003f);
        instancePath2.close();
        instancePath2.moveTo(12.1f, 4.96003f);
        instancePath2.lineTo(11.9f, 4.96003f);
        instancePath2.lineTo(11.9f, 5.16003f);
        instancePath2.lineTo(12.1f, 5.16003f);
        instancePath2.lineTo(12.1f, 4.96003f);
        instancePath2.close();
        instancePath2.moveTo(14.34f, 15.04f);
        instancePath2.lineTo(14.34f, 15.24f);
        instancePath2.lineTo(14.54f, 15.24f);
        instancePath2.lineTo(14.54f, 15.04f);
        instancePath2.lineTo(14.34f, 15.04f);
        instancePath2.close();
        instancePath2.moveTo(3.46f, 15.04f);
        instancePath2.lineTo(3.26f, 15.04f);
        instancePath2.lineTo(3.26f, 15.24f);
        instancePath2.lineTo(3.46f, 15.24f);
        instancePath2.lineTo(3.46f, 15.04f);
        instancePath2.close();
        instancePath2.moveTo(3.46f, 4.96003f);
        instancePath2.lineTo(3.46f, 4.76004f);
        instancePath2.lineTo(3.26f, 4.76004f);
        instancePath2.lineTo(3.26f, 4.96003f);
        instancePath2.lineTo(3.46f, 4.96003f);
        instancePath2.close();
        instancePath2.moveTo(5.7f, 4.96003f);
        instancePath2.lineTo(5.7f, 5.16003f);
        instancePath2.lineTo(5.9f, 5.16003f);
        instancePath2.lineTo(5.9f, 4.96003f);
        instancePath2.lineTo(5.7f, 4.96003f);
        instancePath2.close();
        instancePath2.moveTo(5.7f, 4.00003f);
        instancePath2.lineTo(5.9f, 4.00003f);
        instancePath2.lineTo(5.9f, 3.80003f);
        instancePath2.lineTo(5.7f, 3.80003f);
        instancePath2.lineTo(5.7f, 4.00003f);
        instancePath2.close();
        instancePath2.moveTo(12.1f, 4.00003f);
        instancePath2.lineTo(12.1f, 3.80003f);
        instancePath2.lineTo(11.9f, 3.80003f);
        instancePath2.lineTo(11.9f, 4.00003f);
        instancePath2.lineTo(12.1f, 4.00003f);
        instancePath2.close();
        instancePath2.moveTo(9.18f, 1.80925f);
        instancePath2.lineTo(9.18f, 9.20004f);
        instancePath2.lineTo(9.58f, 9.20004f);
        instancePath2.lineTo(9.58f, 1.80925f);
        instancePath2.lineTo(9.18f, 1.80925f);
        instancePath2.close();
        instancePath2.moveTo(11.191f, 3.33744f);
        instancePath2.lineTo(9.52142f, 1.66783f);
        instancePath2.lineTo(9.23857f, 1.95067f);
        instancePath2.lineTo(10.9082f, 3.62028f);
        instancePath2.lineTo(11.191f, 3.33744f);
        instancePath2.close();
        instancePath2.moveTo(11.587f, 2.65861f);
        instancePath2.lineTo(10.9082f, 3.33744f);
        instancePath2.lineTo(11.191f, 3.62028f);
        instancePath2.lineTo(11.8698f, 2.94146f);
        instancePath2.lineTo(11.587f, 2.65861f);
        instancePath2.close();
        instancePath2.moveTo(9.32426f, 0.678714f);
        instancePath2.lineTo(11.587f, 2.94146f);
        instancePath2.lineTo(11.8698f, 2.65861f);
        instancePath2.lineTo(9.60711f, 0.395872f);
        instancePath2.lineTo(9.32426f, 0.678714f);
        instancePath2.close();
        instancePath2.moveTo(8.47574f, 0.678715f);
        instancePath2.cubicTo(8.71005f, 0.4444f, 9.08995f, 0.4444f, 9.32426f, 0.678714f);
        instancePath2.lineTo(9.60711f, 0.395872f);
        instancePath2.cubicTo(9.21658f, 0.00534737f, 8.58342f, 0.00534752f, 8.19289f, 0.395872f);
        instancePath2.lineTo(8.47574f, 0.678715f);
        instancePath2.close();
        instancePath2.moveTo(6.21299f, 2.94146f);
        instancePath2.lineTo(8.47574f, 0.678714f);
        instancePath2.lineTo(8.19289f, 0.395872f);
        instancePath2.lineTo(5.93015f, 2.65861f);
        instancePath2.lineTo(6.21299f, 2.94146f);
        instancePath2.close();
        instancePath2.moveTo(6.89182f, 3.33744f);
        instancePath2.lineTo(6.21299f, 2.65861f);
        instancePath2.lineTo(5.93015f, 2.94146f);
        instancePath2.lineTo(6.60897f, 3.62028f);
        instancePath2.lineTo(6.89182f, 3.33744f);
        instancePath2.close();
        instancePath2.moveTo(8.27857f, 1.66784f);
        instancePath2.lineTo(6.60897f, 3.33744f);
        instancePath2.lineTo(6.89182f, 3.62028f);
        instancePath2.lineTo(8.56142f, 1.95068f);
        instancePath2.lineTo(8.27857f, 1.66784f);
        instancePath2.close();
        instancePath2.moveTo(8.62f, 9.20004f);
        instancePath2.lineTo(8.62f, 1.80926f);
        instancePath2.lineTo(8.22f, 1.80926f);
        instancePath2.lineTo(8.22f, 9.20004f);
        instancePath2.lineTo(8.62f, 9.20004f);
        instancePath2.close();
        instancePath2.moveTo(9.38f, 9.00004f);
        instancePath2.lineTo(8.42f, 9.00004f);
        instancePath2.lineTo(8.42f, 9.40003f);
        instancePath2.lineTo(9.38f, 9.40003f);
        instancePath2.lineTo(9.38f, 9.00004f);
        instancePath2.close();
        instancePath2.moveTo(14.34f, 4.76004f);
        instancePath2.lineTo(12.1f, 4.76004f);
        instancePath2.lineTo(12.1f, 5.16003f);
        instancePath2.lineTo(14.34f, 5.16003f);
        instancePath2.lineTo(14.34f, 4.76004f);
        instancePath2.close();
        instancePath2.moveTo(14.54f, 15.04f);
        instancePath2.lineTo(14.54f, 4.96003f);
        instancePath2.lineTo(14.14f, 4.96003f);
        instancePath2.lineTo(14.14f, 15.04f);
        instancePath2.lineTo(14.54f, 15.04f);
        instancePath2.close();
        instancePath2.moveTo(3.46f, 15.24f);
        instancePath2.lineTo(14.34f, 15.24f);
        instancePath2.lineTo(14.34f, 14.84f);
        instancePath2.lineTo(3.46f, 14.84f);
        instancePath2.lineTo(3.46f, 15.24f);
        instancePath2.close();
        instancePath2.moveTo(3.26f, 4.96003f);
        instancePath2.lineTo(3.26f, 15.04f);
        instancePath2.lineTo(3.66f, 15.04f);
        instancePath2.lineTo(3.66f, 4.96003f);
        instancePath2.lineTo(3.26f, 4.96003f);
        instancePath2.close();
        instancePath2.moveTo(5.7f, 4.76004f);
        instancePath2.lineTo(3.46f, 4.76004f);
        instancePath2.lineTo(3.46f, 5.16003f);
        instancePath2.lineTo(5.7f, 5.16003f);
        instancePath2.lineTo(5.7f, 4.76004f);
        instancePath2.close();
        instancePath2.moveTo(5.5f, 4.00003f);
        instancePath2.lineTo(5.5f, 4.96003f);
        instancePath2.lineTo(5.9f, 4.96003f);
        instancePath2.lineTo(5.9f, 4.00003f);
        instancePath2.lineTo(5.5f, 4.00003f);
        instancePath2.close();
        instancePath2.moveTo(3.29917f, 4.20003f);
        instancePath2.lineTo(5.7f, 4.20003f);
        instancePath2.lineTo(5.7f, 3.80003f);
        instancePath2.lineTo(3.29917f, 3.80003f);
        instancePath2.lineTo(3.29917f, 4.20003f);
        instancePath2.close();
        instancePath2.moveTo(2.7f, 4.79668f);
        instancePath2.cubicTo(2.7f, 4.46982f, 2.96806f, 4.20003f, 3.29917f, 4.20003f);
        instancePath2.lineTo(3.29917f, 3.80003f);
        instancePath2.cubicTo(2.74753f, 3.80003f, 2.3f, 4.24852f, 2.3f, 4.79668f);
        instancePath2.lineTo(2.7f, 4.79668f);
        instancePath2.close();
        instancePath2.moveTo(2.7f, 15.2034f);
        instancePath2.lineTo(2.7f, 4.79668f);
        instancePath2.lineTo(2.3f, 4.79668f);
        instancePath2.lineTo(2.3f, 15.2034f);
        instancePath2.lineTo(2.7f, 15.2034f);
        instancePath2.close();
        instancePath2.moveTo(3.29665f, 15.8f);
        instancePath2.cubicTo(2.96919f, 15.8f, 2.7f, 15.5325f, 2.7f, 15.2034f);
        instancePath2.lineTo(2.3f, 15.2034f);
        instancePath2.cubicTo(2.3f, 15.7542f, 2.74908f, 16.2f, 3.29665f, 16.2f);
        instancePath2.lineTo(3.29665f, 15.8f);
        instancePath2.close();
        instancePath2.moveTo(14.5034f, 15.8f);
        instancePath2.lineTo(3.29665f, 15.8f);
        instancePath2.lineTo(3.29665f, 16.2f);
        instancePath2.lineTo(14.5034f, 16.2f);
        instancePath2.lineTo(14.5034f, 15.8f);
        instancePath2.close();
        instancePath2.moveTo(15.1f, 15.2034f);
        instancePath2.cubicTo(15.1f, 15.5308f, 14.8325f, 15.8f, 14.5034f, 15.8f);
        instancePath2.lineTo(14.5034f, 16.2f);
        instancePath2.cubicTo(15.0542f, 16.2f, 15.5f, 15.751f, 15.5f, 15.2034f);
        instancePath2.lineTo(15.1f, 15.2034f);
        instancePath2.close();
        instancePath2.moveTo(15.1f, 4.79668f);
        instancePath2.lineTo(15.1f, 15.2034f);
        instancePath2.lineTo(15.5f, 15.2034f);
        instancePath2.lineTo(15.5f, 4.79668f);
        instancePath2.lineTo(15.1f, 4.79668f);
        instancePath2.close();
        instancePath2.moveTo(14.5008f, 4.20003f);
        instancePath2.cubicTo(14.8311f, 4.20003f, 15.1f, 4.468f, 15.1f, 4.79668f);
        instancePath2.lineTo(15.5f, 4.79668f);
        instancePath2.cubicTo(15.5f, 4.24541f, 15.0503f, 3.80003f, 14.5008f, 3.80003f);
        instancePath2.lineTo(14.5008f, 4.20003f);
        instancePath2.close();
        instancePath2.moveTo(12.1f, 4.20003f);
        instancePath2.lineTo(14.5008f, 4.20003f);
        instancePath2.lineTo(14.5008f, 3.80003f);
        instancePath2.lineTo(12.1f, 3.80003f);
        instancePath2.lineTo(12.1f, 4.20003f);
        instancePath2.close();
        instancePath2.moveTo(12.3f, 4.96003f);
        instancePath2.lineTo(12.3f, 4.00003f);
        instancePath2.lineTo(11.9f, 4.00003f);
        instancePath2.lineTo(11.9f, 4.96003f);
        instancePath2.lineTo(12.3f, 4.96003f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
