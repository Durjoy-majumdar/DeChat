package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_nearby_refresh */
public class app_brand_nearby_refresh extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 63;
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
                instancePaint3.setColor(-11048043);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -131.0f, 0.0f, 1.0f, -206.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(161.0f, 261.92117f);
                Path path = instancePath;
                path.cubicTo(148.12799f, 260.90228f, 138.0f, 250.13391f, 138.0f, 237.0f);
                path.cubicTo(138.0f, 230.57487f, 140.42381f, 224.71585f, 144.40697f, 220.28743f);
                instancePath.lineTo(148.24004f, 223.50375f);
                Path path2 = instancePath;
                path2.cubicTo(144.98555f, 227.06102f, 143.0f, 231.79863f, 143.0f, 237.0f);
                path2.cubicTo(143.0f, 247.27452f, 150.74763f, 255.7395f, 160.71942f, 256.8714f);
                instancePath.lineTo(161.0f, 257.10684f);
                instancePath.lineTo(161.0f, 253.35852f);
                instancePath.cubicTo(161.0f, 253.00606f, 161.22818f, 252.89862f, 161.50964f, 253.09564f);
                instancePath.lineTo(170.49036f, 259.38214f);
                instancePath.cubicTo(170.77235f, 259.57953f, 170.77182f, 259.89862f, 170.49036f, 260.09564f);
                instancePath.lineTo(161.50964f, 266.38214f);
                Path path3 = instancePath;
                path3.cubicTo(161.22765f, 266.57953f, 161.0f, 266.4615f, 161.0f, 266.11926f);
                instancePath.lineTo(161.0f, 261.92117f);
                instancePath.close();
                instancePath.moveTo(161.0f, 212.07884f);
                path3.cubicTo(161.65979f, 212.02661f, 162.32678f, 212.0f, 163.0f, 212.0f);
                path3.cubicTo(176.80711f, 212.0f, 188.0f, 223.19289f, 188.0f, 237.0f);
                path3.cubicTo(188.0f, 244.6545f, 184.55992f, 251.50551f, 179.14146f, 256.09134f);
                instancePath.lineTo(175.24045f, 252.81801f);
                Path path4 = instancePath;
                path4.cubicTo(179.96123f, 249.15959f, 183.0f, 243.43468f, 183.0f, 237.0f);
                path4.cubicTo(183.0f, 225.9543f, 174.0457f, 217.0f, 163.0f, 217.0f);
                path4.cubicTo(162.325f, 217.0f, 161.6578f, 217.03343f, 161.0f, 217.09875f);
                instancePath.lineTo(161.0f, 221.11926f);
                instancePath.cubicTo(161.0f, 221.47173f, 160.77182f, 221.57916f, 160.49036f, 221.38214f);
                instancePath.lineTo(151.50964f, 215.09564f);
                instancePath.cubicTo(151.22765f, 214.89825f, 151.22818f, 214.57916f, 151.50964f, 214.38214f);
                instancePath.lineTo(160.49036f, 208.09564f);
                instancePath.cubicTo(160.77235f, 207.89825f, 161.0f, 208.01631f, 161.0f, 208.35852f);
                instancePath.lineTo(161.0f, 212.07884f);
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
