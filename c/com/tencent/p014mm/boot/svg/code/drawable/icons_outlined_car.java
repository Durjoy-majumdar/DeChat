package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_car */
public class icons_outlined_car extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.56426f, 5.232216f);
        Path path = instancePath;
        instancePath.cubicTo(14.201277f, 5.232216f, 14.811565f, 5.4102817f, 15.335421f, 5.7299776f);
        path.cubicTo(15.859277f, 6.049673f, 16.2967f, 6.5109982f, 16.587984f, 7.077517f);
        Path path2 = path;
        path2.lineTo(16.587984f, 7.077517f);
        path2.lineTo(17.635986f, 9.115768f);
        path2.cubicTo(18.656149f, 9.026703f, 19.548983f, 9.319982f, 20.182356f, 9.868035f);
        Path path3 = path;
        path3.cubicTo(20.740223f, 10.350753f, 21.092789f, 11.029289f, 21.151768f, 11.796018f);
        path3.cubicTo(21.203257f, 12.465385f, 20.982704f, 13.08923f, 20.583101f, 13.558576f);
        path3.cubicTo(20.188042f, 14.022585f, 19.618258f, 14.335212f, 18.965971f, 14.391179f);
        Path path4 = path;
        path4.lineTo(18.965971f, 14.391179f);
        path4.lineTo(5.2396317f, 14.4f);
        path4.cubicTo(4.57689f, 14.4f, 3.97689f, 14.131371f, 3.5425756f, 13.697057f);
        Path path5 = path;
        path5.cubicTo(3.1129265f, 13.267407f, 2.8454223f, 12.675613f, 2.8397326f, 12.021248f);
        path5.cubicTo(2.907005f, 11.162231f, 3.2455702f, 10.434799f, 3.763575f, 9.919733f);
        path5.cubicTo(4.354971f, 9.331692f, 5.177349f, 9.025495f, 6.0640736f, 9.11551f);
        Path path6 = path;
        path6.lineTo(6.0640736f, 9.11551f);
        path6.lineTo(7.4419165f, 7.1164756f);
        path6.cubicTo(7.7324944f, 6.5331216f, 8.176911f, 6.0585275f, 8.711603f, 5.731562f);
        path.cubicTo(9.236009f, 5.4108877f, 9.847248f, 5.232216f, 10.485358f, 5.232216f);
        Path path7 = path;
        path7.lineTo(10.485358f, 5.232216f);
        path7.close();
        canvas.drawPath(path7, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.8443596f, 11.863162f);
        instancePath2.lineTo(2.8443596f, 16.0f);
        instancePath2.cubicTo(2.8443596f, 16.828426f, 3.5159326f, 17.5f, 4.3443594f, 17.5f);
        instancePath2.lineTo(5.3443594f, 17.5f);
        instancePath2.cubicTo(6.1727867f, 17.5f, 6.8443594f, 16.828426f, 6.8443594f, 16.0f);
        instancePath2.lineTo(6.8443594f, 14.167176f);
        instancePath2.lineTo(6.8443594f, 14.167176f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(1.2f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 38.321735f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(17.160868f, 11.863162f);
        instancePath3.lineTo(17.160868f, 16.0f);
        instancePath3.cubicTo(17.160868f, 16.828426f, 17.832441f, 17.5f, 18.660868f, 17.5f);
        instancePath3.lineTo(19.660868f, 17.5f);
        instancePath3.cubicTo(20.489294f, 17.5f, 21.160868f, 16.828426f, 21.160868f, 16.0f);
        instancePath3.lineTo(21.160868f, 14.167176f);
        instancePath3.lineTo(21.160868f, 14.167176f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeCap(Paint.Cap.ROUND);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(5.0f, 7.154218f);
        instancePath4.lineTo(6.5354433f, 7.845782f);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeCap(Paint.Cap.ROUND);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 36.464558f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(17.464558f, 7.154218f);
        instancePath5.lineTo(19.0f, 7.845782f);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint9.setColor(-16777216);
        instancePaint9.setStrokeWidth(1.2f);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(6.0f, 9.105143f);
        instancePath6.lineTo(17.879782f, 9.105143f);
        canvas.drawPath(instancePath6, instancePaint9);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 17.464558f, 0.0f, 1.0f, 7.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
