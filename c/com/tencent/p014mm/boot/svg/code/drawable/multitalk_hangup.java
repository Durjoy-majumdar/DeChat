package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_hangup */
public class multitalk_hangup extends C24542c {
    private final int height = 210;
    private final int width = 210;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 210;
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
            instancePaint3.setColor(-2471350);
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
            instancePaint4.setColor(-419430401);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(76.2874f, 119.85174f);
            instancePath2.lineTo(59.71011f, 127.193184f);
            Path path2 = instancePath2;
            path2.cubicTo(57.7428f, 127.97435f, 55.578846f, 127.56027f, 53.99069f, 126.10627f);
            path2.cubicTo(53.344463f, 125.535065f, 52.983376f, 124.49588f, 52.890335f, 124.288055f);
            path2.cubicTo(50.033813f, 117.325836f, 51.68169f, 108.8528f, 57.711308f, 103.130905f);
            path2.cubicTo(59.410564f, 101.51837f, 61.34518f, 100.37341f, 61.827454f, 100.11317f);
            path2.cubicTo(75.704185f, 91.68241f, 91.155785f, 87.51221f, 106.45833f, 87.50005f);
            path2.cubicTo(121.76087f, 87.487946f, 136.91435f, 91.633896f, 149.89516f, 100.04336f);
            path2.cubicTo(150.29495f, 100.35489f, 152.16272f, 101.444855f, 153.69052f, 103.05483f);
            path2.cubicTo(159.11179f, 108.767654f, 159.85818f, 117.238785f, 156.26057f, 124.20612f);
            path2.cubicTo(156.14542f, 124.41411f, 155.62444f, 125.40202f, 154.96666f, 126.02623f);
            path2.cubicTo(153.27293f, 127.53481f, 151.06473f, 127.952354f, 149.18037f, 127.17424f);
            instancePath2.lineTo(133.38289f, 119.85846f);
            Path path3 = instancePath2;
            path3.cubicTo(132.6215f, 119.49525f, 132.43544f, 119.079605f, 132.2222f, 118.19622f);
            path3.cubicTo(131.59354f, 115.33816f, 129.88763f, 108.27108f, 128.75557f, 104.114075f);
            path3.cubicTo(128.49858f, 103.0748f, 127.97858f, 102.08771f, 127.23932f, 101.308685f);
            path3.cubicTo(126.45077f, 100.47773f, 125.388145f, 99.90686f, 124.30894f, 99.64785f);
            path3.cubicTo(118.35416f, 98.09335f, 112.60017f, 97.110725f, 106.45833f, 97.11559f);
            path3.cubicTo(100.26721f, 97.06853f, 93.63342f, 98.060974f, 87.512726f, 99.62504f);
            path3.cubicTo(86.40586f, 99.88579f, 85.33722f, 100.40637f, 84.40537f, 101.290665f);
            path3.cubicTo(83.528336f, 102.12294f, 82.95806f, 103.05892f, 82.59046f, 104.09869f);
            path3.cubicTo(81.07077f, 108.205826f, 78.61272f, 115.27621f, 77.62507f, 118.18752f);
            path3.cubicTo(77.31782f, 119.07132f, 77.14231f, 119.43527f, 76.2874f, 119.85174f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
