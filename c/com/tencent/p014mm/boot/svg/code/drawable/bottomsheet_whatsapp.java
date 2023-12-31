package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_whatsapp */
public class bottomsheet_whatsapp extends C24542c {
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
                instancePath.moveTo(117.3346f, 26.695942f);
                Path path = instancePath;
                path.cubicTo(105.29833f, 14.659666f, 89.32124f, 8.030549f, 72.27494f, 8.0f);
                path.cubicTo(37.143677f, 8.0f, 8.58043f, 36.593796f, 8.549881f, 71.69451f);
                path.cubicTo(8.549881f, 82.936516f, 11.482577f, 93.87303f, 17.042482f, 103.55704f);
                instancePath.lineTo(8.0f, 136.58043f);
                instancePath.lineTo(41.787113f, 127.721245f);
                instancePath.cubicTo(51.104534f, 132.79236f, 61.582817f, 135.48067f, 72.24439f, 135.48067f);
                instancePath.lineTo(72.27494f, 135.48067f);
                instancePath.lineTo(72.27494f, 135.48067f);
                Path path2 = instancePath;
                path2.cubicTo(107.375656f, 135.48067f, 135.96945f, 106.88687f, 136.0f, 71.75561f);
                path2.cubicTo(136.0f, 54.739857f, 129.37088f, 38.73222f, 117.3346f, 26.695942f);
                instancePath.lineTo(117.3346f, 26.695942f);
                instancePath.close();
                instancePath.moveTo(72.27494f, 124.72745f);
                instancePath.lineTo(72.27494f, 124.72745f);
                path2.cubicTo(62.743675f, 124.72745f, 53.426254f, 122.16134f, 45.30024f, 117.3346f);
                instancePath.lineTo(43.375656f, 116.173744f);
                instancePath.lineTo(23.335562f, 121.42816f);
                instancePath.lineTo(28.681623f, 101.87685f);
                instancePath.lineTo(27.429117f, 99.86062f);
                Path path3 = instancePath;
                path3.cubicTo(22.113604f, 91.429115f, 19.333652f, 81.684006f, 19.333652f, 71.69451f);
                path3.cubicTo(19.333652f, 42.48974f, 43.100716f, 18.753222f, 72.30549f, 18.753222f);
                path3.cubicTo(86.44964f, 18.753222f, 99.73843f, 24.282578f, 109.75848f, 34.272076f);
                path3.cubicTo(119.74797f, 44.292126f, 125.24678f, 57.580906f, 125.24678f, 71.72506f);
                path3.cubicTo(125.21623f, 100.96038f, 101.449165f, 124.72745f, 72.27494f, 124.72745f);
                instancePath.lineTo(72.27494f, 124.72745f);
                instancePath.close();
                instancePath.moveTo(101.326965f, 85.04439f);
                path3.cubicTo(99.73843f, 84.25012f, 91.9179f, 80.400955f, 90.45155f, 79.851074f);
                path3.cubicTo(88.98521f, 79.33174f, 87.91599f, 79.0568f, 86.87733f, 80.64535f);
                path3.cubicTo(85.80811f, 82.23389f, 82.75322f, 85.83866f, 81.836754f, 86.87733f);
                path3.cubicTo(80.92029f, 87.94654f, 79.97327f, 88.06873f, 78.38473f, 87.27446f);
                path3.cubicTo(76.79618f, 86.480194f, 71.66396f, 84.8f, 65.584724f, 79.36229f);
                path3.cubicTo(60.849644f, 75.14654f, 57.672554f, 69.922676f, 56.725536f, 68.33413f);
                path3.cubicTo(55.80907f, 66.74558f, 56.633892f, 65.89021f, 57.42816f, 65.09594f);
                path3.cubicTo(58.130787f, 64.39332f, 59.016705f, 63.23246f, 59.810978f, 62.31599f);
                path3.cubicTo(60.60525f, 61.39952f, 60.88019f, 60.727448f, 61.39952f, 59.658234f);
                path3.cubicTo(61.918854f, 58.58902f, 61.67446f, 57.672554f, 61.27733f, 56.87828f);
                path3.cubicTo(60.88019f, 56.08401f, 57.703102f, 48.232937f, 56.35895f, 45.055847f);
                path3.cubicTo(55.075893f, 41.939857f, 53.76229f, 42.367542f, 52.784725f, 42.336994f);
                path3.cubicTo(51.86826f, 42.275894f, 50.799046f, 42.275894f, 49.72983f, 42.275894f);
                path3.cubicTo(48.66062f, 42.275894f, 46.949883f, 42.67303f, 45.483532f, 44.261574f);
                path3.cubicTo(44.017185f, 45.85012f, 39.923626f, 49.699284f, 39.923626f, 57.550358f);
                path3.cubicTo(39.923626f, 65.40143f, 45.636276f, 72.947014f, 46.43055f, 74.01623f);
                path3.cubicTo(47.22482f, 75.08544f, 57.642006f, 91.154175f, 73.619095f, 98.058235f);
                path3.cubicTo(77.40716f, 99.70788f, 80.37041f, 100.68544f, 82.69212f, 101.41862f);
                path3.cubicTo(86.51074f, 102.64057f, 89.96277f, 102.457275f, 92.71217f, 102.06014f);
                path3.cubicTo(95.76707f, 101.601906f, 102.12124f, 98.210976f, 103.46539f, 94.48401f);
                path3.cubicTo(104.779f, 90.75704f, 104.779f, 87.579956f, 104.38186f, 86.907875f);
                path3.cubicTo(103.984726f, 86.2358f, 102.91551f, 85.83866f, 101.326965f, 85.04439f);
                instancePath.lineTo(101.326965f, 85.04439f);
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
