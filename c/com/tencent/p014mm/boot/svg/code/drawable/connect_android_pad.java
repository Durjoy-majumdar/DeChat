package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_android_pad */
public class connect_android_pad extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(100.590164f, 0.0f);
        instancePath.cubicTo(102.473366f, 0.0f, 104.0f, 1.5266356f, 104.0f, 3.409836f);
        instancePath.lineTo(104.0f, 68.196724f);
        instancePath.cubicTo(104.0f, 70.079926f, 102.473366f, 71.60656f, 100.590164f, 71.60656f);
        instancePath.lineTo(3.409836f, 71.60656f);
        Path path = instancePath;
        path.cubicTo(1.5266356f, 71.60656f, 0.0f, 70.079926f, 0.0f, 68.196724f);
        instancePath.lineTo(0.0f, 3.409836f);
        path.cubicTo(0.0f, 1.5266356f, 1.5266356f, 0.0f, 3.409836f, 0.0f);
        instancePath.lineTo(100.590164f, 0.0f);
        instancePath.close();
        instancePath.moveTo(100.590164f, 0.852459f);
        instancePath.lineTo(3.409836f, 0.852459f);
        path.cubicTo(2.0478785f, 0.852459f, 0.9345842f, 1.9171121f, 0.8568003f, 3.2595708f);
        instancePath.lineTo(0.852459f, 3.409836f);
        instancePath.lineTo(0.852459f, 68.196724f);
        path.cubicTo(0.852459f, 69.55868f, 1.9171121f, 70.671974f, 3.2595708f, 70.749756f);
        instancePath.lineTo(3.409836f, 70.7541f);
        instancePath.lineTo(100.590164f, 70.7541f);
        instancePath.cubicTo(101.952126f, 70.7541f, 103.065414f, 69.689445f, 103.1432f, 68.346985f);
        instancePath.lineTo(103.14754f, 68.196724f);
        instancePath.lineTo(103.14754f, 3.409836f);
        instancePath.cubicTo(103.14754f, 2.0478785f, 102.082886f, 0.9345842f, 100.74043f, 0.8568003f);
        instancePath.lineTo(100.590164f, 0.852459f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(52.0f, 2.409836f);
        Path path2 = instancePath2;
        path2.cubicTo(52.552284f, 2.409836f, 53.0f, 2.8575513f, 53.0f, 3.409836f);
        path2.cubicTo(53.0f, 3.9621208f, 52.552284f, 4.409836f, 52.0f, 4.409836f);
        path2.cubicTo(51.447716f, 4.409836f, 51.0f, 3.9621208f, 51.0f, 3.409836f);
        path2.cubicTo(51.0f, 2.8575513f, 51.447716f, 2.409836f, 52.0f, 2.409836f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
