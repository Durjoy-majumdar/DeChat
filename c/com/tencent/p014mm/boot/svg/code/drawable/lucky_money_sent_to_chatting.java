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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_sent_to_chatting */
public class lucky_money_sent_to_chatting extends C24542c {
    private final int height = 34;
    private final int width = 34;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 34;
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
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.save();
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -171.0f, 0.0f, 1.0f, -553.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 171.0f, 0.0f, 1.0f, 553.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.8f, 0.0f, 1.0f, 9.35f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(2.016f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.0626365f, 9.508f);
        Path path = instancePath;
        path.cubicTo(1.5646234f, 14.110367f, 5.464044f, 17.692f, 10.2f, 17.692f);
        path.cubicTo(14.935956f, 17.692f, 18.835377f, 14.110367f, 19.337364f, 9.508f);
        instancePath.lineTo(1.0626365f, 9.508f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.25f, 5.1f);
        Path path2 = instancePath2;
        path2.cubicTo(2.8416739f, 5.1f, 1.7f, 3.958326f, 1.7f, 2.55f);
        path2.cubicTo(1.7f, 1.1416739f, 2.8416739f, 0.0f, 4.25f, 0.0f);
        path2.cubicTo(5.658326f, 0.0f, 6.8f, 1.1416739f, 6.8f, 2.55f);
        path2.cubicTo(6.8f, 3.958326f, 5.658326f, 5.1f, 4.25f, 5.1f);
        instancePath2.close();
        instancePath2.moveTo(16.15f, 5.1f);
        Path path3 = instancePath2;
        path3.cubicTo(14.741673f, 5.1f, 13.6f, 3.958326f, 13.6f, 2.55f);
        path3.cubicTo(13.6f, 1.1416739f, 14.741673f, 0.0f, 16.15f, 0.0f);
        path3.cubicTo(17.558327f, 0.0f, 18.7f, 1.1416739f, 18.7f, 2.55f);
        path3.cubicTo(18.7f, 3.958326f, 17.558327f, 5.1f, 16.15f, 5.1f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(17.0f, 34.0f);
        Path path4 = instancePath3;
        path4.cubicTo(7.6111593f, 34.0f, 0.0f, 26.388842f, 0.0f, 17.0f);
        path4.cubicTo(0.0f, 7.6111593f, 7.6111593f, 0.0f, 17.0f, 0.0f);
        path4.cubicTo(26.388842f, 0.0f, 34.0f, 7.6111593f, 34.0f, 17.0f);
        path4.cubicTo(34.0f, 26.388842f, 26.388842f, 34.0f, 17.0f, 34.0f);
        instancePath3.close();
        instancePath3.moveTo(17.0f, 32.3f);
        path4.cubicTo(25.449957f, 32.3f, 32.3f, 25.449957f, 32.3f, 17.0f);
        path4.cubicTo(32.3f, 8.550043f, 25.449957f, 1.7f, 17.0f, 1.7f);
        path4.cubicTo(8.550043f, 1.7f, 1.7f, 8.550043f, 1.7f, 17.0f);
        path4.cubicTo(1.7f, 25.449957f, 8.550043f, 32.3f, 17.0f, 32.3f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
