package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pc_connect_succ */
public class pc_connect_succ extends C24542c {
    private final int height = 26;
    private final int width = 26;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 26;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -204.0f, 0.0f, 1.0f, -261.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 205.0f, 0.0f, 1.0f, 262.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16268960);
        instancePaint4.setStrokeWidth(1.2857143f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.0f, 12.148149f);
        Path path = instancePath;
        path.cubicTo(24.0f, 5.3724446f, 18.627556f, 0.0f, 11.851851f, 0.0f);
        path.cubicTo(5.3724446f, 0.0f, 0.0f, 5.3724446f, 0.0f, 12.148149f);
        path.cubicTo(0.0f, 18.627556f, 5.3724446f, 24.0f, 11.851851f, 24.0f);
        path.cubicTo(18.627556f, 24.0f, 24.0f, 18.627556f, 24.0f, 12.148149f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16268960);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.252277f, 13.007762f);
        instancePath2.cubicTo(6.088865f, 12.838639f, 6.064898f, 12.553898f, 6.207098f, 12.360409f);
        instancePath2.lineTo(6.4001174f, 12.097771f);
        instancePath2.cubicTo(6.5385776f, 11.90937f, 6.797776f, 11.869274f, 6.991251f, 12.017562f);
        instancePath2.lineTo(9.395165f, 13.8600235f);
        instancePath2.cubicTo(9.768337f, 14.146039f, 10.365941f, 14.132068f, 10.727476f, 13.83088f);
        instancePath2.lineTo(17.770195f, 7.963725f);
        instancePath2.cubicTo(17.949402f, 7.814432f, 18.228569f, 7.8256383f, 18.393208f, 7.9882336f);
        instancePath2.lineTo(18.490576f, 8.0843935f);
        instancePath2.cubicTo(18.655449f, 8.247223f, 18.652159f, 8.513998f, 18.47881f, 8.684599f);
        instancePath2.lineTo(10.683666f, 16.356184f);
        instancePath2.cubicTo(10.3450775f, 16.689405f, 9.800653f, 16.680157f, 9.4811325f, 16.349468f);
        instancePath2.lineTo(6.252277f, 13.007762f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
