package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.recharge_hall */
public class recharge_hall extends C24542c {
    private final int height = 36;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 46;
        }
        if (i2 == 1) {
            return 36;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9205837);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.990267f, 0.0f);
        instancePath.lineTo(37.95505f, 0.0f);
        Path path = instancePath;
        path.cubicTo(40.559513f, 1.7584368f, 40.86003f, 5.144684f, 42.122192f, 7.797411f);
        path.cubicTo(43.063805f, 10.480284f, 45.127342f, 13.555036f, 43.214066f, 16.308245f);
        path.cubicTo(40.839996f, 20.166758f, 35.06009f, 19.654299f, 32.565815f, 16.187666f);
        path.cubicTo(30.011436f, 19.634203f, 25.123058f, 19.86531f, 22.03777f, 17.021667f);
        path.cubicTo(18.942465f, 19.87536f, 14.074121f, 19.614107f, 11.52976f, 16.187666f);
        path.cubicTo(8.604748f, 20.4883f, 1.3122491f, 19.734684f, 0.0f, 14.459374f);
        instancePath.lineTo(0.0f, 12.891853f);
        Path path2 = instancePath;
        path2.cubicTo(2.093588f, 8.671605f, 2.5744123f, 3.4264398f, 5.990267f, 0.0f);
        instancePath.lineTo(5.990267f, 0.0f);
        instancePath.close();
        instancePath.moveTo(7.0525346f, 3.0f);
        path2.cubicTo(5.7748885f, 6.6838603f, 4.008143f, 10.197542f, 3.0f, 13.971498f);
        path2.cubicTo(4.3075914f, 17.214895f, 8.759391f, 16.0737f, 9.617809f, 13.100585f);
        path2.cubicTo(10.8355665f, 13.080564f, 12.053323f, 13.020501f, 13.27108f, 12.910385f);
        path2.cubicTo(14.119516f, 14.65221f, 15.756501f, 16.48413f, 17.912529f, 15.883501f);
        path2.cubicTo(19.848963f, 15.112693f, 20.777252f, 13.00048f, 22.004992f, 11.4488535f);
        path2.cubicTo(23.402416f, 13.110595f, 24.47045f, 16.013638f, 27.025742f, 15.933554f);
        path2.cubicTo(28.902285f, 16.153784f, 29.750723f, 14.251791f, 30.698977f, 13.030511f);
        instancePath.lineTo(34.272392f, 13.030511f);
        Path path3 = instancePath;
        path3.cubicTo(35.260574f, 15.923543f, 39.592594f, 17.315f, 41.0f, 13.981508f);
        path3.cubicTo(40.0218f, 10.207553f, 38.235092f, 6.6838603f, 36.96743f, 3.0f);
        instancePath.lineTo(7.0525346f, 3.0f);
        instancePath.lineTo(7.0525346f, 3.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.0f, 21.0f);
        instancePath2.lineTo(7.0f, 21.0f);
        Path path4 = instancePath2;
        path4.cubicTo(6.99f, 25.0f, 7.01f, 29.0f, 7.0f, 33.0f);
        path4.cubicTo(17.0f, 32.99f, 27.0f, 32.99f, 37.0f, 33.0f);
        path4.cubicTo(36.99f, 29.0f, 37.01f, 25.0f, 37.0f, 21.0f);
        instancePath2.lineTo(40.0f, 21.0f);
        instancePath2.lineTo(40.0f, 36.0f);
        instancePath2.lineTo(4.0f, 36.0f);
        instancePath2.lineTo(4.0f, 21.0f);
        instancePath2.lineTo(4.0f, 21.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
