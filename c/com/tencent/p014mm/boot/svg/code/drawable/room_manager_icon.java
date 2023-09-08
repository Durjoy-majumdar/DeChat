package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.room_manager_icon */
public class room_manager_icon extends C24542c {
    private final int height = 100;
    private final int width = 100;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 100;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-15028967);
        instancePaint4.setStrokeWidth(1.96f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(49.0f, 0.97999954f);
        Path path = instancePath;
        path.cubicTo(75.52071f, 0.97999954f, 97.020004f, 22.479284f, 97.020004f, 49.0f);
        path.cubicTo(97.020004f, 75.52071f, 75.52071f, 97.020004f, 49.0f, 97.020004f);
        path.cubicTo(22.479284f, 97.020004f, 0.97999954f, 75.52071f, 0.97999954f, 49.0f);
        path.cubicTo(0.97999954f, 22.479284f, 22.479284f, 0.97999954f, 49.0f, 0.97999954f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15028967);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(45.596504f, 87.3795f);
        instancePath2.cubicTo(45.311245f, 88.29637f, 45.56067f, 89.657684f, 46.151157f, 90.41694f);
        instancePath2.lineTo(47.928844f, 92.7027f);
        instancePath2.cubicTo(48.520428f, 93.46336f, 49.480667f, 93.46195f, 50.071156f, 92.7027f);
        instancePath2.lineTo(51.848843f, 90.41694f);
        instancePath2.cubicTo(52.440426f, 89.65628f, 52.686527f, 88.28921f, 52.403496f, 87.3795f);
        instancePath2.lineTo(49.516502f, 78.100136f);
        instancePath2.cubicTo(49.231247f, 77.18327f, 48.766525f, 77.19043f, 48.483498f, 78.100136f);
        instancePath2.lineTo(45.596504f, 87.3795f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-15028967);
        instancePaint6.setStrokeWidth(1.96f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(78.48931f, 86.901474f);
        instancePath3.cubicTo(78.21859f, 86.711105f, 77.946815f, 86.55085f, 77.6791f, 86.42441f);
        instancePath3.lineTo(58.566147f, 77.39736f);
        instancePath3.cubicTo(54.962547f, 75.69538f, 54.140015f, 71.74742f, 56.766563f, 68.75442f);
        instancePath3.lineTo(58.378567f, 66.91751f);
        instancePath3.cubicTo(60.96644f, 63.968586f, 63.106014f, 58.298977f, 63.106014f, 54.3906f);
        instancePath3.lineTo(63.106014f, 48.363018f);
        Path path2 = instancePath3;
        path2.cubicTo(63.106014f, 40.597996f, 56.79056f, 34.3f, 49.000072f, 34.3f);
        path2.cubicTo(41.207775f, 34.3f, 34.894135f, 40.596203f, 34.894135f, 48.363018f);
        instancePath3.lineTo(34.894135f, 54.3906f);
        instancePath3.cubicTo(34.894135f, 58.2991f, 37.033085f, 63.96649f, 39.621418f, 66.91444f);
        instancePath3.lineTo(41.23342f, 68.75041f);
        instancePath3.cubicTo(43.86102f, 71.74308f, 43.038033f, 75.68944f, 39.43416f, 77.39232f);
        instancePath3.lineTo(20.305996f, 86.43065f);
        Path path3 = instancePath3;
        path3.cubicTo(20.043016f, 86.55491f, 19.775612f, 86.712585f, 19.508852f, 86.90005f);
        path3.cubicTo(27.86791f, 93.41537f, 38.156105f, 97.02f, 49.0f, 97.02f);
        path3.cubicTo(59.84309f, 97.02f, 70.13057f, 93.41591f, 78.48931f, 86.901474f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
