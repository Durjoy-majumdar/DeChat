package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_rtoswatch */
public class connect_rtoswatch extends C24542c {
    private final int height = 24;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 16;
        }
        if (i2 == 1) {
            return 24;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(14.683946f, 3.8377297E-4f);
        instancePath.cubicTo(15.311366f, 0.015399534f, 15.887886f, 0.46939674f, 16.074333f, 1.0705011f);
        instancePath.lineTo(16.10819f, 1.2014544f);
        instancePath.lineTo(16.112272f, 1.2230663f);
        instancePath.lineTo(16.915438f, 5.945878f);
        Path path = instancePath;
        path.cubicTo(18.675446f, 7.376619f, 19.8f, 9.559429f, 19.8f, 12.005002f);
        path.cubicTo(19.8f, 14.451501f, 18.674593f, 16.635038f, 16.913439f, 18.065752f);
        instancePath.lineTo(16.112272f, 22.776934f);
        instancePath.lineTo(16.10819f, 22.798546f);
        path.cubicTo(15.969986f, 23.463507f, 15.356182f, 23.983528f, 14.683946f, 23.999617f);
        instancePath.lineTo(14.651892f, 24.0f);
        instancePath.lineTo(9.345087f, 24.0f);
        path.cubicTo(8.67163f, 24.0f, 8.049007f, 23.490685f, 7.8957305f, 22.830114f);
        instancePath.lineTo(7.8887877f, 22.798546f);
        instancePath.lineTo(7.8847075f, 22.776934f);
        instancePath.lineTo(7.082563f, 18.0625f);
        Path path2 = instancePath;
        path2.cubicTo(5.3237033f, 16.631733f, 4.2f, 14.449649f, 4.2f, 12.005002f);
        path2.cubicTo(4.2f, 9.561281f, 5.322852f, 7.3799253f, 7.0805645f, 5.9491296f);
        instancePath.lineTo(7.8847075f, 1.2230663f);
        instancePath.lineTo(7.8887877f, 1.2014544f);
        instancePath.lineTo(7.8957305f, 1.1698858f);
        path2.cubicTo(8.038789f, 0.553353f, 8.5907f, 0.06858091f, 9.211198f, 0.0066847745f);
        instancePath.lineTo(9.345087f, -8.881784E-16f);
        instancePath.lineTo(14.683946f, 3.8377297E-4f);
        instancePath.close();
        instancePath.moveTo(8.452178f, 18.95619f);
        instancePath.lineTo(9.065f, 22.5598f);
        instancePath.lineTo(9.067499f, 22.569658f);
        path2.cubicTo(9.100064f, 22.683086f, 9.227836f, 22.789812f, 9.331161f, 22.798878f);
        instancePath.lineTo(9.345087f, 22.7995f);
        instancePath.lineTo(14.651892f, 22.7995f);
        instancePath.cubicTo(14.757515f, 22.7995f, 14.895452f, 22.688236f, 14.9294815f, 22.569656f);
        instancePath.lineTo(14.932f, 22.5594f);
        instancePath.lineTo(15.5448065f, 18.957733f);
        Path path3 = instancePath;
        path3.cubicTo(14.481233f, 19.501528f, 13.276422f, 19.808254f, 12.0f, 19.808254f);
        path3.cubicTo(10.722372f, 19.808254f, 9.51649f, 19.500948f, 8.452178f, 18.95619f);
        instancePath.close();
        instancePath.moveTo(12.0f, 5.402251f);
        Path path4 = instancePath;
        path4.cubicTo(8.35492f, 5.402251f, 5.4f, 8.358403f, 5.4f, 12.005002f);
        path4.cubicTo(5.4f, 15.651601f, 8.35492f, 18.607754f, 12.0f, 18.607754f);
        path4.cubicTo(15.64508f, 18.607754f, 18.6f, 15.651601f, 18.6f, 12.005002f);
        path4.cubicTo(18.6f, 8.358403f, 15.64508f, 5.402251f, 12.0f, 5.402251f);
        instancePath.close();
        instancePath.moveTo(14.651892f, 1.2005002f);
        instancePath.lineTo(9.345087f, 1.2005002f);
        instancePath.lineTo(9.331161f, 1.2011226f);
        Path path5 = instancePath;
        path5.cubicTo(9.2485f, 1.2083753f, 9.150195f, 1.2781296f, 9.097506f, 1.3638169f);
        instancePath.lineTo(9.067499f, 1.4303421f);
        instancePath.lineTo(9.065f, 1.4402001f);
        instancePath.lineTo(8.450169f, 5.054843f);
        path5.cubicTo(9.514972f, 4.5094438f, 10.721568f, 4.2017508f, 12.0f, 4.2017508f);
        path5.cubicTo(13.2772255f, 4.2017508f, 14.482751f, 4.508863f, 15.546817f, 5.0532994f);
        instancePath.lineTo(14.932f, 1.4406003f);
        instancePath.lineTo(14.9294815f, 1.4303428f);
        path5.cubicTo(14.895452f, 1.3117635f, 14.757515f, 1.2005002f, 14.651892f, 1.2005002f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(16777215);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
