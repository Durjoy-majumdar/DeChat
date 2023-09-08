package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_contactlabel */
public class default_contactlabel extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14187817);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        path.cubicTo(114.62742f, 0.0f, 120.0f, 5.3725824f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 108.0f);
        Matrix matrix = instanceMatrix;
        path.cubicTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f);
        instancePath.lineTo(12.0f, 120.0f);
        path.cubicTo(5.3725824f, 120.0f, 0.0f, 114.62742f, 0.0f, 108.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray);
        canvas.concat(matrix2);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 7.5f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        matrix2.reset();
        matrix2.setValues(matrixFloatArray2);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.1213202f, 33.62132f);
        instancePath2.cubicTo(0.94974744f, 32.44975f, 0.94974744f, 30.550253f, 2.1213202f, 29.37868f);
        instancePath2.lineTo(30.62132f, 0.87867963f);
        instancePath2.cubicTo(31.18393f, 0.31607053f, 31.946991f, 3.0425315E-14f, 32.74264f, 2.88658E-14f);
        instancePath2.lineTo(52.5f, -1.7763568E-15f);
        instancePath2.cubicTo(54.156853f, -2.0807161E-15f, 55.5f, 1.3431457f, 55.5f, 3.0f);
        instancePath2.lineTo(55.5f, 22.757359f);
        instancePath2.cubicTo(55.5f, 23.553009f, 55.18393f, 24.31607f, 54.62132f, 24.87868f);
        instancePath2.lineTo(26.12132f, 53.37868f);
        instancePath2.cubicTo(24.949747f, 54.55025f, 23.050253f, 54.55025f, 21.87868f, 53.37868f);
        instancePath2.lineTo(2.1213202f, 33.62132f);
        instancePath2.close();
        instancePath2.moveTo(40.5f, 19.5f);
        Path path2 = instancePath2;
        path2.cubicTo(42.985283f, 19.5f, 45.0f, 17.485281f, 45.0f, 15.0f);
        path2.cubicTo(45.0f, 12.514719f, 42.985283f, 10.5f, 40.5f, 10.5f);
        path2.cubicTo(38.014717f, 10.5f, 36.0f, 12.514719f, 36.0f, 15.0f);
        path2.cubicTo(36.0f, 17.485281f, 38.014717f, 19.5f, 40.5f, 19.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
