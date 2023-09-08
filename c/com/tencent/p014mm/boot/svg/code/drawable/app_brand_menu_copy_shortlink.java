package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_menu_copy_shortlink */
public class app_brand_menu_copy_shortlink extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(43.970562f, 27.0f);
        instancePath.lineTo(41.42498f, 24.454416f);
        instancePath.lineTo(47.78894f, 18.090454f);
        Path path = instancePath;
        path.cubicTo(51.069344f, 14.810051f, 51.069344f, 9.491465f, 47.78894f, 6.2110605f);
        path.cubicTo(44.508533f, 2.9306567f, 39.18995f, 2.9306567f, 35.909546f, 6.2110605f);
        instancePath.lineTo(24.242283f, 17.878323f);
        Path path2 = instancePath;
        path2.cubicTo(20.96188f, 21.158726f, 20.96188f, 26.477312f, 24.242283f, 29.757717f);
        instancePath.lineTo(21.6967f, 32.303303f);
        path2.cubicTo(17.010408f, 27.61701f, 17.010408f, 20.01903f, 21.6967f, 15.332738f);
        instancePath.lineTo(33.36396f, 3.6654763f);
        Path path3 = instancePath;
        path3.cubicTo(38.05025f, -1.0208153f, 45.64823f, -1.0208153f, 50.334522f, 3.6654763f);
        path3.cubicTo(55.020817f, 8.351768f, 55.020817f, 15.949747f, 50.334522f, 20.63604f);
        instancePath.lineTo(43.970562f, 27.0f);
        instancePath.close();
        instancePath.moveTo(10.029437f, 27.0f);
        instancePath.lineTo(12.575022f, 29.545584f);
        instancePath.lineTo(6.2110605f, 35.909546f);
        Path path4 = instancePath;
        path4.cubicTo(2.9306567f, 39.18995f, 2.9306567f, 44.508533f, 6.2110605f, 47.78894f);
        path4.cubicTo(9.491465f, 51.069344f, 14.810051f, 51.069344f, 18.090454f, 47.78894f);
        instancePath.lineTo(29.757717f, 36.121677f);
        Path path5 = instancePath;
        path5.cubicTo(33.03812f, 32.841274f, 33.03812f, 27.522688f, 29.757717f, 24.242283f);
        instancePath.lineTo(32.303303f, 21.6967f);
        path5.cubicTo(36.989594f, 26.38299f, 36.989594f, 33.980972f, 32.303303f, 38.667263f);
        instancePath.lineTo(20.63604f, 50.334522f);
        Path path6 = instancePath;
        path6.cubicTo(15.949747f, 55.020817f, 8.351768f, 55.020817f, 3.6654763f, 50.334522f);
        path6.cubicTo(-1.0208153f, 45.64823f, -1.0208153f, 38.05025f, 3.6654763f, 33.36396f);
        instancePath.lineTo(10.029437f, 27.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
