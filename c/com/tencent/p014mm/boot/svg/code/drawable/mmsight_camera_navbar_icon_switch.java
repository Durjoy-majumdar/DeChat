package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mmsight_camera_navbar_icon_switch */
public class mmsight_camera_navbar_icon_switch extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-855310);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(4.0f, 56.998116f);
        Path path = instancePath;
        path.cubicTo(4.0f, 56.9978f, 73.99772f, 57.0f, 73.99772f, 57.0f);
        path.cubicTo(74.00232f, 57.0f, 74.0f, 14.001884f, 74.0f, 14.001884f);
        path.cubicTo(74.0f, 14.004772f, 56.5f, 14.0f, 56.5f, 14.0f);
        instancePath.lineTo(49.0f, 4.0f);
        instancePath.lineTo(29.0f, 4.0f);
        instancePath.lineTo(21.5f, 14.0f);
        instancePath.lineTo(3.999805f, 14.0f);
        instancePath.cubicTo(3.9999309f, 14.00048f, 4.0f, 56.998116f, 4.0f, 56.998116f);
        instancePath.close();
        instancePath.moveTo(3.993171f, 10.0f);
        instancePath.lineTo(19.5f, 10.0f);
        instancePath.lineTo(27.0f, 0.0f);
        instancePath.lineTo(51.0f, 0.0f);
        instancePath.lineTo(58.5f, 10.0f);
        instancePath.lineTo(74.00683f, 10.0f);
        instancePath.cubicTo(76.20044f, 10.0f, 78.0f, 11.791705f, 78.0f, 14.001884f);
        instancePath.lineTo(78.0f, 56.998116f);
        instancePath.cubicTo(78.0f, 59.214787f, 76.20812f, 61.0f, 73.99772f, 61.0f);
        instancePath.lineTo(4.002278f, 61.0f);
        instancePath.cubicTo(1.7944237f, 61.0f, 0.0f, 59.208294f, 0.0f, 56.998116f);
        instancePath.lineTo(0.0f, 14.001884f);
        instancePath.cubicTo(0.0f, 11.785213f, 1.7878035f, 10.0f, 3.993171f, 10.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(21.0f, 33.0f);
        Path path2 = instancePath2;
        path2.cubicTo(21.0f, 42.941124f, 29.058874f, 51.0f, 39.0f, 51.0f);
        path2.cubicTo(44.03602f, 51.0f, 48.588997f, 48.93187f, 51.855957f, 45.598595f);
        instancePath2.lineTo(49.027344f, 42.769985f);
        Path path3 = instancePath2;
        path3.cubicTo(46.484406f, 45.379486f, 42.931446f, 47.0f, 39.0f, 47.0f);
        path3.cubicTo(31.268013f, 47.0f, 25.0f, 40.731987f, 25.0f, 33.0f);
        instancePath2.lineTo(30.5f, 33.0f);
        instancePath2.lineTo(22.5f, 25.0f);
        instancePath2.lineTo(14.5f, 33.0f);
        instancePath2.lineTo(21.0f, 33.0f);
        instancePath2.close();
        instancePath2.moveTo(57.0f, 33.0f);
        Path path4 = instancePath2;
        path4.cubicTo(57.0f, 23.058874f, 48.941124f, 15.0f, 39.0f, 15.0f);
        path4.cubicTo(33.96398f, 15.0f, 29.411005f, 17.068129f, 26.144045f, 20.401403f);
        instancePath2.lineTo(28.972656f, 23.230017f);
        Path path5 = instancePath2;
        path5.cubicTo(31.515596f, 20.620514f, 35.068554f, 19.0f, 39.0f, 19.0f);
        path5.cubicTo(46.731987f, 19.0f, 53.0f, 25.268013f, 53.0f, 33.0f);
        instancePath2.lineTo(47.5f, 33.0f);
        instancePath2.lineTo(55.5f, 41.0f);
        instancePath2.lineTo(63.5f, 33.0f);
        instancePath2.lineTo(57.0f, 33.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
