package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_index_bankcard_bind */
public class mall_index_bankcard_bind extends C24542c {
    private final int height = 70;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 90;
        }
        if (i2 == 1) {
            return 70;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 4.4922566f);
            Path path = instancePath;
            path.cubicTo(0.46f, 1.6837293f, 3.04f, -0.3052276f, 5.88f, 0.044588927f);
            path.cubicTo(31.95f, 0.02459941f, 58.02f, 0.03459417f, 84.09f, 0.044588927f);
            path.cubicTo(86.85f, -0.31522238f, 89.24f, 1.5438027f, 90.0f, 4.1324453f);
            instancePath.lineTo(90.0f, 61.532345f);
            instancePath.cubicTo(89.6f, 63.73119f, 88.0f, 65.33035f, 85.92f, 66.0f);
            instancePath.lineTo(4.35f, 66.0f);
            instancePath.cubicTo(2.2f, 65.55024f, 0.66f, 63.94108f, 0.0f, 61.892155f);
            instancePath.lineTo(0.0f, 4.4922566f);
            instancePath.close();
            instancePath.moveTo(7.0f, 14.0f);
            instancePath.lineTo(83.0f, 14.0f);
            instancePath.lineTo(83.0f, 26.0f);
            instancePath.lineTo(7.0f, 26.0f);
            instancePath.lineTo(7.0f, 14.0f);
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
