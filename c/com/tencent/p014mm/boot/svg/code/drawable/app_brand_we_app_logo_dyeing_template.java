package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_we_app_logo_dyeing_template */
public class app_brand_we_app_logo_dyeing_template extends C24542c {
    private final int height = 40;
    private final int width = 44;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 44;
        }
        if (i2 == 1) {
            return 40;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-9074981);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -298.0f, 0.0f, 1.0f, -661.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(322.0f, 663.0f);
            instancePath.cubicTo(320.0f, 664.0f, 316.5f, 668.1991f, 317.0f, 672.0f);
            instancePath.lineTo(317.0f, 689.0f);
            Path path = instancePath;
            path.cubicTo(316.5f, 691.797f, 313.4775f, 695.2222f, 310.0f, 695.0f);
            path.cubicTo(306.02176f, 695.2222f, 303.0f, 691.797f, 303.0f, 689.0f);
            path.cubicTo(303.0f, 686.67645f, 305.0f, 683.0f, 307.0f, 683.0f);
            path.cubicTo(309.0f, 683.0f, 311.0f, 681.0f, 310.0f, 679.0f);
            path.cubicTo(309.0f, 677.0f, 306.0f, 677.87036f, 305.0f, 678.0f);
            path.cubicTo(304.0f, 678.12964f, 300.0f, 681.0f, 299.0f, 683.0f);
            path.cubicTo(298.0f, 685.0f, 298.0f, 686.8411f, 298.0f, 689.0f);
            path.cubicTo(298.0f, 694.9784f, 302.7195f, 701.0f, 310.0f, 701.0f);
            path.cubicTo(312.23026f, 701.0f, 315.0f, 700.0f, 317.0f, 699.0f);
            path.cubicTo(319.0f, 698.0f, 322.5f, 692.8009f, 322.0f, 689.0f);
            instancePath.lineTo(322.0f, 672.0f);
            Path path2 = instancePath;
            path2.cubicTo(322.5f, 669.203f, 325.52176f, 666.7778f, 329.0f, 667.0f);
            path2.cubicTo(332.9775f, 666.7778f, 337.0f, 669.203f, 337.0f, 672.0f);
            path2.cubicTo(337.0f, 674.41455f, 335.0f, 677.0f, 332.0f, 678.0f);
            path2.cubicTo(329.0f, 679.0f, 328.0f, 680.0f, 329.0f, 682.0f);
            path2.cubicTo(330.0f, 684.0f, 333.0f, 683.0f, 334.0f, 683.0f);
            path2.cubicTo(335.0f, 683.0f, 339.0f, 680.0f, 340.0f, 678.0f);
            path2.cubicTo(341.0f, 676.0f, 342.0f, 674.1589f, 342.0f, 672.0f);
            path2.cubicTo(342.0f, 666.0216f, 336.2805f, 661.0f, 329.0f, 661.0f);
            path2.cubicTo(326.76974f, 661.0f, 324.0f, 662.0f, 322.0f, 663.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
