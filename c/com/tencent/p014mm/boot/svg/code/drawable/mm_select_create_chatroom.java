package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mm_select_create_chatroom */
public class mm_select_create_chatroom extends C24542c {
    private final int height = 138;
    private final int width = 138;

    public int doCommand(int i, Object... objArr) {
        int i2 = 138;
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
                instancePaint3.setColor(-13917627);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(138.0f, 0.0f);
                instancePath.lineTo(138.0f, 138.0f);
                instancePath.lineTo(0.0f, 138.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(50.543278f, 90.04454f);
                instancePath2.lineTo(53.041294f, 91.67629f);
                Path path = instancePath2;
                path.cubicTo(57.280224f, 94.44525f, 62.87948f, 95.92082f, 69.52f, 95.92082f);
                path.cubicTo(87.80456f, 95.92082f, 102.0f, 83.83496f, 102.0f, 68.50467f);
                path.cubicTo(102.0f, 52.329258f, 87.46037f, 39.0f, 69.52f, 39.0f);
                path.cubicTo(50.67776f, 39.0f, 36.0f, 52.210297f, 36.0f, 68.50467f);
                path.cubicTo(36.0f, 73.42558f, 37.42558f, 77.22104f, 41.231678f, 82.927864f);
                instancePath2.lineTo(42.85777f, 85.36601f);
                instancePath2.lineTo(40.05615f, 93.80527f);
                instancePath2.lineTo(50.543278f, 90.04454f);
                instancePath2.close();
                instancePath2.moveTo(35.2f, 101.92082f);
                instancePath2.cubicTo(32.567047f, 102.34957f, 31.283272f, 100.9991f, 32.08f, 98.78806f);
                instancePath2.lineTo(36.24f, 86.257f);
                Path path2 = instancePath2;
                path2.cubicTo(32.320972f, 80.380844f, 30.0f, 75.34051f, 30.0f, 68.50467f);
                path2.cubicTo(30.0f, 48.779522f, 47.46108f, 33.0f, 69.52f, 33.0f);
                path2.cubicTo(90.53892f, 33.0f, 108.0f, 48.779522f, 108.0f, 68.50467f);
                path2.cubicTo(108.0f, 87.70929f, 90.53892f, 101.92082f, 69.52f, 101.92082f);
                path2.cubicTo(61.798603f, 101.92082f, 55.05305f, 100.15708f, 49.76f, 96.69955f);
                instancePath2.lineTo(35.2f, 101.92082f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
