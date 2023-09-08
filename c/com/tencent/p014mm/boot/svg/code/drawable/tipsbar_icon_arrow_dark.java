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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tipsbar_icon_arrow_dark */
public class tipsbar_icon_arrow_dark extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(96.0f, 0.0f);
        instancePath.lineTo(96.0f, 96.0f);
        instancePath.lineTo(0.0f, 96.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -21.213203f, -0.70710677f, 0.70710677f, 45.55635f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(57.384777f, 35.384777f);
        instancePath2.lineTo(53.384777f, 35.384777f);
        instancePath2.lineTo(53.384777f, 57.384777f);
        instancePath2.lineTo(31.384777f, 57.384777f);
        instancePath2.lineTo(31.384777f, 61.384777f);
        instancePath2.lineTo(57.384777f, 61.384777f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
