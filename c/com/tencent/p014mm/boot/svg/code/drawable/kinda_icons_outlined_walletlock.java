package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_icons_outlined_walletlock */
public class kinda_icons_outlined_walletlock extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = 32;
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
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.0f, 3.2f);
                Path path = instancePath;
                path.cubicTo(20.123726f, 3.2f, 23.466667f, 6.5429406f, 23.466667f, 10.666667f);
                path.cubicTo(23.466667f, 11.108495f, 23.108494f, 11.466667f, 22.666666f, 11.466667f);
                path.cubicTo(22.224838f, 11.466667f, 21.866667f, 11.108495f, 21.866667f, 10.666667f);
                path.cubicTo(21.866667f, 7.426596f, 19.24007f, 4.8f, 16.0f, 4.8f);
                path.cubicTo(12.833568f, 4.8f, 10.253041f, 7.3085623f, 10.13738f, 10.446727f);
                instancePath.lineTo(10.133333f, 10.666667f);
                instancePath.lineTo(10.133333f, 13.333333f);
                instancePath.lineTo(25.466667f, 13.333333f);
                instancePath.cubicTo(26.129408f, 13.333333f, 26.666666f, 13.870591f, 26.666666f, 14.533333f);
                instancePath.lineTo(26.666666f, 28.133333f);
                instancePath.cubicTo(26.666666f, 28.796076f, 26.129408f, 29.333334f, 25.466667f, 29.333334f);
                instancePath.lineTo(6.5333333f, 29.333334f);
                instancePath.cubicTo(5.8705916f, 29.333334f, 5.3333335f, 28.796076f, 5.3333335f, 28.133333f);
                instancePath.lineTo(5.3333335f, 14.533333f);
                instancePath.cubicTo(5.3333335f, 13.870591f, 5.8705916f, 13.333333f, 6.5333333f, 13.333333f);
                instancePath.lineTo(8.533334f, 13.333333f);
                instancePath.lineTo(8.533334f, 10.666667f);
                instancePath.cubicTo(8.533334f, 6.5429406f, 11.876274f, 3.2f, 16.0f, 3.2f);
                instancePath.close();
                instancePath.moveTo(25.066668f, 14.933333f);
                instancePath.lineTo(6.9333334f, 14.933333f);
                instancePath.lineTo(6.9333334f, 27.733334f);
                instancePath.lineTo(25.066668f, 27.733334f);
                instancePath.lineTo(25.066668f, 14.933333f);
                instancePath.close();
                instancePath.moveTo(20.788368f, 17.414328f);
                instancePath.lineTo(21.8783f, 18.585672f);
                instancePath.lineTo(14.713658f, 25.252338f);
                instancePath.cubicTo(14.406543f, 25.538109f, 13.930842f, 25.538109f, 13.623727f, 25.252338f);
                instancePath.lineTo(10.121701f, 21.99372f);
                instancePath.lineTo(11.211633f, 20.822374f);
                instancePath.lineTo(14.168693f, 23.573906f);
                instancePath.lineTo(20.788368f, 17.414328f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
