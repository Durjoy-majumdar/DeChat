package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bank_remit_history */
public class bank_remit_history extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16139513);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(26.0f, 23.171574f);
                instancePath.lineTo(33.899494f, 31.071068f);
                Path path = instancePath;
                path.cubicTo(34.680542f, 31.852116f, 34.680542f, 33.118446f, 33.899494f, 33.899494f);
                path.cubicTo(33.118446f, 34.680542f, 31.852116f, 34.680542f, 31.071068f, 33.899494f);
                instancePath.lineTo(22.585787f, 25.414213f);
                Path path2 = instancePath;
                path2.cubicTo(22.390524f, 25.218952f, 22.244078f, 24.993359f, 22.146446f, 24.752602f);
                path2.cubicTo(22.055964f, 24.539213f, 22.0f, 24.276142f, 22.0f, 24.0f);
                instancePath.lineTo(22.0f, 16.0f);
                Path path3 = instancePath;
                path3.cubicTo(22.0f, 14.895431f, 22.89543f, 14.0f, 24.0f, 14.0f);
                path3.cubicTo(25.10457f, 14.0f, 26.0f, 14.895431f, 26.0f, 16.0f);
                instancePath.lineTo(26.0f, 23.171574f);
                instancePath.close();
                instancePath.moveTo(24.727272f, 48.0f);
                Path path4 = instancePath;
                path4.cubicTo(10.745166f, 48.0f, 0.0f, 37.254833f, 0.0f, 24.727272f);
                path4.cubicTo(0.0f, 10.745166f, 10.745166f, 0.0f, 24.727272f, 0.0f);
                path4.cubicTo(37.254833f, 0.0f, 48.0f, 10.745166f, 48.0f, 24.727272f);
                path4.cubicTo(48.0f, 37.254833f, 37.254833f, 48.0f, 24.727272f, 48.0f);
                instancePath.close();
                instancePath.moveTo(24.0f, 44.0f);
                Path path5 = instancePath;
                path5.cubicTo(35.045696f, 44.0f, 44.0f, 35.045696f, 44.0f, 24.0f);
                path5.cubicTo(44.0f, 12.954305f, 35.045696f, 4.0f, 24.0f, 4.0f);
                path5.cubicTo(12.954305f, 4.0f, 4.0f, 12.954305f, 4.0f, 24.0f);
                path5.cubicTo(4.0f, 35.045696f, 12.954305f, 44.0f, 24.0f, 44.0f);
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
