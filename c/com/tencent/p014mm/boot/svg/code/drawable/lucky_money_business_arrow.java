package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_business_arrow */
public class lucky_money_business_arrow extends C24542c {
    private final int height = 49;
    private final int width = 49;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 49;
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
                instancePaint3.setColor(-7503);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -187.0f, 0.0f, 1.0f, -58.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 146.0f, 0.0f, 1.0f, 56.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 90.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.347368f, 0.0f, 1.0f, 0.347368f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(24.252632f, 4.042105f);
                Path path = instancePath;
                path.cubicTo(35.414597f, 4.042105f, 44.463158f, 13.090666f, 44.463158f, 24.252632f);
                path.cubicTo(44.463158f, 35.414597f, 35.414597f, 44.463158f, 24.252632f, 44.463158f);
                path.cubicTo(13.090666f, 44.463158f, 4.042105f, 35.414597f, 4.042105f, 24.252632f);
                path.cubicTo(4.042105f, 13.090666f, 13.090666f, 4.042105f, 24.252632f, 4.042105f);
                instancePath.close();
                instancePath.moveTo(24.252632f, 6.4673686f);
                Path path2 = instancePath;
                path2.cubicTo(14.430102f, 6.4673686f, 6.4673686f, 14.430102f, 6.4673686f, 24.252632f);
                path2.cubicTo(6.4673686f, 34.07516f, 14.430102f, 42.037895f, 24.252632f, 42.037895f);
                path2.cubicTo(34.07516f, 42.037895f, 42.037895f, 34.07516f, 42.037895f, 24.252632f);
                path2.cubicTo(42.037895f, 14.430102f, 34.07516f, 6.4673686f, 24.252632f, 6.4673686f);
                instancePath.close();
                instancePath.moveTo(26.17883f, 15.157895f);
                instancePath.lineTo(28.291775f, 17.305264f);
                instancePath.lineTo(21.585367f, 24.252632f);
                instancePath.lineTo(28.291775f, 31.2f);
                instancePath.lineTo(26.17883f, 33.34737f);
                instancePath.lineTo(19.028698f, 25.973974f);
                instancePath.cubicTo(18.106813f, 25.023302f, 18.11141f, 23.477219f, 19.028698f, 22.531288f);
                instancePath.lineTo(26.17883f, 15.157895f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
