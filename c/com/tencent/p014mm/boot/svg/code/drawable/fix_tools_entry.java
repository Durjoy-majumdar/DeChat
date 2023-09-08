package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_entry */
public class fix_tools_entry extends C24542c {
    private final int height = 68;
    private final int width = 68;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 68;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.1333333f, 0.0f, 0.0f, 0.0f, 1.1333333f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.0f, 6.0f);
        instancePath.lineTo(24.0f, 13.582962f);
        Path path = instancePath;
        path.cubicTo(24.0f, 16.068243f, 26.014719f, 18.082962f, 28.5f, 18.082962f);
        path.cubicTo(30.985281f, 18.082962f, 33.0f, 16.068243f, 33.0f, 13.582962f);
        instancePath.lineTo(33.0f, 6.0f);
        Path path2 = instancePath;
        path2.cubicTo(36.54742f, 7.710701f, 39.0f, 11.381189f, 39.0f, 15.633177f);
        path2.cubicTo(39.0f, 19.693186f, 36.763893f, 23.223017f, 33.473682f, 25.022778f);
        instancePath.lineTo(33.473682f, 49.026318f);
        Path path3 = instancePath;
        path3.cubicTo(33.473682f, 51.773205f, 31.24689f, 54.0f, 28.5f, 54.0f);
        path3.cubicTo(25.75311f, 54.0f, 23.526316f, 51.773205f, 23.526316f, 49.026318f);
        instancePath.lineTo(23.526316f, 25.022778f);
        Path path4 = instancePath;
        path4.cubicTo(20.236107f, 23.223017f, 18.0f, 19.693186f, 18.0f, 15.633177f);
        path4.cubicTo(18.0f, 11.381189f, 20.45258f, 7.710701f, 24.0f, 6.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
