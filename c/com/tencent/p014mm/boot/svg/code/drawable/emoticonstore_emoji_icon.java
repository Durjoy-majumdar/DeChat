package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoticonstore_emoji_icon */
public class emoticonstore_emoji_icon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(30.0f, 60.0f);
                Path path = instancePath;
                path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
                path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
                path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
                path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(30.0f, 56.4f);
                Path path2 = instancePath;
                path2.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
                path2.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
                path2.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
                path2.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
                instancePath.close();
                instancePath.moveTo(12.0f, 31.5f);
                instancePath.lineTo(48.0f, 31.5f);
                Path path3 = instancePath;
                path3.cubicTo(48.0f, 41.441124f, 39.941124f, 49.5f, 30.0f, 49.5f);
                path3.cubicTo(20.058874f, 49.5f, 12.0f, 41.441124f, 12.0f, 31.5f);
                instancePath.close();
                instancePath.moveTo(30.0f, 45.9f);
                instancePath.cubicTo(36.709824f, 45.9f, 42.347782f, 41.310818f, 43.94634f, 35.1f);
                instancePath.lineTo(16.053663f, 35.1f);
                instancePath.cubicTo(17.652218f, 41.310818f, 23.290178f, 45.9f, 30.0f, 45.9f);
                instancePath.close();
                instancePath.moveTo(19.5f, 25.5f);
                Path path4 = instancePath;
                path4.cubicTo(17.014719f, 25.5f, 15.0f, 23.485281f, 15.0f, 21.0f);
                path4.cubicTo(15.0f, 18.514719f, 17.014719f, 16.5f, 19.5f, 16.5f);
                path4.cubicTo(21.985281f, 16.5f, 24.0f, 18.514719f, 24.0f, 21.0f);
                path4.cubicTo(24.0f, 23.485281f, 21.985281f, 25.5f, 19.5f, 25.5f);
                instancePath.close();
                instancePath.moveTo(40.5f, 25.5f);
                Path path5 = instancePath;
                path5.cubicTo(38.014717f, 25.5f, 36.0f, 23.485281f, 36.0f, 21.0f);
                path5.cubicTo(36.0f, 18.514719f, 38.014717f, 16.5f, 40.5f, 16.5f);
                path5.cubicTo(42.985283f, 16.5f, 45.0f, 18.514719f, 45.0f, 21.0f);
                path5.cubicTo(45.0f, 23.485281f, 42.985283f, 25.5f, 40.5f, 25.5f);
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
