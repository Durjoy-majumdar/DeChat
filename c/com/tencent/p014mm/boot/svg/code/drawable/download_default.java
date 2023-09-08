package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_default */
public class download_default extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -280.0f, 0.0f, 1.0f, -40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 279.0f, 0.0f, 1.0f, 39.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.451329f, 0.0f, 1.0f, 0.496923f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 2.548671f, 0.0f, 1.0f, 2.503077f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
        path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
        path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(10.0f, 1.6666666f);
        Path path2 = instancePath;
        path2.cubicTo(5.397627f, 1.6666666f, 1.6666666f, 5.397627f, 1.6666666f, 10.0f);
        path2.cubicTo(1.6666666f, 14.602373f, 5.397627f, 18.333334f, 10.0f, 18.333334f);
        path2.cubicTo(14.602373f, 18.333334f, 18.333334f, 14.602373f, 18.333334f, 10.0f);
        path2.cubicTo(18.333334f, 5.397627f, 14.602373f, 1.6666666f, 10.0f, 1.6666666f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.400186f, 7.0f);
        instancePath2.lineTo(13.400015f, 15.271f);
        instancePath2.lineTo(15.856973f, 12.815718f);
        instancePath2.lineTo(17.104809f, 14.063553f);
        instancePath2.lineTo(13.15333f, 18.015032f);
        instancePath2.cubicTo(12.835256f, 18.333105f, 12.334758f, 18.357573f, 11.988618f, 18.088434f);
        instancePath2.lineTo(11.905494f, 18.015032f);
        instancePath2.lineTo(7.954015f, 14.063553f);
        instancePath2.lineTo(9.201851f, 12.815718f);
        instancePath2.lineTo(11.635015f, 15.25f);
        instancePath2.lineTo(11.63548f, 7.0f);
        instancePath2.lineTo(13.400186f, 7.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
