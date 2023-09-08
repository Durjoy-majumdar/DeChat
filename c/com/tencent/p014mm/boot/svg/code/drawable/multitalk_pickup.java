package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_pickup */
public class multitalk_pickup extends C24542c {
    private final int height = 210;
    private final int width = 210;

    public int doCommand(int i, Object... objArr) {
        int i2 = 210;
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
                instancePaint3.setColor(-13327053);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(105.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(162.9899f, 0.0f, 210.0f, 47.010098f, 210.0f, 105.0f);
                path.cubicTo(210.0f, 162.9899f, 162.9899f, 210.0f, 105.0f, 210.0f);
                path.cubicTo(47.010098f, 210.0f, 0.0f, 162.9899f, 0.0f, 105.0f);
                path.cubicTo(0.0f, 47.010098f, 47.010098f, 0.0f, 105.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(96.494316f, 113.505684f);
                Path path2 = instancePath2;
                path2.cubicTo(104.60257f, 121.61394f, 112.285225f, 125.41699f, 115.126305f, 125.19428f);
                path2.cubicTo(117.967384f, 124.97158f, 125.04247f, 120.106026f, 128.38249f, 120.17079f);
                path2.cubicTo(129.98773f, 120.20192f, 140.47748f, 127.296135f, 141.74727f, 128.11635f);
                path2.cubicTo(143.01704f, 128.93655f, 144.19443f, 129.89465f, 143.97304f, 131.10704f);
                path2.cubicTo(143.75165f, 132.31943f, 139.14153f, 145.67386f, 127.37189f, 143.82458f);
                path2.cubicTo(115.60224f, 141.9753f, 99.19372f, 129.28743f, 89.84374f, 120.15626f);
                instancePath2.lineTo(96.494316f, 113.505684f);
                instancePath2.lineTo(96.494316f, 113.505684f);
                instancePath2.close();
                instancePath2.moveTo(96.494316f, 113.505684f);
                path2.cubicTo(88.38606f, 105.39743f, 84.58301f, 97.714775f, 84.80572f, 94.873695f);
                path2.cubicTo(85.02842f, 92.03261f, 89.893974f, 84.95753f, 89.82921f, 81.617516f);
                path2.cubicTo(89.79808f, 80.01227f, 82.703865f, 69.52252f, 81.88366f, 68.25274f);
                path2.cubicTo(81.063446f, 66.98295f, 80.10535f, 65.80558f, 78.89296f, 66.02696f);
                path2.cubicTo(77.680565f, 66.24835f, 64.32614f, 70.858475f, 66.17542f, 82.62811f);
                path2.cubicTo(68.024704f, 94.39776f, 80.71257f, 110.80628f, 89.84374f, 120.15626f);
                instancePath2.lineTo(96.494316f, 113.505684f);
                instancePath2.lineTo(96.494316f, 113.505684f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
