package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_transform_text_finish_normal */
public class voice_transform_text_finish_normal extends C24542c {
    private final int height = 36;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 36;
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
                instancePaint3.setColor(-3552823);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -259.0f, 0.0f, 1.0f, -131.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 259.0f, 0.0f, 1.0f, 131.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(17.67213f, 35.34426f);
                Path path = instancePath;
                path.cubicTo(7.912082f, 35.34426f, 0.0f, 27.432177f, 0.0f, 17.67213f);
                path.cubicTo(0.0f, 7.912082f, 7.912082f, 0.0f, 17.67213f, 0.0f);
                path.cubicTo(27.432177f, 0.0f, 35.34426f, 7.912082f, 35.34426f, 17.67213f);
                path.cubicTo(35.34426f, 27.432177f, 27.432177f, 35.34426f, 17.67213f, 35.34426f);
                instancePath.close();
                instancePath.moveTo(7.0619354f, 18.702524f);
                path.cubicTo(7.0080047f, 18.810345f, 7.0291414f, 18.94058f, 7.1144037f, 19.02581f);
                instancePath.lineTo(7.1144037f, 19.02581f);
                instancePath.lineTo(13.854528f, 25.76321f);
                instancePath.cubicTo(13.963866f, 25.872507f, 14.141094f, 25.872507f, 14.250432f, 25.76321f);
                instancePath.lineTo(14.250508f, 25.763287f);
                instancePath.lineTo(28.901352f, 11.118186f);
                Path path2 = instancePath;
                path2.cubicTo(28.901379f, 11.118161f, 28.901403f, 11.118136f, 28.901428f, 11.118111f);
                path2.cubicTo(29.010754f, 11.008743f, 29.01072f, 10.831457f, 28.901352f, 10.722131f);
                instancePath.lineTo(28.901278f, 10.722207f);
                instancePath.lineTo(28.675867f, 10.496883f);
                instancePath.lineTo(28.392729f, 10.213852f);
                instancePath.cubicTo(28.291279f, 10.112441f, 28.129597f, 10.104101f, 28.018251f, 10.194535f);
                instancePath.lineTo(28.018251f, 10.194535f);
                instancePath.lineTo(14.218084f, 21.40289f);
                instancePath.cubicTo(14.120261f, 21.48234f, 13.981415f, 21.48665f, 13.878853f, 21.41342f);
                instancePath.lineTo(8.123317f, 17.303892f);
                Path path3 = instancePath;
                path3.cubicTo(8.111442f, 17.295412f, 8.098921f, 17.287874f, 8.08587f, 17.281345f);
                path3.cubicTo(7.9475665f, 17.212168f, 7.7793694f, 17.268206f, 7.7101912f, 17.40651f);
                instancePath.lineTo(7.7101912f, 17.40651f);
                instancePath.lineTo(7.0619354f, 18.702524f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
