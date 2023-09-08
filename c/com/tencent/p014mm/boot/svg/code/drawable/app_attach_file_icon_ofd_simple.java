package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_ofd_simple */
public class app_attach_file_icon_ofd_simple extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9132032);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.235294f, 0.0f);
        instancePath.lineTo(24.0f, 7.822222f);
        instancePath.lineTo(24.0f, 30.933332f);
        instancePath.cubicTo(24.0f, 31.522436f, 23.525948f, 32.0f, 22.941177f, 32.0f);
        instancePath.lineTo(1.0588236f, 32.0f);
        instancePath.cubicTo(0.47405145f, 32.0f, 0.0f, 31.522436f, 0.0f, 30.933332f);
        instancePath.lineTo(0.0f, 1.0666667f);
        instancePath.cubicTo(0.0f, 0.47756293f, 0.47405145f, 0.0f, 1.0588236f, 0.0f);
        instancePath.lineTo(16.235294f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-10643968);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 7.822222f);
        instancePath2.lineTo(17.294117f, 7.822222f);
        instancePath2.cubicTo(16.709345f, 7.822222f, 16.235294f, 7.3446593f, 16.235294f, 6.7555556f);
        instancePath2.lineTo(16.235294f, 0.0f);
        instancePath2.lineTo(24.0f, 7.822222f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
