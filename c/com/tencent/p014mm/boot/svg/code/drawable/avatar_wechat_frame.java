package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_wechat_frame */
public class avatar_wechat_frame extends C24542c {
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
        instancePaint3.setColor(-372399);
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 23.0f, 0.0f, 1.0f, 41.0f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(56.837322f, 34.38223f);
        instancePath2.lineTo(56.837322f, 4.36973f);
        instancePath2.lineTo(14.724756f, 4.36973f);
        instancePath2.lineTo(14.724756f, 34.38223f);
        instancePath2.lineTo(56.837322f, 34.38223f);
        instancePath2.close();
        instancePath2.moveTo(10.331462f, 1.1368684E-13f);
        instancePath2.lineTo(61.230618f, 1.1368684E-13f);
        instancePath2.lineTo(61.230618f, 38.7517f);
        instancePath2.lineTo(10.331462f, 38.7517f);
        instancePath2.lineTo(10.331462f, 1.1368684E-13f);
        instancePath2.close();
        instancePath2.moveTo(4.393229f, 38.7517f);
        instancePath2.lineTo(1.6966473f, 38.7517f);
        instancePath2.cubicTo(2.2737368E-13f, 38.7517f, 2.2746995E-13f, 37.909233f, 2.2746995E-13f, 37.909233f);
        instancePath2.lineTo(2.489629f, 0.842595f);
        instancePath2.cubicTo(2.515041f, 0.3670758f, 2.9129448f, -0.00428691f, 3.3924437f, -9.633928E-14f);
        instancePath2.lineTo(6.938233f, -3.6742225E-5f);
        instancePath2.lineTo(4.393229f, 38.7517f);
        instancePath2.close();
        instancePath2.moveTo(67.16885f, 38.7517f);
        instancePath2.lineTo(64.62385f, -3.6742225E-5f);
        instancePath2.lineTo(68.16964f, -9.633928E-14f);
        instancePath2.cubicTo(68.64913f, -0.00428691f, 69.047035f, 0.3670758f, 69.07245f, 0.842595f);
        instancePath2.lineTo(71.56208f, 37.909233f);
        instancePath2.cubicTo(71.56208f, 37.909233f, 71.56208f, 38.7517f, 69.86543f, 38.7517f);
        instancePath2.lineTo(67.16885f, 38.7517f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
