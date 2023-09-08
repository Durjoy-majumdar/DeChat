package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_arrow_down */
public class app_attach_file_arrow_down extends C24542c {
    private final int height = 36;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 36;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -6.123234E-17f, -1.0f, 33.0f, -1.0f, 6.123234E-17f, 37.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.0f, -2.2737368E-13f);
        instancePath.lineTo(37.0f, -2.2737368E-13f);
        instancePath.lineTo(37.0f, 30.0f);
        instancePath.lineTo(1.0f, 30.0f);
        instancePath.lineTo(1.0f, -2.2737368E-13f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(11.684951f, 3.75f);
        instancePath2.lineTo(15.354067f, 7.5f);
        instancePath2.lineTo(10.609327f, 12.348f);
        instancePath2.lineTo(21.433258f, 12.34835f);
        instancePath2.lineTo(21.433258f, 17.65165f);
        instancePath2.lineTo(10.610328f, 17.651f);
        instancePath2.lineTo(15.354067f, 22.5f);
        instancePath2.lineTo(11.684951f, 26.25f);
        instancePath2.lineTo(1.2001371f, 15.534054f);
        instancePath2.cubicTo(0.9097244f, 15.237239f, 0.9097244f, 14.762761f, 1.2001371f, 14.465946f);
        instancePath2.lineTo(4.3467183f, 11.25f);
        instancePath2.lineTo(11.684951f, 3.75f);
        instancePath2.close();
        instancePath2.moveTo(29.216629f, 12.34835f);
        instancePath2.lineTo(29.216629f, 17.65165f);
        instancePath2.lineTo(24.027716f, 17.65165f);
        instancePath2.lineTo(24.027716f, 12.34835f);
        instancePath2.lineTo(29.216629f, 12.34835f);
        instancePath2.close();
        instancePath2.moveTo(37.0f, 12.34835f);
        instancePath2.lineTo(37.0f, 17.65165f);
        instancePath2.lineTo(31.811087f, 17.65165f);
        instancePath2.lineTo(31.811087f, 12.34835f);
        instancePath2.lineTo(37.0f, 12.34835f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
