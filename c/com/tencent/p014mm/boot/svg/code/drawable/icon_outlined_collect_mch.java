package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_collect_mch */
public class icon_outlined_collect_mch extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(27.88653f, 31.466108f);
                instancePath.lineTo(28.066225f, 31.69833f);
                Path path = instancePath;
                path.cubicTo(29.816444f, 34.14857f, 32.79663f, 35.7f, 36.010094f, 35.7f);
                path.cubicTo(38.894596f, 35.7f, 41.604324f, 34.449062f, 43.48548f, 32.280422f);
                instancePath.lineTo(43.969425f, 31.672972f);
                instancePath.cubicTo(44.30595f, 31.209223f, 44.74379f, 31.1818f, 45.00319f, 31.458992f);
                instancePath.lineTo(45.186497f, 31.68798f);
                Path path2 = instancePath;
                path2.cubicTo(47.00873f, 34.15187f, 50.044872f, 35.7f, 53.31148f, 35.7f);
                path2.cubicTo(54.58133f, 35.7f, 55.833035f, 35.446995f, 57.002457f, 34.995018f);
                instancePath.lineTo(57.002525f, 55.873737f);
                instancePath.cubicTo(57.002525f, 57.32418f, 55.826706f, 58.5f, 54.376263f, 58.5f);
                instancePath.lineTo(40.5f, 58.5f);
                instancePath.lineTo(40.5f, 45.0f);
                instancePath.lineTo(31.5f, 45.0f);
                instancePath.lineTo(31.5f, 58.5f);
                instancePath.lineTo(17.628788f, 58.5f);
                instancePath.cubicTo(16.178343f, 58.5f, 15.002525f, 57.32418f, 15.002525f, 55.873737f);
                instancePath.lineTo(15.001129f, 35.085335f);
                instancePath.cubicTo(15.91218f, 35.39009f, 16.886227f, 35.58857f, 17.90241f, 35.66842f);
                instancePath.lineTo(18.567924f, 35.697247f);
                instancePath.cubicTo(21.672098f, 35.7f, 24.457079f, 34.425243f, 26.404032f, 32.208424f);
                instancePath.lineTo(26.86088f, 31.647106f);
                instancePath.cubicTo(27.192781f, 31.203848f, 27.630913f, 31.183739f, 27.88653f, 31.466108f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(52.499844f, 12.0f);
                instancePath2.cubicTo(53.623856f, 12.0f, 54.642044f, 12.626716f, 55.15539f, 13.604061f);
                instancePath2.lineTo(55.307262f, 13.942451f);
                instancePath2.lineTo(60.0f, 26.4f);
                Path path3 = instancePath2;
                path3.cubicTo(60.0f, 29.08669f, 56.84016f, 32.1f, 53.31148f, 32.1f);
                path3.cubicTo(51.354244f, 32.1f, 49.543137f, 31.24666f, 48.28144f, 29.793364f);
                instancePath2.lineTo(47.631737f, 28.999168f);
                instancePath2.cubicTo(45.94007f, 27.19147f, 43.060207f, 27.23113f, 41.41867f, 29.096111f);
                instancePath2.lineTo(40.766037f, 29.921478f);
                Path path4 = instancePath2;
                path4.cubicTo(39.57726f, 31.291927f, 37.86376f, 32.1f, 36.010094f, 32.1f);
                path4.cubicTo(34.1216f, 32.1f, 32.37735f, 31.261152f, 31.181078f, 29.840384f);
                instancePath2.lineTo(30.86871f, 29.438667f);
                instancePath2.lineTo(30.555408f, 29.050102f);
                instancePath2.cubicTo(28.89311f, 27.213821f, 26.012299f, 27.205408f, 24.340797f, 29.043337f);
                instancePath2.lineTo(23.699135f, 29.832811f);
                instancePath2.cubicTo(22.570066f, 31.118382f, 21.003021f, 31.926348f, 19.286148f, 32.075085f);
                instancePath2.lineTo(18.708702f, 32.1f);
                instancePath2.lineTo(18.184422f, 32.079483f);
                instancePath2.cubicTo(14.889109f, 31.820543f, 12.261129f, 29.823675f, 12.018318f, 26.852835f);
                instancePath2.lineTo(12.0f, 26.4f);
                instancePath2.lineTo(16.70822f, 13.939609f);
                instancePath2.cubicTo(17.105164f, 12.889091f, 18.05004f, 12.158422f, 19.144682f, 12.022794f);
                instancePath2.lineTo(19.514565f, 12.0f);
                instancePath2.lineTo(52.499844f, 12.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
