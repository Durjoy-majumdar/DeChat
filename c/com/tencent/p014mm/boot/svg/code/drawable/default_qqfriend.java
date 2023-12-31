package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_qqfriend */
public class default_qqfriend extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 192;
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
                instancePaint3.setColor(-15158035);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(192.0f, 0.0f);
                instancePath.lineTo(192.0f, 192.0f);
                instancePath.lineTo(0.0f, 192.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(142.54546f, 100.831314f);
                Path path = instancePath2;
                path.cubicTo(139.21634f, 92.18106f, 135.36592f, 85.41221f, 136.1254f, 75.06431f);
                path.cubicTo(134.93721f, 54.305878f, 117.50597f, 36.5975f, 97.60502f, 36.41379f);
                path.cubicTo(74.49456f, 36.5975f, 57.06332f, 54.305878f, 55.874607f, 75.06431f);
                path.cubicTo(56.631752f, 85.41221f, 52.78132f, 92.18106f, 49.454544f, 100.831314f);
                path.cubicTo(40.531776f, 114.37079f, 42.792137f, 131.66068f, 46.244514f, 133.04007f);
                path.cubicTo(48.937344f, 131.66068f, 53.50395f, 128.93271f, 59.08464f, 123.37745f);
                path.cubicTo(59.046963f, 129.886f, 62.21491f, 134.8965f, 65.5047f, 139.48183f);
                path.cubicTo(60.41336f, 140.68864f, 56.32277f, 143.90248f, 55.874607f, 145.92358f);
                path.cubicTo(56.75219f, 152.38712f, 65.80511f, 156.04285f, 75.134796f, 155.58621f);
                path.cubicTo(85.191315f, 155.14914f, 92.27135f, 152.36159f, 94.39498f, 149.14445f);
                path.cubicTo(95.27298f, 148.79735f, 95.62354f, 148.81863f, 97.60502f, 149.14445f);
                path.cubicTo(96.38775f, 148.81863f, 96.74691f, 148.79735f, 97.60502f, 149.14445f);
                path.cubicTo(99.75284f, 152.36159f, 106.82212f, 155.14914f, 116.865204f, 155.58621f);
                path.cubicTo(126.196144f, 156.04285f, 135.2462f, 152.38712f, 136.1254f, 145.92358f);
                path.cubicTo(135.67705f, 143.90106f, 131.58717f, 140.68864f, 126.4953f, 139.48183f);
                path.cubicTo(129.78922f, 134.8965f, 132.94926f, 129.89098f, 132.91536f, 123.37745f);
                path.cubicTo(138.50232f, 128.93483f, 143.06104f, 131.66068f, 145.7555f, 133.04007f);
                path.cubicTo(149.20982f, 131.66068f, 151.46875f, 114.37079f, 142.54546f, 100.831314f);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-15158035);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(176.66667f, 125.333336f);
                Path path2 = instancePath3;
                path2.cubicTo(176.66667f, 141.90233f, 163.23567f, 155.33333f, 146.66667f, 155.33333f);
                path2.cubicTo(130.09767f, 155.33333f, 116.666664f, 141.90233f, 116.666664f, 125.333336f);
                path2.cubicTo(116.666664f, 108.764336f, 130.09767f, 95.333336f, 146.66667f, 95.333336f);
                path2.cubicTo(163.23567f, 95.333336f, 176.66667f, 108.764336f, 176.66667f, 125.333336f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-1);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(144.0f, 128.0f);
                instancePath4.lineTo(133.33333f, 128.0f);
                instancePath4.lineTo(133.33333f, 122.666664f);
                instancePath4.lineTo(144.0f, 122.666664f);
                instancePath4.lineTo(144.0f, 112.0f);
                instancePath4.lineTo(149.33333f, 112.0f);
                instancePath4.lineTo(149.33333f, 122.666664f);
                instancePath4.lineTo(160.0f, 122.666664f);
                instancePath4.lineTo(160.0f, 128.0f);
                instancePath4.lineTo(149.33333f, 128.0f);
                instancePath4.lineTo(149.33333f, 138.66667f);
                instancePath4.lineTo(144.0f, 138.66667f);
                instancePath4.lineTo(144.0f, 128.0f);
                instancePath4.close();
                instancePath4.moveTo(122.666664f, 125.33551f);
                Path path3 = instancePath4;
                path3.cubicTo(122.666664f, 126.548035f, 122.7566f, 127.739555f, 122.93015f, 128.90376f);
                path3.cubicTo(124.65374f, 140.46556f, 134.62491f, 149.33333f, 146.66667f, 149.33333f);
                path3.cubicTo(159.92313f, 149.33333f, 170.66667f, 138.5898f, 170.66667f, 125.33551f);
                path3.cubicTo(170.66667f, 112.07905f, 159.92313f, 101.333336f, 146.66667f, 101.333336f);
                path3.cubicTo(133.41238f, 101.333336f, 122.666664f, 112.07905f, 122.666664f, 125.33551f);
                instancePath4.close();
                WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
