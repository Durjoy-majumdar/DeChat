package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import fm0.C86991y0;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.live_anchor_bottom_shadow */
public class live_anchor_bottom_shadow extends C24542c {
    private final int height = C86991y0.CTRL_INDEX;
    private final int width = 414;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 414;
        }
        if (i2 == 1) {
            return C86991y0.CTRL_INDEX;
        }
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
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -25.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(414.0f, 0.0f);
            instancePath.lineTo(414.0f, 414.0f);
            instancePath.lineTo(0.0f, 414.0f);
            instancePath.lineTo(0.0f, 0.0f);
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
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 414.0f, 0.0f, 0.0f, 0.0f, 414.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.5004247f, 0.057511345f, 0.5004247f, 1.0f, new int[]{0, 201326592, 1275068416}, new float[]{0.0f, 0.3415277f, 1.0f}, instanceMatrix, 0);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
