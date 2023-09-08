package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_comment_silence */
public class sns_comment_silence extends C24542c {
    private final int height = 45;
    private final int width = 45;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 45;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(9.457563f, 7.8087344f);
                Path path = instancePath;
                path.cubicTo(11.167546f, 6.0274277f, 13.166591f, 5.1481767f, 14.952687f, 4.761591f);
                path.cubicTo(14.593289f, 4.2669635f, 14.3813095f, 3.65827f, 14.3813095f, 3.0f);
                path.cubicTo(14.3813095f, 1.3429188f, 15.724614f, 0.0f, 17.38131f, 0.0f);
                path.cubicTo(19.038004f, 0.0f, 20.38131f, 1.3429188f, 20.38131f, 3.0f);
                path.cubicTo(20.38131f, 3.65827f, 20.169329f, 4.2669635f, 19.80993f, 4.761591f);
                path.cubicTo(23.826532f, 5.630951f, 28.920044f, 8.991799f, 29.38131f, 19.5f);
                path.cubicTo(29.192793f, 23.44757f, 29.636072f, 26.433947f, 30.30884f, 28.660011f);
                instancePath.lineTo(37.4661f, 35.81727f);
                instancePath.cubicTo(37.86362f, 36.214794f, 37.86378f, 36.846252f, 37.474403f, 37.23563f);
                instancePath.lineTo(36.61694f, 38.093094f);
                instancePath.cubicTo(36.2272f, 38.482834f, 35.59254f, 38.478752f, 35.198578f, 38.08479f);
                instancePath.lineTo(0.094642155f, 2.980852f);
                instancePath.cubicTo(-0.30288154f, 2.5833282f, -0.3030391f, 1.9518675f, 0.08633687f, 1.5624915f);
                instancePath.lineTo(0.9438008f, 0.7050276f);
                instancePath.cubicTo(1.3335396f, 0.3152888f, 1.9681984f, 0.31937f, 2.3621612f, 0.71333283f);
                instancePath.lineTo(9.457563f, 7.8087344f);
                instancePath.close();
                instancePath.moveTo(6.360238f, 13.343368f);
                instancePath.lineTo(29.01687f, 36.0f);
                instancePath.lineTo(0.8813093f, 36.0f);
                instancePath.lineTo(0.8813093f, 34.5f);
                Path path2 = instancePath;
                path2.cubicTo(0.8813093f, 34.5f, 5.943809f, 31.278849f, 5.3813095f, 19.5f);
                path2.cubicTo(5.487063f, 17.090797f, 5.836307f, 15.05729f, 6.360238f, 13.343368f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
