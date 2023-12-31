package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_dotline_minus_bg_pressed */
public class avatar_dotline_minus_bg_pressed extends C24542c {
    private final int height = 168;
    private final int width = 168;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 168;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        C24542c.instanceMatrix(looper);
        C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-8421505);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(47.89736f, 164.64719f);
        instancePath.lineTo(47.89736f, 168.0f);
        instancePath.lineTo(29.935852f, 168.0f);
        instancePath.lineTo(29.935852f, 164.64719f);
        instancePath.lineTo(47.89736f, 164.64719f);
        instancePath.close();
        instancePath.moveTo(77.83321f, 164.64719f);
        instancePath.lineTo(77.83321f, 168.0f);
        instancePath.lineTo(59.871704f, 168.0f);
        instancePath.lineTo(59.871704f, 164.64719f);
        instancePath.lineTo(77.83321f, 164.64719f);
        instancePath.close();
        instancePath.moveTo(137.70493f, 164.64719f);
        instancePath.lineTo(137.70493f, 168.0f);
        instancePath.lineTo(119.74341f, 168.0f);
        instancePath.lineTo(119.74341f, 164.64719f);
        instancePath.lineTo(137.70493f, 164.64719f);
        instancePath.close();
        instancePath.moveTo(107.769066f, 164.64719f);
        instancePath.lineTo(107.769066f, 168.0f);
        instancePath.lineTo(89.807556f, 168.0f);
        instancePath.lineTo(89.807556f, 164.64719f);
        instancePath.lineTo(107.769066f, 164.64719f);
        instancePath.close();
        instancePath.moveTo(167.58112f, 149.67926f);
        instancePath.lineTo(167.5814f, 149.78218f);
        instancePath.cubicTo(167.5814f, 159.64348f, 159.58725f, 167.63765f, 149.72595f, 167.63765f);
        instancePath.lineTo(149.72595f, 167.63765f);
        instancePath.lineTo(149.67926f, 167.63765f);
        instancePath.lineTo(149.67926f, 164.6578f);
        instancePath.lineTo(149.69107f, 164.64702f);
        instancePath.cubicTo(157.9249f, 164.60869f, 164.58783f, 157.92207f, 164.58783f, 149.67926f);
        instancePath.lineTo(164.58783f, 149.67926f);
        instancePath.lineTo(167.58112f, 149.67926f);
        instancePath.close();
        instancePath.moveTo(2.993585f, 149.67926f);
        instancePath.cubicTo(2.993585f, 157.92207f, 9.656524f, 164.60869f, 17.890339f, 164.64702f);
        instancePath.lineTo(17.902153f, 164.6578f);
        instancePath.lineTo(17.902153f, 167.63765f);
        instancePath.lineTo(17.855465f, 167.63765f);
        instancePath.cubicTo(7.994164f, 167.63765f, 3.5527137E-15f, 159.64348f, 0.0f, 149.78218f);
        instancePath.lineTo(2.9663407E-4f, 149.67926f);
        instancePath.lineTo(2.993585f, 149.67926f);
        instancePath.close();
        instancePath.moveTo(3.3528154f, 119.74341f);
        instancePath.lineTo(3.3528154f, 137.70493f);
        instancePath.lineTo(0.0f, 137.70493f);
        instancePath.lineTo(0.0f, 119.74341f);
        instancePath.lineTo(3.3528154f, 119.74341f);
        instancePath.close();
        instancePath.moveTo(168.0f, 119.74341f);
        instancePath.lineTo(168.0f, 137.70493f);
        instancePath.lineTo(164.64719f, 137.70493f);
        instancePath.lineTo(164.64719f, 119.74341f);
        instancePath.lineTo(168.0f, 119.74341f);
        instancePath.close();
        instancePath.moveTo(3.3528154f, 89.807556f);
        instancePath.lineTo(3.3528154f, 107.769066f);
        instancePath.lineTo(0.0f, 107.769066f);
        instancePath.lineTo(0.0f, 89.807556f);
        instancePath.lineTo(3.3528154f, 89.807556f);
        instancePath.close();
        instancePath.moveTo(168.0f, 89.807556f);
        instancePath.lineTo(168.0f, 107.769066f);
        instancePath.lineTo(164.64719f, 107.769066f);
        instancePath.lineTo(164.64719f, 89.807556f);
        instancePath.lineTo(168.0f, 89.807556f);
        instancePath.close();
        instancePath.moveTo(117.34854f, 81.575195f);
        instancePath.lineTo(117.34854f, 86.065575f);
        instancePath.lineTo(50.292233f, 86.065575f);
        instancePath.lineTo(50.292233f, 81.575195f);
        instancePath.lineTo(117.34854f, 81.575195f);
        instancePath.close();
        instancePath.moveTo(3.3528154f, 59.871704f);
        instancePath.lineTo(3.3528154f, 77.83321f);
        instancePath.lineTo(0.0f, 77.83321f);
        instancePath.lineTo(0.0f, 59.871704f);
        instancePath.lineTo(3.3528154f, 59.871704f);
        instancePath.close();
        instancePath.moveTo(168.0f, 59.871704f);
        instancePath.lineTo(168.0f, 77.83321f);
        instancePath.lineTo(164.64719f, 77.83321f);
        instancePath.lineTo(164.64719f, 59.871704f);
        instancePath.lineTo(168.0f, 59.871704f);
        instancePath.close();
        instancePath.moveTo(168.0f, 29.935852f);
        instancePath.lineTo(168.0f, 47.89736f);
        instancePath.lineTo(164.64719f, 47.89736f);
        instancePath.lineTo(164.64719f, 29.935852f);
        instancePath.lineTo(168.0f, 29.935852f);
        instancePath.close();
        instancePath.moveTo(3.3528154f, 29.935852f);
        instancePath.lineTo(3.3528154f, 47.89736f);
        instancePath.lineTo(0.0f, 47.89736f);
        instancePath.lineTo(0.0f, 29.935852f);
        instancePath.lineTo(3.3528154f, 29.935852f);
        instancePath.close();
        instancePath.moveTo(149.72595f, 1.4210855E-14f);
        instancePath.cubicTo(159.58725f, 1.4210855E-14f, 167.5814f, 7.994164f, 167.5814f, 17.855465f);
        instancePath.lineTo(167.58112f, 17.958387f);
        instancePath.lineTo(164.58783f, 17.958387f);
        instancePath.cubicTo(164.58783f, 9.715567f, 157.9249f, 3.0289595f, 149.69107f, 2.9906268f);
        instancePath.lineTo(149.67926f, 2.9798336f);
        instancePath.lineTo(149.67926f, 1.4210855E-14f);
        instancePath.lineTo(149.72595f, 1.4210855E-14f);
        instancePath.close();
        instancePath.moveTo(17.902153f, 1.4210855E-14f);
        instancePath.lineTo(17.902153f, 2.9798336f);
        instancePath.lineTo(17.890339f, 2.9906268f);
        instancePath.cubicTo(9.656524f, 3.0289595f, 2.993585f, 9.715567f, 2.993585f, 17.958387f);
        instancePath.lineTo(2.993585f, 17.958387f);
        instancePath.lineTo(2.9663407E-4f, 17.958387f);
        instancePath.lineTo(0.0f, 17.855465f);
        instancePath.cubicTo(3.5527137E-15f, 7.994164f, 7.994164f, 7.1054274E-15f, 17.855465f, 1.4210855E-14f);
        instancePath.lineTo(17.855465f, 1.4210855E-14f);
        instancePath.lineTo(17.902153f, 1.4210855E-14f);
        instancePath.close();
        instancePath.moveTo(47.89736f, 0.0f);
        instancePath.lineTo(47.89736f, 3.3528154f);
        instancePath.lineTo(29.935852f, 3.3528154f);
        instancePath.lineTo(29.935852f, 0.0f);
        instancePath.lineTo(47.89736f, 0.0f);
        instancePath.close();
        instancePath.moveTo(107.769066f, 0.0f);
        instancePath.lineTo(107.769066f, 3.3528154f);
        instancePath.lineTo(89.807556f, 3.3528154f);
        instancePath.lineTo(89.807556f, 0.0f);
        instancePath.lineTo(107.769066f, 0.0f);
        instancePath.close();
        instancePath.moveTo(137.70493f, 0.0f);
        instancePath.lineTo(137.70493f, 3.3528154f);
        instancePath.lineTo(119.74341f, 3.3528154f);
        instancePath.lineTo(119.74341f, 0.0f);
        instancePath.lineTo(137.70493f, 0.0f);
        instancePath.close();
        instancePath.moveTo(77.83321f, 0.0f);
        instancePath.lineTo(77.83321f, 3.3528154f);
        instancePath.lineTo(59.871704f, 3.3528154f);
        instancePath.lineTo(59.871704f, 0.0f);
        instancePath.lineTo(77.83321f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
