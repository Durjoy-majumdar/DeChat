package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outlined_like_lock */
public class finder_outlined_like_lock extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(18.5f, 13.576223f);
        instancePath2.cubicTo(19.880713f, 13.576223f, 21.0f, 14.695511f, 21.0f, 16.076223f);
        instancePath2.lineTo(21.0f, 16.3757f);
        instancePath2.cubicTo(21.552284f, 16.3757f, 22.0f, 16.823416f, 22.0f, 17.3757f);
        instancePath2.lineTo(22.0f, 21.002121f);
        instancePath2.cubicTo(22.0f, 21.554405f, 21.552284f, 22.002121f, 21.0f, 22.002121f);
        instancePath2.lineTo(16.0f, 22.002121f);
        instancePath2.cubicTo(15.447716f, 22.002121f, 15.0f, 21.554405f, 15.0f, 21.002121f);
        instancePath2.lineTo(15.0f, 17.3757f);
        Path path = instancePath2;
        path.cubicTo(15.0f, 16.823416f, 15.447716f, 16.3757f, 16.0f, 16.3757f);
        instancePath2.lineTo(16.0f, 16.076223f);
        path.cubicTo(16.0f, 14.695511f, 17.119287f, 13.576223f, 18.5f, 13.576223f);
        instancePath2.close();
        instancePath2.moveTo(20.8f, 17.575f);
        instancePath2.lineTo(16.2f, 17.575f);
        instancePath2.lineTo(16.2f, 20.802f);
        instancePath2.lineTo(20.8f, 20.802f);
        instancePath2.lineTo(20.8f, 17.575f);
        instancePath2.close();
        instancePath2.moveTo(11.290586f, 6.064466f);
        instancePath2.lineTo(11.676765f, 6.4416356f);
        instancePath2.lineTo(11.997693f, 6.7465453f);
        instancePath2.lineTo(12.460042f, 6.3052197f);
        instancePath2.lineTo(12.704801f, 6.064466f);
        Path path2 = instancePath2;
        path2.cubicTo(14.657422f, 4.1118445f, 17.823246f, 4.1118445f, 19.775867f, 6.064466f);
        path2.cubicTo(21.53121f, 7.819808f, 21.708557f, 10.555589f, 20.30791f, 12.509045f);
        path2.cubicTo(19.931223f, 12.315868f, 19.519419f, 12.182348f, 19.08492f, 12.118685f);
        instancePath2.lineTo(18.968624f, 12.245095f);
        instancePath2.cubicTo(20.362944f, 10.808074f, 20.395308f, 8.544291f, 19.07408f, 7.0680733f);
        instancePath2.lineTo(18.92734f, 6.9129944f);
        instancePath2.cubicTo(17.443348f, 5.429002f, 15.03732f, 5.429002f, 13.5533285f, 6.9129944f);
        instancePath2.lineTo(13.151276f, 7.3057504f);
        instancePath2.lineTo(11.997693f, 8.395275f);
        instancePath2.lineTo(10.697619f, 7.164419f);
        instancePath2.lineTo(10.442059f, 6.9129944f);
        Path path3 = instancePath2;
        path3.cubicTo(8.958066f, 5.429002f, 6.552039f, 5.429002f, 5.068047f, 6.9129944f);
        path3.cubicTo(3.6501608f, 8.33088f, 3.5854633f, 10.594131f, 4.870776f, 12.076815f);
        instancePath2.lineTo(5.013654f, 12.232613f);
        instancePath2.lineTo(11.996f, 19.218f);
        instancePath2.lineTo(13.499f, 17.714f);
        instancePath2.lineTo(13.499f, 19.411f);
        instancePath2.lineTo(12.704763f, 20.206564f);
        path3.cubicTo(12.344332f, 20.567102f, 11.777105f, 20.594864f, 11.384798f, 20.28986f);
        instancePath2.lineTo(11.290586f, 20.206602f);
        instancePath2.lineTo(4.165126f, 13.081141f);
        path3.cubicTo(2.2670662f, 11.124121f, 2.2850606f, 7.9989243f, 4.2195187f, 6.064466f);
        path3.cubicTo(6.17214f, 4.1118445f, 9.337965f, 4.1118445f, 11.290586f, 6.064466f);
        instancePath2.close();
        instancePath2.moveTo(18.5f, 14.776223f);
        path3.cubicTo(17.826902f, 14.776223f, 17.273285f, 15.287773f, 17.206713f, 15.943306f);
        instancePath2.lineTo(17.2f, 16.076223f);
        instancePath2.lineTo(17.199f, 16.375223f);
        instancePath2.lineTo(19.8f, 16.375223f);
        instancePath2.lineTo(19.8f, 16.076223f);
        instancePath2.cubicTo(19.8f, 15.403126f, 19.28845f, 14.849508f, 18.632917f, 14.782935f);
        instancePath2.lineTo(18.5f, 14.776223f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
