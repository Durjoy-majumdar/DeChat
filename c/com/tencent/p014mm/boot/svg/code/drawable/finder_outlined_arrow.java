package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_outlined_arrow */
public class finder_outlined_arrow extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, 1.0f, 7.757359f, -1.0f, 6.123234E-17f, 18.792892f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.792893f, 3.4926407f);
        instancePath.lineTo(13.792893f, 4.9926405f);
        instancePath.lineTo(2.664f, 4.992f);
        instancePath.lineTo(5.0961943f, 7.424621f);
        instancePath.lineTo(4.035534f, 8.485281f);
        instancePath.lineTo(0.14644662f, 4.5961943f);
        instancePath.cubicTo(-0.048815537f, 4.400932f, -0.048815537f, 4.0843496f, 0.14644662f, 3.8890872f);
        instancePath.lineTo(0.8535534f, 3.1819806f);
        instancePath.lineTo(0.854f, 3.182f);
        instancePath.lineTo(4.035534f, -7.1054274E-15f);
        instancePath.lineTo(5.0961943f, 1.0606601f);
        instancePath.lineTo(2.664f, 3.492f);
        instancePath.lineTo(13.792893f, 3.4926407f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
