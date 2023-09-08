package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_friendcard */
public class panel_icon_friendcard extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.002084f, 68.210526f);
                instancePath.cubicTo(1.3440788f, 68.210526f, 2.1281295E-14f, 66.87234f, 1.4251356E-14f, 65.205696f);
                instancePath.lineTo(0.0f, 61.82702f);
                instancePath.cubicTo(-1.17800506E-14f, 59.230892f, 1.8877298f, 56.205124f, 4.2218437f, 55.0661f);
                instancePath.lineTo(25.671602f, 44.598858f);
                instancePath.cubicTo(28.782482f, 43.080784f, 29.505823f, 39.718468f, 27.25937f, 37.055893f);
                instancePath.lineTo(25.889353f, 35.432102f);
                instancePath.cubicTo(23.101835f, 32.12824f, 20.842106f, 25.955986f, 20.842106f, 21.635206f);
                instancePath.lineTo(20.842106f, 15.156304f);
                Path path = instancePath;
                path.cubicTo(20.842106f, 6.785709f, 27.64556f, 0.0f, 36.0f, 0.0f);
                path.cubicTo(44.371475f, 0.0f, 51.157894f, 6.794451f, 51.157894f, 15.158681f);
                instancePath.lineTo(51.157894f, 21.638597f);
                instancePath.cubicTo(51.157894f, 25.955227f, 48.887745f, 32.145576f, 46.110645f, 35.43754f);
                instancePath.lineTo(44.740627f, 37.061554f);
                instancePath.cubicTo(42.50665f, 39.70971f, 43.204502f, 43.080242f, 46.328396f, 44.60404f);
                instancePath.lineTo(67.77816f, 55.066956f);
                instancePath.cubicTo(70.10982f, 56.204308f, 72.0f, 59.21117f, 72.0f, 61.82702f);
                instancePath.lineTo(72.0f, 65.205696f);
                instancePath.cubicTo(72.0f, 66.86522f, 70.65759f, 68.210526f, 68.99792f, 68.210526f);
                instancePath.lineTo(3.002084f, 68.210526f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
