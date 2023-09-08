package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_gift_effects_off */
public class icons_filled_gift_effects_off extends C24542c {
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
            instancePath.moveTo(10.172635f, 12.978837f);
            instancePath.lineTo(11.021163f, 13.827365f);
            instancePath.lineTo(3.424264f, 21.424265f);
            instancePath.lineTo(2.575736f, 20.575735f);
            instancePath.lineTo(10.172635f, 12.978837f);
            instancePath.close();
            instancePath.moveTo(11.265788f, 1.5417222f);
            instancePath.cubicTo(11.2554245f, 1.0745648f, 11.751819f, 0.78802764f, 12.143626f, 0.9962085f);
            instancePath.lineTo(12.225761f, 1.0485053f);
            instancePath.lineTo(16.162392f, 4.0015035f);
            instancePath.lineTo(20.761795f, 2.4807968f);
            instancePath.cubicTo(21.229996f, 2.3259351f, 21.674723f, 2.7706614f, 21.519861f, 3.2388616f);
            instancePath.lineTo(19.998447f, 7.837558f);
            instancePath.lineTo(22.952152f, 11.774896f);
            instancePath.cubicTo(23.232609f, 12.1486435f, 22.995913f, 12.670645f, 22.556162f, 12.729556f);
            instancePath.lineTo(22.458935f, 12.734869f);
            instancePath.lineTo(17.591455f, 12.626085f);
            instancePath.lineTo(14.819308f, 16.572449f);
            instancePath.cubicTo(14.551998f, 16.952982f, 13.984641f, 16.892616f, 13.790436f, 16.494226f);
            instancePath.lineTo(13.75677f, 16.410072f);
            instancePath.lineTo(12.264112f, 11.73513f);
            instancePath.lineTo(7.590585f, 10.243887f);
            instancePath.cubicTo(7.1475835f, 10.102428f, 7.035746f, 9.542936f, 7.3579507f, 9.238612f);
            instancePath.lineTo(7.4282093f, 9.181349f);
            instancePath.lineTo(11.373865f, 6.4084954f);
            instancePath.close();
            instancePath.moveTo(12.492508f, 2.7485106f);
            instancePath.lineTo(12.58059f, 6.7033114f);
            instancePath.cubicTo(12.58429f, 6.8700585f, 12.518498f, 7.029194f, 12.401687f, 7.1441846f);
            instancePath.lineTo(12.325625f, 7.2075896f);
            instancePath.lineTo(9.106881f, 9.467439f);
            instancePath.lineTo(12.924265f, 10.687337f);
            instancePath.cubicTo(13.078439f, 10.7365675f, 13.204808f, 10.845447f, 13.276836f, 10.987437f);
            instancePath.lineTo(13.31332f, 11.076392f);
            instancePath.lineTo(14.532511f, 14.893069f);
            instancePath.lineTo(16.793068f, 11.675032f);
            instancePath.cubicTo(16.888939f, 11.538551f, 17.036263f, 11.449397f, 17.198503f, 11.426039f);
            instancePath.lineTo(17.297346f, 11.420067f);
            instancePath.lineTo(21.25144f, 11.507442f);
            instancePath.lineTo(18.8504f, 8.308087f);
            instancePath.cubicTo(18.752144f, 8.177147f, 18.71249f, 8.013034f, 18.737701f, 7.854032f);
            instancePath.lineTo(18.760662f, 7.7595506f);
            instancePath.lineTo(20.005518f, 3.9951398f);
            instancePath.lineTo(16.241108f, 5.239995f);
            instancePath.cubicTo(16.054596f, 5.3016853f, 15.849699f, 5.268165f, 15.69257f, 5.150256f);
            instancePath.lineTo(12.492508f, 2.7485106f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
