package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_pick_top_title_icon_normal */
public class lucky_money_pick_top_title_icon_normal extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        instancePath.lineTo(16.0f, 0.0f);
        instancePath.lineTo(16.0f, 16.0f);
        instancePath.lineTo(0.0f, 16.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.47f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.6f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(0.93137085f, 0.0f, 1.2f, 0.26862916f, 1.2f, 0.6f);
        instancePath2.lineTo(1.2f, 8.066667f);
        path.cubicTo(1.2f, 8.398038f, 0.93137085f, 8.666667f, 0.6f, 8.666667f);
        path.cubicTo(0.26862916f, 8.666667f, 0.0f, 8.398038f, 0.0f, 8.066667f);
        instancePath2.lineTo(0.0f, 0.6f);
        path.cubicTo(0.0f, 0.26862916f, 0.26862916f, 0.0f, 0.6f, 0.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(11.0f, 2.0f);
        Path path2 = instancePath3;
        instancePath3.cubicTo(11.552284f, 2.0f, 12.0f, 2.4477153f, 12.0f, 3.0f);
        path2.lineTo(12.0f, 13.0f);
        path2.cubicTo(12.0f, 13.552284f, 11.552284f, 14.0f, 11.0f, 14.0f);
        path2.lineTo(5.0f, 14.0f);
        path2.cubicTo(4.4477153f, 14.0f, 4.0f, 13.552284f, 4.0f, 13.0f);
        path2.lineTo(4.0f, 3.0f);
        path2.cubicTo(4.0f, 2.4477153f, 4.4477153f, 2.0f, 5.0f, 2.0f);
        path2.lineTo(11.0f, 2.0f);
        path2.close();
        path2.moveTo(10.8f, 3.2f);
        path2.lineTo(5.2f, 3.2f);
        path2.lineTo(5.2f, 12.8f);
        path2.lineTo(10.8f, 12.8f);
        path2.lineTo(10.8f, 3.2f);
        path2.close();
        WeChatSVGRenderC2Java.setFillType(path2, 1);
        canvas.drawPath(path2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 13.333333f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(0.6f, 0.0f);
        instancePath4.cubicTo(0.93137085f, 0.0f, 1.2f, 0.26862916f, 1.2f, 0.6f);
        instancePath4.lineTo(1.2f, 8.066667f);
        Path path3 = instancePath4;
        path3.cubicTo(1.2f, 8.398038f, 0.93137085f, 8.666667f, 0.6f, 8.666667f);
        path3.cubicTo(0.26862916f, 8.666667f, 0.0f, 8.398038f, 0.0f, 8.066667f);
        instancePath4.lineTo(0.0f, 0.6f);
        instancePath4.cubicTo(0.0f, 0.26862916f, 0.26862916f, 0.0f, 0.6f, 0.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
