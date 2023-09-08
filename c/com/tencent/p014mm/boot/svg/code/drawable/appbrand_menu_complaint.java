package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_menu_complaint */
public class appbrand_menu_complaint extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(30.995142f, 4.200261f);
                instancePath.lineTo(4.2348604f, 50.562687f);
                instancePath.lineTo(57.764397f, 50.5582f);
                instancePath.lineTo(30.995142f, 4.200261f);
                instancePath.close();
                instancePath.moveTo(3.1959684f, 54.162773f);
                Path path = instancePath;
                path.cubicTo(1.5391141f, 54.162773f, 0.19571695f, 52.819878f, 0.19571695f, 51.163025f);
                path.cubicTo(0.19571695f, 50.636444f, 0.33423185f, 50.11913f, 0.59746903f, 49.66307f);
                instancePath.lineTo(28.396782f, 1.5005151f);
                Path path2 = instancePath;
                path2.cubicTo(29.225044f, 0.06554246f, 31.05976f, -0.42629305f, 32.49473f, 0.40196982f);
                path2.cubicTo(32.950855f, 0.6652439f, 33.32964f, 1.0439538f, 33.593f, 1.5000292f);
                instancePath.lineTo(61.40163f, 49.657925f);
                Path path3 = instancePath;
                path3.cubicTo(62.230164f, 51.092743f, 61.73867f, 52.927547f, 60.303852f, 53.75608f);
                path3.cubicTo(59.847824f, 54.019413f, 59.330513f, 54.15807f, 58.803913f, 54.15811f);
                instancePath.lineTo(3.1959684f, 54.162773f);
                instancePath.close();
                instancePath.moveTo(29.117676f, 20.862305f);
                instancePath.lineTo(32.882324f, 20.862305f);
                instancePath.lineTo(32.589355f, 35.027344f);
                instancePath.lineTo(29.410645f, 35.027344f);
                instancePath.lineTo(29.117676f, 20.862305f);
                instancePath.close();
                instancePath.moveTo(30.992676f, 42.29297f);
                Path path4 = instancePath;
                path4.cubicTo(29.806152f, 42.29297f, 28.868652f, 41.370117f, 28.868652f, 40.21289f);
                path4.cubicTo(28.868652f, 39.055664f, 29.806152f, 38.14746f, 30.992676f, 38.14746f);
                path4.cubicTo(32.193848f, 38.14746f, 33.131348f, 39.055664f, 33.131348f, 40.21289f);
                path4.cubicTo(33.131348f, 41.370117f, 32.193848f, 42.29297f, 30.992676f, 42.29297f);
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
