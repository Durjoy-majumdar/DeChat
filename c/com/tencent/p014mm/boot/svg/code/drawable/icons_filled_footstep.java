package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_footstep */
public class icons_filled_footstep extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.98162717f, 0.190809f, -1.8763187f, -0.190809f, 0.98162717f, 4.5136766f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(22.5f, 6.0f);
        Path path = instancePath;
        path.cubicTo(24.985281f, 6.0f, 27.0f, 8.686291f, 27.0f, 12.0f);
        path.cubicTo(27.0f, 15.313709f, 24.985281f, 18.0f, 22.5f, 18.0f);
        path.cubicTo(20.014719f, 18.0f, 18.0f, 15.313709f, 18.0f, 12.0f);
        path.cubicTo(18.0f, 8.686291f, 20.014719f, 6.0f, 22.5f, 6.0f);
        instancePath.close();
        canvas.drawPath(instancePath, paint);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9986295f, 0.052335955f, -0.59747905f, -0.052335955f, 0.9986295f, 1.7831956f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(33.75f, 7.5f);
        Path path2 = instancePath2;
        path2.cubicTo(35.821068f, 7.5f, 37.5f, 9.649033f, 37.5f, 12.3f);
        path2.cubicTo(37.5f, 14.950968f, 35.821068f, 17.1f, 33.75f, 17.1f);
        path2.cubicTo(31.678932f, 17.1f, 30.0f, 14.950968f, 30.0f, 12.3f);
        path2.cubicTo(30.0f, 9.649033f, 31.678932f, 7.5f, 33.75f, 7.5f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(42.0f, 11.25f);
        Path path3 = instancePath3;
        path3.cubicTo(43.656853f, 11.25f, 45.0f, 12.928932f, 45.0f, 15.0f);
        path3.cubicTo(45.0f, 17.071068f, 43.656853f, 18.75f, 42.0f, 18.75f);
        path3.cubicTo(40.343147f, 18.75f, 39.0f, 17.071068f, 39.0f, 15.0f);
        path3.cubicTo(39.0f, 12.928932f, 40.343147f, 11.25f, 42.0f, 11.25f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(48.75f, 15.0f);
        Path path4 = instancePath4;
        path4.cubicTo(49.99264f, 15.0f, 51.0f, 16.343145f, 51.0f, 18.0f);
        path4.cubicTo(51.0f, 19.656855f, 49.99264f, 21.0f, 48.75f, 21.0f);
        path4.cubicTo(47.50736f, 21.0f, 46.5f, 19.656855f, 46.5f, 18.0f);
        path4.cubicTo(46.5f, 16.343145f, 47.50736f, 15.0f, 48.75f, 15.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(31.13086f, 46.280273f);
        Path path5 = instancePath5;
        path5.cubicTo(32.26222f, 42.195225f, 29.339392f, 38.728355f, 23.910645f, 34.257202f);
        path5.cubicTo(18.481897f, 29.786047f, 20.38916f, 21.634277f, 28.19458f, 19.817139f);
        path5.cubicTo(36.0f, 18.0f, 52.96387f, 22.421211f, 53.517334f, 36.619263f);
        path5.cubicTo(54.070797f, 50.817314f, 44.246662f, 67.37415f, 34.34871f, 65.9008f);
        path5.cubicTo(24.450758f, 64.42745f, 29.999498f, 50.365322f, 31.13086f, 46.280273f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
