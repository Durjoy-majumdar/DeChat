package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_groupcall */
public class icons_filled_groupcall extends C24542c {
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.75f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(21.11145f, 35.13855f);
                Path path = instancePath;
                path.cubicTo(26.724855f, 40.751953f, 32.04362f, 43.38484f, 34.01052f, 43.23066f);
                path.cubicTo(35.977425f, 43.076477f, 40.875557f, 39.70802f, 43.187878f, 39.752857f);
                path.cubicTo(44.2992f, 39.774403f, 51.561333f, 44.685787f, 52.440414f, 45.25362f);
                path.cubicTo(53.319496f, 45.821457f, 54.134598f, 46.48476f, 53.98133f, 47.32411f);
                path.cubicTo(53.828064f, 48.163452f, 50.63644f, 57.40883f, 42.488228f, 56.128555f);
                path.cubicTo(34.340015f, 54.84828f, 22.980268f, 46.064373f, 16.507206f, 39.742794f);
                instancePath.lineTo(21.11145f, 35.13855f);
                instancePath.lineTo(21.11145f, 35.13855f);
                instancePath.close();
                instancePath.moveTo(21.11145f, 35.13855f);
                path.cubicTo(15.498045f, 29.525145f, 12.865161f, 24.20638f, 13.019342f, 22.23948f);
                path.cubicTo(13.173524f, 20.272577f, 16.541979f, 15.374443f, 16.497145f, 13.062124f);
                path.cubicTo(16.475595f, 11.950804f, 11.564215f, 4.6886683f, 10.996378f, 3.8095868f);
                path.cubicTo(10.428542f, 2.930505f, 9.765239f, 2.1154017f, 8.925893f, 2.2686687f);
                path.cubicTo(8.086547f, 2.4219356f, -1.1588273f, 5.61356f, 0.12144489f, 13.761772f);
                path.cubicTo(1.4017171f, 21.909985f, 10.185628f, 33.26973f, 16.507206f, 39.742794f);
                instancePath.lineTo(21.11145f, 35.13855f);
                instancePath.lineTo(21.11145f, 35.13855f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(53.971874f, 0.053102057f);
                instancePath2.cubicTo(54.64404f, -0.14035298f, 55.35f, 0.1986633f, 55.35f, 1.0064609f);
                instancePath2.lineTo(55.35f, 1.0064609f);
                instancePath2.lineTo(55.35f, 15.783524f);
                Path path2 = instancePath2;
                path2.cubicTo(55.35f, 16.505203f, 54.711605f, 16.976877f, 53.971874f, 16.736883f);
                path2.cubicTo(53.702324f, 16.44676f, 50.371426f, 13.285236f, 48.0f, 11.115414f);
                instancePath2.lineTo(48.0f, 11.115414f);
                instancePath2.lineTo(48.0f, 5.6177707f);
                Path path3 = instancePath2;
                path3.cubicTo(50.31497f, 3.4772277f, 53.573166f, 0.4064558f, 53.971874f, 0.053102057f);
                instancePath2.close();
                instancePath2.moveTo(45.00113f, 1.05f);
                path3.cubicTo(45.497562f, 1.05f, 45.9f, 1.4356334f, 45.9f, 1.9146714f);
                instancePath2.lineTo(45.9f, 14.885328f);
                instancePath2.cubicTo(45.9f, 15.362873f, 45.496502f, 15.75f, 45.00113f, 15.75f);
                instancePath2.lineTo(27.898872f, 15.75f);
                instancePath2.cubicTo(27.40244f, 15.75f, 27.0f, 15.364367f, 27.0f, 14.885328f);
                instancePath2.lineTo(27.0f, 1.9146714f);
                instancePath2.cubicTo(27.0f, 1.4371266f, 27.403498f, 1.05f, 27.898872f, 1.05f);
                instancePath2.lineTo(45.00113f, 1.05f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
