package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_item_biz_pic_loading_icon */
public class chatting_item_biz_pic_loading_icon extends C24542c {
    private final int height = 42;
    private final int width = 42;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 42;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-5066062);
        instancePaint4.setStrokeWidth(3.1751997f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.5875999f, 2.1751997f);
        instancePath.cubicTo(1.5875999f, 1.2983925f, 2.2983925f, 0.5875999f, 3.1751997f, 0.5875999f);
        instancePath.lineTo(38.8248f, 0.5875999f);
        instancePath.cubicTo(39.701607f, 0.5875999f, 40.4124f, 1.2983925f, 40.4124f, 2.1751997f);
        instancePath.lineTo(40.4124f, 27.8248f);
        instancePath.cubicTo(40.4124f, 28.701607f, 39.701607f, 29.412401f, 38.8248f, 29.412401f);
        instancePath.lineTo(3.1751997f, 29.412401f);
        instancePath.cubicTo(2.2983925f, 29.412401f, 1.5875999f, 28.701607f, 1.5875999f, 27.8248f);
        instancePath.lineTo(1.5875999f, 2.1751997f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-5066062);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(31.32f, 14.56f);
        instancePath2.lineTo(26.1f, 19.735f);
        instancePath2.lineTo(28.188f, 23.875f);
        instancePath2.lineTo(13.572f, 10.42f);
        instancePath2.lineTo(0.0f, 22.84f);
        instancePath2.lineTo(0.0f, 29.05f);
        instancePath2.lineTo(40.716f, 29.05f);
        instancePath2.lineTo(40.716f, 22.84f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
