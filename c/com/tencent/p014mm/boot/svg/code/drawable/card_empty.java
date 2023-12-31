package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_empty */
public class card_empty extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(1.6f, 5.6614323f);
                instancePath.lineTo(1.6f, 19.100517f);
                instancePath.lineTo(23.733334f, 22.012798f);
                instancePath.lineTo(23.733334f, 8.573713f);
                instancePath.lineTo(1.6f, 5.6614323f);
                instancePath.close();
                instancePath.moveTo(22.87462f, 0.8229694f);
                instancePath.cubicTo(23.496151f, 0.73664576f, 24.0f, 1.1719935f, 24.0f, 1.8082237f);
                instancePath.lineTo(24.0f, 1.8082237f);
                instancePath.lineTo(24.0f, 6.994067f);
                instancePath.lineTo(24.212105f, 7.022918f);
                instancePath.cubicTo(24.831343f, 7.104397f, 25.333334f, 7.6875243f, 25.333334f, 8.316016f);
                instancePath.lineTo(25.333334f, 22.501385f);
                instancePath.cubicTo(25.333334f, 23.239088f, 24.7321f, 23.758005f, 24.006971f, 23.662594f);
                instancePath.lineTo(1.1212294f, 20.651312f);
                instancePath.cubicTo(0.5019915f, 20.569834f, 0.0f, 19.986706f, 0.0f, 19.358213f);
                instancePath.lineTo(0.0f, 5.172845f);
                instancePath.lineTo(0.001f, 5.141067f);
                instancePath.cubicTo(0.0f, 4.5531235f, 0.43666545f, 4.008028f, 1.0023082f, 3.867489f);
                instancePath.lineTo(1.1253794f, 3.8436973f);
                instancePath.close();
                instancePath.moveTo(22.4f, 2.5042472f);
                instancePath.lineTo(6.576f, 4.702067f);
                instancePath.lineTo(22.399f, 6.783067f);
                instancePath.lineTo(22.4f, 2.5042472f);
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
