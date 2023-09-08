package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_shake_icon */
public class ofm_shake_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.0f, 22.0f);
                Path path = instancePath;
                path.cubicTo(15.747877f, 20.113762f, 16.916676f, 17.966154f, 19.0f, 18.0f);
                path.cubicTo(27.60569f, 17.91621f, 36.306747f, 18.066044f, 45.0f, 18.0f);
                path.cubicTo(45.06774f, 23.380123f, 44.897915f, 28.754135f, 45.0f, 34.0f);
                path.cubicTo(44.977833f, 35.59651f, 46.396374f, 37.03491f, 48.0f, 37.0f);
                path.cubicTo(53.249332f, 37.09484f, 58.623806f, 36.94501f, 64.0f, 37.0f);
                path.cubicTo(63.938343f, 49.67083f, 64.0782f, 62.356697f, 64.0f, 75.0f);
                path.cubicTo(64.018265f, 77.05032f, 61.88046f, 78.26897f, 60.0f, 78.0f);
                path.cubicTo(46.366405f, 77.91936f, 32.670483f, 78.01925f, 19.0f, 78.0f);
                path.cubicTo(16.966625f, 78.029236f, 15.737887f, 75.89162f, 16.0f, 74.0f);
                path.cubicTo(16.02759f, 56.69301f, 16.02759f, 39.292393f, 16.0f, 22.0f);
                instancePath.lineTo(16.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(22.0f, 48.0f);
                instancePath.lineTo(22.0f, 51.0f);
                instancePath.lineTo(42.0f, 51.0f);
                instancePath.lineTo(42.0f, 48.0f);
                instancePath.lineTo(22.0f, 48.0f);
                instancePath.lineTo(22.0f, 48.0f);
                instancePath.close();
                instancePath.moveTo(22.0f, 56.0f);
                instancePath.lineTo(22.0f, 59.0f);
                instancePath.lineTo(48.0f, 59.0f);
                instancePath.lineTo(48.0f, 56.0f);
                instancePath.lineTo(22.0f, 56.0f);
                instancePath.lineTo(22.0f, 56.0f);
                instancePath.close();
                instancePath.moveTo(22.0f, 64.0f);
                instancePath.lineTo(22.0f, 67.0f);
                instancePath.lineTo(48.0f, 67.0f);
                instancePath.lineTo(48.0f, 64.0f);
                instancePath.lineTo(22.0f, 64.0f);
                instancePath.lineTo(22.0f, 64.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(48.0f, 18.0f);
                Path path2 = instancePath2;
                path2.cubicTo(53.348984f, 23.320744f, 58.669502f, 28.65147f, 64.0f, 34.0f);
                path2.cubicTo(59.008896f, 33.872387f, 54.00781f, 34.161884f, 49.0f, 34.0f);
                path2.cubicTo(48.80708f, 33.61284f, 48.35788f, 33.12369f, 48.0f, 33.0f);
                path2.cubicTo(47.848785f, 27.93272f, 48.118305f, 22.961369f, 48.0f, 18.0f);
                instancePath2.lineTo(48.0f, 18.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
