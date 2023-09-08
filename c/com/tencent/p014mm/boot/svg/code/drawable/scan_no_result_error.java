package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_no_result_error */
public class scan_no_result_error extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -188.0f, 0.0f, 1.0f, -375.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 188.0f, 0.0f, 1.0f, 375.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-352965);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(20.0f, 40.0f);
            Path path = instancePath;
            path.cubicTo(8.954305f, 40.0f, 0.0f, 31.045694f, 0.0f, 20.0f);
            path.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            path.cubicTo(31.045694f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            path.cubicTo(40.0f, 31.045694f, 31.045694f, 40.0f, 20.0f, 40.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(19.669922f, 27.944336f);
            Path path2 = instancePath2;
            path2.cubicTo(20.62207f, 27.944336f, 21.339844f, 28.66211f, 21.339844f, 29.614258f);
            path2.cubicTo(21.339844f, 30.551758f, 20.62207f, 31.28418f, 19.669922f, 31.28418f);
            path2.cubicTo(18.732422f, 31.28418f, 18.0f, 30.551758f, 18.0f, 29.614258f);
            path2.cubicTo(18.0f, 28.66211f, 18.732422f, 27.944336f, 19.669922f, 27.944336f);
            instancePath2.close();
            instancePath2.moveTo(20.988281f, 10.0f);
            instancePath2.lineTo(20.8125f, 24.121094f);
            instancePath2.lineTo(18.527344f, 24.121094f);
            instancePath2.lineTo(18.351562f, 10.0f);
            instancePath2.lineTo(20.988281f, 10.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
