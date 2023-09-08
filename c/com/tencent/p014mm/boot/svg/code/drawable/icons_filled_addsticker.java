package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_addsticker */
public class icons_filled_addsticker extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(58.153847f, 37.384617f);
                Path path = instancePath;
                path.cubicTo(65.800865f, 37.384617f, 72.0f, 43.583748f, 72.0f, 51.23077f);
                path.cubicTo(72.0f, 58.87779f, 65.800865f, 65.07692f, 58.153847f, 65.07692f);
                path.cubicTo(50.50683f, 65.07692f, 44.307693f, 58.87779f, 44.307693f, 51.23077f);
                path.cubicTo(44.307693f, 43.583748f, 50.50683f, 37.384617f, 58.153847f, 37.384617f);
                instancePath.close();
                instancePath.moveTo(27.692308f, 6.923077f);
                instancePath.cubicTo(42.986347f, 6.923077f, 55.384617f, 19.321346f, 55.384617f, 34.615383f);
                instancePath.lineTo(55.38238f, 34.84549f);
                Path path2 = instancePath;
                path2.cubicTo(47.525196f, 36.16478f, 41.53846f, 42.99864f, 41.53846f, 51.23077f);
                path2.cubicTo(41.53846f, 53.554977f, 42.01568f, 55.767723f, 42.877472f, 57.77637f);
                path2.cubicTo(38.517075f, 60.641308f, 33.299294f, 62.307693f, 27.692308f, 62.307693f);
                path2.cubicTo(12.398269f, 62.307693f, 0.0f, 49.909424f, 0.0f, 34.615383f);
                path2.cubicTo(0.0f, 19.321346f, 12.398269f, 6.923077f, 27.692308f, 6.923077f);
                instancePath.close();
                instancePath.moveTo(59.746155f, 42.923077f);
                instancePath.lineTo(56.423077f, 42.923077f);
                instancePath.lineTo(56.420307f, 49.5f);
                instancePath.lineTo(49.846153f, 49.5f);
                instancePath.lineTo(49.846153f, 52.82308f);
                instancePath.lineTo(56.420307f, 52.82308f);
                instancePath.lineTo(56.423077f, 59.53846f);
                instancePath.lineTo(59.746155f, 59.53846f);
                instancePath.lineTo(59.743385f, 52.82308f);
                instancePath.lineTo(66.46154f, 52.82308f);
                instancePath.lineTo(66.46154f, 49.5f);
                instancePath.lineTo(59.743385f, 49.5f);
                instancePath.lineTo(59.746155f, 42.923077f);
                instancePath.close();
                instancePath.moveTo(42.860985f, 37.384617f);
                instancePath.lineTo(12.523629f, 37.384617f);
                Path path3 = instancePath;
                path3.cubicTo(13.223176f, 45.14746f, 19.747326f, 51.23077f, 27.692308f, 51.23077f);
                path3.cubicTo(35.63729f, 51.23077f, 42.161438f, 45.14746f, 42.860985f, 37.384617f);
                instancePath.close();
                instancePath.moveTo(18.0f, 22.153847f);
                Path path4 = instancePath;
                path4.cubicTo(15.705894f, 22.153847f, 13.846154f, 24.013586f, 13.846154f, 26.307692f);
                path4.cubicTo(13.846154f, 28.601799f, 15.705894f, 30.461538f, 18.0f, 30.461538f);
                path4.cubicTo(20.294106f, 30.461538f, 22.153847f, 28.601799f, 22.153847f, 26.307692f);
                path4.cubicTo(22.153847f, 24.013586f, 20.294106f, 22.153847f, 18.0f, 22.153847f);
                instancePath.close();
                instancePath.moveTo(37.384617f, 22.153847f);
                path4.cubicTo(35.09051f, 22.153847f, 33.23077f, 24.013586f, 33.23077f, 26.307692f);
                path4.cubicTo(33.23077f, 28.601799f, 35.09051f, 30.461538f, 37.384617f, 30.461538f);
                path4.cubicTo(39.678722f, 30.461538f, 41.53846f, 28.601799f, 41.53846f, 26.307692f);
                path4.cubicTo(41.53846f, 24.013586f, 39.678722f, 22.153847f, 37.384617f, 22.153847f);
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
