package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_ad_link_tag_weapp_dark */
public class album_ad_link_tag_weapp_dark extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = 48;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-2130706433);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(34.0086f, 25.9815f);
                instancePath.lineTo(33.5368f, 25.9892f);
                Path path = instancePath;
                path.cubicTo(32.1101f, 25.9892f, 31.2799f, 24.9426f, 31.8162f, 23.7359f);
                path.cubicTo(32.1835f, 22.879f, 33.0121f, 22.2171f, 33.9907f, 21.9997f);
                path.cubicTo(36.609f, 21.3677f, 38.3879f, 19.3215f, 38.3879f, 16.9425f);
                path.cubicTo(38.3879f, 14.0584f, 35.6343f, 11.708f, 32.1949f, 11.708f);
                path.cubicTo(28.7556f, 11.708f, 26.002f, 14.0584f, 26.002f, 16.9425f);
                instancePath.lineTo(26.002f, 31.3195f);
                Path path2 = instancePath;
                path2.cubicTo(26.002f, 36.3833f, 21.4758f, 40.462f, 15.901f, 40.462f);
                path2.cubicTo(10.3262f, 40.462f, 5.80005f, 36.3833f, 5.80005f, 31.3195f);
                path2.cubicTo(5.80005f, 26.8793f, 9.30473f, 23.0893f, 14.0799f, 22.3687f);
                instancePath.lineTo(14.4633f, 22.3687f);
                Path path3 = instancePath;
                path3.cubicTo(15.5434f, 22.3687f, 16.3215f, 23.0153f, 16.3215f, 23.9387f);
                path3.cubicTo(16.3219f, 24.097f, 16.3181f, 24.1701f, 16.3024f, 24.2638f);
                path3.cubicTo(16.2814f, 24.3902f, 16.2404f, 24.5111f, 16.1839f, 24.6219f);
                path3.cubicTo(15.8396f, 25.4252f, 14.9596f, 26.1206f, 14.0094f, 26.3581f);
                path3.cubicTo(11.41f, 26.9856f, 9.61219f, 29.0194f, 9.61219f, 31.3195f);
                path3.cubicTo(9.61219f, 34.2037f, 12.3658f, 36.554f, 15.8052f, 36.554f);
                path3.cubicTo(19.2445f, 36.554f, 21.9981f, 34.2037f, 21.9981f, 31.3195f);
                instancePath.lineTo(21.9981f, 16.9425f);
                Path path4 = instancePath;
                path4.cubicTo(21.9981f, 11.8787f, 26.5243f, 7.80002f, 32.0991f, 7.80002f);
                path4.cubicTo(37.6739f, 7.80002f, 42.2001f, 11.8787f, 42.2001f, 16.9425f);
                path4.cubicTo(42.2001f, 21.4062f, 38.7778f, 25.1521f, 34.0086f, 25.9815f);
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
