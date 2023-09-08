package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_pay_no_record_icon */
public class honey_pay_no_record_icon extends C24542c {
    private final int height = 30;
    private final int width = 26;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 26;
        }
        if (i2 == 1) {
            return 30;
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
        canvas.save();
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -174.0f, 0.0f, 1.0f, -448.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-3684409);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(199.0f, 450.0f);
        instancePath.cubicTo(199.55229f, 450.0f, 200.0f, 450.44772f, 200.0f, 451.0f);
        instancePath.lineTo(200.0f, 477.0f);
        instancePath.cubicTo(200.0f, 477.55228f, 199.55229f, 478.0f, 199.0f, 478.0f);
        instancePath.lineTo(175.0f, 478.0f);
        instancePath.cubicTo(174.44771f, 478.0f, 174.0f, 477.55228f, 174.0f, 477.0f);
        instancePath.lineTo(174.0f, 451.0f);
        instancePath.cubicTo(174.0f, 450.44772f, 174.44771f, 450.0f, 175.0f, 450.0f);
        instancePath.lineTo(177.0f, 450.0f);
        Path path = instancePath;
        path.cubicTo(177.55229f, 450.0f, 178.0f, 450.44772f, 178.0f, 451.0f);
        path.cubicTo(178.0f, 451.55228f, 177.55229f, 452.0f, 177.0f, 452.0f);
        instancePath.lineTo(176.0f, 452.0f);
        instancePath.lineTo(176.0f, 476.0f);
        instancePath.lineTo(198.0f, 476.0f);
        instancePath.lineTo(198.0f, 452.0f);
        instancePath.lineTo(197.0f, 452.0f);
        Path path2 = instancePath;
        path2.cubicTo(196.44771f, 452.0f, 196.0f, 451.55228f, 196.0f, 451.0f);
        path2.cubicTo(196.0f, 450.44772f, 196.44771f, 450.0f, 197.0f, 450.0f);
        instancePath.lineTo(199.0f, 450.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 448.0f);
        path2.cubicTo(181.55229f, 448.0f, 182.0f, 448.44772f, 182.0f, 449.0f);
        instancePath.lineTo(182.0f, 453.0f);
        Path path3 = instancePath;
        path3.cubicTo(182.0f, 453.55228f, 181.55229f, 454.0f, 181.0f, 454.0f);
        path3.cubicTo(180.44771f, 454.0f, 180.0f, 453.55228f, 180.0f, 453.0f);
        instancePath.lineTo(180.0f, 449.0f);
        Path path4 = instancePath;
        path4.cubicTo(180.0f, 448.44772f, 180.44771f, 448.0f, 181.0f, 448.0f);
        instancePath.close();
        instancePath.moveTo(193.0f, 448.0f);
        path4.cubicTo(193.55229f, 448.0f, 194.0f, 448.44772f, 194.0f, 449.0f);
        instancePath.lineTo(194.0f, 453.0f);
        path4.cubicTo(194.0f, 453.55228f, 193.55229f, 454.0f, 193.0f, 454.0f);
        path4.cubicTo(192.44771f, 454.0f, 192.0f, 453.55228f, 192.0f, 453.0f);
        instancePath.lineTo(192.0f, 449.0f);
        path4.cubicTo(192.0f, 448.44772f, 192.44771f, 448.0f, 193.0f, 448.0f);
        instancePath.close();
        instancePath.moveTo(185.0f, 450.0f);
        instancePath.lineTo(189.0f, 450.0f);
        path4.cubicTo(189.55229f, 450.0f, 190.0f, 450.44772f, 190.0f, 451.0f);
        path4.cubicTo(190.0f, 451.55228f, 189.55229f, 452.0f, 189.0f, 452.0f);
        instancePath.lineTo(185.0f, 452.0f);
        path4.cubicTo(184.44771f, 452.0f, 184.0f, 451.55228f, 184.0f, 451.0f);
        path4.cubicTo(184.0f, 450.44772f, 184.44771f, 450.0f, 185.0f, 450.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 460.0f);
        instancePath.lineTo(193.0f, 460.0f);
        path4.cubicTo(193.55229f, 460.0f, 194.0f, 460.44772f, 194.0f, 461.0f);
        path4.cubicTo(194.0f, 461.55228f, 193.55229f, 462.0f, 193.0f, 462.0f);
        instancePath.lineTo(181.0f, 462.0f);
        Path path5 = instancePath;
        path5.cubicTo(180.44771f, 462.0f, 180.0f, 461.55228f, 180.0f, 461.0f);
        path5.cubicTo(180.0f, 460.44772f, 180.44771f, 460.0f, 181.0f, 460.0f);
        instancePath.close();
        instancePath.moveTo(181.0f, 468.0f);
        instancePath.lineTo(193.0f, 468.0f);
        Path path6 = instancePath;
        path6.cubicTo(193.55229f, 468.0f, 194.0f, 468.44772f, 194.0f, 469.0f);
        path6.cubicTo(194.0f, 469.55228f, 193.55229f, 470.0f, 193.0f, 470.0f);
        instancePath.lineTo(181.0f, 470.0f);
        path6.cubicTo(180.44771f, 470.0f, 180.0f, 469.55228f, 180.0f, 469.0f);
        path6.cubicTo(180.0f, 468.44772f, 180.44771f, 468.0f, 181.0f, 468.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
