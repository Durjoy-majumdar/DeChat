package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_talk */
public class icon_outlined_talk extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.716416f, 2.6669786f);
                Path path = instancePath;
                path.cubicTo(5.709353f, 2.6500275f, 5.701709f, 2.6333249f, 5.693496f, 2.6169f);
                path.cubicTo(5.495905f, 2.2217171f, 5.0153666f, 2.0615377f, 4.6201835f, 2.259129f);
                instancePath.lineTo(1.2f, 3.9692209f);
                instancePath.lineTo(1.2f, 15.436305f);
                instancePath.lineTo(5.1309285f, 17.120989f);
                Path path2 = instancePath;
                path2.cubicTo(5.189761f, 17.146202f, 5.251407f, 17.164265f, 5.3145447f, 17.174788f);
                path2.cubicTo(5.750361f, 17.247423f, 6.162543f, 16.953009f, 6.235179f, 16.51719f);
                instancePath.lineTo(6.9351053f, 12.317634f);
                instancePath.lineTo(9.395764f, 11.497415f);
                instancePath.lineTo(5.716416f, 2.6669786f);
                instancePath.close();
                instancePath.moveTo(9.979364f, 12.567792f);
                instancePath.lineTo(8.0f, 13.22758f);
                instancePath.lineTo(7.418852f, 16.71447f);
                Path path3 = instancePath;
                path3.cubicTo(7.237262f, 17.80401f, 6.2068067f, 18.54005f, 5.1172657f, 18.35846f);
                path3.cubicTo(4.9594226f, 18.332153f, 4.8053074f, 18.286997f, 4.658225f, 18.223963f);
                instancePath.lineTo(0.6060807f, 16.48733f);
                instancePath.cubicTo(0.23839685f, 16.32975f, -2.1826096E-11f, 15.968212f, -2.1826096E-11f, 15.568184f);
                instancePath.lineTo(-2.1827873E-11f, 3.845614f);
                instancePath.cubicTo(-2.1827873E-11f, 3.466842f, 0.21400237f, 3.120579f, 0.5527864f, 2.951187f);
                instancePath.lineTo(4.083527f, 1.1858164f);
                Path path4 = instancePath;
                path4.cubicTo(5.071484f, 0.69183797f, 6.2728305f, 1.0922866f, 6.766809f, 2.0802436f);
                path4.cubicTo(6.7873397f, 2.1213057f, 6.806451f, 2.1630626f, 6.824108f, 2.20544f);
                instancePath.lineTo(10.586214f, 11.234493f);
                Path path5 = instancePath;
                path5.cubicTo(10.798631f, 11.744294f, 10.557553f, 12.329768f, 10.047752f, 12.542186f);
                path5.cubicTo(10.025275f, 12.551551f, 10.002464f, 12.560092f, 9.979364f, 12.567792f);
                instancePath.close();
                instancePath.moveTo(13.808326f, 15.808326f);
                path5.cubicTo(15.076121f, 14.54053f, 15.8f, 12.82909f, 15.8f, 11.0f);
                path5.cubicTo(15.8f, 9.17091f, 15.076121f, 7.45947f, 13.808326f, 6.1916738f);
                instancePath.lineTo(14.656855f, 5.343146f);
                Path path6 = instancePath;
                path6.cubicTo(16.10457f, 6.790861f, 17.0f, 8.790861f, 17.0f, 11.0f);
                path6.cubicTo(17.0f, 13.209139f, 16.10457f, 15.209139f, 14.656855f, 16.656855f);
                instancePath.lineTo(13.808326f, 15.808326f);
                instancePath.close();
                instancePath.moveTo(11.828427f, 13.828427f);
                path6.cubicTo(12.57451f, 13.082344f, 13.0f, 12.076373f, 13.0f, 11.0f);
                path6.cubicTo(13.0f, 9.923627f, 12.57451f, 8.917656f, 11.828427f, 8.171573f);
                instancePath.lineTo(12.676955f, 7.323045f);
                Path path7 = instancePath;
                path7.cubicTo(13.61797f, 8.26406f, 14.2f, 9.564059f, 14.2f, 11.0f);
                path7.cubicTo(14.2f, 12.435941f, 13.61797f, 13.73594f, 12.676955f, 14.676955f);
                instancePath.lineTo(11.828427f, 13.828427f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
