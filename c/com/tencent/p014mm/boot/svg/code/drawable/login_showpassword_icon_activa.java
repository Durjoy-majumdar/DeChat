package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_showpassword_icon_activa */
public class login_showpassword_icon_activa extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-12206054);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 21.0f);
                Path path = instancePath;
                path.cubicTo(6.57101f, 9.043519f, 19.245094f, 0.23467484f, 33.0f, 0.0f);
                path.cubicTo(47.52035f, -0.5352242f, 61.110394f, 8.483593f, 68.0f, 21.0f);
                path.cubicTo(61.57833f, 32.60043f, 49.461784f, 41.279293f, 36.0f, 42.0f);
                path.cubicTo(21.216398f, 42.959072f, 7.0190334f, 33.850266f, 0.0f, 21.0f);
                instancePath.lineTo(0.0f, 21.0f);
                instancePath.close();
                instancePath.moveTo(30.0f, 10.0f);
                path.cubicTo(25.925423f, 10.998532f, 22.441738f, 15.190254f, 22.0f, 20.0f);
                path.cubicTo(21.223944f, 26.657608f, 27.203108f, 33.174736f, 34.0f, 33.0f);
                path.cubicTo(40.80845f, 33.204678f, 46.76765f, 26.667587f, 46.0f, 20.0f);
                path.cubicTo(45.479984f, 12.565438f, 37.35471f, 7.156121f, 30.0f, 10.0f);
                instancePath.lineTo(30.0f, 10.0f);
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
