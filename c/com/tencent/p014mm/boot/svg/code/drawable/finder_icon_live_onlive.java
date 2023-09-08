package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_live_onlive */
public class finder_icon_live_onlive extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(25.65f, 0.0f);
        instancePath.cubicTo(27.647215f, 0.0f, 29.279764f, 1.3271298f, 29.393654f, 3.0004983f);
        instancePath.lineTo(29.4f, 3.0f);
        instancePath.lineTo(29.4f, 42.0f);
        Path path = instancePath;
        path.cubicTo(29.397865f, 42.062374f, 29.4f, 42.124725f, 29.4f, 42.1875f);
        path.cubicTo(29.4f, 43.947906f, 27.721067f, 45.375f, 25.65f, 45.375f);
        path.cubicTo(23.578932f, 45.375f, 21.9f, 43.947906f, 21.9f, 42.1875f);
        path.cubicTo(21.9f, 42.124725f, 21.902136f, 42.062374f, 21.906345f, 42.0005f);
        instancePath.lineTo(21.9f, 42.0f);
        instancePath.lineTo(21.9f, 3.0f);
        instancePath.cubicTo(22.020237f, 1.3271298f, 23.652784f, 0.0f, 25.65f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(45.75f, 6.0f);
        instancePath2.cubicTo(47.747215f, 6.0f, 49.379765f, 7.32713f, 49.493652f, 9.000499f);
        instancePath2.lineTo(49.5f, 9.0f);
        instancePath2.lineTo(49.5f, 36.0f);
        Path path2 = instancePath2;
        path2.cubicTo(49.497864f, 36.062374f, 49.5f, 36.124725f, 49.5f, 36.1875f);
        path2.cubicTo(49.5f, 37.947906f, 47.821068f, 39.375f, 45.75f, 39.375f);
        path2.cubicTo(43.678932f, 39.375f, 42.0f, 37.947906f, 42.0f, 36.1875f);
        path2.cubicTo(42.0f, 36.124725f, 42.002136f, 36.062374f, 42.006348f, 36.0005f);
        instancePath2.lineTo(42.0f, 36.0f);
        instancePath2.lineTo(42.0f, 9.0f);
        path2.cubicTo(42.120235f, 7.32713f, 43.752785f, 6.0f, 45.75f, 6.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(5.25f, 6.0f);
        Path path3 = instancePath3;
        path3.cubicTo(7.2472157f, 6.0f, 8.879764f, 7.32713f, 8.993653f, 9.000499f);
        instancePath3.lineTo(9.0f, 9.0f);
        instancePath3.lineTo(9.0f, 36.0f);
        path3.cubicTo(8.997865f, 36.062374f, 9.0f, 36.124725f, 9.0f, 36.1875f);
        path3.cubicTo(9.0f, 37.947906f, 7.321068f, 39.375f, 5.25f, 39.375f);
        path3.cubicTo(3.1789322f, 39.375f, 1.5f, 37.947906f, 1.5f, 36.1875f);
        path3.cubicTo(1.5f, 36.124725f, 1.5021349f, 36.062374f, 1.5063462f, 36.0005f);
        instancePath3.lineTo(1.5f, 36.0f);
        instancePath3.lineTo(1.5f, 9.0f);
        instancePath3.cubicTo(1.6202364f, 7.32713f, 3.2527843f, 6.0f, 5.25f, 6.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(5.25f, 48.0f);
        Path path4 = instancePath4;
        path4.cubicTo(8.149495f, 48.0f, 10.5f, 49.997932f, 10.5f, 52.4625f);
        path4.cubicTo(10.5f, 54.92707f, 8.149495f, 56.925003f, 5.25f, 56.925003f);
        path4.cubicTo(2.3505049f, 56.925003f, 0.0f, 54.92707f, 0.0f, 52.4625f);
        path4.cubicTo(0.0f, 49.997932f, 2.3505049f, 48.0f, 5.25f, 48.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
