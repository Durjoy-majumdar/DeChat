package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_feedback_error */
public class icons_filled_feedback_error extends C24542c {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(30.0f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(30.0f, 33.0f);
        instancePath2.cubicTo(25.723497f, 33.0f, 21.556957f, 34.78566f, 17.547626f, 38.22223f);
        instancePath2.lineTo(17.547626f, 38.22223f);
        instancePath2.lineTo(15.269856f, 40.174603f);
        instancePath2.lineTo(19.174604f, 44.730145f);
        instancePath2.lineTo(21.452374f, 42.77777f);
        instancePath2.lineTo(22.090843f, 42.249065f);
        Path path2 = instancePath2;
        path2.cubicTo(24.847261f, 40.04706f, 27.471039f, 39.0f, 30.0f, 39.0f);
        path2.cubicTo(32.7235f, 39.0f, 35.556957f, 40.21434f, 38.547626f, 42.77777f);
        instancePath2.lineTo(38.547626f, 42.77777f);
        instancePath2.lineTo(40.825397f, 44.730145f);
        instancePath2.lineTo(44.730145f, 40.174603f);
        instancePath2.lineTo(42.452374f, 38.22223f);
        instancePath2.lineTo(41.698795f, 37.59725f);
        instancePath2.cubicTo(37.921795f, 34.569427f, 34.00922f, 33.0f, 30.0f, 33.0f);
        instancePath2.close();
        instancePath2.moveTo(19.5f, 16.5f);
        Path path3 = instancePath2;
        path3.cubicTo(17.014719f, 16.5f, 15.0f, 18.514719f, 15.0f, 21.0f);
        path3.cubicTo(15.0f, 23.485281f, 17.014719f, 25.5f, 19.5f, 25.5f);
        path3.cubicTo(21.985281f, 25.5f, 24.0f, 23.485281f, 24.0f, 21.0f);
        path3.cubicTo(24.0f, 18.514719f, 21.985281f, 16.5f, 19.5f, 16.5f);
        instancePath2.close();
        instancePath2.moveTo(40.5f, 16.5f);
        Path path4 = instancePath2;
        path4.cubicTo(38.014717f, 16.5f, 36.0f, 18.514719f, 36.0f, 21.0f);
        path4.cubicTo(36.0f, 23.485281f, 38.014717f, 25.5f, 40.5f, 25.5f);
        path4.cubicTo(42.985283f, 25.5f, 45.0f, 23.485281f, 45.0f, 21.0f);
        path4.cubicTo(45.0f, 18.514719f, 42.985283f, 16.5f, 40.5f, 16.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
