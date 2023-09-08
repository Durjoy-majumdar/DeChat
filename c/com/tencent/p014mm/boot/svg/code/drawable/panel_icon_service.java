package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_service */
public class panel_icon_service extends C24542c {
    private final int height = 168;
    private final int width = 168;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 168;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-8617594);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 50.0f, 0.0f, 1.0f, 36.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.867924f, 54.0f);
        instancePath.lineTo(2.0f, 54.0f);
        Path path = instancePath;
        path.cubicTo(1.277121f, 54.0f, 0.50183654f, 53.545902f, -1.0658141E-14f, 53.0f);
        path.cubicTo(-0.17057356f, 51.97461f, 0.02324753f, 51.06792f, 1.0f, 50.0f);
        instancePath.lineTo(43.0f, 1.0f);
        Path path2 = instancePath;
        path2.cubicTo(43.767178f, 0.09632745f, 44.461952f, -0.13072085f, 45.0f, 7.1054274E-15f);
        path2.cubicTo(45.696445f, 0.28127408f, 46.048306f, 0.8571648f, 46.0f, 1.0f);
        instancePath.lineTo(42.132076f, 42.0f);
        instancePath.lineTo(67.0f, 42.0f);
        Path path3 = instancePath;
        path3.cubicTo(67.66808f, 42.0f, 68.47741f, 42.454098f, 69.0f, 43.0f);
        path3.cubicTo(69.17823f, 44.026894f, 68.97627f, 44.93208f, 68.0f, 46.0f);
        instancePath.lineTo(24.0f, 95.0f);
        Path path4 = instancePath;
        path4.cubicTo(23.331083f, 95.90367f, 22.604643f, 96.12922f, 22.0f, 96.0f);
        path4.cubicTo(21.31604f, 95.717224f, 20.949804f, 95.14284f, 21.0f, 95.0f);
        instancePath.lineTo(24.867924f, 54.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
