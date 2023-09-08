package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_location_2 */
public class icons_outlined_location_2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 7.5f);
        Path path = instancePath;
        path.cubicTo(48.426407f, 7.5f, 58.5f, 17.502045f, 58.5f, 29.840193f);
        path.cubicTo(58.5f, 37.801018f, 53.917423f, 45.823196f, 49.09366f, 52.06238f);
        instancePath.lineTo(48.019505f, 53.41877f);
        instancePath.lineTo(46.947998f, 54.711956f);
        instancePath.lineTo(46.416546f, 55.333447f);
        instancePath.lineTo(46.416546f, 55.333447f);
        instancePath.lineTo(45.36886f, 56.523407f);
        instancePath.lineTo(44.35029f, 57.638927f);
        instancePath.lineTo(43.371418f, 58.675507f);
        instancePath.lineTo(42.000717f, 60.072525f);
        instancePath.lineTo(40.778893f, 61.266632f);
        instancePath.lineTo(39.741684f, 62.242645f);
        instancePath.lineTo(38.076416f, 63.72601f);
        instancePath.cubicTo(37.033005f, 64.67709f, 35.37659f, 64.746994f, 34.22446f, 63.96144f);
        instancePath.lineTo(33.635967f, 63.479675f);
        instancePath.lineTo(32.258316f, 62.242645f);
        instancePath.lineTo(30.83258f, 60.89208f);
        instancePath.lineTo(29.999285f, 60.072525f);
        instancePath.lineTo(28.62858f, 58.675507f);
        instancePath.lineTo(27.649712f, 57.638927f);
        instancePath.lineTo(26.63114f, 56.523407f);
        instancePath.lineTo(25.583454f, 55.333447f);
        instancePath.lineTo(25.052002f, 54.711956f);
        instancePath.lineTo(25.052002f, 54.711956f);
        instancePath.lineTo(23.980495f, 53.41877f);
        instancePath.lineTo(22.906342f, 52.06238f);
        Path path2 = instancePath;
        path2.cubicTo(18.082577f, 45.823196f, 13.5f, 37.801018f, 13.5f, 29.840193f);
        path2.cubicTo(13.5f, 17.502045f, 23.573593f, 7.5f, 36.0f, 7.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 14.1f);
        path2.cubicTo(27.427979f, 14.1f, 20.45646f, 20.809223f, 20.113243f, 29.192137f);
        instancePath.lineTo(20.1f, 29.840193f);
        path2.cubicTo(20.1f, 30.020752f, 20.103458f, 30.202772f, 20.110373f, 30.386261f);
        path2.cubicTo(20.314962f, 35.8151f, 23.523222f, 42.29678f, 28.861837f, 48.957825f);
        path2.cubicTo(30.91333f, 51.517498f, 33.125935f, 53.914043f, 35.33602f, 56.06538f);
        instancePath.lineTo(36.0f, 56.703f);
        instancePath.lineTo(36.66398f, 56.06538f);
        Path path3 = instancePath;
        path3.cubicTo(38.874065f, 53.914043f, 41.08667f, 51.517498f, 43.138165f, 48.957825f);
        path3.cubicTo(48.476776f, 42.29678f, 51.685036f, 35.8151f, 51.88963f, 30.386261f);
        instancePath.lineTo(51.9f, 29.840193f);
        path3.cubicTo(51.9f, 21.157696f, 44.791817f, 14.1f, 36.0f, 14.1f);
        instancePath.close();
        instancePath.moveTo(36.0f, 19.5f);
        path3.cubicTo(41.79899f, 19.5f, 46.5f, 24.20101f, 46.5f, 30.0f);
        path3.cubicTo(46.5f, 35.79899f, 41.79899f, 40.5f, 36.0f, 40.5f);
        path3.cubicTo(30.20101f, 40.5f, 25.5f, 35.79899f, 25.5f, 30.0f);
        path3.cubicTo(25.5f, 24.20101f, 30.20101f, 19.5f, 36.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 26.1f);
        path3.cubicTo(33.84609f, 26.1f, 32.1f, 27.84609f, 32.1f, 30.0f);
        path3.cubicTo(32.1f, 32.15391f, 33.84609f, 33.9f, 36.0f, 33.9f);
        path3.cubicTo(38.15391f, 33.9f, 39.9f, 32.15391f, 39.9f, 30.0f);
        path3.cubicTo(39.9f, 27.84609f, 38.15391f, 26.1f, 36.0f, 26.1f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
