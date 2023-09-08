package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_timeline_pic_1_1 */
public class biz_timeline_pic_1_1 extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(19.008198f, 0.0f);
                instancePath.cubicTo(19.544695f, 0.0f, 20.0f, 0.481137f, 20.0f, 1.0746496f);
                instancePath.lineTo(20.0f, 14.92535f);
                instancePath.cubicTo(20.0f, 15.521152f, 19.555954f, 16.0f, 19.008198f, 16.0f);
                instancePath.lineTo(0.9918031f, 16.0f);
                instancePath.cubicTo(0.45530558f, 16.0f, 0.0f, 15.518863f, 0.0f, 14.92535f);
                instancePath.lineTo(0.0f, 1.0746496f);
                instancePath.cubicTo(0.0f, 0.47884822f, 0.44404536f, 0.0f, 0.9918031f, 0.0f);
                instancePath.lineTo(19.008198f, 0.0f);
                instancePath.close();
                instancePath.moveTo(7.0060563f, 6.940083f);
                instancePath.lineTo(1.199f, 11.635f);
                instancePath.lineTo(1.2f, 14.8f);
                instancePath.lineTo(18.8f, 14.8f);
                instancePath.lineTo(18.8f, 11.993609f);
                instancePath.lineTo(15.426184f, 8.957891f);
                instancePath.lineTo(13.237976f, 10.818708f);
                instancePath.lineTo(14.582438f, 12.0f);
                instancePath.lineTo(12.811167f, 12.0f);
                instancePath.lineTo(7.0060563f, 6.940083f);
                instancePath.close();
                instancePath.moveTo(18.8f, 1.2f);
                instancePath.lineTo(1.2f, 1.2f);
                instancePath.lineTo(1.199f, 10.092f);
                instancePath.lineTo(6.1992455f, 6.0492587f);
                instancePath.cubicTo(6.661799f, 5.675185f, 7.4046254f, 5.693327f, 7.8504953f, 6.0850835f);
                instancePath.lineTo(12.326923f, 10.018227f);
                instancePath.lineTo(14.609102f, 8.0774975f);
                instancePath.cubicTo(15.071318f, 7.6844378f, 15.806723f, 7.6924224f, 16.255432f, 8.095083f);
                instancePath.lineTo(18.799f, 10.408f);
                instancePath.lineTo(18.8f, 1.2f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
