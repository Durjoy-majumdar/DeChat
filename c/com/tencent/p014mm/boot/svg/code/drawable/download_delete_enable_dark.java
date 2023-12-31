package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_delete_enable_dark */
public class download_delete_enable_dark extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -278.0f, 0.0f, 1.0f, -696.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 684.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 262.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-372399);
        canvas.save();
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.7735524f, 3.399997f);
        instancePath2.lineTo(4.585906f, 17.047535f);
        instancePath2.cubicTo(4.6110616f, 17.470152f, 4.961127f, 17.8f, 5.3844924f, 17.8f);
        instancePath2.lineTo(12.615507f, 17.8f);
        instancePath2.cubicTo(13.038874f, 17.8f, 13.388938f, 17.470152f, 13.414094f, 17.047535f);
        instancePath2.lineTo(14.226447f, 3.399997f);
        instancePath2.lineTo(3.7735524f, 3.399997f);
        instancePath2.close();
        instancePath2.moveTo(15.428572f, 3.399997f);
        instancePath2.lineTo(14.611974f, 17.118837f);
        instancePath2.cubicTo(14.549085f, 18.17538f, 13.673922f, 19.0f, 12.615507f, 19.0f);
        instancePath2.lineTo(5.3844924f, 19.0f);
        instancePath2.cubicTo(4.3260784f, 19.0f, 3.4509156f, 18.17538f, 3.388026f, 17.118837f);
        instancePath2.lineTo(2.5714285f, 3.399997f);
        instancePath2.lineTo(0.5f, 3.399997f);
        instancePath2.lineTo(0.5f, 2.699997f);
        instancePath2.cubicTo(0.5f, 2.4238546f, 0.72385764f, 2.199997f, 1.0f, 2.199997f);
        instancePath2.lineTo(17.0f, 2.199997f);
        instancePath2.cubicTo(17.276142f, 2.199997f, 17.5f, 2.4238546f, 17.5f, 2.699997f);
        instancePath2.lineTo(17.5f, 3.399997f);
        instancePath2.lineTo(15.428572f, 3.399997f);
        instancePath2.close();
        instancePath2.moveTo(7.700012f, 6.0f);
        instancePath2.lineTo(8.200012f, 15.0f);
        instancePath2.lineTo(7.0f, 15.0f);
        instancePath2.lineTo(6.5f, 6.0f);
        instancePath2.lineTo(7.700012f, 6.0f);
        instancePath2.close();
        instancePath2.moveTo(11.5f, 6.0f);
        instancePath2.lineTo(11.0f, 15.0f);
        instancePath2.lineTo(9.799988f, 15.0f);
        instancePath2.lineTo(10.299988f, 6.0f);
        instancePath2.lineTo(11.5f, 6.0f);
        instancePath2.close();
        instancePath2.moveTo(11.0f, 2.7285569E-5f);
        instancePath2.cubicTo(11.276142f, 2.7285569E-5f, 11.5f, 0.22388491f, 11.5f, 0.5000273f);
        instancePath2.lineTo(11.5f, 1.2000242f);
        instancePath2.lineTo(6.5f, 1.2000242f);
        instancePath2.lineTo(6.5f, 0.5000273f);
        instancePath2.cubicTo(6.5f, 0.22388491f, 6.7238574f, 2.7285569E-5f, 7.0f, 2.7285569E-5f);
        instancePath2.lineTo(11.0f, 2.7285569E-5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
