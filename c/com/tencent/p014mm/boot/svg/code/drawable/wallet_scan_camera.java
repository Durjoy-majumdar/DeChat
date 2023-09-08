package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_scan_camera */
public class wallet_scan_camera extends C24542c {
    private final int height = 52;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 66;
        }
        if (i2 == 1) {
            return 52;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-9139786);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(19.4f, 0.0f);
            instancePath.lineTo(45.39f, 0.0f);
            Path path = instancePath;
            path.cubicTo(45.87f, 1.9689571f, 46.06f, 3.9878876f, 46.12f, 6.0068183f);
            path.cubicTo(51.06f, 6.086776f, 56.02f, 5.7569504f, 60.95f, 6.1567388f);
            path.cubicTo(63.61f, 6.2666807f, 65.29f, 8.605442f, 66.0f, 10.944203f);
            instancePath.lineTo(66.0f, 43.96671f);
            Path path2 = instancePath;
            path2.cubicTo(65.34f, 46.72525f, 63.07f, 49.06401f, 60.08f, 48.904095f);
            path2.cubicTo(42.37f, 49.06401f, 24.65f, 48.944073f, 6.93f, 48.964066f);
            path2.cubicTo(3.74f, 49.293888f, 0.86f, 47.324932f, 0.0f, 44.226574f);
            instancePath.lineTo(0.0f, 11.014166f);
            Path path3 = instancePath;
            path3.cubicTo(0.67f, 8.955256f, 1.89f, 6.726437f, 4.23f, 6.2966647f);
            path3.cubicTo(9.06f, 5.6270194f, 13.96f, 6.1367493f, 18.82f, 6.0068183f);
            path3.cubicTo(19.05f, 4.007877f, 19.27f, 2.008936f, 19.4f, 0.0f);
            instancePath.lineTo(19.4f, 0.0f);
            instancePath.close();
            instancePath.moveTo(28.390493f, 10.6254015f);
            path3.cubicTo(21.38109f, 12.364714f, 15.771568f, 18.70221f, 15.111625f, 25.929352f);
            path3.cubicTo(14.381687f, 32.00695f, 17.28144f, 38.294464f, 22.351007f, 41.723106f);
            path3.cubicTo(29.330412f, 46.68115f, 39.75952f, 45.961433f, 45.879f, 39.913822f);
            path3.cubicTo(50.78858f, 35.275658f, 52.328453f, 27.618683f, 49.798668f, 21.391146f);
            path3.cubicTo(46.728928f, 13.064437f, 36.919765f, 8.196362f, 28.390493f, 10.6254015f);
            instancePath.lineTo(28.390493f, 10.6254015f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(29.357378f, 16.571178f);
            Path path4 = instancePath2;
            path4.cubicTo(35.96738f, 14.336706f, 44.02519f, 18.905405f, 44.86392f, 25.967936f);
            path4.cubicTo(45.942287f, 32.382072f, 40.450596f, 38.576748f, 34.090218f, 38.925884f);
            path4.cubicTo(27.719856f, 39.68401f, 21.17975f, 34.526764f, 21.019993f, 28.002903f);
            path4.cubicTo(20.69049f, 22.835684f, 24.474766f, 18.017601f, 29.357378f, 16.571178f);
            instancePath2.lineTo(29.357378f, 16.571178f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
