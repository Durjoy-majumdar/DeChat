package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionsheet_default_appbrand_icon */
public class actionsheet_default_appbrand_icon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-855310);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
                path.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
                path.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
                path.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-3355444);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(46.47831f, 37.814087f);
                Path path2 = instancePath2;
                path2.cubicTo(46.42071f, 37.830936f, 46.363693f, 37.848957f, 46.30571f, 37.864826f);
                path2.cubicTo(45.952164f, 37.9663f, 45.5895f, 38.028397f, 45.230137f, 38.028397f);
                path2.cubicTo(43.64432f, 38.028397f, 42.748917f, 36.94647f, 43.229877f, 35.611637f);
                path2.cubicTo(43.58168f, 34.63549f, 44.505203f, 33.811554f, 45.632362f, 33.430145f);
                path2.cubicTo(47.37934f, 32.786633f, 48.599976f, 31.318983f, 48.599976f, 29.611168f);
                path2.cubicTo(48.599976f, 27.309984f, 46.38367f, 25.444473f, 43.649944f, 25.444473f);
                path2.cubicTo(40.916027f, 25.444473f, 38.699917f, 27.309984f, 38.699917f, 29.611168f);
                instancePath2.lineTo(38.699917f, 42.38903f);
                Path path3 = instancePath2;
                path3.cubicTo(38.699917f, 45.46204f, 36.93723f, 48.156776f, 34.29989f, 49.68084f);
                path3.cubicTo(32.86224f, 50.51163f, 31.168789f, 51.0f, 29.350056f, 51.0f);
                path3.cubicTo(24.19426f, 51.0f, 20.0f, 47.13714f, 20.0f, 42.38903f);
                path3.cubicTo(20.0f, 40.877697f, 20.427824f, 39.458237f, 21.173315f, 38.222336f);
                path3.cubicTo(22.327042f, 36.309612f, 24.24953f, 34.844902f, 26.552137f, 34.177097f);
                path3.cubicTo(26.554075f, 34.17651f, 26.55582f, 34.175922f, 26.55776f, 34.17533f);
                path3.cubicTo(26.946022f, 34.05329f, 27.348633f, 33.98551f, 27.74562f, 33.98551f);
                path3.cubicTo(29.338419f, 33.98551f, 30.238089f, 35.072533f, 29.754993f, 36.413242f);
                path3.cubicTo(29.42763f, 37.321804f, 28.545996f, 38.10421f, 27.518133f, 38.52049f);
                path3.cubicTo(27.39537f, 38.56182f, 27.275908f, 38.60825f, 27.157993f, 38.657223f);
                path3.cubicTo(25.525244f, 39.338154f, 24.400026f, 40.75115f, 24.400026f, 42.38903f);
                path3.cubicTo(24.400026f, 44.690212f, 26.616135f, 46.555527f, 29.350056f, 46.555527f);
                path3.cubicTo(32.083782f, 46.555527f, 34.29989f, 44.690212f, 34.29989f, 42.38903f);
                instancePath2.lineTo(34.29989f, 29.611168f);
                Path path4 = instancePath2;
                path4.cubicTo(34.29989f, 26.537962f, 36.06238f, 23.84342f, 38.699917f, 22.319159f);
                path4.cubicTo(40.137566f, 21.488367f, 41.831017f, 21.0f, 43.649944f, 21.0f);
                path4.cubicTo(48.805546f, 21.0f, 53.0f, 24.86286f, 53.0f, 29.611168f);
                path4.cubicTo(53.0f, 31.122305f, 52.571983f, 32.541958f, 51.826492f, 33.777863f);
                path4.cubicTo(50.677807f, 35.68216f, 48.767147f, 37.14197f, 46.47831f, 37.814087f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
