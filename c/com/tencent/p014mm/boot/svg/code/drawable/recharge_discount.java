package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.recharge_discount */
public class recharge_discount extends C24542c {
    private final int height = 66;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 66;
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
        instancePaint3.setColor(-743631);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(25.0f, 0.0f);
        instancePath.lineTo(0.0f, 24.999f);
        instancePath.lineTo(0.0f, 66.0f);
        instancePath.lineTo(65.999f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -10.128628f, -0.70710677f, 0.70710677f, 23.25059f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.08163f, 14.701631f);
        instancePath2.lineTo(17.521631f, 14.701631f);
        instancePath2.lineTo(17.521631f, 16.84163f);
        instancePath2.lineTo(21.22163f, 16.84163f);
        instancePath2.lineTo(21.22163f, 18.14163f);
        instancePath2.lineTo(17.521631f, 18.14163f);
        instancePath2.lineTo(17.521631f, 20.48163f);
        instancePath2.lineTo(22.101631f, 20.48163f);
        instancePath2.lineTo(22.101631f, 21.84163f);
        instancePath2.lineTo(11.461631f, 21.84163f);
        instancePath2.lineTo(11.461631f, 20.48163f);
        instancePath2.lineTo(16.08163f, 20.48163f);
        instancePath2.lineTo(16.08163f, 18.14163f);
        instancePath2.lineTo(12.56163f, 18.14163f);
        instancePath2.lineTo(12.56163f, 16.84163f);
        instancePath2.lineTo(16.08163f, 16.84163f);
        instancePath2.lineTo(16.08163f, 14.701631f);
        instancePath2.close();
        instancePath2.moveTo(11.94163f, 24.201632f);
        instancePath2.lineTo(18.34163f, 24.201632f);
        instancePath2.lineTo(18.34163f, 22.90163f);
        instancePath2.lineTo(19.74163f, 22.90163f);
        instancePath2.lineTo(19.74163f, 24.201632f);
        instancePath2.lineTo(21.941631f, 24.201632f);
        instancePath2.lineTo(21.941631f, 25.56163f);
        instancePath2.lineTo(19.74163f, 25.56163f);
        instancePath2.lineTo(19.74163f, 31.201632f);
        instancePath2.cubicTo(19.74163f, 32.321632f, 19.201632f, 32.90163f, 18.16163f, 32.90163f);
        instancePath2.lineTo(15.621631f, 32.90163f);
        instancePath2.lineTo(15.3216305f, 31.54163f);
        Path path = instancePath2;
        path.cubicTo(16.12163f, 31.601631f, 16.90163f, 31.64163f, 17.66163f, 31.64163f);
        path.cubicTo(18.101631f, 31.64163f, 18.34163f, 31.361631f, 18.34163f, 30.84163f);
        instancePath2.lineTo(18.34163f, 25.56163f);
        instancePath2.lineTo(11.94163f, 25.56163f);
        instancePath2.lineTo(11.94163f, 24.201632f);
        instancePath2.close();
        instancePath2.moveTo(13.421631f, 26.48163f);
        instancePath2.cubicTo(14.461631f, 27.64163f, 15.261631f, 28.64163f, 15.8216305f, 29.521631f);
        instancePath2.lineTo(14.68163f, 30.32163f);
        instancePath2.cubicTo(14.10163f, 29.361631f, 13.301631f, 28.32163f, 12.301631f, 27.181631f);
        instancePath2.lineTo(13.421631f, 26.48163f);
        instancePath2.close();
        instancePath2.moveTo(5.8616304f, 20.281631f);
        instancePath2.cubicTo(5.6616306f, 21.30163f, 5.4216304f, 22.281631f, 5.1416306f, 23.22163f);
        instancePath2.lineTo(3.8816307f, 22.861631f);
        instancePath2.cubicTo(4.501631f, 20.781631f, 4.8616304f, 18.601631f, 4.9416304f, 16.30163f);
        instancePath2.lineTo(6.2616305f, 16.40163f);
        instancePath2.cubicTo(6.2216306f, 17.261631f, 6.1616306f, 18.08163f, 6.0616307f, 18.88163f);
        instancePath2.lineTo(7.7416306f, 18.88163f);
        instancePath2.lineTo(7.7416306f, 14.721631f);
        instancePath2.lineTo(9.121631f, 14.721631f);
        instancePath2.lineTo(9.121631f, 18.88163f);
        instancePath2.lineTo(10.94163f, 18.88163f);
        instancePath2.lineTo(10.94163f, 20.281631f);
        instancePath2.lineTo(9.121631f, 20.281631f);
        instancePath2.lineTo(9.121631f, 25.08163f);
        instancePath2.cubicTo(9.761631f, 24.82163f, 10.381631f, 24.56163f, 11.001631f, 24.281631f);
        instancePath2.lineTo(11.001631f, 25.64163f);
        Path path2 = instancePath2;
        path2.cubicTo(10.36163f, 25.92163f, 9.741631f, 26.181631f, 9.121631f, 26.42163f);
        instancePath2.lineTo(9.121631f, 33.04163f);
        instancePath2.lineTo(7.7416306f, 33.04163f);
        instancePath2.lineTo(7.7416306f, 26.941631f);
        path2.cubicTo(6.6216307f, 27.32163f, 5.4616303f, 27.66163f, 4.3016305f, 27.98163f);
        instancePath2.lineTo(3.9616306f, 26.58163f);
        instancePath2.cubicTo(5.2416306f, 26.32163f, 6.501631f, 25.98163f, 7.7416306f, 25.58163f);
        instancePath2.lineTo(7.7416306f, 20.281631f);
        instancePath2.lineTo(5.8616304f, 20.281631f);
        instancePath2.close();
        instancePath2.moveTo(24.181631f, 16.00163f);
        instancePath2.lineTo(32.321632f, 16.00163f);
        instancePath2.lineTo(32.321632f, 14.661631f);
        instancePath2.lineTo(33.76163f, 14.661631f);
        instancePath2.lineTo(33.76163f, 16.00163f);
        instancePath2.lineTo(41.90163f, 16.00163f);
        instancePath2.lineTo(41.90163f, 17.24163f);
        instancePath2.lineTo(33.76163f, 17.24163f);
        instancePath2.lineTo(33.76163f, 18.38163f);
        instancePath2.lineTo(40.10163f, 18.38163f);
        instancePath2.lineTo(40.10163f, 24.181631f);
        instancePath2.lineTo(39.16163f, 24.181631f);
        instancePath2.cubicTo(40.321632f, 25.181631f, 41.22163f, 26.04163f, 41.86163f, 26.80163f);
        instancePath2.lineTo(40.801632f, 27.54163f);
        Path path3 = instancePath2;
        path3.cubicTo(40.481632f, 27.12163f, 40.10163f, 26.701632f, 39.68163f, 26.261631f);
        path3.cubicTo(36.28163f, 26.50163f, 31.32163f, 26.72163f, 24.84163f, 26.88163f);
        instancePath2.lineTo(24.66163f, 25.601631f);
        instancePath2.cubicTo(27.46163f, 25.56163f, 30.00163f, 25.521631f, 32.321632f, 25.46163f);
        instancePath2.lineTo(32.321632f, 24.181631f);
        instancePath2.lineTo(25.98163f, 24.181631f);
        instancePath2.lineTo(25.98163f, 18.38163f);
        instancePath2.lineTo(32.321632f, 18.38163f);
        instancePath2.lineTo(32.321632f, 17.24163f);
        instancePath2.lineTo(24.181631f, 17.24163f);
        instancePath2.lineTo(24.181631f, 16.00163f);
        instancePath2.close();
        instancePath2.moveTo(38.66163f, 25.24163f);
        instancePath2.cubicTo(38.38163f, 24.98163f, 38.12163f, 24.72163f, 37.84163f, 24.48163f);
        instancePath2.lineTo(38.34163f, 24.181631f);
        instancePath2.lineTo(33.76163f, 24.181631f);
        instancePath2.lineTo(33.76163f, 25.42163f);
        instancePath2.cubicTo(35.56163f, 25.361631f, 37.18163f, 25.30163f, 38.66163f, 25.24163f);
        instancePath2.close();
        instancePath2.moveTo(38.72163f, 23.101631f);
        instancePath2.lineTo(38.72163f, 21.761631f);
        instancePath2.lineTo(33.76163f, 21.761631f);
        instancePath2.lineTo(33.76163f, 23.101631f);
        instancePath2.lineTo(38.72163f, 23.101631f);
        instancePath2.close();
        instancePath2.moveTo(32.321632f, 23.101631f);
        instancePath2.lineTo(32.321632f, 21.761631f);
        instancePath2.lineTo(27.361631f, 21.761631f);
        instancePath2.lineTo(27.361631f, 23.101631f);
        instancePath2.lineTo(32.321632f, 23.101631f);
        instancePath2.close();
        instancePath2.moveTo(27.361631f, 20.781631f);
        instancePath2.lineTo(32.321632f, 20.781631f);
        instancePath2.lineTo(32.321632f, 19.48163f);
        instancePath2.lineTo(27.361631f, 19.48163f);
        instancePath2.lineTo(27.361631f, 20.781631f);
        instancePath2.close();
        instancePath2.moveTo(33.76163f, 19.48163f);
        instancePath2.lineTo(33.76163f, 20.781631f);
        instancePath2.lineTo(38.72163f, 20.781631f);
        instancePath2.lineTo(38.72163f, 19.48163f);
        instancePath2.lineTo(33.76163f, 19.48163f);
        instancePath2.close();
        instancePath2.moveTo(25.98163f, 27.701632f);
        instancePath2.lineTo(27.281631f, 27.96163f);
        instancePath2.cubicTo(26.80163f, 29.64163f, 26.12163f, 31.101631f, 25.24163f, 32.34163f);
        instancePath2.lineTo(24.04163f, 31.58163f);
        instancePath2.cubicTo(24.92163f, 30.40163f, 25.58163f, 29.101631f, 25.98163f, 27.701632f);
        instancePath2.close();
        instancePath2.moveTo(35.78163f, 32.72163f);
        instancePath2.lineTo(30.50163f, 32.72163f);
        instancePath2.cubicTo(29.32163f, 32.72163f, 28.74163f, 32.16163f, 28.74163f, 31.04163f);
        instancePath2.lineTo(28.74163f, 27.54163f);
        instancePath2.lineTo(30.14163f, 27.54163f);
        instancePath2.lineTo(30.14163f, 30.74163f);
        instancePath2.cubicTo(30.14163f, 31.181631f, 30.40163f, 31.40163f, 30.92163f, 31.40163f);
        instancePath2.lineTo(35.52163f, 31.40163f);
        Path path4 = instancePath2;
        path4.cubicTo(35.90163f, 31.40163f, 36.16163f, 31.30163f, 36.321632f, 31.12163f);
        path4.cubicTo(36.52163f, 30.90163f, 36.66163f, 30.261631f, 36.74163f, 29.201632f);
        instancePath2.lineTo(38.06163f, 29.62163f);
        Path path5 = instancePath2;
        path5.cubicTo(37.92163f, 31.101631f, 37.66163f, 31.98163f, 37.301632f, 32.301632f);
        path5.cubicTo(36.981632f, 32.58163f, 36.481632f, 32.72163f, 35.78163f, 32.72163f);
        instancePath2.close();
        instancePath2.moveTo(33.02163f, 27.14163f);
        instancePath2.cubicTo(34.04163f, 28.06163f, 34.821632f, 28.88163f, 35.38163f, 29.58163f);
        instancePath2.lineTo(34.301632f, 30.34163f);
        instancePath2.cubicTo(33.72163f, 29.58163f, 32.94163f, 28.72163f, 31.941631f, 27.80163f);
        instancePath2.lineTo(33.02163f, 27.14163f);
        instancePath2.close();
        instancePath2.moveTo(39.06163f, 27.281631f);
        instancePath2.cubicTo(40.38163f, 28.761631f, 41.40163f, 30.08163f, 42.12163f, 31.201632f);
        instancePath2.lineTo(40.981632f, 31.96163f);
        instancePath2.cubicTo(40.24163f, 30.761631f, 39.24163f, 29.441631f, 37.981632f, 27.98163f);
        instancePath2.lineTo(39.06163f, 27.281631f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
