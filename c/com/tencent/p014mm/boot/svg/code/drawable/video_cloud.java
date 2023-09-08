package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_cloud */
public class video_cloud extends C24542c {
    private final int height = 12;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 12;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -159.0f, 0.0f, 1.0f, -226.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 80.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 159.0f, 0.0f, 1.0f, 114.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(12.0f, 0.0f);
        instancePath.lineTo(12.0f, 12.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2130706433);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.339408f, 10.0f);
        instancePath2.lineTo(6.339408f, 6.0954685f);
        instancePath2.lineTo(7.52f, 7.30973f);
        instancePath2.lineTo(8.0f, 6.816041f);
        instancePath2.lineTo(6.4f, 5.1704106f);
        Path path = instancePath2;
        path.cubicTo(6.179086f, 4.9431963f, 5.820914f, 4.9431963f, 5.6f, 5.1704106f);
        instancePath2.lineTo(4.0f, 6.816041f);
        instancePath2.lineTo(4.48f, 7.30973f);
        instancePath2.lineTo(5.6605854f, 6.0954757f);
        instancePath2.lineTo(5.6605854f, 10.0f);
        instancePath2.lineTo(2.6666667f, 10.0f);
        path.cubicTo(1.1939074f, 10.0f, 0.0f, 8.806092f, 0.0f, 7.3333335f);
        path.cubicTo(0.0f, 5.860574f, 1.1939074f, 4.6666665f, 2.6666667f, 4.6666665f);
        path.cubicTo(2.6889026f, 4.6666665f, 2.7110748f, 4.666939f, 2.7331805f, 4.66748f);
        path.cubicTo(3.041713f, 3.1455812f, 4.387074f, 2.0f, 6.0f, 2.0f);
        path.cubicTo(7.840949f, 2.0f, 9.333333f, 3.4923842f, 9.333333f, 5.3333335f);
        path.cubicTo(9.333333f, 5.3412204f, 9.333306f, 5.3491006f, 9.333251f, 5.3569746f);
        path.cubicTo(9.442145f, 5.341395f, 9.553465f, 5.3333335f, 9.666667f, 5.3333335f);
        path.cubicTo(10.955331f, 5.3333335f, 12.0f, 6.378002f, 12.0f, 7.6666665f);
        path.cubicTo(12.0f, 8.955331f, 10.955331f, 10.0f, 9.666667f, 10.0f);
        instancePath2.lineTo(6.339408f, 10.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
