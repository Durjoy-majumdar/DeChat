package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.rotation_press */
public class rotation_press extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 63;
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
        instancePaint3.setColor(-15028967);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.0f, 5.0f);
        instancePath.lineTo(5.0f, 34.0f);
        instancePath.lineTo(34.0f, 34.0f);
        instancePath.lineTo(34.0f, 5.0f);
        instancePath.lineTo(5.0f, 5.0f);
        instancePath.close();
        instancePath.moveTo(0.0f, 1.5049495f);
        Path path = instancePath;
        path.cubicTo(0.0f, 0.67378885f, 0.676918f, 0.0f, 1.5049495f, 0.0f);
        instancePath.lineTo(37.495052f, 0.0f);
        path.cubicTo(38.32621f, 0.0f, 39.0f, 0.676918f, 39.0f, 1.5049495f);
        instancePath.lineTo(39.0f, 37.495052f);
        path.cubicTo(39.0f, 38.32621f, 38.323082f, 39.0f, 37.495052f, 39.0f);
        instancePath.lineTo(1.5049495f, 39.0f);
        path.cubicTo(0.67378885f, 39.0f, 0.0f, 38.323082f, 0.0f, 37.495052f);
        instancePath.lineTo(0.0f, 1.5049495f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(52.925938f, 23.0f);
        Path path2 = instancePath2;
        path2.cubicTo(52.974922f, 22.49169f, 53.0f, 21.976135f, 53.0f, 21.454546f);
        path2.cubicTo(53.0f, 12.919235f, 46.28427f, 6.0f, 38.0f, 6.0f);
        path2.cubicTo(35.866688f, 6.0f, 33.837387f, 6.4588375f, 32.0f, 7.285953f);
        instancePath2.lineTo(32.0f, 10.252686f);
        Path path3 = instancePath2;
        path3.cubicTo(33.60105f, 9.50638f, 35.378433f, 9.090909f, 37.25f, 9.090909f);
        path3.cubicTo(44.29163f, 9.090909f, 50.0f, 14.9722595f, 50.0f, 22.227272f);
        path3.cubicTo(50.0f, 22.486673f, 49.992702f, 22.744318f, 49.978306f, 23.0f);
        instancePath2.lineTo(52.925938f, 23.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(35.0f, 0.0f);
        instancePath3.lineTo(26.0f, 7.4431515f);
        instancePath3.lineTo(34.865273f, 15.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
