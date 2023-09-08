package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.qq */
public class C24264qq extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(27.334614f, 45.865097f);
                Path path = instancePath;
                path.cubicTo(25.343315f, 46.87897f, 21.187138f, 52.730484f, 20.731934f, 57.04248f);
                path.cubicTo(20.231934f, 61.77881f, 21.082403f, 65.68994f, 22.739258f, 65.68994f);
                path.cubicTo(23.691587f, 65.68994f, 25.924526f, 64.05116f, 27.651304f, 61.766052f);
                path.cubicTo(28.861832f, 64.05024f, 30.447872f, 66.10601f, 32.327477f, 67.851654f);
                path.cubicTo(28.999271f, 69.187904f, 26.0f, 71.20011f, 26.0f, 73.5f);
                path.cubicTo(26.0f, 77.52051f, 31.528564f, 80.11182f, 35.64502f, 80.11182f);
                path.cubicTo(38.9312f, 80.11182f, 45.607635f, 78.17335f, 48.0f, 75.37939f);
                instancePath.lineTo(48.0f, 75.37939f);
                Path path2 = instancePath;
                path2.cubicTo(50.392365f, 78.17335f, 57.0688f, 80.11182f, 60.35498f, 80.11182f);
                path2.cubicTo(64.471436f, 80.11182f, 70.0f, 77.52051f, 70.0f, 73.5f);
                path2.cubicTo(70.0f, 71.20011f, 67.000725f, 69.187904f, 63.672523f, 67.851654f);
                instancePath.lineTo(63.672523f, 67.851654f);
                Path path3 = instancePath;
                path3.cubicTo(65.605f, 66.0569f, 67.22717f, 63.934326f, 68.44997f, 61.57273f);
                path3.cubicTo(70.38834f, 63.95817f, 72.97974f, 65.68994f, 74.06749f, 65.68994f);
                path3.cubicTo(75.90844f, 65.68994f, 76.85341f, 61.77881f, 76.29785f, 57.04248f);
                path3.cubicTo(75.76961f, 52.539017f, 70.75588f, 46.356285f, 68.68161f, 45.759216f);
                path3.cubicTo(68.89081f, 44.375946f, 69.0f, 42.95274f, 69.0f, 41.5f);
                path3.cubicTo(69.0f, 27.969023f, 59.59798f, 17.0f, 48.0f, 17.0f);
                path3.cubicTo(36.40202f, 17.0f, 27.0f, 27.969023f, 27.0f, 41.5f);
                path3.cubicTo(27.0f, 42.989834f, 27.11484f, 44.448605f, 27.334614f, 45.865097f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
