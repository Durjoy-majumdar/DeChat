package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_more */
public class bottomsheet_icon_more extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 40.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(8.0f, 65.0f);
                Path path = instancePath;
                path.cubicTo(3.5817778f, 65.0f, 0.0f, 68.58178f, 0.0f, 73.0f);
                path.cubicTo(0.0f, 77.41822f, 3.5817778f, 81.0f, 8.0f, 81.0f);
                path.cubicTo(12.418222f, 81.0f, 16.0f, 77.41822f, 16.0f, 73.0f);
                path.cubicTo(16.0f, 68.58178f, 12.418222f, 65.0f, 8.0f, 65.0f);
                instancePath.moveTo(8.0f, 32.0f);
                Path path2 = instancePath;
                path2.cubicTo(3.5817778f, 32.0f, 0.0f, 35.58178f, 0.0f, 40.0f);
                path2.cubicTo(0.0f, 44.41822f, 3.5817778f, 48.0f, 8.0f, 48.0f);
                path2.cubicTo(12.418222f, 48.0f, 16.0f, 44.41822f, 16.0f, 40.0f);
                path2.cubicTo(16.0f, 35.58178f, 12.418222f, 32.0f, 8.0f, 32.0f);
                instancePath.moveTo(16.0f, 8.0f);
                Path path3 = instancePath;
                path3.cubicTo(16.0f, 3.5817778f, 12.418222f, 0.0f, 8.0f, 0.0f);
                path3.cubicTo(3.5817778f, 0.0f, 0.0f, 3.5817778f, 0.0f, 8.0f);
                path3.cubicTo(0.0f, 12.418222f, 3.5817778f, 16.0f, 8.0f, 16.0f);
                path3.cubicTo(12.418222f, 16.0f, 16.0f, 12.418222f, 16.0f, 8.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
