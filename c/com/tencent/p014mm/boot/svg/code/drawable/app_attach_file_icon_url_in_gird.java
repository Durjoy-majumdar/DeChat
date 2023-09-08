package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_url_in_gird */
public class app_attach_file_icon_url_in_gird extends C24542c {
    private final int height = 71;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 80;
        }
        if (i2 == 1) {
            return 71;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(19.357758f, 25.260746f);
        instancePath.lineTo(28.45082f, 25.260746f);
        Path path = instancePath;
        path.cubicTo(34.51505f, 25.260746f, 39.44799f, 20.333082f, 39.44799f, 14.254499f);
        instancePath.lineTo(39.44799f, 11.0062475f);
        path.cubicTo(39.44799f, 4.930493f, 34.52439f, 1.2726757E-7f, 28.45082f, 1.046543E-7f);
        instancePath.lineTo(11.339516f, 4.0945043E-8f);
        path.cubicTo(5.2752895f, 1.8366562E-8f, 0.34234652f, 4.9276648f, 0.34234652f, 11.006247f);
        instancePath.lineTo(0.34234652f, 14.160372f);
        instancePath.lineTo(4.420356f, 14.160372f);
        path.cubicTo(4.3753934f, 13.817222f, 4.3521967f, 13.467262f, 4.3521967f, 13.111929f);
        instancePath.lineTo(4.352197f, 12.010028f);
        path.cubicTo(4.352197f, 7.5904274f, 7.9322853f, 4.0076337f, 12.355284f, 4.0076337f);
        instancePath.lineTo(27.42606f, 4.0076337f);
        path.cubicTo(31.846043f, 4.0076337f, 35.429146f, 7.593756f, 35.429146f, 12.010028f);
        instancePath.lineTo(35.429146f, 13.111929f);
        path.cubicTo(35.429146f, 17.531528f, 31.849058f, 21.114323f, 27.42606f, 21.114323f);
        instancePath.lineTo(19.357758f, 21.114323f);
        instancePath.lineTo(19.357758f, 25.260746f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 40.0f, 0.0f, -1.0f, 26.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(19.357758f, 25.260746f);
        instancePath2.lineTo(28.45082f, 25.260746f);
        instancePath2.cubicTo(34.51505f, 25.260746f, 39.44799f, 20.333082f, 39.44799f, 14.254499f);
        instancePath2.lineTo(39.44799f, 11.0062475f);
        instancePath2.cubicTo(39.44799f, 4.930493f, 34.52439f, 1.2726757E-7f, 28.45082f, 1.046543E-7f);
        instancePath2.lineTo(11.339516f, 4.0945043E-8f);
        instancePath2.cubicTo(5.2752895f, 1.8366562E-8f, 0.34234652f, 4.9276648f, 0.34234652f, 11.006247f);
        instancePath2.lineTo(0.34234652f, 14.160372f);
        instancePath2.lineTo(4.420356f, 14.160372f);
        instancePath2.cubicTo(4.3753934f, 13.817222f, 4.3521967f, 13.467262f, 4.3521967f, 13.111929f);
        instancePath2.lineTo(4.352197f, 12.010028f);
        instancePath2.cubicTo(4.352197f, 7.5904274f, 7.9322853f, 4.0076337f, 12.355284f, 4.0076337f);
        instancePath2.lineTo(27.42606f, 4.0076337f);
        instancePath2.cubicTo(31.846043f, 4.0076337f, 35.429146f, 7.593756f, 35.429146f, 12.010028f);
        instancePath2.lineTo(35.429146f, 13.111929f);
        instancePath2.cubicTo(35.429146f, 17.531528f, 31.849058f, 21.114323f, 27.42606f, 21.114323f);
        instancePath2.lineTo(19.357758f, 21.114323f);
        instancePath2.lineTo(19.357758f, 25.260746f);
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
