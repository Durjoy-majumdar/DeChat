package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_car */
public class connect_car extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 24;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(13.776992f, 18.44776f);
            Path path = instancePath;
            path.cubicTo(13.265816f, 17.781214f, 12.962358f, 16.949373f, 12.962358f, 16.047218f);
            path.cubicTo(12.962358f, 13.855613f, 14.753219f, 12.078964f, 16.962358f, 12.078964f);
            path.cubicTo(17.609716f, 12.078964f, 18.221155f, 12.231525f, 18.762138f, 12.502383f);
            path.cubicTo(18.807144f, 12.174689f, 18.830395f, 11.84006f, 18.830395f, 11.5f);
            path.cubicTo(18.830395f, 7.4683213f, 15.562075f, 4.2f, 11.5303955f, 4.2f);
            path.cubicTo(7.498717f, 4.2f, 4.2303953f, 7.4683213f, 4.2303953f, 11.5f);
            path.cubicTo(4.2303953f, 15.531679f, 7.498717f, 18.8f, 11.5303955f, 18.8f);
            path.cubicTo(12.314257f, 18.8f, 13.069262f, 18.676453f, 13.777f, 18.447771f);
            instancePath.close();
            instancePath.moveTo(14.764329f, 19.363182f);
            Path path2 = instancePath;
            path2.cubicTo(13.767437f, 19.77362f, 12.675353f, 20.0f, 11.5303955f, 20.0f);
            path2.cubicTo(6.835975f, 20.0f, 3.0303955f, 16.19442f, 3.0303955f, 11.5f);
            path2.cubicTo(3.0303955f, 6.8055797f, 6.835975f, 3.0f, 11.5303955f, 3.0f);
            path2.cubicTo(16.224815f, 3.0f, 20.030396f, 6.8055797f, 20.030396f, 11.5f);
            path2.cubicTo(20.030396f, 12.114792f, 19.965126f, 12.714339f, 19.841137f, 13.292091f);
            path2.cubicTo(20.535353f, 14.005841f, 20.962358f, 14.977059f, 20.962358f, 16.047218f);
            path2.cubicTo(20.962358f, 18.238825f, 19.171497f, 20.015472f, 16.962358f, 20.015472f);
            path2.cubicTo(16.15048f, 20.015472f, 15.395096f, 19.775515f, 14.764337f, 19.363186f);
            instancePath.close();
            instancePath.moveTo(16.962358f, 18.815472f);
            Path path3 = instancePath;
            path3.cubicTo(18.510887f, 18.815472f, 19.762358f, 17.573933f, 19.762358f, 16.047218f);
            path3.cubicTo(19.762358f, 14.520504f, 18.510887f, 13.278965f, 16.962358f, 13.278965f);
            path3.cubicTo(15.41383f, 13.278965f, 14.162358f, 14.520504f, 14.162358f, 16.047218f);
            path3.cubicTo(14.162358f, 17.573933f, 15.41383f, 18.815472f, 16.962358f, 18.815472f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
