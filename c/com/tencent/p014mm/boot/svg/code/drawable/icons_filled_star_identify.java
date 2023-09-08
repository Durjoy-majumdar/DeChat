package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_star_identify */
public class icons_filled_star_identify extends C24542c {
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
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.394873f, 2.7448633f);
        instancePath.lineTo(17.818247f, 6.1812334f);
        instancePath.lineTo(21.255136f, 7.605128f);
        instancePath.cubicTo(21.629316f, 7.760118f, 21.807005f, 8.189095f, 21.652014f, 8.563274f);
        instancePath.lineTo(20.228193f, 11.999358f);
        instancePath.lineTo(21.652014f, 15.436726f);
        instancePath.cubicTo(21.807005f, 15.810905f, 21.629316f, 16.239882f, 21.255136f, 16.394873f);
        instancePath.lineTo(17.818436f, 17.817028f);
        instancePath.lineTo(16.394873f, 21.255136f);
        instancePath.cubicTo(16.239882f, 21.629316f, 15.810905f, 21.807005f, 15.436726f, 21.652014f);
        instancePath.lineTo(11.999004f, 20.227514f);
        instancePath.lineTo(8.563274f, 21.652014f);
        instancePath.cubicTo(8.189095f, 21.807005f, 7.760118f, 21.629316f, 7.605128f, 21.255136f);
        instancePath.lineTo(6.181335f, 17.817757f);
        instancePath.lineTo(2.7448633f, 16.394873f);
        instancePath.cubicTo(2.370684f, 16.239882f, 2.192996f, 15.810905f, 2.347986f, 15.436726f);
        instancePath.lineTo(3.7713885f, 11.999633f);
        instancePath.lineTo(2.347986f, 8.563274f);
        instancePath.cubicTo(2.192996f, 8.189095f, 2.370684f, 7.760118f, 2.7448633f, 7.605128f);
        instancePath.lineTo(6.1819115f, 6.180115f);
        instancePath.lineTo(7.605128f, 2.7448633f);
        instancePath.cubicTo(7.760118f, 2.370684f, 8.189095f, 2.192996f, 8.563274f, 2.347986f);
        instancePath.lineTo(11.99873f, 3.7707102f);
        instancePath.lineTo(15.436726f, 2.347986f);
        instancePath.cubicTo(15.810905f, 2.192996f, 16.239882f, 2.370684f, 16.394873f, 2.7448633f);
        instancePath.close();
        instancePath.moveTo(16.422754f, 8.54f);
        instancePath.lineTo(10.823438f, 14.139317f);
        instancePath.lineTo(8.057538f, 11.373417f);
        instancePath.lineTo(7.0f, 12.430955f);
        instancePath.lineTo(10.354426f, 15.7878065f);
        instancePath.lineTo(10.354426f, 15.7878065f);
        instancePath.lineTo(10.437046f, 15.858263f);
        instancePath.cubicTo(10.697526f, 16.045769f, 11.062864f, 16.022406f, 11.297163f, 15.788075f);
        instancePath.lineTo(11.297163f, 15.788075f);
        instancePath.lineTo(17.485281f, 9.602528f);
        instancePath.lineTo(16.422754f, 8.54f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
