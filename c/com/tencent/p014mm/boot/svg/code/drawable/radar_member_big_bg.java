package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_member_big_bg */
public class radar_member_big_bg extends C24542c {
    private final int height = 291;
    private final int width = 291;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 291;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.462312f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(145.5f, 290.5377f);
        Path path = instancePath;
        path.cubicTo(225.85744f, 290.5377f, 291.0f, 225.72247f, 291.0f, 145.76884f);
        path.cubicTo(291.0f, 65.815216f, 225.85744f, 1.0f, 145.5f, 1.0f);
        path.cubicTo(65.14257f, 1.0f, 0.0f, 65.815216f, 0.0f, 145.76884f);
        path.cubicTo(0.0f, 225.72247f, 65.14257f, 290.5377f, 145.5f, 290.5377f);
        instancePath.lineTo(145.5f, 290.5377f);
        instancePath.close();
        instancePath.moveTo(145.5f, 286.3819f);
        path.cubicTo(223.55066f, 286.3819f, 286.82324f, 223.42729f, 286.82324f, 145.76884f);
        path.cubicTo(286.82324f, 68.11039f, 223.55066f, 5.155779f, 145.5f, 5.155779f);
        path.cubicTo(67.44933f, 5.155779f, 4.176768f, 68.11039f, 4.176768f, 145.76884f);
        path.cubicTo(4.176768f, 223.42729f, 67.44933f, 286.3819f, 145.5f, 286.3819f);
        instancePath.lineTo(145.5f, 286.3819f);
        instancePath.close();
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 291.0f, 0.0f, 0.0f, 0.0f, 290.5377f, 1.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-1, -1}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
