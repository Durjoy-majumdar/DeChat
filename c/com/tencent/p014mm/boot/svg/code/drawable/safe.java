package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.safe */
public class safe extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = 192;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(160.0f, 72.39648f);
                Path path = instancePath;
                path.cubicTo(137.05844f, 81.9421f, 91.2134f, 101.044426f, 91.2134f, 101.044426f);
                path.cubicTo(90.400215f, 101.32394f, 89.52366f, 101.48253f, 88.60908f, 101.48253f);
                path.cubicTo(87.07141f, 101.48253f, 85.63724f, 101.05037f, 84.44385f, 100.3169f);
                instancePath.lineTo(68.06384f, 89.37237f);
                Path path2 = instancePath;
                path2.cubicTo(67.637184f, 89.07502f, 67.11547f, 88.89859f, 66.54096f, 88.89859f);
                path2.cubicTo(65.138466f, 88.89859f, 64.0f, 89.96509f, 64.0f, 91.28137f);
                path2.cubicTo(64.0f, 91.62431f, 64.09293f, 91.97717f, 64.242905f, 92.2884f);
                instancePath.lineTo(78.1263f, 120.87781f);
                instancePath.lineTo(78.45792f, 121.55973f);
                Path path3 = instancePath;
                path3.cubicTo(79.32813f, 123.01477f, 80.9862f, 124.0f, 82.8935f, 124.0f);
                path3.cubicTo(83.71514f, 124.0f, 84.49032f, 123.80969f, 85.17889f, 123.48657f);
                instancePath.lineTo(85.7365f, 123.18327f);
                instancePath.lineTo(160.0f, 82.98299f);
                instancePath.lineTo(160.0f, 90.03031f);
                Path path4 = instancePath;
                path4.cubicTo(160.0f, 128.80115f, 133.61324f, 162.5967f, 96.0f, 172.0f);
                path4.cubicTo(58.38676f, 162.5967f, 32.0f, 128.80115f, 32.0f, 90.03031f);
                instancePath.lineTo(32.0f, 44.0f);
                instancePath.lineTo(96.0f, 20.0f);
                instancePath.lineTo(160.0f, 44.0f);
                instancePath.lineTo(160.0f, 72.39648f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
