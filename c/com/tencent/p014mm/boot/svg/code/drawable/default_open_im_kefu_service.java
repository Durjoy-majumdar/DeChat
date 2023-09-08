package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_open_im_kefu_service */
public class default_open_im_kefu_service extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        instancePaint3.setColor(-15432210);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(132.0f, 0.0f);
        path.cubicTo(138.62741f, 0.0f, 144.0f, 5.3725824f, 144.0f, 12.0f);
        instancePath.lineTo(144.0f, 132.0f);
        Matrix matrix = instanceMatrix;
        path.cubicTo(144.0f, 138.62741f, 138.62741f, 144.0f, 132.0f, 144.0f);
        instancePath.lineTo(12.0f, 144.0f);
        path.cubicTo(5.3725824f, 144.0f, 0.0f, 138.62741f, 0.0f, 132.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(48.0f, 80.0f);
        Path path2 = instancePath2;
        path2.cubicTo(70.09139f, 80.0f, 88.0f, 64.77768f, 88.0f, 46.0f);
        path2.cubicTo(88.0f, 27.222319f, 70.09139f, 12.0f, 48.0f, 12.0f);
        path2.cubicTo(25.90861f, 12.0f, 8.0f, 27.222319f, 8.0f, 46.0f);
        path2.cubicTo(8.0f, 56.14562f, 13.227992f, 65.253334f, 21.519026f, 71.48293f);
        instancePath2.lineTo(20.310637f, 81.878456f);
        Path path3 = instancePath2;
        path3.cubicTo(20.183098f, 82.97564f, 20.96915f, 83.96847f, 22.066332f, 84.09601f);
        path3.cubicTo(22.44153f, 84.13962f, 22.821411f, 84.07609f, 23.162004f, 83.91277f);
        instancePath2.lineTo(35.093815f, 78.191345f);
        instancePath2.cubicTo(39.14292f, 79.36389f, 43.484066f, 80.0f, 48.0f, 80.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
