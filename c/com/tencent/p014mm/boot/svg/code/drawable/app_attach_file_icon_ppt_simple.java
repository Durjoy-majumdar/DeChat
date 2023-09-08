package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_ppt_simple */
public class app_attach_file_icon_ppt_simple extends C24542c {
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
        instancePaint3.setColor(-892609);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 0.0f);
        instancePath.lineTo(24.0f, 8.0f);
        instancePath.lineTo(23.999863f, 1.0494322f);
        instancePath.cubicTo(23.999954f, 1.0551661f, 24.0f, 1.060911f, 24.0f, 1.0666667f);
        instancePath.lineTo(24.0f, 30.933332f);
        instancePath.cubicTo(24.0f, 31.522438f, 23.522438f, 32.0f, 22.933332f, 32.0f);
        instancePath.lineTo(1.0666667f, 32.0f);
        instancePath.cubicTo(0.47756293f, 32.0f, -1.1601704E-14f, 31.522438f, -1.4210855E-14f, 30.933332f);
        instancePath.lineTo(-1.4210855E-14f, 1.0666667f);
        instancePath.cubicTo(-1.4283E-14f, 0.47756293f, 0.47756293f, 5.523058E-16f, 1.0666667f, 0.0f);
        instancePath.lineTo(16.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 8.0f);
        instancePath2.lineTo(17.066668f, 8.0f);
        instancePath2.cubicTo(16.477562f, 8.0f, 16.0f, 7.522437f, 16.0f, 6.9333334f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(24.0f, 8.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 51, 31);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
