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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.remittance_extra_buy_favor */
public class remittance_extra_buy_favor extends C24542c {
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.25f, 16.25f);
        Path path = instancePath2;
        path.cubicTo(16.57879f, 16.250807f, 16.851986f, 15.996735f, 16.875f, 15.66875f);
        instancePath2.lineTo(16.25f, 4.375f);
        path.cubicTo(16.25f, 4.029822f, 15.970178f, 3.75f, 15.625f, 3.75f);
        instancePath2.lineTo(4.375f, 3.75f);
        path.cubicTo(4.029822f, 3.75f, 3.75f, 4.029822f, 3.75f, 4.375f);
        instancePath2.lineTo(3.125f, 15.625f);
        Path path2 = instancePath2;
        path2.cubicTo(3.125f, 15.970178f, 3.404822f, 16.25f, 3.75f, 16.25f);
        instancePath2.lineTo(16.25f, 16.25f);
        instancePath2.close();
        instancePath2.moveTo(16.25f, 17.5f);
        instancePath2.lineTo(3.75f, 17.5f);
        path2.cubicTo(2.714466f, 17.5f, 1.875f, 16.660534f, 1.875f, 15.625f);
        instancePath2.lineTo(2.5f, 4.375f);
        path2.cubicTo(2.5f, 3.339466f, 3.339466f, 2.5f, 4.375f, 2.5f);
        instancePath2.lineTo(15.625f, 2.5f);
        path2.cubicTo(16.643686f, 2.4997227f, 17.47623f, 3.312841f, 17.5f, 4.33125f);
        instancePath2.lineTo(18.125f, 15.625f);
        instancePath2.cubicTo(18.125f, 16.660534f, 17.285534f, 17.5f, 16.25f, 17.5f);
        instancePath2.lineTo(16.25f, 17.5f);
        instancePath2.close();
        instancePath2.moveTo(12.5f, 6.25f);
        Path path3 = instancePath2;
        path3.cubicTo(12.5f, 5.904822f, 12.779822f, 5.625f, 13.125f, 5.625f);
        path3.cubicTo(13.470178f, 5.625f, 13.75f, 5.904822f, 13.75f, 6.25f);
        path3.cubicTo(13.75f, 8.321068f, 12.071068f, 10.0f, 10.0f, 10.0f);
        path3.cubicTo(7.928932f, 10.0f, 6.25f, 8.321068f, 6.25f, 6.25f);
        path3.cubicTo(6.25f, 5.904822f, 6.529822f, 5.625f, 6.875f, 5.625f);
        path3.cubicTo(7.220178f, 5.625f, 7.5f, 5.904822f, 7.5f, 6.25f);
        path3.cubicTo(7.5f, 7.630712f, 8.619288f, 8.75f, 10.0f, 8.75f);
        path3.cubicTo(11.380712f, 8.75f, 12.5f, 7.630712f, 12.5f, 6.25f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
