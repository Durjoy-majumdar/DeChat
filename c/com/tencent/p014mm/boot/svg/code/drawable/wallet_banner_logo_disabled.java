package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_banner_logo_disabled */
public class wallet_banner_logo_disabled extends C24542c {
    private final int height = 36;
    private final int width = 45;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 45;
        }
        if (i2 == 1) {
            return 36;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-5066062);
        instancePaint4.setStrokeWidth(3.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 19.0f);
        instancePath.lineTo(0.0f, 10.0f);
        instancePath.lineTo(4.0f, 10.0f);
        Path path = instancePath;
        path.cubicTo(4.0f, 10.0f, 6.2209473f, 10.146362f, 7.607544f, 9.330322f);
        path.cubicTo(10.395386f, 7.628418f, 23.0f, 0.0f, 23.0f, 0.0f);
        instancePath.lineTo(23.0f, 19.0f);
        instancePath.lineTo(23.0f, 36.0f);
        Path path2 = instancePath;
        path2.cubicTo(23.0f, 36.0f, 10.395386f, 28.371582f, 7.607544f, 26.669678f);
        path2.cubicTo(6.2209473f, 25.853638f, 4.0f, 26.0f, 4.0f, 26.0f);
        instancePath.lineTo(0.0f, 26.0f);
        instancePath.lineTo(0.0f, 19.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-5066062);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(28.0f, 8.608248f);
        Path path3 = instancePath2;
        path3.cubicTo(31.119555f, 6.412371f, 34.228916f, 4.195876f, 37.338276f, 2.0f);
        path3.cubicTo(37.888786f, 2.7938144f, 38.44949f, 3.5876288f, 39.0f, 4.371134f);
        path3.cubicTo(35.880444f, 6.587629f, 32.76089f, 8.804124f, 29.641335f, 11.0f);
        path3.cubicTo(29.223354f, 10.402061f, 28.407785f, 9.206185f, 28.0f, 8.608248f);
        instancePath2.lineTo(28.0f, 8.608248f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-5066062);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(29.0f, 17.007513f);
        instancePath3.cubicTo(32.666668f, 16.997496f, 36.333332f, 16.997496f, 40.0f, 17.007513f);
        instancePath3.lineTo(40.0f, 19.992487f);
        instancePath3.cubicTo(36.333332f, 20.002504f, 32.666668f, 20.002504f, 29.0f, 19.992487f);
        instancePath3.lineTo(29.0f, 17.007513f);
        instancePath3.lineTo(29.0f, 17.007513f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-5066062);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(29.381166f, 26.0f);
        Path path4 = instancePath4;
        path4.cubicTo(32.587444f, 27.870647f, 35.79372f, 29.731344f, 39.0f, 31.61194f);
        path4.cubicTo(38.63498f, 32.208954f, 37.9148f, 33.402985f, 37.549774f, 34.0f);
        path4.cubicTo(34.363228f, 32.159203f, 31.186546f, 30.298508f, 28.0f, 28.447762f);
        path4.cubicTo(28.463676f, 27.631842f, 28.927355f, 26.81592f, 29.381166f, 26.0f);
        instancePath4.lineTo(29.381166f, 26.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
