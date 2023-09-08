package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_test_open */
public class album_test_open extends C24542c {
    private final int height = 46;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 46;
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
                instancePaint3.setColor(-11184811);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(1.1462798f, 3.4678159f);
                Path path = instancePath;
                path.cubicTo(-0.14277528f, 2.6805818f, -0.7123578f, 0.109614864f, 1.4360675f, 0.0f);
                path.cubicTo(4.623731f, 1.624293f, 6.612273f, 4.872879f, 9.310296f, 7.1548615f);
                path.cubicTo(10.96908f, 5.699973f, 12.857696f, 4.5440345f, 14.886209f, 3.6970105f);
                path.cubicTo(15.485769f, 1.9431727f, 16.874752f, -0.3188796f, 19.083132f, 0.52814436f);
                path.cubicTo(20.75191f, 0.827094f, 20.961756f, 2.7104766f, 21.561316f, 3.9660652f);
                path.cubicTo(24.129435f, 5.3213034f, 26.577639f, 7.134931f, 27.756775f, 9.885268f);
                path.cubicTo(30.714607f, 15.515486f, 28.865961f, 22.112309f, 30.7246f, 28.001616f);
                path.cubicTo(32.263474f, 30.851603f, 35.39118f, 32.42607f, 37.0f, 35.26609f);
                path.cubicTo(36.56032f, 35.70455f, 35.70095f, 36.56154f, 35.261276f, 37.0f);
                path.cubicTo(33.11285f, 35.624832f, 31.424088f, 33.68166f, 29.645391f, 31.88796f);
                path.cubicTo(20.142357f, 22.411257f, 10.639321f, 12.944519f, 1.1462798f, 3.4678159f);
                instancePath.lineTo(1.1462798f, 3.4678159f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(6.4937344f, 13.0f);
                Path path2 = instancePath2;
                path2.cubicTo(14.062656f, 20.270292f, 21.491228f, 27.668304f, 29.0f, 34.997543f);
                path2.cubicTo(19.666666f, 34.997543f, 10.333333f, 35.00737f, 1.0f, 34.98772f);
                path2.cubicTo(1.7719299f, 32.541363f, 3.9172933f, 30.812214f, 4.5889726f, 28.336386f);
                path2.cubicTo(6.3233085f, 23.394552f, 5.3508773f, 18.05973f, 6.4937344f, 13.0f);
                instancePath2.lineTo(6.4937344f, 13.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
