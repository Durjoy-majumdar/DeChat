package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_exclusive_hb */
public class lucky_money_exclusive_hb extends C24542c {
    private final int height = 45;
    private final int width = 93;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 93;
        }
        if (i2 == 1) {
            return 45;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-17623);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(6.0f, 0.0f);
        instancePath.lineTo(87.0f, 0.0f);
        instancePath.cubicTo(90.313705f, -6.087184E-16f, 93.0f, 2.6862915f, 93.0f, 6.0f);
        instancePath.lineTo(93.0f, 39.0f);
        instancePath.cubicTo(93.0f, 42.31371f, 90.313705f, 45.0f, 87.0f, 45.0f);
        instancePath.lineTo(6.0f, 45.0f);
        Path path = instancePath;
        path.cubicTo(2.6862915f, 45.0f, 4.0581224E-16f, 42.31371f, 0.0f, 39.0f);
        instancePath.lineTo(0.0f, 6.0f);
        path.cubicTo(-4.0581224E-16f, 2.6862915f, 2.6862915f, 6.087184E-16f, 6.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.624f, 39.66f);
        instancePath2.lineTo(38.064f, 37.392f);
        Path path2 = instancePath2;
        path2.cubicTo(36.084f, 36.456f, 33.996f, 35.556f, 31.836f, 34.764f);
        path2.cubicTo(35.544f, 32.1f, 38.244f, 29.4f, 39.972f, 26.736f);
        instancePath2.lineTo(39.972f, 24.504f);
        instancePath2.lineTo(22.836f, 24.504f);
        instancePath2.cubicTo(23.34f, 23.028f, 23.88f, 21.444f, 24.384f, 19.752f);
        instancePath2.lineTo(44.328f, 19.752f);
        instancePath2.lineTo(44.328f, 17.232f);
        instancePath2.lineTo(25.068f, 17.232f);
        instancePath2.cubicTo(25.428f, 15.828f, 25.788f, 14.352f, 26.148f, 12.768f);
        instancePath2.lineTo(42.204f, 12.768f);
        instancePath2.lineTo(42.204f, 10.356f);
        instancePath2.lineTo(26.688f, 10.356f);
        instancePath2.cubicTo(26.976f, 9.06f, 27.228f, 7.656f, 27.516f, 6.216f);
        instancePath2.lineTo(24.852f, 6.0f);
        instancePath2.cubicTo(24.564f, 7.44f, 24.276f, 8.88f, 23.952f, 10.356f);
        instancePath2.lineTo(14.448f, 10.356f);
        instancePath2.lineTo(14.448f, 12.768f);
        instancePath2.lineTo(23.412f, 12.768f);
        Path path3 = instancePath2;
        path3.cubicTo(23.052f, 14.28f, 22.692f, 15.756f, 22.296f, 17.232f);
        instancePath2.lineTo(12.0f, 17.232f);
        instancePath2.lineTo(12.0f, 19.752f);
        instancePath2.lineTo(21.576f, 19.752f);
        path3.cubicTo(20.82f, 22.236f, 19.992f, 24.612f, 19.128f, 26.916f);
        instancePath2.lineTo(36.912f, 26.916f);
        Path path4 = instancePath2;
        path4.cubicTo(35.004f, 29.292f, 32.376f, 31.596f, 29.064f, 33.756f);
        path4.cubicTo(26.58f, 32.892f, 23.988f, 32.064f, 21.288f, 31.344f);
        instancePath2.lineTo(19.92f, 33.36f);
        instancePath2.cubicTo(25.644f, 34.908f, 31.224f, 36.996f, 36.624f, 39.66f);
        instancePath2.close();
        instancePath2.moveTo(49.692f, 38.76f);
        instancePath2.cubicTo(52.428f, 33.036f, 53.832f, 26.16f, 53.868f, 18.168f);
        instancePath2.lineTo(53.868f, 14.352f);
        instancePath2.lineTo(78.456f, 14.352f);
        instancePath2.lineTo(78.456f, 7.62f);
        instancePath2.lineTo(51.348f, 7.62f);
        instancePath2.lineTo(51.348f, 18.168f);
        instancePath2.cubicTo(51.312f, 25.872f, 50.124f, 32.172f, 47.784f, 37.032f);
        instancePath2.lineTo(49.692f, 38.76f);
        instancePath2.close();
        instancePath2.moveTo(75.972f, 12.372f);
        instancePath2.lineTo(53.868f, 12.372f);
        instancePath2.lineTo(53.868f, 9.708f);
        instancePath2.lineTo(75.972f, 9.708f);
        instancePath2.lineTo(75.972f, 12.372f);
        instancePath2.close();
        instancePath2.moveTo(57.864f, 39.264f);
        instancePath2.lineTo(57.864f, 30.552f);
        instancePath2.lineTo(65.676f, 30.552f);
        instancePath2.lineTo(65.676f, 33.864f);
        instancePath2.cubicTo(63.84f, 34.008f, 61.968f, 34.116f, 60.024f, 34.26f);
        instancePath2.lineTo(60.564f, 36.42f);
        Path path5 = instancePath2;
        path5.cubicTo(64.776f, 36.024f, 68.736f, 35.556f, 72.48f, 35.052f);
        path5.cubicTo(72.66f, 35.556f, 72.84f, 36.132f, 73.056f, 36.708f);
        instancePath2.lineTo(74.856f, 35.916f);
        instancePath2.cubicTo(74.208f, 34.044f, 73.452f, 32.28f, 72.588f, 30.552f);
        instancePath2.lineTo(76.872f, 30.552f);
        instancePath2.lineTo(76.872f, 35.664f);
        instancePath2.cubicTo(76.872f, 36.6f, 76.44f, 37.068f, 75.648f, 37.068f);
        instancePath2.lineTo(72.012f, 36.96f);
        instancePath2.lineTo(72.588f, 39.156f);
        instancePath2.lineTo(76.368f, 39.156f);
        instancePath2.cubicTo(78.24f, 39.156f, 79.212f, 38.148f, 79.212f, 36.168f);
        instancePath2.lineTo(79.212f, 28.464f);
        instancePath2.lineTo(68.124f, 28.464f);
        instancePath2.lineTo(68.124f, 26.412f);
        instancePath2.lineTo(76.764f, 26.412f);
        instancePath2.lineTo(76.764f, 20.148f);
        instancePath2.lineTo(68.124f, 20.148f);
        instancePath2.lineTo(68.124f, 18.168f);
        instancePath2.cubicTo(71.868f, 17.988f, 75.18f, 17.736f, 78.024f, 17.376f);
        instancePath2.lineTo(76.944f, 15.504f);
        instancePath2.cubicTo(71.256f, 16.152f, 64.092f, 16.476f, 55.488f, 16.476f);
        instancePath2.lineTo(56.136f, 18.42f);
        instancePath2.cubicTo(59.52f, 18.42f, 62.724f, 18.348f, 65.676f, 18.276f);
        instancePath2.lineTo(65.676f, 20.148f);
        instancePath2.lineTo(57.18f, 20.148f);
        instancePath2.lineTo(57.18f, 26.412f);
        instancePath2.lineTo(65.676f, 26.412f);
        instancePath2.lineTo(65.676f, 28.464f);
        instancePath2.lineTo(55.452f, 28.464f);
        instancePath2.lineTo(55.452f, 39.264f);
        instancePath2.lineTo(57.864f, 39.264f);
        instancePath2.close();
        instancePath2.moveTo(74.424f, 24.54f);
        instancePath2.lineTo(68.124f, 24.54f);
        instancePath2.lineTo(68.124f, 22.056f);
        instancePath2.lineTo(74.424f, 22.056f);
        instancePath2.lineTo(74.424f, 24.54f);
        instancePath2.close();
        instancePath2.moveTo(65.676f, 24.54f);
        instancePath2.lineTo(59.556f, 24.54f);
        instancePath2.lineTo(59.556f, 22.056f);
        instancePath2.lineTo(65.676f, 22.056f);
        instancePath2.lineTo(65.676f, 24.54f);
        instancePath2.close();
        instancePath2.moveTo(67.98f, 33.648f);
        instancePath2.lineTo(67.98f, 30.552f);
        instancePath2.lineTo(70.536f, 30.552f);
        instancePath2.cubicTo(70.968f, 31.344f, 71.364f, 32.244f, 71.76f, 33.216f);
        instancePath2.lineTo(67.98f, 33.648f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
