package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_wxcredit_open_card */
public class wallet_wxcredit_open_card extends C24542c {
    private final int height = 162;
    private final int width = 162;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 162;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.0f, 37.996094f);
        instancePath.cubicTo(13.0f, 35.789112f, 14.782292f, 34.0f, 17.007507f, 34.0f);
        instancePath.lineTo(145.9925f, 34.0f);
        instancePath.cubicTo(148.20578f, 34.0f, 150.0f, 35.795326f, 150.0f, 37.996094f);
        instancePath.lineTo(150.0f, 123.00391f);
        instancePath.cubicTo(150.0f, 125.21089f, 148.21771f, 127.0f, 145.9925f, 127.0f);
        instancePath.lineTo(17.007507f, 127.0f);
        instancePath.cubicTo(14.794222f, 127.0f, 13.0f, 125.20467f, 13.0f, 123.00391f);
        instancePath.lineTo(13.0f, 37.996094f);
        instancePath.close();
        instancePath.moveTo(23.0f, 52.0f);
        instancePath.lineTo(140.0f, 52.0f);
        instancePath.lineTo(140.0f, 69.0f);
        instancePath.lineTo(23.0f, 69.0f);
        instancePath.lineTo(23.0f, 52.0f);
        instancePath.close();
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 150.0f, 0.0f, 13.0f, 0.0f, 127.0f, 34.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path = instancePath;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-9919532, -10117428}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
