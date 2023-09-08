package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.remittance_discount_favor */
public class remittance_discount_favor extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
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
            canvas.saveLayerAlpha((RectF) null, 230, 31);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint paint = instancePaint3;
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Paint instancePaint4 = C24542c.instancePaint(paint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(20.0f, 0.0f);
            instancePath.lineTo(20.0f, 20.0f);
            instancePath.lineTo(0.0f, 20.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint4, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(paint, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(18.6525f, 2.614375f);
            instancePath2.cubicTo(18.588991f, 2.030811f, 18.127975f, 1.5700549f, 17.544374f, 1.506875f);
            instancePath2.lineTo(10.770625f, 0.773125f);
            instancePath2.cubicTo(10.394268f, 0.73253405f, 10.019754f, 0.86441797f, 9.751875f, 1.131875f);
            instancePath2.lineTo(1.255625f, 9.62875f);
            instancePath2.cubicTo(0.76764756f, 10.116875f, 0.76764756f, 10.908125f, 1.255625f, 11.39625f);
            instancePath2.lineTo(8.76875f, 18.909374f);
            instancePath2.cubicTo(9.256875f, 19.397352f, 10.048125f, 19.397352f, 10.53625f, 18.909374f);
            instancePath2.lineTo(19.0325f, 10.413125f);
            instancePath2.cubicTo(19.300373f, 10.14525f, 19.432314f, 9.770349f, 19.39125f, 9.39375f);
            instancePath2.lineTo(18.6525f, 2.614375f);
            instancePath2.close();
            instancePath2.moveTo(9.6525f, 18.025625f);
            instancePath2.lineTo(2.139375f, 10.5125f);
            instancePath2.lineTo(10.635625f, 2.01625f);
            instancePath2.lineTo(17.41f, 2.749375f);
            instancePath2.lineTo(18.14875f, 9.529375f);
            instancePath2.lineTo(9.6525f, 18.025625f);
            instancePath2.close();
            instancePath2.moveTo(13.864375f, 3.915625f);
            Path path = instancePath2;
            path.cubicTo(12.656252f, 3.915625f, 11.676875f, 4.895002f, 11.676875f, 6.103125f);
            path.cubicTo(11.676875f, 7.311248f, 12.656252f, 8.290625f, 13.864375f, 8.290625f);
            path.cubicTo(15.072498f, 8.290625f, 16.051874f, 7.311248f, 16.051874f, 6.103125f);
            path.cubicTo(16.051874f, 4.895002f, 15.072498f, 3.915625f, 13.864375f, 3.915625f);
            instancePath2.lineTo(13.864375f, 3.915625f);
            instancePath2.close();
            instancePath2.moveTo(13.864375f, 7.040625f);
            Path path2 = instancePath2;
            path2.cubicTo(13.529326f, 7.0405135f, 13.2197895f, 6.8616643f, 13.0523615f, 6.5714483f);
            path2.cubicTo(12.884934f, 6.281232f, 12.885054f, 5.92374f, 13.052674f, 5.6336355f);
            path2.cubicTo(13.220295f, 5.343531f, 13.529952f, 5.1648884f, 13.865f, 5.165f);
            path2.cubicTo(14.382939f, 5.1651726f, 14.802672f, 5.5851855f, 14.8025f, 6.103125f);
            path2.cubicTo(14.802327f, 6.6210647f, 14.382315f, 7.0407977f, 13.864375f, 7.040625f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
