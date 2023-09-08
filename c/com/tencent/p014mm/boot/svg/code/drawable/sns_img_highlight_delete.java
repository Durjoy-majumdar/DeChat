package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_img_highlight_delete */
public class sns_img_highlight_delete extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(4.5f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.25f, 23.25f);
        instancePath.lineTo(40.75f, 23.25f);
        instancePath.lineTo(40.75f, 65.75f);
        instancePath.lineTo(7.25f, 65.75f);
        instancePath.lineTo(7.25f, 23.25f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 17.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 1.0f);
        Path path = instancePath2;
        instancePath2.cubicTo(0.0f, 0.44771522f, 0.44771522f, -2.6645353E-15f, 1.0f, -2.6645353E-15f);
        path.lineTo(2.0f, -2.6645353E-15f);
        path.cubicTo(2.5522847f, -2.6645353E-15f, 3.0f, 0.44771522f, 3.0f, 1.0f);
        path.lineTo(3.0f, 21.0f);
        Path path2 = path;
        path2.cubicTo(3.0f, 21.552284f, 2.5522847f, 22.0f, 2.0f, 22.0f);
        path.lineTo(1.0f, 22.0f);
        path2.cubicTo(0.44771522f, 22.0f, 0.0f, 21.552284f, 0.0f, 21.0f);
        path.lineTo(0.0f, 1.0f);
        path.close();
        canvas.drawPath(path, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(11.998957f, -1.7763568E-15f);
        instancePath3.cubicTo(11.447248f, -1.7763568E-15f, 11.0f, 0.43945834f, 11.0f, 1.0024617f);
        instancePath3.lineTo(11.0f, 20.997538f);
        instancePath3.cubicTo(11.0f, 21.551182f, 11.44266f, 22.0f, 11.998957f, 22.0f);
        instancePath3.lineTo(13.001043f, 22.0f);
        instancePath3.cubicTo(13.552752f, 22.0f, 14.0f, 21.560541f, 14.0f, 20.997538f);
        instancePath3.lineTo(14.0f, 1.0024617f);
        instancePath3.cubicTo(14.0f, 0.44881737f, 13.55734f, -1.7763568E-15f, 13.001043f, -1.7763568E-15f);
        instancePath3.lineTo(11.998957f, -1.7763568E-15f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-1);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(0.0f, 22.0f);
        instancePath4.cubicTo(0.0f, 21.447716f, 0.44771522f, 21.0f, 1.0f, 21.0f);
        instancePath4.lineTo(47.0f, 21.0f);
        instancePath4.cubicTo(47.552284f, 21.0f, 48.0f, 21.447716f, 48.0f, 22.0f);
        instancePath4.lineTo(48.0f, 23.0f);
        instancePath4.cubicTo(48.0f, 23.552284f, 47.552284f, 24.0f, 47.0f, 24.0f);
        instancePath4.lineTo(1.0f, 24.0f);
        instancePath4.cubicTo(0.44771522f, 24.0f, 0.0f, 23.552284f, 0.0f, 23.0f);
        instancePath4.lineTo(0.0f, 22.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-1);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 0.9659258f, -0.25881904f, 3.58819f, 0.25881904f, 0.9659258f, -2.3841858E-7f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(15.0f, 1.0f);
        instancePath5.cubicTo(15.0f, 0.44771522f, 15.447715f, -6.82121E-13f, 16.0f, -6.82121E-13f);
        instancePath5.lineTo(32.0f, -6.82121E-13f);
        instancePath5.cubicTo(32.552284f, -6.82121E-13f, 33.0f, 0.44771522f, 33.0f, 1.0f);
        instancePath5.lineTo(33.0f, 6.0f);
        instancePath5.cubicTo(33.0f, 6.5522847f, 32.552284f, 7.0f, 32.0f, 7.0f);
        instancePath5.lineTo(16.0f, 7.0f);
        instancePath5.cubicTo(15.447715f, 7.0f, 15.0f, 6.5522847f, 15.0f, 6.0f);
        instancePath5.lineTo(15.0f, 1.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint10);
        canvas.restore();
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(-4.5474735E-13f, 7.0f);
        Path path3 = instancePath6;
        path3.cubicTo(-4.5474735E-13f, 6.4477153f, 0.44771522f, 6.0f, 1.0f, 6.0f);
        instancePath6.lineTo(47.0f, 6.0f);
        path3.cubicTo(47.552284f, 6.0f, 48.0f, 6.4477153f, 48.0f, 7.0f);
        instancePath6.lineTo(48.0f, 9.0f);
        instancePath6.cubicTo(48.0f, 9.552285f, 47.552284f, 10.0f, 47.0f, 10.0f);
        instancePath6.lineTo(1.0f, 10.0f);
        instancePath6.cubicTo(0.44771522f, 10.0f, -4.5474735E-13f, 9.552285f, -4.5474735E-13f, 9.0f);
        instancePath6.lineTo(-4.5474735E-13f, 7.0f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint11);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
