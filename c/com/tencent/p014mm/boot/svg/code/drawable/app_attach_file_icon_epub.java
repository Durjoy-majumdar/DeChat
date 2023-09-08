package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_epub */
public class app_attach_file_icon_epub extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9061376);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(48.705883f, 0.0f);
        instancePath.lineTo(72.0f, 23.466667f);
        instancePath.lineTo(72.0f, 92.8f);
        instancePath.cubicTo(72.0f, 94.567314f, 70.57784f, 96.0f, 68.82353f, 96.0f);
        instancePath.lineTo(3.1764705f, 96.0f);
        instancePath.cubicTo(1.4221543f, 96.0f, 0.0f, 94.567314f, 0.0f, 92.8f);
        instancePath.lineTo(0.0f, 3.2f);
        instancePath.cubicTo(0.0f, 1.4326888f, 1.4221543f, 0.0f, 3.1764705f, 0.0f);
        instancePath.lineTo(48.705883f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-10643968);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(72.0f, 23.466667f);
        instancePath2.lineTo(51.88235f, 23.466667f);
        instancePath2.cubicTo(50.128036f, 23.466667f, 48.705883f, 22.033978f, 48.705883f, 20.266666f);
        instancePath2.lineTo(48.705883f, 0.0f);
        instancePath2.lineTo(72.0f, 23.466667f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(47.085407f, 52.03281f);
        instancePath3.lineTo(39.05294f, 43.94084f);
        instancePath3.cubicTo(37.365738f, 42.241146f, 34.62499f, 42.241474f, 32.934345f, 43.94464f);
        instancePath3.lineTo(20.328278f, 56.644085f);
        instancePath3.cubicTo(18.636656f, 58.34824f, 18.635946f, 61.106934f, 20.324509f, 62.808002f);
        instancePath3.lineTo(32.94706f, 75.524055f);
        instancePath3.cubicTo(34.634262f, 77.223755f, 37.37501f, 77.22343f, 39.065655f, 75.520256f);
        instancePath3.lineTo(51.671722f, 62.820812f);
        instancePath3.cubicTo(53.363346f, 61.116657f, 53.36405f, 58.357964f, 51.67549f, 56.656895f);
        instancePath3.lineTo(51.291756f, 56.270317f);
        instancePath3.lineTo(36.00365f, 71.67167f);
        instancePath3.lineTo(33.900475f, 69.55291f);
        instancePath3.lineTo(26.252567f, 61.84835f);
        instancePath3.lineTo(24.149393f, 59.7296f);
        instancePath3.lineTo(35.997993f, 47.793232f);
        instancePath3.lineTo(40.20434f, 52.03074f);
        instancePath3.lineTo(32.560085f, 59.73162f);
        instancePath3.lineTo(36.001644f, 63.198673f);
        instancePath3.lineTo(47.085407f, 52.03281f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
