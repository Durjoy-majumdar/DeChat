package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_safe */
public class icons_outlined_pay_safe extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 7.5f);
        instancePath.lineTo(60.0f, 16.5f);
        instancePath.lineTo(60.0f, 33.761368f);
        Path path = instancePath;
        path.cubicTo(60.0f, 48.30043f, 50.104965f, 60.97376f, 36.0f, 64.5f);
        path.cubicTo(21.895035f, 60.97376f, 12.0f, 48.30043f, 12.0f, 33.761368f);
        instancePath.lineTo(12.0f, 16.5f);
        instancePath.lineTo(36.0f, 7.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 11.210795f);
        instancePath.lineTo(15.6f, 19.310795f);
        instancePath.lineTo(15.6f, 33.761368f);
        Path path2 = instancePath;
        path2.cubicTo(15.6f, 46.34637f, 23.964329f, 57.35426f, 36.0f, 60.774364f);
        path2.cubicTo(48.03567f, 57.35426f, 56.4f, 46.34637f, 56.4f, 33.761368f);
        instancePath.lineTo(56.400734f, 30.980385f);
        instancePath.cubicTo(46.56331f, 36.305576f, 30.986734f, 44.73748f, 30.986734f, 44.73748f);
        instancePath.lineTo(30.8075f, 44.83497f);
        Path path3 = instancePath;
        path3.cubicTo(30.586174f, 44.93883f, 30.337011f, 45.0f, 30.072912f, 45.0f);
        path3.cubicTo(29.45985f, 45.0f, 28.9269f, 44.68332f, 28.647186f, 44.21563f);
        instancePath.lineTo(28.540596f, 43.996437f);
        instancePath.lineTo(24.078075f, 34.806988f);
        Path path4 = instancePath;
        path4.cubicTo(24.029873f, 34.706947f, 24.0f, 34.59353f, 24.0f, 34.483295f);
        path4.cubicTo(24.0f, 34.060207f, 24.365936f, 33.717403f, 24.816736f, 33.717403f);
        path4.cubicTo(25.001402f, 33.717403f, 25.169094f, 33.774113f, 25.306236f, 33.86969f);
        instancePath.lineTo(30.571238f, 37.387577f);
        Path path5 = instancePath;
        path5.cubicTo(30.954824f, 37.623333f, 31.41581f, 37.76224f, 31.91006f, 37.76224f);
        path5.cubicTo(32.204033f, 37.76224f, 32.485783f, 37.711266f, 32.747166f, 37.62142f);
        path5.cubicTo(32.747166f, 37.62142f, 49.806355f, 30.513344f, 56.40019f, 27.771275f);
        instancePath.lineTo(56.4f, 19.310795f);
        instancePath.lineTo(36.0f, 11.210795f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
