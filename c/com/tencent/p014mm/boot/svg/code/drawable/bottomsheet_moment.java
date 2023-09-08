package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_moment */
public class bottomsheet_moment extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 144;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-9276814);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(71.998f, 42.0f);
                instancePath.cubicTo(73.462f, 42.0f, 74.892f, 42.14f, 76.3f, 42.344f);
                instancePath.lineTo(47.036f, 13.08f);
                instancePath.cubicTo(33.486f, 18.83f, 22.316f, 29.098f, 15.452f, 42.018f);
                instancePath.lineTo(71.672f, 42.018f);
                instancePath.cubicTo(71.784f, 42.018f, 71.888f, 42.0f, 71.998f, 42.0f);
                instancePath.lineTo(71.998f, 42.0f);
                instancePath.close();
                instancePath.moveTo(101.998f, 15.5f);
                instancePath.lineTo(101.998f, 72.0f);
                instancePath.cubicTo(101.998f, 73.43f, 101.864f, 74.826f, 101.67f, 76.202f);
                instancePath.lineTo(130.91f, 46.96f);
                Path path = instancePath;
                path.cubicTo(125.16f, 33.45f, 114.88f, 22.356f, 101.998f, 15.5f);
                instancePath.lineTo(101.998f, 15.5f);
                instancePath.close();
                instancePath.moveTo(93.248f, 50.828f);
                path.cubicTo(94.248f, 51.83f, 95.148f, 52.924f, 95.998f, 54.058f);
                instancePath.lineTo(95.998f, 12.674f);
                Path path2 = instancePath;
                path2.cubicTo(88.584f, 9.672f, 80.49f, 8.0f, 71.998f, 8.0f);
                path2.cubicTo(65.474f, 8.0f, 59.19f, 9.002f, 53.26f, 10.818f);
                instancePath.lineTo(93.26f, 50.818f);
                instancePath.lineTo(93.248f, 50.828f);
                instancePath.lineTo(93.248f, 50.828f);
                instancePath.close();
                instancePath.moveTo(54.046f, 48.018f);
                instancePath.lineTo(12.662f, 48.018f);
                Path path3 = instancePath;
                path3.cubicTo(9.664f, 55.426f, 8.0f, 63.516f, 8.0f, 72.0f);
                path3.cubicTo(8.0f, 78.558f, 9.014f, 84.874f, 10.848f, 90.832f);
                instancePath.lineTo(49.742f, 51.938f);
                Path path4 = instancePath;
                path4.cubicTo(51.042f, 50.494f, 52.49f, 49.188f, 54.046f, 48.018f);
                instancePath.lineTo(54.046f, 48.018f);
                instancePath.close();
                instancePath.moveTo(41.998f, 128.534f);
                instancePath.lineTo(41.998f, 71.998f);
                path4.cubicTo(41.998f, 70.584f, 42.13f, 69.204f, 42.32f, 67.842f);
                instancePath.lineTo(13.114f, 97.048f);
                instancePath.cubicTo(18.87f, 110.554f, 29.116f, 121.684f, 41.998f, 128.534f);
                instancePath.lineTo(41.998f, 128.534f);
                instancePath.close();
                instancePath.moveTo(47.998f, 89.952f);
                instancePath.lineTo(47.998f, 131.328f);
                Path path5 = instancePath;
                path5.cubicTo(55.412f, 134.33f, 63.508f, 135.998f, 71.998f, 135.998f);
                path5.cubicTo(78.582f, 135.998f, 84.918f, 134.976f, 90.894f, 133.128f);
                instancePath.lineTo(52.868f, 95.104f);
                instancePath.cubicTo(51.042f, 93.594f, 49.422f, 91.852f, 47.998f, 89.952f);
                instancePath.lineTo(47.998f, 89.952f);
                instancePath.close();
                instancePath.moveTo(133.18f, 53.178f);
                instancePath.lineTo(93.896f, 92.462f);
                instancePath.cubicTo(92.682f, 93.76f, 91.338f, 94.932f, 89.914f, 96.002f);
                instancePath.lineTo(131.33f, 96.002f);
                Path path6 = instancePath;
                path6.cubicTo(134.332f, 88.588f, 136.0f, 80.492f, 136.0f, 72.002f);
                path6.cubicTo(135.998f, 65.448f, 135.01f, 59.128f, 133.18f, 53.178f);
                instancePath.lineTo(133.18f, 53.178f);
                instancePath.close();
                instancePath.moveTo(67.942f, 101.694f);
                instancePath.lineTo(97.108f, 130.86f);
                instancePath.cubicTo(110.586f, 125.1f, 121.692f, 114.862f, 128.534f, 102.0f);
                instancePath.lineTo(71.998f, 102.0f);
                instancePath.cubicTo(70.62f, 102.0f, 69.272f, 101.874f, 67.942f, 101.694f);
                instancePath.lineTo(67.942f, 101.694f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
